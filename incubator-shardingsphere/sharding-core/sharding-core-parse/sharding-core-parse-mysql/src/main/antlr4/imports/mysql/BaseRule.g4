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

grammar BaseRule;

import Symbol, Keyword, Literals;

literals_
    : BIT_NUM_ | NUMBER_ | HEX_DIGIT_ | STRING_
    ;

identifier_
    : IDENTIFIER_ | unreservedWord_
    ;

unreservedWord_
    : ACCOUNT | ACTION | AFTER | ALGORITHM | ALWAYS | ANY | AUTO_INCREMENT 
    | AVG_ROW_LENGTH | BEGIN | BTREE | CHAIN | CHARSET | CHECKSUM | CIPHER 
    | CLIENT | COALESCE | COLUMNS | COLUMN_FORMAT| COMMENT | COMMIT | COMMITTED 
    | COMPACT | COMPRESSED | COMPRESSION | CONNECTION | CONSISTENT | CURRENT | DATA 
    | DATE | DAY | DELAY_KEY_WRITE | DISABLE | DISCARD | DISK | DUPLICATE 
    | ENABLE | ENCRYPTION | ENFORCED | END | ENGINE | ESCAPE | EVENT 
    | EXCHANGE| EXECUTE | FILE | FIRST | FIXED | FOLLOWING | GLOBAL 
    | HASH | IMPORT_ | INSERT_METHOD | INVISIBLE | KEY_BLOCK_SIZE | LAST | LESS 
    | LEVEL | MAX_ROWS | MEMORY | MIN_ROWS | MODIFY | NO | NONE 
    | OFFSET | PACK_KEYS | PARSER | PARTIAL | PARTITIONING | PASSWORD | PERSIST 
    | PERSIST_ONLY | PRECEDING | PRIVILEGES | PROCESS | PROXY | QUICK | REBUILD 
    | REDUNDANT | RELOAD | REMOVE | REORGANIZE | REPAIR | REVERSE | ROLLBACK 
    | ROLLUP | ROW_FORMAT | SAVEPOINT | SESSION | SHUTDOWN | SIMPLE | SLAVE 
    | SOUNDS | SQL_BIG_RESULT | SQL_BUFFER_RESULT | SQL_CACHE | SQL_NO_CACHE | START | STATS_AUTO_RECALC 
    | STATS_PERSISTENT | STATS_SAMPLE_PAGES | STORAGE | SUBPARTITION | SUPER | TABLES | TABLESPACE 
    | TEMPORARY | THAN | TIME | TIMESTAMP | TRANSACTION | TRUNCATE | UNBOUNDED 
    | UNKNOWN | UPGRADE | VALIDATION | VALUE | VIEW | VISIBLE | WEIGHT_STRING 
    | WITHOUT
    ;

tableName
    : (identifier_ DOT_)? identifier_
    ;

columnName
    : (identifier_ DOT_)? identifier_
    ;

columnNames
    : LP_ columnName (COMMA_ columnName)* RP_
    ;

indexName
    : identifier_
    ;

expr
    : expr AND expr
    | expr AND_ expr
    | expr OR expr
    | expr OR_ expr
    | expr XOR expr
    | LP_ expr RP_
    | (NOT | NOT_) expr
    | booleanPrimary
    ;

booleanPrimary
    : booleanPrimary IS NOT? (TRUE | FALSE | UNKNOWN |NULL)
    | booleanPrimary SAFE_EQ_ predicate
    | booleanPrimary comparisonOperator predicate
    | booleanPrimary comparisonOperator (ALL | ANY) subquery
    | predicate
    ;

comparisonOperator
    : EQ_
    | GTE_
    | GT_
    | LTE_
    | LT_
    | NEQ_
    ;

predicate
    : bitExpr NOT? IN subquery
    | bitExpr NOT? IN LP_ expr (COMMA_ expr)* RP_
    | bitExpr NOT? BETWEEN bitExpr AND predicate
    | bitExpr SOUNDS LIKE bitExpr
    | bitExpr NOT? LIKE simpleExpr (ESCAPE simpleExpr)?
    | bitExpr NOT? REGEXP bitExpr
    | bitExpr
    ;

bitExpr
    : bitExpr VERTICAL_BAR_ bitExpr
    | bitExpr AMPERSAND_ bitExpr
    | bitExpr SIGNED_LEFT_SHIFT_ bitExpr
    | bitExpr SIGNED_RIGHT_SHIFT_ bitExpr
    | bitExpr PLUS_ bitExpr
    | bitExpr MINUS_ bitExpr
    | bitExpr ASTERISK_ bitExpr
    | bitExpr SLASH_ bitExpr
    | bitExpr DIV bitExpr
    | bitExpr MOD bitExpr
    | bitExpr MOD_ bitExpr
    | bitExpr CARET_ bitExpr
    | bitExpr PLUS_ intervalExpr
    | bitExpr MINUS_ intervalExpr
    | simpleExpr
    ;

simpleExpr
    : functionCall
    | literal
    | columnName
    | simpleExpr collateClause_
    | variable
    | simpleExpr AND_ simpleExpr
    | (PLUS_ | MINUS_ | TILDE_ | NOT_ | BINARY) simpleExpr
    | ROW? LP_ expr (COMMA_ expr)* RP_
    | EXISTS? subquery
    // | (identifier_ expr)
    //| match_expr
    | caseExpr
    | intervalExpr
    ;

