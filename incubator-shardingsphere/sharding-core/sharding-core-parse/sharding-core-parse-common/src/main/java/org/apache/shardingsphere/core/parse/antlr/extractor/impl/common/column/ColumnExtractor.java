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

package org.apache.shardingsphere.core.parse.antlr.extractor.impl.common.column;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.shardingsphere.core.parse.antlr.extractor.api.OptionalSQLSegmentExtractor;
import org.apache.shardingsphere.core.parse.antlr.extractor.util.ExtractorUtils;
import org.apache.shardingsphere.core.parse.antlr.extractor.util.RuleName;
import org.apache.shardingsphere.core.parse.antlr.sql.segment.dml.column.ColumnSegment;

/**
 * Column extractor.
 *
 * @author duhongjun
 * @author zhangliang
 */
public final class ColumnExtractor implements OptionalSQLSegmentExtractor {
    
    @Override
    public Optional<ColumnSegment> extract(final ParserRuleContext ancestorNode) {
        Optional<ParserRuleContext> columnNode = ExtractorUtils.findFirstChildNode(ancestorNode, RuleName.COLUMN_NAME);
        if (columnNode.isPresent()) {
            return Optional.of(getColumnSegment(columnNode.get()));
        }
        return Optional.absent();
    }
    
    private ColumnSegment getColumnSegment(final ParserRuleContext columnNode) {
        if (1 == columnNode.getChildCount()) {
            return new ColumnSegment(columnNode.getChild(0).getText(), columnNode.getStart().getStartIndex(), columnNode.getStop().getStopIndex());
        }
        Preconditions.checkState(3 == columnNode.getChildCount());
        return new ColumnSegment(columnNode.getChild(2).getText(), columnNode.getChild(0).getText(), columnNode.getStart().getStartIndex(), columnNode.getStop().getStopIndex());
    }
}
