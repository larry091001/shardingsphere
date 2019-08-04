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

package org.apache.shardingsphere.core.parse.antlr.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.shardingsphere.core.parse.old.lexer.token.Symbol;

/**
 * Logical operator.
 *
 * @author zhangliang
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class LogicalOperator {
    
    private static final String AND = "AND";
    
    private static final String OR = "OR";
    
    /**
     * Judge is logical operator or not.
     *
     * @param token token
     * @return is logical operator or not
     */
    public static boolean isLogicalOperator(final String token) {
        return isAndOperator(token) || isOrOperator(token);
    }
    
    private static boolean isAndOperator(final String token) {
        return AND.equalsIgnoreCase(token) || Symbol.DOUBLE_AMP.getLiterals().equalsIgnoreCase(token);
    }
    
    /**
     * Judge is or operator or not.
     *
     * @param token token
     * @return OR operator or not
     */
    public static boolean isOrOperator(final String token) {
        return OR.equalsIgnoreCase(token) || Symbol.DOUBLE_BAR.getLiterals().equalsIgnoreCase(token);
    }
}