functionCall
    : functionName LP_ distinct? (expr (COMMA_ expr)* | ASTERISK_)? RP_ | specialFunction
    ;

functionName
    : identifier_ | IF | CURRENT_TIMESTAMP | LOCALTIME | LOCALTIMESTAMP | NOW | REPLACE | CAST | CONVERT | POSITION | CHARSET | CHAR | TRIM | WEIGHT_STRING
    ;

specialFunction
    : groupConcat | windowFunction | castFunction | convertFunction | positionFunction | substringFunction | extractFunction | charFunction | trimFunction | weightStringFunction
    ;

distinct
    : DISTINCT
    ;

caseExpr
    : caseCond | caseComp
    ;

caseComp
    : CASE simpleExpr caseWhenComp+ elseResult? END
    ;

caseWhenComp
    : WHEN simpleExpr THEN caseResult
    ;

caseCond
    : CASE whenResult+ elseResult? END
    ;

whenResult
    : WHEN expr THEN caseResult
    ;

elseResult
    : ELSE caseResult
    ;

caseResult
    : expr
    ;

intervalExpr
    : INTERVAL expr ignoredIdentifier_
    ;

variable
    : (AT_ AT_)? (GLOBAL | PERSIST | PERSIST_ONLY | SESSION)? DOT_? identifier_
    ;

literal
    : question
    | number
    | TRUE
    | FALSE
    | NULL
    | LBE_ identifier_ STRING_ RBE_
    | HEX_DIGIT_
    | string
    | identifier_ STRING_ collateClause_?
    | (DATE | TIME | TIMESTAMP) STRING_
    | characterSet_? BIT_NUM_ collateClause_?
    ;

question
    : QUESTION_
    ;

number
   : NUMBER_
   ;

string
    : STRING_
    ;

subquery
    : 'Default does not match anything'
    ;

orderByClause
    : ORDER BY orderByItem (COMMA_ orderByItem)*
    ;

orderByItem
    : (columnName | number | expr) (ASC | DESC)?
    ;

groupConcat
    : GROUP_CONCAT LP_ distinct? (expr (COMMA_ expr)* | ASTERISK_)? (orderByClause (SEPARATOR expr)?)? RP_
    ;

castFunction
    : CAST LP_ expr AS dataType RP_
    ;

convertFunction
    : CONVERT LP_ expr ',' dataType RP_
    | CONVERT LP_ expr USING ignoredIdentifier_ RP_ 
    ;

positionFunction
    : POSITION LP_ expr IN expr RP_
    ;

substringFunction
    :  (SUBSTRING | SUBSTR) LP_ expr FROM NUMBER_ (FOR NUMBER_)? RP_
    ;

extractFunction
    : EXTRACT LP_ identifier_ FROM expr RP_
    ;

charFunction
    : CHAR LP_ expr (COMMA_ expr)* (USING ignoredIdentifier_)? RP_
    ;

trimFunction
    : TRIM LP_ (LEADING | BOTH | TRAILING) STRING_ FROM STRING_ RP_
    ;

weightStringFunction
    : WEIGHT_STRING LP_ expr (AS dataType)? levelClause? RP_
    ;

levelClause
    : LEVEL (levelInWeightListElements | (NUMBER_ MINUS_ NUMBER_))
    ;

levelInWeightListElements
    : levelInWeightListElement (COMMA_ levelInWeightListElement)*
    ;

levelInWeightListElement
    : NUMBER_ (ASC | DESC)? REVERSE?
    ;

windowFunction
    : identifier_ LP_ expr (COMMA_ expr)* RP_ overClause
    ;

overClause
    : OVER LP_ windowSpec RP_ | OVER identifier_
    ;

windowSpec
    : identifier_? windowPartitionClause? orderByClause? frameClause?
    ;

windowPartitionClause
    : PARTITION BY expr (COMMA_ expr)*
    ;

frameClause
    : frameUnits frameExtent
    ;

frameUnits
    : ROWS | RANGE
    ;

frameExtent
    : frameStart | frameBetween
    ;

frameStart
    : CURRENT ROW
    | UNBOUNDED PRECEDING
    | UNBOUNDED FOLLOWING
    | expr PRECEDING
    | expr FOLLOWING
    ;

frameBetween
    : BETWEEN frameStart AND frameEnd
    ;

frameEnd
    : frameStart
    ;

dataType
    : dataTypeName_ dataTypeLength? characterSet_? collateClause_? UNSIGNED? ZEROFILL? | dataTypeName_ LP_ STRING_ (COMMA_ STRING_)* RP_ characterSet_? collateClause_?
    ;

dataTypeName_
    : identifier_ identifier_?
    ;

dataTypeLength
    : LP_ NUMBER_ (COMMA_ NUMBER_)? RP_
    ;

characterSet_
    : (CHARACTER | CHAR) SET EQ_? ignoredIdentifier_ | CHARSET EQ_? ignoredIdentifier_
    ;

collateClause_
    : COLLATE EQ_? (STRING_ | ignoredIdentifier_)
    ;

ignoredIdentifier_
    : identifier_ (DOT_ identifier_)?
    ;

ignoredIdentifiers_
    : ignoredIdentifier_ (COMMA_ ignoredIdentifier_)*
    ;
