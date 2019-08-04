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

grammar DMLStatement;

import Symbol, Keyword, Literals, BaseRule;

insert
    : INSERT insertSpecification_ INTO? tableName partitionNames_? (insertValuesClause | setAssignmentsClause | insertSelectClause) onDuplicateKeyClause?
    ;

insertSpecification_
    : (LOW_PRIORITY | DELAYED | HIGH_PRIORITY)? IGNORE?
    ;

partitionNames_ 
    : PARTITION identifier_ (COMMA_ identifier_)*
    ;

insertValuesClause
    : columnNames? (VALUES | VALUE) assignmentValues (COMMA_ assignmentValues)*
    ;

insertSelectClause
    : columnNames? select
    ;

onDuplicateKeyClause
    : ON DUPLICATE KEY UPDATE assignment (COMMA_ assignment)*
    ;

assignment
    : columnName EQ_ assignmentValue
    ;

assignmentValues
    : LP_ assignmentValue (COMMA_ assignmentValue)* RP_
    | LP_ RP_
    ;

assignmentValue
    : expr | DEFAULT
    ;

setAssignmentsClause
    : SET assignment (COMMA_ assignment)*
    ;

update
    : updateClause setAssignmentsClause whereClause?
    ;

updateClause
    : UPDATE LOW_PRIORITY? IGNORE? tableReferences
    ;

delete
    : deleteClause whereClause?
    ;

deleteClause
    : DELETE LOW_PRIORITY? QUICK? IGNORE? (fromMulti | fromSingle) 
    ;

fromSingle
    : FROM tableName (PARTITION ignoredIdentifiers_)?
    ;

fromMulti
    : fromMultiTables FROM tableReferences | FROM fromMultiTables USING tableReferences
    ;

fromMultiTables
    : fromMultiTable (COMMA_ fromMultiTable)*
    ;

fromMultiTable
    : tableName DOT_ASTERISK_?
    ;

select 
    : unionSelect | withClause_
    ;

unionSelect
    : selectExpression (UNION (ALL | DISTINCT)? selectExpression)*
    ;

selectExpression
    : selectClause fromClause? whereClause? groupByClause? havingClause? windowClause_? orderByClause? limitClause?
    ;

selectClause
    : SELECT selectSpecification selectExprs
    ;

selectSpecification
    : (ALL | distinct | DISTINCTROW)? HIGH_PRIORITY? STRAIGHT_JOIN? SQL_SMALL_RESULT? SQL_BIG_RESULT? SQL_BUFFER_RESULT? (SQL_CACHE | SQL_NO_CACHE)? SQL_CALC_FOUND_ROWS?
    ;

selectExprs
    : (unqualifiedShorthand | selectExpr) (COMMA_ selectExpr)*
    ; 

selectExpr
    : (columnName | expr) AS? alias? | qualifiedShorthand
    ;

alias
    : identifier_ | STRING_
    ;

unqualifiedShorthand
    : ASTERISK_
    ;

qualifiedShorthand
    : identifier_ DOT_ASTERISK_
    ;

fromClause
    : FROM tableReferences
    ;

tableReferences
    : tableReference (COMMA_ tableReference)*
    ;

tableReference
    : (tableFactor joinTable)+ | tableFactor joinTable+ | tableFactor
    ;

tableFactor
    : tableName (PARTITION ignoredIdentifiers_)? (AS? alias)? indexHintList_? | subquery AS? alias | LP_ tableReferences RP_
    ;

indexHintList_
    : indexHint_(COMMA_ indexHint_)*
    ;

indexHint_
    : (USE | IGNORE | FORCE) (INDEX | KEY) (FOR (JOIN | ORDER BY | GROUP BY))* LP_ indexName (COMMA_ indexName)* RP_
    ;

joinTable
    : (INNER | CROSS)? JOIN tableFactor joinCondition?
    | STRAIGHT_JOIN tableFactor
    | STRAIGHT_JOIN tableFactor joinCondition
    | (LEFT | RIGHT) OUTER? JOIN tableFactor joinCondition
    | NATURAL (INNER | (LEFT | RIGHT) (OUTER))? JOIN tableFactor
    ;

joinCondition
    : ON expr | USING columnNames
    ;

whereClause
    : WHERE expr
    ;

groupByClause 
    : GROUP BY orderByItem (COMMA_ orderByItem)* (WITH ROLLUP)?
    ;

havingClause
    : HAVING expr
    ;

limitClause
    : LIMIT (rangeItem_ (COMMA_ rangeItem_)? | rangeItem_ OFFSET rangeItem_)
    ;

rangeItem_
    : number | question
    ;

windowClause_
    : WINDOW windowItem_ (COMMA_ windowItem_)*
    ;

windowItem_
    : ignoredIdentifier_ AS LP_ windowSpec RP_
    ;

subquery
    : LP_ unionSelect RP_
    ;

withClause_
    : WITH RECURSIVE? cteClause_ (COMMA_ cteClause_)* unionSelect
    ;

cteClause_
    : ignoredIdentifier_ columnNames? AS subquery
    ;
