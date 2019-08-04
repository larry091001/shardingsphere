/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.core.parse.antlr.filler.encrypt.dml;

import com.google.common.base.Optional;
import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.core.metadata.table.ShardingTableMetaData;
import org.apache.shardingsphere.core.metadata.table.TableMetaData;
import org.apache.shardingsphere.core.parse.antlr.filler.api.SQLSegmentFiller;
import org.apache.shardingsphere.core.parse.antlr.sql.segment.dml.condition.AndConditionSegment;
import org.apache.shardingsphere.core.parse.antlr.sql.segment.dml.condition.ConditionSegment;
import org.apache.shardingsphere.core.parse.antlr.sql.segment.dml.condition.OrConditionSegment;
import org.apache.shardingsphere.core.parse.antlr.sql.statement.SQLStatement;
import org.apache.shardingsphere.core.parse.antlr.sql.statement.dml.SelectStatement;
import org.apache.shardingsphere.core.parse.antlr.sql.token.EncryptColumnToken;
import org.apache.shardingsphere.core.parse.old.parser.context.condition.AndCondition;
import org.apache.shardingsphere.core.parse.old.parser.context.condition.Column;
import org.apache.shardingsphere.core.parse.old.parser.context.condition.OrCondition;
import org.apache.shardingsphere.core.parse.old.parser.context.table.Table;
import org.apache.shardingsphere.core.parse.old.parser.context.table.Tables;
import org.apache.shardingsphere.core.rule.EncryptRule;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Encrypt or condition filler.
 *
 * @author duhongjun
 */
@RequiredArgsConstructor
public class EncryptOrConditionFiller implements SQLSegmentFiller<OrConditionSegment> {
    
    private final EncryptRule encryptRule;
    
    private final ShardingTableMetaData shardingTableMetaData;
    
    @Override
    public void fill(final OrConditionSegment sqlSegment, final SQLStatement sqlStatement) {
        Map<String, String> columnNameToTable = new HashMap<>();
        Map<String, Integer> columnNameCount = new HashMap<>();
        fillColumnTableMap(sqlStatement, columnNameToTable, columnNameCount);
        filterCondition(sqlStatement, sqlSegment);
    }
    
    private void fillColumnTableMap(final SQLStatement sqlStatement, final Map<String, String> columnNameToTable, final Map<String, Integer> columnNameCount) {
        if (null == shardingTableMetaData) {
            return;
        }
        for (String each : sqlStatement.getTables().getTableNames()) {
            Collection<String> tableColumns = shardingTableMetaData.getAllColumnNames(each);
            for (String columnName : tableColumns) {
                columnNameToTable.put(columnName, each);
                Integer count = columnNameCount.get(columnName);
                if (null == count) {
                    count = 1;
                } else {
                    count++;
                }
                columnNameCount.put(columnName, count);
            }
        }
    }
    
    private OrCondition filterCondition(final SQLStatement sqlStatement, final OrConditionSegment orCondition) {
        OrCondition result = new OrCondition();
        Set<Integer> filledConditionStopIndexes = new HashSet<>();
        for (AndConditionSegment each : orCondition.getAndConditions()) {
            for (ConditionSegment condition : each.getConditions()) {
                if (null == condition.getColumn()) {
                    continue;
                }
                if (filledConditionStopIndexes.contains(condition.getStopIndex())) {
                    continue;
                } else {
                    filledConditionStopIndexes.add(condition.getStopIndex());
                }
                Column column = new Column(condition.getColumn().getName(), getTableName(sqlStatement, condition));
                fillEncryptCondition(column, condition, sqlStatement);
            }
        }
        return result;
    }
    
    private void fillEncryptCondition(final Column column, final ConditionSegment condition, final SQLStatement sqlStatement) {
        if (!encryptRule.getEncryptorEngine().getShardingEncryptor(column.getTableName(), column.getName()).isPresent()) {
            return;
        }
        AndCondition andCondition;
        if (0 == sqlStatement.getEncryptConditions().getOrCondition().getAndConditions().size()) {
            andCondition = new AndCondition();
            sqlStatement.getEncryptConditions().getOrCondition().getAndConditions().add(andCondition);
        } else {
            andCondition = sqlStatement.getEncryptConditions().getOrCondition().getAndConditions().get(0);
        }
        andCondition.getConditions().add(condition.getExpression().buildCondition(column, sqlStatement.getLogicSQL()));
        sqlStatement.getSQLTokens().add(new EncryptColumnToken(condition.getColumn().getStartIndex(), condition.getStopIndex(), column, true));
    }
    
    // TODO hongjun: find table from parent select statement, should find table in subquery level only
    private String getTableName(final SQLStatement sqlStatement, final ConditionSegment conditionSegment) {
        if (!(sqlStatement instanceof SelectStatement)) {
            return getTableName(sqlStatement.getTables(), conditionSegment);
        }
        SelectStatement currentSelectStatement = (SelectStatement) sqlStatement;
        while (null != currentSelectStatement.getParentStatement()) {
            currentSelectStatement = currentSelectStatement.getParentStatement();
            String tableName = getTableName(currentSelectStatement.getTables(), conditionSegment);
            if (!"".equals(tableName)) {
                return tableName;
            }
        }
        return getTableName(currentSelectStatement.getTables(), conditionSegment);
    }
    
    private String getTableName(final Tables tables, final ConditionSegment conditionSegment) {
        if (conditionSegment.getColumn().getOwner().isPresent()) {
            Optional<Table> table = tables.find(conditionSegment.getColumn().getOwner().get());
            return table.isPresent() ? table.get().getName() : "";
        } else {
            return getTableNameFromMetaData(tables, conditionSegment.getColumn().getName());
        }
    }
    
    private String getTableNameFromMetaData(final Tables tables, final String columnName) {
        for (String each : tables.getTableNames()) {
            TableMetaData tableMetaData = shardingTableMetaData.get(each);
            if (null != tableMetaData) {
                if (tableMetaData.getColumns().containsKey(columnName)) {
                    return each;
                }
            }
        }
        return "";
    }
}
