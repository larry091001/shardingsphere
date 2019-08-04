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

package org.apache.shardingsphere.core.parse.antlr.extractor.impl.dml.select.item;

import com.google.common.base.Optional;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.shardingsphere.core.constant.AggregationType;
import org.apache.shardingsphere.core.parse.antlr.extractor.api.OptionalSQLSegmentExtractor;
import org.apache.shardingsphere.core.parse.antlr.extractor.util.ExtractorUtils;
import org.apache.shardingsphere.core.parse.antlr.extractor.util.RuleName;
import org.apache.shardingsphere.core.parse.antlr.sql.AliasAvailable;
import org.apache.shardingsphere.core.parse.antlr.sql.segment.dml.item.AggregationDistinctSelectItemSegment;
import org.apache.shardingsphere.core.parse.antlr.sql.segment.dml.item.AggregationSelectItemSegment;
import org.apache.shardingsphere.core.parse.antlr.sql.segment.dml.item.ExpressionSelectItemSegment;
import org.apache.shardingsphere.core.parse.antlr.sql.segment.dml.item.SelectItemSegment;

/**
 * Function select item segment extractor.
 *
 * @author zhangliang
 */
public final class FunctionSelectItemSegmentExtractor implements OptionalSQLSegmentExtractor {
    
    @Override
    public Optional<SelectItemSegment> extract(final ParserRuleContext expressionNode) {
        Optional<ParserRuleContext> functionNode = ExtractorUtils.findFirstChildNode(expressionNode, RuleName.FUNCTION_CALL);
        if (!functionNode.isPresent()) {
            return Optional.absent();
        }
        return Optional.of(extractFunctionSelectItemSegment(expressionNode, functionNode.get()));
    }
    
    private SelectItemSegment extractFunctionSelectItemSegment(final ParserRuleContext expressionNode, final ParserRuleContext functionNode) {
        String functionName = functionNode.getChild(0).getText();
        Optional<AggregationType> aggregationType = findAggregationType(functionName);
        AliasAvailable result = aggregationType.isPresent() ? extractAggregationSelectItemSegment(aggregationType.get(), functionNode)
                : new ExpressionSelectItemSegment(functionNode.getText(), functionNode.getStart().getStartIndex(), functionNode.getStop().getStopIndex());
        Optional<ParserRuleContext> aliasNode = ExtractorUtils.findFirstChildNode(expressionNode, RuleName.ALIAS);
        if (aliasNode.isPresent()) {
            result.setAlias(aliasNode.get().getText());
        }
        return (SelectItemSegment) result;
    }
    
    private Optional<AggregationType> findAggregationType(final String functionName) {
        try {
            return Optional.of(AggregationType.valueOf(functionName.toUpperCase()));
        } catch (final IllegalArgumentException ignore) {
            return Optional.absent();
        }
    }
    
    private AggregationSelectItemSegment extractAggregationSelectItemSegment(final AggregationType type, final ParserRuleContext functionNode) {
        int innerExpressionStartIndex = ((TerminalNode) functionNode.getChild(1)).getSymbol().getStartIndex();
        return ExtractorUtils.findFirstChildNode(functionNode, RuleName.DISTINCT).isPresent()
                ? new AggregationDistinctSelectItemSegment(
                type, innerExpressionStartIndex, functionNode.getStart().getStartIndex(), functionNode.getStop().getStopIndex(), getDistinctExpression(functionNode))
                : new AggregationSelectItemSegment(type, innerExpressionStartIndex, functionNode.getStart().getStartIndex(), functionNode.getStop().getStopIndex());
    }
    
    private String getDistinctExpression(final ParserRuleContext functionNode) {
        StringBuilder result = new StringBuilder();
        for (int i = 3; i < functionNode.getChildCount() - 1; i++) {
            result.append(functionNode.getChild(i).getText());
        }
        return result.toString();
    }
}
