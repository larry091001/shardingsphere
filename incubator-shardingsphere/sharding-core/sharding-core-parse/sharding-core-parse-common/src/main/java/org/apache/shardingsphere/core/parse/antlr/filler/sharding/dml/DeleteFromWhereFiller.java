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

package org.apache.shardingsphere.core.parse.antlr.filler.sharding.dml;

import org.apache.shardingsphere.core.parse.antlr.sql.segment.dml.DeleteFromWhereSegment;
import org.apache.shardingsphere.core.parse.antlr.sql.segment.dml.FromWhereSegment;
import org.apache.shardingsphere.core.parse.antlr.sql.statement.SQLStatement;
import org.apache.shardingsphere.core.parse.antlr.sql.statement.dml.DMLStatement;

import java.util.Map.Entry;

/**
 * Delete from where filler.
 *
 * @author duhongjun
 */
public class DeleteFromWhereFiller extends FromWhereFiller {
    
    @Override
    public void fill(final FromWhereSegment sqlSegment, final SQLStatement sqlStatement) {
        super.fill(sqlSegment, sqlStatement);
        DeleteFromWhereSegment deleteFromWhereSegment = (DeleteFromWhereSegment) sqlSegment;
        DMLStatement dmlStatement = (DMLStatement) sqlStatement;
        dmlStatement.setDeleteStatement(true);
        for (Entry<String, String> each : sqlSegment.getTableAliases().entrySet()) {
            dmlStatement.getUpdateTableAlias().put(each.getKey(), each.getValue());
        }
        dmlStatement.setWhereStartIndex(deleteFromWhereSegment.getWhereStartIndex());
        dmlStatement.setWhereStopIndex(deleteFromWhereSegment.getWhereStopIndex());
        dmlStatement.setWhereParameterStartIndex(deleteFromWhereSegment.getWhereParameterStartIndex());
        dmlStatement.setWhereParameterEndIndex(deleteFromWhereSegment.getWhereParameterEndIndex());
    }
}
