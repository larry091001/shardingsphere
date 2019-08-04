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

package org.apache.shardingsphere.core.parse.antlr.sql.segment.dml.order.item;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.core.constant.OrderDirection;
import org.apache.shardingsphere.core.parse.antlr.sql.segment.SQLSegment;

/**
 * Order by item segment.
 * 
 * @author duhongjun
 */
@RequiredArgsConstructor
@Getter
public abstract class OrderByItemSegment implements SQLSegment {
    
    private final OrderDirection orderDirection;
    
    private final OrderDirection nullOrderDirection;
}
