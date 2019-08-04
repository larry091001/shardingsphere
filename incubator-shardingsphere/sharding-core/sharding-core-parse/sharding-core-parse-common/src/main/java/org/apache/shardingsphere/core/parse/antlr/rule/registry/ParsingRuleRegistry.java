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

package org.apache.shardingsphere.core.parse.antlr.rule.registry;

import com.google.common.base.Optional;
import org.apache.shardingsphere.core.constant.DatabaseType;
import org.apache.shardingsphere.core.parse.antlr.filler.api.SQLSegmentFiller;
import org.apache.shardingsphere.core.parse.antlr.rule.jaxb.loader.RuleDefinitionFileConstant;
import org.apache.shardingsphere.core.parse.antlr.rule.jaxb.loader.extractor.ExtractorRuleDefinitionEntityLoader;
import org.apache.shardingsphere.core.parse.antlr.rule.jaxb.loader.filler.FillerRuleDefinitionEntityLoader;
import org.apache.shardingsphere.core.parse.antlr.rule.jaxb.loader.statement.SQLStatementRuleDefinitionEntityLoader;
import org.apache.shardingsphere.core.parse.antlr.rule.registry.statement.SQLStatementRule;
import org.apache.shardingsphere.core.parse.antlr.sql.segment.SQLSegment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Parsing rule registry.
 *
 * @author zhangliang
 * @author duhongjun
 */
public abstract class ParsingRuleRegistry {
    
    private final SQLStatementRuleDefinitionEntityLoader statementRuleDefinitionLoader = new SQLStatementRuleDefinitionEntityLoader();
    
    private final ExtractorRuleDefinitionEntityLoader extractorRuleDefinitionLoader = new ExtractorRuleDefinitionEntityLoader();
    
    private final FillerRuleDefinitionEntityLoader fillerRuleDefinitionLoader = new FillerRuleDefinitionEntityLoader();
    
    private final ParserRuleDefinition commonRuleDefinition = new ParserRuleDefinition();
    
    private final Map<DatabaseType, ParserRuleDefinition> parserRuleDefinitions = new HashMap<>(4, 1);
    
    protected final void init() {
        initCommonParserRuleDefinition();
        initParserRuleDefinition();
    }
    
    private void initCommonParserRuleDefinition() {
        Collection<String> fillerFilePaths = Collections.singletonList(RuleDefinitionFileConstant.getCommonFillerRuleDefinitionFileName());
        Collection<String> extractorFilePaths = Collections.singletonList(RuleDefinitionFileConstant.getCommonExtractorRuleDefinitionFileName());
        initParserRuleDefinition(commonRuleDefinition, fillerFilePaths, extractorFilePaths, new ArrayList<String>());
    }
    
    private void initParserRuleDefinition() {
        for (DatabaseType each : DatabaseType.values()) {
            if (DatabaseType.H2 != each) {
                if (!needParser(each)) {
                    continue;
                }
                Collection<String> fillerFilePaths = new LinkedList<>();
                Collection<String> extractorFilePaths = new LinkedList<>();
                Collection<String> sqlStateRuleFilePaths = new LinkedList<>();
                fillRuleFilePaths(each, fillerFilePaths, extractorFilePaths, sqlStateRuleFilePaths);
                ParserRuleDefinition shardingRuleDefinition = new ParserRuleDefinition();
                initParserRuleDefinitionFromCommon(shardingRuleDefinition, fillerFilePaths, extractorFilePaths, sqlStateRuleFilePaths);
                parserRuleDefinitions.put(each, shardingRuleDefinition);
            }
        }
    }
    
    protected boolean needParser(final DatabaseType databaseType) { 
        return true;
    }
    
    protected abstract void fillRuleFilePaths(DatabaseType databaseType, Collection<String> fillerFilePaths, Collection<String> extractorFilePaths, Collection<String> sqlStateRuleFilePaths);
    
    private void initParserRuleDefinitionFromCommon(final ParserRuleDefinition parserRuleDefinition, 
                                                    final Collection<String> fillerFilePaths, final Collection<String> extractorFilePaths, final Collection<String> sqlStateRuleFilePaths) {
        parserRuleDefinition.getExtractorRuleDefinition().getRules().putAll(commonRuleDefinition.getExtractorRuleDefinition().getRules());
        parserRuleDefinition.getFillerRuleDefinition().getRules().putAll(commonRuleDefinition.getFillerRuleDefinition().getRules());
        initParserRuleDefinition(parserRuleDefinition, fillerFilePaths, extractorFilePaths, sqlStateRuleFilePaths);
    }
    
    private void initParserRuleDefinition(final ParserRuleDefinition parserRuleDefinition, 
                                          final Collection<String> fillerFilePaths, final Collection<String> extractorFilePaths, final Collection<String> sqlStateRuleFilePaths) {
        for (String each : fillerFilePaths) {
            parserRuleDefinition.getFillerRuleDefinition().init(fillerRuleDefinitionLoader.load(each));
        }
        for (String each : extractorFilePaths) {
            parserRuleDefinition.getExtractorRuleDefinition().init(extractorRuleDefinitionLoader.load(each));
        }
        for (String each : sqlStateRuleFilePaths) {
            parserRuleDefinition.getSqlStatementRuleDefinition().init(statementRuleDefinitionLoader.load(each), parserRuleDefinition.getExtractorRuleDefinition());
        }
    }
    
    /**
     * Find SQL statement rule.
     *
     * @param databaseType     database type
     * @param contextClassName context class name
     * @return SQL statement rule
     */
    public Optional<SQLStatementRule> findSQLStatementRule(final DatabaseType databaseType, final String contextClassName) {
        return Optional.fromNullable(parserRuleDefinitions.get(DatabaseType.H2 == databaseType ? DatabaseType.MySQL : databaseType).getSqlStatementRuleDefinition().getRules().get(contextClassName));
    }
    
    /**
     * Find SQL segment rule.
     *
     * @param databaseType database type
     * @param sqlSegmentClass SQL segment class
     * @return SQL segment rule
     */
    public Optional<SQLSegmentFiller> findSQLSegmentFiller(final DatabaseType databaseType, final Class<? extends SQLSegment> sqlSegmentClass) {
        return Optional.fromNullable(parserRuleDefinitions.get(DatabaseType.H2 == databaseType ? DatabaseType.MySQL : databaseType).getFillerRuleDefinition().getRules().get(sqlSegmentClass));
    }
}
