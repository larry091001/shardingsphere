// Generated from org\apache\shardingsphere\core\parse\antlr\autogen\MySQLStatement.g4 by ANTLR 4.7.1
package org.apache.shardingsphere.core.parse.antlr.autogen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySQLStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ALL=2, AND=3, ANY=4, ASC=5, BETWEEN=6, BINARY=7, BY=8, DATE=9, DESC=10, 
		DISTINCT=11, ESCAPE=12, EXISTS=13, FALSE=14, FROM=15, GROUP=16, HAVING=17, 
		IN=18, IS=19, KEY=20, LIKE=21, LIMIT=22, MOD=23, DIV=24, NOT=25, NULL=26, 
		OFFSET=27, OR=28, ORDER=29, PARTITION=30, PRIMARY=31, REGEXP=32, RLIKE=33, 
		ROLLUP=34, ROW=35, SET=36, SOUNDS=37, TIME=38, TIMESTAMP=39, TRUE=40, 
		UNION=41, UNKNOWN=42, WHERE=43, WITH=44, XOR=45, ADD=46, ALTER=47, ALWAYS=48, 
		AS=49, CASCADE=50, CHECK=51, COLUMN=52, COMMIT=53, COMMITTED=54, CONSTRAINT=55, 
		CREATE=56, CURRENT=57, DAY=58, DEFAULT=59, DELETE=60, DISABLE=61, DROP=62, 
		ENABLE=63, FOR=64, FOREIGN=65, FUNCTION=66, GENERATED=67, GRANT=68, INDEX=69, 
		LEVEL=70, NO=71, ON=72, OPTION=73, PASSWORD=74, PRIVILEGES=75, READ=76, 
		REFERENCES=77, REVOKE=78, ROLE=79, ROLLBACK=80, ROWS=81, START=82, TABLE=83, 
		TO=84, TRANSACTION=85, TRUNCATE=86, UNIQUE=87, USER=88, ACCOUNT=89, ACTION=90, 
		AFTER=91, ALGORITHM=92, ANALYZE=93, AUDIT_ADMIN=94, AUTO_INCREMENT=95, 
		AUTOCOMMIT=96, AVG_ROW_LENGTH=97, BEGIN=98, BINLOG_ADMIN=99, BOTH=100, 
		BTREE=101, CASE=102, CAST=103, CHAIN=104, CHANGE=105, CHAR=106, CHARACTER=107, 
		CHARSET=108, CHECKSUM=109, CIPHER=110, CLIENT=111, COALESCE=112, COLLATE=113, 
		COLUMNS=114, COLUMN_FORMAT=115, COMMENT=116, COMPACT=117, COMPRESSED=118, 
		COMPRESSION=119, CONNECTION=120, CONNECTION_ADMIN=121, CONSISTENT=122, 
		CONVERT=123, COPY=124, CROSS=125, CURRENT_TIMESTAMP=126, DATA=127, DATABASES=128, 
		DELAYED=129, DELAY_KEY_WRITE=130, DIRECTORY=131, DISCARD=132, DISK=133, 
		DISTINCTROW=134, DOUBLE=135, DUPLICATE=136, DYNAMIC=137, ELSE=138, ENCRYPTION=139, 
		ENCRYPTION_KEY_ADMIN=140, END=141, ENGINE=142, EVENT=143, EXCEPT=144, 
		EXCHANGE=145, EXCLUSIVE=146, EXECUTE=147, EXTRACT=148, FILE=149, FIREWALL_ADMIN=150, 
		FIREWALL_USER=151, FIRST=152, FIXED=153, FOLLOWING=154, FORCE=155, FULL=156, 
		FULLTEXT=157, GLOBAL=158, GROUP_CONCAT=159, GROUP_REPLICATION_ADMIN=160, 
		HASH=161, HIGH_PRIORITY=162, IDENTIFIED=163, IF=164, IGNORE=165, IMPORT_=166, 
		INNER=167, INPLACE=168, INSERT=169, INSERT_METHOD=170, INTERVAL=171, INTO=172, 
		JOIN=173, KEYS=174, KEY_BLOCK_SIZE=175, LAST=176, LEADING=177, LEFT=178, 
		LESS=179, LINEAR=180, LOCALTIME=181, LOCALTIMESTAMP=182, LOCK=183, LOW_PRIORITY=184, 
		MATCH=185, MAXVALUE=186, MAX_ROWS=187, MEMORY=188, MIN_ROWS=189, MODIFY=190, 
		NATURAL=191, NONE=192, NOW=193, OFFLINE=194, ONLINE=195, OPTIMIZE=196, 
		OUTER=197, OVER=198, PACK_KEYS=199, PARSER=200, PARTIAL=201, PARTITIONING=202, 
		PERSIST=203, PERSIST_ONLY=204, POSITION=205, PRECEDING=206, PRECISION=207, 
		PROCEDURE=208, PROCESS=209, PROXY=210, QUICK=211, RANGE=212, REBUILD=213, 
		RECURSIVE=214, REDUNDANT=215, RELEASE=216, RELOAD=217, REMOVE=218, RENAME=219, 
		REORGANIZE=220, REPAIR=221, REPLACE=222, REPLICATION=223, REPLICATION_SLAVE_ADMIN=224, 
		REQUIRE=225, RESTRICT=226, REVERSE=227, RIGHT=228, ROLE_ADMIN=229, ROUTINE=230, 
		ROW_FORMAT=231, SAVEPOINT=232, SELECT=233, SEPARATOR=234, SESSION=235, 
		SET_USER_ID=236, SHARED=237, SHOW=238, SHUTDOWN=239, SIMPLE=240, SLAVE=241, 
		SPATIAL=242, SQLDML=243, SQLDQL=244, SQL_BIG_RESULT=245, SQL_BUFFER_RESULT=246, 
		SQL_CACHE=247, SQL_CALC_FOUND_ROWS=248, SQL_NO_CACHE=249, SQL_SMALL_RESULT=250, 
		SSL=251, STATS_AUTO_RECALC=252, STATS_PERSISTENT=253, STATS_SAMPLE_PAGES=254, 
		STORAGE=255, STORED=256, STRAIGHT_JOIN=257, SUBPARTITION=258, SUPER=259, 
		SUBSTR=260, SUBSTRING=261, SYSTEM_VARIABLES_ADMIN=262, TABLES=263, TABLESPACE=264, 
		TEMPORARY=265, THAN=266, THEN=267, TRAILING=268, TRIGGER=269, TRIM=270, 
		UNBOUNDED=271, UNLOCK=272, UNSIGNED=273, UPDATE=274, UPGRADE=275, USAGE=276, 
		USE=277, USING=278, VALIDATION=279, VALUE=280, VALUES=281, VERSION_TOKEN_ADMIN=282, 
		VIEW=283, VIRTUAL=284, WEIGHT_STRING=285, WHEN=286, WINDOW=287, WITHOUT=288, 
		WRITE=289, ZEROFILL=290, VISIBLE=291, INVISIBLE=292, INSTANT=293, ENFORCED=294, 
		FOR_GENERATOR=295, AND_=296, OR_=297, NOT_=298, TILDE_=299, VERTICAL_BAR_=300, 
		AMPERSAND_=301, SIGNED_LEFT_SHIFT_=302, SIGNED_RIGHT_SHIFT_=303, CARET_=304, 
		MOD_=305, COLON_=306, PLUS_=307, MINUS_=308, ASTERISK_=309, SLASH_=310, 
		BACKSLASH_=311, DOT_=312, DOT_ASTERISK_=313, SAFE_EQ_=314, DEQ_=315, EQ_=316, 
		NEQ_=317, GT_=318, GTE_=319, LT_=320, LTE_=321, POUND_=322, LP_=323, RP_=324, 
		LBE_=325, RBE_=326, LBT_=327, RBT_=328, COMMA_=329, DQ_=330, SQ_=331, 
		BQ_=332, QUESTION_=333, AT_=334, SEMI_=335, BLOCK_COMMENT=336, INLINE_COMMENT=337, 
		IDENTIFIER_=338, STRING_=339, NUMBER_=340, HEX_DIGIT_=341, BIT_NUM_=342;
	public static final int
		RULE_execute = 0, RULE_insert = 1, RULE_insertSpecification_ = 2, RULE_partitionNames_ = 3, 
		RULE_insertValuesClause = 4, RULE_insertSelectClause = 5, RULE_onDuplicateKeyClause = 6, 
		RULE_assignment = 7, RULE_assignmentValues = 8, RULE_assignmentValue = 9, 
		RULE_setAssignmentsClause = 10, RULE_update = 11, RULE_updateClause = 12, 
		RULE_delete = 13, RULE_deleteClause = 14, RULE_fromSingle = 15, RULE_fromMulti = 16, 
		RULE_fromMultiTables = 17, RULE_fromMultiTable = 18, RULE_select = 19, 
		RULE_unionSelect = 20, RULE_selectExpression = 21, RULE_selectClause = 22, 
		RULE_selectSpecification = 23, RULE_selectExprs = 24, RULE_selectExpr = 25, 
		RULE_alias = 26, RULE_unqualifiedShorthand = 27, RULE_qualifiedShorthand = 28, 
		RULE_fromClause = 29, RULE_tableReferences = 30, RULE_tableReference = 31, 
		RULE_tableFactor = 32, RULE_indexHintList_ = 33, RULE_indexHint_ = 34, 
		RULE_joinTable = 35, RULE_joinCondition = 36, RULE_whereClause = 37, RULE_groupByClause = 38, 
		RULE_havingClause = 39, RULE_limitClause = 40, RULE_rangeItem_ = 41, RULE_windowClause_ = 42, 
		RULE_windowItem_ = 43, RULE_subquery = 44, RULE_withClause_ = 45, RULE_cteClause_ = 46, 
		RULE_literals_ = 47, RULE_identifier_ = 48, RULE_unreservedWord_ = 49, 
		RULE_tableName = 50, RULE_columnName = 51, RULE_columnNames = 52, RULE_indexName = 53, 
		RULE_expr = 54, RULE_booleanPrimary = 55, RULE_comparisonOperator = 56, 
		RULE_predicate = 57, RULE_bitExpr = 58, RULE_simpleExpr = 59, RULE_functionCall = 60, 
		RULE_functionName = 61, RULE_specialFunction = 62, RULE_distinct = 63, 
		RULE_caseExpr = 64, RULE_caseComp = 65, RULE_caseWhenComp = 66, RULE_caseCond = 67, 
		RULE_whenResult = 68, RULE_elseResult = 69, RULE_caseResult = 70, RULE_intervalExpr = 71, 
		RULE_variable = 72, RULE_literal = 73, RULE_question = 74, RULE_number = 75, 
		RULE_string = 76, RULE_orderByClause = 77, RULE_orderByItem = 78, RULE_groupConcat = 79, 
		RULE_castFunction = 80, RULE_convertFunction = 81, RULE_positionFunction = 82, 
		RULE_substringFunction = 83, RULE_extractFunction = 84, RULE_charFunction = 85, 
		RULE_trimFunction = 86, RULE_weightStringFunction = 87, RULE_levelClause = 88, 
		RULE_levelInWeightListElements = 89, RULE_levelInWeightListElement = 90, 
		RULE_windowFunction = 91, RULE_overClause = 92, RULE_windowSpec = 93, 
		RULE_windowPartitionClause = 94, RULE_frameClause = 95, RULE_frameUnits = 96, 
		RULE_frameExtent = 97, RULE_frameStart = 98, RULE_frameBetween = 99, RULE_frameEnd = 100, 
		RULE_dataType = 101, RULE_dataTypeName_ = 102, RULE_dataTypeLength = 103, 
		RULE_characterSet_ = 104, RULE_collateClause_ = 105, RULE_ignoredIdentifier_ = 106, 
		RULE_ignoredIdentifiers_ = 107, RULE_createTable = 108, RULE_createDefinitions_ = 109, 
		RULE_createDefinition_ = 110, RULE_columnDefinition = 111, RULE_inlineDataType_ = 112, 
		RULE_generatedDataType_ = 113, RULE_commonDataTypeOption_ = 114, RULE_referenceDefinition_ = 115, 
		RULE_referenceOption_ = 116, RULE_indexDefinition_ = 117, RULE_indexType_ = 118, 
		RULE_keyParts_ = 119, RULE_keyPart_ = 120, RULE_indexOption_ = 121, RULE_constraintDefinition_ = 122, 
		RULE_primaryKeyOption_ = 123, RULE_primaryKey = 124, RULE_uniqueOption_ = 125, 
		RULE_foreignKeyOption_ = 126, RULE_checkConstraintDefinition_ = 127, RULE_createLike_ = 128, 
		RULE_alterTable = 129, RULE_alterSpecifications_ = 130, RULE_alterSpecification_ = 131, 
		RULE_tableOptions_ = 132, RULE_tableOption_ = 133, RULE_addColumnSpecification = 134, 
		RULE_firstOrAfterColumn = 135, RULE_addIndexSpecification = 136, RULE_addConstraintSpecification = 137, 
		RULE_changeColumnSpecification = 138, RULE_dropColumnSpecification = 139, 
		RULE_dropIndexSpecification = 140, RULE_dropPrimaryKeySpecification = 141, 
		RULE_modifyColumnSpecification = 142, RULE_renameColumnSpecification = 143, 
		RULE_renameIndexSpecification = 144, RULE_renameTableSpecification = 145, 
		RULE_partitionDefinitions_ = 146, RULE_partitionDefinition_ = 147, RULE_partitionLessThanValue_ = 148, 
		RULE_partitionValueList_ = 149, RULE_partitionDefinitionOption_ = 150, 
		RULE_subpartitionDefinition_ = 151, RULE_dropTable = 152, RULE_truncateTable = 153, 
		RULE_createIndex = 154, RULE_dropIndex = 155, RULE_setTransaction = 156, 
		RULE_setAutoCommit = 157, RULE_autoCommitValue = 158, RULE_beginTransaction = 159, 
		RULE_commit = 160, RULE_rollback = 161, RULE_savepoint = 162, RULE_grant = 163, 
		RULE_revoke = 164, RULE_proxyClause_ = 165, RULE_privilegeClause_ = 166, 
		RULE_roleClause_ = 167, RULE_allClause_ = 168, RULE_privileges_ = 169, 
		RULE_privilegeType_ = 170, RULE_onObjectClause_ = 171, RULE_objectType_ = 172, 
		RULE_privilegeLevel_ = 173, RULE_createUser = 174, RULE_dropUser = 175, 
		RULE_alterUser = 176, RULE_renameUser = 177, RULE_createRole = 178, RULE_dropRole = 179, 
		RULE_setRole = 180, RULE_setPassword = 181;
	public static final String[] ruleNames = {
		"execute", "insert", "insertSpecification_", "partitionNames_", "insertValuesClause", 
		"insertSelectClause", "onDuplicateKeyClause", "assignment", "assignmentValues", 
		"assignmentValue", "setAssignmentsClause", "update", "updateClause", "delete", 
		"deleteClause", "fromSingle", "fromMulti", "fromMultiTables", "fromMultiTable", 
		"select", "unionSelect", "selectExpression", "selectClause", "selectSpecification", 
		"selectExprs", "selectExpr", "alias", "unqualifiedShorthand", "qualifiedShorthand", 
		"fromClause", "tableReferences", "tableReference", "tableFactor", "indexHintList_", 
		"indexHint_", "joinTable", "joinCondition", "whereClause", "groupByClause", 
		"havingClause", "limitClause", "rangeItem_", "windowClause_", "windowItem_", 
		"subquery", "withClause_", "cteClause_", "literals_", "identifier_", "unreservedWord_", 
		"tableName", "columnName", "columnNames", "indexName", "expr", "booleanPrimary", 
		"comparisonOperator", "predicate", "bitExpr", "simpleExpr", "functionCall", 
		"functionName", "specialFunction", "distinct", "caseExpr", "caseComp", 
		"caseWhenComp", "caseCond", "whenResult", "elseResult", "caseResult", 
		"intervalExpr", "variable", "literal", "question", "number", "string", 
		"orderByClause", "orderByItem", "groupConcat", "castFunction", "convertFunction", 
		"positionFunction", "substringFunction", "extractFunction", "charFunction", 
		"trimFunction", "weightStringFunction", "levelClause", "levelInWeightListElements", 
		"levelInWeightListElement", "windowFunction", "overClause", "windowSpec", 
		"windowPartitionClause", "frameClause", "frameUnits", "frameExtent", "frameStart", 
		"frameBetween", "frameEnd", "dataType", "dataTypeName_", "dataTypeLength", 
		"characterSet_", "collateClause_", "ignoredIdentifier_", "ignoredIdentifiers_", 
		"createTable", "createDefinitions_", "createDefinition_", "columnDefinition", 
		"inlineDataType_", "generatedDataType_", "commonDataTypeOption_", "referenceDefinition_", 
		"referenceOption_", "indexDefinition_", "indexType_", "keyParts_", "keyPart_", 
		"indexOption_", "constraintDefinition_", "primaryKeyOption_", "primaryKey", 
		"uniqueOption_", "foreignKeyOption_", "checkConstraintDefinition_", "createLike_", 
		"alterTable", "alterSpecifications_", "alterSpecification_", "tableOptions_", 
		"tableOption_", "addColumnSpecification", "firstOrAfterColumn", "addIndexSpecification", 
		"addConstraintSpecification", "changeColumnSpecification", "dropColumnSpecification", 
		"dropIndexSpecification", "dropPrimaryKeySpecification", "modifyColumnSpecification", 
		"renameColumnSpecification", "renameIndexSpecification", "renameTableSpecification", 
		"partitionDefinitions_", "partitionDefinition_", "partitionLessThanValue_", 
		"partitionValueList_", "partitionDefinitionOption_", "subpartitionDefinition_", 
		"dropTable", "truncateTable", "createIndex", "dropIndex", "setTransaction", 
		"setAutoCommit", "autoCommitValue", "beginTransaction", "commit", "rollback", 
		"savepoint", "grant", "revoke", "proxyClause_", "privilegeClause_", "roleClause_", 
		"allClause_", "privileges_", "privilegeType_", "onObjectClause_", "objectType_", 
		"privilegeLevel_", "createUser", "dropUser", "alterUser", "renameUser", 
		"createRole", "dropRole", "setRole", "setPassword"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'", 
		"'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", "'%'", 
		"':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", "'=='", 
		"'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "','", "'\"'", "'''", "'`'", "'?'", "'@'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "ALL", "AND", "ANY", "ASC", "BETWEEN", "BINARY", "BY", "DATE", 
		"DESC", "DISTINCT", "ESCAPE", "EXISTS", "FALSE", "FROM", "GROUP", "HAVING", 
		"IN", "IS", "KEY", "LIKE", "LIMIT", "MOD", "DIV", "NOT", "NULL", "OFFSET", 
		"OR", "ORDER", "PARTITION", "PRIMARY", "REGEXP", "RLIKE", "ROLLUP", "ROW", 
		"SET", "SOUNDS", "TIME", "TIMESTAMP", "TRUE", "UNION", "UNKNOWN", "WHERE", 
		"WITH", "XOR", "ADD", "ALTER", "ALWAYS", "AS", "CASCADE", "CHECK", "COLUMN", 
		"COMMIT", "COMMITTED", "CONSTRAINT", "CREATE", "CURRENT", "DAY", "DEFAULT", 
		"DELETE", "DISABLE", "DROP", "ENABLE", "FOR", "FOREIGN", "FUNCTION", "GENERATED", 
		"GRANT", "INDEX", "LEVEL", "NO", "ON", "OPTION", "PASSWORD", "PRIVILEGES", 
		"READ", "REFERENCES", "REVOKE", "ROLE", "ROLLBACK", "ROWS", "START", "TABLE", 
		"TO", "TRANSACTION", "TRUNCATE", "UNIQUE", "USER", "ACCOUNT", "ACTION", 
		"AFTER", "ALGORITHM", "ANALYZE", "AUDIT_ADMIN", "AUTO_INCREMENT", "AUTOCOMMIT", 
		"AVG_ROW_LENGTH", "BEGIN", "BINLOG_ADMIN", "BOTH", "BTREE", "CASE", "CAST", 
		"CHAIN", "CHANGE", "CHAR", "CHARACTER", "CHARSET", "CHECKSUM", "CIPHER", 
		"CLIENT", "COALESCE", "COLLATE", "COLUMNS", "COLUMN_FORMAT", "COMMENT", 
		"COMPACT", "COMPRESSED", "COMPRESSION", "CONNECTION", "CONNECTION_ADMIN", 
		"CONSISTENT", "CONVERT", "COPY", "CROSS", "CURRENT_TIMESTAMP", "DATA", 
		"DATABASES", "DELAYED", "DELAY_KEY_WRITE", "DIRECTORY", "DISCARD", "DISK", 
		"DISTINCTROW", "DOUBLE", "DUPLICATE", "DYNAMIC", "ELSE", "ENCRYPTION", 
		"ENCRYPTION_KEY_ADMIN", "END", "ENGINE", "EVENT", "EXCEPT", "EXCHANGE", 
		"EXCLUSIVE", "EXECUTE", "EXTRACT", "FILE", "FIREWALL_ADMIN", "FIREWALL_USER", 
		"FIRST", "FIXED", "FOLLOWING", "FORCE", "FULL", "FULLTEXT", "GLOBAL", 
		"GROUP_CONCAT", "GROUP_REPLICATION_ADMIN", "HASH", "HIGH_PRIORITY", "IDENTIFIED", 
		"IF", "IGNORE", "IMPORT_", "INNER", "INPLACE", "INSERT", "INSERT_METHOD", 
		"INTERVAL", "INTO", "JOIN", "KEYS", "KEY_BLOCK_SIZE", "LAST", "LEADING", 
		"LEFT", "LESS", "LINEAR", "LOCALTIME", "LOCALTIMESTAMP", "LOCK", "LOW_PRIORITY", 
		"MATCH", "MAXVALUE", "MAX_ROWS", "MEMORY", "MIN_ROWS", "MODIFY", "NATURAL", 
		"NONE", "NOW", "OFFLINE", "ONLINE", "OPTIMIZE", "OUTER", "OVER", "PACK_KEYS", 
		"PARSER", "PARTIAL", "PARTITIONING", "PERSIST", "PERSIST_ONLY", "POSITION", 
		"PRECEDING", "PRECISION", "PROCEDURE", "PROCESS", "PROXY", "QUICK", "RANGE", 
		"REBUILD", "RECURSIVE", "REDUNDANT", "RELEASE", "RELOAD", "REMOVE", "RENAME", 
		"REORGANIZE", "REPAIR", "REPLACE", "REPLICATION", "REPLICATION_SLAVE_ADMIN", 
		"REQUIRE", "RESTRICT", "REVERSE", "RIGHT", "ROLE_ADMIN", "ROUTINE", "ROW_FORMAT", 
		"SAVEPOINT", "SELECT", "SEPARATOR", "SESSION", "SET_USER_ID", "SHARED", 
		"SHOW", "SHUTDOWN", "SIMPLE", "SLAVE", "SPATIAL", "SQLDML", "SQLDQL", 
		"SQL_BIG_RESULT", "SQL_BUFFER_RESULT", "SQL_CACHE", "SQL_CALC_FOUND_ROWS", 
		"SQL_NO_CACHE", "SQL_SMALL_RESULT", "SSL", "STATS_AUTO_RECALC", "STATS_PERSISTENT", 
		"STATS_SAMPLE_PAGES", "STORAGE", "STORED", "STRAIGHT_JOIN", "SUBPARTITION", 
		"SUPER", "SUBSTR", "SUBSTRING", "SYSTEM_VARIABLES_ADMIN", "TABLES", "TABLESPACE", 
		"TEMPORARY", "THAN", "THEN", "TRAILING", "TRIGGER", "TRIM", "UNBOUNDED", 
		"UNLOCK", "UNSIGNED", "UPDATE", "UPGRADE", "USAGE", "USE", "USING", "VALIDATION", 
		"VALUE", "VALUES", "VERSION_TOKEN_ADMIN", "VIEW", "VIRTUAL", "WEIGHT_STRING", 
		"WHEN", "WINDOW", "WITHOUT", "WRITE", "ZEROFILL", "VISIBLE", "INVISIBLE", 
		"INSTANT", "ENFORCED", "FOR_GENERATOR", "AND_", "OR_", "NOT_", "TILDE_", 
		"VERTICAL_BAR_", "AMPERSAND_", "SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", 
		"CARET_", "MOD_", "COLON_", "PLUS_", "MINUS_", "ASTERISK_", "SLASH_", 
		"BACKSLASH_", "DOT_", "DOT_ASTERISK_", "SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", 
		"GT_", "GTE_", "LT_", "LTE_", "POUND_", "LP_", "RP_", "LBE_", "RBE_", 
		"LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", "BQ_", "QUESTION_", "AT_", "SEMI_", 
		"BLOCK_COMMENT", "INLINE_COMMENT", "IDENTIFIER_", "STRING_", "NUMBER_", 
		"HEX_DIGIT_", "BIT_NUM_"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MySQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MySQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExecuteContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public TruncateTableContext truncateTable() {
			return getRuleContext(TruncateTableContext.class,0);
		}
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public DropIndexContext dropIndex() {
			return getRuleContext(DropIndexContext.class,0);
		}
		public SetTransactionContext setTransaction() {
			return getRuleContext(SetTransactionContext.class,0);
		}
		public BeginTransactionContext beginTransaction() {
			return getRuleContext(BeginTransactionContext.class,0);
		}
		public SetAutoCommitContext setAutoCommit() {
			return getRuleContext(SetAutoCommitContext.class,0);
		}
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public RollbackContext rollback() {
			return getRuleContext(RollbackContext.class,0);
		}
		public SavepointContext savepoint() {
			return getRuleContext(SavepointContext.class,0);
		}
		public GrantContext grant() {
			return getRuleContext(GrantContext.class,0);
		}
		public RevokeContext revoke() {
			return getRuleContext(RevokeContext.class,0);
		}
		public CreateUserContext createUser() {
			return getRuleContext(CreateUserContext.class,0);
		}
		public DropUserContext dropUser() {
			return getRuleContext(DropUserContext.class,0);
		}
		public AlterUserContext alterUser() {
			return getRuleContext(AlterUserContext.class,0);
		}
		public RenameUserContext renameUser() {
			return getRuleContext(RenameUserContext.class,0);
		}
		public CreateRoleContext createRole() {
			return getRuleContext(CreateRoleContext.class,0);
		}
		public DropRoleContext dropRole() {
			return getRuleContext(DropRoleContext.class,0);
		}
		public SetRoleContext setRole() {
			return getRuleContext(SetRoleContext.class,0);
		}
		public SetPasswordContext setPassword() {
			return getRuleContext(SetPasswordContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(MySQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_execute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(364);
				select();
				}
				break;
			case 2:
				{
				setState(365);
				insert();
				}
				break;
			case 3:
				{
				setState(366);
				update();
				}
				break;
			case 4:
				{
				setState(367);
				delete();
				}
				break;
			case 5:
				{
				setState(368);
				createTable();
				}
				break;
			case 6:
				{
				setState(369);
				alterTable();
				}
				break;
			case 7:
				{
				setState(370);
				dropTable();
				}
				break;
			case 8:
				{
				setState(371);
				truncateTable();
				}
				break;
			case 9:
				{
				setState(372);
				createIndex();
				}
				break;
			case 10:
				{
				setState(373);
				dropIndex();
				}
				break;
			case 11:
				{
				setState(374);
				setTransaction();
				}
				break;
			case 12:
				{
				setState(375);
				beginTransaction();
				}
				break;
			case 13:
				{
				setState(376);
				setAutoCommit();
				}
				break;
			case 14:
				{
				setState(377);
				commit();
				}
				break;
			case 15:
				{
				setState(378);
				rollback();
				}
				break;
			case 16:
				{
				setState(379);
				savepoint();
				}
				break;
			case 17:
				{
				setState(380);
				grant();
				}
				break;
			case 18:
				{
				setState(381);
				revoke();
				}
				break;
			case 19:
				{
				setState(382);
				createUser();
				}
				break;
			case 20:
				{
				setState(383);
				dropUser();
				}
				break;
			case 21:
				{
				setState(384);
				alterUser();
				}
				break;
			case 22:
				{
				setState(385);
				renameUser();
				}
				break;
			case 23:
				{
				setState(386);
				createRole();
				}
				break;
			case 24:
				{
				setState(387);
				dropRole();
				}
				break;
			case 25:
				{
				setState(388);
				setRole();
				}
				break;
			case 26:
				{
				setState(389);
				setPassword();
				}
				break;
			}
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(392);
				match(SEMI_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(MySQLStatementParser.INSERT, 0); }
		public InsertSpecification_Context insertSpecification_() {
			return getRuleContext(InsertSpecification_Context.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public InsertValuesClauseContext insertValuesClause() {
			return getRuleContext(InsertValuesClauseContext.class,0);
		}
		public SetAssignmentsClauseContext setAssignmentsClause() {
			return getRuleContext(SetAssignmentsClauseContext.class,0);
		}
		public InsertSelectClauseContext insertSelectClause() {
			return getRuleContext(InsertSelectClauseContext.class,0);
		}
		public TerminalNode INTO() { return getToken(MySQLStatementParser.INTO, 0); }
		public PartitionNames_Context partitionNames_() {
			return getRuleContext(PartitionNames_Context.class,0);
		}
		public OnDuplicateKeyClauseContext onDuplicateKeyClause() {
			return getRuleContext(OnDuplicateKeyClauseContext.class,0);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(INSERT);
			setState(396);
			insertSpecification_();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(397);
				match(INTO);
				}
			}

			setState(400);
			tableName();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(401);
				partitionNames_();
				}
			}

			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(404);
				insertValuesClause();
				}
				break;
			case 2:
				{
				setState(405);
				setAssignmentsClause();
				}
				break;
			case 3:
				{
				setState(406);
				insertSelectClause();
				}
				break;
			}
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(409);
				onDuplicateKeyClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertSpecification_Context extends ParserRuleContext {
		public TerminalNode IGNORE() { return getToken(MySQLStatementParser.IGNORE, 0); }
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLStatementParser.LOW_PRIORITY, 0); }
		public TerminalNode DELAYED() { return getToken(MySQLStatementParser.DELAYED, 0); }
		public TerminalNode HIGH_PRIORITY() { return getToken(MySQLStatementParser.HIGH_PRIORITY, 0); }
		public InsertSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSpecification_; }
	}

	public final InsertSpecification_Context insertSpecification_() throws RecognitionException {
		InsertSpecification_Context _localctx = new InsertSpecification_Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (DELAYED - 129)) | (1L << (HIGH_PRIORITY - 129)) | (1L << (LOW_PRIORITY - 129)))) != 0)) {
				{
				setState(412);
				_la = _input.LA(1);
				if ( !(((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (DELAYED - 129)) | (1L << (HIGH_PRIORITY - 129)) | (1L << (LOW_PRIORITY - 129)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(415);
				match(IGNORE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionNames_Context extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public PartitionNames_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionNames_; }
	}

	public final PartitionNames_Context partitionNames_() throws RecognitionException {
		PartitionNames_Context _localctx = new PartitionNames_Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_partitionNames_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(PARTITION);
			setState(419);
			identifier_();
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(420);
				match(COMMA_);
				setState(421);
				identifier_();
				}
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertValuesClauseContext extends ParserRuleContext {
		public List<AssignmentValuesContext> assignmentValues() {
			return getRuleContexts(AssignmentValuesContext.class);
		}
		public AssignmentValuesContext assignmentValues(int i) {
			return getRuleContext(AssignmentValuesContext.class,i);
		}
		public TerminalNode VALUES() { return getToken(MySQLStatementParser.VALUES, 0); }
		public TerminalNode VALUE() { return getToken(MySQLStatementParser.VALUE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public InsertValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValuesClause; }
	}

	public final InsertValuesClauseContext insertValuesClause() throws RecognitionException {
		InsertValuesClauseContext _localctx = new InsertValuesClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_insertValuesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(427);
				columnNames();
				}
			}

			setState(430);
			_la = _input.LA(1);
			if ( !(_la==VALUE || _la==VALUES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(431);
			assignmentValues();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(432);
				match(COMMA_);
				setState(433);
				assignmentValues();
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertSelectClauseContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public InsertSelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSelectClause; }
	}

	public final InsertSelectClauseContext insertSelectClause() throws RecognitionException {
		InsertSelectClauseContext _localctx = new InsertSelectClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_insertSelectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(439);
				columnNames();
				}
			}

			setState(442);
			select();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnDuplicateKeyClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public TerminalNode DUPLICATE() { return getToken(MySQLStatementParser.DUPLICATE, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public TerminalNode UPDATE() { return getToken(MySQLStatementParser.UPDATE, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public OnDuplicateKeyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onDuplicateKeyClause; }
	}

	public final OnDuplicateKeyClauseContext onDuplicateKeyClause() throws RecognitionException {
		OnDuplicateKeyClauseContext _localctx = new OnDuplicateKeyClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_onDuplicateKeyClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(ON);
			setState(445);
			match(DUPLICATE);
			setState(446);
			match(KEY);
			setState(447);
			match(UPDATE);
			setState(448);
			assignment();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(449);
				match(COMMA_);
				setState(450);
				assignment();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public AssignmentValueContext assignmentValue() {
			return getRuleContext(AssignmentValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			columnName();
			setState(457);
			match(EQ_);
			setState(458);
			assignmentValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentValuesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<AssignmentValueContext> assignmentValue() {
			return getRuleContexts(AssignmentValueContext.class);
		}
		public AssignmentValueContext assignmentValue(int i) {
			return getRuleContext(AssignmentValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public AssignmentValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValues; }
	}

	public final AssignmentValuesContext assignmentValues() throws RecognitionException {
		AssignmentValuesContext _localctx = new AssignmentValuesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentValues);
		int _la;
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				match(LP_);
				setState(461);
				assignmentValue();
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(462);
					match(COMMA_);
					setState(463);
					assignmentValue();
					}
					}
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(469);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				match(LP_);
				setState(472);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public AssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValue; }
	}

	public final AssignmentValueContext assignmentValue() throws RecognitionException {
		AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentValue);
		try {
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case BINARY:
			case DATE:
			case ESCAPE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case OFFSET:
			case ROLLUP:
			case ROW:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DAY:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CASE:
			case CAST:
			case CHAIN:
			case CHAR:
			case CHARACTER:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case EXTRACT:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case GROUP_CONCAT:
			case HASH:
			case IF:
			case IMPORT_:
			case INSERT_METHOD:
			case INTERVAL:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case NOW:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case POSITION:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPLACE:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case SUBSTR:
			case SUBSTRING:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case TRIM:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				expr(0);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetAssignmentsClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public SetAssignmentsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAssignmentsClause; }
	}

	public final SetAssignmentsClauseContext setAssignmentsClause() throws RecognitionException {
		SetAssignmentsClauseContext _localctx = new SetAssignmentsClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_setAssignmentsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(SET);
			setState(480);
			assignment();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(481);
				match(COMMA_);
				setState(482);
				assignment();
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public UpdateClauseContext updateClause() {
			return getRuleContext(UpdateClauseContext.class,0);
		}
		public SetAssignmentsClauseContext setAssignmentsClause() {
			return getRuleContext(SetAssignmentsClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			updateClause();
			setState(489);
			setAssignmentsClause();
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(490);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateClauseContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(MySQLStatementParser.UPDATE, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLStatementParser.LOW_PRIORITY, 0); }
		public TerminalNode IGNORE() { return getToken(MySQLStatementParser.IGNORE, 0); }
		public UpdateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateClause; }
	}

	public final UpdateClauseContext updateClause() throws RecognitionException {
		UpdateClauseContext _localctx = new UpdateClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_updateClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(UPDATE);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY) {
				{
				setState(494);
				match(LOW_PRIORITY);
				}
			}

			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(497);
				match(IGNORE);
				}
			}

			setState(500);
			tableReferences();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public DeleteClauseContext deleteClause() {
			return getRuleContext(DeleteClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			deleteClause();
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(503);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteClauseContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(MySQLStatementParser.DELETE, 0); }
		public FromMultiContext fromMulti() {
			return getRuleContext(FromMultiContext.class,0);
		}
		public FromSingleContext fromSingle() {
			return getRuleContext(FromSingleContext.class,0);
		}
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLStatementParser.LOW_PRIORITY, 0); }
		public TerminalNode QUICK() { return getToken(MySQLStatementParser.QUICK, 0); }
		public TerminalNode IGNORE() { return getToken(MySQLStatementParser.IGNORE, 0); }
		public DeleteClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteClause; }
	}

	public final DeleteClauseContext deleteClause() throws RecognitionException {
		DeleteClauseContext _localctx = new DeleteClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_deleteClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(DELETE);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY) {
				{
				setState(507);
				match(LOW_PRIORITY);
				}
			}

			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(510);
				match(QUICK);
				}
				break;
			}
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(513);
				match(IGNORE);
				}
			}

			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(516);
				fromMulti();
				}
				break;
			case 2:
				{
				setState(517);
				fromSingle();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromSingleContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public FromSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromSingle; }
	}

	public final FromSingleContext fromSingle() throws RecognitionException {
		FromSingleContext _localctx = new FromSingleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fromSingle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(FROM);
			setState(521);
			tableName();
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(522);
				match(PARTITION);
				setState(523);
				ignoredIdentifiers_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromMultiContext extends ParserRuleContext {
		public FromMultiTablesContext fromMultiTables() {
			return getRuleContext(FromMultiTablesContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public FromMultiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromMulti; }
	}

	public final FromMultiContext fromMulti() throws RecognitionException {
		FromMultiContext _localctx = new FromMultiContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fromMulti);
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case DATE:
			case ESCAPE:
			case OFFSET:
			case ROLLUP:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DAY:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				fromMultiTables();
				setState(527);
				match(FROM);
				setState(528);
				tableReferences();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				match(FROM);
				setState(531);
				fromMultiTables();
				setState(532);
				match(USING);
				setState(533);
				tableReferences();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromMultiTablesContext extends ParserRuleContext {
		public List<FromMultiTableContext> fromMultiTable() {
			return getRuleContexts(FromMultiTableContext.class);
		}
		public FromMultiTableContext fromMultiTable(int i) {
			return getRuleContext(FromMultiTableContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public FromMultiTablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromMultiTables; }
	}

	public final FromMultiTablesContext fromMultiTables() throws RecognitionException {
		FromMultiTablesContext _localctx = new FromMultiTablesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fromMultiTables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			fromMultiTable();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(538);
				match(COMMA_);
				setState(539);
				fromMultiTable();
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromMultiTableContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode DOT_ASTERISK_() { return getToken(MySQLStatementParser.DOT_ASTERISK_, 0); }
		public FromMultiTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromMultiTable; }
	}

	public final FromMultiTableContext fromMultiTable() throws RecognitionException {
		FromMultiTableContext _localctx = new FromMultiTableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fromMultiTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			tableName();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_ASTERISK_) {
				{
				setState(546);
				match(DOT_ASTERISK_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public UnionSelectContext unionSelect() {
			return getRuleContext(UnionSelectContext.class,0);
		}
		public WithClause_Context withClause_() {
			return getRuleContext(WithClause_Context.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_select);
		try {
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				unionSelect();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				withClause_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionSelectContext extends ParserRuleContext {
		public List<SelectExpressionContext> selectExpression() {
			return getRuleContexts(SelectExpressionContext.class);
		}
		public SelectExpressionContext selectExpression(int i) {
			return getRuleContext(SelectExpressionContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(MySQLStatementParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(MySQLStatementParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(MySQLStatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(MySQLStatementParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(MySQLStatementParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(MySQLStatementParser.DISTINCT, i);
		}
		public UnionSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionSelect; }
	}

	public final UnionSelectContext unionSelect() throws RecognitionException {
		UnionSelectContext _localctx = new UnionSelectContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unionSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			selectExpression();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(554);
				match(UNION);
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(555);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(558);
				selectExpression();
				}
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectExpressionContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClause_Context windowClause_() {
			return getRuleContext(WindowClause_Context.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SelectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpression; }
	}

	public final SelectExpressionContext selectExpression() throws RecognitionException {
		SelectExpressionContext _localctx = new SelectExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_selectExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			selectClause();
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(565);
				fromClause();
				}
			}

			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(568);
				whereClause();
				}
			}

			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(571);
				groupByClause();
				}
			}

			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(574);
				havingClause();
				}
			}

			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(577);
				windowClause_();
				}
			}

			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(580);
				orderByClause();
				}
			}

			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(583);
				limitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MySQLStatementParser.SELECT, 0); }
		public SelectSpecificationContext selectSpecification() {
			return getRuleContext(SelectSpecificationContext.class,0);
		}
		public SelectExprsContext selectExprs() {
			return getRuleContext(SelectExprsContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_selectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(SELECT);
			setState(587);
			selectSpecification();
			setState(588);
			selectExprs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectSpecificationContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public TerminalNode DISTINCTROW() { return getToken(MySQLStatementParser.DISTINCTROW, 0); }
		public TerminalNode HIGH_PRIORITY() { return getToken(MySQLStatementParser.HIGH_PRIORITY, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(MySQLStatementParser.STRAIGHT_JOIN, 0); }
		public TerminalNode SQL_SMALL_RESULT() { return getToken(MySQLStatementParser.SQL_SMALL_RESULT, 0); }
		public TerminalNode SQL_BIG_RESULT() { return getToken(MySQLStatementParser.SQL_BIG_RESULT, 0); }
		public TerminalNode SQL_BUFFER_RESULT() { return getToken(MySQLStatementParser.SQL_BUFFER_RESULT, 0); }
		public TerminalNode SQL_CALC_FOUND_ROWS() { return getToken(MySQLStatementParser.SQL_CALC_FOUND_ROWS, 0); }
		public TerminalNode SQL_CACHE() { return getToken(MySQLStatementParser.SQL_CACHE, 0); }
		public TerminalNode SQL_NO_CACHE() { return getToken(MySQLStatementParser.SQL_NO_CACHE, 0); }
		public SelectSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectSpecification; }
	}

	public final SelectSpecificationContext selectSpecification() throws RecognitionException {
		SelectSpecificationContext _localctx = new SelectSpecificationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_selectSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(590);
				match(ALL);
				}
				break;
			case DISTINCT:
				{
				setState(591);
				distinct();
				}
				break;
			case DISTINCTROW:
				{
				setState(592);
				match(DISTINCTROW);
				}
				break;
			case ANY:
			case BINARY:
			case DATE:
			case ESCAPE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case OFFSET:
			case ROLLUP:
			case ROW:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DAY:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CASE:
			case CAST:
			case CHAIN:
			case CHAR:
			case CHARACTER:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case EXTRACT:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case GROUP_CONCAT:
			case HASH:
			case HIGH_PRIORITY:
			case IF:
			case IMPORT_:
			case INSERT_METHOD:
			case INTERVAL:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case NOW:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case POSITION:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPLACE:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_CALC_FOUND_ROWS:
			case SQL_NO_CACHE:
			case SQL_SMALL_RESULT:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case STRAIGHT_JOIN:
			case SUBPARTITION:
			case SUPER:
			case SUBSTR:
			case SUBSTRING:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case TRIM:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case ASTERISK_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				break;
			default:
				break;
			}
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HIGH_PRIORITY) {
				{
				setState(595);
				match(HIGH_PRIORITY);
				}
			}

			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRAIGHT_JOIN) {
				{
				setState(598);
				match(STRAIGHT_JOIN);
				}
			}

			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQL_SMALL_RESULT) {
				{
				setState(601);
				match(SQL_SMALL_RESULT);
				}
			}

			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(604);
				match(SQL_BIG_RESULT);
				}
				break;
			}
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(607);
				match(SQL_BUFFER_RESULT);
				}
				break;
			}
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(610);
				_la = _input.LA(1);
				if ( !(_la==SQL_CACHE || _la==SQL_NO_CACHE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQL_CALC_FOUND_ROWS) {
				{
				setState(613);
				match(SQL_CALC_FOUND_ROWS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectExprsContext extends ParserRuleContext {
		public UnqualifiedShorthandContext unqualifiedShorthand() {
			return getRuleContext(UnqualifiedShorthandContext.class,0);
		}
		public List<SelectExprContext> selectExpr() {
			return getRuleContexts(SelectExprContext.class);
		}
		public SelectExprContext selectExpr(int i) {
			return getRuleContext(SelectExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public SelectExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExprs; }
	}

	public final SelectExprsContext selectExprs() throws RecognitionException {
		SelectExprsContext _localctx = new SelectExprsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_selectExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK_:
				{
				setState(616);
				unqualifiedShorthand();
				}
				break;
			case ANY:
			case BINARY:
			case DATE:
			case ESCAPE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case OFFSET:
			case ROLLUP:
			case ROW:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DAY:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CASE:
			case CAST:
			case CHAIN:
			case CHAR:
			case CHARACTER:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case EXTRACT:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case GROUP_CONCAT:
			case HASH:
			case IF:
			case IMPORT_:
			case INSERT_METHOD:
			case INTERVAL:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case NOW:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case POSITION:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPLACE:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case SUBSTR:
			case SUBSTRING:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case TRIM:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(617);
				selectExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(620);
				match(COMMA_);
				setState(621);
				selectExpr();
				}
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectExprContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public QualifiedShorthandContext qualifiedShorthand() {
			return getRuleContext(QualifiedShorthandContext.class,0);
		}
		public SelectExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpr; }
	}

	public final SelectExprContext selectExpr() throws RecognitionException {
		SelectExprContext _localctx = new SelectExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_selectExpr);
		int _la;
		try {
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(627);
					columnName();
					}
					break;
				case 2:
					{
					setState(628);
					expr(0);
					}
					break;
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(631);
					match(AS);
					}
				}

				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DAY) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LEVEL - 70)) | (1L << (NO - 70)) | (1L << (PASSWORD - 70)) | (1L << (PRIVILEGES - 70)) | (1L << (ROLLBACK - 70)) | (1L << (START - 70)) | (1L << (TRANSACTION - 70)) | (1L << (TRUNCATE - 70)) | (1L << (ACCOUNT - 70)) | (1L << (ACTION - 70)) | (1L << (AFTER - 70)) | (1L << (ALGORITHM - 70)) | (1L << (AUTO_INCREMENT - 70)) | (1L << (AVG_ROW_LENGTH - 70)) | (1L << (BEGIN - 70)) | (1L << (BTREE - 70)) | (1L << (CHAIN - 70)) | (1L << (CHARSET - 70)) | (1L << (CHECKSUM - 70)) | (1L << (CIPHER - 70)) | (1L << (CLIENT - 70)) | (1L << (COALESCE - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN_FORMAT - 70)) | (1L << (COMMENT - 70)) | (1L << (COMPACT - 70)) | (1L << (COMPRESSED - 70)) | (1L << (COMPRESSION - 70)) | (1L << (CONNECTION - 70)) | (1L << (CONSISTENT - 70)) | (1L << (DATA - 70)) | (1L << (DELAY_KEY_WRITE - 70)) | (1L << (DISCARD - 70)) | (1L << (DISK - 70)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (DUPLICATE - 136)) | (1L << (ENCRYPTION - 136)) | (1L << (END - 136)) | (1L << (ENGINE - 136)) | (1L << (EVENT - 136)) | (1L << (EXCHANGE - 136)) | (1L << (EXECUTE - 136)) | (1L << (FILE - 136)) | (1L << (FIRST - 136)) | (1L << (FIXED - 136)) | (1L << (FOLLOWING - 136)) | (1L << (GLOBAL - 136)) | (1L << (HASH - 136)) | (1L << (IMPORT_ - 136)) | (1L << (INSERT_METHOD - 136)) | (1L << (KEY_BLOCK_SIZE - 136)) | (1L << (LAST - 136)) | (1L << (LESS - 136)) | (1L << (MAX_ROWS - 136)) | (1L << (MEMORY - 136)) | (1L << (MIN_ROWS - 136)) | (1L << (MODIFY - 136)) | (1L << (NONE - 136)) | (1L << (PACK_KEYS - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (PARSER - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITIONING - 200)) | (1L << (PERSIST - 200)) | (1L << (PERSIST_ONLY - 200)) | (1L << (PRECEDING - 200)) | (1L << (PROCESS - 200)) | (1L << (PROXY - 200)) | (1L << (QUICK - 200)) | (1L << (REBUILD - 200)) | (1L << (REDUNDANT - 200)) | (1L << (RELOAD - 200)) | (1L << (REMOVE - 200)) | (1L << (REORGANIZE - 200)) | (1L << (REPAIR - 200)) | (1L << (REVERSE - 200)) | (1L << (ROW_FORMAT - 200)) | (1L << (SAVEPOINT - 200)) | (1L << (SESSION - 200)) | (1L << (SHUTDOWN - 200)) | (1L << (SIMPLE - 200)) | (1L << (SLAVE - 200)) | (1L << (SQL_BIG_RESULT - 200)) | (1L << (SQL_BUFFER_RESULT - 200)) | (1L << (SQL_CACHE - 200)) | (1L << (SQL_NO_CACHE - 200)) | (1L << (STATS_AUTO_RECALC - 200)) | (1L << (STATS_PERSISTENT - 200)) | (1L << (STATS_SAMPLE_PAGES - 200)) | (1L << (STORAGE - 200)) | (1L << (SUBPARTITION - 200)) | (1L << (SUPER - 200)) | (1L << (TABLES - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (THAN - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UPGRADE - 264)) | (1L << (VALIDATION - 264)) | (1L << (VALUE - 264)) | (1L << (VIEW - 264)) | (1L << (WEIGHT_STRING - 264)) | (1L << (WITHOUT - 264)) | (1L << (VISIBLE - 264)) | (1L << (INVISIBLE - 264)) | (1L << (ENFORCED - 264)))) != 0) || _la==IDENTIFIER_ || _la==STRING_) {
					{
					setState(634);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				qualifiedShorthand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_alias);
		try {
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case DATE:
			case ESCAPE:
			case OFFSET:
			case ROLLUP:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DAY:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				identifier_();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				match(STRING_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnqualifiedShorthandContext extends ParserRuleContext {
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public UnqualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedShorthand; }
	}

	public final UnqualifiedShorthandContext unqualifiedShorthand() throws RecognitionException {
		UnqualifiedShorthandContext _localctx = new UnqualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unqualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(ASTERISK_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedShorthandContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode DOT_ASTERISK_() { return getToken(MySQLStatementParser.DOT_ASTERISK_, 0); }
		public QualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedShorthand; }
	}

	public final QualifiedShorthandContext qualifiedShorthand() throws RecognitionException {
		QualifiedShorthandContext _localctx = new QualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_qualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			identifier_();
			setState(647);
			match(DOT_ASTERISK_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(FROM);
			setState(650);
			tableReferences();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableReferencesContext extends ParserRuleContext {
		public List<TableReferenceContext> tableReference() {
			return getRuleContexts(TableReferenceContext.class);
		}
		public TableReferenceContext tableReference(int i) {
			return getRuleContext(TableReferenceContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			tableReference();
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(653);
				match(COMMA_);
				setState(654);
				tableReference();
				}
				}
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableReferenceContext extends ParserRuleContext {
		public List<TableFactorContext> tableFactor() {
			return getRuleContexts(TableFactorContext.class);
		}
		public TableFactorContext tableFactor(int i) {
			return getRuleContext(TableFactorContext.class,i);
		}
		public List<JoinTableContext> joinTable() {
			return getRuleContexts(JoinTableContext.class);
		}
		public JoinTableContext joinTable(int i) {
			return getRuleContext(JoinTableContext.class,i);
		}
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tableReference);
		int _la;
		try {
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(660);
					tableFactor();
					setState(661);
					joinTable();
					}
					}
					setState(665); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DAY) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LEVEL - 70)) | (1L << (NO - 70)) | (1L << (PASSWORD - 70)) | (1L << (PRIVILEGES - 70)) | (1L << (ROLLBACK - 70)) | (1L << (START - 70)) | (1L << (TRANSACTION - 70)) | (1L << (TRUNCATE - 70)) | (1L << (ACCOUNT - 70)) | (1L << (ACTION - 70)) | (1L << (AFTER - 70)) | (1L << (ALGORITHM - 70)) | (1L << (AUTO_INCREMENT - 70)) | (1L << (AVG_ROW_LENGTH - 70)) | (1L << (BEGIN - 70)) | (1L << (BTREE - 70)) | (1L << (CHAIN - 70)) | (1L << (CHARSET - 70)) | (1L << (CHECKSUM - 70)) | (1L << (CIPHER - 70)) | (1L << (CLIENT - 70)) | (1L << (COALESCE - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN_FORMAT - 70)) | (1L << (COMMENT - 70)) | (1L << (COMPACT - 70)) | (1L << (COMPRESSED - 70)) | (1L << (COMPRESSION - 70)) | (1L << (CONNECTION - 70)) | (1L << (CONSISTENT - 70)) | (1L << (DATA - 70)) | (1L << (DELAY_KEY_WRITE - 70)) | (1L << (DISCARD - 70)) | (1L << (DISK - 70)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (DUPLICATE - 136)) | (1L << (ENCRYPTION - 136)) | (1L << (END - 136)) | (1L << (ENGINE - 136)) | (1L << (EVENT - 136)) | (1L << (EXCHANGE - 136)) | (1L << (EXECUTE - 136)) | (1L << (FILE - 136)) | (1L << (FIRST - 136)) | (1L << (FIXED - 136)) | (1L << (FOLLOWING - 136)) | (1L << (GLOBAL - 136)) | (1L << (HASH - 136)) | (1L << (IMPORT_ - 136)) | (1L << (INSERT_METHOD - 136)) | (1L << (KEY_BLOCK_SIZE - 136)) | (1L << (LAST - 136)) | (1L << (LESS - 136)) | (1L << (MAX_ROWS - 136)) | (1L << (MEMORY - 136)) | (1L << (MIN_ROWS - 136)) | (1L << (MODIFY - 136)) | (1L << (NONE - 136)) | (1L << (PACK_KEYS - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (PARSER - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITIONING - 200)) | (1L << (PERSIST - 200)) | (1L << (PERSIST_ONLY - 200)) | (1L << (PRECEDING - 200)) | (1L << (PROCESS - 200)) | (1L << (PROXY - 200)) | (1L << (QUICK - 200)) | (1L << (REBUILD - 200)) | (1L << (REDUNDANT - 200)) | (1L << (RELOAD - 200)) | (1L << (REMOVE - 200)) | (1L << (REORGANIZE - 200)) | (1L << (REPAIR - 200)) | (1L << (REVERSE - 200)) | (1L << (ROW_FORMAT - 200)) | (1L << (SAVEPOINT - 200)) | (1L << (SESSION - 200)) | (1L << (SHUTDOWN - 200)) | (1L << (SIMPLE - 200)) | (1L << (SLAVE - 200)) | (1L << (SQL_BIG_RESULT - 200)) | (1L << (SQL_BUFFER_RESULT - 200)) | (1L << (SQL_CACHE - 200)) | (1L << (SQL_NO_CACHE - 200)) | (1L << (STATS_AUTO_RECALC - 200)) | (1L << (STATS_PERSISTENT - 200)) | (1L << (STATS_SAMPLE_PAGES - 200)) | (1L << (STORAGE - 200)) | (1L << (SUBPARTITION - 200)) | (1L << (SUPER - 200)) | (1L << (TABLES - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (THAN - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UPGRADE - 264)) | (1L << (VALIDATION - 264)) | (1L << (VALUE - 264)) | (1L << (VIEW - 264)) | (1L << (WEIGHT_STRING - 264)) | (1L << (WITHOUT - 264)) | (1L << (VISIBLE - 264)) | (1L << (INVISIBLE - 264)) | (1L << (ENFORCED - 264)) | (1L << (LP_ - 264)))) != 0) || _la==IDENTIFIER_ );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				tableFactor();
				setState(669); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(668);
					joinTable();
					}
					}
					setState(671); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (CROSS - 125)) | (1L << (INNER - 125)) | (1L << (JOIN - 125)) | (1L << (LEFT - 125)))) != 0) || _la==NATURAL || _la==RIGHT || _la==STRAIGHT_JOIN );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(673);
				tableFactor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableFactorContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public IndexHintList_Context indexHintList_() {
			return getRuleContext(IndexHintList_Context.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tableFactor);
		int _la;
		try {
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				tableName();
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(677);
					match(PARTITION);
					setState(678);
					ignoredIdentifiers_();
					}
				}

				setState(685);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(682);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(681);
						match(AS);
						}
					}

					setState(684);
					alias();
					}
					break;
				}
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FORCE || _la==IGNORE || _la==USE) {
					{
					setState(687);
					indexHintList_();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				subquery();
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(691);
					match(AS);
					}
				}

				setState(694);
				alias();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(696);
				match(LP_);
				setState(697);
				tableReferences();
				setState(698);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexHintList_Context extends ParserRuleContext {
		public List<IndexHint_Context> indexHint_() {
			return getRuleContexts(IndexHint_Context.class);
		}
		public IndexHint_Context indexHint_(int i) {
			return getRuleContext(IndexHint_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public IndexHintList_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexHintList_; }
	}

	public final IndexHintList_Context indexHintList_() throws RecognitionException {
		IndexHintList_Context _localctx = new IndexHintList_Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_indexHintList_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			indexHint_();
			setState(707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(703);
					match(COMMA_);
					setState(704);
					indexHint_();
					}
					} 
				}
				setState(709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexHint_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode USE() { return getToken(MySQLStatementParser.USE, 0); }
		public TerminalNode IGNORE() { return getToken(MySQLStatementParser.IGNORE, 0); }
		public TerminalNode FORCE() { return getToken(MySQLStatementParser.FORCE, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public List<TerminalNode> FOR() { return getTokens(MySQLStatementParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(MySQLStatementParser.FOR, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public List<TerminalNode> JOIN() { return getTokens(MySQLStatementParser.JOIN); }
		public TerminalNode JOIN(int i) {
			return getToken(MySQLStatementParser.JOIN, i);
		}
		public List<TerminalNode> ORDER() { return getTokens(MySQLStatementParser.ORDER); }
		public TerminalNode ORDER(int i) {
			return getToken(MySQLStatementParser.ORDER, i);
		}
		public List<TerminalNode> BY() { return getTokens(MySQLStatementParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(MySQLStatementParser.BY, i);
		}
		public List<TerminalNode> GROUP() { return getTokens(MySQLStatementParser.GROUP); }
		public TerminalNode GROUP(int i) {
			return getToken(MySQLStatementParser.GROUP, i);
		}
		public IndexHint_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexHint_; }
	}

	public final IndexHint_Context indexHint_() throws RecognitionException {
		IndexHint_Context _localctx = new IndexHint_Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_indexHint_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			_la = _input.LA(1);
			if ( !(_la==FORCE || _la==IGNORE || _la==USE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(711);
			_la = _input.LA(1);
			if ( !(_la==KEY || _la==INDEX) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FOR) {
				{
				{
				setState(712);
				match(FOR);
				setState(718);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JOIN:
					{
					setState(713);
					match(JOIN);
					}
					break;
				case ORDER:
					{
					setState(714);
					match(ORDER);
					setState(715);
					match(BY);
					}
					break;
				case GROUP:
					{
					setState(716);
					match(GROUP);
					setState(717);
					match(BY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(725);
			match(LP_);
			setState(726);
			indexName();
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(727);
				match(COMMA_);
				setState(728);
				indexName();
				}
				}
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(734);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTableContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(MySQLStatementParser.JOIN, 0); }
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public JoinConditionContext joinCondition() {
			return getRuleContext(JoinConditionContext.class,0);
		}
		public TerminalNode INNER() { return getToken(MySQLStatementParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(MySQLStatementParser.CROSS, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(MySQLStatementParser.STRAIGHT_JOIN, 0); }
		public TerminalNode LEFT() { return getToken(MySQLStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(MySQLStatementParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLStatementParser.OUTER, 0); }
		public TerminalNode NATURAL() { return getToken(MySQLStatementParser.NATURAL, 0); }
		public JoinTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinTable; }
	}

	public final JoinTableContext joinTable() throws RecognitionException {
		JoinTableContext _localctx = new JoinTableContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_joinTable);
		int _la;
		try {
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CROSS || _la==INNER) {
					{
					setState(736);
					_la = _input.LA(1);
					if ( !(_la==CROSS || _la==INNER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(739);
				match(JOIN);
				setState(740);
				tableFactor();
				setState(742);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(741);
					joinCondition();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				match(STRAIGHT_JOIN);
				setState(745);
				tableFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(746);
				match(STRAIGHT_JOIN);
				setState(747);
				tableFactor();
				setState(748);
				joinCondition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(750);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(751);
					match(OUTER);
					}
				}

				setState(754);
				match(JOIN);
				setState(755);
				tableFactor();
				setState(756);
				joinCondition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(758);
				match(NATURAL);
				setState(762);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INNER:
					{
					setState(759);
					match(INNER);
					}
					break;
				case LEFT:
				case RIGHT:
					{
					setState(760);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					{
					setState(761);
					match(OUTER);
					}
					}
					break;
				case JOIN:
					break;
				default:
					break;
				}
				setState(764);
				match(JOIN);
				setState(765);
				tableFactor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinConditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public JoinConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCondition; }
	}

	public final JoinConditionContext joinCondition() throws RecognitionException {
		JoinConditionContext _localctx = new JoinConditionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_joinCondition);
		try {
			setState(772);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				match(ON);
				setState(769);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				match(USING);
				setState(771);
				columnNames();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(MySQLStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(WHERE);
			setState(775);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(MySQLStatementParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public TerminalNode ROLLUP() { return getToken(MySQLStatementParser.ROLLUP, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(GROUP);
			setState(778);
			match(BY);
			setState(779);
			orderByItem();
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(780);
				match(COMMA_);
				setState(781);
				orderByItem();
				}
				}
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(787);
				match(WITH);
				setState(788);
				match(ROLLUP);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(MySQLStatementParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(HAVING);
			setState(792);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(MySQLStatementParser.LIMIT, 0); }
		public List<RangeItem_Context> rangeItem_() {
			return getRuleContexts(RangeItem_Context.class);
		}
		public RangeItem_Context rangeItem_(int i) {
			return getRuleContext(RangeItem_Context.class,i);
		}
		public TerminalNode OFFSET() { return getToken(MySQLStatementParser.OFFSET, 0); }
		public TerminalNode COMMA_() { return getToken(MySQLStatementParser.COMMA_, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(LIMIT);
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(795);
				rangeItem_();
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(796);
					match(COMMA_);
					setState(797);
					rangeItem_();
					}
				}

				}
				break;
			case 2:
				{
				setState(800);
				rangeItem_();
				setState(801);
				match(OFFSET);
				setState(802);
				rangeItem_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeItem_Context extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public RangeItem_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeItem_; }
	}

	public final RangeItem_Context rangeItem_() throws RecognitionException {
		RangeItem_Context _localctx = new RangeItem_Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_rangeItem_);
		try {
			setState(808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				number();
				}
				break;
			case QUESTION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				question();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClause_Context extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(MySQLStatementParser.WINDOW, 0); }
		public List<WindowItem_Context> windowItem_() {
			return getRuleContexts(WindowItem_Context.class);
		}
		public WindowItem_Context windowItem_(int i) {
			return getRuleContext(WindowItem_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public WindowClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause_; }
	}

	public final WindowClause_Context windowClause_() throws RecognitionException {
		WindowClause_Context _localctx = new WindowClause_Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_windowClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(WINDOW);
			setState(811);
			windowItem_();
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(812);
				match(COMMA_);
				setState(813);
				windowItem_();
				}
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowItem_Context extends ParserRuleContext {
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public WindowItem_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowItem_; }
	}

	public final WindowItem_Context windowItem_() throws RecognitionException {
		WindowItem_Context _localctx = new WindowItem_Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_windowItem_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			ignoredIdentifier_();
			setState(820);
			match(AS);
			setState(821);
			match(LP_);
			setState(822);
			windowSpec();
			setState(823);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public UnionSelectContext unionSelect() {
			return getRuleContext(UnionSelectContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(LP_);
			setState(826);
			unionSelect();
			setState(827);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithClause_Context extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public List<CteClause_Context> cteClause_() {
			return getRuleContexts(CteClause_Context.class);
		}
		public CteClause_Context cteClause_(int i) {
			return getRuleContext(CteClause_Context.class,i);
		}
		public UnionSelectContext unionSelect() {
			return getRuleContext(UnionSelectContext.class,0);
		}
		public TerminalNode RECURSIVE() { return getToken(MySQLStatementParser.RECURSIVE, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public WithClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause_; }
	}

	public final WithClause_Context withClause_() throws RecognitionException {
		WithClause_Context _localctx = new WithClause_Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_withClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(WITH);
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(830);
				match(RECURSIVE);
				}
			}

			setState(833);
			cteClause_();
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(834);
				match(COMMA_);
				setState(835);
				cteClause_();
				}
				}
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(841);
			unionSelect();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CteClause_Context extends ParserRuleContext {
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public CteClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteClause_; }
	}

	public final CteClause_Context cteClause_() throws RecognitionException {
		CteClause_Context _localctx = new CteClause_Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_cteClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			ignoredIdentifier_();
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(844);
				columnNames();
				}
			}

			setState(847);
			match(AS);
			setState(848);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literals_Context extends ParserRuleContext {
		public TerminalNode BIT_NUM_() { return getToken(MySQLStatementParser.BIT_NUM_, 0); }
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode HEX_DIGIT_() { return getToken(MySQLStatementParser.HEX_DIGIT_, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public Literals_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals_; }
	}

	public final Literals_Context literals_() throws RecognitionException {
		Literals_Context _localctx = new Literals_Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_literals_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			_la = _input.LA(1);
			if ( !(((((_la - 339)) & ~0x3f) == 0 && ((1L << (_la - 339)) & ((1L << (STRING_ - 339)) | (1L << (NUMBER_ - 339)) | (1L << (HEX_DIGIT_ - 339)) | (1L << (BIT_NUM_ - 339)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(MySQLStatementParser.IDENTIFIER_, 0); }
		public UnreservedWord_Context unreservedWord_() {
			return getRuleContext(UnreservedWord_Context.class,0);
		}
		public Identifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_; }
	}

	public final Identifier_Context identifier_() throws RecognitionException {
		Identifier_Context _localctx = new Identifier_Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_identifier_);
		try {
			setState(854);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				match(IDENTIFIER_);
				}
				break;
			case ANY:
			case DATE:
			case ESCAPE:
			case OFFSET:
			case ROLLUP:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DAY:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				unreservedWord_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnreservedWord_Context extends ParserRuleContext {
		public TerminalNode ACCOUNT() { return getToken(MySQLStatementParser.ACCOUNT, 0); }
		public TerminalNode ACTION() { return getToken(MySQLStatementParser.ACTION, 0); }
		public TerminalNode AFTER() { return getToken(MySQLStatementParser.AFTER, 0); }
		public TerminalNode ALGORITHM() { return getToken(MySQLStatementParser.ALGORITHM, 0); }
		public TerminalNode ALWAYS() { return getToken(MySQLStatementParser.ALWAYS, 0); }
		public TerminalNode ANY() { return getToken(MySQLStatementParser.ANY, 0); }
		public TerminalNode AUTO_INCREMENT() { return getToken(MySQLStatementParser.AUTO_INCREMENT, 0); }
		public TerminalNode AVG_ROW_LENGTH() { return getToken(MySQLStatementParser.AVG_ROW_LENGTH, 0); }
		public TerminalNode BEGIN() { return getToken(MySQLStatementParser.BEGIN, 0); }
		public TerminalNode BTREE() { return getToken(MySQLStatementParser.BTREE, 0); }
		public TerminalNode CHAIN() { return getToken(MySQLStatementParser.CHAIN, 0); }
		public TerminalNode CHARSET() { return getToken(MySQLStatementParser.CHARSET, 0); }
		public TerminalNode CHECKSUM() { return getToken(MySQLStatementParser.CHECKSUM, 0); }
		public TerminalNode CIPHER() { return getToken(MySQLStatementParser.CIPHER, 0); }
		public TerminalNode CLIENT() { return getToken(MySQLStatementParser.CLIENT, 0); }
		public TerminalNode COALESCE() { return getToken(MySQLStatementParser.COALESCE, 0); }
		public TerminalNode COLUMNS() { return getToken(MySQLStatementParser.COLUMNS, 0); }
		public TerminalNode COLUMN_FORMAT() { return getToken(MySQLStatementParser.COLUMN_FORMAT, 0); }
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(MySQLStatementParser.COMMIT, 0); }
		public TerminalNode COMMITTED() { return getToken(MySQLStatementParser.COMMITTED, 0); }
		public TerminalNode COMPACT() { return getToken(MySQLStatementParser.COMPACT, 0); }
		public TerminalNode COMPRESSED() { return getToken(MySQLStatementParser.COMPRESSED, 0); }
		public TerminalNode COMPRESSION() { return getToken(MySQLStatementParser.COMPRESSION, 0); }
		public TerminalNode CONNECTION() { return getToken(MySQLStatementParser.CONNECTION, 0); }
		public TerminalNode CONSISTENT() { return getToken(MySQLStatementParser.CONSISTENT, 0); }
		public TerminalNode CURRENT() { return getToken(MySQLStatementParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(MySQLStatementParser.DATA, 0); }
		public TerminalNode DATE() { return getToken(MySQLStatementParser.DATE, 0); }
		public TerminalNode DAY() { return getToken(MySQLStatementParser.DAY, 0); }
		public TerminalNode DELAY_KEY_WRITE() { return getToken(MySQLStatementParser.DELAY_KEY_WRITE, 0); }
		public TerminalNode DISABLE() { return getToken(MySQLStatementParser.DISABLE, 0); }
		public TerminalNode DISCARD() { return getToken(MySQLStatementParser.DISCARD, 0); }
		public TerminalNode DISK() { return getToken(MySQLStatementParser.DISK, 0); }
		public TerminalNode DUPLICATE() { return getToken(MySQLStatementParser.DUPLICATE, 0); }
		public TerminalNode ENABLE() { return getToken(MySQLStatementParser.ENABLE, 0); }
		public TerminalNode ENCRYPTION() { return getToken(MySQLStatementParser.ENCRYPTION, 0); }
		public TerminalNode ENFORCED() { return getToken(MySQLStatementParser.ENFORCED, 0); }
		public TerminalNode END() { return getToken(MySQLStatementParser.END, 0); }
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public TerminalNode ESCAPE() { return getToken(MySQLStatementParser.ESCAPE, 0); }
		public TerminalNode EVENT() { return getToken(MySQLStatementParser.EVENT, 0); }
		public TerminalNode EXCHANGE() { return getToken(MySQLStatementParser.EXCHANGE, 0); }
		public TerminalNode EXECUTE() { return getToken(MySQLStatementParser.EXECUTE, 0); }
		public TerminalNode FILE() { return getToken(MySQLStatementParser.FILE, 0); }
		public TerminalNode FIRST() { return getToken(MySQLStatementParser.FIRST, 0); }
		public TerminalNode FIXED() { return getToken(MySQLStatementParser.FIXED, 0); }
		public TerminalNode FOLLOWING() { return getToken(MySQLStatementParser.FOLLOWING, 0); }
		public TerminalNode GLOBAL() { return getToken(MySQLStatementParser.GLOBAL, 0); }
		public TerminalNode HASH() { return getToken(MySQLStatementParser.HASH, 0); }
		public TerminalNode IMPORT_() { return getToken(MySQLStatementParser.IMPORT_, 0); }
		public TerminalNode INSERT_METHOD() { return getToken(MySQLStatementParser.INSERT_METHOD, 0); }
		public TerminalNode INVISIBLE() { return getToken(MySQLStatementParser.INVISIBLE, 0); }
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(MySQLStatementParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode LAST() { return getToken(MySQLStatementParser.LAST, 0); }
		public TerminalNode LESS() { return getToken(MySQLStatementParser.LESS, 0); }
		public TerminalNode LEVEL() { return getToken(MySQLStatementParser.LEVEL, 0); }
		public TerminalNode MAX_ROWS() { return getToken(MySQLStatementParser.MAX_ROWS, 0); }
		public TerminalNode MEMORY() { return getToken(MySQLStatementParser.MEMORY, 0); }
		public TerminalNode MIN_ROWS() { return getToken(MySQLStatementParser.MIN_ROWS, 0); }
		public TerminalNode MODIFY() { return getToken(MySQLStatementParser.MODIFY, 0); }
		public TerminalNode NO() { return getToken(MySQLStatementParser.NO, 0); }
		public TerminalNode NONE() { return getToken(MySQLStatementParser.NONE, 0); }
		public TerminalNode OFFSET() { return getToken(MySQLStatementParser.OFFSET, 0); }
		public TerminalNode PACK_KEYS() { return getToken(MySQLStatementParser.PACK_KEYS, 0); }
		public TerminalNode PARSER() { return getToken(MySQLStatementParser.PARSER, 0); }
		public TerminalNode PARTIAL() { return getToken(MySQLStatementParser.PARTIAL, 0); }
		public TerminalNode PARTITIONING() { return getToken(MySQLStatementParser.PARTITIONING, 0); }
		public TerminalNode PASSWORD() { return getToken(MySQLStatementParser.PASSWORD, 0); }
		public TerminalNode PERSIST() { return getToken(MySQLStatementParser.PERSIST, 0); }
		public TerminalNode PERSIST_ONLY() { return getToken(MySQLStatementParser.PERSIST_ONLY, 0); }
		public TerminalNode PRECEDING() { return getToken(MySQLStatementParser.PRECEDING, 0); }
		public TerminalNode PRIVILEGES() { return getToken(MySQLStatementParser.PRIVILEGES, 0); }
		public TerminalNode PROCESS() { return getToken(MySQLStatementParser.PROCESS, 0); }
		public TerminalNode PROXY() { return getToken(MySQLStatementParser.PROXY, 0); }
		public TerminalNode QUICK() { return getToken(MySQLStatementParser.QUICK, 0); }
		public TerminalNode REBUILD() { return getToken(MySQLStatementParser.REBUILD, 0); }
		public TerminalNode REDUNDANT() { return getToken(MySQLStatementParser.REDUNDANT, 0); }
		public TerminalNode RELOAD() { return getToken(MySQLStatementParser.RELOAD, 0); }
		public TerminalNode REMOVE() { return getToken(MySQLStatementParser.REMOVE, 0); }
		public TerminalNode REORGANIZE() { return getToken(MySQLStatementParser.REORGANIZE, 0); }
		public TerminalNode REPAIR() { return getToken(MySQLStatementParser.REPAIR, 0); }
		public TerminalNode REVERSE() { return getToken(MySQLStatementParser.REVERSE, 0); }
		public TerminalNode ROLLBACK() { return getToken(MySQLStatementParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(MySQLStatementParser.ROLLUP, 0); }
		public TerminalNode ROW_FORMAT() { return getToken(MySQLStatementParser.ROW_FORMAT, 0); }
		public TerminalNode SAVEPOINT() { return getToken(MySQLStatementParser.SAVEPOINT, 0); }
		public TerminalNode SESSION() { return getToken(MySQLStatementParser.SESSION, 0); }
		public TerminalNode SHUTDOWN() { return getToken(MySQLStatementParser.SHUTDOWN, 0); }
		public TerminalNode SIMPLE() { return getToken(MySQLStatementParser.SIMPLE, 0); }
		public TerminalNode SLAVE() { return getToken(MySQLStatementParser.SLAVE, 0); }
		public TerminalNode SOUNDS() { return getToken(MySQLStatementParser.SOUNDS, 0); }
		public TerminalNode SQL_BIG_RESULT() { return getToken(MySQLStatementParser.SQL_BIG_RESULT, 0); }
		public TerminalNode SQL_BUFFER_RESULT() { return getToken(MySQLStatementParser.SQL_BUFFER_RESULT, 0); }
		public TerminalNode SQL_CACHE() { return getToken(MySQLStatementParser.SQL_CACHE, 0); }
		public TerminalNode SQL_NO_CACHE() { return getToken(MySQLStatementParser.SQL_NO_CACHE, 0); }
		public TerminalNode START() { return getToken(MySQLStatementParser.START, 0); }
		public TerminalNode STATS_AUTO_RECALC() { return getToken(MySQLStatementParser.STATS_AUTO_RECALC, 0); }
		public TerminalNode STATS_PERSISTENT() { return getToken(MySQLStatementParser.STATS_PERSISTENT, 0); }
		public TerminalNode STATS_SAMPLE_PAGES() { return getToken(MySQLStatementParser.STATS_SAMPLE_PAGES, 0); }
		public TerminalNode STORAGE() { return getToken(MySQLStatementParser.STORAGE, 0); }
		public TerminalNode SUBPARTITION() { return getToken(MySQLStatementParser.SUBPARTITION, 0); }
		public TerminalNode SUPER() { return getToken(MySQLStatementParser.SUPER, 0); }
		public TerminalNode TABLES() { return getToken(MySQLStatementParser.TABLES, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(MySQLStatementParser.TEMPORARY, 0); }
		public TerminalNode THAN() { return getToken(MySQLStatementParser.THAN, 0); }
		public TerminalNode TIME() { return getToken(MySQLStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(MySQLStatementParser.TIMESTAMP, 0); }
		public TerminalNode TRANSACTION() { return getToken(MySQLStatementParser.TRANSACTION, 0); }
		public TerminalNode TRUNCATE() { return getToken(MySQLStatementParser.TRUNCATE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(MySQLStatementParser.UNBOUNDED, 0); }
		public TerminalNode UNKNOWN() { return getToken(MySQLStatementParser.UNKNOWN, 0); }
		public TerminalNode UPGRADE() { return getToken(MySQLStatementParser.UPGRADE, 0); }
		public TerminalNode VALIDATION() { return getToken(MySQLStatementParser.VALIDATION, 0); }
		public TerminalNode VALUE() { return getToken(MySQLStatementParser.VALUE, 0); }
		public TerminalNode VIEW() { return getToken(MySQLStatementParser.VIEW, 0); }
		public TerminalNode VISIBLE() { return getToken(MySQLStatementParser.VISIBLE, 0); }
		public TerminalNode WEIGHT_STRING() { return getToken(MySQLStatementParser.WEIGHT_STRING, 0); }
		public TerminalNode WITHOUT() { return getToken(MySQLStatementParser.WITHOUT, 0); }
		public UnreservedWord_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreservedWord_; }
	}

	public final UnreservedWord_Context unreservedWord_() throws RecognitionException {
		UnreservedWord_Context _localctx = new UnreservedWord_Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_unreservedWord_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DAY) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LEVEL - 70)) | (1L << (NO - 70)) | (1L << (PASSWORD - 70)) | (1L << (PRIVILEGES - 70)) | (1L << (ROLLBACK - 70)) | (1L << (START - 70)) | (1L << (TRANSACTION - 70)) | (1L << (TRUNCATE - 70)) | (1L << (ACCOUNT - 70)) | (1L << (ACTION - 70)) | (1L << (AFTER - 70)) | (1L << (ALGORITHM - 70)) | (1L << (AUTO_INCREMENT - 70)) | (1L << (AVG_ROW_LENGTH - 70)) | (1L << (BEGIN - 70)) | (1L << (BTREE - 70)) | (1L << (CHAIN - 70)) | (1L << (CHARSET - 70)) | (1L << (CHECKSUM - 70)) | (1L << (CIPHER - 70)) | (1L << (CLIENT - 70)) | (1L << (COALESCE - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN_FORMAT - 70)) | (1L << (COMMENT - 70)) | (1L << (COMPACT - 70)) | (1L << (COMPRESSED - 70)) | (1L << (COMPRESSION - 70)) | (1L << (CONNECTION - 70)) | (1L << (CONSISTENT - 70)) | (1L << (DATA - 70)) | (1L << (DELAY_KEY_WRITE - 70)) | (1L << (DISCARD - 70)) | (1L << (DISK - 70)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (DUPLICATE - 136)) | (1L << (ENCRYPTION - 136)) | (1L << (END - 136)) | (1L << (ENGINE - 136)) | (1L << (EVENT - 136)) | (1L << (EXCHANGE - 136)) | (1L << (EXECUTE - 136)) | (1L << (FILE - 136)) | (1L << (FIRST - 136)) | (1L << (FIXED - 136)) | (1L << (FOLLOWING - 136)) | (1L << (GLOBAL - 136)) | (1L << (HASH - 136)) | (1L << (IMPORT_ - 136)) | (1L << (INSERT_METHOD - 136)) | (1L << (KEY_BLOCK_SIZE - 136)) | (1L << (LAST - 136)) | (1L << (LESS - 136)) | (1L << (MAX_ROWS - 136)) | (1L << (MEMORY - 136)) | (1L << (MIN_ROWS - 136)) | (1L << (MODIFY - 136)) | (1L << (NONE - 136)) | (1L << (PACK_KEYS - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (PARSER - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITIONING - 200)) | (1L << (PERSIST - 200)) | (1L << (PERSIST_ONLY - 200)) | (1L << (PRECEDING - 200)) | (1L << (PROCESS - 200)) | (1L << (PROXY - 200)) | (1L << (QUICK - 200)) | (1L << (REBUILD - 200)) | (1L << (REDUNDANT - 200)) | (1L << (RELOAD - 200)) | (1L << (REMOVE - 200)) | (1L << (REORGANIZE - 200)) | (1L << (REPAIR - 200)) | (1L << (REVERSE - 200)) | (1L << (ROW_FORMAT - 200)) | (1L << (SAVEPOINT - 200)) | (1L << (SESSION - 200)) | (1L << (SHUTDOWN - 200)) | (1L << (SIMPLE - 200)) | (1L << (SLAVE - 200)) | (1L << (SQL_BIG_RESULT - 200)) | (1L << (SQL_BUFFER_RESULT - 200)) | (1L << (SQL_CACHE - 200)) | (1L << (SQL_NO_CACHE - 200)) | (1L << (STATS_AUTO_RECALC - 200)) | (1L << (STATS_PERSISTENT - 200)) | (1L << (STATS_SAMPLE_PAGES - 200)) | (1L << (STORAGE - 200)) | (1L << (SUBPARTITION - 200)) | (1L << (SUPER - 200)) | (1L << (TABLES - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (THAN - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UPGRADE - 264)) | (1L << (VALIDATION - 264)) | (1L << (VALUE - 264)) | (1L << (VIEW - 264)) | (1L << (WEIGHT_STRING - 264)) | (1L << (WITHOUT - 264)) | (1L << (VISIBLE - 264)) | (1L << (INVISIBLE - 264)) | (1L << (ENFORCED - 264)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameContext extends ParserRuleContext {
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode DOT_() { return getToken(MySQLStatementParser.DOT_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(858);
				identifier_();
				setState(859);
				match(DOT_);
				}
				break;
			}
			setState(863);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameContext extends ParserRuleContext {
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode DOT_() { return getToken(MySQLStatementParser.DOT_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(865);
				identifier_();
				setState(866);
				match(DOT_);
				}
				break;
			}
			setState(870);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNamesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(LP_);
			setState(873);
			columnName();
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(874);
				match(COMMA_);
				setState(875);
				columnName();
				}
				}
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(881);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexNameContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(MySQLStatementParser.NOT_, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode AND() { return getToken(MySQLStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(MySQLStatementParser.AND_, 0); }
		public TerminalNode OR() { return getToken(MySQLStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(MySQLStatementParser.OR_, 0); }
		public TerminalNode XOR() { return getToken(MySQLStatementParser.XOR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(886);
				match(LP_);
				setState(887);
				expr(0);
				setState(888);
				match(RP_);
				}
				break;
			case 2:
				{
				setState(890);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==NOT_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(891);
				expr(2);
				}
				break;
			case 3:
				{
				setState(892);
				booleanPrimary(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(912);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(910);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(895);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(896);
						match(AND);
						setState(897);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(898);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(899);
						match(AND_);
						setState(900);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(901);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(902);
						match(OR);
						setState(903);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(904);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(905);
						match(OR_);
						setState(906);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(907);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(908);
						match(XOR);
						setState(909);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(914);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BooleanPrimaryContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(MySQLStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(MySQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MySQLStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(MySQLStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(MySQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(MySQLStatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(MySQLStatementParser.ANY, 0); }
		public BooleanPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary; }
	}

	public final BooleanPrimaryContext booleanPrimary() throws RecognitionException {
		return booleanPrimary(0);
	}

	private BooleanPrimaryContext booleanPrimary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanPrimaryContext _localctx = new BooleanPrimaryContext(_ctx, _parentState);
		BooleanPrimaryContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(916);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(938);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(936);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(918);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(919);
						match(IS);
						setState(921);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(920);
							match(NOT);
							}
						}

						setState(923);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NULL) | (1L << TRUE) | (1L << UNKNOWN))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(924);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(925);
						match(SAFE_EQ_);
						setState(926);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(927);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(928);
						comparisonOperator();
						setState(929);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(931);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(932);
						comparisonOperator();
						setState(933);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(934);
						subquery();
						}
						break;
					}
					} 
				}
				setState(940);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(MySQLStatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(MySQLStatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(MySQLStatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(MySQLStatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(MySQLStatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			_la = _input.LA(1);
			if ( !(((((_la - 316)) & ~0x3f) == 0 && ((1L << (_la - 316)) & ((1L << (EQ_ - 316)) | (1L << (NEQ_ - 316)) | (1L << (GT_ - 316)) | (1L << (GTE_ - 316)) | (1L << (LT_ - 316)) | (1L << (LTE_ - 316)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(MySQLStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(MySQLStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SOUNDS() { return getToken(MySQLStatementParser.SOUNDS, 0); }
		public TerminalNode LIKE() { return getToken(MySQLStatementParser.LIKE, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(MySQLStatementParser.ESCAPE, 0); }
		public TerminalNode REGEXP() { return getToken(MySQLStatementParser.REGEXP, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_predicate);
		int _la;
		try {
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(943);
				bitExpr(0);
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(944);
					match(NOT);
					}
				}

				setState(947);
				match(IN);
				setState(948);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				bitExpr(0);
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(951);
					match(NOT);
					}
				}

				setState(954);
				match(IN);
				setState(955);
				match(LP_);
				setState(956);
				expr(0);
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(957);
					match(COMMA_);
					setState(958);
					expr(0);
					}
					}
					setState(963);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(964);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				bitExpr(0);
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(967);
					match(NOT);
					}
				}

				setState(970);
				match(BETWEEN);
				setState(971);
				bitExpr(0);
				setState(972);
				match(AND);
				setState(973);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(975);
				bitExpr(0);
				setState(976);
				match(SOUNDS);
				setState(977);
				match(LIKE);
				setState(978);
				bitExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(980);
				bitExpr(0);
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(981);
					match(NOT);
					}
				}

				setState(984);
				match(LIKE);
				setState(985);
				simpleExpr(0);
				setState(988);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(986);
					match(ESCAPE);
					setState(987);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(990);
				bitExpr(0);
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(991);
					match(NOT);
					}
				}

				setState(994);
				match(REGEXP);
				setState(995);
				bitExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(997);
				bitExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitExprContext extends ParserRuleContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode VERTICAL_BAR_() { return getToken(MySQLStatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(MySQLStatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(MySQLStatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(MySQLStatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(MySQLStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(MySQLStatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(MySQLStatementParser.SLASH_, 0); }
		public TerminalNode DIV() { return getToken(MySQLStatementParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MySQLStatementParser.MOD, 0); }
		public TerminalNode MOD_() { return getToken(MySQLStatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(MySQLStatementParser.CARET_, 0); }
		public IntervalExprContext intervalExpr() {
			return getRuleContext(IntervalExprContext.class,0);
		}
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		return bitExpr(0);
	}

	private BitExprContext bitExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitExprContext _localctx = new BitExprContext(_ctx, _parentState);
		BitExprContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1001);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1047);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1045);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1003);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1004);
						match(VERTICAL_BAR_);
						setState(1005);
						bitExpr(16);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1006);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1007);
						match(AMPERSAND_);
						setState(1008);
						bitExpr(15);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1009);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1010);
						match(SIGNED_LEFT_SHIFT_);
						setState(1011);
						bitExpr(14);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1012);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1013);
						match(SIGNED_RIGHT_SHIFT_);
						setState(1014);
						bitExpr(13);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1015);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1016);
						match(PLUS_);
						setState(1017);
						bitExpr(12);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1018);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1019);
						match(MINUS_);
						setState(1020);
						bitExpr(11);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1021);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1022);
						match(ASTERISK_);
						setState(1023);
						bitExpr(10);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1024);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1025);
						match(SLASH_);
						setState(1026);
						bitExpr(9);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1027);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1028);
						match(DIV);
						setState(1029);
						bitExpr(8);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1030);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1031);
						match(MOD);
						setState(1032);
						bitExpr(7);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1033);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1034);
						match(MOD_);
						setState(1035);
						bitExpr(6);
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1036);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1037);
						match(CARET_);
						setState(1038);
						bitExpr(5);
						}
						break;
					case 13:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1039);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1040);
						match(PLUS_);
						setState(1041);
						intervalExpr();
						}
						break;
					case 14:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1042);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1043);
						match(MINUS_);
						setState(1044);
						intervalExpr();
						}
						break;
					}
					} 
				}
				setState(1049);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimpleExprContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode PLUS_() { return getToken(MySQLStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(MySQLStatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(MySQLStatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(MySQLStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(MySQLStatementParser.BINARY, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode ROW() { return getToken(MySQLStatementParser.ROW, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public CaseExprContext caseExpr() {
			return getRuleContext(CaseExprContext.class,0);
		}
		public IntervalExprContext intervalExpr() {
			return getRuleContext(IntervalExprContext.class,0);
		}
		public TerminalNode AND_() { return getToken(MySQLStatementParser.AND_, 0); }
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		return simpleExpr(0);
	}

	private SimpleExprContext simpleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, _parentState);
		SimpleExprContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1051);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1052);
				literal();
				}
				break;
			case 3:
				{
				setState(1053);
				columnName();
				}
				break;
			case 4:
				{
				setState(1054);
				variable();
				}
				break;
			case 5:
				{
				setState(1055);
				_la = _input.LA(1);
				if ( !(_la==BINARY || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (NOT_ - 298)) | (1L << (TILDE_ - 298)) | (1L << (PLUS_ - 298)) | (1L << (MINUS_ - 298)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1056);
				simpleExpr(5);
				}
				break;
			case 6:
				{
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1057);
					match(ROW);
					}
				}

				setState(1060);
				match(LP_);
				setState(1061);
				expr(0);
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1062);
					match(COMMA_);
					setState(1063);
					expr(0);
					}
					}
					setState(1068);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1069);
				match(RP_);
				}
				break;
			case 7:
				{
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS) {
					{
					setState(1071);
					match(EXISTS);
					}
				}

				setState(1074);
				subquery();
				}
				break;
			case 8:
				{
				setState(1075);
				caseExpr();
				}
				break;
			case 9:
				{
				setState(1076);
				intervalExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1086);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1084);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1079);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1080);
						match(AND_);
						setState(1081);
						simpleExpr(7);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1082);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1083);
						collateClause_();
						}
						break;
					}
					} 
				}
				setState(1088);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public SpecialFunctionContext specialFunction() {
			return getRuleContext(SpecialFunctionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_functionCall);
		int _la;
		try {
			setState(1108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1089);
				functionName();
				setState(1090);
				match(LP_);
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(1091);
					distinct();
					}
				}

				setState(1103);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
				case BINARY:
				case DATE:
				case ESCAPE:
				case EXISTS:
				case FALSE:
				case NOT:
				case NULL:
				case OFFSET:
				case ROLLUP:
				case ROW:
				case SOUNDS:
				case TIME:
				case TIMESTAMP:
				case TRUE:
				case UNKNOWN:
				case ALWAYS:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case DAY:
				case DISABLE:
				case ENABLE:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ROLLBACK:
				case START:
				case TRANSACTION:
				case TRUNCATE:
				case ACCOUNT:
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BTREE:
				case CASE:
				case CAST:
				case CHAIN:
				case CHAR:
				case CHARACTER:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case CONVERT:
				case CURRENT_TIMESTAMP:
				case DATA:
				case DELAY_KEY_WRITE:
				case DISCARD:
				case DISK:
				case DUPLICATE:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case EXTRACT:
				case FILE:
				case FIRST:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case GROUP_CONCAT:
				case HASH:
				case IF:
				case IMPORT_:
				case INSERT_METHOD:
				case INTERVAL:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LESS:
				case LOCALTIME:
				case LOCALTIMESTAMP:
				case MAX_ROWS:
				case MEMORY:
				case MIN_ROWS:
				case MODIFY:
				case NONE:
				case NOW:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PERSIST_ONLY:
				case POSITION:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REPLACE:
				case REVERSE:
				case ROW_FORMAT:
				case SAVEPOINT:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUPER:
				case SUBSTR:
				case SUBSTRING:
				case TABLES:
				case TABLESPACE:
				case TEMPORARY:
				case THAN:
				case TRIM:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case VALUE:
				case VIEW:
				case WEIGHT_STRING:
				case WITHOUT:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case NOT_:
				case TILDE_:
				case PLUS_:
				case MINUS_:
				case DOT_:
				case LP_:
				case LBE_:
				case QUESTION_:
				case AT_:
				case IDENTIFIER_:
				case STRING_:
				case NUMBER_:
				case HEX_DIGIT_:
				case BIT_NUM_:
					{
					setState(1094);
					expr(0);
					setState(1099);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA_) {
						{
						{
						setState(1095);
						match(COMMA_);
						setState(1096);
						expr(0);
						}
						}
						setState(1101);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ASTERISK_:
					{
					setState(1102);
					match(ASTERISK_);
					}
					break;
				case RP_:
					break;
				default:
					break;
				}
				setState(1105);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1107);
				specialFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(MySQLStatementParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(MySQLStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(MySQLStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode NOW() { return getToken(MySQLStatementParser.NOW, 0); }
		public TerminalNode REPLACE() { return getToken(MySQLStatementParser.REPLACE, 0); }
		public TerminalNode CAST() { return getToken(MySQLStatementParser.CAST, 0); }
		public TerminalNode CONVERT() { return getToken(MySQLStatementParser.CONVERT, 0); }
		public TerminalNode POSITION() { return getToken(MySQLStatementParser.POSITION, 0); }
		public TerminalNode CHARSET() { return getToken(MySQLStatementParser.CHARSET, 0); }
		public TerminalNode CHAR() { return getToken(MySQLStatementParser.CHAR, 0); }
		public TerminalNode TRIM() { return getToken(MySQLStatementParser.TRIM, 0); }
		public TerminalNode WEIGHT_STRING() { return getToken(MySQLStatementParser.WEIGHT_STRING, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_functionName);
		try {
			setState(1124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1110);
				identifier_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1111);
				match(IF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1112);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1113);
				match(LOCALTIME);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1114);
				match(LOCALTIMESTAMP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1115);
				match(NOW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1116);
				match(REPLACE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1117);
				match(CAST);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1118);
				match(CONVERT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1119);
				match(POSITION);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1120);
				match(CHARSET);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1121);
				match(CHAR);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1122);
				match(TRIM);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1123);
				match(WEIGHT_STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialFunctionContext extends ParserRuleContext {
		public GroupConcatContext groupConcat() {
			return getRuleContext(GroupConcatContext.class,0);
		}
		public WindowFunctionContext windowFunction() {
			return getRuleContext(WindowFunctionContext.class,0);
		}
		public CastFunctionContext castFunction() {
			return getRuleContext(CastFunctionContext.class,0);
		}
		public ConvertFunctionContext convertFunction() {
			return getRuleContext(ConvertFunctionContext.class,0);
		}
		public PositionFunctionContext positionFunction() {
			return getRuleContext(PositionFunctionContext.class,0);
		}
		public SubstringFunctionContext substringFunction() {
			return getRuleContext(SubstringFunctionContext.class,0);
		}
		public ExtractFunctionContext extractFunction() {
			return getRuleContext(ExtractFunctionContext.class,0);
		}
		public CharFunctionContext charFunction() {
			return getRuleContext(CharFunctionContext.class,0);
		}
		public TrimFunctionContext trimFunction() {
			return getRuleContext(TrimFunctionContext.class,0);
		}
		public WeightStringFunctionContext weightStringFunction() {
			return getRuleContext(WeightStringFunctionContext.class,0);
		}
		public SpecialFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunction; }
	}

	public final SpecialFunctionContext specialFunction() throws RecognitionException {
		SpecialFunctionContext _localctx = new SpecialFunctionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_specialFunction);
		try {
			setState(1136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126);
				groupConcat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127);
				windowFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1128);
				castFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1129);
				convertFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1130);
				positionFunction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1131);
				substringFunction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1132);
				extractFunction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1133);
				charFunction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1134);
				trimFunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1135);
				weightStringFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistinctContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(MySQLStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			match(DISTINCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExprContext extends ParserRuleContext {
		public CaseCondContext caseCond() {
			return getRuleContext(CaseCondContext.class,0);
		}
		public CaseCompContext caseComp() {
			return getRuleContext(CaseCompContext.class,0);
		}
		public CaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpr; }
	}

	public final CaseExprContext caseExpr() throws RecognitionException {
		CaseExprContext _localctx = new CaseExprContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_caseExpr);
		try {
			setState(1142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1140);
				caseCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1141);
				caseComp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseCompContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(MySQLStatementParser.CASE, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode END() { return getToken(MySQLStatementParser.END, 0); }
		public List<CaseWhenCompContext> caseWhenComp() {
			return getRuleContexts(CaseWhenCompContext.class);
		}
		public CaseWhenCompContext caseWhenComp(int i) {
			return getRuleContext(CaseWhenCompContext.class,i);
		}
		public ElseResultContext elseResult() {
			return getRuleContext(ElseResultContext.class,0);
		}
		public CaseCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseComp; }
	}

	public final CaseCompContext caseComp() throws RecognitionException {
		CaseCompContext _localctx = new CaseCompContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_caseComp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(CASE);
			setState(1145);
			simpleExpr(0);
			setState(1147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1146);
				caseWhenComp();
				}
				}
				setState(1149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1151);
				elseResult();
				}
			}

			setState(1154);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseWhenCompContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(MySQLStatementParser.WHEN, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MySQLStatementParser.THEN, 0); }
		public CaseResultContext caseResult() {
			return getRuleContext(CaseResultContext.class,0);
		}
		public CaseWhenCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhenComp; }
	}

	public final CaseWhenCompContext caseWhenComp() throws RecognitionException {
		CaseWhenCompContext _localctx = new CaseWhenCompContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_caseWhenComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			match(WHEN);
			setState(1157);
			simpleExpr(0);
			setState(1158);
			match(THEN);
			setState(1159);
			caseResult();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseCondContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(MySQLStatementParser.CASE, 0); }
		public TerminalNode END() { return getToken(MySQLStatementParser.END, 0); }
		public List<WhenResultContext> whenResult() {
			return getRuleContexts(WhenResultContext.class);
		}
		public WhenResultContext whenResult(int i) {
			return getRuleContext(WhenResultContext.class,i);
		}
		public ElseResultContext elseResult() {
			return getRuleContext(ElseResultContext.class,0);
		}
		public CaseCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseCond; }
	}

	public final CaseCondContext caseCond() throws RecognitionException {
		CaseCondContext _localctx = new CaseCondContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_caseCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			match(CASE);
			setState(1163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1162);
				whenResult();
				}
				}
				setState(1165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(1168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1167);
				elseResult();
				}
			}

			setState(1170);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenResultContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(MySQLStatementParser.WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MySQLStatementParser.THEN, 0); }
		public CaseResultContext caseResult() {
			return getRuleContext(CaseResultContext.class,0);
		}
		public WhenResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenResult; }
	}

	public final WhenResultContext whenResult() throws RecognitionException {
		WhenResultContext _localctx = new WhenResultContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_whenResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			match(WHEN);
			setState(1173);
			expr(0);
			setState(1174);
			match(THEN);
			setState(1175);
			caseResult();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseResultContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MySQLStatementParser.ELSE, 0); }
		public CaseResultContext caseResult() {
			return getRuleContext(CaseResultContext.class,0);
		}
		public ElseResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseResult; }
	}

	public final ElseResultContext elseResult() throws RecognitionException {
		ElseResultContext _localctx = new ElseResultContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_elseResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			match(ELSE);
			setState(1178);
			caseResult();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseResultContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseResult; }
	}

	public final CaseResultContext caseResult() throws RecognitionException {
		CaseResultContext _localctx = new CaseResultContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_caseResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalExprContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(MySQLStatementParser.INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public IntervalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpr; }
	}

	public final IntervalExprContext intervalExpr() throws RecognitionException {
		IntervalExprContext _localctx = new IntervalExprContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_intervalExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(INTERVAL);
			setState(1183);
			expr(0);
			setState(1184);
			ignoredIdentifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public List<TerminalNode> AT_() { return getTokens(MySQLStatementParser.AT_); }
		public TerminalNode AT_(int i) {
			return getToken(MySQLStatementParser.AT_, i);
		}
		public TerminalNode DOT_() { return getToken(MySQLStatementParser.DOT_, 0); }
		public TerminalNode GLOBAL() { return getToken(MySQLStatementParser.GLOBAL, 0); }
		public TerminalNode PERSIST() { return getToken(MySQLStatementParser.PERSIST, 0); }
		public TerminalNode PERSIST_ONLY() { return getToken(MySQLStatementParser.PERSIST_ONLY, 0); }
		public TerminalNode SESSION() { return getToken(MySQLStatementParser.SESSION, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_) {
				{
				setState(1186);
				match(AT_);
				setState(1187);
				match(AT_);
				}
			}

			setState(1191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1190);
				_la = _input.LA(1);
				if ( !(((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & ((1L << (GLOBAL - 158)) | (1L << (PERSIST - 158)) | (1L << (PERSIST_ONLY - 158)))) != 0) || _la==SESSION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_) {
				{
				setState(1193);
				match(DOT_);
				}
			}

			setState(1196);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(MySQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MySQLStatementParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(MySQLStatementParser.NULL, 0); }
		public TerminalNode LBE_() { return getToken(MySQLStatementParser.LBE_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode RBE_() { return getToken(MySQLStatementParser.RBE_, 0); }
		public TerminalNode HEX_DIGIT_() { return getToken(MySQLStatementParser.HEX_DIGIT_, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public TerminalNode DATE() { return getToken(MySQLStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(MySQLStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(MySQLStatementParser.TIMESTAMP, 0); }
		public TerminalNode BIT_NUM_() { return getToken(MySQLStatementParser.BIT_NUM_, 0); }
		public CharacterSet_Context characterSet_() {
			return getRuleContext(CharacterSet_Context.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_literal);
		int _la;
		try {
			setState(1224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1198);
				question();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1200);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1201);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1202);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1203);
				match(LBE_);
				setState(1204);
				identifier_();
				setState(1205);
				match(STRING_);
				setState(1206);
				match(RBE_);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1208);
				match(HEX_DIGIT_);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1209);
				string();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1210);
				identifier_();
				setState(1211);
				match(STRING_);
				setState(1213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1212);
					collateClause_();
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1215);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATE) | (1L << TIME) | (1L << TIMESTAMP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1216);
				match(STRING_);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (CHAR - 106)) | (1L << (CHARACTER - 106)) | (1L << (CHARSET - 106)))) != 0)) {
					{
					setState(1217);
					characterSet_();
					}
				}

				setState(1220);
				match(BIT_NUM_);
				setState(1222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1221);
					collateClause_();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuestionContext extends ParserRuleContext {
		public TerminalNode QUESTION_() { return getToken(MySQLStatementParser.QUESTION_, 0); }
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			match(QUESTION_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			match(NUMBER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(MySQLStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			match(ORDER);
			setState(1233);
			match(BY);
			setState(1234);
			orderByItem();
			setState(1239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1235);
				match(COMMA_);
				setState(1236);
				orderByItem();
				}
				}
				setState(1241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(MySQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MySQLStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1242);
				columnName();
				}
				break;
			case 2:
				{
				setState(1243);
				number();
				}
				break;
			case 3:
				{
				setState(1244);
				expr(0);
				}
				break;
			}
			setState(1248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1247);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupConcatContext extends ParserRuleContext {
		public TerminalNode GROUP_CONCAT() { return getToken(MySQLStatementParser.GROUP_CONCAT, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode SEPARATOR() { return getToken(MySQLStatementParser.SEPARATOR, 0); }
		public GroupConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupConcat; }
	}

	public final GroupConcatContext groupConcat() throws RecognitionException {
		GroupConcatContext _localctx = new GroupConcatContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_groupConcat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			match(GROUP_CONCAT);
			setState(1251);
			match(LP_);
			setState(1253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1252);
				distinct();
				}
			}

			setState(1264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case BINARY:
			case DATE:
			case ESCAPE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case OFFSET:
			case ROLLUP:
			case ROW:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DAY:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CASE:
			case CAST:
			case CHAIN:
			case CHAR:
			case CHARACTER:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case EXTRACT:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case GROUP_CONCAT:
			case HASH:
			case IF:
			case IMPORT_:
			case INSERT_METHOD:
			case INTERVAL:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case NOW:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case POSITION:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPLACE:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case SUBSTR:
			case SUBSTRING:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case TRIM:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1255);
				expr(0);
				setState(1260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1256);
					match(COMMA_);
					setState(1257);
					expr(0);
					}
					}
					setState(1262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1263);
				match(ASTERISK_);
				}
				break;
			case ORDER:
			case RP_:
				break;
			default:
				break;
			}
			setState(1271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1266);
				orderByClause();
				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARATOR) {
					{
					setState(1267);
					match(SEPARATOR);
					setState(1268);
					expr(0);
					}
				}

				}
			}

			setState(1273);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastFunctionContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(MySQLStatementParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public CastFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction; }
	}

	public final CastFunctionContext castFunction() throws RecognitionException {
		CastFunctionContext _localctx = new CastFunctionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_castFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			match(CAST);
			setState(1276);
			match(LP_);
			setState(1277);
			expr(0);
			setState(1278);
			match(AS);
			setState(1279);
			dataType();
			setState(1280);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConvertFunctionContext extends ParserRuleContext {
		public TerminalNode CONVERT() { return getToken(MySQLStatementParser.CONVERT, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConvertFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convertFunction; }
	}

	public final ConvertFunctionContext convertFunction() throws RecognitionException {
		ConvertFunctionContext _localctx = new ConvertFunctionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_convertFunction);
		try {
			setState(1296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1282);
				match(CONVERT);
				setState(1283);
				match(LP_);
				setState(1284);
				expr(0);
				setState(1285);
				match(COMMA_);
				setState(1286);
				dataType();
				setState(1287);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1289);
				match(CONVERT);
				setState(1290);
				match(LP_);
				setState(1291);
				expr(0);
				setState(1292);
				match(USING);
				setState(1293);
				ignoredIdentifier_();
				setState(1294);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PositionFunctionContext extends ParserRuleContext {
		public TerminalNode POSITION() { return getToken(MySQLStatementParser.POSITION, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public PositionFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionFunction; }
	}

	public final PositionFunctionContext positionFunction() throws RecognitionException {
		PositionFunctionContext _localctx = new PositionFunctionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_positionFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			match(POSITION);
			setState(1299);
			match(LP_);
			setState(1300);
			expr(0);
			setState(1301);
			match(IN);
			setState(1302);
			expr(0);
			setState(1303);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubstringFunctionContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(MySQLStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(MySQLStatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode SUBSTRING() { return getToken(MySQLStatementParser.SUBSTRING, 0); }
		public TerminalNode SUBSTR() { return getToken(MySQLStatementParser.SUBSTR, 0); }
		public TerminalNode FOR() { return getToken(MySQLStatementParser.FOR, 0); }
		public SubstringFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substringFunction; }
	}

	public final SubstringFunctionContext substringFunction() throws RecognitionException {
		SubstringFunctionContext _localctx = new SubstringFunctionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_substringFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			_la = _input.LA(1);
			if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1306);
			match(LP_);
			setState(1307);
			expr(0);
			setState(1308);
			match(FROM);
			setState(1309);
			match(NUMBER_);
			setState(1312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(1310);
				match(FOR);
				setState(1311);
				match(NUMBER_);
				}
			}

			setState(1314);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtractFunctionContext extends ParserRuleContext {
		public TerminalNode EXTRACT() { return getToken(MySQLStatementParser.EXTRACT, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public ExtractFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractFunction; }
	}

	public final ExtractFunctionContext extractFunction() throws RecognitionException {
		ExtractFunctionContext _localctx = new ExtractFunctionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_extractFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			match(EXTRACT);
			setState(1317);
			match(LP_);
			setState(1318);
			identifier_();
			setState(1319);
			match(FROM);
			setState(1320);
			expr(0);
			setState(1321);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharFunctionContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(MySQLStatementParser.CHAR, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public CharFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charFunction; }
	}

	public final CharFunctionContext charFunction() throws RecognitionException {
		CharFunctionContext _localctx = new CharFunctionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_charFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
			match(CHAR);
			setState(1324);
			match(LP_);
			setState(1325);
			expr(0);
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1326);
				match(COMMA_);
				setState(1327);
				expr(0);
				}
				}
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1333);
				match(USING);
				setState(1334);
				ignoredIdentifier_();
				}
			}

			setState(1337);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrimFunctionContext extends ParserRuleContext {
		public TerminalNode TRIM() { return getToken(MySQLStatementParser.TRIM, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(MySQLStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(MySQLStatementParser.STRING_, i);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode LEADING() { return getToken(MySQLStatementParser.LEADING, 0); }
		public TerminalNode BOTH() { return getToken(MySQLStatementParser.BOTH, 0); }
		public TerminalNode TRAILING() { return getToken(MySQLStatementParser.TRAILING, 0); }
		public TrimFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trimFunction; }
	}

	public final TrimFunctionContext trimFunction() throws RecognitionException {
		TrimFunctionContext _localctx = new TrimFunctionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_trimFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339);
			match(TRIM);
			setState(1340);
			match(LP_);
			setState(1341);
			_la = _input.LA(1);
			if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1342);
			match(STRING_);
			setState(1343);
			match(FROM);
			setState(1344);
			match(STRING_);
			setState(1345);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WeightStringFunctionContext extends ParserRuleContext {
		public TerminalNode WEIGHT_STRING() { return getToken(MySQLStatementParser.WEIGHT_STRING, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public LevelClauseContext levelClause() {
			return getRuleContext(LevelClauseContext.class,0);
		}
		public WeightStringFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weightStringFunction; }
	}

	public final WeightStringFunctionContext weightStringFunction() throws RecognitionException {
		WeightStringFunctionContext _localctx = new WeightStringFunctionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_weightStringFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			match(WEIGHT_STRING);
			setState(1348);
			match(LP_);
			setState(1349);
			expr(0);
			setState(1352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1350);
				match(AS);
				setState(1351);
				dataType();
				}
			}

			setState(1355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEVEL) {
				{
				setState(1354);
				levelClause();
				}
			}

			setState(1357);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LevelClauseContext extends ParserRuleContext {
		public TerminalNode LEVEL() { return getToken(MySQLStatementParser.LEVEL, 0); }
		public LevelInWeightListElementsContext levelInWeightListElements() {
			return getRuleContext(LevelInWeightListElementsContext.class,0);
		}
		public List<TerminalNode> NUMBER_() { return getTokens(MySQLStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(MySQLStatementParser.NUMBER_, i);
		}
		public TerminalNode MINUS_() { return getToken(MySQLStatementParser.MINUS_, 0); }
		public LevelClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelClause; }
	}

	public final LevelClauseContext levelClause() throws RecognitionException {
		LevelClauseContext _localctx = new LevelClauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_levelClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			match(LEVEL);
			setState(1364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1360);
				levelInWeightListElements();
				}
				break;
			case 2:
				{
				{
				setState(1361);
				match(NUMBER_);
				setState(1362);
				match(MINUS_);
				setState(1363);
				match(NUMBER_);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LevelInWeightListElementsContext extends ParserRuleContext {
		public List<LevelInWeightListElementContext> levelInWeightListElement() {
			return getRuleContexts(LevelInWeightListElementContext.class);
		}
		public LevelInWeightListElementContext levelInWeightListElement(int i) {
			return getRuleContext(LevelInWeightListElementContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public LevelInWeightListElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelInWeightListElements; }
	}

	public final LevelInWeightListElementsContext levelInWeightListElements() throws RecognitionException {
		LevelInWeightListElementsContext _localctx = new LevelInWeightListElementsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_levelInWeightListElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			levelInWeightListElement();
			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1367);
				match(COMMA_);
				setState(1368);
				levelInWeightListElement();
				}
				}
				setState(1373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LevelInWeightListElementContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode REVERSE() { return getToken(MySQLStatementParser.REVERSE, 0); }
		public TerminalNode ASC() { return getToken(MySQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MySQLStatementParser.DESC, 0); }
		public LevelInWeightListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelInWeightListElement; }
	}

	public final LevelInWeightListElementContext levelInWeightListElement() throws RecognitionException {
		LevelInWeightListElementContext _localctx = new LevelInWeightListElementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_levelInWeightListElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			match(NUMBER_);
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1375);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REVERSE) {
				{
				setState(1378);
				match(REVERSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFunctionContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public OverClauseContext overClause() {
			return getRuleContext(OverClauseContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public WindowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunction; }
	}

	public final WindowFunctionContext windowFunction() throws RecognitionException {
		WindowFunctionContext _localctx = new WindowFunctionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_windowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			identifier_();
			setState(1382);
			match(LP_);
			setState(1383);
			expr(0);
			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1384);
				match(COMMA_);
				setState(1385);
				expr(0);
				}
				}
				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1391);
			match(RP_);
			setState(1392);
			overClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverClauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(MySQLStatementParser.OVER, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public OverClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overClause; }
	}

	public final OverClauseContext overClause() throws RecognitionException {
		OverClauseContext _localctx = new OverClauseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_overClause);
		try {
			setState(1401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1394);
				match(OVER);
				setState(1395);
				match(LP_);
				setState(1396);
				windowSpec();
				setState(1397);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1399);
				match(OVER);
				setState(1400);
				identifier_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public WindowPartitionClauseContext windowPartitionClause() {
			return getRuleContext(WindowPartitionClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public FrameClauseContext frameClause() {
			return getRuleContext(FrameClauseContext.class,0);
		}
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_windowSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DAY) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LEVEL - 70)) | (1L << (NO - 70)) | (1L << (PASSWORD - 70)) | (1L << (PRIVILEGES - 70)) | (1L << (ROLLBACK - 70)) | (1L << (START - 70)) | (1L << (TRANSACTION - 70)) | (1L << (TRUNCATE - 70)) | (1L << (ACCOUNT - 70)) | (1L << (ACTION - 70)) | (1L << (AFTER - 70)) | (1L << (ALGORITHM - 70)) | (1L << (AUTO_INCREMENT - 70)) | (1L << (AVG_ROW_LENGTH - 70)) | (1L << (BEGIN - 70)) | (1L << (BTREE - 70)) | (1L << (CHAIN - 70)) | (1L << (CHARSET - 70)) | (1L << (CHECKSUM - 70)) | (1L << (CIPHER - 70)) | (1L << (CLIENT - 70)) | (1L << (COALESCE - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN_FORMAT - 70)) | (1L << (COMMENT - 70)) | (1L << (COMPACT - 70)) | (1L << (COMPRESSED - 70)) | (1L << (COMPRESSION - 70)) | (1L << (CONNECTION - 70)) | (1L << (CONSISTENT - 70)) | (1L << (DATA - 70)) | (1L << (DELAY_KEY_WRITE - 70)) | (1L << (DISCARD - 70)) | (1L << (DISK - 70)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (DUPLICATE - 136)) | (1L << (ENCRYPTION - 136)) | (1L << (END - 136)) | (1L << (ENGINE - 136)) | (1L << (EVENT - 136)) | (1L << (EXCHANGE - 136)) | (1L << (EXECUTE - 136)) | (1L << (FILE - 136)) | (1L << (FIRST - 136)) | (1L << (FIXED - 136)) | (1L << (FOLLOWING - 136)) | (1L << (GLOBAL - 136)) | (1L << (HASH - 136)) | (1L << (IMPORT_ - 136)) | (1L << (INSERT_METHOD - 136)) | (1L << (KEY_BLOCK_SIZE - 136)) | (1L << (LAST - 136)) | (1L << (LESS - 136)) | (1L << (MAX_ROWS - 136)) | (1L << (MEMORY - 136)) | (1L << (MIN_ROWS - 136)) | (1L << (MODIFY - 136)) | (1L << (NONE - 136)) | (1L << (PACK_KEYS - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (PARSER - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITIONING - 200)) | (1L << (PERSIST - 200)) | (1L << (PERSIST_ONLY - 200)) | (1L << (PRECEDING - 200)) | (1L << (PROCESS - 200)) | (1L << (PROXY - 200)) | (1L << (QUICK - 200)) | (1L << (REBUILD - 200)) | (1L << (REDUNDANT - 200)) | (1L << (RELOAD - 200)) | (1L << (REMOVE - 200)) | (1L << (REORGANIZE - 200)) | (1L << (REPAIR - 200)) | (1L << (REVERSE - 200)) | (1L << (ROW_FORMAT - 200)) | (1L << (SAVEPOINT - 200)) | (1L << (SESSION - 200)) | (1L << (SHUTDOWN - 200)) | (1L << (SIMPLE - 200)) | (1L << (SLAVE - 200)) | (1L << (SQL_BIG_RESULT - 200)) | (1L << (SQL_BUFFER_RESULT - 200)) | (1L << (SQL_CACHE - 200)) | (1L << (SQL_NO_CACHE - 200)) | (1L << (STATS_AUTO_RECALC - 200)) | (1L << (STATS_PERSISTENT - 200)) | (1L << (STATS_SAMPLE_PAGES - 200)) | (1L << (STORAGE - 200)) | (1L << (SUBPARTITION - 200)) | (1L << (SUPER - 200)) | (1L << (TABLES - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (THAN - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UPGRADE - 264)) | (1L << (VALIDATION - 264)) | (1L << (VALUE - 264)) | (1L << (VIEW - 264)) | (1L << (WEIGHT_STRING - 264)) | (1L << (WITHOUT - 264)) | (1L << (VISIBLE - 264)) | (1L << (INVISIBLE - 264)) | (1L << (ENFORCED - 264)))) != 0) || _la==IDENTIFIER_) {
				{
				setState(1403);
				identifier_();
				}
			}

			setState(1407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1406);
				windowPartitionClause();
				}
			}

			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1409);
				orderByClause();
				}
			}

			setState(1413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROWS || _la==RANGE) {
				{
				setState(1412);
				frameClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowPartitionClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public WindowPartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowPartitionClause; }
	}

	public final WindowPartitionClauseContext windowPartitionClause() throws RecognitionException {
		WindowPartitionClauseContext _localctx = new WindowPartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_windowPartitionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			match(PARTITION);
			setState(1416);
			match(BY);
			setState(1417);
			expr(0);
			setState(1422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1418);
				match(COMMA_);
				setState(1419);
				expr(0);
				}
				}
				setState(1424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameClauseContext extends ParserRuleContext {
		public FrameUnitsContext frameUnits() {
			return getRuleContext(FrameUnitsContext.class,0);
		}
		public FrameExtentContext frameExtent() {
			return getRuleContext(FrameExtentContext.class,0);
		}
		public FrameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameClause; }
	}

	public final FrameClauseContext frameClause() throws RecognitionException {
		FrameClauseContext _localctx = new FrameClauseContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_frameClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			frameUnits();
			setState(1426);
			frameExtent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameUnitsContext extends ParserRuleContext {
		public TerminalNode ROWS() { return getToken(MySQLStatementParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(MySQLStatementParser.RANGE, 0); }
		public FrameUnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameUnits; }
	}

	public final FrameUnitsContext frameUnits() throws RecognitionException {
		FrameUnitsContext _localctx = new FrameUnitsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_frameUnits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			_la = _input.LA(1);
			if ( !(_la==ROWS || _la==RANGE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameExtentContext extends ParserRuleContext {
		public FrameStartContext frameStart() {
			return getRuleContext(FrameStartContext.class,0);
		}
		public FrameBetweenContext frameBetween() {
			return getRuleContext(FrameBetweenContext.class,0);
		}
		public FrameExtentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameExtent; }
	}

	public final FrameExtentContext frameExtent() throws RecognitionException {
		FrameExtentContext _localctx = new FrameExtentContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_frameExtent);
		try {
			setState(1432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case BINARY:
			case DATE:
			case ESCAPE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case OFFSET:
			case ROLLUP:
			case ROW:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DAY:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CASE:
			case CAST:
			case CHAIN:
			case CHAR:
			case CHARACTER:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case EXTRACT:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case GROUP_CONCAT:
			case HASH:
			case IF:
			case IMPORT_:
			case INSERT_METHOD:
			case INTERVAL:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case NOW:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case POSITION:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPLACE:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case SUBSTR:
			case SUBSTRING:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case TRIM:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1430);
				frameStart();
				}
				break;
			case BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1431);
				frameBetween();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameStartContext extends ParserRuleContext {
		public TerminalNode CURRENT() { return getToken(MySQLStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(MySQLStatementParser.ROW, 0); }
		public TerminalNode UNBOUNDED() { return getToken(MySQLStatementParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(MySQLStatementParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(MySQLStatementParser.FOLLOWING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FrameStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameStart; }
	}

	public final FrameStartContext frameStart() throws RecognitionException {
		FrameStartContext _localctx = new FrameStartContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_frameStart);
		try {
			setState(1446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1434);
				match(CURRENT);
				setState(1435);
				match(ROW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1436);
				match(UNBOUNDED);
				setState(1437);
				match(PRECEDING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1438);
				match(UNBOUNDED);
				setState(1439);
				match(FOLLOWING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1440);
				expr(0);
				setState(1441);
				match(PRECEDING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1443);
				expr(0);
				setState(1444);
				match(FOLLOWING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBetweenContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(MySQLStatementParser.BETWEEN, 0); }
		public FrameStartContext frameStart() {
			return getRuleContext(FrameStartContext.class,0);
		}
		public TerminalNode AND() { return getToken(MySQLStatementParser.AND, 0); }
		public FrameEndContext frameEnd() {
			return getRuleContext(FrameEndContext.class,0);
		}
		public FrameBetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBetween; }
	}

	public final FrameBetweenContext frameBetween() throws RecognitionException {
		FrameBetweenContext _localctx = new FrameBetweenContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_frameBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448);
			match(BETWEEN);
			setState(1449);
			frameStart();
			setState(1450);
			match(AND);
			setState(1451);
			frameEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameEndContext extends ParserRuleContext {
		public FrameStartContext frameStart() {
			return getRuleContext(FrameStartContext.class,0);
		}
		public FrameEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameEnd; }
	}

	public final FrameEndContext frameEnd() throws RecognitionException {
		FrameEndContext _localctx = new FrameEndContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_frameEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			frameStart();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public CharacterSet_Context characterSet_() {
			return getRuleContext(CharacterSet_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public TerminalNode UNSIGNED() { return getToken(MySQLStatementParser.UNSIGNED, 0); }
		public TerminalNode ZEROFILL() { return getToken(MySQLStatementParser.ZEROFILL, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(MySQLStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(MySQLStatementParser.STRING_, i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_dataType);
		int _la;
		try {
			setState(1488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				dataTypeName_();
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1456);
					dataTypeLength();
					}
				}

				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (CHAR - 106)) | (1L << (CHARACTER - 106)) | (1L << (CHARSET - 106)))) != 0)) {
					{
					setState(1459);
					characterSet_();
					}
				}

				setState(1463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1462);
					collateClause_();
					}
					break;
				}
				setState(1466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1465);
					match(UNSIGNED);
					}
				}

				setState(1469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(1468);
					match(ZEROFILL);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1471);
				dataTypeName_();
				setState(1472);
				match(LP_);
				setState(1473);
				match(STRING_);
				setState(1478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1474);
					match(COMMA_);
					setState(1475);
					match(STRING_);
					}
					}
					setState(1480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1481);
				match(RP_);
				setState(1483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (CHAR - 106)) | (1L << (CHARACTER - 106)) | (1L << (CHARSET - 106)))) != 0)) {
					{
					setState(1482);
					characterSet_();
					}
				}

				setState(1486);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1485);
					collateClause_();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeName_Context extends ParserRuleContext {
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public DataTypeName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName_; }
	}

	public final DataTypeName_Context dataTypeName_() throws RecognitionException {
		DataTypeName_Context _localctx = new DataTypeName_Context(_ctx, getState());
		enterRule(_localctx, 204, RULE_dataTypeName_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			identifier_();
			setState(1492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1491);
				identifier_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeLengthContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(MySQLStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(MySQLStatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(MySQLStatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			match(LP_);
			setState(1495);
			match(NUMBER_);
			setState(1498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(1496);
				match(COMMA_);
				setState(1497);
				match(NUMBER_);
				}
			}

			setState(1500);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterSet_Context extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(MySQLStatementParser.CHARACTER, 0); }
		public TerminalNode CHAR() { return getToken(MySQLStatementParser.CHAR, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode CHARSET() { return getToken(MySQLStatementParser.CHARSET, 0); }
		public CharacterSet_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSet_; }
	}

	public final CharacterSet_Context characterSet_() throws RecognitionException {
		CharacterSet_Context _localctx = new CharacterSet_Context(_ctx, getState());
		enterRule(_localctx, 208, RULE_characterSet_);
		int _la;
		try {
			setState(1513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1502);
				_la = _input.LA(1);
				if ( !(_la==CHAR || _la==CHARACTER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1503);
				match(SET);
				setState(1505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(1504);
					match(EQ_);
					}
				}

				setState(1507);
				ignoredIdentifier_();
				}
				break;
			case CHARSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1508);
				match(CHARSET);
				setState(1510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(1509);
					match(EQ_);
					}
				}

				setState(1512);
				ignoredIdentifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollateClause_Context extends ParserRuleContext {
		public TerminalNode COLLATE() { return getToken(MySQLStatementParser.COLLATE, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public CollateClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause_; }
	}

	public final CollateClause_Context collateClause_() throws RecognitionException {
		CollateClause_Context _localctx = new CollateClause_Context(_ctx, getState());
		enterRule(_localctx, 210, RULE_collateClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			match(COLLATE);
			setState(1517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(1516);
				match(EQ_);
				}
			}

			setState(1521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				{
				setState(1519);
				match(STRING_);
				}
				break;
			case ANY:
			case DATE:
			case ESCAPE:
			case OFFSET:
			case ROLLUP:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DAY:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case IDENTIFIER_:
				{
				setState(1520);
				ignoredIdentifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgnoredIdentifier_Context extends ParserRuleContext {
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode DOT_() { return getToken(MySQLStatementParser.DOT_, 0); }
		public IgnoredIdentifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier_; }
	}

	public final IgnoredIdentifier_Context ignoredIdentifier_() throws RecognitionException {
		IgnoredIdentifier_Context _localctx = new IgnoredIdentifier_Context(_ctx, getState());
		enterRule(_localctx, 212, RULE_ignoredIdentifier_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			identifier_();
			setState(1526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1524);
				match(DOT_);
				setState(1525);
				identifier_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgnoredIdentifiers_Context extends ParserRuleContext {
		public List<IgnoredIdentifier_Context> ignoredIdentifier_() {
			return getRuleContexts(IgnoredIdentifier_Context.class);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_(int i) {
			return getRuleContext(IgnoredIdentifier_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public IgnoredIdentifiers_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifiers_; }
	}

	public final IgnoredIdentifiers_Context ignoredIdentifiers_() throws RecognitionException {
		IgnoredIdentifiers_Context _localctx = new IgnoredIdentifiers_Context(_ctx, getState());
		enterRule(_localctx, 214, RULE_ignoredIdentifiers_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			ignoredIdentifier_();
			setState(1533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1529);
					match(COMMA_);
					setState(1530);
					ignoredIdentifier_();
					}
					} 
				}
				setState(1535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public CreateDefinitions_Context createDefinitions_() {
			return getRuleContext(CreateDefinitions_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public CreateLike_Context createLike_() {
			return getRuleContext(CreateLike_Context.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(MySQLStatementParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			match(CREATE);
			setState(1538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1537);
				match(TEMPORARY);
				}
			}

			setState(1540);
			match(TABLE);
			setState(1544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1541);
				match(IF);
				setState(1542);
				match(NOT);
				setState(1543);
				match(EXISTS);
				}
			}

			setState(1546);
			tableName();
			setState(1552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1547);
				match(LP_);
				setState(1548);
				createDefinitions_();
				setState(1549);
				match(RP_);
				}
				break;
			case 2:
				{
				setState(1551);
				createLike_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDefinitions_Context extends ParserRuleContext {
		public List<CreateDefinition_Context> createDefinition_() {
			return getRuleContexts(CreateDefinition_Context.class);
		}
		public CreateDefinition_Context createDefinition_(int i) {
			return getRuleContext(CreateDefinition_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public CreateDefinitions_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitions_; }
	}

	public final CreateDefinitions_Context createDefinitions_() throws RecognitionException {
		CreateDefinitions_Context _localctx = new CreateDefinitions_Context(_ctx, getState());
		enterRule(_localctx, 218, RULE_createDefinitions_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			createDefinition_();
			setState(1559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1555);
				match(COMMA_);
				setState(1556);
				createDefinition_();
				}
				}
				setState(1561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDefinition_Context extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public IndexDefinition_Context indexDefinition_() {
			return getRuleContext(IndexDefinition_Context.class,0);
		}
		public ConstraintDefinition_Context constraintDefinition_() {
			return getRuleContext(ConstraintDefinition_Context.class,0);
		}
		public CheckConstraintDefinition_Context checkConstraintDefinition_() {
			return getRuleContext(CheckConstraintDefinition_Context.class,0);
		}
		public CreateDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinition_; }
	}

	public final CreateDefinition_Context createDefinition_() throws RecognitionException {
		CreateDefinition_Context _localctx = new CreateDefinition_Context(_ctx, getState());
		enterRule(_localctx, 220, RULE_createDefinition_);
		try {
			setState(1566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1562);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1563);
				indexDefinition_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1564);
				constraintDefinition_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1565);
				checkConstraintDefinition_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<InlineDataType_Context> inlineDataType_() {
			return getRuleContexts(InlineDataType_Context.class);
		}
		public InlineDataType_Context inlineDataType_(int i) {
			return getRuleContext(InlineDataType_Context.class,i);
		}
		public List<GeneratedDataType_Context> generatedDataType_() {
			return getRuleContexts(GeneratedDataType_Context.class);
		}
		public GeneratedDataType_Context generatedDataType_(int i) {
			return getRuleContext(GeneratedDataType_Context.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			columnName();
			setState(1569);
			dataType();
			setState(1582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEY) | (1L << NOT) | (1L << NULL) | (1L << PRIMARY) | (1L << CHECK) | (1L << CONSTRAINT) | (1L << DEFAULT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (REFERENCES - 77)) | (1L << (UNIQUE - 77)) | (1L << (AUTO_INCREMENT - 77)) | (1L << (COLLATE - 77)) | (1L << (COLUMN_FORMAT - 77)) | (1L << (COMMENT - 77)))) != 0) || _la==STORAGE) {
					{
					{
					setState(1570);
					inlineDataType_();
					}
					}
					setState(1575);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEY) | (1L << NOT) | (1L << NULL) | (1L << PRIMARY) | (1L << AS) | (1L << CHECK) | (1L << CONSTRAINT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GENERATED - 67)) | (1L << (REFERENCES - 67)) | (1L << (UNIQUE - 67)) | (1L << (COLLATE - 67)) | (1L << (COMMENT - 67)))) != 0) || _la==STORED || _la==VIRTUAL) {
					{
					{
					setState(1576);
					generatedDataType_();
					}
					}
					setState(1581);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineDataType_Context extends ParserRuleContext {
		public CommonDataTypeOption_Context commonDataTypeOption_() {
			return getRuleContext(CommonDataTypeOption_Context.class,0);
		}
		public TerminalNode AUTO_INCREMENT() { return getToken(MySQLStatementParser.AUTO_INCREMENT, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLUMN_FORMAT() { return getToken(MySQLStatementParser.COLUMN_FORMAT, 0); }
		public TerminalNode FIXED() { return getToken(MySQLStatementParser.FIXED, 0); }
		public TerminalNode DYNAMIC() { return getToken(MySQLStatementParser.DYNAMIC, 0); }
		public TerminalNode STORAGE() { return getToken(MySQLStatementParser.STORAGE, 0); }
		public TerminalNode DISK() { return getToken(MySQLStatementParser.DISK, 0); }
		public TerminalNode MEMORY() { return getToken(MySQLStatementParser.MEMORY, 0); }
		public InlineDataType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineDataType_; }
	}

	public final InlineDataType_Context inlineDataType_() throws RecognitionException {
		InlineDataType_Context _localctx = new InlineDataType_Context(_ctx, getState());
		enterRule(_localctx, 224, RULE_inlineDataType_);
		int _la;
		try {
			setState(1595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case NOT:
			case NULL:
			case PRIMARY:
			case CHECK:
			case CONSTRAINT:
			case REFERENCES:
			case UNIQUE:
			case COLLATE:
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1584);
				commonDataTypeOption_();
				}
				break;
			case AUTO_INCREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1585);
				match(AUTO_INCREMENT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1586);
				match(DEFAULT);
				setState(1589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1587);
					literal();
					}
					break;
				case 2:
					{
					setState(1588);
					expr(0);
					}
					break;
				}
				}
				break;
			case COLUMN_FORMAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1591);
				match(COLUMN_FORMAT);
				setState(1592);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==DYNAMIC || _la==FIXED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STORAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1593);
				match(STORAGE);
				setState(1594);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==DISK || _la==MEMORY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratedDataType_Context extends ParserRuleContext {
		public CommonDataTypeOption_Context commonDataTypeOption_() {
			return getRuleContext(CommonDataTypeOption_Context.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(MySQLStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(MySQLStatementParser.ALWAYS, 0); }
		public TerminalNode VIRTUAL() { return getToken(MySQLStatementParser.VIRTUAL, 0); }
		public TerminalNode STORED() { return getToken(MySQLStatementParser.STORED, 0); }
		public GeneratedDataType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatedDataType_; }
	}

	public final GeneratedDataType_Context generatedDataType_() throws RecognitionException {
		GeneratedDataType_Context _localctx = new GeneratedDataType_Context(_ctx, getState());
		enterRule(_localctx, 226, RULE_generatedDataType_);
		int _la;
		try {
			setState(1605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case NOT:
			case NULL:
			case PRIMARY:
			case CHECK:
			case CONSTRAINT:
			case REFERENCES:
			case UNIQUE:
			case COLLATE:
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1597);
				commonDataTypeOption_();
				}
				break;
			case AS:
			case GENERATED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GENERATED) {
					{
					setState(1598);
					match(GENERATED);
					setState(1599);
					match(ALWAYS);
					}
				}

				setState(1602);
				match(AS);
				setState(1603);
				expr(0);
				}
				break;
			case STORED:
			case VIRTUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1604);
				_la = _input.LA(1);
				if ( !(_la==STORED || _la==VIRTUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonDataTypeOption_Context extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(MySQLStatementParser.UNIQUE, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public TerminalNode NULL() { return getToken(MySQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public CheckConstraintDefinition_Context checkConstraintDefinition_() {
			return getRuleContext(CheckConstraintDefinition_Context.class,0);
		}
		public ReferenceDefinition_Context referenceDefinition_() {
			return getRuleContext(ReferenceDefinition_Context.class,0);
		}
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public CommonDataTypeOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonDataTypeOption_; }
	}

	public final CommonDataTypeOption_Context commonDataTypeOption_() throws RecognitionException {
		CommonDataTypeOption_Context _localctx = new CommonDataTypeOption_Context(_ctx, getState());
		enterRule(_localctx, 228, RULE_commonDataTypeOption_);
		int _la;
		try {
			setState(1621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1607);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1608);
				match(UNIQUE);
				setState(1610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1609);
					match(KEY);
					}
					break;
				}
				}
				break;
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1612);
					match(NOT);
					}
				}

				setState(1615);
				match(NULL);
				}
				break;
			case COLLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1616);
				collateClause_();
				}
				break;
			case CHECK:
			case CONSTRAINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1617);
				checkConstraintDefinition_();
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 6);
				{
				setState(1618);
				referenceDefinition_();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1619);
				match(COMMENT);
				setState(1620);
				match(STRING_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceDefinition_Context extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(MySQLStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public KeyParts_Context keyParts_() {
			return getRuleContext(KeyParts_Context.class,0);
		}
		public TerminalNode MATCH() { return getToken(MySQLStatementParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(MySQLStatementParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(MySQLStatementParser.PARTIAL, 0); }
		public TerminalNode SIMPLE() { return getToken(MySQLStatementParser.SIMPLE, 0); }
		public List<TerminalNode> ON() { return getTokens(MySQLStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(MySQLStatementParser.ON, i);
		}
		public List<ReferenceOption_Context> referenceOption_() {
			return getRuleContexts(ReferenceOption_Context.class);
		}
		public ReferenceOption_Context referenceOption_(int i) {
			return getRuleContext(ReferenceOption_Context.class,i);
		}
		public List<TerminalNode> UPDATE() { return getTokens(MySQLStatementParser.UPDATE); }
		public TerminalNode UPDATE(int i) {
			return getToken(MySQLStatementParser.UPDATE, i);
		}
		public List<TerminalNode> DELETE() { return getTokens(MySQLStatementParser.DELETE); }
		public TerminalNode DELETE(int i) {
			return getToken(MySQLStatementParser.DELETE, i);
		}
		public ReferenceDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceDefinition_; }
	}

	public final ReferenceDefinition_Context referenceDefinition_() throws RecognitionException {
		ReferenceDefinition_Context _localctx = new ReferenceDefinition_Context(_ctx, getState());
		enterRule(_localctx, 230, RULE_referenceDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			match(REFERENCES);
			setState(1624);
			tableName();
			setState(1625);
			keyParts_();
			setState(1632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1626);
				match(MATCH);
				setState(1627);
				match(FULL);
				}
				break;
			case 2:
				{
				setState(1628);
				match(MATCH);
				setState(1629);
				match(PARTIAL);
				}
				break;
			case 3:
				{
				setState(1630);
				match(MATCH);
				setState(1631);
				match(SIMPLE);
				}
				break;
			}
			setState(1639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON) {
				{
				{
				setState(1634);
				match(ON);
				setState(1635);
				_la = _input.LA(1);
				if ( !(_la==DELETE || _la==UPDATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1636);
				referenceOption_();
				}
				}
				setState(1641);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceOption_Context extends ParserRuleContext {
		public TerminalNode RESTRICT() { return getToken(MySQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(MySQLStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(MySQLStatementParser.NULL, 0); }
		public TerminalNode NO() { return getToken(MySQLStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(MySQLStatementParser.ACTION, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public ReferenceOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceOption_; }
	}

	public final ReferenceOption_Context referenceOption_() throws RecognitionException {
		ReferenceOption_Context _localctx = new ReferenceOption_Context(_ctx, getState());
		enterRule(_localctx, 232, RULE_referenceOption_);
		try {
			setState(1650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1642);
				match(RESTRICT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1643);
				match(CASCADE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1644);
				match(SET);
				setState(1645);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1646);
				match(NO);
				setState(1647);
				match(ACTION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1648);
				match(SET);
				setState(1649);
				match(DEFAULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexDefinition_Context extends ParserRuleContext {
		public KeyParts_Context keyParts_() {
			return getRuleContext(KeyParts_Context.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public IndexType_Context indexType_() {
			return getRuleContext(IndexType_Context.class,0);
		}
		public List<IndexOption_Context> indexOption_() {
			return getRuleContexts(IndexOption_Context.class);
		}
		public IndexOption_Context indexOption_(int i) {
			return getRuleContext(IndexOption_Context.class,i);
		}
		public TerminalNode FULLTEXT() { return getToken(MySQLStatementParser.FULLTEXT, 0); }
		public TerminalNode SPATIAL() { return getToken(MySQLStatementParser.SPATIAL, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public IndexDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexDefinition_; }
	}

	public final IndexDefinition_Context indexDefinition_() throws RecognitionException {
		IndexDefinition_Context _localctx = new IndexDefinition_Context(_ctx, getState());
		enterRule(_localctx, 234, RULE_indexDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FULLTEXT || _la==SPATIAL) {
				{
				setState(1652);
				_la = _input.LA(1);
				if ( !(_la==FULLTEXT || _la==SPATIAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY || _la==INDEX) {
				{
				setState(1655);
				_la = _input.LA(1);
				if ( !(_la==KEY || _la==INDEX) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DAY) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LEVEL - 70)) | (1L << (NO - 70)) | (1L << (PASSWORD - 70)) | (1L << (PRIVILEGES - 70)) | (1L << (ROLLBACK - 70)) | (1L << (START - 70)) | (1L << (TRANSACTION - 70)) | (1L << (TRUNCATE - 70)) | (1L << (ACCOUNT - 70)) | (1L << (ACTION - 70)) | (1L << (AFTER - 70)) | (1L << (ALGORITHM - 70)) | (1L << (AUTO_INCREMENT - 70)) | (1L << (AVG_ROW_LENGTH - 70)) | (1L << (BEGIN - 70)) | (1L << (BTREE - 70)) | (1L << (CHAIN - 70)) | (1L << (CHARSET - 70)) | (1L << (CHECKSUM - 70)) | (1L << (CIPHER - 70)) | (1L << (CLIENT - 70)) | (1L << (COALESCE - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN_FORMAT - 70)) | (1L << (COMMENT - 70)) | (1L << (COMPACT - 70)) | (1L << (COMPRESSED - 70)) | (1L << (COMPRESSION - 70)) | (1L << (CONNECTION - 70)) | (1L << (CONSISTENT - 70)) | (1L << (DATA - 70)) | (1L << (DELAY_KEY_WRITE - 70)) | (1L << (DISCARD - 70)) | (1L << (DISK - 70)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (DUPLICATE - 136)) | (1L << (ENCRYPTION - 136)) | (1L << (END - 136)) | (1L << (ENGINE - 136)) | (1L << (EVENT - 136)) | (1L << (EXCHANGE - 136)) | (1L << (EXECUTE - 136)) | (1L << (FILE - 136)) | (1L << (FIRST - 136)) | (1L << (FIXED - 136)) | (1L << (FOLLOWING - 136)) | (1L << (GLOBAL - 136)) | (1L << (HASH - 136)) | (1L << (IMPORT_ - 136)) | (1L << (INSERT_METHOD - 136)) | (1L << (KEY_BLOCK_SIZE - 136)) | (1L << (LAST - 136)) | (1L << (LESS - 136)) | (1L << (MAX_ROWS - 136)) | (1L << (MEMORY - 136)) | (1L << (MIN_ROWS - 136)) | (1L << (MODIFY - 136)) | (1L << (NONE - 136)) | (1L << (PACK_KEYS - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (PARSER - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITIONING - 200)) | (1L << (PERSIST - 200)) | (1L << (PERSIST_ONLY - 200)) | (1L << (PRECEDING - 200)) | (1L << (PROCESS - 200)) | (1L << (PROXY - 200)) | (1L << (QUICK - 200)) | (1L << (REBUILD - 200)) | (1L << (REDUNDANT - 200)) | (1L << (RELOAD - 200)) | (1L << (REMOVE - 200)) | (1L << (REORGANIZE - 200)) | (1L << (REPAIR - 200)) | (1L << (REVERSE - 200)) | (1L << (ROW_FORMAT - 200)) | (1L << (SAVEPOINT - 200)) | (1L << (SESSION - 200)) | (1L << (SHUTDOWN - 200)) | (1L << (SIMPLE - 200)) | (1L << (SLAVE - 200)) | (1L << (SQL_BIG_RESULT - 200)) | (1L << (SQL_BUFFER_RESULT - 200)) | (1L << (SQL_CACHE - 200)) | (1L << (SQL_NO_CACHE - 200)) | (1L << (STATS_AUTO_RECALC - 200)) | (1L << (STATS_PERSISTENT - 200)) | (1L << (STATS_SAMPLE_PAGES - 200)) | (1L << (STORAGE - 200)) | (1L << (SUBPARTITION - 200)) | (1L << (SUPER - 200)) | (1L << (TABLES - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (THAN - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UPGRADE - 264)) | (1L << (VALIDATION - 264)) | (1L << (VALUE - 264)) | (1L << (VIEW - 264)) | (1L << (WEIGHT_STRING - 264)) | (1L << (WITHOUT - 264)) | (1L << (VISIBLE - 264)) | (1L << (INVISIBLE - 264)) | (1L << (ENFORCED - 264)))) != 0) || _la==IDENTIFIER_) {
				{
				setState(1658);
				indexName();
				}
			}

			setState(1662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1661);
				indexType_();
				}
			}

			setState(1664);
			keyParts_();
			setState(1668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH || _la==COMMENT || _la==KEY_BLOCK_SIZE || ((((_la - 278)) & ~0x3f) == 0 && ((1L << (_la - 278)) & ((1L << (USING - 278)) | (1L << (VISIBLE - 278)) | (1L << (INVISIBLE - 278)))) != 0)) {
				{
				{
				setState(1665);
				indexOption_();
				}
				}
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexType_Context extends ParserRuleContext {
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public TerminalNode BTREE() { return getToken(MySQLStatementParser.BTREE, 0); }
		public TerminalNode HASH() { return getToken(MySQLStatementParser.HASH, 0); }
		public IndexType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexType_; }
	}

	public final IndexType_Context indexType_() throws RecognitionException {
		IndexType_Context _localctx = new IndexType_Context(_ctx, getState());
		enterRule(_localctx, 236, RULE_indexType_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671);
			match(USING);
			setState(1672);
			_la = _input.LA(1);
			if ( !(_la==BTREE || _la==HASH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyParts_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<KeyPart_Context> keyPart_() {
			return getRuleContexts(KeyPart_Context.class);
		}
		public KeyPart_Context keyPart_(int i) {
			return getRuleContext(KeyPart_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public KeyParts_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyParts_; }
	}

	public final KeyParts_Context keyParts_() throws RecognitionException {
		KeyParts_Context _localctx = new KeyParts_Context(_ctx, getState());
		enterRule(_localctx, 238, RULE_keyParts_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			match(LP_);
			setState(1675);
			keyPart_();
			setState(1680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1676);
				match(COMMA_);
				setState(1677);
				keyPart_();
				}
				}
				setState(1682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1683);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyPart_Context extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(MySQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MySQLStatementParser.DESC, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public KeyPart_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyPart_; }
	}

	public final KeyPart_Context keyPart_() throws RecognitionException {
		KeyPart_Context _localctx = new KeyPart_Context(_ctx, getState());
		enterRule(_localctx, 240, RULE_keyPart_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1685);
				columnName();
				setState(1689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1686);
					match(LP_);
					setState(1687);
					match(NUMBER_);
					setState(1688);
					match(RP_);
					}
				}

				}
				break;
			case 2:
				{
				setState(1691);
				expr(0);
				}
				break;
			}
			setState(1695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1694);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexOption_Context extends ParserRuleContext {
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(MySQLStatementParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public IndexType_Context indexType_() {
			return getRuleContext(IndexType_Context.class,0);
		}
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public TerminalNode PARSER() { return getToken(MySQLStatementParser.PARSER, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode VISIBLE() { return getToken(MySQLStatementParser.VISIBLE, 0); }
		public TerminalNode INVISIBLE() { return getToken(MySQLStatementParser.INVISIBLE, 0); }
		public IndexOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOption_; }
	}

	public final IndexOption_Context indexOption_() throws RecognitionException {
		IndexOption_Context _localctx = new IndexOption_Context(_ctx, getState());
		enterRule(_localctx, 242, RULE_indexOption_);
		int _la;
		try {
			setState(1710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY_BLOCK_SIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1697);
				match(KEY_BLOCK_SIZE);
				setState(1699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(1698);
					match(EQ_);
					}
				}

				setState(1701);
				match(NUMBER_);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1702);
				indexType_();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 3);
				{
				setState(1703);
				match(WITH);
				setState(1704);
				match(PARSER);
				setState(1705);
				identifier_();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1706);
				match(COMMENT);
				setState(1707);
				match(STRING_);
				}
				break;
			case VISIBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1708);
				match(VISIBLE);
				}
				break;
			case INVISIBLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1709);
				match(INVISIBLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintDefinition_Context extends ParserRuleContext {
		public PrimaryKeyOption_Context primaryKeyOption_() {
			return getRuleContext(PrimaryKeyOption_Context.class,0);
		}
		public UniqueOption_Context uniqueOption_() {
			return getRuleContext(UniqueOption_Context.class,0);
		}
		public ForeignKeyOption_Context foreignKeyOption_() {
			return getRuleContext(ForeignKeyOption_Context.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(MySQLStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintDefinition_; }
	}

	public final ConstraintDefinition_Context constraintDefinition_() throws RecognitionException {
		ConstraintDefinition_Context _localctx = new ConstraintDefinition_Context(_ctx, getState());
		enterRule(_localctx, 244, RULE_constraintDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1712);
				match(CONSTRAINT);
				setState(1714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DAY) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LEVEL - 70)) | (1L << (NO - 70)) | (1L << (PASSWORD - 70)) | (1L << (PRIVILEGES - 70)) | (1L << (ROLLBACK - 70)) | (1L << (START - 70)) | (1L << (TRANSACTION - 70)) | (1L << (TRUNCATE - 70)) | (1L << (ACCOUNT - 70)) | (1L << (ACTION - 70)) | (1L << (AFTER - 70)) | (1L << (ALGORITHM - 70)) | (1L << (AUTO_INCREMENT - 70)) | (1L << (AVG_ROW_LENGTH - 70)) | (1L << (BEGIN - 70)) | (1L << (BTREE - 70)) | (1L << (CHAIN - 70)) | (1L << (CHARSET - 70)) | (1L << (CHECKSUM - 70)) | (1L << (CIPHER - 70)) | (1L << (CLIENT - 70)) | (1L << (COALESCE - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN_FORMAT - 70)) | (1L << (COMMENT - 70)) | (1L << (COMPACT - 70)) | (1L << (COMPRESSED - 70)) | (1L << (COMPRESSION - 70)) | (1L << (CONNECTION - 70)) | (1L << (CONSISTENT - 70)) | (1L << (DATA - 70)) | (1L << (DELAY_KEY_WRITE - 70)) | (1L << (DISCARD - 70)) | (1L << (DISK - 70)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (DUPLICATE - 136)) | (1L << (ENCRYPTION - 136)) | (1L << (END - 136)) | (1L << (ENGINE - 136)) | (1L << (EVENT - 136)) | (1L << (EXCHANGE - 136)) | (1L << (EXECUTE - 136)) | (1L << (FILE - 136)) | (1L << (FIRST - 136)) | (1L << (FIXED - 136)) | (1L << (FOLLOWING - 136)) | (1L << (GLOBAL - 136)) | (1L << (HASH - 136)) | (1L << (IMPORT_ - 136)) | (1L << (INSERT_METHOD - 136)) | (1L << (KEY_BLOCK_SIZE - 136)) | (1L << (LAST - 136)) | (1L << (LESS - 136)) | (1L << (MAX_ROWS - 136)) | (1L << (MEMORY - 136)) | (1L << (MIN_ROWS - 136)) | (1L << (MODIFY - 136)) | (1L << (NONE - 136)) | (1L << (PACK_KEYS - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (PARSER - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITIONING - 200)) | (1L << (PERSIST - 200)) | (1L << (PERSIST_ONLY - 200)) | (1L << (PRECEDING - 200)) | (1L << (PROCESS - 200)) | (1L << (PROXY - 200)) | (1L << (QUICK - 200)) | (1L << (REBUILD - 200)) | (1L << (REDUNDANT - 200)) | (1L << (RELOAD - 200)) | (1L << (REMOVE - 200)) | (1L << (REORGANIZE - 200)) | (1L << (REPAIR - 200)) | (1L << (REVERSE - 200)) | (1L << (ROW_FORMAT - 200)) | (1L << (SAVEPOINT - 200)) | (1L << (SESSION - 200)) | (1L << (SHUTDOWN - 200)) | (1L << (SIMPLE - 200)) | (1L << (SLAVE - 200)) | (1L << (SQL_BIG_RESULT - 200)) | (1L << (SQL_BUFFER_RESULT - 200)) | (1L << (SQL_CACHE - 200)) | (1L << (SQL_NO_CACHE - 200)) | (1L << (STATS_AUTO_RECALC - 200)) | (1L << (STATS_PERSISTENT - 200)) | (1L << (STATS_SAMPLE_PAGES - 200)) | (1L << (STORAGE - 200)) | (1L << (SUBPARTITION - 200)) | (1L << (SUPER - 200)) | (1L << (TABLES - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (THAN - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UPGRADE - 264)) | (1L << (VALIDATION - 264)) | (1L << (VALUE - 264)) | (1L << (VIEW - 264)) | (1L << (WEIGHT_STRING - 264)) | (1L << (WITHOUT - 264)) | (1L << (VISIBLE - 264)) | (1L << (INVISIBLE - 264)) | (1L << (ENFORCED - 264)))) != 0) || _la==IDENTIFIER_) {
					{
					setState(1713);
					ignoredIdentifier_();
					}
				}

				}
			}

			setState(1721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
				{
				setState(1718);
				primaryKeyOption_();
				}
				break;
			case UNIQUE:
				{
				setState(1719);
				uniqueOption_();
				}
				break;
			case FOREIGN:
				{
				setState(1720);
				foreignKeyOption_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyOption_Context extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public IndexType_Context indexType_() {
			return getRuleContext(IndexType_Context.class,0);
		}
		public List<IndexOption_Context> indexOption_() {
			return getRuleContexts(IndexOption_Context.class);
		}
		public IndexOption_Context indexOption_(int i) {
			return getRuleContext(IndexOption_Context.class,i);
		}
		public PrimaryKeyOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyOption_; }
	}

	public final PrimaryKeyOption_Context primaryKeyOption_() throws RecognitionException {
		PrimaryKeyOption_Context _localctx = new PrimaryKeyOption_Context(_ctx, getState());
		enterRule(_localctx, 246, RULE_primaryKeyOption_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			primaryKey();
			setState(1725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1724);
				indexType_();
				}
			}

			setState(1727);
			columnNames();
			setState(1731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH || _la==COMMENT || _la==KEY_BLOCK_SIZE || ((((_la - 278)) & ~0x3f) == 0 && ((1L << (_la - 278)) & ((1L << (USING - 278)) | (1L << (VISIBLE - 278)) | (1L << (INVISIBLE - 278)))) != 0)) {
				{
				{
				setState(1728);
				indexOption_();
				}
				}
				setState(1733);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(MySQLStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(1734);
				match(PRIMARY);
				}
			}

			setState(1737);
			match(KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UniqueOption_Context extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(MySQLStatementParser.UNIQUE, 0); }
		public KeyParts_Context keyParts_() {
			return getRuleContext(KeyParts_Context.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public IndexType_Context indexType_() {
			return getRuleContext(IndexType_Context.class,0);
		}
		public List<IndexOption_Context> indexOption_() {
			return getRuleContexts(IndexOption_Context.class);
		}
		public IndexOption_Context indexOption_(int i) {
			return getRuleContext(IndexOption_Context.class,i);
		}
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public UniqueOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueOption_; }
	}

	public final UniqueOption_Context uniqueOption_() throws RecognitionException {
		UniqueOption_Context _localctx = new UniqueOption_Context(_ctx, getState());
		enterRule(_localctx, 250, RULE_uniqueOption_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1739);
			match(UNIQUE);
			setState(1741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY || _la==INDEX) {
				{
				setState(1740);
				_la = _input.LA(1);
				if ( !(_la==KEY || _la==INDEX) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DAY) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LEVEL - 70)) | (1L << (NO - 70)) | (1L << (PASSWORD - 70)) | (1L << (PRIVILEGES - 70)) | (1L << (ROLLBACK - 70)) | (1L << (START - 70)) | (1L << (TRANSACTION - 70)) | (1L << (TRUNCATE - 70)) | (1L << (ACCOUNT - 70)) | (1L << (ACTION - 70)) | (1L << (AFTER - 70)) | (1L << (ALGORITHM - 70)) | (1L << (AUTO_INCREMENT - 70)) | (1L << (AVG_ROW_LENGTH - 70)) | (1L << (BEGIN - 70)) | (1L << (BTREE - 70)) | (1L << (CHAIN - 70)) | (1L << (CHARSET - 70)) | (1L << (CHECKSUM - 70)) | (1L << (CIPHER - 70)) | (1L << (CLIENT - 70)) | (1L << (COALESCE - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN_FORMAT - 70)) | (1L << (COMMENT - 70)) | (1L << (COMPACT - 70)) | (1L << (COMPRESSED - 70)) | (1L << (COMPRESSION - 70)) | (1L << (CONNECTION - 70)) | (1L << (CONSISTENT - 70)) | (1L << (DATA - 70)) | (1L << (DELAY_KEY_WRITE - 70)) | (1L << (DISCARD - 70)) | (1L << (DISK - 70)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (DUPLICATE - 136)) | (1L << (ENCRYPTION - 136)) | (1L << (END - 136)) | (1L << (ENGINE - 136)) | (1L << (EVENT - 136)) | (1L << (EXCHANGE - 136)) | (1L << (EXECUTE - 136)) | (1L << (FILE - 136)) | (1L << (FIRST - 136)) | (1L << (FIXED - 136)) | (1L << (FOLLOWING - 136)) | (1L << (GLOBAL - 136)) | (1L << (HASH - 136)) | (1L << (IMPORT_ - 136)) | (1L << (INSERT_METHOD - 136)) | (1L << (KEY_BLOCK_SIZE - 136)) | (1L << (LAST - 136)) | (1L << (LESS - 136)) | (1L << (MAX_ROWS - 136)) | (1L << (MEMORY - 136)) | (1L << (MIN_ROWS - 136)) | (1L << (MODIFY - 136)) | (1L << (NONE - 136)) | (1L << (PACK_KEYS - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (PARSER - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITIONING - 200)) | (1L << (PERSIST - 200)) | (1L << (PERSIST_ONLY - 200)) | (1L << (PRECEDING - 200)) | (1L << (PROCESS - 200)) | (1L << (PROXY - 200)) | (1L << (QUICK - 200)) | (1L << (REBUILD - 200)) | (1L << (REDUNDANT - 200)) | (1L << (RELOAD - 200)) | (1L << (REMOVE - 200)) | (1L << (REORGANIZE - 200)) | (1L << (REPAIR - 200)) | (1L << (REVERSE - 200)) | (1L << (ROW_FORMAT - 200)) | (1L << (SAVEPOINT - 200)) | (1L << (SESSION - 200)) | (1L << (SHUTDOWN - 200)) | (1L << (SIMPLE - 200)) | (1L << (SLAVE - 200)) | (1L << (SQL_BIG_RESULT - 200)) | (1L << (SQL_BUFFER_RESULT - 200)) | (1L << (SQL_CACHE - 200)) | (1L << (SQL_NO_CACHE - 200)) | (1L << (STATS_AUTO_RECALC - 200)) | (1L << (STATS_PERSISTENT - 200)) | (1L << (STATS_SAMPLE_PAGES - 200)) | (1L << (STORAGE - 200)) | (1L << (SUBPARTITION - 200)) | (1L << (SUPER - 200)) | (1L << (TABLES - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (THAN - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UPGRADE - 264)) | (1L << (VALIDATION - 264)) | (1L << (VALUE - 264)) | (1L << (VIEW - 264)) | (1L << (WEIGHT_STRING - 264)) | (1L << (WITHOUT - 264)) | (1L << (VISIBLE - 264)) | (1L << (INVISIBLE - 264)) | (1L << (ENFORCED - 264)))) != 0) || _la==IDENTIFIER_) {
				{
				setState(1743);
				indexName();
				}
			}

			setState(1747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1746);
				indexType_();
				}
			}

			setState(1749);
			keyParts_();
			setState(1753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH || _la==COMMENT || _la==KEY_BLOCK_SIZE || ((((_la - 278)) & ~0x3f) == 0 && ((1L << (_la - 278)) & ((1L << (USING - 278)) | (1L << (VISIBLE - 278)) | (1L << (INVISIBLE - 278)))) != 0)) {
				{
				{
				setState(1750);
				indexOption_();
				}
				}
				setState(1755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeignKeyOption_Context extends ParserRuleContext {
		public TerminalNode FOREIGN() { return getToken(MySQLStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ReferenceDefinition_Context referenceDefinition_() {
			return getRuleContext(ReferenceDefinition_Context.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public ForeignKeyOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOption_; }
	}

	public final ForeignKeyOption_Context foreignKeyOption_() throws RecognitionException {
		ForeignKeyOption_Context _localctx = new ForeignKeyOption_Context(_ctx, getState());
		enterRule(_localctx, 252, RULE_foreignKeyOption_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
			match(FOREIGN);
			setState(1757);
			match(KEY);
			setState(1759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DAY) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LEVEL - 70)) | (1L << (NO - 70)) | (1L << (PASSWORD - 70)) | (1L << (PRIVILEGES - 70)) | (1L << (ROLLBACK - 70)) | (1L << (START - 70)) | (1L << (TRANSACTION - 70)) | (1L << (TRUNCATE - 70)) | (1L << (ACCOUNT - 70)) | (1L << (ACTION - 70)) | (1L << (AFTER - 70)) | (1L << (ALGORITHM - 70)) | (1L << (AUTO_INCREMENT - 70)) | (1L << (AVG_ROW_LENGTH - 70)) | (1L << (BEGIN - 70)) | (1L << (BTREE - 70)) | (1L << (CHAIN - 70)) | (1L << (CHARSET - 70)) | (1L << (CHECKSUM - 70)) | (1L << (CIPHER - 70)) | (1L << (CLIENT - 70)) | (1L << (COALESCE - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN_FORMAT - 70)) | (1L << (COMMENT - 70)) | (1L << (COMPACT - 70)) | (1L << (COMPRESSED - 70)) | (1L << (COMPRESSION - 70)) | (1L << (CONNECTION - 70)) | (1L << (CONSISTENT - 70)) | (1L << (DATA - 70)) | (1L << (DELAY_KEY_WRITE - 70)) | (1L << (DISCARD - 70)) | (1L << (DISK - 70)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (DUPLICATE - 136)) | (1L << (ENCRYPTION - 136)) | (1L << (END - 136)) | (1L << (ENGINE - 136)) | (1L << (EVENT - 136)) | (1L << (EXCHANGE - 136)) | (1L << (EXECUTE - 136)) | (1L << (FILE - 136)) | (1L << (FIRST - 136)) | (1L << (FIXED - 136)) | (1L << (FOLLOWING - 136)) | (1L << (GLOBAL - 136)) | (1L << (HASH - 136)) | (1L << (IMPORT_ - 136)) | (1L << (INSERT_METHOD - 136)) | (1L << (KEY_BLOCK_SIZE - 136)) | (1L << (LAST - 136)) | (1L << (LESS - 136)) | (1L << (MAX_ROWS - 136)) | (1L << (MEMORY - 136)) | (1L << (MIN_ROWS - 136)) | (1L << (MODIFY - 136)) | (1L << (NONE - 136)) | (1L << (PACK_KEYS - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (PARSER - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITIONING - 200)) | (1L << (PERSIST - 200)) | (1L << (PERSIST_ONLY - 200)) | (1L << (PRECEDING - 200)) | (1L << (PROCESS - 200)) | (1L << (PROXY - 200)) | (1L << (QUICK - 200)) | (1L << (REBUILD - 200)) | (1L << (REDUNDANT - 200)) | (1L << (RELOAD - 200)) | (1L << (REMOVE - 200)) | (1L << (REORGANIZE - 200)) | (1L << (REPAIR - 200)) | (1L << (REVERSE - 200)) | (1L << (ROW_FORMAT - 200)) | (1L << (SAVEPOINT - 200)) | (1L << (SESSION - 200)) | (1L << (SHUTDOWN - 200)) | (1L << (SIMPLE - 200)) | (1L << (SLAVE - 200)) | (1L << (SQL_BIG_RESULT - 200)) | (1L << (SQL_BUFFER_RESULT - 200)) | (1L << (SQL_CACHE - 200)) | (1L << (SQL_NO_CACHE - 200)) | (1L << (STATS_AUTO_RECALC - 200)) | (1L << (STATS_PERSISTENT - 200)) | (1L << (STATS_SAMPLE_PAGES - 200)) | (1L << (STORAGE - 200)) | (1L << (SUBPARTITION - 200)) | (1L << (SUPER - 200)) | (1L << (TABLES - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (THAN - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UPGRADE - 264)) | (1L << (VALIDATION - 264)) | (1L << (VALUE - 264)) | (1L << (VIEW - 264)) | (1L << (WEIGHT_STRING - 264)) | (1L << (WITHOUT - 264)) | (1L << (VISIBLE - 264)) | (1L << (INVISIBLE - 264)) | (1L << (ENFORCED - 264)))) != 0) || _la==IDENTIFIER_) {
				{
				setState(1758);
				indexName();
				}
			}

			setState(1761);
			columnNames();
			setState(1762);
			referenceDefinition_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckConstraintDefinition_Context extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(MySQLStatementParser.CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(MySQLStatementParser.CONSTRAINT, 0); }
		public TerminalNode ENFORCED() { return getToken(MySQLStatementParser.ENFORCED, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public CheckConstraintDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkConstraintDefinition_; }
	}

	public final CheckConstraintDefinition_Context checkConstraintDefinition_() throws RecognitionException {
		CheckConstraintDefinition_Context _localctx = new CheckConstraintDefinition_Context(_ctx, getState());
		enterRule(_localctx, 254, RULE_checkConstraintDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1764);
				match(CONSTRAINT);
				setState(1766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DAY) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LEVEL - 70)) | (1L << (NO - 70)) | (1L << (PASSWORD - 70)) | (1L << (PRIVILEGES - 70)) | (1L << (ROLLBACK - 70)) | (1L << (START - 70)) | (1L << (TRANSACTION - 70)) | (1L << (TRUNCATE - 70)) | (1L << (ACCOUNT - 70)) | (1L << (ACTION - 70)) | (1L << (AFTER - 70)) | (1L << (ALGORITHM - 70)) | (1L << (AUTO_INCREMENT - 70)) | (1L << (AVG_ROW_LENGTH - 70)) | (1L << (BEGIN - 70)) | (1L << (BTREE - 70)) | (1L << (CHAIN - 70)) | (1L << (CHARSET - 70)) | (1L << (CHECKSUM - 70)) | (1L << (CIPHER - 70)) | (1L << (CLIENT - 70)) | (1L << (COALESCE - 70)) | (1L << (COLUMNS - 70)) | (1L << (COLUMN_FORMAT - 70)) | (1L << (COMMENT - 70)) | (1L << (COMPACT - 70)) | (1L << (COMPRESSED - 70)) | (1L << (COMPRESSION - 70)) | (1L << (CONNECTION - 70)) | (1L << (CONSISTENT - 70)) | (1L << (DATA - 70)) | (1L << (DELAY_KEY_WRITE - 70)) | (1L << (DISCARD - 70)) | (1L << (DISK - 70)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (DUPLICATE - 136)) | (1L << (ENCRYPTION - 136)) | (1L << (END - 136)) | (1L << (ENGINE - 136)) | (1L << (EVENT - 136)) | (1L << (EXCHANGE - 136)) | (1L << (EXECUTE - 136)) | (1L << (FILE - 136)) | (1L << (FIRST - 136)) | (1L << (FIXED - 136)) | (1L << (FOLLOWING - 136)) | (1L << (GLOBAL - 136)) | (1L << (HASH - 136)) | (1L << (IMPORT_ - 136)) | (1L << (INSERT_METHOD - 136)) | (1L << (KEY_BLOCK_SIZE - 136)) | (1L << (LAST - 136)) | (1L << (LESS - 136)) | (1L << (MAX_ROWS - 136)) | (1L << (MEMORY - 136)) | (1L << (MIN_ROWS - 136)) | (1L << (MODIFY - 136)) | (1L << (NONE - 136)) | (1L << (PACK_KEYS - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (PARSER - 200)) | (1L << (PARTIAL - 200)) | (1L << (PARTITIONING - 200)) | (1L << (PERSIST - 200)) | (1L << (PERSIST_ONLY - 200)) | (1L << (PRECEDING - 200)) | (1L << (PROCESS - 200)) | (1L << (PROXY - 200)) | (1L << (QUICK - 200)) | (1L << (REBUILD - 200)) | (1L << (REDUNDANT - 200)) | (1L << (RELOAD - 200)) | (1L << (REMOVE - 200)) | (1L << (REORGANIZE - 200)) | (1L << (REPAIR - 200)) | (1L << (REVERSE - 200)) | (1L << (ROW_FORMAT - 200)) | (1L << (SAVEPOINT - 200)) | (1L << (SESSION - 200)) | (1L << (SHUTDOWN - 200)) | (1L << (SIMPLE - 200)) | (1L << (SLAVE - 200)) | (1L << (SQL_BIG_RESULT - 200)) | (1L << (SQL_BUFFER_RESULT - 200)) | (1L << (SQL_CACHE - 200)) | (1L << (SQL_NO_CACHE - 200)) | (1L << (STATS_AUTO_RECALC - 200)) | (1L << (STATS_PERSISTENT - 200)) | (1L << (STATS_SAMPLE_PAGES - 200)) | (1L << (STORAGE - 200)) | (1L << (SUBPARTITION - 200)) | (1L << (SUPER - 200)) | (1L << (TABLES - 200)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (TABLESPACE - 264)) | (1L << (TEMPORARY - 264)) | (1L << (THAN - 264)) | (1L << (UNBOUNDED - 264)) | (1L << (UPGRADE - 264)) | (1L << (VALIDATION - 264)) | (1L << (VALUE - 264)) | (1L << (VIEW - 264)) | (1L << (WEIGHT_STRING - 264)) | (1L << (WITHOUT - 264)) | (1L << (VISIBLE - 264)) | (1L << (INVISIBLE - 264)) | (1L << (ENFORCED - 264)))) != 0) || _la==IDENTIFIER_) {
					{
					setState(1765);
					ignoredIdentifier_();
					}
				}

				}
			}

			setState(1770);
			match(CHECK);
			setState(1771);
			expr(0);
			setState(1776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1772);
					match(NOT);
					}
				}

				setState(1775);
				match(ENFORCED);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateLike_Context extends ParserRuleContext {
		public TerminalNode LIKE() { return getToken(MySQLStatementParser.LIKE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public CreateLike_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createLike_; }
	}

	public final CreateLike_Context createLike_() throws RecognitionException {
		CreateLike_Context _localctx = new CreateLike_Context(_ctx, getState());
		enterRule(_localctx, 256, RULE_createLike_);
		try {
			setState(1785);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1778);
				match(LIKE);
				setState(1779);
				tableName();
				}
				break;
			case LP_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1780);
				match(LP_);
				setState(1781);
				match(LIKE);
				setState(1782);
				tableName();
				setState(1783);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterSpecifications_Context alterSpecifications_() {
			return getRuleContext(AlterSpecifications_Context.class,0);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_alterTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			match(ALTER);
			setState(1788);
			match(TABLE);
			setState(1789);
			tableName();
			setState(1791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (ORDER - 29)) | (1L << (UNION - 29)) | (1L << (WITH - 29)) | (1L << (ADD - 29)) | (1L << (ALTER - 29)) | (1L << (CHECK - 29)) | (1L << (DEFAULT - 29)) | (1L << (DISABLE - 29)) | (1L << (DROP - 29)) | (1L << (ENABLE - 29)) | (1L << (INDEX - 29)) | (1L << (PASSWORD - 29)) | (1L << (TRUNCATE - 29)) | (1L << (ALGORITHM - 29)))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (ANALYZE - 93)) | (1L << (AUTO_INCREMENT - 93)) | (1L << (AVG_ROW_LENGTH - 93)) | (1L << (CHANGE - 93)) | (1L << (CHAR - 93)) | (1L << (CHARACTER - 93)) | (1L << (CHARSET - 93)) | (1L << (CHECKSUM - 93)) | (1L << (COALESCE - 93)) | (1L << (COLLATE - 93)) | (1L << (COMMENT - 93)) | (1L << (COMPRESSION - 93)) | (1L << (CONNECTION - 93)) | (1L << (CONVERT - 93)) | (1L << (DATA - 93)) | (1L << (DELAY_KEY_WRITE - 93)) | (1L << (DISCARD - 93)) | (1L << (ENCRYPTION - 93)) | (1L << (ENGINE - 93)) | (1L << (EXCHANGE - 93)) | (1L << (FORCE - 93)))) != 0) || ((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & ((1L << (IMPORT_ - 166)) | (1L << (INSERT_METHOD - 166)) | (1L << (KEY_BLOCK_SIZE - 166)) | (1L << (LOCK - 166)) | (1L << (MAX_ROWS - 166)) | (1L << (MIN_ROWS - 166)) | (1L << (MODIFY - 166)) | (1L << (OPTIMIZE - 166)) | (1L << (PACK_KEYS - 166)) | (1L << (REBUILD - 166)) | (1L << (REMOVE - 166)) | (1L << (RENAME - 166)) | (1L << (REORGANIZE - 166)) | (1L << (REPAIR - 166)))) != 0) || ((((_la - 231)) & ~0x3f) == 0 && ((1L << (_la - 231)) & ((1L << (ROW_FORMAT - 231)) | (1L << (STATS_AUTO_RECALC - 231)) | (1L << (STATS_PERSISTENT - 231)) | (1L << (STATS_SAMPLE_PAGES - 231)) | (1L << (TABLESPACE - 231)) | (1L << (UPGRADE - 231)) | (1L << (WITHOUT - 231)))) != 0)) {
				{
				setState(1790);
				alterSpecifications_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterSpecifications_Context extends ParserRuleContext {
		public List<AlterSpecification_Context> alterSpecification_() {
			return getRuleContexts(AlterSpecification_Context.class);
		}
		public AlterSpecification_Context alterSpecification_(int i) {
			return getRuleContext(AlterSpecification_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public AlterSpecifications_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSpecifications_; }
	}

	public final AlterSpecifications_Context alterSpecifications_() throws RecognitionException {
		AlterSpecifications_Context _localctx = new AlterSpecifications_Context(_ctx, getState());
		enterRule(_localctx, 260, RULE_alterSpecifications_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1793);
			alterSpecification_();
			setState(1798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1794);
				match(COMMA_);
				setState(1795);
				alterSpecification_();
				}
				}
				setState(1800);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterSpecification_Context extends ParserRuleContext {
		public TableOptions_Context tableOptions_() {
			return getRuleContext(TableOptions_Context.class,0);
		}
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public AddIndexSpecificationContext addIndexSpecification() {
			return getRuleContext(AddIndexSpecificationContext.class,0);
		}
		public AddConstraintSpecificationContext addConstraintSpecification() {
			return getRuleContext(AddConstraintSpecificationContext.class,0);
		}
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public CheckConstraintDefinition_Context checkConstraintDefinition_() {
			return getRuleContext(CheckConstraintDefinition_Context.class,0);
		}
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode CHECK() { return getToken(MySQLStatementParser.CHECK, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode ENFORCED() { return getToken(MySQLStatementParser.ENFORCED, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode ALGORITHM() { return getToken(MySQLStatementParser.ALGORITHM, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public TerminalNode INSTANT() { return getToken(MySQLStatementParser.INSTANT, 0); }
		public TerminalNode INPLACE() { return getToken(MySQLStatementParser.INPLACE, 0); }
		public TerminalNode COPY() { return getToken(MySQLStatementParser.COPY, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode VISIBLE() { return getToken(MySQLStatementParser.VISIBLE, 0); }
		public TerminalNode INVISIBLE() { return getToken(MySQLStatementParser.INVISIBLE, 0); }
		public ChangeColumnSpecificationContext changeColumnSpecification() {
			return getRuleContext(ChangeColumnSpecificationContext.class,0);
		}
		public CharacterSet_Context characterSet_() {
			return getRuleContext(CharacterSet_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public TerminalNode CONVERT() { return getToken(MySQLStatementParser.CONVERT, 0); }
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public TerminalNode KEYS() { return getToken(MySQLStatementParser.KEYS, 0); }
		public TerminalNode DISABLE() { return getToken(MySQLStatementParser.DISABLE, 0); }
		public TerminalNode ENABLE() { return getToken(MySQLStatementParser.ENABLE, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public TerminalNode DISCARD() { return getToken(MySQLStatementParser.DISCARD, 0); }
		public TerminalNode IMPORT_() { return getToken(MySQLStatementParser.IMPORT_, 0); }
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public DropIndexSpecificationContext dropIndexSpecification() {
			return getRuleContext(DropIndexSpecificationContext.class,0);
		}
		public DropPrimaryKeySpecificationContext dropPrimaryKeySpecification() {
			return getRuleContext(DropPrimaryKeySpecificationContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(MySQLStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public TerminalNode FORCE() { return getToken(MySQLStatementParser.FORCE, 0); }
		public TerminalNode LOCK() { return getToken(MySQLStatementParser.LOCK, 0); }
		public TerminalNode NONE() { return getToken(MySQLStatementParser.NONE, 0); }
		public TerminalNode SHARED() { return getToken(MySQLStatementParser.SHARED, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(MySQLStatementParser.EXCLUSIVE, 0); }
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(MySQLStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public RenameColumnSpecificationContext renameColumnSpecification() {
			return getRuleContext(RenameColumnSpecificationContext.class,0);
		}
		public RenameIndexSpecificationContext renameIndexSpecification() {
			return getRuleContext(RenameIndexSpecificationContext.class,0);
		}
		public RenameTableSpecificationContext renameTableSpecification() {
			return getRuleContext(RenameTableSpecificationContext.class,0);
		}
		public TerminalNode VALIDATION() { return getToken(MySQLStatementParser.VALIDATION, 0); }
		public TerminalNode WITHOUT() { return getToken(MySQLStatementParser.WITHOUT, 0); }
		public List<TerminalNode> WITH() { return getTokens(MySQLStatementParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(MySQLStatementParser.WITH, i);
		}
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public PartitionDefinition_Context partitionDefinition_() {
			return getRuleContext(PartitionDefinition_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode TRUNCATE() { return getToken(MySQLStatementParser.TRUNCATE, 0); }
		public TerminalNode COALESCE() { return getToken(MySQLStatementParser.COALESCE, 0); }
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode REORGANIZE() { return getToken(MySQLStatementParser.REORGANIZE, 0); }
		public TerminalNode INTO() { return getToken(MySQLStatementParser.INTO, 0); }
		public PartitionDefinitions_Context partitionDefinitions_() {
			return getRuleContext(PartitionDefinitions_Context.class,0);
		}
		public TerminalNode EXCHANGE() { return getToken(MySQLStatementParser.EXCHANGE, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ANALYZE() { return getToken(MySQLStatementParser.ANALYZE, 0); }
		public TerminalNode OPTIMIZE() { return getToken(MySQLStatementParser.OPTIMIZE, 0); }
		public TerminalNode REBUILD() { return getToken(MySQLStatementParser.REBUILD, 0); }
		public TerminalNode REPAIR() { return getToken(MySQLStatementParser.REPAIR, 0); }
		public TerminalNode REMOVE() { return getToken(MySQLStatementParser.REMOVE, 0); }
		public TerminalNode PARTITIONING() { return getToken(MySQLStatementParser.PARTITIONING, 0); }
		public TerminalNode UPGRADE() { return getToken(MySQLStatementParser.UPGRADE, 0); }
		public AlterSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSpecification_; }
	}

	public final AlterSpecification_Context alterSpecification_() throws RecognitionException {
		AlterSpecification_Context _localctx = new AlterSpecification_Context(_ctx, getState());
		enterRule(_localctx, 262, RULE_alterSpecification_);
		int _la;
		try {
			int _alt;
			setState(1969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1801);
				tableOptions_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1802);
				addColumnSpecification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1803);
				addIndexSpecification();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1804);
				addConstraintSpecification();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1805);
				match(ADD);
				setState(1806);
				checkConstraintDefinition_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1807);
				match(DROP);
				setState(1808);
				match(CHECK);
				setState(1809);
				ignoredIdentifier_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1810);
				match(ALTER);
				setState(1811);
				match(CHECK);
				setState(1812);
				ignoredIdentifier_();
				setState(1814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1813);
					match(NOT);
					}
				}

				setState(1816);
				match(ENFORCED);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1818);
				match(ALGORITHM);
				setState(1820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(1819);
					match(EQ_);
					}
				}

				setState(1822);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==COPY || _la==INPLACE || _la==INSTANT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1823);
				match(ALTER);
				setState(1825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(1824);
					match(COLUMN);
					}
				}

				setState(1827);
				columnName();
				setState(1833);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SET:
					{
					setState(1828);
					match(SET);
					setState(1829);
					match(DEFAULT);
					setState(1830);
					literal();
					}
					break;
				case DROP:
					{
					setState(1831);
					match(DROP);
					setState(1832);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1835);
				match(ALTER);
				setState(1836);
				match(INDEX);
				setState(1837);
				indexName();
				setState(1838);
				_la = _input.LA(1);
				if ( !(_la==VISIBLE || _la==INVISIBLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1840);
				changeColumnSpecification();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1841);
					match(DEFAULT);
					}
				}

				setState(1844);
				characterSet_();
				setState(1846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(1845);
					collateClause_();
					}
				}

				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1848);
				match(CONVERT);
				setState(1849);
				match(TO);
				setState(1850);
				characterSet_();
				setState(1852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(1851);
					collateClause_();
					}
				}

				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1854);
				_la = _input.LA(1);
				if ( !(_la==DISABLE || _la==ENABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1855);
				match(KEYS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1856);
				_la = _input.LA(1);
				if ( !(_la==DISCARD || _la==IMPORT_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1857);
				match(TABLESPACE);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1858);
				dropColumnSpecification();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1859);
				dropIndexSpecification();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1860);
				dropPrimaryKeySpecification();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1861);
				match(DROP);
				setState(1862);
				match(FOREIGN);
				setState(1863);
				match(KEY);
				setState(1864);
				ignoredIdentifier_();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1865);
				match(FORCE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1866);
				match(LOCK);
				setState(1868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(1867);
					match(EQ_);
					}
				}

				setState(1870);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==EXCLUSIVE || _la==NONE || _la==SHARED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1871);
				modifyColumnSpecification();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1872);
				match(ORDER);
				setState(1873);
				match(BY);
				setState(1874);
				columnName();
				setState(1879);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1875);
						match(COMMA_);
						setState(1876);
						columnName();
						}
						} 
					}
					setState(1881);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
				}
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1882);
				renameColumnSpecification();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1883);
				renameIndexSpecification();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1884);
				renameTableSpecification();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1885);
				_la = _input.LA(1);
				if ( !(_la==WITH || _la==WITHOUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1886);
				match(VALIDATION);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1887);
				match(ADD);
				setState(1888);
				match(PARTITION);
				setState(1889);
				match(LP_);
				setState(1890);
				partitionDefinition_();
				setState(1891);
				match(RP_);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1893);
				match(DROP);
				setState(1894);
				match(PARTITION);
				setState(1895);
				ignoredIdentifiers_();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1896);
				match(DISCARD);
				setState(1897);
				match(PARTITION);
				setState(1900);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
				case DATE:
				case ESCAPE:
				case OFFSET:
				case ROLLUP:
				case SOUNDS:
				case TIME:
				case TIMESTAMP:
				case UNKNOWN:
				case ALWAYS:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case DAY:
				case DISABLE:
				case ENABLE:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ROLLBACK:
				case START:
				case TRANSACTION:
				case TRUNCATE:
				case ACCOUNT:
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DELAY_KEY_WRITE:
				case DISCARD:
				case DISK:
				case DUPLICATE:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIRST:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LESS:
				case MAX_ROWS:
				case MEMORY:
				case MIN_ROWS:
				case MODIFY:
				case NONE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PERSIST_ONLY:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case ROW_FORMAT:
				case SAVEPOINT:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUPER:
				case TABLES:
				case TABLESPACE:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case VALUE:
				case VIEW:
				case WEIGHT_STRING:
				case WITHOUT:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case IDENTIFIER_:
					{
					setState(1898);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(1899);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1902);
				match(TABLESPACE);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1903);
				match(IMPORT_);
				setState(1904);
				match(PARTITION);
				setState(1907);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
				case DATE:
				case ESCAPE:
				case OFFSET:
				case ROLLUP:
				case SOUNDS:
				case TIME:
				case TIMESTAMP:
				case UNKNOWN:
				case ALWAYS:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case DAY:
				case DISABLE:
				case ENABLE:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ROLLBACK:
				case START:
				case TRANSACTION:
				case TRUNCATE:
				case ACCOUNT:
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DELAY_KEY_WRITE:
				case DISCARD:
				case DISK:
				case DUPLICATE:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIRST:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LESS:
				case MAX_ROWS:
				case MEMORY:
				case MIN_ROWS:
				case MODIFY:
				case NONE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PERSIST_ONLY:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case ROW_FORMAT:
				case SAVEPOINT:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUPER:
				case TABLES:
				case TABLESPACE:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case VALUE:
				case VIEW:
				case WEIGHT_STRING:
				case WITHOUT:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case IDENTIFIER_:
					{
					setState(1905);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(1906);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1909);
				match(TABLESPACE);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1910);
				match(TRUNCATE);
				setState(1911);
				match(PARTITION);
				setState(1914);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
				case DATE:
				case ESCAPE:
				case OFFSET:
				case ROLLUP:
				case SOUNDS:
				case TIME:
				case TIMESTAMP:
				case UNKNOWN:
				case ALWAYS:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case DAY:
				case DISABLE:
				case ENABLE:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ROLLBACK:
				case START:
				case TRANSACTION:
				case TRUNCATE:
				case ACCOUNT:
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DELAY_KEY_WRITE:
				case DISCARD:
				case DISK:
				case DUPLICATE:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIRST:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LESS:
				case MAX_ROWS:
				case MEMORY:
				case MIN_ROWS:
				case MODIFY:
				case NONE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PERSIST_ONLY:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case ROW_FORMAT:
				case SAVEPOINT:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUPER:
				case TABLES:
				case TABLESPACE:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case VALUE:
				case VIEW:
				case WEIGHT_STRING:
				case WITHOUT:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case IDENTIFIER_:
					{
					setState(1912);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(1913);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1916);
				match(COALESCE);
				setState(1917);
				match(PARTITION);
				setState(1918);
				match(NUMBER_);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1919);
				match(REORGANIZE);
				setState(1920);
				match(PARTITION);
				setState(1921);
				ignoredIdentifiers_();
				setState(1922);
				match(INTO);
				setState(1923);
				partitionDefinitions_();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1925);
				match(EXCHANGE);
				setState(1926);
				match(PARTITION);
				setState(1927);
				ignoredIdentifier_();
				setState(1928);
				match(WITH);
				setState(1929);
				match(TABLE);
				setState(1930);
				tableName();
				setState(1933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH || _la==WITHOUT) {
					{
					setState(1931);
					_la = _input.LA(1);
					if ( !(_la==WITH || _la==WITHOUT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1932);
					match(VALIDATION);
					}
				}

				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1935);
				match(ANALYZE);
				setState(1936);
				match(PARTITION);
				setState(1939);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
				case DATE:
				case ESCAPE:
				case OFFSET:
				case ROLLUP:
				case SOUNDS:
				case TIME:
				case TIMESTAMP:
				case UNKNOWN:
				case ALWAYS:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case DAY:
				case DISABLE:
				case ENABLE:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ROLLBACK:
				case START:
				case TRANSACTION:
				case TRUNCATE:
				case ACCOUNT:
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DELAY_KEY_WRITE:
				case DISCARD:
				case DISK:
				case DUPLICATE:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIRST:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LESS:
				case MAX_ROWS:
				case MEMORY:
				case MIN_ROWS:
				case MODIFY:
				case NONE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PERSIST_ONLY:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case ROW_FORMAT:
				case SAVEPOINT:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUPER:
				case TABLES:
				case TABLESPACE:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case VALUE:
				case VIEW:
				case WEIGHT_STRING:
				case WITHOUT:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case IDENTIFIER_:
					{
					setState(1937);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(1938);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1941);
				match(CHECK);
				setState(1942);
				match(PARTITION);
				setState(1945);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
				case DATE:
				case ESCAPE:
				case OFFSET:
				case ROLLUP:
				case SOUNDS:
				case TIME:
				case TIMESTAMP:
				case UNKNOWN:
				case ALWAYS:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case DAY:
				case DISABLE:
				case ENABLE:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ROLLBACK:
				case START:
				case TRANSACTION:
				case TRUNCATE:
				case ACCOUNT:
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DELAY_KEY_WRITE:
				case DISCARD:
				case DISK:
				case DUPLICATE:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIRST:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LESS:
				case MAX_ROWS:
				case MEMORY:
				case MIN_ROWS:
				case MODIFY:
				case NONE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PERSIST_ONLY:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case ROW_FORMAT:
				case SAVEPOINT:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUPER:
				case TABLES:
				case TABLESPACE:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case VALUE:
				case VIEW:
				case WEIGHT_STRING:
				case WITHOUT:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case IDENTIFIER_:
					{
					setState(1943);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(1944);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1947);
				match(OPTIMIZE);
				setState(1948);
				match(PARTITION);
				setState(1951);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
				case DATE:
				case ESCAPE:
				case OFFSET:
				case ROLLUP:
				case SOUNDS:
				case TIME:
				case TIMESTAMP:
				case UNKNOWN:
				case ALWAYS:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case DAY:
				case DISABLE:
				case ENABLE:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ROLLBACK:
				case START:
				case TRANSACTION:
				case TRUNCATE:
				case ACCOUNT:
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DELAY_KEY_WRITE:
				case DISCARD:
				case DISK:
				case DUPLICATE:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIRST:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LESS:
				case MAX_ROWS:
				case MEMORY:
				case MIN_ROWS:
				case MODIFY:
				case NONE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PERSIST_ONLY:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case ROW_FORMAT:
				case SAVEPOINT:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUPER:
				case TABLES:
				case TABLESPACE:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case VALUE:
				case VIEW:
				case WEIGHT_STRING:
				case WITHOUT:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case IDENTIFIER_:
					{
					setState(1949);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(1950);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1953);
				match(REBUILD);
				setState(1954);
				match(PARTITION);
				setState(1957);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
				case DATE:
				case ESCAPE:
				case OFFSET:
				case ROLLUP:
				case SOUNDS:
				case TIME:
				case TIMESTAMP:
				case UNKNOWN:
				case ALWAYS:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case DAY:
				case DISABLE:
				case ENABLE:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ROLLBACK:
				case START:
				case TRANSACTION:
				case TRUNCATE:
				case ACCOUNT:
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DELAY_KEY_WRITE:
				case DISCARD:
				case DISK:
				case DUPLICATE:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIRST:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LESS:
				case MAX_ROWS:
				case MEMORY:
				case MIN_ROWS:
				case MODIFY:
				case NONE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PERSIST_ONLY:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case ROW_FORMAT:
				case SAVEPOINT:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUPER:
				case TABLES:
				case TABLESPACE:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case VALUE:
				case VIEW:
				case WEIGHT_STRING:
				case WITHOUT:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case IDENTIFIER_:
					{
					setState(1955);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(1956);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1959);
				match(REPAIR);
				setState(1960);
				match(PARTITION);
				setState(1963);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
				case DATE:
				case ESCAPE:
				case OFFSET:
				case ROLLUP:
				case SOUNDS:
				case TIME:
				case TIMESTAMP:
				case UNKNOWN:
				case ALWAYS:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case DAY:
				case DISABLE:
				case ENABLE:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ROLLBACK:
				case START:
				case TRANSACTION:
				case TRUNCATE:
				case ACCOUNT:
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DELAY_KEY_WRITE:
				case DISCARD:
				case DISK:
				case DUPLICATE:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIRST:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LESS:
				case MAX_ROWS:
				case MEMORY:
				case MIN_ROWS:
				case MODIFY:
				case NONE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PERSIST_ONLY:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case ROW_FORMAT:
				case SAVEPOINT:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUPER:
				case TABLES:
				case TABLESPACE:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case VALUE:
				case VIEW:
				case WEIGHT_STRING:
				case WITHOUT:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case IDENTIFIER_:
					{
					setState(1961);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(1962);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1965);
				match(REMOVE);
				setState(1966);
				match(PARTITIONING);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1967);
				match(UPGRADE);
				setState(1968);
				match(PARTITIONING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableOptions_Context extends ParserRuleContext {
		public List<TableOption_Context> tableOption_() {
			return getRuleContexts(TableOption_Context.class);
		}
		public TableOption_Context tableOption_(int i) {
			return getRuleContext(TableOption_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TableOptions_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptions_; }
	}

	public final TableOptions_Context tableOptions_() throws RecognitionException {
		TableOptions_Context _localctx = new TableOptions_Context(_ctx, getState());
		enterRule(_localctx, 264, RULE_tableOptions_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			tableOption_();
			setState(1978);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1973);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA_) {
						{
						setState(1972);
						match(COMMA_);
						}
					}

					setState(1975);
					tableOption_();
					}
					} 
				}
				setState(1980);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableOption_Context extends ParserRuleContext {
		public TerminalNode AUTO_INCREMENT() { return getToken(MySQLStatementParser.AUTO_INCREMENT, 0); }
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode AVG_ROW_LENGTH() { return getToken(MySQLStatementParser.AVG_ROW_LENGTH, 0); }
		public CharacterSet_Context characterSet_() {
			return getRuleContext(CharacterSet_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public TerminalNode CHECKSUM() { return getToken(MySQLStatementParser.CHECKSUM, 0); }
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode COMPRESSION() { return getToken(MySQLStatementParser.COMPRESSION, 0); }
		public TerminalNode CONNECTION() { return getToken(MySQLStatementParser.CONNECTION, 0); }
		public TerminalNode DIRECTORY() { return getToken(MySQLStatementParser.DIRECTORY, 0); }
		public TerminalNode DATA() { return getToken(MySQLStatementParser.DATA, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode DELAY_KEY_WRITE() { return getToken(MySQLStatementParser.DELAY_KEY_WRITE, 0); }
		public TerminalNode ENCRYPTION() { return getToken(MySQLStatementParser.ENCRYPTION, 0); }
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode INSERT_METHOD() { return getToken(MySQLStatementParser.INSERT_METHOD, 0); }
		public TerminalNode NO() { return getToken(MySQLStatementParser.NO, 0); }
		public TerminalNode FIRST() { return getToken(MySQLStatementParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(MySQLStatementParser.LAST, 0); }
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(MySQLStatementParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode MAX_ROWS() { return getToken(MySQLStatementParser.MAX_ROWS, 0); }
		public TerminalNode MIN_ROWS() { return getToken(MySQLStatementParser.MIN_ROWS, 0); }
		public TerminalNode PACK_KEYS() { return getToken(MySQLStatementParser.PACK_KEYS, 0); }
		public TerminalNode PASSWORD() { return getToken(MySQLStatementParser.PASSWORD, 0); }
		public TerminalNode ROW_FORMAT() { return getToken(MySQLStatementParser.ROW_FORMAT, 0); }
		public TerminalNode DYNAMIC() { return getToken(MySQLStatementParser.DYNAMIC, 0); }
		public TerminalNode FIXED() { return getToken(MySQLStatementParser.FIXED, 0); }
		public TerminalNode COMPRESSED() { return getToken(MySQLStatementParser.COMPRESSED, 0); }
		public TerminalNode REDUNDANT() { return getToken(MySQLStatementParser.REDUNDANT, 0); }
		public TerminalNode COMPACT() { return getToken(MySQLStatementParser.COMPACT, 0); }
		public TerminalNode STATS_AUTO_RECALC() { return getToken(MySQLStatementParser.STATS_AUTO_RECALC, 0); }
		public TerminalNode STATS_PERSISTENT() { return getToken(MySQLStatementParser.STATS_PERSISTENT, 0); }
		public TerminalNode STATS_SAMPLE_PAGES() { return getToken(MySQLStatementParser.STATS_SAMPLE_PAGES, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public TerminalNode STORAGE() { return getToken(MySQLStatementParser.STORAGE, 0); }
		public TerminalNode DISK() { return getToken(MySQLStatementParser.DISK, 0); }
		public TerminalNode MEMORY() { return getToken(MySQLStatementParser.MEMORY, 0); }
		public TerminalNode UNION() { return getToken(MySQLStatementParser.UNION, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TableOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOption_; }
	}

	public final TableOption_Context tableOption_() throws RecognitionException {
		TableOption_Context _localctx = new TableOption_Context(_ctx, getState());
		enterRule(_localctx, 266, RULE_tableOption_);
		int _la;
		try {
			setState(2110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1981);
				match(AUTO_INCREMENT);
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(1982);
					match(EQ_);
					}
				}

				setState(1985);
				match(NUMBER_);
				}
				break;
			case AVG_ROW_LENGTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1986);
				match(AVG_ROW_LENGTH);
				setState(1988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(1987);
					match(EQ_);
					}
				}

				setState(1990);
				match(NUMBER_);
				}
				break;
			case DEFAULT:
			case CHAR:
			case CHARACTER:
			case CHARSET:
			case COLLATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1991);
					match(DEFAULT);
					}
				}

				setState(1996);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR:
				case CHARACTER:
				case CHARSET:
					{
					setState(1994);
					characterSet_();
					}
					break;
				case COLLATE:
					{
					setState(1995);
					collateClause_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case CHECKSUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(1998);
				match(CHECKSUM);
				setState(2000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(1999);
					match(EQ_);
					}
				}

				setState(2002);
				match(NUMBER_);
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2003);
				match(COMMENT);
				setState(2005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2004);
					match(EQ_);
					}
				}

				setState(2007);
				match(STRING_);
				}
				break;
			case COMPRESSION:
				enterOuterAlt(_localctx, 6);
				{
				setState(2008);
				match(COMPRESSION);
				setState(2010);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2009);
					match(EQ_);
					}
				}

				setState(2012);
				match(STRING_);
				}
				break;
			case CONNECTION:
				enterOuterAlt(_localctx, 7);
				{
				setState(2013);
				match(CONNECTION);
				setState(2015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2014);
					match(EQ_);
					}
				}

				setState(2017);
				match(STRING_);
				}
				break;
			case INDEX:
			case DATA:
				enterOuterAlt(_localctx, 8);
				{
				setState(2018);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==DATA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2019);
				match(DIRECTORY);
				setState(2021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2020);
					match(EQ_);
					}
				}

				setState(2023);
				match(STRING_);
				}
				break;
			case DELAY_KEY_WRITE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2024);
				match(DELAY_KEY_WRITE);
				setState(2026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2025);
					match(EQ_);
					}
				}

				setState(2028);
				match(NUMBER_);
				}
				break;
			case ENCRYPTION:
				enterOuterAlt(_localctx, 10);
				{
				setState(2029);
				match(ENCRYPTION);
				setState(2031);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2030);
					match(EQ_);
					}
				}

				setState(2033);
				match(STRING_);
				}
				break;
			case ENGINE:
				enterOuterAlt(_localctx, 11);
				{
				setState(2034);
				match(ENGINE);
				setState(2036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2035);
					match(EQ_);
					}
				}

				setState(2038);
				ignoredIdentifier_();
				}
				break;
			case INSERT_METHOD:
				enterOuterAlt(_localctx, 12);
				{
				setState(2039);
				match(INSERT_METHOD);
				setState(2041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2040);
					match(EQ_);
					}
				}

				setState(2043);
				_la = _input.LA(1);
				if ( !(_la==NO || _la==FIRST || _la==LAST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case KEY_BLOCK_SIZE:
				enterOuterAlt(_localctx, 13);
				{
				setState(2044);
				match(KEY_BLOCK_SIZE);
				setState(2046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2045);
					match(EQ_);
					}
				}

				setState(2048);
				match(NUMBER_);
				}
				break;
			case MAX_ROWS:
				enterOuterAlt(_localctx, 14);
				{
				setState(2049);
				match(MAX_ROWS);
				setState(2051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2050);
					match(EQ_);
					}
				}

				setState(2053);
				match(NUMBER_);
				}
				break;
			case MIN_ROWS:
				enterOuterAlt(_localctx, 15);
				{
				setState(2054);
				match(MIN_ROWS);
				setState(2056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2055);
					match(EQ_);
					}
				}

				setState(2058);
				match(NUMBER_);
				}
				break;
			case PACK_KEYS:
				enterOuterAlt(_localctx, 16);
				{
				setState(2059);
				match(PACK_KEYS);
				setState(2061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2060);
					match(EQ_);
					}
				}

				setState(2063);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==NUMBER_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case PASSWORD:
				enterOuterAlt(_localctx, 17);
				{
				setState(2064);
				match(PASSWORD);
				setState(2066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2065);
					match(EQ_);
					}
				}

				setState(2068);
				match(STRING_);
				}
				break;
			case ROW_FORMAT:
				enterOuterAlt(_localctx, 18);
				{
				setState(2069);
				match(ROW_FORMAT);
				setState(2071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2070);
					match(EQ_);
					}
				}

				setState(2073);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (COMPACT - 117)) | (1L << (COMPRESSED - 117)) | (1L << (DYNAMIC - 117)) | (1L << (FIXED - 117)))) != 0) || _la==REDUNDANT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STATS_AUTO_RECALC:
				enterOuterAlt(_localctx, 19);
				{
				setState(2074);
				match(STATS_AUTO_RECALC);
				setState(2076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2075);
					match(EQ_);
					}
				}

				setState(2078);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==NUMBER_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STATS_PERSISTENT:
				enterOuterAlt(_localctx, 20);
				{
				setState(2079);
				match(STATS_PERSISTENT);
				setState(2081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2080);
					match(EQ_);
					}
				}

				setState(2083);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==NUMBER_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STATS_SAMPLE_PAGES:
				enterOuterAlt(_localctx, 21);
				{
				setState(2084);
				match(STATS_SAMPLE_PAGES);
				setState(2086);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2085);
					match(EQ_);
					}
				}

				setState(2088);
				match(NUMBER_);
				}
				break;
			case TABLESPACE:
				enterOuterAlt(_localctx, 22);
				{
				setState(2089);
				match(TABLESPACE);
				setState(2090);
				ignoredIdentifier_();
				setState(2093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORAGE) {
					{
					setState(2091);
					match(STORAGE);
					setState(2092);
					_la = _input.LA(1);
					if ( !(_la==DEFAULT || _la==DISK || _la==MEMORY) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 23);
				{
				setState(2095);
				match(UNION);
				setState(2097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2096);
					match(EQ_);
					}
				}

				setState(2099);
				match(LP_);
				setState(2100);
				tableName();
				setState(2105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2101);
					match(COMMA_);
					setState(2102);
					tableName();
					}
					}
					setState(2107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2108);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public List<ColumnDefinitionContext> columnDefinition() {
			return getRuleContexts(ColumnDefinitionContext.class);
		}
		public ColumnDefinitionContext columnDefinition(int i) {
			return getRuleContext(ColumnDefinitionContext.class,i);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public FirstOrAfterColumnContext firstOrAfterColumn() {
			return getRuleContext(FirstOrAfterColumnContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2112);
			match(ADD);
			setState(2114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(2113);
				match(COLUMN);
				}
			}

			setState(2131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case DATE:
			case ESCAPE:
			case OFFSET:
			case ROLLUP:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DAY:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case IDENTIFIER_:
				{
				setState(2116);
				columnDefinition();
				setState(2118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(2117);
					firstOrAfterColumn();
					}
				}

				}
				break;
			case LP_:
				{
				setState(2120);
				match(LP_);
				setState(2121);
				columnDefinition();
				setState(2126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2122);
					match(COMMA_);
					setState(2123);
					columnDefinition();
					}
					}
					setState(2128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2129);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FirstOrAfterColumnContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(MySQLStatementParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(MySQLStatementParser.AFTER, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public FirstOrAfterColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstOrAfterColumn; }
	}

	public final FirstOrAfterColumnContext firstOrAfterColumn() throws RecognitionException {
		FirstOrAfterColumnContext _localctx = new FirstOrAfterColumnContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_firstOrAfterColumn);
		try {
			setState(2136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2133);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2134);
				match(AFTER);
				setState(2135);
				columnName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public IndexDefinition_Context indexDefinition_() {
			return getRuleContext(IndexDefinition_Context.class,0);
		}
		public AddIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addIndexSpecification; }
	}

	public final AddIndexSpecificationContext addIndexSpecification() throws RecognitionException {
		AddIndexSpecificationContext _localctx = new AddIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_addIndexSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2138);
			match(ADD);
			setState(2139);
			indexDefinition_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddConstraintSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public ConstraintDefinition_Context constraintDefinition_() {
			return getRuleContext(ConstraintDefinition_Context.class,0);
		}
		public AddConstraintSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraintSpecification; }
	}

	public final AddConstraintSpecificationContext addConstraintSpecification() throws RecognitionException {
		AddConstraintSpecificationContext _localctx = new AddConstraintSpecificationContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_addConstraintSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2141);
			match(ADD);
			setState(2142);
			constraintDefinition_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChangeColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode CHANGE() { return getToken(MySQLStatementParser.CHANGE, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public FirstOrAfterColumnContext firstOrAfterColumn() {
			return getRuleContext(FirstOrAfterColumnContext.class,0);
		}
		public ChangeColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeColumnSpecification; }
	}

	public final ChangeColumnSpecificationContext changeColumnSpecification() throws RecognitionException {
		ChangeColumnSpecificationContext _localctx = new ChangeColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_changeColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144);
			match(CHANGE);
			setState(2146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(2145);
				match(COLUMN);
				}
			}

			setState(2148);
			columnName();
			setState(2149);
			columnDefinition();
			setState(2151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2150);
				firstOrAfterColumn();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_dropColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2153);
			match(DROP);
			setState(2155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(2154);
				match(COLUMN);
				}
			}

			setState(2157);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public DropIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndexSpecification; }
	}

	public final DropIndexSpecificationContext dropIndexSpecification() throws RecognitionException {
		DropIndexSpecificationContext _localctx = new DropIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_dropIndexSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2159);
			match(DROP);
			setState(2160);
			_la = _input.LA(1);
			if ( !(_la==KEY || _la==INDEX) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2161);
			indexName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropPrimaryKeySpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public DropPrimaryKeySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropPrimaryKeySpecification; }
	}

	public final DropPrimaryKeySpecificationContext dropPrimaryKeySpecification() throws RecognitionException {
		DropPrimaryKeySpecificationContext _localctx = new DropPrimaryKeySpecificationContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_dropPrimaryKeySpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2163);
			match(DROP);
			setState(2164);
			primaryKey();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifyColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(MySQLStatementParser.MODIFY, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public FirstOrAfterColumnContext firstOrAfterColumn() {
			return getRuleContext(FirstOrAfterColumnContext.class,0);
		}
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_modifyColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2166);
			match(MODIFY);
			setState(2168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(2167);
				match(COLUMN);
				}
			}

			setState(2170);
			columnDefinition();
			setState(2172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2171);
				firstOrAfterColumn();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(MySQLStatementParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public RenameColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameColumnSpecification; }
	}

	public final RenameColumnSpecificationContext renameColumnSpecification() throws RecognitionException {
		RenameColumnSpecificationContext _localctx = new RenameColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_renameColumnSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2174);
			match(RENAME);
			setState(2175);
			match(COLUMN);
			setState(2176);
			columnName();
			setState(2177);
			match(TO);
			setState(2178);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(MySQLStatementParser.RENAME, 0); }
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public RenameIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameIndexSpecification; }
	}

	public final RenameIndexSpecificationContext renameIndexSpecification() throws RecognitionException {
		RenameIndexSpecificationContext _localctx = new RenameIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_renameIndexSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2180);
			match(RENAME);
			setState(2181);
			_la = _input.LA(1);
			if ( !(_la==KEY || _la==INDEX) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2182);
			indexName();
			setState(2183);
			match(TO);
			setState(2184);
			indexName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameTableSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(MySQLStatementParser.RENAME, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public RenameTableSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameTableSpecification; }
	}

	public final RenameTableSpecificationContext renameTableSpecification() throws RecognitionException {
		RenameTableSpecificationContext _localctx = new RenameTableSpecificationContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_renameTableSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2186);
			match(RENAME);
			setState(2188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==TO) {
				{
				setState(2187);
				_la = _input.LA(1);
				if ( !(_la==AS || _la==TO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2190);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionDefinitions_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<PartitionDefinition_Context> partitionDefinition_() {
			return getRuleContexts(PartitionDefinition_Context.class);
		}
		public PartitionDefinition_Context partitionDefinition_(int i) {
			return getRuleContext(PartitionDefinition_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public PartitionDefinitions_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionDefinitions_; }
	}

	public final PartitionDefinitions_Context partitionDefinitions_() throws RecognitionException {
		PartitionDefinitions_Context _localctx = new PartitionDefinitions_Context(_ctx, getState());
		enterRule(_localctx, 292, RULE_partitionDefinitions_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			match(LP_);
			setState(2193);
			partitionDefinition_();
			setState(2198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2194);
				match(COMMA_);
				setState(2195);
				partitionDefinition_();
				}
				}
				setState(2200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2201);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionDefinition_Context extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode VALUES() { return getToken(MySQLStatementParser.VALUES, 0); }
		public List<PartitionDefinitionOption_Context> partitionDefinitionOption_() {
			return getRuleContexts(PartitionDefinitionOption_Context.class);
		}
		public PartitionDefinitionOption_Context partitionDefinitionOption_(int i) {
			return getRuleContext(PartitionDefinitionOption_Context.class,i);
		}
		public List<TerminalNode> LP_() { return getTokens(MySQLStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(MySQLStatementParser.LP_, i);
		}
		public List<SubpartitionDefinition_Context> subpartitionDefinition_() {
			return getRuleContexts(SubpartitionDefinition_Context.class);
		}
		public SubpartitionDefinition_Context subpartitionDefinition_(int i) {
			return getRuleContext(SubpartitionDefinition_Context.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(MySQLStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(MySQLStatementParser.RP_, i);
		}
		public TerminalNode LESS() { return getToken(MySQLStatementParser.LESS, 0); }
		public TerminalNode THAN() { return getToken(MySQLStatementParser.THAN, 0); }
		public PartitionLessThanValue_Context partitionLessThanValue_() {
			return getRuleContext(PartitionLessThanValue_Context.class,0);
		}
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public PartitionValueList_Context partitionValueList_() {
			return getRuleContext(PartitionValueList_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public PartitionDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionDefinition_; }
	}

	public final PartitionDefinition_Context partitionDefinition_() throws RecognitionException {
		PartitionDefinition_Context _localctx = new PartitionDefinition_Context(_ctx, getState());
		enterRule(_localctx, 294, RULE_partitionDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2203);
			match(PARTITION);
			setState(2204);
			identifier_();
			setState(2216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUES) {
				{
				setState(2205);
				match(VALUES);
				setState(2214);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESS:
					{
					setState(2206);
					match(LESS);
					setState(2207);
					match(THAN);
					setState(2208);
					partitionLessThanValue_();
					}
					break;
				case IN:
					{
					setState(2209);
					match(IN);
					setState(2210);
					match(LP_);
					setState(2211);
					partitionValueList_();
					setState(2212);
					match(RP_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(2221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (INDEX - 69)) | (1L << (COMMENT - 69)) | (1L << (DATA - 69)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (ENGINE - 142)) | (1L << (MAX_ROWS - 142)) | (1L << (MIN_ROWS - 142)))) != 0) || _la==STORAGE || _la==TABLESPACE) {
				{
				{
				setState(2218);
				partitionDefinitionOption_();
				}
				}
				setState(2223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2224);
				match(LP_);
				setState(2225);
				subpartitionDefinition_();
				setState(2230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2226);
					match(COMMA_);
					setState(2227);
					subpartitionDefinition_();
					}
					}
					setState(2232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2233);
				match(RP_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionLessThanValue_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PartitionValueList_Context partitionValueList_() {
			return getRuleContext(PartitionValueList_Context.class,0);
		}
		public TerminalNode MAXVALUE() { return getToken(MySQLStatementParser.MAXVALUE, 0); }
		public PartitionLessThanValue_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionLessThanValue_; }
	}

	public final PartitionLessThanValue_Context partitionLessThanValue_() throws RecognitionException {
		PartitionLessThanValue_Context _localctx = new PartitionLessThanValue_Context(_ctx, getState());
		enterRule(_localctx, 296, RULE_partitionLessThanValue_);
		try {
			setState(2245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				enterOuterAlt(_localctx, 1);
				{
				setState(2237);
				match(LP_);
				setState(2240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2238);
					expr(0);
					}
					break;
				case 2:
					{
					setState(2239);
					partitionValueList_();
					}
					break;
				}
				setState(2242);
				match(RP_);
				}
				break;
			case MAXVALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2244);
				match(MAXVALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValueList_Context extends ParserRuleContext {
		public List<Literals_Context> literals_() {
			return getRuleContexts(Literals_Context.class);
		}
		public Literals_Context literals_(int i) {
			return getRuleContext(Literals_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public PartitionValueList_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionValueList_; }
	}

	public final PartitionValueList_Context partitionValueList_() throws RecognitionException {
		PartitionValueList_Context _localctx = new PartitionValueList_Context(_ctx, getState());
		enterRule(_localctx, 298, RULE_partitionValueList_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2247);
			literals_();
			setState(2252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2248);
				match(COMMA_);
				setState(2249);
				literals_();
				}
				}
				setState(2254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionDefinitionOption_Context extends ParserRuleContext {
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode STORAGE() { return getToken(MySQLStatementParser.STORAGE, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode DATA() { return getToken(MySQLStatementParser.DATA, 0); }
		public TerminalNode DIRECTORY() { return getToken(MySQLStatementParser.DIRECTORY, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode MAX_ROWS() { return getToken(MySQLStatementParser.MAX_ROWS, 0); }
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode MIN_ROWS() { return getToken(MySQLStatementParser.MIN_ROWS, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public PartitionDefinitionOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionDefinitionOption_; }
	}

	public final PartitionDefinitionOption_Context partitionDefinitionOption_() throws RecognitionException {
		PartitionDefinitionOption_Context _localctx = new PartitionDefinitionOption_Context(_ctx, getState());
		enterRule(_localctx, 300, RULE_partitionDefinitionOption_);
		int _la;
		try {
			setState(2295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENGINE:
			case STORAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORAGE) {
					{
					setState(2255);
					match(STORAGE);
					}
				}

				setState(2258);
				match(ENGINE);
				setState(2260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2259);
					match(EQ_);
					}
				}

				setState(2262);
				identifier_();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2263);
				match(COMMENT);
				setState(2265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2264);
					match(EQ_);
					}
				}

				setState(2267);
				match(STRING_);
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 3);
				{
				setState(2268);
				match(DATA);
				setState(2269);
				match(DIRECTORY);
				setState(2271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2270);
					match(EQ_);
					}
				}

				setState(2273);
				match(STRING_);
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 4);
				{
				setState(2274);
				match(INDEX);
				setState(2275);
				match(DIRECTORY);
				setState(2277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2276);
					match(EQ_);
					}
				}

				setState(2279);
				match(STRING_);
				}
				break;
			case MAX_ROWS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2280);
				match(MAX_ROWS);
				setState(2282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2281);
					match(EQ_);
					}
				}

				setState(2284);
				match(NUMBER_);
				}
				break;
			case MIN_ROWS:
				enterOuterAlt(_localctx, 6);
				{
				setState(2285);
				match(MIN_ROWS);
				setState(2287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2286);
					match(EQ_);
					}
				}

				setState(2289);
				match(NUMBER_);
				}
				break;
			case TABLESPACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(2290);
				match(TABLESPACE);
				setState(2292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2291);
					match(EQ_);
					}
				}

				setState(2294);
				identifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubpartitionDefinition_Context extends ParserRuleContext {
		public TerminalNode SUBPARTITION() { return getToken(MySQLStatementParser.SUBPARTITION, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public List<PartitionDefinitionOption_Context> partitionDefinitionOption_() {
			return getRuleContexts(PartitionDefinitionOption_Context.class);
		}
		public PartitionDefinitionOption_Context partitionDefinitionOption_(int i) {
			return getRuleContext(PartitionDefinitionOption_Context.class,i);
		}
		public SubpartitionDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpartitionDefinition_; }
	}

	public final SubpartitionDefinition_Context subpartitionDefinition_() throws RecognitionException {
		SubpartitionDefinition_Context _localctx = new SubpartitionDefinition_Context(_ctx, getState());
		enterRule(_localctx, 302, RULE_subpartitionDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2297);
			match(SUBPARTITION);
			setState(2298);
			identifier_();
			setState(2302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (INDEX - 69)) | (1L << (COMMENT - 69)) | (1L << (DATA - 69)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (ENGINE - 142)) | (1L << (MAX_ROWS - 142)) | (1L << (MIN_ROWS - 142)))) != 0) || _la==STORAGE || _la==TABLESPACE) {
				{
				{
				setState(2299);
				partitionDefinitionOption_();
				}
				}
				setState(2304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode TEMPORARY() { return getToken(MySQLStatementParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_dropTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2305);
			match(DROP);
			setState(2307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(2306);
				match(TEMPORARY);
				}
			}

			setState(2309);
			match(TABLE);
			setState(2312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2310);
				match(IF);
				setState(2311);
				match(EXISTS);
				}
			}

			setState(2314);
			tableName();
			setState(2319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2315);
				match(COMMA_);
				setState(2316);
				tableName();
				}
				}
				setState(2321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(MySQLStatementParser.TRUNCATE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_truncateTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2322);
			match(TRUNCATE);
			setState(2324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(2323);
				match(TABLE);
				}
			}

			setState(2326);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateIndexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IndexType_Context indexType_() {
			return getRuleContext(IndexType_Context.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(MySQLStatementParser.UNIQUE, 0); }
		public TerminalNode FULLTEXT() { return getToken(MySQLStatementParser.FULLTEXT, 0); }
		public TerminalNode SPATIAL() { return getToken(MySQLStatementParser.SPATIAL, 0); }
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_createIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2328);
			match(CREATE);
			setState(2330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE || _la==FULLTEXT || _la==SPATIAL) {
				{
				setState(2329);
				_la = _input.LA(1);
				if ( !(_la==UNIQUE || _la==FULLTEXT || _la==SPATIAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2332);
			match(INDEX);
			setState(2333);
			indexName();
			setState(2335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(2334);
				indexType_();
				}
			}

			setState(2337);
			match(ON);
			setState(2338);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropIndexContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ONLINE() { return getToken(MySQLStatementParser.ONLINE, 0); }
		public TerminalNode OFFLINE() { return getToken(MySQLStatementParser.OFFLINE, 0); }
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_dropIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			match(DROP);
			setState(2341);
			match(INDEX);
			setState(2343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFLINE || _la==ONLINE) {
				{
				setState(2342);
				_la = _input.LA(1);
				if ( !(_la==OFFLINE || _la==ONLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2345);
			indexName();
			setState(2346);
			match(ON);
			setState(2347);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetTransactionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(MySQLStatementParser.TRANSACTION, 0); }
		public TerminalNode GLOBAL() { return getToken(MySQLStatementParser.GLOBAL, 0); }
		public TerminalNode SESSION() { return getToken(MySQLStatementParser.SESSION, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_setTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2349);
			match(SET);
			setState(2351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL || _la==SESSION) {
				{
				setState(2350);
				_la = _input.LA(1);
				if ( !(_la==GLOBAL || _la==SESSION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2353);
			match(TRANSACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetAutoCommitContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode AUTOCOMMIT() { return getToken(MySQLStatementParser.AUTOCOMMIT, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public AutoCommitValueContext autoCommitValue() {
			return getRuleContext(AutoCommitValueContext.class,0);
		}
		public SetAutoCommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAutoCommit; }
	}

	public final SetAutoCommitContext setAutoCommit() throws RecognitionException {
		SetAutoCommitContext _localctx = new SetAutoCommitContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_setAutoCommit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
			match(SET);
			setState(2356);
			match(AUTOCOMMIT);
			setState(2357);
			match(EQ_);
			setState(2358);
			autoCommitValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AutoCommitValueContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public AutoCommitValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoCommitValue; }
	}

	public final AutoCommitValueContext autoCommitValue() throws RecognitionException {
		AutoCommitValueContext _localctx = new AutoCommitValueContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_autoCommitValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2360);
			match(NUMBER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeginTransactionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(MySQLStatementParser.BEGIN, 0); }
		public TerminalNode START() { return getToken(MySQLStatementParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(MySQLStatementParser.TRANSACTION, 0); }
		public BeginTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginTransaction; }
	}

	public final BeginTransactionContext beginTransaction() throws RecognitionException {
		BeginTransactionContext _localctx = new BeginTransactionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_beginTransaction);
		try {
			setState(2365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2362);
				match(BEGIN);
				}
				break;
			case START:
				enterOuterAlt(_localctx, 2);
				{
				setState(2363);
				match(START);
				setState(2364);
				match(TRANSACTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(MySQLStatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2367);
			match(COMMIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RollbackContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(MySQLStatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2369);
			match(ROLLBACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SavepointContext extends ParserRuleContext {
		public TerminalNode SAVEPOINT() { return getToken(MySQLStatementParser.SAVEPOINT, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_savepoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2371);
			match(SAVEPOINT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(MySQLStatementParser.GRANT, 0); }
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public ProxyClause_Context proxyClause_() {
			return getRuleContext(ProxyClause_Context.class,0);
		}
		public PrivilegeClause_Context privilegeClause_() {
			return getRuleContext(PrivilegeClause_Context.class,0);
		}
		public RoleClause_Context roleClause_() {
			return getRuleContext(RoleClause_Context.class,0);
		}
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_grant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2373);
			match(GRANT);
			setState(2377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				{
				setState(2374);
				proxyClause_();
				}
				break;
			case 2:
				{
				setState(2375);
				privilegeClause_();
				}
				break;
			case 3:
				{
				setState(2376);
				roleClause_();
				}
				break;
			}
			setState(2379);
			match(TO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevokeContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(MySQLStatementParser.REVOKE, 0); }
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public ProxyClause_Context proxyClause_() {
			return getRuleContext(ProxyClause_Context.class,0);
		}
		public PrivilegeClause_Context privilegeClause_() {
			return getRuleContext(PrivilegeClause_Context.class,0);
		}
		public AllClause_Context allClause_() {
			return getRuleContext(AllClause_Context.class,0);
		}
		public RoleClause_Context roleClause_() {
			return getRuleContext(RoleClause_Context.class,0);
		}
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_revoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2381);
			match(REVOKE);
			setState(2386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				{
				setState(2382);
				proxyClause_();
				}
				break;
			case 2:
				{
				setState(2383);
				privilegeClause_();
				}
				break;
			case 3:
				{
				setState(2384);
				allClause_();
				}
				break;
			case 4:
				{
				setState(2385);
				roleClause_();
				}
				break;
			}
			setState(2388);
			match(FROM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProxyClause_Context extends ParserRuleContext {
		public TerminalNode PROXY() { return getToken(MySQLStatementParser.PROXY, 0); }
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public ProxyClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proxyClause_; }
	}

	public final ProxyClause_Context proxyClause_() throws RecognitionException {
		ProxyClause_Context _localctx = new ProxyClause_Context(_ctx, getState());
		enterRule(_localctx, 330, RULE_proxyClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2390);
			match(PROXY);
			setState(2391);
			match(ON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeClause_Context extends ParserRuleContext {
		public Privileges_Context privileges_() {
			return getRuleContext(Privileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public OnObjectClause_Context onObjectClause_() {
			return getRuleContext(OnObjectClause_Context.class,0);
		}
		public PrivilegeClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeClause_; }
	}

	public final PrivilegeClause_Context privilegeClause_() throws RecognitionException {
		PrivilegeClause_Context _localctx = new PrivilegeClause_Context(_ctx, getState());
		enterRule(_localctx, 332, RULE_privilegeClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2393);
			privileges_();
			setState(2394);
			match(ON);
			setState(2395);
			onObjectClause_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleClause_Context extends ParserRuleContext {
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public RoleClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleClause_; }
	}

	public final RoleClause_Context roleClause_() throws RecognitionException {
		RoleClause_Context _localctx = new RoleClause_Context(_ctx, getState());
		enterRule(_localctx, 334, RULE_roleClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2397);
			ignoredIdentifiers_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllClause_Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode COMMA_() { return getToken(MySQLStatementParser.COMMA_, 0); }
		public TerminalNode GRANT() { return getToken(MySQLStatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(MySQLStatementParser.OPTION, 0); }
		public TerminalNode PRIVILEGES() { return getToken(MySQLStatementParser.PRIVILEGES, 0); }
		public AllClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allClause_; }
	}

	public final AllClause_Context allClause_() throws RecognitionException {
		AllClause_Context _localctx = new AllClause_Context(_ctx, getState());
		enterRule(_localctx, 336, RULE_allClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2399);
			match(ALL);
			setState(2401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVILEGES) {
				{
				setState(2400);
				match(PRIVILEGES);
				}
			}

			setState(2403);
			match(COMMA_);
			setState(2404);
			match(GRANT);
			setState(2405);
			match(OPTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Privileges_Context extends ParserRuleContext {
		public List<PrivilegeType_Context> privilegeType_() {
			return getRuleContexts(PrivilegeType_Context.class);
		}
		public PrivilegeType_Context privilegeType_(int i) {
			return getRuleContext(PrivilegeType_Context.class,i);
		}
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public Privileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privileges_; }
	}

	public final Privileges_Context privileges_() throws RecognitionException {
		Privileges_Context _localctx = new Privileges_Context(_ctx, getState());
		enterRule(_localctx, 338, RULE_privileges_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2407);
			privilegeType_();
			setState(2409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2408);
				columnNames();
				}
			}

			setState(2418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2411);
				match(COMMA_);
				setState(2412);
				privilegeType_();
				setState(2414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2413);
					columnNames();
					}
				}

				}
				}
				setState(2420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeType_Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(MySQLStatementParser.PRIVILEGES, 0); }
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode ROUTINE() { return getToken(MySQLStatementParser.ROUTINE, 0); }
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(MySQLStatementParser.TEMPORARY, 0); }
		public TerminalNode TABLES() { return getToken(MySQLStatementParser.TABLES, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public TerminalNode VIEW() { return getToken(MySQLStatementParser.VIEW, 0); }
		public TerminalNode DELETE() { return getToken(MySQLStatementParser.DELETE, 0); }
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode EVENT() { return getToken(MySQLStatementParser.EVENT, 0); }
		public TerminalNode EXECUTE() { return getToken(MySQLStatementParser.EXECUTE, 0); }
		public TerminalNode FILE() { return getToken(MySQLStatementParser.FILE, 0); }
		public TerminalNode GRANT() { return getToken(MySQLStatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(MySQLStatementParser.OPTION, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode INSERT() { return getToken(MySQLStatementParser.INSERT, 0); }
		public TerminalNode LOCK() { return getToken(MySQLStatementParser.LOCK, 0); }
		public TerminalNode PROCESS() { return getToken(MySQLStatementParser.PROCESS, 0); }
		public TerminalNode PROXY() { return getToken(MySQLStatementParser.PROXY, 0); }
		public TerminalNode REFERENCES() { return getToken(MySQLStatementParser.REFERENCES, 0); }
		public TerminalNode RELOAD() { return getToken(MySQLStatementParser.RELOAD, 0); }
		public TerminalNode REPLICATION() { return getToken(MySQLStatementParser.REPLICATION, 0); }
		public TerminalNode CLIENT() { return getToken(MySQLStatementParser.CLIENT, 0); }
		public TerminalNode SLAVE() { return getToken(MySQLStatementParser.SLAVE, 0); }
		public TerminalNode SELECT() { return getToken(MySQLStatementParser.SELECT, 0); }
		public TerminalNode SHOW() { return getToken(MySQLStatementParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(MySQLStatementParser.DATABASES, 0); }
		public TerminalNode SHUTDOWN() { return getToken(MySQLStatementParser.SHUTDOWN, 0); }
		public TerminalNode SUPER() { return getToken(MySQLStatementParser.SUPER, 0); }
		public TerminalNode TRIGGER() { return getToken(MySQLStatementParser.TRIGGER, 0); }
		public TerminalNode UPDATE() { return getToken(MySQLStatementParser.UPDATE, 0); }
		public TerminalNode USAGE() { return getToken(MySQLStatementParser.USAGE, 0); }
		public TerminalNode AUDIT_ADMIN() { return getToken(MySQLStatementParser.AUDIT_ADMIN, 0); }
		public TerminalNode BINLOG_ADMIN() { return getToken(MySQLStatementParser.BINLOG_ADMIN, 0); }
		public TerminalNode CONNECTION_ADMIN() { return getToken(MySQLStatementParser.CONNECTION_ADMIN, 0); }
		public TerminalNode ENCRYPTION_KEY_ADMIN() { return getToken(MySQLStatementParser.ENCRYPTION_KEY_ADMIN, 0); }
		public TerminalNode FIREWALL_ADMIN() { return getToken(MySQLStatementParser.FIREWALL_ADMIN, 0); }
		public TerminalNode FIREWALL_USER() { return getToken(MySQLStatementParser.FIREWALL_USER, 0); }
		public TerminalNode GROUP_REPLICATION_ADMIN() { return getToken(MySQLStatementParser.GROUP_REPLICATION_ADMIN, 0); }
		public TerminalNode REPLICATION_SLAVE_ADMIN() { return getToken(MySQLStatementParser.REPLICATION_SLAVE_ADMIN, 0); }
		public TerminalNode ROLE_ADMIN() { return getToken(MySQLStatementParser.ROLE_ADMIN, 0); }
		public TerminalNode SET_USER_ID() { return getToken(MySQLStatementParser.SET_USER_ID, 0); }
		public TerminalNode SYSTEM_VARIABLES_ADMIN() { return getToken(MySQLStatementParser.SYSTEM_VARIABLES_ADMIN, 0); }
		public TerminalNode VERSION_TOKEN_ADMIN() { return getToken(MySQLStatementParser.VERSION_TOKEN_ADMIN, 0); }
		public PrivilegeType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeType_; }
	}

	public final PrivilegeType_Context privilegeType_() throws RecognitionException {
		PrivilegeType_Context _localctx = new PrivilegeType_Context(_ctx, getState());
		enterRule(_localctx, 340, RULE_privilegeType_);
		int _la;
		try {
			setState(2482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2421);
				match(ALL);
				setState(2423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(2422);
					match(PRIVILEGES);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2425);
				match(ALTER);
				setState(2427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROUTINE) {
					{
					setState(2426);
					match(ROUTINE);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2429);
				match(CREATE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2430);
				match(CREATE);
				setState(2431);
				match(ROUTINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2432);
				match(CREATE);
				setState(2433);
				match(TABLESPACE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2434);
				match(CREATE);
				setState(2435);
				match(TEMPORARY);
				setState(2436);
				match(TABLES);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2437);
				match(CREATE);
				setState(2438);
				match(USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2439);
				match(CREATE);
				setState(2440);
				match(VIEW);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2441);
				match(DELETE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2442);
				match(DROP);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2443);
				match(EVENT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2444);
				match(EXECUTE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2445);
				match(FILE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2446);
				match(GRANT);
				setState(2447);
				match(OPTION);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2448);
				match(INDEX);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2449);
				match(INSERT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2450);
				match(LOCK);
				setState(2451);
				match(TABLES);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2452);
				match(PROCESS);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2453);
				match(PROXY);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2454);
				match(REFERENCES);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2455);
				match(RELOAD);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2456);
				match(REPLICATION);
				setState(2457);
				match(CLIENT);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2458);
				match(REPLICATION);
				setState(2459);
				match(SLAVE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2460);
				match(SELECT);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2461);
				match(SHOW);
				setState(2462);
				match(DATABASES);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2463);
				match(SHOW);
				setState(2464);
				match(VIEW);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2465);
				match(SHUTDOWN);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2466);
				match(SUPER);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2467);
				match(TRIGGER);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2468);
				match(UPDATE);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2469);
				match(USAGE);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2470);
				match(AUDIT_ADMIN);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2471);
				match(BINLOG_ADMIN);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2472);
				match(CONNECTION_ADMIN);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2473);
				match(ENCRYPTION_KEY_ADMIN);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2474);
				match(FIREWALL_ADMIN);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2475);
				match(FIREWALL_USER);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2476);
				match(GROUP_REPLICATION_ADMIN);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2477);
				match(REPLICATION_SLAVE_ADMIN);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2478);
				match(ROLE_ADMIN);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2479);
				match(SET_USER_ID);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2480);
				match(SYSTEM_VARIABLES_ADMIN);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(2481);
				match(VERSION_TOKEN_ADMIN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnObjectClause_Context extends ParserRuleContext {
		public PrivilegeLevel_Context privilegeLevel_() {
			return getRuleContext(PrivilegeLevel_Context.class,0);
		}
		public ObjectType_Context objectType_() {
			return getRuleContext(ObjectType_Context.class,0);
		}
		public OnObjectClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onObjectClause_; }
	}

	public final OnObjectClause_Context onObjectClause_() throws RecognitionException {
		OnObjectClause_Context _localctx = new OnObjectClause_Context(_ctx, getState());
		enterRule(_localctx, 342, RULE_onObjectClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION || _la==TABLE || _la==PROCEDURE) {
				{
				setState(2484);
				objectType_();
				}
			}

			setState(2487);
			privilegeLevel_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectType_Context extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TerminalNode FUNCTION() { return getToken(MySQLStatementParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(MySQLStatementParser.PROCEDURE, 0); }
		public ObjectType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType_; }
	}

	public final ObjectType_Context objectType_() throws RecognitionException {
		ObjectType_Context _localctx = new ObjectType_Context(_ctx, getState());
		enterRule(_localctx, 344, RULE_objectType_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2489);
			_la = _input.LA(1);
			if ( !(_la==FUNCTION || _la==TABLE || _la==PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeLevel_Context extends ParserRuleContext {
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public TerminalNode DOT_ASTERISK_() { return getToken(MySQLStatementParser.DOT_ASTERISK_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public PrivilegeLevel_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeLevel_; }
	}

	public final PrivilegeLevel_Context privilegeLevel_() throws RecognitionException {
		PrivilegeLevel_Context _localctx = new PrivilegeLevel_Context(_ctx, getState());
		enterRule(_localctx, 346, RULE_privilegeLevel_);
		try {
			setState(2498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2491);
				match(ASTERISK_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2492);
				match(ASTERISK_);
				setState(2493);
				match(DOT_ASTERISK_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2494);
				identifier_();
				setState(2495);
				match(DOT_ASTERISK_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2497);
				tableName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateUserContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2500);
			match(CREATE);
			setState(2501);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropUserContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_dropUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2503);
			match(DROP);
			setState(2504);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterUserContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2506);
			match(ALTER);
			setState(2507);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameUserContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(MySQLStatementParser.RENAME, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public RenameUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameUser; }
	}

	public final RenameUserContext renameUser() throws RecognitionException {
		RenameUserContext _localctx = new RenameUserContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_renameUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2509);
			match(RENAME);
			setState(2510);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateRoleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(MySQLStatementParser.ROLE, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2512);
			match(CREATE);
			setState(2513);
			match(ROLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropRoleContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(MySQLStatementParser.ROLE, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2515);
			match(DROP);
			setState(2516);
			match(ROLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetRoleContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(MySQLStatementParser.ROLE, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public SetRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setRole; }
	}

	public final SetRoleContext setRole() throws RecognitionException {
		SetRoleContext _localctx = new SetRoleContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_setRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2518);
			match(SET);
			setState(2520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(2519);
				match(DEFAULT);
				}
			}

			setState(2522);
			match(ROLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetPasswordContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode PASSWORD() { return getToken(MySQLStatementParser.PASSWORD, 0); }
		public SetPasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setPassword; }
	}

	public final SetPasswordContext setPassword() throws RecognitionException {
		SetPasswordContext _localctx = new SetPasswordContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_setPassword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2524);
			match(SET);
			setState(2525);
			match(PASSWORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 54:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 55:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 58:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 59:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean booleanPrimary_sempred(BooleanPrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 13);
		case 12:
			return precpred(_ctx, 12);
		case 13:
			return precpred(_ctx, 11);
		case 14:
			return precpred(_ctx, 10);
		case 15:
			return precpred(_ctx, 9);
		case 16:
			return precpred(_ctx, 8);
		case 17:
			return precpred(_ctx, 7);
		case 18:
			return precpred(_ctx, 6);
		case 19:
			return precpred(_ctx, 5);
		case 20:
			return precpred(_ctx, 4);
		case 21:
			return precpred(_ctx, 3);
		case 22:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 6);
		case 24:
			return precpred(_ctx, 8);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0158\u09e2\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0189\n\2\3\2\5"+
		"\2\u018c\n\2\3\3\3\3\3\3\5\3\u0191\n\3\3\3\3\3\5\3\u0195\n\3\3\3\3\3\3"+
		"\3\5\3\u019a\n\3\3\3\5\3\u019d\n\3\3\4\5\4\u01a0\n\4\3\4\5\4\u01a3\n\4"+
		"\3\5\3\5\3\5\3\5\7\5\u01a9\n\5\f\5\16\5\u01ac\13\5\3\6\5\6\u01af\n\6\3"+
		"\6\3\6\3\6\3\6\7\6\u01b5\n\6\f\6\16\6\u01b8\13\6\3\7\5\7\u01bb\n\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u01c6\n\b\f\b\16\b\u01c9\13\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u01d3\n\n\f\n\16\n\u01d6\13\n\3\n\3\n"+
		"\3\n\3\n\5\n\u01dc\n\n\3\13\3\13\5\13\u01e0\n\13\3\f\3\f\3\f\3\f\7\f\u01e6"+
		"\n\f\f\f\16\f\u01e9\13\f\3\r\3\r\3\r\5\r\u01ee\n\r\3\16\3\16\5\16\u01f2"+
		"\n\16\3\16\5\16\u01f5\n\16\3\16\3\16\3\17\3\17\5\17\u01fb\n\17\3\20\3"+
		"\20\5\20\u01ff\n\20\3\20\5\20\u0202\n\20\3\20\5\20\u0205\n\20\3\20\3\20"+
		"\5\20\u0209\n\20\3\21\3\21\3\21\3\21\5\21\u020f\n\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u021a\n\22\3\23\3\23\3\23\7\23\u021f"+
		"\n\23\f\23\16\23\u0222\13\23\3\24\3\24\5\24\u0226\n\24\3\25\3\25\5\25"+
		"\u022a\n\25\3\26\3\26\3\26\5\26\u022f\n\26\3\26\7\26\u0232\n\26\f\26\16"+
		"\26\u0235\13\26\3\27\3\27\5\27\u0239\n\27\3\27\5\27\u023c\n\27\3\27\5"+
		"\27\u023f\n\27\3\27\5\27\u0242\n\27\3\27\5\27\u0245\n\27\3\27\5\27\u0248"+
		"\n\27\3\27\5\27\u024b\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u0254"+
		"\n\31\3\31\5\31\u0257\n\31\3\31\5\31\u025a\n\31\3\31\5\31\u025d\n\31\3"+
		"\31\5\31\u0260\n\31\3\31\5\31\u0263\n\31\3\31\5\31\u0266\n\31\3\31\5\31"+
		"\u0269\n\31\3\32\3\32\5\32\u026d\n\32\3\32\3\32\7\32\u0271\n\32\f\32\16"+
		"\32\u0274\13\32\3\33\3\33\5\33\u0278\n\33\3\33\5\33\u027b\n\33\3\33\5"+
		"\33\u027e\n\33\3\33\5\33\u0281\n\33\3\34\3\34\5\34\u0285\n\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \7 \u0292\n \f \16 \u0295\13 \3"+
		"!\3!\3!\6!\u029a\n!\r!\16!\u029b\3!\3!\6!\u02a0\n!\r!\16!\u02a1\3!\5!"+
		"\u02a5\n!\3\"\3\"\3\"\5\"\u02aa\n\"\3\"\5\"\u02ad\n\"\3\"\5\"\u02b0\n"+
		"\"\3\"\5\"\u02b3\n\"\3\"\3\"\5\"\u02b7\n\"\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u02bf\n\"\3#\3#\3#\7#\u02c4\n#\f#\16#\u02c7\13#\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\5$\u02d1\n$\7$\u02d3\n$\f$\16$\u02d6\13$\3$\3$\3$\3$\7$\u02dc\n$\f"+
		"$\16$\u02df\13$\3$\3$\3%\5%\u02e4\n%\3%\3%\3%\5%\u02e9\n%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\5%\u02f3\n%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u02fd\n%\3%\3%\5%"+
		"\u0301\n%\3&\3&\3&\3&\5&\u0307\n&\3\'\3\'\3\'\3(\3(\3(\3(\3(\7(\u0311"+
		"\n(\f(\16(\u0314\13(\3(\3(\5(\u0318\n(\3)\3)\3)\3*\3*\3*\3*\5*\u0321\n"+
		"*\3*\3*\3*\3*\5*\u0327\n*\3+\3+\5+\u032b\n+\3,\3,\3,\3,\7,\u0331\n,\f"+
		",\16,\u0334\13,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\5/\u0342\n/\3/\3/"+
		"\3/\7/\u0347\n/\f/\16/\u034a\13/\3/\3/\3\60\3\60\5\60\u0350\n\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\5\62\u0359\n\62\3\63\3\63\3\64\3\64\3\64"+
		"\5\64\u0360\n\64\3\64\3\64\3\65\3\65\3\65\5\65\u0367\n\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\66\7\66\u036f\n\66\f\66\16\66\u0372\13\66\3\66\3\66\3"+
		"\67\3\67\38\38\38\38\38\38\38\38\58\u0380\n8\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\78\u0391\n8\f8\168\u0394\138\39\39\39\39\39\39\59"+
		"\u039c\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\79\u03ab\n9\f9\169\u03ae"+
		"\139\3:\3:\3;\3;\5;\u03b4\n;\3;\3;\3;\3;\3;\5;\u03bb\n;\3;\3;\3;\3;\3"+
		";\7;\u03c2\n;\f;\16;\u03c5\13;\3;\3;\3;\3;\5;\u03cb\n;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\5;\u03d9\n;\3;\3;\3;\3;\5;\u03df\n;\3;\3;\5;\u03e3"+
		"\n;\3;\3;\3;\3;\5;\u03e9\n;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\7<\u0418\n<\f<\16<\u041b\13<\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\5=\u0425\n=\3=\3=\3=\3=\7=\u042b\n=\f=\16=\u042e\13=\3=\3=\3="+
		"\5=\u0433\n=\3=\3=\3=\5=\u0438\n=\3=\3=\3=\3=\3=\7=\u043f\n=\f=\16=\u0442"+
		"\13=\3>\3>\3>\5>\u0447\n>\3>\3>\3>\7>\u044c\n>\f>\16>\u044f\13>\3>\5>"+
		"\u0452\n>\3>\3>\3>\5>\u0457\n>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\5?\u0467\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0473\n@\3A\3A\3B\3B"+
		"\5B\u0479\nB\3C\3C\3C\6C\u047e\nC\rC\16C\u047f\3C\5C\u0483\nC\3C\3C\3"+
		"D\3D\3D\3D\3D\3E\3E\6E\u048e\nE\rE\16E\u048f\3E\5E\u0493\nE\3E\3E\3F\3"+
		"F\3F\3F\3F\3G\3G\3G\3H\3H\3I\3I\3I\3I\3J\3J\5J\u04a7\nJ\3J\5J\u04aa\n"+
		"J\3J\5J\u04ad\nJ\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5"+
		"K\u04c0\nK\3K\3K\3K\5K\u04c5\nK\3K\3K\5K\u04c9\nK\5K\u04cb\nK\3L\3L\3"+
		"M\3M\3N\3N\3O\3O\3O\3O\3O\7O\u04d8\nO\fO\16O\u04db\13O\3P\3P\3P\5P\u04e0"+
		"\nP\3P\5P\u04e3\nP\3Q\3Q\3Q\5Q\u04e8\nQ\3Q\3Q\3Q\7Q\u04ed\nQ\fQ\16Q\u04f0"+
		"\13Q\3Q\5Q\u04f3\nQ\3Q\3Q\3Q\5Q\u04f8\nQ\5Q\u04fa\nQ\3Q\3Q\3R\3R\3R\3"+
		"R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0513\nS\3T\3"+
		"T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\5U\u0523\nU\3U\3U\3V\3V\3V\3V\3"+
		"V\3V\3V\3W\3W\3W\3W\3W\7W\u0533\nW\fW\16W\u0536\13W\3W\3W\5W\u053a\nW"+
		"\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\5Y\u054b\nY\3Y\5Y\u054e"+
		"\nY\3Y\3Y\3Z\3Z\3Z\3Z\3Z\5Z\u0557\nZ\3[\3[\3[\7[\u055c\n[\f[\16[\u055f"+
		"\13[\3\\\3\\\5\\\u0563\n\\\3\\\5\\\u0566\n\\\3]\3]\3]\3]\3]\7]\u056d\n"+
		"]\f]\16]\u0570\13]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\5^\u057c\n^\3_\5_\u057f"+
		"\n_\3_\5_\u0582\n_\3_\5_\u0585\n_\3_\5_\u0588\n_\3`\3`\3`\3`\3`\7`\u058f"+
		"\n`\f`\16`\u0592\13`\3a\3a\3a\3b\3b\3c\3c\5c\u059b\nc\3d\3d\3d\3d\3d\3"+
		"d\3d\3d\3d\3d\3d\3d\5d\u05a9\nd\3e\3e\3e\3e\3e\3f\3f\3g\3g\5g\u05b4\n"+
		"g\3g\5g\u05b7\ng\3g\5g\u05ba\ng\3g\5g\u05bd\ng\3g\5g\u05c0\ng\3g\3g\3"+
		"g\3g\3g\7g\u05c7\ng\fg\16g\u05ca\13g\3g\3g\5g\u05ce\ng\3g\5g\u05d1\ng"+
		"\5g\u05d3\ng\3h\3h\5h\u05d7\nh\3i\3i\3i\3i\5i\u05dd\ni\3i\3i\3j\3j\3j"+
		"\5j\u05e4\nj\3j\3j\3j\5j\u05e9\nj\3j\5j\u05ec\nj\3k\3k\5k\u05f0\nk\3k"+
		"\3k\5k\u05f4\nk\3l\3l\3l\5l\u05f9\nl\3m\3m\3m\7m\u05fe\nm\fm\16m\u0601"+
		"\13m\3n\3n\5n\u0605\nn\3n\3n\3n\3n\5n\u060b\nn\3n\3n\3n\3n\3n\3n\5n\u0613"+
		"\nn\3o\3o\3o\7o\u0618\no\fo\16o\u061b\13o\3p\3p\3p\3p\5p\u0621\np\3q\3"+
		"q\3q\7q\u0626\nq\fq\16q\u0629\13q\3q\7q\u062c\nq\fq\16q\u062f\13q\5q\u0631"+
		"\nq\3r\3r\3r\3r\3r\5r\u0638\nr\3r\3r\3r\3r\5r\u063e\nr\3s\3s\3s\5s\u0643"+
		"\ns\3s\3s\3s\5s\u0648\ns\3t\3t\3t\5t\u064d\nt\3t\5t\u0650\nt\3t\3t\3t"+
		"\3t\3t\3t\5t\u0658\nt\3u\3u\3u\3u\3u\3u\3u\3u\3u\5u\u0663\nu\3u\3u\3u"+
		"\7u\u0668\nu\fu\16u\u066b\13u\3v\3v\3v\3v\3v\3v\3v\3v\5v\u0675\nv\3w\5"+
		"w\u0678\nw\3w\5w\u067b\nw\3w\5w\u067e\nw\3w\5w\u0681\nw\3w\3w\7w\u0685"+
		"\nw\fw\16w\u0688\13w\3x\3x\3x\3y\3y\3y\3y\7y\u0691\ny\fy\16y\u0694\13"+
		"y\3y\3y\3z\3z\3z\3z\5z\u069c\nz\3z\5z\u069f\nz\3z\5z\u06a2\nz\3{\3{\5"+
		"{\u06a6\n{\3{\3{\3{\3{\3{\3{\3{\3{\3{\5{\u06b1\n{\3|\3|\5|\u06b5\n|\5"+
		"|\u06b7\n|\3|\3|\3|\5|\u06bc\n|\3}\3}\5}\u06c0\n}\3}\3}\7}\u06c4\n}\f"+
		"}\16}\u06c7\13}\3~\5~\u06ca\n~\3~\3~\3\177\3\177\5\177\u06d0\n\177\3\177"+
		"\5\177\u06d3\n\177\3\177\5\177\u06d6\n\177\3\177\3\177\7\177\u06da\n\177"+
		"\f\177\16\177\u06dd\13\177\3\u0080\3\u0080\3\u0080\5\u0080\u06e2\n\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\5\u0081\u06e9\n\u0081\5\u0081"+
		"\u06eb\n\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u06f0\n\u0081\3\u0081\5"+
		"\u0081\u06f3\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3"+
		"\u0082\5\u0082\u06fc\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0702"+
		"\n\u0083\3\u0084\3\u0084\3\u0084\7\u0084\u0707\n\u0084\f\u0084\16\u0084"+
		"\u070a\13\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0719\n\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u071f\n\u0085\3\u0085\3\u0085"+
		"\3\u0085\5\u0085\u0724\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\5\u0085\u072c\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\5\u0085\u0735\n\u0085\3\u0085\3\u0085\5\u0085\u0739\n"+
		"\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u073f\n\u0085\3\u0085\3"+
		"\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u074f\n\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u0758\n\u0085\f\u0085"+
		"\16\u0085\u075b\13\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\5\u0085\u076f\n\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\5\u0085\u0776\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\5\u0085\u077d\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\5\u0085\u0790\n\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\5\u0085\u0796\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085"+
		"\u079c\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u07a2\n\u0085\3"+
		"\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u07a8\n\u0085\3\u0085\3\u0085\3"+
		"\u0085\3\u0085\5\u0085\u07ae\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5"+
		"\u0085\u07b4\n\u0085\3\u0086\3\u0086\5\u0086\u07b8\n\u0086\3\u0086\7\u0086"+
		"\u07bb\n\u0086\f\u0086\16\u0086\u07be\13\u0086\3\u0087\3\u0087\5\u0087"+
		"\u07c2\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u07c7\n\u0087\3\u0087\3"+
		"\u0087\5\u0087\u07cb\n\u0087\3\u0087\3\u0087\5\u0087\u07cf\n\u0087\3\u0087"+
		"\3\u0087\5\u0087\u07d3\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u07d8\n"+
		"\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u07dd\n\u0087\3\u0087\3\u0087\3"+
		"\u0087\5\u0087\u07e2\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u07e8"+
		"\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u07ed\n\u0087\3\u0087\3\u0087"+
		"\3\u0087\5\u0087\u07f2\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u07f7\n"+
		"\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u07fc\n\u0087\3\u0087\3\u0087\3"+
		"\u0087\5\u0087\u0801\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0806\n\u0087"+
		"\3\u0087\3\u0087\3\u0087\5\u0087\u080b\n\u0087\3\u0087\3\u0087\3\u0087"+
		"\5\u0087\u0810\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0815\n\u0087\3"+
		"\u0087\3\u0087\3\u0087\5\u0087\u081a\n\u0087\3\u0087\3\u0087\3\u0087\5"+
		"\u0087\u081f\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0824\n\u0087\3\u0087"+
		"\3\u0087\3\u0087\5\u0087\u0829\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\5\u0087\u0830\n\u0087\3\u0087\3\u0087\5\u0087\u0834\n\u0087\3"+
		"\u0087\3\u0087\3\u0087\3\u0087\7\u0087\u083a\n\u0087\f\u0087\16\u0087"+
		"\u083d\13\u0087\3\u0087\3\u0087\5\u0087\u0841\n\u0087\3\u0088\3\u0088"+
		"\5\u0088\u0845\n\u0088\3\u0088\3\u0088\5\u0088\u0849\n\u0088\3\u0088\3"+
		"\u0088\3\u0088\3\u0088\7\u0088\u084f\n\u0088\f\u0088\16\u0088\u0852\13"+
		"\u0088\3\u0088\3\u0088\5\u0088\u0856\n\u0088\3\u0089\3\u0089\3\u0089\5"+
		"\u0089\u085b\n\u0089\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3"+
		"\u008c\3\u008c\5\u008c\u0865\n\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u086a"+
		"\n\u008c\3\u008d\3\u008d\5\u008d\u086e\n\u008d\3\u008d\3\u008d\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\5\u0090"+
		"\u087b\n\u0090\3\u0090\3\u0090\5\u0090\u087f\n\u0090\3\u0091\3\u0091\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0093\3\u0093\5\u0093\u088f\n\u0093\3\u0093\3\u0093\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\7\u0094\u0897\n\u0094\f\u0094\16\u0094\u089a"+
		"\13\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u08a9\n\u0095\5\u0095"+
		"\u08ab\n\u0095\3\u0095\7\u0095\u08ae\n\u0095\f\u0095\16\u0095\u08b1\13"+
		"\u0095\3\u0095\3\u0095\3\u0095\3\u0095\7\u0095\u08b7\n\u0095\f\u0095\16"+
		"\u0095\u08ba\13\u0095\3\u0095\3\u0095\5\u0095\u08be\n\u0095\3\u0096\3"+
		"\u0096\3\u0096\5\u0096\u08c3\n\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u08c8"+
		"\n\u0096\3\u0097\3\u0097\3\u0097\7\u0097\u08cd\n\u0097\f\u0097\16\u0097"+
		"\u08d0\13\u0097\3\u0098\5\u0098\u08d3\n\u0098\3\u0098\3\u0098\5\u0098"+
		"\u08d7\n\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u08dc\n\u0098\3\u0098\3"+
		"\u0098\3\u0098\3\u0098\5\u0098\u08e2\n\u0098\3\u0098\3\u0098\3\u0098\3"+
		"\u0098\5\u0098\u08e8\n\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u08ed\n\u0098"+
		"\3\u0098\3\u0098\3\u0098\5\u0098\u08f2\n\u0098\3\u0098\3\u0098\3\u0098"+
		"\5\u0098\u08f7\n\u0098\3\u0098\5\u0098\u08fa\n\u0098\3\u0099\3\u0099\3"+
		"\u0099\7\u0099\u08ff\n\u0099\f\u0099\16\u0099\u0902\13\u0099\3\u009a\3"+
		"\u009a\5\u009a\u0906\n\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u090b\n\u009a"+
		"\3\u009a\3\u009a\3\u009a\7\u009a\u0910\n\u009a\f\u009a\16\u009a\u0913"+
		"\13\u009a\3\u009b\3\u009b\5\u009b\u0917\n\u009b\3\u009b\3\u009b\3\u009c"+
		"\3\u009c\5\u009c\u091d\n\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u0922\n"+
		"\u009c\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\5\u009d\u092a\n"+
		"\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\5\u009e\u0932\n"+
		"\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u00a0"+
		"\3\u00a0\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u0940\n\u00a1\3\u00a2\3\u00a2"+
		"\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5"+
		"\u094c\n\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\5\u00a6\u0955\n\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00aa\3\u00aa\5\u00aa\u0964"+
		"\n\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\5\u00ab\u096c"+
		"\n\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0971\n\u00ab\7\u00ab\u0973\n"+
		"\u00ab\f\u00ab\16\u00ab\u0976\13\u00ab\3\u00ac\3\u00ac\5\u00ac\u097a\n"+
		"\u00ac\3\u00ac\3\u00ac\5\u00ac\u097e\n\u00ac\3\u00ac\3\u00ac\3\u00ac\3"+
		"\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u09b5\n\u00ac\3\u00ad"+
		"\5\u00ad\u09b8\n\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u09c5\n\u00af\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b6"+
		"\3\u00b6\5\u00b6\u09db\n\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\2\6npvx\u00b8\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e"+
		"\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146"+
		"\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e"+
		"\u0160\u0162\u0164\u0166\u0168\u016a\u016c\2-\5\2\u0083\u0083\u00a4\u00a4"+
		"\u00ba\u00ba\3\2\u011a\u011b\4\2\4\4\r\r\4\2\u00f9\u00f9\u00fb\u00fb\5"+
		"\2\u009d\u009d\u00a7\u00a7\u0117\u0117\4\2\26\26GG\4\2\177\177\u00a9\u00a9"+
		"\4\2\u00b4\u00b4\u00e6\u00e6\3\2\u0155\u0158E\2\6\6\13\13\16\16\35\35"+
		"$$\'),,\62\62\678;<??AAHILMRRTTWX[^aacdggjjnrtz||\u0081\u0081\u0084\u0084"+
		"\u0086\u0087\u008a\u008a\u008d\u008d\u008f\u0091\u0093\u0093\u0095\u0095"+
		"\u0097\u0097\u009a\u009c\u00a0\u00a0\u00a3\u00a3\u00a8\u00a8\u00ac\u00ac"+
		"\u00b1\u00b2\u00b5\u00b5\u00bd\u00c0\u00c2\u00c2\u00c9\u00ce\u00d0\u00d0"+
		"\u00d3\u00d5\u00d7\u00d7\u00d9\u00d9\u00db\u00dc\u00de\u00df\u00e5\u00e5"+
		"\u00e9\u00ea\u00ed\u00ed\u00f1\u00f3\u00f7\u00f9\u00fb\u00fb\u00fe\u0101"+
		"\u0104\u0105\u0109\u010c\u0111\u0111\u0115\u0115\u0119\u011a\u011d\u011d"+
		"\u011f\u011f\u0122\u0122\u0125\u0126\u0128\u0128\4\2\33\33\u012c\u012c"+
		"\6\2\20\20\34\34**,,\4\2\4\4\6\6\3\2\u013e\u0143\5\2\t\t\u012c\u012d\u0135"+
		"\u0136\5\2\u00a0\u00a0\u00cd\u00ce\u00ed\u00ed\4\2\13\13()\4\2\7\7\f\f"+
		"\3\2\u0106\u0107\5\2ff\u00b3\u00b3\u010e\u010e\4\2SS\u00d6\u00d6\3\2l"+
		"m\5\2==\u008b\u008b\u009b\u009b\5\2==\u0087\u0087\u00be\u00be\4\2\u0102"+
		"\u0102\u011e\u011e\4\2>>\u0114\u0114\4\2\u009f\u009f\u00f4\u00f4\4\2g"+
		"g\u00a3\u00a3\6\2==~~\u00aa\u00aa\u0127\u0127\3\2\u0125\u0126\4\2??AA"+
		"\4\2\u0086\u0086\u00a8\u00a8\6\2==\u0094\u0094\u00c2\u00c2\u00ef\u00ef"+
		"\4\2..\u0122\u0122\4\2GG\u0081\u0081\5\2II\u009a\u009a\u00b2\u00b2\4\2"+
		"==\u0156\u0156\7\2==wx\u008b\u008b\u009b\u009b\u00d9\u00d9\4\2\63\63V"+
		"V\5\2YY\u009f\u009f\u00f4\u00f4\3\2\u00c4\u00c5\4\2\u00a0\u00a0\u00ed"+
		"\u00ed\5\2DDUU\u00d2\u00d2\2\u0b50\2\u0188\3\2\2\2\4\u018d\3\2\2\2\6\u019f"+
		"\3\2\2\2\b\u01a4\3\2\2\2\n\u01ae\3\2\2\2\f\u01ba\3\2\2\2\16\u01be\3\2"+
		"\2\2\20\u01ca\3\2\2\2\22\u01db\3\2\2\2\24\u01df\3\2\2\2\26\u01e1\3\2\2"+
		"\2\30\u01ea\3\2\2\2\32\u01ef\3\2\2\2\34\u01f8\3\2\2\2\36\u01fc\3\2\2\2"+
		" \u020a\3\2\2\2\"\u0219\3\2\2\2$\u021b\3\2\2\2&\u0223\3\2\2\2(\u0229\3"+
		"\2\2\2*\u022b\3\2\2\2,\u0236\3\2\2\2.\u024c\3\2\2\2\60\u0253\3\2\2\2\62"+
		"\u026c\3\2\2\2\64\u0280\3\2\2\2\66\u0284\3\2\2\28\u0286\3\2\2\2:\u0288"+
		"\3\2\2\2<\u028b\3\2\2\2>\u028e\3\2\2\2@\u02a4\3\2\2\2B\u02be\3\2\2\2D"+
		"\u02c0\3\2\2\2F\u02c8\3\2\2\2H\u0300\3\2\2\2J\u0306\3\2\2\2L\u0308\3\2"+
		"\2\2N\u030b\3\2\2\2P\u0319\3\2\2\2R\u031c\3\2\2\2T\u032a\3\2\2\2V\u032c"+
		"\3\2\2\2X\u0335\3\2\2\2Z\u033b\3\2\2\2\\\u033f\3\2\2\2^\u034d\3\2\2\2"+
		"`\u0354\3\2\2\2b\u0358\3\2\2\2d\u035a\3\2\2\2f\u035f\3\2\2\2h\u0366\3"+
		"\2\2\2j\u036a\3\2\2\2l\u0375\3\2\2\2n\u037f\3\2\2\2p\u0395\3\2\2\2r\u03af"+
		"\3\2\2\2t\u03e8\3\2\2\2v\u03ea\3\2\2\2x\u0437\3\2\2\2z\u0456\3\2\2\2|"+
		"\u0466\3\2\2\2~\u0472\3\2\2\2\u0080\u0474\3\2\2\2\u0082\u0478\3\2\2\2"+
		"\u0084\u047a\3\2\2\2\u0086\u0486\3\2\2\2\u0088\u048b\3\2\2\2\u008a\u0496"+
		"\3\2\2\2\u008c\u049b\3\2\2\2\u008e\u049e\3\2\2\2\u0090\u04a0\3\2\2\2\u0092"+
		"\u04a6\3\2\2\2\u0094\u04ca\3\2\2\2\u0096\u04cc\3\2\2\2\u0098\u04ce\3\2"+
		"\2\2\u009a\u04d0\3\2\2\2\u009c\u04d2\3\2\2\2\u009e\u04df\3\2\2\2\u00a0"+
		"\u04e4\3\2\2\2\u00a2\u04fd\3\2\2\2\u00a4\u0512\3\2\2\2\u00a6\u0514\3\2"+
		"\2\2\u00a8\u051b\3\2\2\2\u00aa\u0526\3\2\2\2\u00ac\u052d\3\2\2\2\u00ae"+
		"\u053d\3\2\2\2\u00b0\u0545\3\2\2\2\u00b2\u0551\3\2\2\2\u00b4\u0558\3\2"+
		"\2\2\u00b6\u0560\3\2\2\2\u00b8\u0567\3\2\2\2\u00ba\u057b\3\2\2\2\u00bc"+
		"\u057e\3\2\2\2\u00be\u0589\3\2\2\2\u00c0\u0593\3\2\2\2\u00c2\u0596\3\2"+
		"\2\2\u00c4\u059a\3\2\2\2\u00c6\u05a8\3\2\2\2\u00c8\u05aa\3\2\2\2\u00ca"+
		"\u05af\3\2\2\2\u00cc\u05d2\3\2\2\2\u00ce\u05d4\3\2\2\2\u00d0\u05d8\3\2"+
		"\2\2\u00d2\u05eb\3\2\2\2\u00d4\u05ed\3\2\2\2\u00d6\u05f5\3\2\2\2\u00d8"+
		"\u05fa\3\2\2\2\u00da\u0602\3\2\2\2\u00dc\u0614\3\2\2\2\u00de\u0620\3\2"+
		"\2\2\u00e0\u0622\3\2\2\2\u00e2\u063d\3\2\2\2\u00e4\u0647\3\2\2\2\u00e6"+
		"\u0657\3\2\2\2\u00e8\u0659\3\2\2\2\u00ea\u0674\3\2\2\2\u00ec\u0677\3\2"+
		"\2\2\u00ee\u0689\3\2\2\2\u00f0\u068c\3\2\2\2\u00f2\u069e\3\2\2\2\u00f4"+
		"\u06b0\3\2\2\2\u00f6\u06b6\3\2\2\2\u00f8\u06bd\3\2\2\2\u00fa\u06c9\3\2"+
		"\2\2\u00fc\u06cd\3\2\2\2\u00fe\u06de\3\2\2\2\u0100\u06ea\3\2\2\2\u0102"+
		"\u06fb\3\2\2\2\u0104\u06fd\3\2\2\2\u0106\u0703\3\2\2\2\u0108\u07b3\3\2"+
		"\2\2\u010a\u07b5\3\2\2\2\u010c\u0840\3\2\2\2\u010e\u0842\3\2\2\2\u0110"+
		"\u085a\3\2\2\2\u0112\u085c\3\2\2\2\u0114\u085f\3\2\2\2\u0116\u0862\3\2"+
		"\2\2\u0118\u086b\3\2\2\2\u011a\u0871\3\2\2\2\u011c\u0875\3\2\2\2\u011e"+
		"\u0878\3\2\2\2\u0120\u0880\3\2\2\2\u0122\u0886\3\2\2\2\u0124\u088c\3\2"+
		"\2\2\u0126\u0892\3\2\2\2\u0128\u089d\3\2\2\2\u012a\u08c7\3\2\2\2\u012c"+
		"\u08c9\3\2\2\2\u012e\u08f9\3\2\2\2\u0130\u08fb\3\2\2\2\u0132\u0903\3\2"+
		"\2\2\u0134\u0914\3\2\2\2\u0136\u091a\3\2\2\2\u0138\u0926\3\2\2\2\u013a"+
		"\u092f\3\2\2\2\u013c\u0935\3\2\2\2\u013e\u093a\3\2\2\2\u0140\u093f\3\2"+
		"\2\2\u0142\u0941\3\2\2\2\u0144\u0943\3\2\2\2\u0146\u0945\3\2\2\2\u0148"+
		"\u0947\3\2\2\2\u014a\u094f\3\2\2\2\u014c\u0958\3\2\2\2\u014e\u095b\3\2"+
		"\2\2\u0150\u095f\3\2\2\2\u0152\u0961\3\2\2\2\u0154\u0969\3\2\2\2\u0156"+
		"\u09b4\3\2\2\2\u0158\u09b7\3\2\2\2\u015a\u09bb\3\2\2\2\u015c\u09c4\3\2"+
		"\2\2\u015e\u09c6\3\2\2\2\u0160\u09c9\3\2\2\2\u0162\u09cc\3\2\2\2\u0164"+
		"\u09cf\3\2\2\2\u0166\u09d2\3\2\2\2\u0168\u09d5\3\2\2\2\u016a\u09d8\3\2"+
		"\2\2\u016c\u09de\3\2\2\2\u016e\u0189\5(\25\2\u016f\u0189\5\4\3\2\u0170"+
		"\u0189\5\30\r\2\u0171\u0189\5\34\17\2\u0172\u0189\5\u00dan\2\u0173\u0189"+
		"\5\u0104\u0083\2\u0174\u0189\5\u0132\u009a\2\u0175\u0189\5\u0134\u009b"+
		"\2\u0176\u0189\5\u0136\u009c\2\u0177\u0189\5\u0138\u009d\2\u0178\u0189"+
		"\5\u013a\u009e\2\u0179\u0189\5\u0140\u00a1\2\u017a\u0189\5\u013c\u009f"+
		"\2\u017b\u0189\5\u0142\u00a2\2\u017c\u0189\5\u0144\u00a3\2\u017d\u0189"+
		"\5\u0146\u00a4\2\u017e\u0189\5\u0148\u00a5\2\u017f\u0189\5\u014a\u00a6"+
		"\2\u0180\u0189\5\u015e\u00b0\2\u0181\u0189\5\u0160\u00b1\2\u0182\u0189"+
		"\5\u0162\u00b2\2\u0183\u0189\5\u0164\u00b3\2\u0184\u0189\5\u0166\u00b4"+
		"\2\u0185\u0189\5\u0168\u00b5\2\u0186\u0189\5\u016a\u00b6\2\u0187\u0189"+
		"\5\u016c\u00b7\2\u0188\u016e\3\2\2\2\u0188\u016f\3\2\2\2\u0188\u0170\3"+
		"\2\2\2\u0188\u0171\3\2\2\2\u0188\u0172\3\2\2\2\u0188\u0173\3\2\2\2\u0188"+
		"\u0174\3\2\2\2\u0188\u0175\3\2\2\2\u0188\u0176\3\2\2\2\u0188\u0177\3\2"+
		"\2\2\u0188\u0178\3\2\2\2\u0188\u0179\3\2\2\2\u0188\u017a\3\2\2\2\u0188"+
		"\u017b\3\2\2\2\u0188\u017c\3\2\2\2\u0188\u017d\3\2\2\2\u0188\u017e\3\2"+
		"\2\2\u0188\u017f\3\2\2\2\u0188\u0180\3\2\2\2\u0188\u0181\3\2\2\2\u0188"+
		"\u0182\3\2\2\2\u0188\u0183\3\2\2\2\u0188\u0184\3\2\2\2\u0188\u0185\3\2"+
		"\2\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189\u018b\3\2\2\2\u018a"+
		"\u018c\7\u0151\2\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\3\3\2"+
		"\2\2\u018d\u018e\7\u00ab\2\2\u018e\u0190\5\6\4\2\u018f\u0191\7\u00ae\2"+
		"\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194"+
		"\5f\64\2\u0193\u0195\5\b\5\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0199\3\2\2\2\u0196\u019a\5\n\6\2\u0197\u019a\5\26\f\2\u0198\u019a\5"+
		"\f\7\2\u0199\u0196\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019a"+
		"\u019c\3\2\2\2\u019b\u019d\5\16\b\2\u019c\u019b\3\2\2\2\u019c\u019d\3"+
		"\2\2\2\u019d\5\3\2\2\2\u019e\u01a0\t\2\2\2\u019f\u019e\3\2\2\2\u019f\u01a0"+
		"\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u01a3\7\u00a7\2\2\u01a2\u01a1\3\2\2"+
		"\2\u01a2\u01a3\3\2\2\2\u01a3\7\3\2\2\2\u01a4\u01a5\7 \2\2\u01a5\u01aa"+
		"\5b\62\2\u01a6\u01a7\7\u014b\2\2\u01a7\u01a9\5b\62\2\u01a8\u01a6\3\2\2"+
		"\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\t"+
		"\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01af\5j\66\2\u01ae\u01ad\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\t\3\2\2\u01b1\u01b6\5\22"+
		"\n\2\u01b2\u01b3\7\u014b\2\2\u01b3\u01b5\5\22\n\2\u01b4\u01b2\3\2\2\2"+
		"\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\13"+
		"\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bb\5j\66\2\u01ba\u01b9\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\5(\25\2\u01bd\r\3\2\2\2"+
		"\u01be\u01bf\7J\2\2\u01bf\u01c0\7\u008a\2\2\u01c0\u01c1\7\26\2\2\u01c1"+
		"\u01c2\7\u0114\2\2\u01c2\u01c7\5\20\t\2\u01c3\u01c4\7\u014b\2\2\u01c4"+
		"\u01c6\5\20\t\2\u01c5\u01c3\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3"+
		"\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\17\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca"+
		"\u01cb\5h\65\2\u01cb\u01cc\7\u013e\2\2\u01cc\u01cd\5\24\13\2\u01cd\21"+
		"\3\2\2\2\u01ce\u01cf\7\u0145\2\2\u01cf\u01d4\5\24\13\2\u01d0\u01d1\7\u014b"+
		"\2\2\u01d1\u01d3\5\24\13\2\u01d2\u01d0\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4"+
		"\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4\3\2"+
		"\2\2\u01d7\u01d8\7\u0146\2\2\u01d8\u01dc\3\2\2\2\u01d9\u01da\7\u0145\2"+
		"\2\u01da\u01dc\7\u0146\2\2\u01db\u01ce\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc"+
		"\23\3\2\2\2\u01dd\u01e0\5n8\2\u01de\u01e0\7=\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01de\3\2\2\2\u01e0\25\3\2\2\2\u01e1\u01e2\7&\2\2\u01e2\u01e7\5\20\t"+
		"\2\u01e3\u01e4\7\u014b\2\2\u01e4\u01e6\5\20\t\2\u01e5\u01e3\3\2\2\2\u01e6"+
		"\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\27\3\2\2"+
		"\2\u01e9\u01e7\3\2\2\2\u01ea\u01eb\5\32\16\2\u01eb\u01ed\5\26\f\2\u01ec"+
		"\u01ee\5L\'\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\31\3\2\2\2"+
		"\u01ef\u01f1\7\u0114\2\2\u01f0\u01f2\7\u00ba\2\2\u01f1\u01f0\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f5\7\u00a7\2\2\u01f4\u01f3"+
		"\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\5> \2\u01f7"+
		"\33\3\2\2\2\u01f8\u01fa\5\36\20\2\u01f9\u01fb\5L\'\2\u01fa\u01f9\3\2\2"+
		"\2\u01fa\u01fb\3\2\2\2\u01fb\35\3\2\2\2\u01fc\u01fe\7>\2\2\u01fd\u01ff"+
		"\7\u00ba\2\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\3\2\2"+
		"\2\u0200\u0202\7\u00d5\2\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0204\3\2\2\2\u0203\u0205\7\u00a7\2\2\u0204\u0203\3\2\2\2\u0204\u0205"+
		"\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0209\5\"\22\2\u0207\u0209\5 \21\2"+
		"\u0208\u0206\3\2\2\2\u0208\u0207\3\2\2\2\u0209\37\3\2\2\2\u020a\u020b"+
		"\7\21\2\2\u020b\u020e\5f\64\2\u020c\u020d\7 \2\2\u020d\u020f\5\u00d8m"+
		"\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f!\3\2\2\2\u0210\u0211"+
		"\5$\23\2\u0211\u0212\7\21\2\2\u0212\u0213\5> \2\u0213\u021a\3\2\2\2\u0214"+
		"\u0215\7\21\2\2\u0215\u0216\5$\23\2\u0216\u0217\7\u0118\2\2\u0217\u0218"+
		"\5> \2\u0218\u021a\3\2\2\2\u0219\u0210\3\2\2\2\u0219\u0214\3\2\2\2\u021a"+
		"#\3\2\2\2\u021b\u0220\5&\24\2\u021c\u021d\7\u014b\2\2\u021d\u021f\5&\24"+
		"\2\u021e\u021c\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221"+
		"\3\2\2\2\u0221%\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0225\5f\64\2\u0224"+
		"\u0226\7\u013b\2\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\'\3\2"+
		"\2\2\u0227\u022a\5*\26\2\u0228\u022a\5\\/\2\u0229\u0227\3\2\2\2\u0229"+
		"\u0228\3\2\2\2\u022a)\3\2\2\2\u022b\u0233\5,\27\2\u022c\u022e\7+\2\2\u022d"+
		"\u022f\t\4\2\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2"+
		"\2\2\u0230\u0232\5,\27\2\u0231\u022c\3\2\2\2\u0232\u0235\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234+\3\2\2\2\u0235\u0233\3\2\2\2"+
		"\u0236\u0238\5.\30\2\u0237\u0239\5<\37\2\u0238\u0237\3\2\2\2\u0238\u0239"+
		"\3\2\2\2\u0239\u023b\3\2\2\2\u023a\u023c\5L\'\2\u023b\u023a\3\2\2\2\u023b"+
		"\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d\u023f\5N(\2\u023e\u023d\3\2\2"+
		"\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u0242\5P)\2\u0241\u0240"+
		"\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u0245\5V,\2\u0244"+
		"\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u0248\5\u009c"+
		"O\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249"+
		"\u024b\5R*\2\u024a\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b-\3\2\2\2\u024c"+
		"\u024d\7\u00eb\2\2\u024d\u024e\5\60\31\2\u024e\u024f\5\62\32\2\u024f/"+
		"\3\2\2\2\u0250\u0254\7\4\2\2\u0251\u0254\5\u0080A\2\u0252\u0254\7\u0088"+
		"\2\2\u0253\u0250\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0252\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u0257\7\u00a4\2\2\u0256\u0255"+
		"\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259\3\2\2\2\u0258\u025a\7\u0103\2"+
		"\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u025d"+
		"\7\u00fc\2\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f\3\2\2"+
		"\2\u025e\u0260\7\u00f7\2\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0262\3\2\2\2\u0261\u0263\7\u00f8\2\2\u0262\u0261\3\2\2\2\u0262\u0263"+
		"\3\2\2\2\u0263\u0265\3\2\2\2\u0264\u0266\t\5\2\2\u0265\u0264\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0269\7\u00fa\2\2\u0268\u0267"+
		"\3\2\2\2\u0268\u0269\3\2\2\2\u0269\61\3\2\2\2\u026a\u026d\58\35\2\u026b"+
		"\u026d\5\64\33\2\u026c\u026a\3\2\2\2\u026c\u026b\3\2\2\2\u026d\u0272\3"+
		"\2\2\2\u026e\u026f\7\u014b\2\2\u026f\u0271\5\64\33\2\u0270\u026e\3\2\2"+
		"\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\63"+
		"\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0278\5h\65\2\u0276\u0278\5n8\2\u0277"+
		"\u0275\3\2\2\2\u0277\u0276\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u027b\7\63"+
		"\2\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2\2\2\u027c"+
		"\u027e\5\66\34\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0281\3"+
		"\2\2\2\u027f\u0281\5:\36\2\u0280\u0277\3\2\2\2\u0280\u027f\3\2\2\2\u0281"+
		"\65\3\2\2\2\u0282\u0285\5b\62\2\u0283\u0285\7\u0155\2\2\u0284\u0282\3"+
		"\2\2\2\u0284\u0283\3\2\2\2\u0285\67\3\2\2\2\u0286\u0287\7\u0137\2\2\u0287"+
		"9\3\2\2\2\u0288\u0289\5b\62\2\u0289\u028a\7\u013b\2\2\u028a;\3\2\2\2\u028b"+
		"\u028c\7\21\2\2\u028c\u028d\5> \2\u028d=\3\2\2\2\u028e\u0293\5@!\2\u028f"+
		"\u0290\7\u014b\2\2\u0290\u0292\5@!\2\u0291\u028f\3\2\2\2\u0292\u0295\3"+
		"\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294?\3\2\2\2\u0295\u0293"+
		"\3\2\2\2\u0296\u0297\5B\"\2\u0297\u0298\5H%\2\u0298\u029a\3\2\2\2\u0299"+
		"\u0296\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2"+
		"\2\2\u029c\u02a5\3\2\2\2\u029d\u029f\5B\"\2\u029e\u02a0\5H%\2\u029f\u029e"+
		"\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2"+
		"\u02a5\3\2\2\2\u02a3\u02a5\5B\"\2\u02a4\u0299\3\2\2\2\u02a4\u029d\3\2"+
		"\2\2\u02a4\u02a3\3\2\2\2\u02a5A\3\2\2\2\u02a6\u02a9\5f\64\2\u02a7\u02a8"+
		"\7 \2\2\u02a8\u02aa\5\u00d8m\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2"+
		"\u02aa\u02af\3\2\2\2\u02ab\u02ad\7\63\2\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad"+
		"\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\5\66\34\2\u02af\u02ac\3\2\2\2"+
		"\u02af\u02b0\3\2\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02b3\5D#\2\u02b2\u02b1"+
		"\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02bf\3\2\2\2\u02b4\u02b6\5Z.\2\u02b5"+
		"\u02b7\7\63\2\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\3"+
		"\2\2\2\u02b8\u02b9\5\66\34\2\u02b9\u02bf\3\2\2\2\u02ba\u02bb\7\u0145\2"+
		"\2\u02bb\u02bc\5> \2\u02bc\u02bd\7\u0146\2\2\u02bd\u02bf\3\2\2\2\u02be"+
		"\u02a6\3\2\2\2\u02be\u02b4\3\2\2\2\u02be\u02ba\3\2\2\2\u02bfC\3\2\2\2"+
		"\u02c0\u02c5\5F$\2\u02c1\u02c2\7\u014b\2\2\u02c2\u02c4\5F$\2\u02c3\u02c1"+
		"\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6"+
		"E\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\t\6\2\2\u02c9\u02d4\t\7\2\2"+
		"\u02ca\u02d0\7B\2\2\u02cb\u02d1\7\u00af\2\2\u02cc\u02cd\7\37\2\2\u02cd"+
		"\u02d1\7\n\2\2\u02ce\u02cf\7\22\2\2\u02cf\u02d1\7\n\2\2\u02d0\u02cb\3"+
		"\2\2\2\u02d0\u02cc\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d3\3\2\2\2\u02d2"+
		"\u02ca\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2"+
		"\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d8\7\u0145\2\2\u02d8"+
		"\u02dd\5l\67\2\u02d9\u02da\7\u014b\2\2\u02da\u02dc\5l\67\2\u02db\u02d9"+
		"\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de"+
		"\u02e0\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e1\7\u0146\2\2\u02e1G\3\2"+
		"\2\2\u02e2\u02e4\t\b\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e5\3\2\2\2\u02e5\u02e6\7\u00af\2\2\u02e6\u02e8\5B\"\2\u02e7\u02e9"+
		"\5J&\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u0301\3\2\2\2\u02ea"+
		"\u02eb\7\u0103\2\2\u02eb\u0301\5B\"\2\u02ec\u02ed\7\u0103\2\2\u02ed\u02ee"+
		"\5B\"\2\u02ee\u02ef\5J&\2\u02ef\u0301\3\2\2\2\u02f0\u02f2\t\t\2\2\u02f1"+
		"\u02f3\7\u00c7\2\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4"+
		"\3\2\2\2\u02f4\u02f5\7\u00af\2\2\u02f5\u02f6\5B\"\2\u02f6\u02f7\5J&\2"+
		"\u02f7\u0301\3\2\2\2\u02f8\u02fc\7\u00c1\2\2\u02f9\u02fd\7\u00a9\2\2\u02fa"+
		"\u02fb\t\t\2\2\u02fb\u02fd\7\u00c7\2\2\u02fc\u02f9\3\2\2\2\u02fc\u02fa"+
		"\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\7\u00af\2"+
		"\2\u02ff\u0301\5B\"\2\u0300\u02e3\3\2\2\2\u0300\u02ea\3\2\2\2\u0300\u02ec"+
		"\3\2\2\2\u0300\u02f0\3\2\2\2\u0300\u02f8\3\2\2\2\u0301I\3\2\2\2\u0302"+
		"\u0303\7J\2\2\u0303\u0307\5n8\2\u0304\u0305\7\u0118\2\2\u0305\u0307\5"+
		"j\66\2\u0306\u0302\3\2\2\2\u0306\u0304\3\2\2\2\u0307K\3\2\2\2\u0308\u0309"+
		"\7-\2\2\u0309\u030a\5n8\2\u030aM\3\2\2\2\u030b\u030c\7\22\2\2\u030c\u030d"+
		"\7\n\2\2\u030d\u0312\5\u009eP\2\u030e\u030f\7\u014b\2\2\u030f\u0311\5"+
		"\u009eP\2\u0310\u030e\3\2\2\2\u0311\u0314\3\2\2\2\u0312\u0310\3\2\2\2"+
		"\u0312\u0313\3\2\2\2\u0313\u0317\3\2\2\2\u0314\u0312\3\2\2\2\u0315\u0316"+
		"\7.\2\2\u0316\u0318\7$\2\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"O\3\2\2\2\u0319\u031a\7\23\2\2\u031a\u031b\5n8\2\u031bQ\3\2\2\2\u031c"+
		"\u0326\7\30\2\2\u031d\u0320\5T+\2\u031e\u031f\7\u014b\2\2\u031f\u0321"+
		"\5T+\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0327\3\2\2\2\u0322"+
		"\u0323\5T+\2\u0323\u0324\7\35\2\2\u0324\u0325\5T+\2\u0325\u0327\3\2\2"+
		"\2\u0326\u031d\3\2\2\2\u0326\u0322\3\2\2\2\u0327S\3\2\2\2\u0328\u032b"+
		"\5\u0098M\2\u0329\u032b\5\u0096L\2\u032a\u0328\3\2\2\2\u032a\u0329\3\2"+
		"\2\2\u032bU\3\2\2\2\u032c\u032d\7\u0121\2\2\u032d\u0332\5X-\2\u032e\u032f"+
		"\7\u014b\2\2\u032f\u0331\5X-\2\u0330\u032e\3\2\2\2\u0331\u0334\3\2\2\2"+
		"\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333W\3\2\2\2\u0334\u0332\3"+
		"\2\2\2\u0335\u0336\5\u00d6l\2\u0336\u0337\7\63\2\2\u0337\u0338\7\u0145"+
		"\2\2\u0338\u0339\5\u00bc_\2\u0339\u033a\7\u0146\2\2\u033aY\3\2\2\2\u033b"+
		"\u033c\7\u0145\2\2\u033c\u033d\5*\26\2\u033d\u033e\7\u0146\2\2\u033e["+
		"\3\2\2\2\u033f\u0341\7.\2\2\u0340\u0342\7\u00d8\2\2\u0341\u0340\3\2\2"+
		"\2\u0341\u0342\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0348\5^\60\2\u0344\u0345"+
		"\7\u014b\2\2\u0345\u0347\5^\60\2\u0346\u0344\3\2\2\2\u0347\u034a\3\2\2"+
		"\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034b\3\2\2\2\u034a\u0348"+
		"\3\2\2\2\u034b\u034c\5*\26\2\u034c]\3\2\2\2\u034d\u034f\5\u00d6l\2\u034e"+
		"\u0350\5j\66\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351\3\2"+
		"\2\2\u0351\u0352\7\63\2\2\u0352\u0353\5Z.\2\u0353_\3\2\2\2\u0354\u0355"+
		"\t\n\2\2\u0355a\3\2\2\2\u0356\u0359\7\u0154\2\2\u0357\u0359\5d\63\2\u0358"+
		"\u0356\3\2\2\2\u0358\u0357\3\2\2\2\u0359c\3\2\2\2\u035a\u035b\t\13\2\2"+
		"\u035be\3\2\2\2\u035c\u035d\5b\62\2\u035d\u035e\7\u013a\2\2\u035e\u0360"+
		"\3\2\2\2\u035f\u035c\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361"+
		"\u0362\5b\62\2\u0362g\3\2\2\2\u0363\u0364\5b\62\2\u0364\u0365\7\u013a"+
		"\2\2\u0365\u0367\3\2\2\2\u0366\u0363\3\2\2\2\u0366\u0367\3\2\2\2\u0367"+
		"\u0368\3\2\2\2\u0368\u0369\5b\62\2\u0369i\3\2\2\2\u036a\u036b\7\u0145"+
		"\2\2\u036b\u0370\5h\65\2\u036c\u036d\7\u014b\2\2\u036d\u036f\5h\65\2\u036e"+
		"\u036c\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2"+
		"\2\2\u0371\u0373\3\2\2\2\u0372\u0370\3\2\2\2\u0373\u0374\7\u0146\2\2\u0374"+
		"k\3\2\2\2\u0375\u0376\5b\62\2\u0376m\3\2\2\2\u0377\u0378\b8\1\2\u0378"+
		"\u0379\7\u0145\2\2\u0379\u037a\5n8\2\u037a\u037b\7\u0146\2\2\u037b\u0380"+
		"\3\2\2\2\u037c\u037d\t\f\2\2\u037d\u0380\5n8\4\u037e\u0380\5p9\2\u037f"+
		"\u0377\3\2\2\2\u037f\u037c\3\2\2\2\u037f\u037e\3\2\2\2\u0380\u0392\3\2"+
		"\2\2\u0381\u0382\f\n\2\2\u0382\u0383\7\5\2\2\u0383\u0391\5n8\13\u0384"+
		"\u0385\f\t\2\2\u0385\u0386\7\u012a\2\2\u0386\u0391\5n8\n\u0387\u0388\f"+
		"\b\2\2\u0388\u0389\7\36\2\2\u0389\u0391\5n8\t\u038a\u038b\f\7\2\2\u038b"+
		"\u038c\7\u012b\2\2\u038c\u0391\5n8\b\u038d\u038e\f\6\2\2\u038e\u038f\7"+
		"/\2\2\u038f\u0391\5n8\7\u0390\u0381\3\2\2\2\u0390\u0384\3\2\2\2\u0390"+
		"\u0387\3\2\2\2\u0390\u038a\3\2\2\2\u0390\u038d\3\2\2\2\u0391\u0394\3\2"+
		"\2\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393o\3\2\2\2\u0394\u0392"+
		"\3\2\2\2\u0395\u0396\b9\1\2\u0396\u0397\5t;\2\u0397\u03ac\3\2\2\2\u0398"+
		"\u0399\f\7\2\2\u0399\u039b\7\25\2\2\u039a\u039c\7\33\2\2\u039b\u039a\3"+
		"\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u03ab\t\r\2\2\u039e"+
		"\u039f\f\6\2\2\u039f\u03a0\7\u013c\2\2\u03a0\u03ab\5t;\2\u03a1\u03a2\f"+
		"\5\2\2\u03a2\u03a3\5r:\2\u03a3\u03a4\5t;\2\u03a4\u03ab\3\2\2\2\u03a5\u03a6"+
		"\f\4\2\2\u03a6\u03a7\5r:\2\u03a7\u03a8\t\16\2\2\u03a8\u03a9\5Z.\2\u03a9"+
		"\u03ab\3\2\2\2\u03aa\u0398\3\2\2\2\u03aa\u039e\3\2\2\2\u03aa\u03a1\3\2"+
		"\2\2\u03aa\u03a5\3\2\2\2\u03ab\u03ae\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac"+
		"\u03ad\3\2\2\2\u03adq\3\2\2\2\u03ae\u03ac\3\2\2\2\u03af\u03b0\t\17\2\2"+
		"\u03b0s\3\2\2\2\u03b1\u03b3\5v<\2\u03b2\u03b4\7\33\2\2\u03b3\u03b2\3\2"+
		"\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b6\7\24\2\2\u03b6"+
		"\u03b7\5Z.\2\u03b7\u03e9\3\2\2\2\u03b8\u03ba\5v<\2\u03b9\u03bb\7\33\2"+
		"\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03bd"+
		"\7\24\2\2\u03bd\u03be\7\u0145\2\2\u03be\u03c3\5n8\2\u03bf\u03c0\7\u014b"+
		"\2\2\u03c0\u03c2\5n8\2\u03c1\u03bf\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3\u03c1"+
		"\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c6\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c6"+
		"\u03c7\7\u0146\2\2\u03c7\u03e9\3\2\2\2\u03c8\u03ca\5v<\2\u03c9\u03cb\7"+
		"\33\2\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc"+
		"\u03cd\7\b\2\2\u03cd\u03ce\5v<\2\u03ce\u03cf\7\5\2\2\u03cf\u03d0\5t;\2"+
		"\u03d0\u03e9\3\2\2\2\u03d1\u03d2\5v<\2\u03d2\u03d3\7\'\2\2\u03d3\u03d4"+
		"\7\27\2\2\u03d4\u03d5\5v<\2\u03d5\u03e9\3\2\2\2\u03d6\u03d8\5v<\2\u03d7"+
		"\u03d9\7\33\2\2\u03d8\u03d7\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\3"+
		"\2\2\2\u03da\u03db\7\27\2\2\u03db\u03de\5x=\2\u03dc\u03dd\7\16\2\2\u03dd"+
		"\u03df\5x=\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e9\3\2\2"+
		"\2\u03e0\u03e2\5v<\2\u03e1\u03e3\7\33\2\2\u03e2\u03e1\3\2\2\2\u03e2\u03e3"+
		"\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5\7\"\2\2\u03e5\u03e6\5v<\2\u03e6"+
		"\u03e9\3\2\2\2\u03e7\u03e9\5v<\2\u03e8\u03b1\3\2\2\2\u03e8\u03b8\3\2\2"+
		"\2\u03e8\u03c8\3\2\2\2\u03e8\u03d1\3\2\2\2\u03e8\u03d6\3\2\2\2\u03e8\u03e0"+
		"\3\2\2\2\u03e8\u03e7\3\2\2\2\u03e9u\3\2\2\2\u03ea\u03eb\b<\1\2\u03eb\u03ec"+
		"\5x=\2\u03ec\u0419\3\2\2\2\u03ed\u03ee\f\21\2\2\u03ee\u03ef\7\u012e\2"+
		"\2\u03ef\u0418\5v<\22\u03f0\u03f1\f\20\2\2\u03f1\u03f2\7\u012f\2\2\u03f2"+
		"\u0418\5v<\21\u03f3\u03f4\f\17\2\2\u03f4\u03f5\7\u0130\2\2\u03f5\u0418"+
		"\5v<\20\u03f6\u03f7\f\16\2\2\u03f7\u03f8\7\u0131\2\2\u03f8\u0418\5v<\17"+
		"\u03f9\u03fa\f\r\2\2\u03fa\u03fb\7\u0135\2\2\u03fb\u0418\5v<\16\u03fc"+
		"\u03fd\f\f\2\2\u03fd\u03fe\7\u0136\2\2\u03fe\u0418\5v<\r\u03ff\u0400\f"+
		"\13\2\2\u0400\u0401\7\u0137\2\2\u0401\u0418\5v<\f\u0402\u0403\f\n\2\2"+
		"\u0403\u0404\7\u0138\2\2\u0404\u0418\5v<\13\u0405\u0406\f\t\2\2\u0406"+
		"\u0407\7\32\2\2\u0407\u0418\5v<\n\u0408\u0409\f\b\2\2\u0409\u040a\7\31"+
		"\2\2\u040a\u0418\5v<\t\u040b\u040c\f\7\2\2\u040c\u040d\7\u0133\2\2\u040d"+
		"\u0418\5v<\b\u040e\u040f\f\6\2\2\u040f\u0410\7\u0132\2\2\u0410\u0418\5"+
		"v<\7\u0411\u0412\f\5\2\2\u0412\u0413\7\u0135\2\2\u0413\u0418\5\u0090I"+
		"\2\u0414\u0415\f\4\2\2\u0415\u0416\7\u0136\2\2\u0416\u0418\5\u0090I\2"+
		"\u0417\u03ed\3\2\2\2\u0417\u03f0\3\2\2\2\u0417\u03f3\3\2\2\2\u0417\u03f6"+
		"\3\2\2\2\u0417\u03f9\3\2\2\2\u0417\u03fc\3\2\2\2\u0417\u03ff\3\2\2\2\u0417"+
		"\u0402\3\2\2\2\u0417\u0405\3\2\2\2\u0417\u0408\3\2\2\2\u0417\u040b\3\2"+
		"\2\2\u0417\u040e\3\2\2\2\u0417\u0411\3\2\2\2\u0417\u0414\3\2\2\2\u0418"+
		"\u041b\3\2\2\2\u0419\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041aw\3\2\2\2"+
		"\u041b\u0419\3\2\2\2\u041c\u041d\b=\1\2\u041d\u0438\5z>\2\u041e\u0438"+
		"\5\u0094K\2\u041f\u0438\5h\65\2\u0420\u0438\5\u0092J\2\u0421\u0422\t\20"+
		"\2\2\u0422\u0438\5x=\7\u0423\u0425\7%\2\2\u0424\u0423\3\2\2\2\u0424\u0425"+
		"\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427\7\u0145\2\2\u0427\u042c\5n8\2"+
		"\u0428\u0429\7\u014b\2\2\u0429\u042b\5n8\2\u042a\u0428\3\2\2\2\u042b\u042e"+
		"\3\2\2\2\u042c\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042f\3\2\2\2\u042e"+
		"\u042c\3\2\2\2\u042f\u0430\7\u0146\2\2\u0430\u0438\3\2\2\2\u0431\u0433"+
		"\7\17\2\2\u0432\u0431\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0434\3\2\2\2"+
		"\u0434\u0438\5Z.\2\u0435\u0438\5\u0082B\2\u0436\u0438\5\u0090I\2\u0437"+
		"\u041c\3\2\2\2\u0437\u041e\3\2\2\2\u0437\u041f\3\2\2\2\u0437\u0420\3\2"+
		"\2\2\u0437\u0421\3\2\2\2\u0437\u0424\3\2\2\2\u0437\u0432\3\2\2\2\u0437"+
		"\u0435\3\2\2\2\u0437\u0436\3\2\2\2\u0438\u0440\3\2\2\2\u0439\u043a\f\b"+
		"\2\2\u043a\u043b\7\u012a\2\2\u043b\u043f\5x=\t\u043c\u043d\f\n\2\2\u043d"+
		"\u043f\5\u00d4k\2\u043e\u0439\3\2\2\2\u043e\u043c\3\2\2\2\u043f\u0442"+
		"\3\2\2\2\u0440\u043e\3\2\2\2\u0440\u0441\3\2\2\2\u0441y\3\2\2\2\u0442"+
		"\u0440\3\2\2\2\u0443\u0444\5|?\2\u0444\u0446\7\u0145\2\2\u0445\u0447\5"+
		"\u0080A\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0451\3\2\2\2"+
		"\u0448\u044d\5n8\2\u0449\u044a\7\u014b\2\2\u044a\u044c\5n8\2\u044b\u0449"+
		"\3\2\2\2\u044c\u044f\3\2\2\2\u044d\u044b\3\2\2\2\u044d\u044e\3\2\2\2\u044e"+
		"\u0452\3\2\2\2\u044f\u044d\3\2\2\2\u0450\u0452\7\u0137\2\2\u0451\u0448"+
		"\3\2\2\2\u0451\u0450\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453\3\2\2\2\u0453"+
		"\u0454\7\u0146\2\2\u0454\u0457\3\2\2\2\u0455\u0457\5~@\2\u0456\u0443\3"+
		"\2\2\2\u0456\u0455\3\2\2\2\u0457{\3\2\2\2\u0458\u0467\5b\62\2\u0459\u0467"+
		"\7\u00a6\2\2\u045a\u0467\7\u0080\2\2\u045b\u0467\7\u00b7\2\2\u045c\u0467"+
		"\7\u00b8\2\2\u045d\u0467\7\u00c3\2\2\u045e\u0467\7\u00e0\2\2\u045f\u0467"+
		"\7i\2\2\u0460\u0467\7}\2\2\u0461\u0467\7\u00cf\2\2\u0462\u0467\7n\2\2"+
		"\u0463\u0467\7l\2\2\u0464\u0467\7\u0110\2\2\u0465\u0467\7\u011f\2\2\u0466"+
		"\u0458\3\2\2\2\u0466\u0459\3\2\2\2\u0466\u045a\3\2\2\2\u0466\u045b\3\2"+
		"\2\2\u0466\u045c\3\2\2\2\u0466\u045d\3\2\2\2\u0466\u045e\3\2\2\2\u0466"+
		"\u045f\3\2\2\2\u0466\u0460\3\2\2\2\u0466\u0461\3\2\2\2\u0466\u0462\3\2"+
		"\2\2\u0466\u0463\3\2\2\2\u0466\u0464\3\2\2\2\u0466\u0465\3\2\2\2\u0467"+
		"}\3\2\2\2\u0468\u0473\5\u00a0Q\2\u0469\u0473\5\u00b8]\2\u046a\u0473\5"+
		"\u00a2R\2\u046b\u0473\5\u00a4S\2\u046c\u0473\5\u00a6T\2\u046d\u0473\5"+
		"\u00a8U\2\u046e\u0473\5\u00aaV\2\u046f\u0473\5\u00acW\2\u0470\u0473\5"+
		"\u00aeX\2\u0471\u0473\5\u00b0Y\2\u0472\u0468\3\2\2\2\u0472\u0469\3\2\2"+
		"\2\u0472\u046a\3\2\2\2\u0472\u046b\3\2\2\2\u0472\u046c\3\2\2\2\u0472\u046d"+
		"\3\2\2\2\u0472\u046e\3\2\2\2\u0472\u046f\3\2\2\2\u0472\u0470\3\2\2\2\u0472"+
		"\u0471\3\2\2\2\u0473\177\3\2\2\2\u0474\u0475\7\r\2\2\u0475\u0081\3\2\2"+
		"\2\u0476\u0479\5\u0088E\2\u0477\u0479\5\u0084C\2\u0478\u0476\3\2\2\2\u0478"+
		"\u0477\3\2\2\2\u0479\u0083\3\2\2\2\u047a\u047b\7h\2\2\u047b\u047d\5x="+
		"\2\u047c\u047e\5\u0086D\2\u047d\u047c\3\2\2\2\u047e\u047f\3\2\2\2\u047f"+
		"\u047d\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0482\3\2\2\2\u0481\u0483\5\u008c"+
		"G\2\u0482\u0481\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0484\3\2\2\2\u0484"+
		"\u0485\7\u008f\2\2\u0485\u0085\3\2\2\2\u0486\u0487\7\u0120\2\2\u0487\u0488"+
		"\5x=\2\u0488\u0489\7\u010d\2\2\u0489\u048a\5\u008eH\2\u048a\u0087\3\2"+
		"\2\2\u048b\u048d\7h\2\2\u048c\u048e\5\u008aF\2\u048d\u048c\3\2\2\2\u048e"+
		"\u048f\3\2\2\2\u048f\u048d\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0492\3\2"+
		"\2\2\u0491\u0493\5\u008cG\2\u0492\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493"+
		"\u0494\3\2\2\2\u0494\u0495\7\u008f\2\2\u0495\u0089\3\2\2\2\u0496\u0497"+
		"\7\u0120\2\2\u0497\u0498\5n8\2\u0498\u0499\7\u010d\2\2\u0499\u049a\5\u008e"+
		"H\2\u049a\u008b\3\2\2\2\u049b\u049c\7\u008c\2\2\u049c\u049d\5\u008eH\2"+
		"\u049d\u008d\3\2\2\2\u049e\u049f\5n8\2\u049f\u008f\3\2\2\2\u04a0\u04a1"+
		"\7\u00ad\2\2\u04a1\u04a2\5n8\2\u04a2\u04a3\5\u00d6l\2\u04a3\u0091\3\2"+
		"\2\2\u04a4\u04a5\7\u0150\2\2\u04a5\u04a7\7\u0150\2\2\u04a6\u04a4\3\2\2"+
		"\2\u04a6\u04a7\3\2\2\2\u04a7\u04a9\3\2\2\2\u04a8\u04aa\t\21\2\2\u04a9"+
		"\u04a8\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ac\3\2\2\2\u04ab\u04ad\7\u013a"+
		"\2\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae"+
		"\u04af\5b\62\2\u04af\u0093\3\2\2\2\u04b0\u04cb\5\u0096L\2\u04b1\u04cb"+
		"\5\u0098M\2\u04b2\u04cb\7*\2\2\u04b3\u04cb\7\20\2\2\u04b4\u04cb\7\34\2"+
		"\2\u04b5\u04b6\7\u0147\2\2\u04b6\u04b7\5b\62\2\u04b7\u04b8\7\u0155\2\2"+
		"\u04b8\u04b9\7\u0148\2\2\u04b9\u04cb\3\2\2\2\u04ba\u04cb\7\u0157\2\2\u04bb"+
		"\u04cb\5\u009aN\2\u04bc\u04bd\5b\62\2\u04bd\u04bf\7\u0155\2\2\u04be\u04c0"+
		"\5\u00d4k\2\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04cb\3\2\2"+
		"\2\u04c1\u04c2\t\22\2\2\u04c2\u04cb\7\u0155\2\2\u04c3\u04c5\5\u00d2j\2"+
		"\u04c4\u04c3\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c8"+
		"\7\u0158\2\2\u04c7\u04c9\5\u00d4k\2\u04c8\u04c7\3\2\2\2\u04c8\u04c9\3"+
		"\2\2\2\u04c9\u04cb\3\2\2\2\u04ca\u04b0\3\2\2\2\u04ca\u04b1\3\2\2\2\u04ca"+
		"\u04b2\3\2\2\2\u04ca\u04b3\3\2\2\2\u04ca\u04b4\3\2\2\2\u04ca\u04b5\3\2"+
		"\2\2\u04ca\u04ba\3\2\2\2\u04ca\u04bb\3\2\2\2\u04ca\u04bc\3\2\2\2\u04ca"+
		"\u04c1\3\2\2\2\u04ca\u04c4\3\2\2\2\u04cb\u0095\3\2\2\2\u04cc\u04cd\7\u014f"+
		"\2\2\u04cd\u0097\3\2\2\2\u04ce\u04cf\7\u0156\2\2\u04cf\u0099\3\2\2\2\u04d0"+
		"\u04d1\7\u0155\2\2\u04d1\u009b\3\2\2\2\u04d2\u04d3\7\37\2\2\u04d3\u04d4"+
		"\7\n\2\2\u04d4\u04d9\5\u009eP\2\u04d5\u04d6\7\u014b\2\2\u04d6\u04d8\5"+
		"\u009eP\2\u04d7\u04d5\3\2\2\2\u04d8\u04db\3\2\2\2\u04d9\u04d7\3\2\2\2"+
		"\u04d9\u04da\3\2\2\2\u04da\u009d\3\2\2\2\u04db\u04d9\3\2\2\2\u04dc\u04e0"+
		"\5h\65\2\u04dd\u04e0\5\u0098M\2\u04de\u04e0\5n8\2\u04df\u04dc\3\2\2\2"+
		"\u04df\u04dd\3\2\2\2\u04df\u04de\3\2\2\2\u04e0\u04e2\3\2\2\2\u04e1\u04e3"+
		"\t\23\2\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u009f\3\2\2\2"+
		"\u04e4\u04e5\7\u00a1\2\2\u04e5\u04e7\7\u0145\2\2\u04e6\u04e8\5\u0080A"+
		"\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04f2\3\2\2\2\u04e9\u04ee"+
		"\5n8\2\u04ea\u04eb\7\u014b\2\2\u04eb\u04ed\5n8\2\u04ec\u04ea\3\2\2\2\u04ed"+
		"\u04f0\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f3\3\2"+
		"\2\2\u04f0\u04ee\3\2\2\2\u04f1\u04f3\7\u0137\2\2\u04f2\u04e9\3\2\2\2\u04f2"+
		"\u04f1\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f9\3\2\2\2\u04f4\u04f7\5\u009c"+
		"O\2\u04f5\u04f6\7\u00ec\2\2\u04f6\u04f8\5n8\2\u04f7\u04f5\3\2\2\2\u04f7"+
		"\u04f8\3\2\2\2\u04f8\u04fa\3\2\2\2\u04f9\u04f4\3\2\2\2\u04f9\u04fa\3\2"+
		"\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\7\u0146\2\2\u04fc\u00a1\3\2\2\2\u04fd"+
		"\u04fe\7i\2\2\u04fe\u04ff\7\u0145\2\2\u04ff\u0500\5n8\2\u0500\u0501\7"+
		"\63\2\2\u0501\u0502\5\u00ccg\2\u0502\u0503\7\u0146\2\2\u0503\u00a3\3\2"+
		"\2\2\u0504\u0505\7}\2\2\u0505\u0506\7\u0145\2\2\u0506\u0507\5n8\2\u0507"+
		"\u0508\7\u014b\2\2\u0508\u0509\5\u00ccg\2\u0509\u050a\7\u0146\2\2\u050a"+
		"\u0513\3\2\2\2\u050b\u050c\7}\2\2\u050c\u050d\7\u0145\2\2\u050d\u050e"+
		"\5n8\2\u050e\u050f\7\u0118\2\2\u050f\u0510\5\u00d6l\2\u0510\u0511\7\u0146"+
		"\2\2\u0511\u0513\3\2\2\2\u0512\u0504\3\2\2\2\u0512\u050b\3\2\2\2\u0513"+
		"\u00a5\3\2\2\2\u0514\u0515\7\u00cf\2\2\u0515\u0516\7\u0145\2\2\u0516\u0517"+
		"\5n8\2\u0517\u0518\7\24\2\2\u0518\u0519\5n8\2\u0519\u051a\7\u0146\2\2"+
		"\u051a\u00a7\3\2\2\2\u051b\u051c\t\24\2\2\u051c\u051d\7\u0145\2\2\u051d"+
		"\u051e\5n8\2\u051e\u051f\7\21\2\2\u051f\u0522\7\u0156\2\2\u0520\u0521"+
		"\7B\2\2\u0521\u0523\7\u0156\2\2\u0522\u0520\3\2\2\2\u0522\u0523\3\2\2"+
		"\2\u0523\u0524\3\2\2\2\u0524\u0525\7\u0146\2\2\u0525\u00a9\3\2\2\2\u0526"+
		"\u0527\7\u0096\2\2\u0527\u0528\7\u0145\2\2\u0528\u0529\5b\62\2\u0529\u052a"+
		"\7\21\2\2\u052a\u052b\5n8\2\u052b\u052c\7\u0146\2\2\u052c\u00ab\3\2\2"+
		"\2\u052d\u052e\7l\2\2\u052e\u052f\7\u0145\2\2\u052f\u0534\5n8\2\u0530"+
		"\u0531\7\u014b\2\2\u0531\u0533\5n8\2\u0532\u0530\3\2\2\2\u0533\u0536\3"+
		"\2\2\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0539\3\2\2\2\u0536"+
		"\u0534\3\2\2\2\u0537\u0538\7\u0118\2\2\u0538\u053a\5\u00d6l\2\u0539\u0537"+
		"\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053c\7\u0146\2"+
		"\2\u053c\u00ad\3\2\2\2\u053d\u053e\7\u0110\2\2\u053e\u053f\7\u0145\2\2"+
		"\u053f\u0540\t\25\2\2\u0540\u0541\7\u0155\2\2\u0541\u0542\7\21\2\2\u0542"+
		"\u0543\7\u0155\2\2\u0543\u0544\7\u0146\2\2\u0544\u00af\3\2\2\2\u0545\u0546"+
		"\7\u011f\2\2\u0546\u0547\7\u0145\2\2\u0547\u054a\5n8\2\u0548\u0549\7\63"+
		"\2\2\u0549\u054b\5\u00ccg\2\u054a\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b"+
		"\u054d\3\2\2\2\u054c\u054e\5\u00b2Z\2\u054d\u054c\3\2\2\2\u054d\u054e"+
		"\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0550\7\u0146\2\2\u0550\u00b1\3\2\2"+
		"\2\u0551\u0556\7H\2\2\u0552\u0557\5\u00b4[\2\u0553\u0554\7\u0156\2\2\u0554"+
		"\u0555\7\u0136\2\2\u0555\u0557\7\u0156\2\2\u0556\u0552\3\2\2\2\u0556\u0553"+
		"\3\2\2\2\u0557\u00b3\3\2\2\2\u0558\u055d\5\u00b6\\\2\u0559\u055a\7\u014b"+
		"\2\2\u055a\u055c\5\u00b6\\\2\u055b\u0559\3\2\2\2\u055c\u055f\3\2\2\2\u055d"+
		"\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u00b5\3\2\2\2\u055f\u055d\3\2"+
		"\2\2\u0560\u0562\7\u0156\2\2\u0561\u0563\t\23\2\2\u0562\u0561\3\2\2\2"+
		"\u0562\u0563\3\2\2\2\u0563\u0565\3\2\2\2\u0564\u0566\7\u00e5\2\2\u0565"+
		"\u0564\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u00b7\3\2\2\2\u0567\u0568\5b"+
		"\62\2\u0568\u0569\7\u0145\2\2\u0569\u056e\5n8\2\u056a\u056b\7\u014b\2"+
		"\2\u056b\u056d\5n8\2\u056c\u056a\3\2\2\2\u056d\u0570\3\2\2\2\u056e\u056c"+
		"\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0571\3\2\2\2\u0570\u056e\3\2\2\2\u0571"+
		"\u0572\7\u0146\2\2\u0572\u0573\5\u00ba^\2\u0573\u00b9\3\2\2\2\u0574\u0575"+
		"\7\u00c8\2\2\u0575\u0576\7\u0145\2\2\u0576\u0577\5\u00bc_\2\u0577\u0578"+
		"\7\u0146\2\2\u0578\u057c\3\2\2\2\u0579\u057a\7\u00c8\2\2\u057a\u057c\5"+
		"b\62\2\u057b\u0574\3\2\2\2\u057b\u0579\3\2\2\2\u057c\u00bb\3\2\2\2\u057d"+
		"\u057f\5b\62\2\u057e\u057d\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0581\3\2"+
		"\2\2\u0580\u0582\5\u00be`\2\u0581\u0580\3\2\2\2\u0581\u0582\3\2\2\2\u0582"+
		"\u0584\3\2\2\2\u0583\u0585\5\u009cO\2\u0584\u0583\3\2\2\2\u0584\u0585"+
		"\3\2\2\2\u0585\u0587\3\2\2\2\u0586\u0588\5\u00c0a\2\u0587\u0586\3\2\2"+
		"\2\u0587\u0588\3\2\2\2\u0588\u00bd\3\2\2\2\u0589\u058a\7 \2\2\u058a\u058b"+
		"\7\n\2\2\u058b\u0590\5n8\2\u058c\u058d\7\u014b\2\2\u058d\u058f\5n8\2\u058e"+
		"\u058c\3\2\2\2\u058f\u0592\3\2\2\2\u0590\u058e\3\2\2\2\u0590\u0591\3\2"+
		"\2\2\u0591\u00bf\3\2\2\2\u0592\u0590\3\2\2\2\u0593\u0594\5\u00c2b\2\u0594"+
		"\u0595\5\u00c4c\2\u0595\u00c1\3\2\2\2\u0596\u0597\t\26\2\2\u0597\u00c3"+
		"\3\2\2\2\u0598\u059b\5\u00c6d\2\u0599\u059b\5\u00c8e\2\u059a\u0598\3\2"+
		"\2\2\u059a\u0599\3\2\2\2\u059b\u00c5\3\2\2\2\u059c\u059d\7;\2\2\u059d"+
		"\u05a9\7%\2\2\u059e\u059f\7\u0111\2\2\u059f\u05a9\7\u00d0\2\2\u05a0\u05a1"+
		"\7\u0111\2\2\u05a1\u05a9\7\u009c\2\2\u05a2\u05a3\5n8\2\u05a3\u05a4\7\u00d0"+
		"\2\2\u05a4\u05a9\3\2\2\2\u05a5\u05a6\5n8\2\u05a6\u05a7\7\u009c\2\2\u05a7"+
		"\u05a9\3\2\2\2\u05a8\u059c\3\2\2\2\u05a8\u059e\3\2\2\2\u05a8\u05a0\3\2"+
		"\2\2\u05a8\u05a2\3\2\2\2\u05a8\u05a5\3\2\2\2\u05a9\u00c7\3\2\2\2\u05aa"+
		"\u05ab\7\b\2\2\u05ab\u05ac\5\u00c6d\2\u05ac\u05ad\7\5\2\2\u05ad\u05ae"+
		"\5\u00caf\2\u05ae\u00c9\3\2\2\2\u05af\u05b0\5\u00c6d\2\u05b0\u00cb\3\2"+
		"\2\2\u05b1\u05b3\5\u00ceh\2\u05b2\u05b4\5\u00d0i\2\u05b3\u05b2\3\2\2\2"+
		"\u05b3\u05b4\3\2\2\2\u05b4\u05b6\3\2\2\2\u05b5\u05b7\5\u00d2j\2\u05b6"+
		"\u05b5\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b9\3\2\2\2\u05b8\u05ba\5\u00d4"+
		"k\2\u05b9\u05b8\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bc\3\2\2\2\u05bb"+
		"\u05bd\7\u0113\2\2\u05bc\u05bb\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf"+
		"\3\2\2\2\u05be\u05c0\7\u0124\2\2\u05bf\u05be\3\2\2\2\u05bf\u05c0\3\2\2"+
		"\2\u05c0\u05d3\3\2\2\2\u05c1\u05c2\5\u00ceh\2\u05c2\u05c3\7\u0145\2\2"+
		"\u05c3\u05c8\7\u0155\2\2\u05c4\u05c5\7\u014b\2\2\u05c5\u05c7\7\u0155\2"+
		"\2\u05c6\u05c4\3\2\2\2\u05c7\u05ca\3\2\2\2\u05c8\u05c6\3\2\2\2\u05c8\u05c9"+
		"\3\2\2\2\u05c9\u05cb\3\2\2\2\u05ca\u05c8\3\2\2\2\u05cb\u05cd\7\u0146\2"+
		"\2\u05cc\u05ce\5\u00d2j\2\u05cd\u05cc\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce"+
		"\u05d0\3\2\2\2\u05cf\u05d1\5\u00d4k\2\u05d0\u05cf\3\2\2\2\u05d0\u05d1"+
		"\3\2\2\2\u05d1\u05d3\3\2\2\2\u05d2\u05b1\3\2\2\2\u05d2\u05c1\3\2\2\2\u05d3"+
		"\u00cd\3\2\2\2\u05d4\u05d6\5b\62\2\u05d5\u05d7\5b\62\2\u05d6\u05d5\3\2"+
		"\2\2\u05d6\u05d7\3\2\2\2\u05d7\u00cf\3\2\2\2\u05d8\u05d9\7\u0145\2\2\u05d9"+
		"\u05dc\7\u0156\2\2\u05da\u05db\7\u014b\2\2\u05db\u05dd\7\u0156\2\2\u05dc"+
		"\u05da\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\7\u0146"+
		"\2\2\u05df\u00d1\3\2\2\2\u05e0\u05e1\t\27\2\2\u05e1\u05e3\7&\2\2\u05e2"+
		"\u05e4\7\u013e\2\2\u05e3\u05e2\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e5"+
		"\3\2\2\2\u05e5\u05ec\5\u00d6l\2\u05e6\u05e8\7n\2\2\u05e7\u05e9\7\u013e"+
		"\2\2\u05e8\u05e7\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea"+
		"\u05ec\5\u00d6l\2\u05eb\u05e0\3\2\2\2\u05eb\u05e6\3\2\2\2\u05ec\u00d3"+
		"\3\2\2\2\u05ed\u05ef\7s\2\2\u05ee\u05f0\7\u013e\2\2\u05ef\u05ee\3\2\2"+
		"\2\u05ef\u05f0\3\2\2\2\u05f0\u05f3\3\2\2\2\u05f1\u05f4\7\u0155\2\2\u05f2"+
		"\u05f4\5\u00d6l\2\u05f3\u05f1\3\2\2\2\u05f3\u05f2\3\2\2\2\u05f4\u00d5"+
		"\3\2\2\2\u05f5\u05f8\5b\62\2\u05f6\u05f7\7\u013a\2\2\u05f7\u05f9\5b\62"+
		"\2\u05f8\u05f6\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u00d7\3\2\2\2\u05fa\u05ff"+
		"\5\u00d6l\2\u05fb\u05fc\7\u014b\2\2\u05fc\u05fe\5\u00d6l\2\u05fd\u05fb"+
		"\3\2\2\2\u05fe\u0601\3\2\2\2\u05ff\u05fd\3\2\2\2\u05ff\u0600\3\2\2\2\u0600"+
		"\u00d9\3\2\2\2\u0601\u05ff\3\2\2\2\u0602\u0604\7:\2\2\u0603\u0605\7\u010b"+
		"\2\2\u0604\u0603\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0606\3\2\2\2\u0606"+
		"\u060a\7U\2\2\u0607\u0608\7\u00a6\2\2\u0608\u0609\7\33\2\2\u0609\u060b"+
		"\7\17\2\2\u060a\u0607\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2\2\2"+
		"\u060c\u0612\5f\64\2\u060d\u060e\7\u0145\2\2\u060e\u060f\5\u00dco\2\u060f"+
		"\u0610\7\u0146\2\2\u0610\u0613\3\2\2\2\u0611\u0613\5\u0102\u0082\2\u0612"+
		"\u060d\3\2\2\2\u0612\u0611\3\2\2\2\u0613\u00db\3\2\2\2\u0614\u0619\5\u00de"+
		"p\2\u0615\u0616\7\u014b\2\2\u0616\u0618\5\u00dep\2\u0617\u0615\3\2\2\2"+
		"\u0618\u061b\3\2\2\2\u0619\u0617\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u00dd"+
		"\3\2\2\2\u061b\u0619\3\2\2\2\u061c\u0621\5\u00e0q\2\u061d\u0621\5\u00ec"+
		"w\2\u061e\u0621\5\u00f6|\2\u061f\u0621\5\u0100\u0081\2\u0620\u061c\3\2"+
		"\2\2\u0620\u061d\3\2\2\2\u0620\u061e\3\2\2\2\u0620\u061f\3\2\2\2\u0621"+
		"\u00df\3\2\2\2\u0622\u0623\5h\65\2\u0623\u0630\5\u00ccg\2\u0624\u0626"+
		"\5\u00e2r\2\u0625\u0624\3\2\2\2\u0626\u0629\3\2\2\2\u0627\u0625\3\2\2"+
		"\2\u0627\u0628\3\2\2\2\u0628\u0631\3\2\2\2\u0629\u0627\3\2\2\2\u062a\u062c"+
		"\5\u00e4s\2\u062b\u062a\3\2\2\2\u062c\u062f\3\2\2\2\u062d\u062b\3\2\2"+
		"\2\u062d\u062e\3\2\2\2\u062e\u0631\3\2\2\2\u062f\u062d\3\2\2\2\u0630\u0627"+
		"\3\2\2\2\u0630\u062d\3\2\2\2\u0631\u00e1\3\2\2\2\u0632\u063e\5\u00e6t"+
		"\2\u0633\u063e\7a\2\2\u0634\u0637\7=\2\2\u0635\u0638\5\u0094K\2\u0636"+
		"\u0638\5n8\2\u0637\u0635\3\2\2\2\u0637\u0636\3\2\2\2\u0638\u063e\3\2\2"+
		"\2\u0639\u063a\7u\2\2\u063a\u063e\t\30\2\2\u063b\u063c\7\u0101\2\2\u063c"+
		"\u063e\t\31\2\2\u063d\u0632\3\2\2\2\u063d\u0633\3\2\2\2\u063d\u0634\3"+
		"\2\2\2\u063d\u0639\3\2\2\2\u063d\u063b\3\2\2\2\u063e\u00e3\3\2\2\2\u063f"+
		"\u0648\5\u00e6t\2\u0640\u0641\7E\2\2\u0641\u0643\7\62\2\2\u0642\u0640"+
		"\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0645\7\63\2\2"+
		"\u0645\u0648\5n8\2\u0646\u0648\t\32\2\2\u0647\u063f\3\2\2\2\u0647\u0642"+
		"\3\2\2\2\u0647\u0646\3\2\2\2\u0648\u00e5\3\2\2\2\u0649\u0658\5\u00fa~"+
		"\2\u064a\u064c\7Y\2\2\u064b\u064d\7\26\2\2\u064c\u064b\3\2\2\2\u064c\u064d"+
		"\3\2\2\2\u064d\u0658\3\2\2\2\u064e\u0650\7\33\2\2\u064f\u064e\3\2\2\2"+
		"\u064f\u0650\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0658\7\34\2\2\u0652\u0658"+
		"\5\u00d4k\2\u0653\u0658\5\u0100\u0081\2\u0654\u0658\5\u00e8u\2\u0655\u0656"+
		"\7v\2\2\u0656\u0658\7\u0155\2\2\u0657\u0649\3\2\2\2\u0657\u064a\3\2\2"+
		"\2\u0657\u064f\3\2\2\2\u0657\u0652\3\2\2\2\u0657\u0653\3\2\2\2\u0657\u0654"+
		"\3\2\2\2\u0657\u0655\3\2\2\2\u0658\u00e7\3\2\2\2\u0659\u065a\7O\2\2\u065a"+
		"\u065b\5f\64\2\u065b\u0662\5\u00f0y\2\u065c\u065d\7\u00bb\2\2\u065d\u0663"+
		"\7\u009e\2\2\u065e\u065f\7\u00bb\2\2\u065f\u0663\7\u00cb\2\2\u0660\u0661"+
		"\7\u00bb\2\2\u0661\u0663\7\u00f2\2\2\u0662\u065c\3\2\2\2\u0662\u065e\3"+
		"\2\2\2\u0662\u0660\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0669\3\2\2\2\u0664"+
		"\u0665\7J\2\2\u0665\u0666\t\33\2\2\u0666\u0668\5\u00eav\2\u0667\u0664"+
		"\3\2\2\2\u0668\u066b\3\2\2\2\u0669\u0667\3\2\2\2\u0669\u066a\3\2\2\2\u066a"+
		"\u00e9\3\2\2\2\u066b\u0669\3\2\2\2\u066c\u0675\7\u00e4\2\2\u066d\u0675"+
		"\7\64\2\2\u066e\u066f\7&\2\2\u066f\u0675\7\34\2\2\u0670\u0671\7I\2\2\u0671"+
		"\u0675\7\\\2\2\u0672\u0673\7&\2\2\u0673\u0675\7=\2\2\u0674\u066c\3\2\2"+
		"\2\u0674\u066d\3\2\2\2\u0674\u066e\3\2\2\2\u0674\u0670\3\2\2\2\u0674\u0672"+
		"\3\2\2\2\u0675\u00eb\3\2\2\2\u0676\u0678\t\34\2\2\u0677\u0676\3\2\2\2"+
		"\u0677\u0678\3\2\2\2\u0678\u067a\3\2\2\2\u0679\u067b\t\7\2\2\u067a\u0679"+
		"\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067d\3\2\2\2\u067c\u067e\5l\67\2\u067d"+
		"\u067c\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680\3\2\2\2\u067f\u0681\5\u00ee"+
		"x\2\u0680\u067f\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u0682\3\2\2\2\u0682"+
		"\u0686\5\u00f0y\2\u0683\u0685\5\u00f4{\2\u0684\u0683\3\2\2\2\u0685\u0688"+
		"\3\2\2\2\u0686\u0684\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u00ed\3\2\2\2\u0688"+
		"\u0686\3\2\2\2\u0689\u068a\7\u0118\2\2\u068a\u068b\t\35\2\2\u068b\u00ef"+
		"\3\2\2\2\u068c\u068d\7\u0145\2\2\u068d\u0692\5\u00f2z\2\u068e\u068f\7"+
		"\u014b\2\2\u068f\u0691\5\u00f2z\2\u0690\u068e\3\2\2\2\u0691\u0694\3\2"+
		"\2\2\u0692\u0690\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0695\3\2\2\2\u0694"+
		"\u0692\3\2\2\2\u0695\u0696\7\u0146\2\2\u0696\u00f1\3\2\2\2\u0697\u069b"+
		"\5h\65\2\u0698\u0699\7\u0145\2\2\u0699\u069a\7\u0156\2\2\u069a\u069c\7"+
		"\u0146\2\2\u069b\u0698\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069f\3\2\2\2"+
		"\u069d\u069f\5n8\2\u069e\u0697\3\2\2\2\u069e\u069d\3\2\2\2\u069f\u06a1"+
		"\3\2\2\2\u06a0\u06a2\t\23\2\2\u06a1\u06a0\3\2\2\2\u06a1\u06a2\3\2\2\2"+
		"\u06a2\u00f3\3\2\2\2\u06a3\u06a5\7\u00b1\2\2\u06a4\u06a6\7\u013e\2\2\u06a5"+
		"\u06a4\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06b1\7\u0156"+
		"\2\2\u06a8\u06b1\5\u00eex\2\u06a9\u06aa\7.\2\2\u06aa\u06ab\7\u00ca\2\2"+
		"\u06ab\u06b1\5b\62\2\u06ac\u06ad\7v\2\2\u06ad\u06b1\7\u0155\2\2\u06ae"+
		"\u06b1\7\u0125\2\2\u06af\u06b1\7\u0126\2\2\u06b0\u06a3\3\2\2\2\u06b0\u06a8"+
		"\3\2\2\2\u06b0\u06a9\3\2\2\2\u06b0\u06ac\3\2\2\2\u06b0\u06ae\3\2\2\2\u06b0"+
		"\u06af\3\2\2\2\u06b1\u00f5\3\2\2\2\u06b2\u06b4\79\2\2\u06b3\u06b5\5\u00d6"+
		"l\2\u06b4\u06b3\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b7\3\2\2\2\u06b6"+
		"\u06b2\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06bb\3\2\2\2\u06b8\u06bc\5\u00f8"+
		"}\2\u06b9\u06bc\5\u00fc\177\2\u06ba\u06bc\5\u00fe\u0080\2\u06bb\u06b8"+
		"\3\2\2\2\u06bb\u06b9\3\2\2\2\u06bb\u06ba\3\2\2\2\u06bc\u00f7\3\2\2\2\u06bd"+
		"\u06bf\5\u00fa~\2\u06be\u06c0\5\u00eex\2\u06bf\u06be\3\2\2\2\u06bf\u06c0"+
		"\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c5\5j\66\2\u06c2\u06c4\5\u00f4{"+
		"\2\u06c3\u06c2\3\2\2\2\u06c4\u06c7\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c5\u06c6"+
		"\3\2\2\2\u06c6\u00f9\3\2\2\2\u06c7\u06c5\3\2\2\2\u06c8\u06ca\7!\2\2\u06c9"+
		"\u06c8\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cc\7\26"+
		"\2\2\u06cc\u00fb\3\2\2\2\u06cd\u06cf\7Y\2\2\u06ce\u06d0\t\7\2\2\u06cf"+
		"\u06ce\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d2\3\2\2\2\u06d1\u06d3\5l"+
		"\67\2\u06d2\u06d1\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d5\3\2\2\2\u06d4"+
		"\u06d6\5\u00eex\2\u06d5\u06d4\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d7"+
		"\3\2\2\2\u06d7\u06db\5\u00f0y\2\u06d8\u06da\5\u00f4{\2\u06d9\u06d8\3\2"+
		"\2\2\u06da\u06dd\3\2\2\2\u06db\u06d9\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc"+
		"\u00fd\3\2\2\2\u06dd\u06db\3\2\2\2\u06de\u06df\7C\2\2\u06df\u06e1\7\26"+
		"\2\2\u06e0\u06e2\5l\67\2\u06e1\u06e0\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2"+
		"\u06e3\3\2\2\2\u06e3\u06e4\5j\66\2\u06e4\u06e5\5\u00e8u\2\u06e5\u00ff"+
		"\3\2\2\2\u06e6\u06e8\79\2\2\u06e7\u06e9\5\u00d6l\2\u06e8\u06e7\3\2\2\2"+
		"\u06e8\u06e9\3\2\2\2\u06e9\u06eb\3\2\2\2\u06ea\u06e6\3\2\2\2\u06ea\u06eb"+
		"\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ed\7\65\2\2\u06ed\u06f2\5n8\2\u06ee"+
		"\u06f0\7\33\2\2\u06ef\u06ee\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f1\3"+
		"\2\2\2\u06f1\u06f3\7\u0128\2\2\u06f2\u06ef\3\2\2\2\u06f2\u06f3\3\2\2\2"+
		"\u06f3\u0101\3\2\2\2\u06f4\u06f5\7\27\2\2\u06f5\u06fc\5f\64\2\u06f6\u06f7"+
		"\7\u0145\2\2\u06f7\u06f8\7\27\2\2\u06f8\u06f9\5f\64\2\u06f9\u06fa\7\u0146"+
		"\2\2\u06fa\u06fc\3\2\2\2\u06fb\u06f4\3\2\2\2\u06fb\u06f6\3\2\2\2\u06fc"+
		"\u0103\3\2\2\2\u06fd\u06fe\7\61\2\2\u06fe\u06ff\7U\2\2\u06ff\u0701\5f"+
		"\64\2\u0700\u0702\5\u0106\u0084\2\u0701\u0700\3\2\2\2\u0701\u0702\3\2"+
		"\2\2\u0702\u0105\3\2\2\2\u0703\u0708\5\u0108\u0085\2\u0704\u0705\7\u014b"+
		"\2\2\u0705\u0707\5\u0108\u0085\2\u0706\u0704\3\2\2\2\u0707\u070a\3\2\2"+
		"\2\u0708\u0706\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u0107\3\2\2\2\u070a\u0708"+
		"\3\2\2\2\u070b\u07b4\5\u010a\u0086\2\u070c\u07b4\5\u010e\u0088\2\u070d"+
		"\u07b4\5\u0112\u008a\2\u070e\u07b4\5\u0114\u008b\2\u070f\u0710\7\60\2"+
		"\2\u0710\u07b4\5\u0100\u0081\2\u0711\u0712\7@\2\2\u0712\u0713\7\65\2\2"+
		"\u0713\u07b4\5\u00d6l\2\u0714\u0715\7\61\2\2\u0715\u0716\7\65\2\2\u0716"+
		"\u0718\5\u00d6l\2\u0717\u0719\7\33\2\2\u0718\u0717\3\2\2\2\u0718\u0719"+
		"\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071b\7\u0128\2\2\u071b\u07b4\3\2\2"+
		"\2\u071c\u071e\7^\2\2\u071d\u071f\7\u013e\2\2\u071e\u071d\3\2\2\2\u071e"+
		"\u071f\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u07b4\t\36\2\2\u0721\u0723\7"+
		"\61\2\2\u0722\u0724\7\66\2\2\u0723\u0722\3\2\2\2\u0723\u0724\3\2\2\2\u0724"+
		"\u0725\3\2\2\2\u0725\u072b\5h\65\2\u0726\u0727\7&\2\2\u0727\u0728\7=\2"+
		"\2\u0728\u072c\5\u0094K\2\u0729\u072a\7@\2\2\u072a\u072c\7=\2\2\u072b"+
		"\u0726\3\2\2\2\u072b\u0729\3\2\2\2\u072c\u07b4\3\2\2\2\u072d\u072e\7\61"+
		"\2\2\u072e\u072f\7G\2\2\u072f\u0730\5l\67\2\u0730\u0731\t\37\2\2\u0731"+
		"\u07b4\3\2\2\2\u0732\u07b4\5\u0116\u008c\2\u0733\u0735\7=\2\2\u0734\u0733"+
		"\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0738\5\u00d2j"+
		"\2\u0737\u0739\5\u00d4k\2\u0738\u0737\3\2\2\2\u0738\u0739\3\2\2\2\u0739"+
		"\u07b4\3\2\2\2\u073a\u073b\7}\2\2\u073b\u073c\7V\2\2\u073c\u073e\5\u00d2"+
		"j\2\u073d\u073f\5\u00d4k\2\u073e\u073d\3\2\2\2\u073e\u073f\3\2\2\2\u073f"+
		"\u07b4\3\2\2\2\u0740\u0741\t \2\2\u0741\u07b4\7\u00b0\2\2\u0742\u0743"+
		"\t!\2\2\u0743\u07b4\7\u010a\2\2\u0744\u07b4\5\u0118\u008d\2\u0745\u07b4"+
		"\5\u011a\u008e\2\u0746\u07b4\5\u011c\u008f\2\u0747\u0748\7@\2\2\u0748"+
		"\u0749\7C\2\2\u0749\u074a\7\26\2\2\u074a\u07b4\5\u00d6l\2\u074b\u07b4"+
		"\7\u009d\2\2\u074c\u074e\7\u00b9\2\2\u074d\u074f\7\u013e\2\2\u074e\u074d"+
		"\3\2\2\2\u074e\u074f\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u07b4\t\"\2\2\u0751"+
		"\u07b4\5\u011e\u0090\2\u0752\u0753\7\37\2\2\u0753\u0754\7\n\2\2\u0754"+
		"\u0759\5h\65\2\u0755\u0756\7\u014b\2\2\u0756\u0758\5h\65\2\u0757\u0755"+
		"\3\2\2\2\u0758\u075b\3\2\2\2\u0759\u0757\3\2\2\2\u0759\u075a\3\2\2\2\u075a"+
		"\u07b4\3\2\2\2\u075b\u0759\3\2\2\2\u075c\u07b4\5\u0120\u0091\2\u075d\u07b4"+
		"\5\u0122\u0092\2\u075e\u07b4\5\u0124\u0093\2\u075f\u0760\t#\2\2\u0760"+
		"\u07b4\7\u0119\2\2\u0761\u0762\7\60\2\2\u0762\u0763\7 \2\2\u0763\u0764"+
		"\7\u0145\2\2\u0764\u0765\5\u0128\u0095\2\u0765\u0766\7\u0146\2\2\u0766"+
		"\u07b4\3\2\2\2\u0767\u0768\7@\2\2\u0768\u0769\7 \2\2\u0769\u07b4\5\u00d8"+
		"m\2\u076a\u076b\7\u0086\2\2\u076b\u076e\7 \2\2\u076c\u076f\5\u00d8m\2"+
		"\u076d\u076f\7\4\2\2\u076e\u076c\3\2\2\2\u076e\u076d\3\2\2\2\u076f\u0770"+
		"\3\2\2\2\u0770\u07b4\7\u010a\2\2\u0771\u0772\7\u00a8\2\2\u0772\u0775\7"+
		" \2\2\u0773\u0776\5\u00d8m\2\u0774\u0776\7\4\2\2\u0775\u0773\3\2\2\2\u0775"+
		"\u0774\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u07b4\7\u010a\2\2\u0778\u0779"+
		"\7X\2\2\u0779\u077c\7 \2\2\u077a\u077d\5\u00d8m\2\u077b\u077d\7\4\2\2"+
		"\u077c\u077a\3\2\2\2\u077c\u077b\3\2\2\2\u077d\u07b4\3\2\2\2\u077e\u077f"+
		"\7r\2\2\u077f\u0780\7 \2\2\u0780\u07b4\7\u0156\2\2\u0781\u0782\7\u00de"+
		"\2\2\u0782\u0783\7 \2\2\u0783\u0784\5\u00d8m\2\u0784\u0785\7\u00ae\2\2"+
		"\u0785\u0786\5\u0126\u0094\2\u0786\u07b4\3\2\2\2\u0787\u0788\7\u0093\2"+
		"\2\u0788\u0789\7 \2\2\u0789\u078a\5\u00d6l\2\u078a\u078b\7.\2\2\u078b"+
		"\u078c\7U\2\2\u078c\u078f\5f\64\2\u078d\u078e\t#\2\2\u078e\u0790\7\u0119"+
		"\2\2\u078f\u078d\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u07b4\3\2\2\2\u0791"+
		"\u0792\7_\2\2\u0792\u0795\7 \2\2\u0793\u0796\5\u00d8m\2\u0794\u0796\7"+
		"\4\2\2\u0795\u0793\3\2\2\2\u0795\u0794\3\2\2\2\u0796\u07b4\3\2\2\2\u0797"+
		"\u0798\7\65\2\2\u0798\u079b\7 \2\2\u0799\u079c\5\u00d8m\2\u079a\u079c"+
		"\7\4\2\2\u079b\u0799\3\2\2\2\u079b\u079a\3\2\2\2\u079c\u07b4\3\2\2\2\u079d"+
		"\u079e\7\u00c6\2\2\u079e\u07a1\7 \2\2\u079f\u07a2\5\u00d8m\2\u07a0\u07a2"+
		"\7\4\2\2\u07a1\u079f\3\2\2\2\u07a1\u07a0\3\2\2\2\u07a2\u07b4\3\2\2\2\u07a3"+
		"\u07a4\7\u00d7\2\2\u07a4\u07a7\7 \2\2\u07a5\u07a8\5\u00d8m\2\u07a6\u07a8"+
		"\7\4\2\2\u07a7\u07a5\3\2\2\2\u07a7\u07a6\3\2\2\2\u07a8\u07b4\3\2\2\2\u07a9"+
		"\u07aa\7\u00df\2\2\u07aa\u07ad\7 \2\2\u07ab\u07ae\5\u00d8m\2\u07ac\u07ae"+
		"\7\4\2\2\u07ad\u07ab\3\2\2\2\u07ad\u07ac\3\2\2\2\u07ae\u07b4\3\2\2\2\u07af"+
		"\u07b0\7\u00dc\2\2\u07b0\u07b4\7\u00cc\2\2\u07b1\u07b2\7\u0115\2\2\u07b2"+
		"\u07b4\7\u00cc\2\2\u07b3\u070b\3\2\2\2\u07b3\u070c\3\2\2\2\u07b3\u070d"+
		"\3\2\2\2\u07b3\u070e\3\2\2\2\u07b3\u070f\3\2\2\2\u07b3\u0711\3\2\2\2\u07b3"+
		"\u0714\3\2\2\2\u07b3\u071c\3\2\2\2\u07b3\u0721\3\2\2\2\u07b3\u072d\3\2"+
		"\2\2\u07b3\u0732\3\2\2\2\u07b3\u0734\3\2\2\2\u07b3\u073a\3\2\2\2\u07b3"+
		"\u0740\3\2\2\2\u07b3\u0742\3\2\2\2\u07b3\u0744\3\2\2\2\u07b3\u0745\3\2"+
		"\2\2\u07b3\u0746\3\2\2\2\u07b3\u0747\3\2\2\2\u07b3\u074b\3\2\2\2\u07b3"+
		"\u074c\3\2\2\2\u07b3\u0751\3\2\2\2\u07b3\u0752\3\2\2\2\u07b3\u075c\3\2"+
		"\2\2\u07b3\u075d\3\2\2\2\u07b3\u075e\3\2\2\2\u07b3\u075f\3\2\2\2\u07b3"+
		"\u0761\3\2\2\2\u07b3\u0767\3\2\2\2\u07b3\u076a\3\2\2\2\u07b3\u0771\3\2"+
		"\2\2\u07b3\u0778\3\2\2\2\u07b3\u077e\3\2\2\2\u07b3\u0781\3\2\2\2\u07b3"+
		"\u0787\3\2\2\2\u07b3\u0791\3\2\2\2\u07b3\u0797\3\2\2\2\u07b3\u079d\3\2"+
		"\2\2\u07b3\u07a3\3\2\2\2\u07b3\u07a9\3\2\2\2\u07b3\u07af\3\2\2\2\u07b3"+
		"\u07b1\3\2\2\2\u07b4\u0109\3\2\2\2\u07b5\u07bc\5\u010c\u0087\2\u07b6\u07b8"+
		"\7\u014b\2\2\u07b7\u07b6\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07b9\3\2\2"+
		"\2\u07b9\u07bb\5\u010c\u0087\2\u07ba\u07b7\3\2\2\2\u07bb\u07be\3\2\2\2"+
		"\u07bc\u07ba\3\2\2\2\u07bc\u07bd\3\2\2\2\u07bd\u010b\3\2\2\2\u07be\u07bc"+
		"\3\2\2\2\u07bf\u07c1\7a\2\2\u07c0\u07c2\7\u013e\2\2\u07c1\u07c0\3\2\2"+
		"\2\u07c1\u07c2\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u0841\7\u0156\2\2\u07c4"+
		"\u07c6\7c\2\2\u07c5\u07c7\7\u013e\2\2\u07c6\u07c5\3\2\2\2\u07c6\u07c7"+
		"\3\2\2\2\u07c7\u07c8\3\2\2\2\u07c8\u0841\7\u0156\2\2\u07c9\u07cb\7=\2"+
		"\2\u07ca\u07c9\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07ce\3\2\2\2\u07cc\u07cf"+
		"\5\u00d2j\2\u07cd\u07cf\5\u00d4k\2\u07ce\u07cc\3\2\2\2\u07ce\u07cd\3\2"+
		"\2\2\u07cf\u0841\3\2\2\2\u07d0\u07d2\7o\2\2\u07d1\u07d3\7\u013e\2\2\u07d2"+
		"\u07d1\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u0841\7\u0156"+
		"\2\2\u07d5\u07d7\7v\2\2\u07d6\u07d8\7\u013e\2\2\u07d7\u07d6\3\2\2\2\u07d7"+
		"\u07d8\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u0841\7\u0155\2\2\u07da\u07dc"+
		"\7y\2\2\u07db\u07dd\7\u013e\2\2\u07dc\u07db\3\2\2\2\u07dc\u07dd\3\2\2"+
		"\2\u07dd\u07de\3\2\2\2\u07de\u0841\7\u0155\2\2\u07df\u07e1\7z\2\2\u07e0"+
		"\u07e2\7\u013e\2\2\u07e1\u07e0\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e3"+
		"\3\2\2\2\u07e3\u0841\7\u0155\2\2\u07e4\u07e5\t$\2\2\u07e5\u07e7\7\u0085"+
		"\2\2\u07e6\u07e8\7\u013e\2\2\u07e7\u07e6\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8"+
		"\u07e9\3\2\2\2\u07e9\u0841\7\u0155\2\2\u07ea\u07ec\7\u0084\2\2\u07eb\u07ed"+
		"\7\u013e\2\2\u07ec\u07eb\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07ee\3\2\2"+
		"\2\u07ee\u0841\7\u0156\2\2\u07ef\u07f1\7\u008d\2\2\u07f0\u07f2\7\u013e"+
		"\2\2\u07f1\u07f0\3\2\2\2\u07f1\u07f2\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3"+
		"\u0841\7\u0155\2\2\u07f4\u07f6\7\u0090\2\2\u07f5\u07f7\7\u013e\2\2\u07f6"+
		"\u07f5\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8\u0841\5\u00d6"+
		"l\2\u07f9\u07fb\7\u00ac\2\2\u07fa\u07fc\7\u013e\2\2\u07fb\u07fa\3\2\2"+
		"\2\u07fb\u07fc\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u0841\t%\2\2\u07fe\u0800"+
		"\7\u00b1\2\2\u07ff\u0801\7\u013e\2\2\u0800\u07ff\3\2\2\2\u0800\u0801\3"+
		"\2\2\2\u0801\u0802\3\2\2\2\u0802\u0841\7\u0156\2\2\u0803\u0805\7\u00bd"+
		"\2\2\u0804\u0806\7\u013e\2\2\u0805\u0804\3\2\2\2\u0805\u0806\3\2\2\2\u0806"+
		"\u0807\3\2\2\2\u0807\u0841\7\u0156\2\2\u0808\u080a\7\u00bf\2\2\u0809\u080b"+
		"\7\u013e\2\2\u080a\u0809\3\2\2\2\u080a\u080b\3\2\2\2\u080b\u080c\3\2\2"+
		"\2\u080c\u0841\7\u0156\2\2\u080d\u080f\7\u00c9\2\2\u080e\u0810\7\u013e"+
		"\2\2\u080f\u080e\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u0811\3\2\2\2\u0811"+
		"\u0841\t&\2\2\u0812\u0814\7L\2\2\u0813\u0815\7\u013e\2\2\u0814\u0813\3"+
		"\2\2\2\u0814\u0815\3\2\2\2\u0815\u0816\3\2\2\2\u0816\u0841\7\u0155\2\2"+
		"\u0817\u0819\7\u00e9\2\2\u0818\u081a\7\u013e\2\2\u0819\u0818\3\2\2\2\u0819"+
		"\u081a\3\2\2\2\u081a\u081b\3\2\2\2\u081b\u0841\t\'\2\2\u081c\u081e\7\u00fe"+
		"\2\2\u081d\u081f\7\u013e\2\2\u081e\u081d\3\2\2\2\u081e\u081f\3\2\2\2\u081f"+
		"\u0820\3\2\2\2\u0820\u0841\t&\2\2\u0821\u0823\7\u00ff\2\2\u0822\u0824"+
		"\7\u013e\2\2\u0823\u0822\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u0825\3\2\2"+
		"\2\u0825\u0841\t&\2\2\u0826\u0828\7\u0100\2\2\u0827\u0829\7\u013e\2\2"+
		"\u0828\u0827\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u0841"+
		"\7\u0156\2\2\u082b\u082c\7\u010a\2\2\u082c\u082f\5\u00d6l\2\u082d\u082e"+
		"\7\u0101\2\2\u082e\u0830\t\31\2\2\u082f\u082d\3\2\2\2\u082f\u0830\3\2"+
		"\2\2\u0830\u0841\3\2\2\2\u0831\u0833\7+\2\2\u0832\u0834\7\u013e\2\2\u0833"+
		"\u0832\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0835\3\2\2\2\u0835\u0836\7\u0145"+
		"\2\2\u0836\u083b\5f\64\2\u0837\u0838\7\u014b\2\2\u0838\u083a\5f\64\2\u0839"+
		"\u0837\3\2\2\2\u083a\u083d\3\2\2\2\u083b\u0839\3\2\2\2\u083b\u083c\3\2"+
		"\2\2\u083c\u083e\3\2\2\2\u083d\u083b\3\2\2\2\u083e\u083f\7\u0146\2\2\u083f"+
		"\u0841\3\2\2\2\u0840\u07bf\3\2\2\2\u0840\u07c4\3\2\2\2\u0840\u07ca\3\2"+
		"\2\2\u0840\u07d0\3\2\2\2\u0840\u07d5\3\2\2\2\u0840\u07da\3\2\2\2\u0840"+
		"\u07df\3\2\2\2\u0840\u07e4\3\2\2\2\u0840\u07ea\3\2\2\2\u0840\u07ef\3\2"+
		"\2\2\u0840\u07f4\3\2\2\2\u0840\u07f9\3\2\2\2\u0840\u07fe\3\2\2\2\u0840"+
		"\u0803\3\2\2\2\u0840\u0808\3\2\2\2\u0840\u080d\3\2\2\2\u0840\u0812\3\2"+
		"\2\2\u0840\u0817\3\2\2\2\u0840\u081c\3\2\2\2\u0840\u0821\3\2\2\2\u0840"+
		"\u0826\3\2\2\2\u0840\u082b\3\2\2\2\u0840\u0831\3\2\2\2\u0841\u010d\3\2"+
		"\2\2\u0842\u0844\7\60\2\2\u0843\u0845\7\66\2\2\u0844\u0843\3\2\2\2\u0844"+
		"\u0845\3\2\2\2\u0845\u0855\3\2\2\2\u0846\u0848\5\u00e0q\2\u0847\u0849"+
		"\5\u0110\u0089\2\u0848\u0847\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u0856\3"+
		"\2\2\2\u084a\u084b\7\u0145\2\2\u084b\u0850\5\u00e0q\2\u084c\u084d\7\u014b"+
		"\2\2\u084d\u084f\5\u00e0q\2\u084e\u084c\3\2\2\2\u084f\u0852\3\2\2\2\u0850"+
		"\u084e\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0853\3\2\2\2\u0852\u0850\3\2"+
		"\2\2\u0853\u0854\7\u0146\2\2\u0854\u0856\3\2\2\2\u0855\u0846\3\2\2\2\u0855"+
		"\u084a\3\2\2\2\u0856\u010f\3\2\2\2\u0857\u085b\7\u009a\2\2\u0858\u0859"+
		"\7]\2\2\u0859\u085b\5h\65\2\u085a\u0857\3\2\2\2\u085a\u0858\3\2\2\2\u085b"+
		"\u0111\3\2\2\2\u085c\u085d\7\60\2\2\u085d\u085e\5\u00ecw\2\u085e\u0113"+
		"\3\2\2\2\u085f\u0860\7\60\2\2\u0860\u0861\5\u00f6|\2\u0861\u0115\3\2\2"+
		"\2\u0862\u0864\7k\2\2\u0863\u0865\7\66\2\2\u0864\u0863\3\2\2\2\u0864\u0865"+
		"\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u0867\5h\65\2\u0867\u0869\5\u00e0q"+
		"\2\u0868\u086a\5\u0110\u0089\2\u0869\u0868\3\2\2\2\u0869\u086a\3\2\2\2"+
		"\u086a\u0117\3\2\2\2\u086b\u086d\7@\2\2\u086c\u086e\7\66\2\2\u086d\u086c"+
		"\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u086f\3\2\2\2\u086f\u0870\5h\65\2\u0870"+
		"\u0119\3\2\2\2\u0871\u0872\7@\2\2\u0872\u0873\t\7\2\2\u0873\u0874\5l\67"+
		"\2\u0874\u011b\3\2\2\2\u0875\u0876\7@\2\2\u0876\u0877\5\u00fa~\2\u0877"+
		"\u011d\3\2\2\2\u0878\u087a\7\u00c0\2\2\u0879\u087b\7\66\2\2\u087a\u0879"+
		"\3\2\2\2\u087a\u087b\3\2\2\2\u087b\u087c\3\2\2\2\u087c\u087e\5\u00e0q"+
		"\2\u087d\u087f\5\u0110\u0089\2\u087e\u087d\3\2\2\2\u087e\u087f\3\2\2\2"+
		"\u087f\u011f\3\2\2\2\u0880\u0881\7\u00dd\2\2\u0881\u0882\7\66\2\2\u0882"+
		"\u0883\5h\65\2\u0883\u0884\7V\2\2\u0884\u0885\5h\65\2\u0885\u0121\3\2"+
		"\2\2\u0886\u0887\7\u00dd\2\2\u0887\u0888\t\7\2\2\u0888\u0889\5l\67\2\u0889"+
		"\u088a\7V\2\2\u088a\u088b\5l\67\2\u088b\u0123\3\2\2\2\u088c\u088e\7\u00dd"+
		"\2\2\u088d\u088f\t(\2\2\u088e\u088d\3\2\2\2\u088e\u088f\3\2\2\2\u088f"+
		"\u0890\3\2\2\2\u0890\u0891\5f\64\2\u0891\u0125\3\2\2\2\u0892\u0893\7\u0145"+
		"\2\2\u0893\u0898\5\u0128\u0095\2\u0894\u0895\7\u014b\2\2\u0895\u0897\5"+
		"\u0128\u0095\2\u0896\u0894\3\2\2\2\u0897\u089a\3\2\2\2\u0898\u0896\3\2"+
		"\2\2\u0898\u0899\3\2\2\2\u0899\u089b\3\2\2\2\u089a\u0898\3\2\2\2\u089b"+
		"\u089c\7\u0146\2\2\u089c\u0127\3\2\2\2\u089d\u089e\7 \2\2\u089e\u08aa"+
		"\5b\62\2\u089f\u08a8\7\u011b\2\2\u08a0\u08a1\7\u00b5\2\2\u08a1\u08a2\7"+
		"\u010c\2\2\u08a2\u08a9\5\u012a\u0096\2\u08a3\u08a4\7\24\2\2\u08a4\u08a5"+
		"\7\u0145\2\2\u08a5\u08a6\5\u012c\u0097\2\u08a6\u08a7\7\u0146\2\2\u08a7"+
		"\u08a9\3\2\2\2\u08a8\u08a0\3\2\2\2\u08a8\u08a3\3\2\2\2\u08a9\u08ab\3\2"+
		"\2\2\u08aa\u089f\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08af\3\2\2\2\u08ac"+
		"\u08ae\5\u012e\u0098\2\u08ad\u08ac\3\2\2\2\u08ae\u08b1\3\2\2\2\u08af\u08ad"+
		"\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u08bd\3\2\2\2\u08b1\u08af\3\2\2\2\u08b2"+
		"\u08b3\7\u0145\2\2\u08b3\u08b8\5\u0130\u0099\2\u08b4\u08b5\7\u014b\2\2"+
		"\u08b5\u08b7\5\u0130\u0099\2\u08b6\u08b4\3\2\2\2\u08b7\u08ba\3\2\2\2\u08b8"+
		"\u08b6\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08bb\3\2\2\2\u08ba\u08b8\3\2"+
		"\2\2\u08bb\u08bc\7\u0146\2\2\u08bc\u08be\3\2\2\2\u08bd\u08b2\3\2\2\2\u08bd"+
		"\u08be\3\2\2\2\u08be\u0129\3\2\2\2\u08bf\u08c2\7\u0145\2\2\u08c0\u08c3"+
		"\5n8\2\u08c1\u08c3\5\u012c\u0097\2\u08c2\u08c0\3\2\2\2\u08c2\u08c1\3\2"+
		"\2\2\u08c3\u08c4\3\2\2\2\u08c4\u08c5\7\u0146\2\2\u08c5\u08c8\3\2\2\2\u08c6"+
		"\u08c8\7\u00bc\2\2\u08c7\u08bf\3\2\2\2\u08c7\u08c6\3\2\2\2\u08c8\u012b"+
		"\3\2\2\2\u08c9\u08ce\5`\61\2\u08ca\u08cb\7\u014b\2\2\u08cb\u08cd\5`\61"+
		"\2\u08cc\u08ca\3\2\2\2\u08cd\u08d0\3\2\2\2\u08ce\u08cc\3\2\2\2\u08ce\u08cf"+
		"\3\2\2\2\u08cf\u012d\3\2\2\2\u08d0\u08ce\3\2\2\2\u08d1\u08d3\7\u0101\2"+
		"\2\u08d2\u08d1\3\2\2\2\u08d2\u08d3\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d6"+
		"\7\u0090\2\2\u08d5\u08d7\7\u013e\2\2\u08d6\u08d5\3\2\2\2\u08d6\u08d7\3"+
		"\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08fa\5b\62\2\u08d9\u08db\7v\2\2\u08da"+
		"\u08dc\7\u013e\2\2\u08db\u08da\3\2\2\2\u08db\u08dc\3\2\2\2\u08dc\u08dd"+
		"\3\2\2\2\u08dd\u08fa\7\u0155\2\2\u08de\u08df\7\u0081\2\2\u08df\u08e1\7"+
		"\u0085\2\2\u08e0\u08e2\7\u013e\2\2\u08e1\u08e0\3\2\2\2\u08e1\u08e2\3\2"+
		"\2\2\u08e2\u08e3\3\2\2\2\u08e3\u08fa\7\u0155\2\2\u08e4\u08e5\7G\2\2\u08e5"+
		"\u08e7\7\u0085\2\2\u08e6\u08e8\7\u013e\2\2\u08e7\u08e6\3\2\2\2\u08e7\u08e8"+
		"\3\2\2\2\u08e8\u08e9\3\2\2\2\u08e9\u08fa\7\u0155\2\2\u08ea\u08ec\7\u00bd"+
		"\2\2\u08eb\u08ed\7\u013e\2\2\u08ec\u08eb\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed"+
		"\u08ee\3\2\2\2\u08ee\u08fa\7\u0156\2\2\u08ef\u08f1\7\u00bf\2\2\u08f0\u08f2"+
		"\7\u013e\2\2\u08f1\u08f0\3\2\2\2\u08f1\u08f2\3\2\2\2\u08f2\u08f3\3\2\2"+
		"\2\u08f3\u08fa\7\u0156\2\2\u08f4\u08f6\7\u010a\2\2\u08f5\u08f7\7\u013e"+
		"\2\2\u08f6\u08f5\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7\u08f8\3\2\2\2\u08f8"+
		"\u08fa\5b\62\2\u08f9\u08d2\3\2\2\2\u08f9\u08d9\3\2\2\2\u08f9\u08de\3\2"+
		"\2\2\u08f9\u08e4\3\2\2\2\u08f9\u08ea\3\2\2\2\u08f9\u08ef\3\2\2\2\u08f9"+
		"\u08f4\3\2\2\2\u08fa\u012f\3\2\2\2\u08fb\u08fc\7\u0104\2\2\u08fc\u0900"+
		"\5b\62\2\u08fd\u08ff\5\u012e\u0098\2\u08fe\u08fd\3\2\2\2\u08ff\u0902\3"+
		"\2\2\2\u0900\u08fe\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0131\3\2\2\2\u0902"+
		"\u0900\3\2\2\2\u0903\u0905\7@\2\2\u0904\u0906\7\u010b\2\2\u0905\u0904"+
		"\3\2\2\2\u0905\u0906\3\2\2\2\u0906\u0907\3\2\2\2\u0907\u090a\7U\2\2\u0908"+
		"\u0909\7\u00a6\2\2\u0909\u090b\7\17\2\2\u090a\u0908\3\2\2\2\u090a\u090b"+
		"\3\2\2\2\u090b\u090c\3\2\2\2\u090c\u0911\5f\64\2\u090d\u090e\7\u014b\2"+
		"\2\u090e\u0910\5f\64\2\u090f\u090d\3\2\2\2\u0910\u0913\3\2\2\2\u0911\u090f"+
		"\3\2\2\2\u0911\u0912\3\2\2\2\u0912\u0133\3\2\2\2\u0913\u0911\3\2\2\2\u0914"+
		"\u0916\7X\2\2\u0915\u0917\7U\2\2\u0916\u0915\3\2\2\2\u0916\u0917\3\2\2"+
		"\2\u0917\u0918\3\2\2\2\u0918\u0919\5f\64\2\u0919\u0135\3\2\2\2\u091a\u091c"+
		"\7:\2\2\u091b\u091d\t)\2\2";
	private static final String _serializedATNSegment1 =
		"\u091c\u091b\3\2\2\2\u091c\u091d\3\2\2\2\u091d\u091e\3\2\2\2\u091e\u091f"+
		"\7G\2\2\u091f\u0921\5l\67\2\u0920\u0922\5\u00eex\2\u0921\u0920\3\2\2\2"+
		"\u0921\u0922\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u0924\7J\2\2\u0924\u0925"+
		"\5f\64\2\u0925\u0137\3\2\2\2\u0926\u0927\7@\2\2\u0927\u0929\7G\2\2\u0928"+
		"\u092a\t*\2\2\u0929\u0928\3\2\2\2\u0929\u092a\3\2\2\2\u092a\u092b\3\2"+
		"\2\2\u092b\u092c\5l\67\2\u092c\u092d\7J\2\2\u092d\u092e\5f\64\2\u092e"+
		"\u0139\3\2\2\2\u092f\u0931\7&\2\2\u0930\u0932\t+\2\2\u0931\u0930\3\2\2"+
		"\2\u0931\u0932\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u0934\7W\2\2\u0934\u013b"+
		"\3\2\2\2\u0935\u0936\7&\2\2\u0936\u0937\7b\2\2\u0937\u0938\7\u013e\2\2"+
		"\u0938\u0939\5\u013e\u00a0\2\u0939\u013d\3\2\2\2\u093a\u093b\7\u0156\2"+
		"\2\u093b\u013f\3\2\2\2\u093c\u0940\7d\2\2\u093d\u093e\7T\2\2\u093e\u0940"+
		"\7W\2\2\u093f\u093c\3\2\2\2\u093f\u093d\3\2\2\2\u0940\u0141\3\2\2\2\u0941"+
		"\u0942\7\67\2\2\u0942\u0143\3\2\2\2\u0943\u0944\7R\2\2\u0944\u0145\3\2"+
		"\2\2\u0945\u0946\7\u00ea\2\2\u0946\u0147\3\2\2\2\u0947\u094b\7F\2\2\u0948"+
		"\u094c\5\u014c\u00a7\2\u0949\u094c\5\u014e\u00a8\2\u094a\u094c\5\u0150"+
		"\u00a9\2\u094b\u0948\3\2\2\2\u094b\u0949\3\2\2\2\u094b\u094a\3\2\2\2\u094c"+
		"\u094d\3\2\2\2\u094d\u094e\7V\2\2\u094e\u0149\3\2\2\2\u094f\u0954\7P\2"+
		"\2\u0950\u0955\5\u014c\u00a7\2\u0951\u0955\5\u014e\u00a8\2\u0952\u0955"+
		"\5\u0152\u00aa\2\u0953\u0955\5\u0150\u00a9\2\u0954\u0950\3\2\2\2\u0954"+
		"\u0951\3\2\2\2\u0954\u0952\3\2\2\2\u0954\u0953\3\2\2\2\u0955\u0956\3\2"+
		"\2\2\u0956\u0957\7\21\2\2\u0957\u014b\3\2\2\2\u0958\u0959\7\u00d4\2\2"+
		"\u0959\u095a\7J\2\2\u095a\u014d\3\2\2\2\u095b\u095c\5\u0154\u00ab\2\u095c"+
		"\u095d\7J\2\2\u095d\u095e\5\u0158\u00ad\2\u095e\u014f\3\2\2\2\u095f\u0960"+
		"\5\u00d8m\2\u0960\u0151\3\2\2\2\u0961\u0963\7\4\2\2\u0962\u0964\7M\2\2"+
		"\u0963\u0962\3\2\2\2\u0963\u0964\3\2\2\2\u0964\u0965\3\2\2\2\u0965\u0966"+
		"\7\u014b\2\2\u0966\u0967\7F\2\2\u0967\u0968\7K\2\2\u0968\u0153\3\2\2\2"+
		"\u0969\u096b\5\u0156\u00ac\2\u096a\u096c\5j\66\2\u096b\u096a\3\2\2\2\u096b"+
		"\u096c\3\2\2\2\u096c\u0974\3\2\2\2\u096d\u096e\7\u014b\2\2\u096e\u0970"+
		"\5\u0156\u00ac\2\u096f\u0971\5j\66\2\u0970\u096f\3\2\2\2\u0970\u0971\3"+
		"\2\2\2\u0971\u0973\3\2\2\2\u0972\u096d\3\2\2\2\u0973\u0976\3\2\2\2\u0974"+
		"\u0972\3\2\2\2\u0974\u0975\3\2\2\2\u0975\u0155\3\2\2\2\u0976\u0974\3\2"+
		"\2\2\u0977\u0979\7\4\2\2\u0978\u097a\7M\2\2\u0979\u0978\3\2\2\2\u0979"+
		"\u097a\3\2\2\2\u097a\u09b5\3\2\2\2\u097b\u097d\7\61\2\2\u097c\u097e\7"+
		"\u00e8\2\2\u097d\u097c\3\2\2\2\u097d\u097e\3\2\2\2\u097e\u09b5\3\2\2\2"+
		"\u097f\u09b5\7:\2\2\u0980\u0981\7:\2\2\u0981\u09b5\7\u00e8\2\2\u0982\u0983"+
		"\7:\2\2\u0983\u09b5\7\u010a\2\2\u0984\u0985\7:\2\2\u0985\u0986\7\u010b"+
		"\2\2\u0986\u09b5\7\u0109\2\2\u0987\u0988\7:\2\2\u0988\u09b5\7Z\2\2\u0989"+
		"\u098a\7:\2\2\u098a\u09b5\7\u011d\2\2\u098b\u09b5\7>\2\2\u098c\u09b5\7"+
		"@\2\2\u098d\u09b5\7\u0091\2\2\u098e\u09b5\7\u0095\2\2\u098f\u09b5\7\u0097"+
		"\2\2\u0990\u0991\7F\2\2\u0991\u09b5\7K\2\2\u0992\u09b5\7G\2\2\u0993\u09b5"+
		"\7\u00ab\2\2\u0994\u0995\7\u00b9\2\2\u0995\u09b5\7\u0109\2\2\u0996\u09b5"+
		"\7\u00d3\2\2\u0997\u09b5\7\u00d4\2\2\u0998\u09b5\7O\2\2\u0999\u09b5\7"+
		"\u00db\2\2\u099a\u099b\7\u00e1\2\2\u099b\u09b5\7q\2\2\u099c\u099d\7\u00e1"+
		"\2\2\u099d\u09b5\7\u00f3\2\2\u099e\u09b5\7\u00eb\2\2\u099f\u09a0\7\u00f0"+
		"\2\2\u09a0\u09b5\7\u0082\2\2\u09a1\u09a2\7\u00f0\2\2\u09a2\u09b5\7\u011d"+
		"\2\2\u09a3\u09b5\7\u00f1\2\2\u09a4\u09b5\7\u0105\2\2\u09a5\u09b5\7\u010f"+
		"\2\2\u09a6\u09b5\7\u0114\2\2\u09a7\u09b5\7\u0116\2\2\u09a8\u09b5\7`\2"+
		"\2\u09a9\u09b5\7e\2\2\u09aa\u09b5\7{\2\2\u09ab\u09b5\7\u008e\2\2\u09ac"+
		"\u09b5\7\u0098\2\2\u09ad\u09b5\7\u0099\2\2\u09ae\u09b5\7\u00a2\2\2\u09af"+
		"\u09b5\7\u00e2\2\2\u09b0\u09b5\7\u00e7\2\2\u09b1\u09b5\7\u00ee\2\2\u09b2"+
		"\u09b5\7\u0108\2\2\u09b3\u09b5\7\u011c\2\2\u09b4\u0977\3\2\2\2\u09b4\u097b"+
		"\3\2\2\2\u09b4\u097f\3\2\2\2\u09b4\u0980\3\2\2\2\u09b4\u0982\3\2\2\2\u09b4"+
		"\u0984\3\2\2\2\u09b4\u0987\3\2\2\2\u09b4\u0989\3\2\2\2\u09b4\u098b\3\2"+
		"\2\2\u09b4\u098c\3\2\2\2\u09b4\u098d\3\2\2\2\u09b4\u098e\3\2\2\2\u09b4"+
		"\u098f\3\2\2\2\u09b4\u0990\3\2\2\2\u09b4\u0992\3\2\2\2\u09b4\u0993\3\2"+
		"\2\2\u09b4\u0994\3\2\2\2\u09b4\u0996\3\2\2\2\u09b4\u0997\3\2\2\2\u09b4"+
		"\u0998\3\2\2\2\u09b4\u0999\3\2\2\2\u09b4\u099a\3\2\2\2\u09b4\u099c\3\2"+
		"\2\2\u09b4\u099e\3\2\2\2\u09b4\u099f\3\2\2\2\u09b4\u09a1\3\2\2\2\u09b4"+
		"\u09a3\3\2\2\2\u09b4\u09a4\3\2\2\2\u09b4\u09a5\3\2\2\2\u09b4\u09a6\3\2"+
		"\2\2\u09b4\u09a7\3\2\2\2\u09b4\u09a8\3\2\2\2\u09b4\u09a9\3\2\2\2\u09b4"+
		"\u09aa\3\2\2\2\u09b4\u09ab\3\2\2\2\u09b4\u09ac\3\2\2\2\u09b4\u09ad\3\2"+
		"\2\2\u09b4\u09ae\3\2\2\2\u09b4\u09af\3\2\2\2\u09b4\u09b0\3\2\2\2\u09b4"+
		"\u09b1\3\2\2\2\u09b4\u09b2\3\2\2\2\u09b4\u09b3\3\2\2\2\u09b5\u0157\3\2"+
		"\2\2\u09b6\u09b8\5\u015a\u00ae\2\u09b7\u09b6\3\2\2\2\u09b7\u09b8\3\2\2"+
		"\2\u09b8\u09b9\3\2\2\2\u09b9\u09ba\5\u015c\u00af\2\u09ba\u0159\3\2\2\2"+
		"\u09bb\u09bc\t,\2\2\u09bc\u015b\3\2\2\2\u09bd\u09c5\7\u0137\2\2\u09be"+
		"\u09bf\7\u0137\2\2\u09bf\u09c5\7\u013b\2\2\u09c0\u09c1\5b\62\2\u09c1\u09c2"+
		"\7\u013b\2\2\u09c2\u09c5\3\2\2\2\u09c3\u09c5\5f\64\2\u09c4\u09bd\3\2\2"+
		"\2\u09c4\u09be\3\2\2\2\u09c4\u09c0\3\2\2\2\u09c4\u09c3\3\2\2\2\u09c5\u015d"+
		"\3\2\2\2\u09c6\u09c7\7:\2\2\u09c7\u09c8\7Z\2\2\u09c8\u015f\3\2\2\2\u09c9"+
		"\u09ca\7@\2\2\u09ca\u09cb\7Z\2\2\u09cb\u0161\3\2\2\2\u09cc\u09cd\7\61"+
		"\2\2\u09cd\u09ce\7Z\2\2\u09ce\u0163\3\2\2\2\u09cf\u09d0\7\u00dd\2\2\u09d0"+
		"\u09d1\7Z\2\2\u09d1\u0165\3\2\2\2\u09d2\u09d3\7:\2\2\u09d3\u09d4\7Q\2"+
		"\2\u09d4\u0167\3\2\2\2\u09d5\u09d6\7@\2\2\u09d6\u09d7\7Q\2\2\u09d7\u0169"+
		"\3\2\2\2\u09d8\u09da\7&\2\2\u09d9\u09db\7=\2\2\u09da\u09d9\3\2\2\2\u09da"+
		"\u09db\3\2\2\2\u09db\u09dc\3\2\2\2\u09dc\u09dd\7Q\2\2\u09dd\u016b\3\2"+
		"\2\2\u09de\u09df\7&\2\2\u09df\u09e0\7L\2\2\u09e0\u016d\3\2\2\2\u013f\u0188"+
		"\u018b\u0190\u0194\u0199\u019c\u019f\u01a2\u01aa\u01ae\u01b6\u01ba\u01c7"+
		"\u01d4\u01db\u01df\u01e7\u01ed\u01f1\u01f4\u01fa\u01fe\u0201\u0204\u0208"+
		"\u020e\u0219\u0220\u0225\u0229\u022e\u0233\u0238\u023b\u023e\u0241\u0244"+
		"\u0247\u024a\u0253\u0256\u0259\u025c\u025f\u0262\u0265\u0268\u026c\u0272"+
		"\u0277\u027a\u027d\u0280\u0284\u0293\u029b\u02a1\u02a4\u02a9\u02ac\u02af"+
		"\u02b2\u02b6\u02be\u02c5\u02d0\u02d4\u02dd\u02e3\u02e8\u02f2\u02fc\u0300"+
		"\u0306\u0312\u0317\u0320\u0326\u032a\u0332\u0341\u0348\u034f\u0358\u035f"+
		"\u0366\u0370\u037f\u0390\u0392\u039b\u03aa\u03ac\u03b3\u03ba\u03c3\u03ca"+
		"\u03d8\u03de\u03e2\u03e8\u0417\u0419\u0424\u042c\u0432\u0437\u043e\u0440"+
		"\u0446\u044d\u0451\u0456\u0466\u0472\u0478\u047f\u0482\u048f\u0492\u04a6"+
		"\u04a9\u04ac\u04bf\u04c4\u04c8\u04ca\u04d9\u04df\u04e2\u04e7\u04ee\u04f2"+
		"\u04f7\u04f9\u0512\u0522\u0534\u0539\u054a\u054d\u0556\u055d\u0562\u0565"+
		"\u056e\u057b\u057e\u0581\u0584\u0587\u0590\u059a\u05a8\u05b3\u05b6\u05b9"+
		"\u05bc\u05bf\u05c8\u05cd\u05d0\u05d2\u05d6\u05dc\u05e3\u05e8\u05eb\u05ef"+
		"\u05f3\u05f8\u05ff\u0604\u060a\u0612\u0619\u0620\u0627\u062d\u0630\u0637"+
		"\u063d\u0642\u0647\u064c\u064f\u0657\u0662\u0669\u0674\u0677\u067a\u067d"+
		"\u0680\u0686\u0692\u069b\u069e\u06a1\u06a5\u06b0\u06b4\u06b6\u06bb\u06bf"+
		"\u06c5\u06c9\u06cf\u06d2\u06d5\u06db\u06e1\u06e8\u06ea\u06ef\u06f2\u06fb"+
		"\u0701\u0708\u0718\u071e\u0723\u072b\u0734\u0738\u073e\u074e\u0759\u076e"+
		"\u0775\u077c\u078f\u0795\u079b\u07a1\u07a7\u07ad\u07b3\u07b7\u07bc\u07c1"+
		"\u07c6\u07ca\u07ce\u07d2\u07d7\u07dc\u07e1\u07e7\u07ec\u07f1\u07f6\u07fb"+
		"\u0800\u0805\u080a\u080f\u0814\u0819\u081e\u0823\u0828\u082f\u0833\u083b"+
		"\u0840\u0844\u0848\u0850\u0855\u085a\u0864\u0869\u086d\u087a\u087e\u088e"+
		"\u0898\u08a8\u08aa\u08af\u08b8\u08bd\u08c2\u08c7\u08ce\u08d2\u08d6\u08db"+
		"\u08e1\u08e7\u08ec\u08f1\u08f6\u08f9\u0900\u0905\u090a\u0911\u0916\u091c"+
		"\u0921\u0929\u0931\u093f\u094b\u0954\u0963\u096b\u0970\u0974\u0979\u097d"+
		"\u09b4\u09b7\u09c4\u09da";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}