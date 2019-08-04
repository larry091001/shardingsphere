// Generated from org\apache\shardingsphere\core\parse\antlr\autogen\SQLServerStatement.g4 by ANTLR 4.7.1
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
public class SQLServerStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, ALL=3, AND=4, ANY=5, ASC=6, BETWEEN=7, BINARY=8, BY=9, DATE=10, 
		DESC=11, DISTINCT=12, ESCAPE=13, EXISTS=14, FALSE=15, FROM=16, GROUP=17, 
		HAVING=18, HIDDEN_=19, IN=20, IS=21, KEY=22, LIKE=23, LIMIT=24, MOD=25, 
		NOT=26, NULL=27, OFFSET=28, OR=29, ORDER=30, PARTITION=31, PRIMARY=32, 
		REGEXP=33, ROW=34, SET=35, SOUNDS=36, TIME=37, TIMESTAMP=38, TRUE=39, 
		UNION=40, UNKNOWN=41, WHERE=42, WITH=43, XOR=44, ADD=45, ALTER=46, ALWAYS=47, 
		AS=48, CASCADE=49, CHECK=50, COLUMN=51, COMMIT=52, CONSTRAINT=53, CREATE=54, 
		CURRENT=55, DAY=56, DEFAULT=57, DELETE=58, DISABLE=59, DROP=60, ENABLE=61, 
		FOR=62, FOREIGN=63, FUNCTION=64, GENERATED=65, GRANT=66, INDEX=67, NO=68, 
		ON=69, OPTION=70, PRIVILEGES=71, REFERENCES=72, REVOKE=73, ROLE=74, ROLLBACK=75, 
		ROWS=76, START=77, TABLE=78, TO=79, TRANSACTION=80, TRUNCATE=81, UNIQUE=82, 
		USER=83, YEAR=84, ABORT_AFTER_WAIT=85, ACTION=86, ALGORITHM=87, ALLOW_PAGE_LOCKS=88, 
		ALLOW_ROW_LOCKS=89, ALL_SPARSE_COLUMNS=90, AUTO=91, BEGIN=92, BLOCKERS=93, 
		BUCKET_COUNT=94, CAST=95, CLUSTERED=96, COLLATE=97, COLUMNSTORE=98, COLUMNSTORE_ARCHIVE=99, 
		COLUMN_ENCRYPTION_KEY=100, COLUMN_SET=101, COMPRESSION_DELAY=102, CONTENT=103, 
		CONVERT=104, DATABASE=105, DATABASE_DEAULT=106, DATA_COMPRESSION=107, 
		DATA_CONSISTENCY_CHECK=108, DAYS=109, DENY=110, DETERMINISTIC=111, DISTRIBUTION=112, 
		DOCUMENT=113, DROP_EXISTING=114, DURABILITY=115, ENCRYPTED=116, ENCRYPTION_TYPE=117, 
		END=118, FILESTREAM=119, FILESTREAM_ON=120, FILETABLE=121, FILETABLE_COLLATE_FILENAME=122, 
		FILETABLE_DIRECTORY=123, FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME=124, 
		FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME=125, FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME=126, 
		FILLFACTOR=127, FILTER_PREDICATE=128, FOLLOWING=129, HASH=130, HEAP=131, 
		HISTORY_RETENTION_PERIOD=132, HISTORY_TABLE=133, IDENTITY=134, IF=135, 
		IGNORE_DUP_KEY=136, IMPLICIT_TRANSACTIONS=137, INBOUND=138, INFINITE=139, 
		LEFT=140, LOCK_ESCALATION=141, LOGIN=142, MASKED=143, MAX=144, MAXDOP=145, 
		MAX_DURATION=146, MEMORY_OPTIMIZED=147, MIGRATION_STATE=148, MINUTES=149, 
		MONTH=150, MONTHS=151, MOVE=152, NOCHECK=153, NONCLUSTERED=154, NONE=155, 
		OBJECT=156, OFF=157, ONLINE=158, OUTBOUND=159, OVER=160, PAD_INDEX=161, 
		PAGE=162, PARTITIONS=163, PAUSED=164, PERIOD=165, PERSISTED=166, PRECEDING=167, 
		RANDOMIZED=168, RANGE=169, REBUILD=170, REMOTE_DATA_ARCHIVE=171, REPLICATE=172, 
		REPLICATION=173, RESUMABLE=174, RIGHT=175, ROUND_ROBIN=176, ROWGUIDCOL=177, 
		SAVE=178, SCHEMA=179, SCHEMA_AND_DATA=180, SCHEMA_ONLY=181, SELF=182, 
		SORT_IN_TEMPDB=183, SPARSE=184, STATISTICS_INCREMENTAL=185, STATISTICS_NORECOMPUTE=186, 
		SWITCH=187, SYSTEM_TIME=188, SYSTEM_VERSIONING=189, TEXTIMAGE_ON=190, 
		TRAN=191, TRANCOUNT=192, TRIGGER=193, UNBOUNDED=194, UPDATE=195, VALUES=196, 
		WAIT_AT_LOW_PRIORITY=197, WEEK=198, WEEKS=199, YEARS=200, ZONE=201, FOR_GENERATOR=202, 
		AND_=203, OR_=204, NOT_=205, TILDE_=206, VERTICAL_BAR_=207, AMPERSAND_=208, 
		SIGNED_LEFT_SHIFT_=209, SIGNED_RIGHT_SHIFT_=210, CARET_=211, MOD_=212, 
		COLON_=213, PLUS_=214, MINUS_=215, ASTERISK_=216, SLASH_=217, BACKSLASH_=218, 
		DOT_=219, DOT_ASTERISK_=220, SAFE_EQ_=221, DEQ_=222, EQ_=223, NEQ_=224, 
		GT_=225, GTE_=226, LT_=227, LTE_=228, POUND_=229, LP_=230, RP_=231, LBE_=232, 
		RBE_=233, LBT_=234, RBT_=235, COMMA_=236, DQ_=237, SQ_=238, BQ_=239, QUESTION_=240, 
		AT_=241, SEMI_=242, IDENTIFIER_=243, STRING_=244, NUMBER_=245, HEX_DIGIT_=246, 
		BIT_NUM_=247;
	public static final int
		RULE_execute = 0, RULE_createIndex = 1, RULE_alterIndex = 2, RULE_dropIndex = 3, 
		RULE_createTable = 4, RULE_alterTable = 5, RULE_truncateTable = 6, RULE_dropTable = 7, 
		RULE_createTableHeader = 8, RULE_createTableBody = 9, RULE_createTableDefinition = 10, 
		RULE_periodClause = 11, RULE_tableIndex = 12, RULE_tableOption = 13, RULE_tableOptOption = 14, 
		RULE_distributionOption = 15, RULE_dataWareHouseTableOption = 16, RULE_dataWareHousePartitionOption = 17, 
		RULE_tableStretchOptions = 18, RULE_columnDefinition = 19, RULE_columnDefinitionOption = 20, 
		RULE_columnConstraint = 21, RULE_primaryKeyConstraint = 22, RULE_diskTablePrimaryKeyConstraintOption = 23, 
		RULE_columnForeignKeyConstraint = 24, RULE_foreignKeyOnAction = 25, RULE_foreignKeyOn = 26, 
		RULE_memoryTablePrimaryKeyConstraintOption = 27, RULE_hashWithBucket = 28, 
		RULE_withBucket = 29, RULE_primaryKeyWithClause = 30, RULE_primaryKeyOnClause = 31, 
		RULE_onSchemaColumn = 32, RULE_onFileGroup = 33, RULE_onString = 34, RULE_checkConstraint = 35, 
		RULE_columnIndex = 36, RULE_indexOnClause = 37, RULE_onDefault = 38, RULE_tableConstraint = 39, 
		RULE_tablePrimaryConstraint = 40, RULE_primaryKeyUnique = 41, RULE_diskTablePrimaryConstraintOption = 42, 
		RULE_memoryTablePrimaryConstraintOption = 43, RULE_tableForeignKeyConstraint = 44, 
		RULE_computedColumnDefinition = 45, RULE_columnSetDefinition = 46, RULE_alterTableOp = 47, 
		RULE_alterColumn = 48, RULE_modifyColumnSpecification = 49, RULE_alterColumnOp = 50, 
		RULE_addColumnSpecification = 51, RULE_alterColumnAddOption = 52, RULE_constraintForColumn = 53, 
		RULE_columnNameWithSortsWithParen = 54, RULE_columnNameWithSort = 55, 
		RULE_columnNameGeneratedClause = 56, RULE_columnNameGenerated = 57, RULE_alterDrop = 58, 
		RULE_alterTableDropConstraint = 59, RULE_dropConstraintName = 60, RULE_dropConstraintWithClause = 61, 
		RULE_dropConstraintOption = 62, RULE_dropColumnSpecification = 63, RULE_dropIndexSpecification = 64, 
		RULE_alterCheckConstraint = 65, RULE_alterTrigger = 66, RULE_alterSwitch = 67, 
		RULE_alterSet = 68, RULE_setFileStreamClause = 69, RULE_setSystemVersionClause = 70, 
		RULE_alterSetOnClause = 71, RULE_alterTableTableIndex = 72, RULE_indexWithName = 73, 
		RULE_indexNonClusterClause = 74, RULE_alterTableIndexOnClause = 75, RULE_indexClusterClause = 76, 
		RULE_alterTableTableOption = 77, RULE_schemaName = 78, RULE_tableName = 79, 
		RULE_columnName = 80, RULE_collationName = 81, RULE_indexName = 82, RULE_alias = 83, 
		RULE_dataTypeLength = 84, RULE_primaryKey = 85, RULE_columnNames = 86, 
		RULE_exprs = 87, RULE_exprList = 88, RULE_expr = 89, RULE_exprRecursive = 90, 
		RULE_booleanPrimary = 91, RULE_comparisonOperator = 92, RULE_predicate = 93, 
		RULE_bitExpr = 94, RULE_simpleExpr = 95, RULE_functionCall = 96, RULE_distinct = 97, 
		RULE_intervalExpr = 98, RULE_caseExpress = 99, RULE_privateExprOfDb = 100, 
		RULE_variable = 101, RULE_literal = 102, RULE_question = 103, RULE_number = 104, 
		RULE_string = 105, RULE_subquery = 106, RULE_collateClause = 107, RULE_orderByClause = 108, 
		RULE_orderByItem = 109, RULE_asterisk = 110, RULE_dataType = 111, RULE_dataTypeName_ = 112, 
		RULE_atTimeZoneExpr = 113, RULE_castExpr = 114, RULE_convertExpr = 115, 
		RULE_windowedFunction = 116, RULE_overClause = 117, RULE_partitionByClause = 118, 
		RULE_orderByExpr = 119, RULE_rowRangeClause = 120, RULE_windowFrameExtent = 121, 
		RULE_windowFrameBetween = 122, RULE_windowFrameBound = 123, RULE_windowFramePreceding = 124, 
		RULE_windowFrameFollowing = 125, RULE_indexOption = 126, RULE_compressionOption = 127, 
		RULE_eqTime = 128, RULE_eqOnOffOption = 129, RULE_eqKey = 130, RULE_eqOnOff = 131, 
		RULE_onPartitionClause = 132, RULE_partitionExpressions = 133, RULE_partitionExpression = 134, 
		RULE_numberRange = 135, RULE_lowPriorityLockWait = 136, RULE_onLowPriorLockWait = 137, 
		RULE_ignoredIdentifier_ = 138, RULE_ignoredIdentifiers_ = 139, RULE_matchNone = 140, 
		RULE_setTransaction = 141, RULE_setAutoCommit = 142, RULE_autoCommitValue = 143, 
		RULE_beginTransaction = 144, RULE_commit = 145, RULE_rollback = 146, RULE_savepoint = 147, 
		RULE_grant = 148, RULE_revoke = 149, RULE_deny = 150, RULE_classPrivilegesClause_ = 151, 
		RULE_classPrivileges_ = 152, RULE_onClassClause_ = 153, RULE_classTypePrivilegesClause_ = 154, 
		RULE_classTypePrivileges_ = 155, RULE_onClassTypeClause_ = 156, RULE_privilegeType_ = 157, 
		RULE_class_ = 158, RULE_classType_ = 159, RULE_createUser = 160, RULE_dropUser = 161, 
		RULE_alterUser = 162, RULE_createRole = 163, RULE_dropRole = 164, RULE_alterRole = 165, 
		RULE_createLogin = 166, RULE_dropLogin = 167, RULE_alterLogin = 168;
	public static final String[] ruleNames = {
		"execute", "createIndex", "alterIndex", "dropIndex", "createTable", "alterTable", 
		"truncateTable", "dropTable", "createTableHeader", "createTableBody", 
		"createTableDefinition", "periodClause", "tableIndex", "tableOption", 
		"tableOptOption", "distributionOption", "dataWareHouseTableOption", "dataWareHousePartitionOption", 
		"tableStretchOptions", "columnDefinition", "columnDefinitionOption", "columnConstraint", 
		"primaryKeyConstraint", "diskTablePrimaryKeyConstraintOption", "columnForeignKeyConstraint", 
		"foreignKeyOnAction", "foreignKeyOn", "memoryTablePrimaryKeyConstraintOption", 
		"hashWithBucket", "withBucket", "primaryKeyWithClause", "primaryKeyOnClause", 
		"onSchemaColumn", "onFileGroup", "onString", "checkConstraint", "columnIndex", 
		"indexOnClause", "onDefault", "tableConstraint", "tablePrimaryConstraint", 
		"primaryKeyUnique", "diskTablePrimaryConstraintOption", "memoryTablePrimaryConstraintOption", 
		"tableForeignKeyConstraint", "computedColumnDefinition", "columnSetDefinition", 
		"alterTableOp", "alterColumn", "modifyColumnSpecification", "alterColumnOp", 
		"addColumnSpecification", "alterColumnAddOption", "constraintForColumn", 
		"columnNameWithSortsWithParen", "columnNameWithSort", "columnNameGeneratedClause", 
		"columnNameGenerated", "alterDrop", "alterTableDropConstraint", "dropConstraintName", 
		"dropConstraintWithClause", "dropConstraintOption", "dropColumnSpecification", 
		"dropIndexSpecification", "alterCheckConstraint", "alterTrigger", "alterSwitch", 
		"alterSet", "setFileStreamClause", "setSystemVersionClause", "alterSetOnClause", 
		"alterTableTableIndex", "indexWithName", "indexNonClusterClause", "alterTableIndexOnClause", 
		"indexClusterClause", "alterTableTableOption", "schemaName", "tableName", 
		"columnName", "collationName", "indexName", "alias", "dataTypeLength", 
		"primaryKey", "columnNames", "exprs", "exprList", "expr", "exprRecursive", 
		"booleanPrimary", "comparisonOperator", "predicate", "bitExpr", "simpleExpr", 
		"functionCall", "distinct", "intervalExpr", "caseExpress", "privateExprOfDb", 
		"variable", "literal", "question", "number", "string", "subquery", "collateClause", 
		"orderByClause", "orderByItem", "asterisk", "dataType", "dataTypeName_", 
		"atTimeZoneExpr", "castExpr", "convertExpr", "windowedFunction", "overClause", 
		"partitionByClause", "orderByExpr", "rowRangeClause", "windowFrameExtent", 
		"windowFrameBetween", "windowFrameBound", "windowFramePreceding", "windowFrameFollowing", 
		"indexOption", "compressionOption", "eqTime", "eqOnOffOption", "eqKey", 
		"eqOnOff", "onPartitionClause", "partitionExpressions", "partitionExpression", 
		"numberRange", "lowPriorityLockWait", "onLowPriorLockWait", "ignoredIdentifier_", 
		"ignoredIdentifiers_", "matchNone", "setTransaction", "setAutoCommit", 
		"autoCommitValue", "beginTransaction", "commit", "rollback", "savepoint", 
		"grant", "revoke", "deny", "classPrivilegesClause_", "classPrivileges_", 
		"onClassClause_", "classTypePrivilegesClause_", "classTypePrivileges_", 
		"onClassTypeClause_", "privilegeType_", "class_", "classType_", "createUser", 
		"dropUser", "alterUser", "createRole", "dropRole", "alterRole", "createLogin", 
		"dropLogin", "alterLogin"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Default does not match anything'", null, null, null, null, null, 
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
		null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'", "'&&'", 
		"'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", "'%'", "':'", 
		"'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", "'=='", "'='", 
		null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "','", "'\"'", "'''", "'`'", "'?'", "'@'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WS", "ALL", "AND", "ANY", "ASC", "BETWEEN", "BINARY", "BY", 
		"DATE", "DESC", "DISTINCT", "ESCAPE", "EXISTS", "FALSE", "FROM", "GROUP", 
		"HAVING", "HIDDEN_", "IN", "IS", "KEY", "LIKE", "LIMIT", "MOD", "NOT", 
		"NULL", "OFFSET", "OR", "ORDER", "PARTITION", "PRIMARY", "REGEXP", "ROW", 
		"SET", "SOUNDS", "TIME", "TIMESTAMP", "TRUE", "UNION", "UNKNOWN", "WHERE", 
		"WITH", "XOR", "ADD", "ALTER", "ALWAYS", "AS", "CASCADE", "CHECK", "COLUMN", 
		"COMMIT", "CONSTRAINT", "CREATE", "CURRENT", "DAY", "DEFAULT", "DELETE", 
		"DISABLE", "DROP", "ENABLE", "FOR", "FOREIGN", "FUNCTION", "GENERATED", 
		"GRANT", "INDEX", "NO", "ON", "OPTION", "PRIVILEGES", "REFERENCES", "REVOKE", 
		"ROLE", "ROLLBACK", "ROWS", "START", "TABLE", "TO", "TRANSACTION", "TRUNCATE", 
		"UNIQUE", "USER", "YEAR", "ABORT_AFTER_WAIT", "ACTION", "ALGORITHM", "ALLOW_PAGE_LOCKS", 
		"ALLOW_ROW_LOCKS", "ALL_SPARSE_COLUMNS", "AUTO", "BEGIN", "BLOCKERS", 
		"BUCKET_COUNT", "CAST", "CLUSTERED", "COLLATE", "COLUMNSTORE", "COLUMNSTORE_ARCHIVE", 
		"COLUMN_ENCRYPTION_KEY", "COLUMN_SET", "COMPRESSION_DELAY", "CONTENT", 
		"CONVERT", "DATABASE", "DATABASE_DEAULT", "DATA_COMPRESSION", "DATA_CONSISTENCY_CHECK", 
		"DAYS", "DENY", "DETERMINISTIC", "DISTRIBUTION", "DOCUMENT", "DROP_EXISTING", 
		"DURABILITY", "ENCRYPTED", "ENCRYPTION_TYPE", "END", "FILESTREAM", "FILESTREAM_ON", 
		"FILETABLE", "FILETABLE_COLLATE_FILENAME", "FILETABLE_DIRECTORY", "FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME", 
		"FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME", "FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME", 
		"FILLFACTOR", "FILTER_PREDICATE", "FOLLOWING", "HASH", "HEAP", "HISTORY_RETENTION_PERIOD", 
		"HISTORY_TABLE", "IDENTITY", "IF", "IGNORE_DUP_KEY", "IMPLICIT_TRANSACTIONS", 
		"INBOUND", "INFINITE", "LEFT", "LOCK_ESCALATION", "LOGIN", "MASKED", "MAX", 
		"MAXDOP", "MAX_DURATION", "MEMORY_OPTIMIZED", "MIGRATION_STATE", "MINUTES", 
		"MONTH", "MONTHS", "MOVE", "NOCHECK", "NONCLUSTERED", "NONE", "OBJECT", 
		"OFF", "ONLINE", "OUTBOUND", "OVER", "PAD_INDEX", "PAGE", "PARTITIONS", 
		"PAUSED", "PERIOD", "PERSISTED", "PRECEDING", "RANDOMIZED", "RANGE", "REBUILD", 
		"REMOTE_DATA_ARCHIVE", "REPLICATE", "REPLICATION", "RESUMABLE", "RIGHT", 
		"ROUND_ROBIN", "ROWGUIDCOL", "SAVE", "SCHEMA", "SCHEMA_AND_DATA", "SCHEMA_ONLY", 
		"SELF", "SORT_IN_TEMPDB", "SPARSE", "STATISTICS_INCREMENTAL", "STATISTICS_NORECOMPUTE", 
		"SWITCH", "SYSTEM_TIME", "SYSTEM_VERSIONING", "TEXTIMAGE_ON", "TRAN", 
		"TRANCOUNT", "TRIGGER", "UNBOUNDED", "UPDATE", "VALUES", "WAIT_AT_LOW_PRIORITY", 
		"WEEK", "WEEKS", "YEARS", "ZONE", "FOR_GENERATOR", "AND_", "OR_", "NOT_", 
		"TILDE_", "VERTICAL_BAR_", "AMPERSAND_", "SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", 
		"CARET_", "MOD_", "COLON_", "PLUS_", "MINUS_", "ASTERISK_", "SLASH_", 
		"BACKSLASH_", "DOT_", "DOT_ASTERISK_", "SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", 
		"GT_", "GTE_", "LT_", "LTE_", "POUND_", "LP_", "RP_", "LBE_", "RBE_", 
		"LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", "BQ_", "QUESTION_", "AT_", "SEMI_", 
		"IDENTIFIER_", "STRING_", "NUMBER_", "HEX_DIGIT_", "BIT_NUM_"
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
	public String getGrammarFileName() { return "SQLServerStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLServerStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExecuteContext extends ParserRuleContext {
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public AlterIndexContext alterIndex() {
			return getRuleContext(AlterIndexContext.class,0);
		}
		public DropIndexContext dropIndex() {
			return getRuleContext(DropIndexContext.class,0);
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
		public DenyContext deny() {
			return getRuleContext(DenyContext.class,0);
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
		public CreateRoleContext createRole() {
			return getRuleContext(CreateRoleContext.class,0);
		}
		public DropRoleContext dropRole() {
			return getRuleContext(DropRoleContext.class,0);
		}
		public AlterRoleContext alterRole() {
			return getRuleContext(AlterRoleContext.class,0);
		}
		public CreateLoginContext createLogin() {
			return getRuleContext(CreateLoginContext.class,0);
		}
		public DropLoginContext dropLogin() {
			return getRuleContext(DropLoginContext.class,0);
		}
		public AlterLoginContext alterLogin() {
			return getRuleContext(AlterLoginContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(SQLServerStatementParser.SEMI_, 0); }
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
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(338);
				createIndex();
				}
				break;
			case 2:
				{
				setState(339);
				alterIndex();
				}
				break;
			case 3:
				{
				setState(340);
				dropIndex();
				}
				break;
			case 4:
				{
				setState(341);
				createTable();
				}
				break;
			case 5:
				{
				setState(342);
				alterTable();
				}
				break;
			case 6:
				{
				setState(343);
				dropTable();
				}
				break;
			case 7:
				{
				setState(344);
				truncateTable();
				}
				break;
			case 8:
				{
				setState(345);
				setTransaction();
				}
				break;
			case 9:
				{
				setState(346);
				beginTransaction();
				}
				break;
			case 10:
				{
				setState(347);
				setAutoCommit();
				}
				break;
			case 11:
				{
				setState(348);
				commit();
				}
				break;
			case 12:
				{
				setState(349);
				rollback();
				}
				break;
			case 13:
				{
				setState(350);
				savepoint();
				}
				break;
			case 14:
				{
				setState(351);
				grant();
				}
				break;
			case 15:
				{
				setState(352);
				revoke();
				}
				break;
			case 16:
				{
				setState(353);
				deny();
				}
				break;
			case 17:
				{
				setState(354);
				createUser();
				}
				break;
			case 18:
				{
				setState(355);
				dropUser();
				}
				break;
			case 19:
				{
				setState(356);
				alterUser();
				}
				break;
			case 20:
				{
				setState(357);
				createRole();
				}
				break;
			case 21:
				{
				setState(358);
				dropRole();
				}
				break;
			case 22:
				{
				setState(359);
				alterRole();
				}
				break;
			case 23:
				{
				setState(360);
				createLogin();
				}
				break;
			case 24:
				{
				setState(361);
				dropLogin();
				}
				break;
			case 25:
				{
				setState(362);
				alterLogin();
				}
				break;
			}
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(365);
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

	public static class CreateIndexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLServerStatementParser.UNIQUE, 0); }
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(CREATE);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(369);
				match(UNIQUE);
				}
			}

			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(372);
				_la = _input.LA(1);
				if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(375);
			match(INDEX);
			setState(376);
			indexName();
			setState(377);
			match(ON);
			setState(378);
			tableName();
			setState(379);
			columnNames();
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

	public static class AlterIndexContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public AlterIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndex; }
	}

	public final AlterIndexContext alterIndex() throws RecognitionException {
		AlterIndexContext _localctx = new AlterIndexContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(ALTER);
			setState(382);
			match(INDEX);
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				{
				setState(383);
				indexName();
				}
				break;
			case ALL:
				{
				setState(384);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(387);
			match(ON);
			setState(388);
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
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dropIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(DROP);
			setState(391);
			match(INDEX);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(392);
				match(IF);
				setState(393);
				match(EXISTS);
				}
			}

			setState(396);
			indexName();
			setState(397);
			match(ON);
			setState(398);
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

	public static class CreateTableContext extends ParserRuleContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public CreateTableBodyContext createTableBody() {
			return getRuleContext(CreateTableBodyContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			createTableHeader();
			setState(401);
			createTableBody();
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
		public AlterTableOpContext alterTableOp() {
			return getRuleContext(AlterTableOpContext.class,0);
		}
		public AlterColumnContext alterColumn() {
			return getRuleContext(AlterColumnContext.class,0);
		}
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public AlterDropContext alterDrop() {
			return getRuleContext(AlterDropContext.class,0);
		}
		public AlterCheckConstraintContext alterCheckConstraint() {
			return getRuleContext(AlterCheckConstraintContext.class,0);
		}
		public AlterTriggerContext alterTrigger() {
			return getRuleContext(AlterTriggerContext.class,0);
		}
		public AlterSwitchContext alterSwitch() {
			return getRuleContext(AlterSwitchContext.class,0);
		}
		public AlterSetContext alterSet() {
			return getRuleContext(AlterSetContext.class,0);
		}
		public AlterTableTableOptionContext alterTableTableOption() {
			return getRuleContext(AlterTableTableOptionContext.class,0);
		}
		public TerminalNode REBUILD() { return getToken(SQLServerStatementParser.REBUILD, 0); }
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alterTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			alterTableOp();
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(404);
				alterColumn();
				}
				break;
			case 2:
				{
				setState(405);
				addColumnSpecification();
				}
				break;
			case 3:
				{
				setState(406);
				alterDrop();
				}
				break;
			case 4:
				{
				setState(407);
				alterCheckConstraint();
				}
				break;
			case 5:
				{
				setState(408);
				alterTrigger();
				}
				break;
			case 6:
				{
				setState(409);
				alterSwitch();
				}
				break;
			case 7:
				{
				setState(410);
				alterSet();
				}
				break;
			case 8:
				{
				setState(411);
				alterTableTableOption();
				}
				break;
			case 9:
				{
				setState(412);
				match(REBUILD);
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

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(SQLServerStatementParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_truncateTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(TRUNCATE);
			setState(416);
			match(TABLE);
			setState(417);
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dropTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(DROP);
			setState(420);
			match(TABLE);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(421);
				match(IF);
				setState(422);
				match(EXISTS);
				}
			}

			setState(425);
			tableName();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(426);
				match(COMMA_);
				setState(427);
				tableName();
				}
				}
				setState(432);
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

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createTableHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(CREATE);
			setState(434);
			match(TABLE);
			setState(435);
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

	public static class CreateTableBodyContext extends ParserRuleContext {
		public List<TerminalNode> LP_() { return getTokens(SQLServerStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(SQLServerStatementParser.LP_, i);
		}
		public List<CreateTableDefinitionContext> createTableDefinition() {
			return getRuleContexts(CreateTableDefinitionContext.class);
		}
		public CreateTableDefinitionContext createTableDefinition(int i) {
			return getRuleContext(CreateTableDefinitionContext.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(SQLServerStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(SQLServerStatementParser.RP_, i);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode FILETABLE() { return getToken(SQLServerStatementParser.FILETABLE, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public PeriodClauseContext periodClause() {
			return getRuleContext(PeriodClauseContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode TEXTIMAGE_ON() { return getToken(SQLServerStatementParser.TEXTIMAGE_ON, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public List<TableOptionContext> tableOption() {
			return getRuleContexts(TableOptionContext.class);
		}
		public TableOptionContext tableOption(int i) {
			return getRuleContext(TableOptionContext.class,i);
		}
		public List<SchemaNameContext> schemaName() {
			return getRuleContexts(SchemaNameContext.class);
		}
		public SchemaNameContext schemaName(int i) {
			return getRuleContext(SchemaNameContext.class,i);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public List<IgnoredIdentifier_Context> ignoredIdentifier_() {
			return getRuleContexts(IgnoredIdentifier_Context.class);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_(int i) {
			return getRuleContext(IgnoredIdentifier_Context.class,i);
		}
		public List<TerminalNode> STRING_() { return getTokens(SQLServerStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(SQLServerStatementParser.STRING_, i);
		}
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public CreateTableBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableBody; }
	}

	public final CreateTableBodyContext createTableBody() throws RecognitionException {
		CreateTableBodyContext _localctx = new CreateTableBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_createTableBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(437);
				match(AS);
				setState(438);
				match(FILETABLE);
				}
			}

			setState(441);
			match(LP_);
			setState(442);
			createTableDefinition();
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(443);
					match(COMMA_);
					setState(444);
					createTableDefinition();
					}
					} 
				}
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(450);
				match(COMMA_);
				setState(451);
				periodClause();
				}
			}

			setState(454);
			match(RP_);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(455);
				match(ON);
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(456);
					schemaName();
					setState(457);
					match(LP_);
					setState(458);
					columnName();
					setState(459);
					match(RP_);
					}
					break;
				case 2:
					{
					setState(461);
					ignoredIdentifier_();
					}
					break;
				case 3:
					{
					setState(462);
					match(STRING_);
					}
					break;
				}
				}
			}

			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXTIMAGE_ON) {
				{
				setState(467);
				match(TEXTIMAGE_ON);
				setState(470);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER_:
					{
					setState(468);
					ignoredIdentifier_();
					}
					break;
				case STRING_:
					{
					setState(469);
					match(STRING_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILESTREAM_ON || _la==IDENTIFIER_) {
				{
				setState(479);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FILESTREAM_ON:
					{
					setState(474);
					match(FILESTREAM_ON);
					{
					setState(475);
					schemaName();
					}
					}
					break;
				case IDENTIFIER_:
					{
					setState(476);
					ignoredIdentifier_();
					setState(477);
					match(STRING_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(483);
				match(WITH);
				setState(484);
				match(LP_);
				setState(485);
				tableOption();
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(486);
					match(COMMA_);
					setState(487);
					tableOption();
					}
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(493);
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

	public static class CreateTableDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public ComputedColumnDefinitionContext computedColumnDefinition() {
			return getRuleContext(ComputedColumnDefinitionContext.class,0);
		}
		public ColumnSetDefinitionContext columnSetDefinition() {
			return getRuleContext(ColumnSetDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TableIndexContext tableIndex() {
			return getRuleContext(TableIndexContext.class,0);
		}
		public CreateTableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableDefinition; }
	}

	public final CreateTableDefinitionContext createTableDefinition() throws RecognitionException {
		CreateTableDefinitionContext _localctx = new CreateTableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createTableDefinition);
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				computedColumnDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
				columnSetDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(500);
				tableConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(501);
				tableIndex();
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

	public static class PeriodClauseContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(SQLServerStatementParser.PERIOD, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SQLServerStatementParser.SYSTEM_TIME, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public PeriodClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_periodClause; }
	}

	public final PeriodClauseContext periodClause() throws RecognitionException {
		PeriodClauseContext _localctx = new PeriodClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_periodClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(PERIOD);
			setState(505);
			match(FOR);
			setState(506);
			match(SYSTEM_TIME);
			setState(507);
			match(LP_);
			setState(508);
			columnName();
			setState(509);
			match(COMMA_);
			setState(510);
			columnName();
			setState(511);
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

	public static class TableIndexContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode WHERE() { return getToken(SQLServerStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(SQLServerStatementParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SQLServerStatementParser.WITH, i);
		}
		public List<TerminalNode> LP_() { return getTokens(SQLServerStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(SQLServerStatementParser.LP_, i);
		}
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(SQLServerStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(SQLServerStatementParser.RP_, i);
		}
		public IndexOnClauseContext indexOnClause() {
			return getRuleContext(IndexOnClauseContext.class,0);
		}
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public HashWithBucketContext hashWithBucket() {
			return getRuleContext(HashWithBucketContext.class,0);
		}
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public TableIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIndex; }
	}

	public final TableIndexContext tableIndex() throws RecognitionException {
		TableIndexContext _localctx = new TableIndexContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tableIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(INDEX);
			setState(514);
			indexName();
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(515);
					_la = _input.LA(1);
					if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(518);
				columnNames();
				}
				break;
			case 2:
				{
				setState(519);
				match(CLUSTERED);
				setState(520);
				match(COLUMNSTORE);
				}
				break;
			case 3:
				{
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NONCLUSTERED) {
					{
					setState(521);
					match(NONCLUSTERED);
					}
				}

				setState(527);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLUMNSTORE:
					{
					setState(524);
					match(COLUMNSTORE);
					setState(525);
					columnNames();
					}
					break;
				case HASH:
					{
					setState(526);
					hashWithBucket();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				{
				setState(529);
				match(CLUSTERED);
				setState(530);
				match(COLUMNSTORE);
				setState(540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(531);
					match(WITH);
					setState(532);
					match(LP_);
					setState(533);
					match(COMPRESSION_DELAY);
					setState(534);
					match(EQ_);
					{
					setState(535);
					match(NUMBER_);
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MINUTES) {
						{
						setState(536);
						match(MINUTES);
						}
					}

					}
					setState(539);
					match(RP_);
					}
					break;
				}
				}
				break;
			}
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(544);
				match(WHERE);
				setState(545);
				expr(0);
				}
			}

			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(548);
				match(WITH);
				setState(549);
				match(LP_);
				setState(550);
				indexOption();
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(551);
					match(COMMA_);
					setState(552);
					indexOption();
					}
					}
					setState(557);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(558);
				match(RP_);
				}
			}

			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(562);
				indexOnClause();
				}
			}

			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILESTREAM_ON) {
				{
				setState(565);
				match(FILESTREAM_ON);
				setState(569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(566);
					ignoredIdentifier_();
					}
					break;
				case 2:
					{
					setState(567);
					schemaName();
					}
					break;
				case 3:
					{
					setState(568);
					match(STRING_);
					}
					break;
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

	public static class TableOptionContext extends ParserRuleContext {
		public TerminalNode DATA_COMPRESSION() { return getToken(SQLServerStatementParser.DATA_COMPRESSION, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TerminalNode NONE() { return getToken(SQLServerStatementParser.NONE, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode PAGE() { return getToken(SQLServerStatementParser.PAGE, 0); }
		public List<TerminalNode> ON() { return getTokens(SQLServerStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SQLServerStatementParser.ON, i);
		}
		public TerminalNode PARTITIONS() { return getToken(SQLServerStatementParser.PARTITIONS, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public PartitionExpressionsContext partitionExpressions() {
			return getRuleContext(PartitionExpressionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode FILETABLE_DIRECTORY() { return getToken(SQLServerStatementParser.FILETABLE_DIRECTORY, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode FILETABLE_COLLATE_FILENAME() { return getToken(SQLServerStatementParser.FILETABLE_COLLATE_FILENAME, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode DATABASE_DEAULT() { return getToken(SQLServerStatementParser.DATABASE_DEAULT, 0); }
		public TerminalNode FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME, 0); }
		public TerminalNode FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME, 0); }
		public TerminalNode FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME, 0); }
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public TerminalNode HISTORY_TABLE() { return getToken(SQLServerStatementParser.HISTORY_TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode DATA_CONSISTENCY_CHECK() { return getToken(SQLServerStatementParser.DATA_CONSISTENCY_CHECK, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public TerminalNode REMOTE_DATA_ARCHIVE() { return getToken(SQLServerStatementParser.REMOTE_DATA_ARCHIVE, 0); }
		public TerminalNode MIGRATION_STATE() { return getToken(SQLServerStatementParser.MIGRATION_STATE, 0); }
		public TerminalNode PAUSED() { return getToken(SQLServerStatementParser.PAUSED, 0); }
		public List<TableStretchOptionsContext> tableStretchOptions() {
			return getRuleContexts(TableStretchOptionsContext.class);
		}
		public TableStretchOptionsContext tableStretchOptions(int i) {
			return getRuleContext(TableStretchOptionsContext.class,i);
		}
		public TableOptOptionContext tableOptOption() {
			return getRuleContext(TableOptOptionContext.class,0);
		}
		public DistributionOptionContext distributionOption() {
			return getRuleContext(DistributionOptionContext.class,0);
		}
		public DataWareHouseTableOptionContext dataWareHouseTableOption() {
			return getRuleContext(DataWareHouseTableOptionContext.class,0);
		}
		public TableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOption; }
	}

	public final TableOptionContext tableOption() throws RecognitionException {
		TableOptionContext _localctx = new TableOptionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tableOption);
		int _la;
		try {
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				match(DATA_COMPRESSION);
				setState(574);
				match(EQ_);
				setState(575);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==NONE || _la==PAGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(576);
					match(ON);
					setState(577);
					match(PARTITIONS);
					setState(578);
					match(LP_);
					setState(579);
					partitionExpressions();
					setState(580);
					match(RP_);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				match(FILETABLE_DIRECTORY);
				setState(585);
				match(EQ_);
				setState(586);
				ignoredIdentifier_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(587);
				match(FILETABLE_COLLATE_FILENAME);
				setState(588);
				match(EQ_);
				setState(591);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER_:
				case STRING_:
					{
					setState(589);
					collationName();
					}
					break;
				case DATABASE_DEAULT:
					{
					setState(590);
					match(DATABASE_DEAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(593);
				match(FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME);
				setState(594);
				match(EQ_);
				setState(595);
				ignoredIdentifier_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(596);
				match(FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME);
				setState(597);
				match(EQ_);
				setState(598);
				ignoredIdentifier_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(599);
				match(FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME);
				setState(600);
				match(EQ_);
				setState(601);
				ignoredIdentifier_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(602);
				match(SYSTEM_VERSIONING);
				setState(603);
				match(EQ_);
				setState(604);
				match(ON);
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(605);
					match(LP_);
					setState(606);
					match(HISTORY_TABLE);
					setState(607);
					match(EQ_);
					setState(608);
					tableName();
					setState(613);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA_) {
						{
						setState(609);
						match(COMMA_);
						setState(610);
						match(DATA_CONSISTENCY_CHECK);
						setState(611);
						match(EQ_);
						setState(612);
						_la = _input.LA(1);
						if ( !(_la==ON || _la==OFF) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(615);
					match(RP_);
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(619);
				match(REMOTE_DATA_ARCHIVE);
				setState(620);
				match(EQ_);
				setState(641);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON:
					{
					setState(621);
					match(ON);
					setState(633);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LP_) {
						{
						setState(622);
						match(LP_);
						setState(623);
						tableStretchOptions();
						setState(628);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA_) {
							{
							{
							setState(624);
							match(COMMA_);
							setState(625);
							tableStretchOptions();
							}
							}
							setState(630);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(631);
						match(RP_);
						}
					}

					}
					break;
				case OFF:
					{
					setState(635);
					match(OFF);
					setState(636);
					match(LP_);
					setState(637);
					match(MIGRATION_STATE);
					setState(638);
					match(EQ_);
					setState(639);
					match(PAUSED);
					setState(640);
					match(RP_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(643);
				tableOptOption();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(644);
				distributionOption();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(645);
				dataWareHouseTableOption();
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

	public static class TableOptOptionContext extends ParserRuleContext {
		public TerminalNode MEMORY_OPTIMIZED() { return getToken(SQLServerStatementParser.MEMORY_OPTIMIZED, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public List<TerminalNode> ON() { return getTokens(SQLServerStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SQLServerStatementParser.ON, i);
		}
		public TerminalNode DURABILITY() { return getToken(SQLServerStatementParser.DURABILITY, 0); }
		public TerminalNode SCHEMA_ONLY() { return getToken(SQLServerStatementParser.SCHEMA_ONLY, 0); }
		public TerminalNode SCHEMA_AND_DATA() { return getToken(SQLServerStatementParser.SCHEMA_AND_DATA, 0); }
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode HISTORY_TABLE() { return getToken(SQLServerStatementParser.HISTORY_TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode DATA_CONSISTENCY_CHECK() { return getToken(SQLServerStatementParser.DATA_CONSISTENCY_CHECK, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public TableOptOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptOption; }
	}

	public final TableOptOptionContext tableOptOption() throws RecognitionException {
		TableOptOptionContext _localctx = new TableOptOptionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tableOptOption);
		int _la;
		try {
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MEMORY_OPTIMIZED:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(648);
				match(MEMORY_OPTIMIZED);
				setState(649);
				match(EQ_);
				setState(650);
				match(ON);
				}
				}
				break;
			case DURABILITY:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(651);
				match(DURABILITY);
				setState(652);
				match(EQ_);
				setState(653);
				_la = _input.LA(1);
				if ( !(_la==SCHEMA_AND_DATA || _la==SCHEMA_ONLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case SYSTEM_VERSIONING:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(654);
				match(SYSTEM_VERSIONING);
				setState(655);
				match(EQ_);
				setState(656);
				match(ON);
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(657);
					match(LP_);
					setState(658);
					match(HISTORY_TABLE);
					setState(659);
					match(EQ_);
					setState(660);
					tableName();
					setState(665);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA_) {
						{
						setState(661);
						match(COMMA_);
						setState(662);
						match(DATA_CONSISTENCY_CHECK);
						setState(663);
						match(EQ_);
						setState(664);
						_la = _input.LA(1);
						if ( !(_la==ON || _la==OFF) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(667);
					match(RP_);
					}
				}

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

	public static class DistributionOptionContext extends ParserRuleContext {
		public TerminalNode DISTRIBUTION() { return getToken(SQLServerStatementParser.DISTRIBUTION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode HASH() { return getToken(SQLServerStatementParser.HASH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode ROUND_ROBIN() { return getToken(SQLServerStatementParser.ROUND_ROBIN, 0); }
		public TerminalNode REPLICATE() { return getToken(SQLServerStatementParser.REPLICATE, 0); }
		public DistributionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distributionOption; }
	}

	public final DistributionOptionContext distributionOption() throws RecognitionException {
		DistributionOptionContext _localctx = new DistributionOptionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_distributionOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(DISTRIBUTION);
			setState(674);
			match(EQ_);
			setState(682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				{
				setState(675);
				match(HASH);
				setState(676);
				match(LP_);
				setState(677);
				columnName();
				setState(678);
				match(RP_);
				}
				break;
			case ROUND_ROBIN:
				{
				setState(680);
				match(ROUND_ROBIN);
				}
				break;
			case REPLICATE:
				{
				setState(681);
				match(REPLICATE);
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

	public static class DataWareHouseTableOptionContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public TerminalNode HEAP() { return getToken(SQLServerStatementParser.HEAP, 0); }
		public DataWareHousePartitionOptionContext dataWareHousePartitionOption() {
			return getRuleContext(DataWareHousePartitionOptionContext.class,0);
		}
		public DataWareHouseTableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataWareHouseTableOption; }
	}

	public final DataWareHouseTableOptionContext dataWareHouseTableOption() throws RecognitionException {
		DataWareHouseTableOptionContext _localctx = new DataWareHouseTableOptionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dataWareHouseTableOption);
		try {
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLUSTERED:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				match(CLUSTERED);
				setState(685);
				match(COLUMNSTORE);
				setState(686);
				match(INDEX);
				}
				break;
			case HEAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				match(HEAP);
				}
				break;
			case PARTITION:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
				dataWareHousePartitionOption();
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

	public static class DataWareHousePartitionOptionContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SQLServerStatementParser.PARTITION, 0); }
		public List<TerminalNode> LP_() { return getTokens(SQLServerStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(SQLServerStatementParser.LP_, i);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(SQLServerStatementParser.RANGE, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode VALUES() { return getToken(SQLServerStatementParser.VALUES, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(SQLServerStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(SQLServerStatementParser.RP_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode LEFT() { return getToken(SQLServerStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQLServerStatementParser.RIGHT, 0); }
		public DataWareHousePartitionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataWareHousePartitionOption; }
	}

	public final DataWareHousePartitionOptionContext dataWareHousePartitionOption() throws RecognitionException {
		DataWareHousePartitionOptionContext _localctx = new DataWareHousePartitionOptionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dataWareHousePartitionOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(691);
			match(PARTITION);
			setState(692);
			match(LP_);
			setState(693);
			columnName();
			setState(694);
			match(RANGE);
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT || _la==RIGHT) {
				{
				setState(695);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(698);
			match(FOR);
			setState(699);
			match(VALUES);
			setState(700);
			match(LP_);
			setState(701);
			simpleExpr(0);
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(702);
				match(COMMA_);
				setState(703);
				simpleExpr(0);
				}
				}
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(709);
			match(RP_);
			setState(710);
			match(RP_);
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

	public static class TableStretchOptionsContext extends ParserRuleContext {
		public TerminalNode MIGRATION_STATE() { return getToken(SQLServerStatementParser.MIGRATION_STATE, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TerminalNode OUTBOUND() { return getToken(SQLServerStatementParser.OUTBOUND, 0); }
		public TerminalNode INBOUND() { return getToken(SQLServerStatementParser.INBOUND, 0); }
		public TerminalNode PAUSED() { return getToken(SQLServerStatementParser.PAUSED, 0); }
		public TerminalNode FILTER_PREDICATE() { return getToken(SQLServerStatementParser.FILTER_PREDICATE, 0); }
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TableStretchOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableStretchOptions; }
	}

	public final TableStretchOptionsContext tableStretchOptions() throws RecognitionException {
		TableStretchOptionsContext _localctx = new TableStretchOptionsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tableStretchOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER_PREDICATE) {
				{
				setState(712);
				match(FILTER_PREDICATE);
				setState(713);
				match(EQ_);
				setState(716);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NULL:
					{
					setState(714);
					match(NULL);
					}
					break;
				case IDENTIFIER_:
					{
					setState(715);
					functionCall();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(718);
				match(COMMA_);
				}
			}

			setState(721);
			match(MIGRATION_STATE);
			setState(722);
			match(EQ_);
			setState(723);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (INBOUND - 138)) | (1L << (OUTBOUND - 138)) | (1L << (PAUSED - 138)))) != 0)) ) {
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<ColumnDefinitionOptionContext> columnDefinitionOption() {
			return getRuleContexts(ColumnDefinitionOptionContext.class);
		}
		public ColumnDefinitionOptionContext columnDefinitionOption(int i) {
			return getRuleContext(ColumnDefinitionOptionContext.class,i);
		}
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnIndexContext columnIndex() {
			return getRuleContext(ColumnIndexContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_columnDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			columnName();
			setState(726);
			dataType();
			setState(730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(727);
					columnDefinitionOption();
					}
					} 
				}
				setState(732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (KEY - 22)) | (1L << (PRIMARY - 22)) | (1L << (CHECK - 22)) | (1L << (CONSTRAINT - 22)) | (1L << (FOREIGN - 22)) | (1L << (REFERENCES - 22)) | (1L << (UNIQUE - 22)))) != 0)) {
				{
				setState(733);
				columnConstraint();
				setState(738);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(734);
						match(COMMA_);
						setState(735);
						columnConstraint();
						}
						} 
					}
					setState(740);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				}
			}

			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX) {
				{
				setState(743);
				columnIndex();
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

	public static class ColumnDefinitionOptionContext extends ParserRuleContext {
		public TerminalNode FILESTREAM() { return getToken(SQLServerStatementParser.FILESTREAM, 0); }
		public TerminalNode COLLATE() { return getToken(SQLServerStatementParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode SPARSE() { return getToken(SQLServerStatementParser.SPARSE, 0); }
		public TerminalNode MASKED() { return getToken(SQLServerStatementParser.MASKED, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode FUNCTION() { return getToken(SQLServerStatementParser.FUNCTION, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode IDENTITY() { return getToken(SQLServerStatementParser.IDENTITY, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(SQLServerStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQLServerStatementParser.NUMBER_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public TerminalNode GENERATED() { return getToken(SQLServerStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(SQLServerStatementParser.ALWAYS, 0); }
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode START() { return getToken(SQLServerStatementParser.START, 0); }
		public TerminalNode END() { return getToken(SQLServerStatementParser.END, 0); }
		public TerminalNode HIDDEN_() { return getToken(SQLServerStatementParser.HIDDEN_, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode ROWGUIDCOL() { return getToken(SQLServerStatementParser.ROWGUIDCOL, 0); }
		public TerminalNode ENCRYPTED() { return getToken(SQLServerStatementParser.ENCRYPTED, 0); }
		public TerminalNode COLUMN_ENCRYPTION_KEY() { return getToken(SQLServerStatementParser.COLUMN_ENCRYPTION_KEY, 0); }
		public TerminalNode ENCRYPTION_TYPE() { return getToken(SQLServerStatementParser.ENCRYPTION_TYPE, 0); }
		public TerminalNode ALGORITHM() { return getToken(SQLServerStatementParser.ALGORITHM, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(SQLServerStatementParser.DETERMINISTIC, 0); }
		public TerminalNode RANDOMIZED() { return getToken(SQLServerStatementParser.RANDOMIZED, 0); }
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnIndexContext columnIndex() {
			return getRuleContext(ColumnIndexContext.class,0);
		}
		public ColumnDefinitionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinitionOption; }
	}

	public final ColumnDefinitionOptionContext columnDefinitionOption() throws RecognitionException {
		ColumnDefinitionOptionContext _localctx = new ColumnDefinitionOptionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_columnDefinitionOption);
		int _la;
		try {
			int _alt;
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				match(FILESTREAM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				match(COLLATE);
				setState(748);
				collationName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(749);
				match(SPARSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(750);
				match(MASKED);
				setState(751);
				match(WITH);
				setState(752);
				match(LP_);
				setState(753);
				match(FUNCTION);
				setState(754);
				match(EQ_);
				setState(755);
				match(STRING_);
				setState(756);
				match(RP_);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(757);
					match(CONSTRAINT);
					setState(758);
					ignoredIdentifier_();
					}
				}

				setState(761);
				match(DEFAULT);
				setState(762);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(763);
				match(IDENTITY);
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(764);
					match(LP_);
					setState(765);
					match(NUMBER_);
					setState(766);
					match(COMMA_);
					setState(767);
					match(NUMBER_);
					setState(768);
					match(RP_);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(771);
				match(NOT);
				setState(772);
				match(FOR);
				setState(773);
				match(REPLICATION);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(774);
				match(GENERATED);
				setState(775);
				match(ALWAYS);
				setState(776);
				match(AS);
				setState(777);
				match(ROW);
				setState(778);
				_la = _input.LA(1);
				if ( !(_la==START || _la==END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HIDDEN_) {
					{
					setState(779);
					match(HIDDEN_);
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(782);
					match(NOT);
					}
				}

				setState(785);
				match(NULL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(786);
				match(ROWGUIDCOL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(787);
				match(ENCRYPTED);
				setState(788);
				match(WITH);
				setState(789);
				match(LP_);
				setState(790);
				match(COLUMN_ENCRYPTION_KEY);
				setState(791);
				match(EQ_);
				setState(792);
				ignoredIdentifier_();
				setState(793);
				match(COMMA_);
				setState(794);
				match(ENCRYPTION_TYPE);
				setState(795);
				match(EQ_);
				setState(796);
				_la = _input.LA(1);
				if ( !(_la==DETERMINISTIC || _la==RANDOMIZED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(797);
				match(COMMA_);
				setState(798);
				match(ALGORITHM);
				setState(799);
				match(EQ_);
				setState(800);
				match(STRING_);
				setState(801);
				match(RP_);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(803);
				columnConstraint();
				setState(808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(804);
						match(COMMA_);
						setState(805);
						columnConstraint();
						}
						} 
					}
					setState(810);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(811);
				columnIndex();
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

	public static class ColumnConstraintContext extends ParserRuleContext {
		public PrimaryKeyConstraintContext primaryKeyConstraint() {
			return getRuleContext(PrimaryKeyConstraintContext.class,0);
		}
		public ColumnForeignKeyConstraintContext columnForeignKeyConstraint() {
			return getRuleContext(ColumnForeignKeyConstraintContext.class,0);
		}
		public CheckConstraintContext checkConstraint() {
			return getRuleContext(CheckConstraintContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_columnConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(814);
				match(CONSTRAINT);
				setState(815);
				ignoredIdentifier_();
				}
			}

			setState(821);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
			case UNIQUE:
				{
				setState(818);
				primaryKeyConstraint();
				}
				break;
			case FOREIGN:
			case REFERENCES:
				{
				setState(819);
				columnForeignKeyConstraint();
				}
				break;
			case CHECK:
				{
				setState(820);
				checkConstraint();
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

	public static class PrimaryKeyConstraintContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLServerStatementParser.UNIQUE, 0); }
		public DiskTablePrimaryKeyConstraintOptionContext diskTablePrimaryKeyConstraintOption() {
			return getRuleContext(DiskTablePrimaryKeyConstraintOptionContext.class,0);
		}
		public MemoryTablePrimaryKeyConstraintOptionContext memoryTablePrimaryKeyConstraintOption() {
			return getRuleContext(MemoryTablePrimaryKeyConstraintOptionContext.class,0);
		}
		public PrimaryKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyConstraint; }
	}

	public final PrimaryKeyConstraintContext primaryKeyConstraint() throws RecognitionException {
		PrimaryKeyConstraintContext _localctx = new PrimaryKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_primaryKeyConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
				{
				setState(823);
				primaryKey();
				}
				break;
			case UNIQUE:
				{
				setState(824);
				match(UNIQUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(827);
				diskTablePrimaryKeyConstraintOption();
				}
				break;
			case 2:
				{
				setState(828);
				memoryTablePrimaryKeyConstraintOption();
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

	public static class DiskTablePrimaryKeyConstraintOptionContext extends ParserRuleContext {
		public PrimaryKeyWithClauseContext primaryKeyWithClause() {
			return getRuleContext(PrimaryKeyWithClauseContext.class,0);
		}
		public PrimaryKeyOnClauseContext primaryKeyOnClause() {
			return getRuleContext(PrimaryKeyOnClauseContext.class,0);
		}
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public DiskTablePrimaryKeyConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diskTablePrimaryKeyConstraintOption; }
	}

	public final DiskTablePrimaryKeyConstraintOptionContext diskTablePrimaryKeyConstraintOption() throws RecognitionException {
		DiskTablePrimaryKeyConstraintOptionContext _localctx = new DiskTablePrimaryKeyConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_diskTablePrimaryKeyConstraintOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(831);
				_la = _input.LA(1);
				if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(834);
				primaryKeyWithClause();
				}
			}

			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(837);
				primaryKeyOnClause();
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

	public static class ColumnForeignKeyConstraintContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(SQLServerStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode FOREIGN() { return getToken(SQLServerStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public List<ForeignKeyOnActionContext> foreignKeyOnAction() {
			return getRuleContexts(ForeignKeyOnActionContext.class);
		}
		public ForeignKeyOnActionContext foreignKeyOnAction(int i) {
			return getRuleContext(ForeignKeyOnActionContext.class,i);
		}
		public ColumnForeignKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnForeignKeyConstraint; }
	}

	public final ColumnForeignKeyConstraintContext columnForeignKeyConstraint() throws RecognitionException {
		ColumnForeignKeyConstraintContext _localctx = new ColumnForeignKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_columnForeignKeyConstraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOREIGN) {
				{
				setState(840);
				match(FOREIGN);
				setState(841);
				match(KEY);
				}
			}

			setState(844);
			match(REFERENCES);
			setState(845);
			tableName();
			setState(846);
			match(LP_);
			setState(847);
			columnName();
			setState(848);
			match(RP_);
			setState(852);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(849);
					foreignKeyOnAction();
					}
					} 
				}
				setState(854);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class ForeignKeyOnActionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public ForeignKeyOnContext foreignKeyOn() {
			return getRuleContext(ForeignKeyOnContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(SQLServerStatementParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SQLServerStatementParser.UPDATE, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public ForeignKeyOnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOnAction; }
	}

	public final ForeignKeyOnActionContext foreignKeyOnAction() throws RecognitionException {
		ForeignKeyOnActionContext _localctx = new ForeignKeyOnActionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_foreignKeyOnAction);
		int _la;
		try {
			setState(861);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				match(ON);
				setState(856);
				_la = _input.LA(1);
				if ( !(_la==DELETE || _la==UPDATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(857);
				foreignKeyOn();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				match(NOT);
				setState(859);
				match(FOR);
				setState(860);
				match(REPLICATION);
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

	public static class ForeignKeyOnContext extends ParserRuleContext {
		public TerminalNode NO() { return getToken(SQLServerStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(SQLServerStatementParser.ACTION, 0); }
		public TerminalNode CASCADE() { return getToken(SQLServerStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public ForeignKeyOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOn; }
	}

	public final ForeignKeyOnContext foreignKeyOn() throws RecognitionException {
		ForeignKeyOnContext _localctx = new ForeignKeyOnContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_foreignKeyOn);
		int _la;
		try {
			setState(868);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				match(NO);
				setState(864);
				match(ACTION);
				}
				break;
			case CASCADE:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				match(CASCADE);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(866);
				match(SET);
				setState(867);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==DEFAULT) ) {
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

	public static class MemoryTablePrimaryKeyConstraintOptionContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public WithBucketContext withBucket() {
			return getRuleContext(WithBucketContext.class,0);
		}
		public MemoryTablePrimaryKeyConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryTablePrimaryKeyConstraintOption; }
	}

	public final MemoryTablePrimaryKeyConstraintOptionContext memoryTablePrimaryKeyConstraintOption() throws RecognitionException {
		MemoryTablePrimaryKeyConstraintOptionContext _localctx = new MemoryTablePrimaryKeyConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_memoryTablePrimaryKeyConstraintOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(CLUSTERED);
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(871);
				withBucket();
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

	public static class HashWithBucketContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(SQLServerStatementParser.HASH, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public WithBucketContext withBucket() {
			return getRuleContext(WithBucketContext.class,0);
		}
		public HashWithBucketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashWithBucket; }
	}

	public final HashWithBucketContext hashWithBucket() throws RecognitionException {
		HashWithBucketContext _localctx = new HashWithBucketContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_hashWithBucket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(HASH);
			setState(875);
			columnNames();
			setState(876);
			withBucket();
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

	public static class WithBucketContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode BUCKET_COUNT() { return getToken(SQLServerStatementParser.BUCKET_COUNT, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public WithBucketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withBucket; }
	}

	public final WithBucketContext withBucket() throws RecognitionException {
		WithBucketContext _localctx = new WithBucketContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_withBucket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(WITH);
			setState(879);
			match(LP_);
			setState(880);
			match(BUCKET_COUNT);
			setState(881);
			match(EQ_);
			setState(882);
			match(NUMBER_);
			setState(883);
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

	public static class PrimaryKeyWithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode FILLFACTOR() { return getToken(SQLServerStatementParser.FILLFACTOR, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public PrimaryKeyWithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyWithClause; }
	}

	public final PrimaryKeyWithClauseContext primaryKeyWithClause() throws RecognitionException {
		PrimaryKeyWithClauseContext _localctx = new PrimaryKeyWithClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primaryKeyWithClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			match(WITH);
			setState(900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILLFACTOR:
				{
				setState(886);
				match(FILLFACTOR);
				setState(887);
				match(EQ_);
				setState(888);
				match(NUMBER_);
				}
				break;
			case LP_:
				{
				setState(889);
				match(LP_);
				setState(890);
				indexOption();
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(891);
					match(COMMA_);
					setState(892);
					indexOption();
					}
					}
					setState(897);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(898);
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

	public static class PrimaryKeyOnClauseContext extends ParserRuleContext {
		public OnSchemaColumnContext onSchemaColumn() {
			return getRuleContext(OnSchemaColumnContext.class,0);
		}
		public OnFileGroupContext onFileGroup() {
			return getRuleContext(OnFileGroupContext.class,0);
		}
		public OnStringContext onString() {
			return getRuleContext(OnStringContext.class,0);
		}
		public PrimaryKeyOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyOnClause; }
	}

	public final PrimaryKeyOnClauseContext primaryKeyOnClause() throws RecognitionException {
		PrimaryKeyOnClauseContext _localctx = new PrimaryKeyOnClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_primaryKeyOnClause);
		try {
			setState(905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(902);
				onSchemaColumn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(903);
				onFileGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(904);
				onString();
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

	public static class OnSchemaColumnContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public OnSchemaColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onSchemaColumn; }
	}

	public final OnSchemaColumnContext onSchemaColumn() throws RecognitionException {
		OnSchemaColumnContext _localctx = new OnSchemaColumnContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_onSchemaColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			match(ON);
			setState(908);
			schemaName();
			setState(909);
			match(LP_);
			setState(910);
			columnName();
			setState(911);
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

	public static class OnFileGroupContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public OnFileGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onFileGroup; }
	}

	public final OnFileGroupContext onFileGroup() throws RecognitionException {
		OnFileGroupContext _localctx = new OnFileGroupContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_onFileGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(ON);
			setState(914);
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

	public static class OnStringContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public OnStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onString; }
	}

	public final OnStringContext onString() throws RecognitionException {
		OnStringContext _localctx = new OnStringContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_onString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(ON);
			setState(917);
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

	public static class CheckConstraintContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(SQLServerStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public CheckConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkConstraint; }
	}

	public final CheckConstraintContext checkConstraint() throws RecognitionException {
		CheckConstraintContext _localctx = new CheckConstraintContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_checkConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(CHECK);
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(920);
				match(NOT);
				setState(921);
				match(FOR);
				setState(922);
				match(REPLICATION);
				}
			}

			setState(925);
			match(LP_);
			setState(926);
			expr(0);
			setState(927);
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

	public static class ColumnIndexContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public IndexOnClauseContext indexOnClause() {
			return getRuleContext(IndexOnClauseContext.class,0);
		}
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ColumnIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnIndex; }
	}

	public final ColumnIndexContext columnIndex() throws RecognitionException {
		ColumnIndexContext _localctx = new ColumnIndexContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_columnIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			match(INDEX);
			setState(930);
			indexName();
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(931);
				_la = _input.LA(1);
				if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(934);
				match(WITH);
				setState(935);
				match(LP_);
				setState(936);
				indexOption();
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(937);
					match(COMMA_);
					setState(938);
					indexOption();
					}
					}
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(944);
				match(RP_);
				}
			}

			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(948);
				indexOnClause();
				}
			}

			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILESTREAM_ON) {
				{
				setState(951);
				match(FILESTREAM_ON);
				setState(955);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(952);
					ignoredIdentifier_();
					}
					break;
				case 2:
					{
					setState(953);
					schemaName();
					}
					break;
				case 3:
					{
					setState(954);
					match(STRING_);
					}
					break;
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

	public static class IndexOnClauseContext extends ParserRuleContext {
		public OnSchemaColumnContext onSchemaColumn() {
			return getRuleContext(OnSchemaColumnContext.class,0);
		}
		public OnFileGroupContext onFileGroup() {
			return getRuleContext(OnFileGroupContext.class,0);
		}
		public OnDefaultContext onDefault() {
			return getRuleContext(OnDefaultContext.class,0);
		}
		public IndexOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOnClause; }
	}

	public final IndexOnClauseContext indexOnClause() throws RecognitionException {
		IndexOnClauseContext _localctx = new IndexOnClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_indexOnClause);
		try {
			setState(962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				onSchemaColumn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(960);
				onFileGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(961);
				onDefault();
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

	public static class OnDefaultContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public OnDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onDefault; }
	}

	public final OnDefaultContext onDefault() throws RecognitionException {
		OnDefaultContext _localctx = new OnDefaultContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_onDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(ON);
			setState(965);
			match(DEFAULT);
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

	public static class TableConstraintContext extends ParserRuleContext {
		public TablePrimaryConstraintContext tablePrimaryConstraint() {
			return getRuleContext(TablePrimaryConstraintContext.class,0);
		}
		public TableForeignKeyConstraintContext tableForeignKeyConstraint() {
			return getRuleContext(TableForeignKeyConstraintContext.class,0);
		}
		public CheckConstraintContext checkConstraint() {
			return getRuleContext(CheckConstraintContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tableConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(967);
				match(CONSTRAINT);
				setState(968);
				ignoredIdentifier_();
				}
			}

			setState(974);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
			case UNIQUE:
				{
				setState(971);
				tablePrimaryConstraint();
				}
				break;
			case FOREIGN:
			case LP_:
				{
				setState(972);
				tableForeignKeyConstraint();
				}
				break;
			case CHECK:
				{
				setState(973);
				checkConstraint();
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

	public static class TablePrimaryConstraintContext extends ParserRuleContext {
		public PrimaryKeyUniqueContext primaryKeyUnique() {
			return getRuleContext(PrimaryKeyUniqueContext.class,0);
		}
		public DiskTablePrimaryConstraintOptionContext diskTablePrimaryConstraintOption() {
			return getRuleContext(DiskTablePrimaryConstraintOptionContext.class,0);
		}
		public MemoryTablePrimaryConstraintOptionContext memoryTablePrimaryConstraintOption() {
			return getRuleContext(MemoryTablePrimaryConstraintOptionContext.class,0);
		}
		public TablePrimaryConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePrimaryConstraint; }
	}

	public final TablePrimaryConstraintContext tablePrimaryConstraint() throws RecognitionException {
		TablePrimaryConstraintContext _localctx = new TablePrimaryConstraintContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tablePrimaryConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			primaryKeyUnique();
			setState(979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(977);
				diskTablePrimaryConstraintOption();
				}
				break;
			case 2:
				{
				setState(978);
				memoryTablePrimaryConstraintOption();
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

	public static class PrimaryKeyUniqueContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLServerStatementParser.UNIQUE, 0); }
		public PrimaryKeyUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyUnique; }
	}

	public final PrimaryKeyUniqueContext primaryKeyUnique() throws RecognitionException {
		PrimaryKeyUniqueContext _localctx = new PrimaryKeyUniqueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_primaryKeyUnique);
		try {
			setState(983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(981);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(982);
				match(UNIQUE);
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

	public static class DiskTablePrimaryConstraintOptionContext extends ParserRuleContext {
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public PrimaryKeyWithClauseContext primaryKeyWithClause() {
			return getRuleContext(PrimaryKeyWithClauseContext.class,0);
		}
		public PrimaryKeyOnClauseContext primaryKeyOnClause() {
			return getRuleContext(PrimaryKeyOnClauseContext.class,0);
		}
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public DiskTablePrimaryConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diskTablePrimaryConstraintOption; }
	}

	public final DiskTablePrimaryConstraintOptionContext diskTablePrimaryConstraintOption() throws RecognitionException {
		DiskTablePrimaryConstraintOptionContext _localctx = new DiskTablePrimaryConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_diskTablePrimaryConstraintOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(985);
				_la = _input.LA(1);
				if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(988);
			columnNames();
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(989);
				primaryKeyWithClause();
				}
			}

			setState(993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(992);
				primaryKeyOnClause();
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

	public static class MemoryTablePrimaryConstraintOptionContext extends ParserRuleContext {
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public HashWithBucketContext hashWithBucket() {
			return getRuleContext(HashWithBucketContext.class,0);
		}
		public MemoryTablePrimaryConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryTablePrimaryConstraintOption; }
	}

	public final MemoryTablePrimaryConstraintOptionContext memoryTablePrimaryConstraintOption() throws RecognitionException {
		MemoryTablePrimaryConstraintOptionContext _localctx = new MemoryTablePrimaryConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_memoryTablePrimaryConstraintOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			match(NONCLUSTERED);
			setState(998);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				{
				setState(996);
				columnNames();
				}
				break;
			case HASH:
				{
				setState(997);
				hashWithBucket();
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

	public static class TableForeignKeyConstraintContext extends ParserRuleContext {
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public TerminalNode REFERENCES() { return getToken(SQLServerStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(SQLServerStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public List<ForeignKeyOnActionContext> foreignKeyOnAction() {
			return getRuleContexts(ForeignKeyOnActionContext.class);
		}
		public ForeignKeyOnActionContext foreignKeyOnAction(int i) {
			return getRuleContext(ForeignKeyOnActionContext.class,i);
		}
		public TableForeignKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableForeignKeyConstraint; }
	}

	public final TableForeignKeyConstraintContext tableForeignKeyConstraint() throws RecognitionException {
		TableForeignKeyConstraintContext _localctx = new TableForeignKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tableForeignKeyConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOREIGN) {
				{
				setState(1000);
				match(FOREIGN);
				setState(1001);
				match(KEY);
				}
			}

			setState(1004);
			columnNames();
			setState(1005);
			match(REFERENCES);
			setState(1006);
			tableName();
			setState(1007);
			columnNames();
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT || _la==ON) {
				{
				{
				setState(1008);
				foreignKeyOnAction();
				}
				}
				setState(1013);
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

	public static class ComputedColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PERSISTED() { return getToken(SQLServerStatementParser.PERSISTED, 0); }
		public ColumnConstraintContext columnConstraint() {
			return getRuleContext(ColumnConstraintContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public ComputedColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computedColumnDefinition; }
	}

	public final ComputedColumnDefinitionContext computedColumnDefinition() throws RecognitionException {
		ComputedColumnDefinitionContext _localctx = new ComputedColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_computedColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			columnName();
			setState(1015);
			match(AS);
			setState(1016);
			expr(0);
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERSISTED) {
				{
				setState(1017);
				match(PERSISTED);
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1018);
					match(NOT);
					setState(1019);
					match(NULL);
					}
				}

				}
			}

			setState(1025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (KEY - 22)) | (1L << (PRIMARY - 22)) | (1L << (CHECK - 22)) | (1L << (CONSTRAINT - 22)) | (1L << (FOREIGN - 22)) | (1L << (REFERENCES - 22)) | (1L << (UNIQUE - 22)))) != 0)) {
				{
				setState(1024);
				columnConstraint();
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

	public static class ColumnSetDefinitionContext extends ParserRuleContext {
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public TerminalNode COLUMN_SET() { return getToken(SQLServerStatementParser.COLUMN_SET, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode ALL_SPARSE_COLUMNS() { return getToken(SQLServerStatementParser.ALL_SPARSE_COLUMNS, 0); }
		public ColumnSetDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSetDefinition; }
	}

	public final ColumnSetDefinitionContext columnSetDefinition() throws RecognitionException {
		ColumnSetDefinitionContext _localctx = new ColumnSetDefinitionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_columnSetDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			ignoredIdentifier_();
			setState(1028);
			match(IDENTIFIER_);
			setState(1029);
			match(COLUMN_SET);
			setState(1030);
			match(FOR);
			setState(1031);
			match(ALL_SPARSE_COLUMNS);
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

	public static class AlterTableOpContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterTableOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableOp; }
	}

	public final AlterTableOpContext alterTableOp() throws RecognitionException {
		AlterTableOpContext _localctx = new AlterTableOpContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_alterTableOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(ALTER);
			setState(1034);
			match(TABLE);
			setState(1035);
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

	public static class AlterColumnContext extends ParserRuleContext {
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public AlterColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumn; }
	}

	public final AlterColumnContext alterColumn() throws RecognitionException {
		AlterColumnContext _localctx = new AlterColumnContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_alterColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			modifyColumnSpecification();
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
		public AlterColumnOpContext alterColumnOp() {
			return getRuleContext(AlterColumnOpContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(SQLServerStatementParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode SPARSE() { return getToken(SQLServerStatementParser.SPARSE, 0); }
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_modifyColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			alterColumnOp();
			setState(1040);
			dataType();
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(1041);
				match(COLLATE);
				setState(1042);
				collationName();
				}
			}

			setState(1048);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				{
				setState(1045);
				match(NULL);
				}
				break;
			case NOT:
				{
				setState(1046);
				match(NOT);
				setState(1047);
				match(NULL);
				}
				break;
			case EOF:
			case SPARSE:
			case SEMI_:
				break;
			default:
				break;
			}
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPARSE) {
				{
				setState(1050);
				match(SPARSE);
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

	public static class AlterColumnOpContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode COLUMN() { return getToken(SQLServerStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public AlterColumnOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnOp; }
	}

	public final AlterColumnOpContext alterColumnOp() throws RecognitionException {
		AlterColumnOpContext _localctx = new AlterColumnOpContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_alterColumnOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			match(ALTER);
			setState(1054);
			match(COLUMN);
			setState(1055);
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

	public static class AddColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SQLServerStatementParser.ADD, 0); }
		public List<AlterColumnAddOptionContext> alterColumnAddOption() {
			return getRuleContexts(AlterColumnAddOptionContext.class);
		}
		public AlterColumnAddOptionContext alterColumnAddOption(int i) {
			return getRuleContext(AlterColumnAddOptionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode CHECK() { return getToken(SQLServerStatementParser.CHECK, 0); }
		public TerminalNode NOCHECK() { return getToken(SQLServerStatementParser.NOCHECK, 0); }
		public ColumnNameGeneratedClauseContext columnNameGeneratedClause() {
			return getRuleContext(ColumnNameGeneratedClauseContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public PeriodClauseContext periodClause() {
			return getRuleContext(PeriodClauseContext.class,0);
		}
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1057);
				match(WITH);
				setState(1058);
				_la = _input.LA(1);
				if ( !(_la==CHECK || _la==NOCHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1061);
			match(ADD);
			setState(1080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1062);
				alterColumnAddOption();
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1063);
					match(COMMA_);
					setState(1064);
					alterColumnAddOption();
					}
					}
					setState(1069);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1078);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER_:
					{
					setState(1070);
					columnNameGeneratedClause();
					setState(1071);
					match(COMMA_);
					setState(1072);
					periodClause();
					}
					break;
				case PERIOD:
					{
					setState(1074);
					periodClause();
					setState(1075);
					match(COMMA_);
					setState(1076);
					columnNameGeneratedClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class AlterColumnAddOptionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public ComputedColumnDefinitionContext computedColumnDefinition() {
			return getRuleContext(ComputedColumnDefinitionContext.class,0);
		}
		public ColumnSetDefinitionContext columnSetDefinition() {
			return getRuleContext(ColumnSetDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public AlterTableTableIndexContext alterTableTableIndex() {
			return getRuleContext(AlterTableTableIndexContext.class,0);
		}
		public ConstraintForColumnContext constraintForColumn() {
			return getRuleContext(ConstraintForColumnContext.class,0);
		}
		public AlterColumnAddOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAddOption; }
	}

	public final AlterColumnAddOptionContext alterColumnAddOption() throws RecognitionException {
		AlterColumnAddOptionContext _localctx = new AlterColumnAddOptionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_alterColumnAddOption);
		try {
			setState(1088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1082);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1083);
				computedColumnDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1084);
				columnSetDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1085);
				tableConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1086);
				alterTableTableIndex();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1087);
				constraintForColumn();
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

	public static class ConstraintForColumnContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintForColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintForColumn; }
	}

	public final ConstraintForColumnContext constraintForColumn() throws RecognitionException {
		ConstraintForColumnContext _localctx = new ConstraintForColumnContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_constraintForColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1090);
				match(CONSTRAINT);
				setState(1091);
				ignoredIdentifier_();
				}
			}

			setState(1094);
			match(DEFAULT);
			setState(1095);
			simpleExpr(0);
			setState(1096);
			match(FOR);
			setState(1097);
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

	public static class ColumnNameWithSortsWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ColumnNameWithSortContext> columnNameWithSort() {
			return getRuleContexts(ColumnNameWithSortContext.class);
		}
		public ColumnNameWithSortContext columnNameWithSort(int i) {
			return getRuleContext(ColumnNameWithSortContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ColumnNameWithSortsWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameWithSortsWithParen; }
	}

	public final ColumnNameWithSortsWithParenContext columnNameWithSortsWithParen() throws RecognitionException {
		ColumnNameWithSortsWithParenContext _localctx = new ColumnNameWithSortsWithParenContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_columnNameWithSortsWithParen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			match(LP_);
			setState(1100);
			columnNameWithSort();
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1101);
				match(COMMA_);
				setState(1102);
				columnNameWithSort();
				}
				}
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1108);
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

	public static class ColumnNameWithSortContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLServerStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLServerStatementParser.DESC, 0); }
		public ColumnNameWithSortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameWithSort; }
	}

	public final ColumnNameWithSortContext columnNameWithSort() throws RecognitionException {
		ColumnNameWithSortContext _localctx = new ColumnNameWithSortContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_columnNameWithSort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			columnName();
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1111);
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

	public static class ColumnNameGeneratedClauseContext extends ParserRuleContext {
		public List<ColumnNameGeneratedContext> columnNameGenerated() {
			return getRuleContexts(ColumnNameGeneratedContext.class);
		}
		public ColumnNameGeneratedContext columnNameGenerated(int i) {
			return getRuleContext(ColumnNameGeneratedContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode VALUES() { return getToken(SQLServerStatementParser.VALUES, 0); }
		public ColumnNameGeneratedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameGeneratedClause; }
	}

	public final ColumnNameGeneratedClauseContext columnNameGeneratedClause() throws RecognitionException {
		ColumnNameGeneratedClauseContext _localctx = new ColumnNameGeneratedClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_columnNameGeneratedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			columnNameGenerated();
			setState(1115);
			match(DEFAULT);
			setState(1116);
			simpleExpr(0);
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1117);
				match(WITH);
				setState(1118);
				match(VALUES);
				}
			}

			setState(1121);
			match(COMMA_);
			setState(1122);
			columnNameGenerated();
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

	public static class ColumnNameGeneratedContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public TerminalNode GENERATED() { return getToken(SQLServerStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(SQLServerStatementParser.ALWAYS, 0); }
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode HIDDEN_() { return getToken(SQLServerStatementParser.HIDDEN_, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode START() { return getToken(SQLServerStatementParser.START, 0); }
		public TerminalNode END() { return getToken(SQLServerStatementParser.END, 0); }
		public ColumnNameGeneratedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameGenerated; }
	}

	public final ColumnNameGeneratedContext columnNameGenerated() throws RecognitionException {
		ColumnNameGeneratedContext _localctx = new ColumnNameGeneratedContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_columnNameGenerated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			columnName();
			setState(1125);
			dataTypeName_();
			setState(1126);
			match(GENERATED);
			setState(1127);
			match(ALWAYS);
			setState(1128);
			match(AS);
			setState(1129);
			match(ROW);
			setState(1131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START || _la==END) {
				{
				setState(1130);
				_la = _input.LA(1);
				if ( !(_la==START || _la==END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HIDDEN_) {
				{
				setState(1133);
				match(HIDDEN_);
				}
			}

			setState(1138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1136);
				match(NOT);
				setState(1137);
				match(NULL);
				}
			}

			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1140);
				match(CONSTRAINT);
				setState(1141);
				ignoredIdentifier_();
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

	public static class AlterDropContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public AlterTableDropConstraintContext alterTableDropConstraint() {
			return getRuleContext(AlterTableDropConstraintContext.class,0);
		}
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public DropIndexSpecificationContext dropIndexSpecification() {
			return getRuleContext(DropIndexSpecificationContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(SQLServerStatementParser.PERIOD, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SQLServerStatementParser.SYSTEM_TIME, 0); }
		public AlterDropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDrop; }
	}

	public final AlterDropContext alterDrop() throws RecognitionException {
		AlterDropContext _localctx = new AlterDropContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_alterDrop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(DROP);
			setState(1151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
			case IF:
			case IDENTIFIER_:
				{
				setState(1145);
				alterTableDropConstraint();
				}
				break;
			case COLUMN:
				{
				setState(1146);
				dropColumnSpecification();
				}
				break;
			case INDEX:
				{
				setState(1147);
				dropIndexSpecification();
				}
				break;
			case PERIOD:
				{
				setState(1148);
				match(PERIOD);
				setState(1149);
				match(FOR);
				setState(1150);
				match(SYSTEM_TIME);
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

	public static class AlterTableDropConstraintContext extends ParserRuleContext {
		public List<DropConstraintNameContext> dropConstraintName() {
			return getRuleContexts(DropConstraintNameContext.class);
		}
		public DropConstraintNameContext dropConstraintName(int i) {
			return getRuleContext(DropConstraintNameContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public AlterTableDropConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableDropConstraint; }
	}

	public final AlterTableDropConstraintContext alterTableDropConstraint() throws RecognitionException {
		AlterTableDropConstraintContext _localctx = new AlterTableDropConstraintContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_alterTableDropConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1153);
				match(CONSTRAINT);
				}
			}

			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1156);
				match(IF);
				setState(1157);
				match(EXISTS);
				}
			}

			setState(1160);
			dropConstraintName();
			setState(1165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1161);
				match(COMMA_);
				setState(1162);
				dropConstraintName();
				}
				}
				setState(1167);
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

	public static class DropConstraintNameContext extends ParserRuleContext {
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public DropConstraintWithClauseContext dropConstraintWithClause() {
			return getRuleContext(DropConstraintWithClauseContext.class,0);
		}
		public DropConstraintNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintName; }
	}

	public final DropConstraintNameContext dropConstraintName() throws RecognitionException {
		DropConstraintNameContext _localctx = new DropConstraintNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_dropConstraintName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			ignoredIdentifier_();
			setState(1170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1169);
				dropConstraintWithClause();
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

	public static class DropConstraintWithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<DropConstraintOptionContext> dropConstraintOption() {
			return getRuleContexts(DropConstraintOptionContext.class);
		}
		public DropConstraintOptionContext dropConstraintOption(int i) {
			return getRuleContext(DropConstraintOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public DropConstraintWithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintWithClause; }
	}

	public final DropConstraintWithClauseContext dropConstraintWithClause() throws RecognitionException {
		DropConstraintWithClauseContext _localctx = new DropConstraintWithClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_dropConstraintWithClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			match(WITH);
			setState(1173);
			match(LP_);
			setState(1174);
			dropConstraintOption();
			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1175);
				match(COMMA_);
				setState(1176);
				dropConstraintOption();
				}
				}
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1182);
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

	public static class DropConstraintOptionContext extends ParserRuleContext {
		public TerminalNode MAXDOP() { return getToken(SQLServerStatementParser.MAXDOP, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode ONLINE() { return getToken(SQLServerStatementParser.ONLINE, 0); }
		public TerminalNode MOVE() { return getToken(SQLServerStatementParser.MOVE, 0); }
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public DropConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintOption; }
	}

	public final DropConstraintOptionContext dropConstraintOption() throws RecognitionException {
		DropConstraintOptionContext _localctx = new DropConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_dropConstraintOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAXDOP:
				{
				setState(1184);
				match(MAXDOP);
				setState(1185);
				match(EQ_);
				setState(1186);
				match(NUMBER_);
				}
				break;
			case ONLINE:
				{
				setState(1187);
				match(ONLINE);
				setState(1188);
				match(EQ_);
				setState(1189);
				_la = _input.LA(1);
				if ( !(_la==ON || _la==OFF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case MOVE:
				{
				setState(1190);
				match(MOVE);
				setState(1191);
				match(TO);
				setState(1199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1192);
					schemaName();
					setState(1193);
					match(LP_);
					setState(1194);
					columnName();
					setState(1195);
					match(RP_);
					}
					break;
				case 2:
					{
					setState(1197);
					ignoredIdentifier_();
					}
					break;
				case 3:
					{
					setState(1198);
					match(STRING_);
					}
					break;
				}
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

	public static class DropColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(SQLServerStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_dropColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			match(COLUMN);
			setState(1206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1204);
				match(IF);
				setState(1205);
				match(EXISTS);
				}
			}

			setState(1208);
			columnName();
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1209);
				match(COMMA_);
				setState(1210);
				columnName();
				}
				}
				setState(1215);
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

	public static class DropIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public DropIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndexSpecification; }
	}

	public final DropIndexSpecificationContext dropIndexSpecification() throws RecognitionException {
		DropIndexSpecificationContext _localctx = new DropIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_dropIndexSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			match(INDEX);
			setState(1219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1217);
				match(IF);
				setState(1218);
				match(EXISTS);
				}
			}

			setState(1221);
			indexName();
			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1222);
				match(COMMA_);
				setState(1223);
				indexName();
				}
				}
				setState(1228);
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

	public static class AlterCheckConstraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public TerminalNode CHECK() { return getToken(SQLServerStatementParser.CHECK, 0); }
		public TerminalNode NOCHECK() { return getToken(SQLServerStatementParser.NOCHECK, 0); }
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public List<IgnoredIdentifier_Context> ignoredIdentifier_() {
			return getRuleContexts(IgnoredIdentifier_Context.class);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_(int i) {
			return getRuleContext(IgnoredIdentifier_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public AlterCheckConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterCheckConstraint; }
	}

	public final AlterCheckConstraintContext alterCheckConstraint() throws RecognitionException {
		AlterCheckConstraintContext _localctx = new AlterCheckConstraintContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_alterCheckConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1229);
				match(WITH);
				}
			}

			setState(1232);
			_la = _input.LA(1);
			if ( !(_la==CHECK || _la==NOCHECK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1233);
			match(CONSTRAINT);
			setState(1243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(1234);
				match(ALL);
				}
				break;
			case IDENTIFIER_:
				{
				{
				setState(1235);
				ignoredIdentifier_();
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1236);
					match(COMMA_);
					setState(1237);
					ignoredIdentifier_();
					}
					}
					setState(1242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class AlterTriggerContext extends ParserRuleContext {
		public TerminalNode TRIGGER() { return getToken(SQLServerStatementParser.TRIGGER, 0); }
		public TerminalNode ENABLE() { return getToken(SQLServerStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(SQLServerStatementParser.DISABLE, 0); }
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public List<IgnoredIdentifier_Context> ignoredIdentifier_() {
			return getRuleContexts(IgnoredIdentifier_Context.class);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_(int i) {
			return getRuleContext(IgnoredIdentifier_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public AlterTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTrigger; }
	}

	public final AlterTriggerContext alterTrigger() throws RecognitionException {
		AlterTriggerContext _localctx = new AlterTriggerContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_alterTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			_la = _input.LA(1);
			if ( !(_la==DISABLE || _la==ENABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1246);
			match(TRIGGER);
			setState(1256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(1247);
				match(ALL);
				}
				break;
			case IDENTIFIER_:
				{
				{
				setState(1248);
				ignoredIdentifier_();
				setState(1253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1249);
					match(COMMA_);
					setState(1250);
					ignoredIdentifier_();
					}
					}
					setState(1255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class AlterSwitchContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(SQLServerStatementParser.SWITCH, 0); }
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<TerminalNode> PARTITION() { return getTokens(SQLServerStatementParser.PARTITION); }
		public TerminalNode PARTITION(int i) {
			return getToken(SQLServerStatementParser.PARTITION, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public LowPriorityLockWaitContext lowPriorityLockWait() {
			return getRuleContext(LowPriorityLockWaitContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public AlterSwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSwitch; }
	}

	public final AlterSwitchContext alterSwitch() throws RecognitionException {
		AlterSwitchContext _localctx = new AlterSwitchContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_alterSwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			match(SWITCH);
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1259);
				match(PARTITION);
				setState(1260);
				expr(0);
				}
			}

			setState(1263);
			match(TO);
			setState(1264);
			tableName();
			setState(1267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1265);
				match(PARTITION);
				setState(1266);
				expr(0);
				}
			}

			setState(1274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1269);
				match(WITH);
				setState(1270);
				match(LP_);
				setState(1271);
				lowPriorityLockWait();
				setState(1272);
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

	public static class AlterSetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public SetFileStreamClauseContext setFileStreamClause() {
			return getRuleContext(SetFileStreamClauseContext.class,0);
		}
		public SetSystemVersionClauseContext setSystemVersionClause() {
			return getRuleContext(SetSystemVersionClauseContext.class,0);
		}
		public AlterSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSet; }
	}

	public final AlterSetContext alterSet() throws RecognitionException {
		AlterSetContext _localctx = new AlterSetContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_alterSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			match(SET);
			setState(1277);
			match(LP_);
			setState(1280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILESTREAM_ON:
				{
				setState(1278);
				setFileStreamClause();
				}
				break;
			case SYSTEM_VERSIONING:
				{
				setState(1279);
				setSystemVersionClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1282);
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

	public static class SetFileStreamClauseContext extends ParserRuleContext {
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public SetFileStreamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setFileStreamClause; }
	}

	public final SetFileStreamClauseContext setFileStreamClause() throws RecognitionException {
		SetFileStreamClauseContext _localctx = new SetFileStreamClauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_setFileStreamClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			match(FILESTREAM_ON);
			setState(1285);
			match(EQ_);
			setState(1289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1286);
				schemaName();
				}
				break;
			case 2:
				{
				setState(1287);
				ignoredIdentifier_();
				}
				break;
			case 3:
				{
				setState(1288);
				match(STRING_);
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

	public static class SetSystemVersionClauseContext extends ParserRuleContext {
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public AlterSetOnClauseContext alterSetOnClause() {
			return getRuleContext(AlterSetOnClauseContext.class,0);
		}
		public SetSystemVersionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setSystemVersionClause; }
	}

	public final SetSystemVersionClauseContext setSystemVersionClause() throws RecognitionException {
		SetSystemVersionClauseContext _localctx = new SetSystemVersionClauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_setSystemVersionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			match(SYSTEM_VERSIONING);
			setState(1292);
			match(EQ_);
			setState(1295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OFF:
				{
				setState(1293);
				match(OFF);
				}
				break;
			case ON:
				{
				setState(1294);
				alterSetOnClause();
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

	public static class AlterSetOnClauseContext extends ParserRuleContext {
		public List<TerminalNode> ON() { return getTokens(SQLServerStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SQLServerStatementParser.ON, i);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode HISTORY_TABLE() { return getToken(SQLServerStatementParser.HISTORY_TABLE, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode DATA_CONSISTENCY_CHECK() { return getToken(SQLServerStatementParser.DATA_CONSISTENCY_CHECK, 0); }
		public TerminalNode HISTORY_RETENTION_PERIOD() { return getToken(SQLServerStatementParser.HISTORY_RETENTION_PERIOD, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public TerminalNode INFINITE() { return getToken(SQLServerStatementParser.INFINITE, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode DAY() { return getToken(SQLServerStatementParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SQLServerStatementParser.DAYS, 0); }
		public TerminalNode WEEK() { return getToken(SQLServerStatementParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SQLServerStatementParser.WEEKS, 0); }
		public TerminalNode MONTH() { return getToken(SQLServerStatementParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SQLServerStatementParser.MONTHS, 0); }
		public TerminalNode YEAR() { return getToken(SQLServerStatementParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SQLServerStatementParser.YEARS, 0); }
		public AlterSetOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSetOnClause; }
	}

	public final AlterSetOnClauseContext alterSetOnClause() throws RecognitionException {
		AlterSetOnClauseContext _localctx = new AlterSetOnClauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_alterSetOnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			match(ON);
			setState(1325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1298);
				match(LP_);
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HISTORY_TABLE) {
					{
					setState(1299);
					match(HISTORY_TABLE);
					setState(1300);
					match(EQ_);
					setState(1301);
					tableName();
					}
				}

				setState(1310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1305);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA_) {
						{
						setState(1304);
						match(COMMA_);
						}
					}

					setState(1307);
					match(DATA_CONSISTENCY_CHECK);
					setState(1308);
					match(EQ_);
					setState(1309);
					_la = _input.LA(1);
					if ( !(_la==ON || _la==OFF) ) {
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
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HISTORY_RETENTION_PERIOD || _la==COMMA_) {
					{
					setState(1313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA_) {
						{
						setState(1312);
						match(COMMA_);
						}
					}

					setState(1315);
					match(HISTORY_RETENTION_PERIOD);
					setState(1316);
					match(EQ_);
					setState(1320);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INFINITE:
						{
						setState(1317);
						match(INFINITE);
						}
						break;
					case NUMBER_:
						{
						{
						setState(1318);
						match(NUMBER_);
						setState(1319);
						_la = _input.LA(1);
						if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (DAY - 56)) | (1L << (YEAR - 56)) | (1L << (DAYS - 56)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (MONTH - 150)) | (1L << (MONTHS - 150)) | (1L << (WEEK - 150)) | (1L << (WEEKS - 150)) | (1L << (YEARS - 150)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(1324);
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

	public static class AlterTableTableIndexContext extends ParserRuleContext {
		public IndexWithNameContext indexWithName() {
			return getRuleContext(IndexWithNameContext.class,0);
		}
		public IndexNonClusterClauseContext indexNonClusterClause() {
			return getRuleContext(IndexNonClusterClauseContext.class,0);
		}
		public IndexClusterClauseContext indexClusterClause() {
			return getRuleContext(IndexClusterClauseContext.class,0);
		}
		public AlterTableTableIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableTableIndex; }
	}

	public final AlterTableTableIndexContext alterTableTableIndex() throws RecognitionException {
		AlterTableTableIndexContext _localctx = new AlterTableTableIndexContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_alterTableTableIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			indexWithName();
			setState(1330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONCLUSTERED:
				{
				setState(1328);
				indexNonClusterClause();
				}
				break;
			case CLUSTERED:
				{
				setState(1329);
				indexClusterClause();
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

	public static class IndexWithNameContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public IndexWithNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexWithName; }
	}

	public final IndexWithNameContext indexWithName() throws RecognitionException {
		IndexWithNameContext _localctx = new IndexWithNameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_indexWithName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			match(INDEX);
			setState(1333);
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

	public static class IndexNonClusterClauseContext extends ParserRuleContext {
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public HashWithBucketContext hashWithBucket() {
			return getRuleContext(HashWithBucketContext.class,0);
		}
		public ColumnNameWithSortsWithParenContext columnNameWithSortsWithParen() {
			return getRuleContext(ColumnNameWithSortsWithParenContext.class,0);
		}
		public AlterTableIndexOnClauseContext alterTableIndexOnClause() {
			return getRuleContext(AlterTableIndexOnClauseContext.class,0);
		}
		public IndexNonClusterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexNonClusterClause; }
	}

	public final IndexNonClusterClauseContext indexNonClusterClause() throws RecognitionException {
		IndexNonClusterClauseContext _localctx = new IndexNonClusterClauseContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_indexNonClusterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			match(NONCLUSTERED);
			setState(1341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				{
				setState(1336);
				hashWithBucket();
				}
				break;
			case LP_:
				{
				{
				setState(1337);
				columnNameWithSortsWithParen();
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT || _la==ON) {
					{
					setState(1338);
					alterTableIndexOnClause();
					}
				}

				}
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

	public static class AlterTableIndexOnClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public AlterTableIndexOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableIndexOnClause; }
	}

	public final AlterTableIndexOnClauseContext alterTableIndexOnClause() throws RecognitionException {
		AlterTableIndexOnClauseContext _localctx = new AlterTableIndexOnClauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_alterTableIndexOnClause);
		try {
			setState(1346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1343);
				match(ON);
				setState(1344);
				ignoredIdentifier_();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1345);
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

	public static class IndexClusterClauseContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public IndexOnClauseContext indexOnClause() {
			return getRuleContext(IndexOnClauseContext.class,0);
		}
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public IndexClusterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexClusterClause; }
	}

	public final IndexClusterClauseContext indexClusterClause() throws RecognitionException {
		IndexClusterClauseContext _localctx = new IndexClusterClauseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_indexClusterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			match(CLUSTERED);
			setState(1349);
			match(COLUMNSTORE);
			setState(1357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1350);
				match(WITH);
				setState(1351);
				match(COMPRESSION_DELAY);
				setState(1352);
				match(EQ_);
				setState(1353);
				match(NUMBER_);
				setState(1355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUTES) {
					{
					setState(1354);
					match(MINUTES);
					}
				}

				}
			}

			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1359);
				indexOnClause();
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

	public static class AlterTableTableOptionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode LOCK_ESCALATION() { return getToken(SQLServerStatementParser.LOCK_ESCALATION, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode AUTO() { return getToken(SQLServerStatementParser.AUTO, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TerminalNode DISABLE() { return getToken(SQLServerStatementParser.DISABLE, 0); }
		public TerminalNode MEMORY_OPTIMIZED() { return getToken(SQLServerStatementParser.MEMORY_OPTIMIZED, 0); }
		public List<TerminalNode> ON() { return getTokens(SQLServerStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SQLServerStatementParser.ON, i);
		}
		public TerminalNode DURABILITY() { return getToken(SQLServerStatementParser.DURABILITY, 0); }
		public TerminalNode SCHEMA_ONLY() { return getToken(SQLServerStatementParser.SCHEMA_ONLY, 0); }
		public TerminalNode SCHEMA_AND_DATA() { return getToken(SQLServerStatementParser.SCHEMA_AND_DATA, 0); }
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public TerminalNode HISTORY_TABLE() { return getToken(SQLServerStatementParser.HISTORY_TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode DATA_CONSISTENCY_CHECK() { return getToken(SQLServerStatementParser.DATA_CONSISTENCY_CHECK, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public AlterTableTableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableTableOption; }
	}

	public final AlterTableTableOptionContext alterTableTableOption() throws RecognitionException {
		AlterTableTableOptionContext _localctx = new AlterTableTableOptionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_alterTableTableOption);
		int _la;
		try {
			setState(1391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1362);
				match(SET);
				setState(1363);
				match(LP_);
				setState(1364);
				match(LOCK_ESCALATION);
				setState(1365);
				match(EQ_);
				setState(1366);
				_la = _input.LA(1);
				if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (DISABLE - 59)) | (1L << (TABLE - 59)) | (1L << (AUTO - 59)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1367);
				match(RP_);
				}
				break;
			case MEMORY_OPTIMIZED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1368);
				match(MEMORY_OPTIMIZED);
				setState(1369);
				match(EQ_);
				setState(1370);
				match(ON);
				}
				break;
			case DURABILITY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1371);
				match(DURABILITY);
				setState(1372);
				match(EQ_);
				setState(1373);
				_la = _input.LA(1);
				if ( !(_la==SCHEMA_AND_DATA || _la==SCHEMA_ONLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SYSTEM_VERSIONING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1374);
				match(SYSTEM_VERSIONING);
				setState(1375);
				match(EQ_);
				setState(1376);
				match(ON);
				setState(1389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1377);
					match(LP_);
					setState(1378);
					match(HISTORY_TABLE);
					setState(1379);
					match(EQ_);
					setState(1380);
					tableName();
					setState(1385);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA_) {
						{
						setState(1381);
						match(COMMA_);
						setState(1382);
						match(DATA_CONSISTENCY_CHECK);
						setState(1383);
						match(EQ_);
						setState(1384);
						_la = _input.LA(1);
						if ( !(_la==ON || _la==OFF) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(1387);
					match(RP_);
					}
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

	public static class SchemaNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			match(IDENTIFIER_);
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
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			match(IDENTIFIER_);
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
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			match(IDENTIFIER_);
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

	public static class CollationNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_collationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER_ || _la==STRING_) ) {
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

	public static class IndexNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			match(IDENTIFIER_);
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
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			match(IDENTIFIER_);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(SQLServerStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQLServerStatementParser.NUMBER_, i);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			match(LP_);
			setState(1411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER_) {
				{
				setState(1406);
				match(NUMBER_);
				setState(1409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(1407);
					match(COMMA_);
					setState(1408);
					match(NUMBER_);
					}
				}

				}
			}

			setState(1413);
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

	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(SQLServerStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(1415);
				match(PRIMARY);
				}
			}

			setState(1418);
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

	public static class ColumnNamesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ColumnNameWithSortContext> columnNameWithSort() {
			return getRuleContexts(ColumnNameWithSortContext.class);
		}
		public ColumnNameWithSortContext columnNameWithSort(int i) {
			return getRuleContext(ColumnNameWithSortContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			match(LP_);
			setState(1421);
			columnNameWithSort();
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1422);
				match(COMMA_);
				setState(1423);
				columnNameWithSort();
				}
				}
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1429);
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

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			expr(0);
			setState(1436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1432);
				match(COMMA_);
				setState(1433);
				expr(0);
				}
				}
				setState(1438);
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

	public static class ExprListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_exprList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			match(LP_);
			setState(1440);
			exprs();
			setState(1441);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(SQLServerStatementParser.NOT_, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public ExprRecursiveContext exprRecursive() {
			return getRuleContext(ExprRecursiveContext.class,0);
		}
		public TerminalNode AND() { return getToken(SQLServerStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(SQLServerStatementParser.AND_, 0); }
		public TerminalNode XOR() { return getToken(SQLServerStatementParser.XOR, 0); }
		public TerminalNode OR() { return getToken(SQLServerStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(SQLServerStatementParser.OR_, 0); }
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
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1444);
				match(LP_);
				setState(1445);
				expr(0);
				setState(1446);
				match(RP_);
				}
				break;
			case 2:
				{
				setState(1448);
				match(NOT);
				setState(1449);
				expr(6);
				}
				break;
			case 3:
				{
				setState(1450);
				match(NOT_);
				setState(1451);
				expr(5);
				}
				break;
			case 4:
				{
				setState(1452);
				booleanPrimary(0);
				}
				break;
			case 5:
				{
				setState(1453);
				exprRecursive();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1471);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1456);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1457);
						match(AND);
						setState(1458);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1459);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1460);
						match(AND_);
						setState(1461);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1462);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1463);
						match(XOR);
						setState(1464);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1465);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1466);
						match(OR);
						setState(1467);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1468);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1469);
						match(OR_);
						setState(1470);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(1475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
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

	public static class ExprRecursiveContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public ExprRecursiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRecursive; }
	}

	public final ExprRecursiveContext exprRecursive() throws RecognitionException {
		ExprRecursiveContext _localctx = new ExprRecursiveContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_exprRecursive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			matchNone();
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

	public static class BooleanPrimaryContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(SQLServerStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(SQLServerStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLServerStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SQLServerStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(SQLServerStatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
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
		int _startState = 182;
		enterRecursionRule(_localctx, 182, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1479);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(1501);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1499);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1481);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1482);
						match(IS);
						setState(1484);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1483);
							match(NOT);
							}
						}

						setState(1486);
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
						setState(1487);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1488);
						match(SAFE_EQ_);
						setState(1489);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1490);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1491);
						comparisonOperator();
						setState(1492);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1494);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1495);
						comparisonOperator();
						setState(1496);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1497);
						subquery();
						}
						break;
					}
					} 
				}
				setState(1503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
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
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(SQLServerStatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(SQLServerStatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(SQLServerStatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(SQLServerStatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(SQLServerStatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			_la = _input.LA(1);
			if ( !(((((_la - 223)) & ~0x3f) == 0 && ((1L << (_la - 223)) & ((1L << (EQ_ - 223)) | (1L << (NEQ_ - 223)) | (1L << (GT_ - 223)) | (1L << (GTE_ - 223)) | (1L << (LT_ - 223)) | (1L << (LTE_ - 223)))) != 0)) ) {
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
		public BitExprContext bitExpr() {
			return getRuleContext(BitExprContext.class,0);
		}
		public TerminalNode IN() { return getToken(SQLServerStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(SQLServerStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SQLServerStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SOUNDS() { return getToken(SQLServerStatementParser.SOUNDS, 0); }
		public TerminalNode LIKE() { return getToken(SQLServerStatementParser.LIKE, 0); }
		public List<TerminalNode> ESCAPE() { return getTokens(SQLServerStatementParser.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(SQLServerStatementParser.ESCAPE, i);
		}
		public TerminalNode REGEXP() { return getToken(SQLServerStatementParser.REGEXP, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_predicate);
		int _la;
		try {
			int _alt;
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1506);
				bitExpr(0);
				setState(1508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1507);
					match(NOT);
					}
				}

				setState(1510);
				match(IN);
				setState(1511);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1513);
				bitExpr(0);
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1514);
					match(NOT);
					}
				}

				setState(1517);
				match(IN);
				setState(1518);
				match(LP_);
				setState(1519);
				simpleExpr(0);
				setState(1524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1520);
					match(COMMA_);
					setState(1521);
					simpleExpr(0);
					}
					}
					setState(1526);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1527);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1529);
				bitExpr(0);
				setState(1531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1530);
					match(NOT);
					}
				}

				setState(1533);
				match(BETWEEN);
				setState(1534);
				simpleExpr(0);
				setState(1535);
				match(AND);
				setState(1536);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1538);
				bitExpr(0);
				setState(1539);
				match(SOUNDS);
				setState(1540);
				match(LIKE);
				setState(1541);
				simpleExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1543);
				bitExpr(0);
				setState(1545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1544);
					match(NOT);
					}
				}

				setState(1547);
				match(LIKE);
				setState(1548);
				simpleExpr(0);
				setState(1553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1549);
						match(ESCAPE);
						setState(1550);
						simpleExpr(0);
						}
						} 
					}
					setState(1555);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1556);
				bitExpr(0);
				setState(1558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1557);
					match(NOT);
					}
				}

				setState(1560);
				match(REGEXP);
				setState(1561);
				simpleExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1563);
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
		public TerminalNode VERTICAL_BAR_() { return getToken(SQLServerStatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(SQLServerStatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(SQLServerStatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(SQLServerStatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(SQLServerStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(SQLServerStatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(SQLServerStatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(SQLServerStatementParser.SLASH_, 0); }
		public TerminalNode MOD() { return getToken(SQLServerStatementParser.MOD, 0); }
		public TerminalNode MOD_() { return getToken(SQLServerStatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(SQLServerStatementParser.CARET_, 0); }
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
		int _startState = 188;
		enterRecursionRule(_localctx, 188, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1567);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1608);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1569);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1570);
						match(VERTICAL_BAR_);
						setState(1571);
						bitExpr(15);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1572);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1573);
						match(AMPERSAND_);
						setState(1574);
						bitExpr(14);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1575);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1576);
						match(SIGNED_LEFT_SHIFT_);
						setState(1577);
						bitExpr(13);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1578);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1579);
						match(SIGNED_RIGHT_SHIFT_);
						setState(1580);
						bitExpr(12);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1581);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1582);
						match(PLUS_);
						setState(1583);
						bitExpr(11);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1584);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1585);
						match(MINUS_);
						setState(1586);
						bitExpr(10);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1587);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1588);
						match(ASTERISK_);
						setState(1589);
						bitExpr(9);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1590);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1591);
						match(SLASH_);
						setState(1592);
						bitExpr(8);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1593);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1594);
						match(MOD);
						setState(1595);
						bitExpr(7);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1596);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1597);
						match(MOD_);
						setState(1598);
						bitExpr(6);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1599);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1600);
						match(CARET_);
						setState(1601);
						bitExpr(5);
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1602);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1603);
						match(PLUS_);
						setState(1604);
						intervalExpr();
						}
						break;
					case 13:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1605);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1606);
						match(MINUS_);
						setState(1607);
						intervalExpr();
						}
						break;
					}
					} 
				}
				setState(1612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
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
		public TerminalNode PLUS_() { return getToken(SQLServerStatementParser.PLUS_, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode MINUS_() { return getToken(SQLServerStatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(SQLServerStatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(SQLServerStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(SQLServerStatementParser.BINARY, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public CaseExpressContext caseExpress() {
			return getRuleContext(CaseExpressContext.class,0);
		}
		public IntervalExprContext intervalExpr() {
			return getRuleContext(IntervalExprContext.class,0);
		}
		public PrivateExprOfDbContext privateExprOfDb() {
			return getRuleContext(PrivateExprOfDbContext.class,0);
		}
		public TerminalNode AND_() { return getToken(SQLServerStatementParser.AND_, 0); }
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
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
		int _startState = 190;
		enterRecursionRule(_localctx, 190, RULE_simpleExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1614);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1615);
				literal();
				}
				break;
			case 3:
				{
				setState(1616);
				columnName();
				}
				break;
			case 4:
				{
				setState(1617);
				variable();
				}
				break;
			case 5:
				{
				setState(1618);
				match(PLUS_);
				setState(1619);
				simpleExpr(12);
				}
				break;
			case 6:
				{
				setState(1620);
				match(MINUS_);
				setState(1621);
				simpleExpr(11);
				}
				break;
			case 7:
				{
				setState(1622);
				match(TILDE_);
				setState(1623);
				simpleExpr(10);
				}
				break;
			case 8:
				{
				setState(1624);
				match(NOT_);
				setState(1625);
				simpleExpr(9);
				}
				break;
			case 9:
				{
				setState(1626);
				match(BINARY);
				setState(1627);
				simpleExpr(8);
				}
				break;
			case 10:
				{
				setState(1628);
				exprList();
				}
				break;
			case 11:
				{
				setState(1629);
				match(ROW);
				setState(1630);
				exprList();
				}
				break;
			case 12:
				{
				setState(1631);
				subquery();
				}
				break;
			case 13:
				{
				setState(1632);
				match(EXISTS);
				setState(1633);
				subquery();
				}
				break;
			case 14:
				{
				setState(1634);
				caseExpress();
				}
				break;
			case 15:
				{
				setState(1635);
				intervalExpr();
				}
				break;
			case 16:
				{
				setState(1636);
				privateExprOfDb();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1644);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1639);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1640);
						match(AND_);
						setState(1641);
						simpleExpr(14);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1642);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1643);
						collateClause();
						}
						break;
					}
					} 
				}
				setState(1648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
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
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode ASTERISK_() { return getToken(SQLServerStatementParser.ASTERISK_, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			match(IDENTIFIER_);
			setState(1650);
			match(LP_);
			setState(1652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1651);
				distinct();
				}
			}

			setState(1656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BINARY:
			case DATE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case ROW:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case CAST:
			case CONVERT:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1654);
				exprs();
				}
				break;
			case ASTERISK_:
				{
				setState(1655);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1658);
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

	public static class DistinctContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SQLServerStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
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

	public static class IntervalExprContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public IntervalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpr; }
	}

	public final IntervalExprContext intervalExpr() throws RecognitionException {
		IntervalExprContext _localctx = new IntervalExprContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_intervalExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			matchNone();
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

	public static class CaseExpressContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public CaseExpressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpress; }
	}

	public final CaseExpressContext caseExpress() throws RecognitionException {
		CaseExpressContext _localctx = new CaseExpressContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_caseExpress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			matchNone();
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

	public static class PrivateExprOfDbContext extends ParserRuleContext {
		public WindowedFunctionContext windowedFunction() {
			return getRuleContext(WindowedFunctionContext.class,0);
		}
		public AtTimeZoneExprContext atTimeZoneExpr() {
			return getRuleContext(AtTimeZoneExprContext.class,0);
		}
		public CastExprContext castExpr() {
			return getRuleContext(CastExprContext.class,0);
		}
		public ConvertExprContext convertExpr() {
			return getRuleContext(ConvertExprContext.class,0);
		}
		public PrivateExprOfDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateExprOfDb; }
	}

	public final PrivateExprOfDbContext privateExprOfDb() throws RecognitionException {
		PrivateExprOfDbContext _localctx = new PrivateExprOfDbContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_privateExprOfDb);
		try {
			setState(1670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1666);
				windowedFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1667);
				atTimeZoneExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1668);
				castExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1669);
				convertExpr();
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

	public static class VariableContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			matchNone();
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
		public TerminalNode TRUE() { return getToken(SQLServerStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLServerStatementParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode LBE_() { return getToken(SQLServerStatementParser.LBE_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode RBE_() { return getToken(SQLServerStatementParser.RBE_, 0); }
		public TerminalNode HEX_DIGIT_() { return getToken(SQLServerStatementParser.HEX_DIGIT_, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode DATE() { return getToken(SQLServerStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SQLServerStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SQLServerStatementParser.TIMESTAMP, 0); }
		public TerminalNode BIT_NUM_() { return getToken(SQLServerStatementParser.BIT_NUM_, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_literal);
		int _la;
		try {
			setState(1699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1674);
				question();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1675);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1676);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1677);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1678);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1679);
				match(LBE_);
				setState(1680);
				match(IDENTIFIER_);
				setState(1681);
				match(STRING_);
				setState(1682);
				match(RBE_);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1683);
				match(HEX_DIGIT_);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1684);
				string();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1685);
				match(IDENTIFIER_);
				setState(1686);
				match(STRING_);
				setState(1688);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1687);
					collateClause();
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1690);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATE) | (1L << TIME) | (1L << TIMESTAMP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1691);
				match(STRING_);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER_) {
					{
					setState(1692);
					match(IDENTIFIER_);
					}
				}

				setState(1695);
				match(BIT_NUM_);
				setState(1697);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1696);
					collateClause();
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
		public TerminalNode QUESTION_() { return getToken(SQLServerStatementParser.QUESTION_, 0); }
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
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
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
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
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1705);
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

	public static class SubqueryContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			matchNone();
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

	public static class CollateClauseContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public CollateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause; }
	}

	public final CollateClauseContext collateClause() throws RecognitionException {
		CollateClauseContext _localctx = new CollateClauseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_collateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			matchNone();
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
		public TerminalNode ORDER() { return getToken(SQLServerStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLServerStatementParser.BY, 0); }
		public List<OrderByExprContext> orderByExpr() {
			return getRuleContexts(OrderByExprContext.class);
		}
		public OrderByExprContext orderByExpr(int i) {
			return getRuleContext(OrderByExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
			match(ORDER);
			setState(1712);
			match(BY);
			setState(1713);
			orderByExpr();
			setState(1718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1714);
				match(COMMA_);
				setState(1715);
				orderByExpr();
				}
				}
				setState(1720);
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
		public TerminalNode ASC() { return getToken(SQLServerStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLServerStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1721);
				columnName();
				}
				break;
			case 2:
				{
				setState(1722);
				number();
				}
				break;
			case 3:
				{
				setState(1723);
				expr(0);
				}
				break;
			}
			setState(1727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1726);
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

	public static class AsteriskContext extends ParserRuleContext {
		public TerminalNode ASTERISK_() { return getToken(SQLServerStatementParser.ASTERISK_, 0); }
		public AsteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asterisk; }
	}

	public final AsteriskContext asterisk() throws RecognitionException {
		AsteriskContext _localctx = new AsteriskContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_asterisk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729);
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode MAX() { return getToken(SQLServerStatementParser.MAX, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode CONTENT() { return getToken(SQLServerStatementParser.CONTENT, 0); }
		public TerminalNode DOCUMENT() { return getToken(SQLServerStatementParser.DOCUMENT, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			dataTypeName_();
			setState(1743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1732);
				dataTypeLength();
				}
				break;
			case 2:
				{
				setState(1733);
				match(LP_);
				setState(1734);
				match(MAX);
				setState(1735);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(1736);
				match(LP_);
				setState(1738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTENT || _la==DOCUMENT) {
					{
					setState(1737);
					_la = _input.LA(1);
					if ( !(_la==CONTENT || _la==DOCUMENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1740);
				ignoredIdentifier_();
				setState(1741);
				match(RP_);
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

	public static class DataTypeName_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public DataTypeName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName_; }
	}

	public final DataTypeName_Context dataTypeName_() throws RecognitionException {
		DataTypeName_Context _localctx = new DataTypeName_Context(_ctx, getState());
		enterRule(_localctx, 224, RULE_dataTypeName_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
			match(IDENTIFIER_);
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

	public static class AtTimeZoneExprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(SQLServerStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SQLServerStatementParser.ZONE, 0); }
		public AtTimeZoneExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atTimeZoneExpr; }
	}

	public final AtTimeZoneExprContext atTimeZoneExpr() throws RecognitionException {
		AtTimeZoneExprContext _localctx = new AtTimeZoneExprContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_atTimeZoneExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
			match(IDENTIFIER_);
			setState(1751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1748);
				match(WITH);
				setState(1749);
				match(TIME);
				setState(1750);
				match(ZONE);
				}
			}

			setState(1753);
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

	public static class CastExprContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(SQLServerStatementParser.CAST, 0); }
		public List<TerminalNode> LP_() { return getTokens(SQLServerStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(SQLServerStatementParser.LP_, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> RP_() { return getTokens(SQLServerStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(SQLServerStatementParser.RP_, i);
		}
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public CastExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpr; }
	}

	public final CastExprContext castExpr() throws RecognitionException {
		CastExprContext _localctx = new CastExprContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_castExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			match(CAST);
			setState(1756);
			match(LP_);
			setState(1757);
			expr(0);
			setState(1758);
			match(AS);
			setState(1759);
			dataType();
			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1760);
				match(LP_);
				setState(1761);
				match(NUMBER_);
				setState(1762);
				match(RP_);
				}
			}

			setState(1765);
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

	public static class ConvertExprContext extends ParserRuleContext {
		public TerminalNode CONVERT() { return getToken(SQLServerStatementParser.CONVERT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(SQLServerStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQLServerStatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public ConvertExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convertExpr; }
	}

	public final ConvertExprContext convertExpr() throws RecognitionException {
		ConvertExprContext _localctx = new ConvertExprContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_convertExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1767);
			match(CONVERT);
			{
			setState(1768);
			dataType();
			setState(1772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1769);
				match(LP_);
				setState(1770);
				match(NUMBER_);
				setState(1771);
				match(RP_);
				}
			}

			setState(1774);
			match(COMMA_);
			setState(1775);
			expr(0);
			setState(1778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1776);
				match(COMMA_);
				setState(1777);
				match(NUMBER_);
				}
				break;
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

	public static class WindowedFunctionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public OverClauseContext overClause() {
			return getRuleContext(OverClauseContext.class,0);
		}
		public WindowedFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowedFunction; }
	}

	public final WindowedFunctionContext windowedFunction() throws RecognitionException {
		WindowedFunctionContext _localctx = new WindowedFunctionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_windowedFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1780);
			functionCall();
			setState(1781);
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
		public TerminalNode OVER() { return getToken(SQLServerStatementParser.OVER, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public PartitionByClauseContext partitionByClause() {
			return getRuleContext(PartitionByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public RowRangeClauseContext rowRangeClause() {
			return getRuleContext(RowRangeClauseContext.class,0);
		}
		public OverClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overClause; }
	}

	public final OverClauseContext overClause() throws RecognitionException {
		OverClauseContext _localctx = new OverClauseContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_overClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			match(OVER);
			setState(1784);
			match(LP_);
			setState(1786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1785);
				partitionByClause();
				}
			}

			setState(1789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1788);
				orderByClause();
				}
			}

			setState(1792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROWS || _la==RANGE) {
				{
				setState(1791);
				rowRangeClause();
				}
			}

			setState(1794);
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

	public static class PartitionByClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SQLServerStatementParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(SQLServerStatementParser.BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public PartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionByClause; }
	}

	public final PartitionByClauseContext partitionByClause() throws RecognitionException {
		PartitionByClauseContext _localctx = new PartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_partitionByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			match(PARTITION);
			setState(1797);
			match(BY);
			setState(1798);
			expr(0);
			setState(1803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1799);
				match(COMMA_);
				setState(1800);
				expr(0);
				}
				}
				setState(1805);
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

	public static class OrderByExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(SQLServerStatementParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLServerStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLServerStatementParser.DESC, 0); }
		public OrderByExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByExpr; }
	}

	public final OrderByExprContext orderByExpr() throws RecognitionException {
		OrderByExprContext _localctx = new OrderByExprContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_orderByExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			expr(0);
			setState(1809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(1807);
				match(COLLATE);
				setState(1808);
				collationName();
				}
			}

			setState(1812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1811);
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

	public static class RowRangeClauseContext extends ParserRuleContext {
		public WindowFrameExtentContext windowFrameExtent() {
			return getRuleContext(WindowFrameExtentContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SQLServerStatementParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(SQLServerStatementParser.RANGE, 0); }
		public RowRangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowRangeClause; }
	}

	public final RowRangeClauseContext rowRangeClause() throws RecognitionException {
		RowRangeClauseContext _localctx = new RowRangeClauseContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_rowRangeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			_la = _input.LA(1);
			if ( !(_la==ROWS || _la==RANGE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1815);
			windowFrameExtent();
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

	public static class WindowFrameExtentContext extends ParserRuleContext {
		public WindowFramePrecedingContext windowFramePreceding() {
			return getRuleContext(WindowFramePrecedingContext.class,0);
		}
		public WindowFrameBetweenContext windowFrameBetween() {
			return getRuleContext(WindowFrameBetweenContext.class,0);
		}
		public WindowFrameExtentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameExtent; }
	}

	public final WindowFrameExtentContext windowFrameExtent() throws RecognitionException {
		WindowFrameExtentContext _localctx = new WindowFrameExtentContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_windowFrameExtent);
		try {
			setState(1819);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURRENT:
			case UNBOUNDED:
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1817);
				windowFramePreceding();
				}
				break;
			case BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1818);
				windowFrameBetween();
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

	public static class WindowFrameBetweenContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(SQLServerStatementParser.BETWEEN, 0); }
		public List<WindowFrameBoundContext> windowFrameBound() {
			return getRuleContexts(WindowFrameBoundContext.class);
		}
		public WindowFrameBoundContext windowFrameBound(int i) {
			return getRuleContext(WindowFrameBoundContext.class,i);
		}
		public TerminalNode AND() { return getToken(SQLServerStatementParser.AND, 0); }
		public WindowFrameBetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameBetween; }
	}

	public final WindowFrameBetweenContext windowFrameBetween() throws RecognitionException {
		WindowFrameBetweenContext _localctx = new WindowFrameBetweenContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_windowFrameBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1821);
			match(BETWEEN);
			setState(1822);
			windowFrameBound();
			setState(1823);
			match(AND);
			setState(1824);
			windowFrameBound();
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

	public static class WindowFrameBoundContext extends ParserRuleContext {
		public WindowFramePrecedingContext windowFramePreceding() {
			return getRuleContext(WindowFramePrecedingContext.class,0);
		}
		public WindowFrameFollowingContext windowFrameFollowing() {
			return getRuleContext(WindowFrameFollowingContext.class,0);
		}
		public WindowFrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameBound; }
	}

	public final WindowFrameBoundContext windowFrameBound() throws RecognitionException {
		WindowFrameBoundContext _localctx = new WindowFrameBoundContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_windowFrameBound);
		try {
			setState(1828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1826);
				windowFramePreceding();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1827);
				windowFrameFollowing();
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

	public static class WindowFramePrecedingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(SQLServerStatementParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SQLServerStatementParser.PRECEDING, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode CURRENT() { return getToken(SQLServerStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public WindowFramePrecedingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFramePreceding; }
	}

	public final WindowFramePrecedingContext windowFramePreceding() throws RecognitionException {
		WindowFramePrecedingContext _localctx = new WindowFramePrecedingContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_windowFramePreceding);
		try {
			setState(1836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1830);
				match(UNBOUNDED);
				setState(1831);
				match(PRECEDING);
				}
				break;
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1832);
				match(NUMBER_);
				setState(1833);
				match(PRECEDING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1834);
				match(CURRENT);
				setState(1835);
				match(ROW);
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

	public static class WindowFrameFollowingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(SQLServerStatementParser.UNBOUNDED, 0); }
		public TerminalNode FOLLOWING() { return getToken(SQLServerStatementParser.FOLLOWING, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode CURRENT() { return getToken(SQLServerStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public WindowFrameFollowingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameFollowing; }
	}

	public final WindowFrameFollowingContext windowFrameFollowing() throws RecognitionException {
		WindowFrameFollowingContext _localctx = new WindowFrameFollowingContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_windowFrameFollowing);
		try {
			setState(1844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1838);
				match(UNBOUNDED);
				setState(1839);
				match(FOLLOWING);
				}
				break;
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1840);
				match(NUMBER_);
				setState(1841);
				match(FOLLOWING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1842);
				match(CURRENT);
				setState(1843);
				match(ROW);
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

	public static class IndexOptionContext extends ParserRuleContext {
		public TerminalNode FILLFACTOR() { return getToken(SQLServerStatementParser.FILLFACTOR, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public EqOnOffOptionContext eqOnOffOption() {
			return getRuleContext(EqOnOffOptionContext.class,0);
		}
		public EqTimeContext eqTime() {
			return getRuleContext(EqTimeContext.class,0);
		}
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public TerminalNode MAX_DURATION() { return getToken(SQLServerStatementParser.MAX_DURATION, 0); }
		public TerminalNode MAXDOP() { return getToken(SQLServerStatementParser.MAXDOP, 0); }
		public CompressionOptionContext compressionOption() {
			return getRuleContext(CompressionOptionContext.class,0);
		}
		public OnPartitionClauseContext onPartitionClause() {
			return getRuleContext(OnPartitionClauseContext.class,0);
		}
		public IndexOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOption; }
	}

	public final IndexOptionContext indexOption() throws RecognitionException {
		IndexOptionContext _localctx = new IndexOptionContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_indexOption);
		int _la;
		try {
			setState(1859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1846);
				match(FILLFACTOR);
				setState(1847);
				match(EQ_);
				setState(1848);
				match(NUMBER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1849);
				eqOnOffOption();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1850);
				_la = _input.LA(1);
				if ( !(_la==COMPRESSION_DELAY || _la==MAX_DURATION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1851);
				eqTime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1852);
				match(MAXDOP);
				setState(1853);
				match(EQ_);
				setState(1854);
				match(NUMBER_);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1855);
				compressionOption();
				setState(1857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1856);
					onPartitionClause();
					}
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

	public static class CompressionOptionContext extends ParserRuleContext {
		public TerminalNode DATA_COMPRESSION() { return getToken(SQLServerStatementParser.DATA_COMPRESSION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NONE() { return getToken(SQLServerStatementParser.NONE, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode PAGE() { return getToken(SQLServerStatementParser.PAGE, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode COLUMNSTORE_ARCHIVE() { return getToken(SQLServerStatementParser.COLUMNSTORE_ARCHIVE, 0); }
		public CompressionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compressionOption; }
	}

	public final CompressionOptionContext compressionOption() throws RecognitionException {
		CompressionOptionContext _localctx = new CompressionOptionContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_compressionOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1861);
			match(DATA_COMPRESSION);
			setState(1862);
			match(EQ_);
			setState(1863);
			_la = _input.LA(1);
			if ( !(_la==ROW || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (COLUMNSTORE - 98)) | (1L << (COLUMNSTORE_ARCHIVE - 98)) | (1L << (NONE - 98)))) != 0) || _la==PAGE) ) {
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

	public static class EqTimeContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public EqTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqTime; }
	}

	public final EqTimeContext eqTime() throws RecognitionException {
		EqTimeContext _localctx = new EqTimeContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_eqTime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865);
			match(EQ_);
			setState(1866);
			match(NUMBER_);
			setState(1868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUTES) {
				{
				setState(1867);
				match(MINUTES);
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

	public static class EqOnOffOptionContext extends ParserRuleContext {
		public EqKeyContext eqKey() {
			return getRuleContext(EqKeyContext.class,0);
		}
		public EqOnOffContext eqOnOff() {
			return getRuleContext(EqOnOffContext.class,0);
		}
		public EqOnOffOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOnOffOption; }
	}

	public final EqOnOffOptionContext eqOnOffOption() throws RecognitionException {
		EqOnOffOptionContext _localctx = new EqOnOffOptionContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_eqOnOffOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1870);
			eqKey();
			setState(1871);
			eqOnOff();
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

	public static class EqKeyContext extends ParserRuleContext {
		public TerminalNode PAD_INDEX() { return getToken(SQLServerStatementParser.PAD_INDEX, 0); }
		public TerminalNode SORT_IN_TEMPDB() { return getToken(SQLServerStatementParser.SORT_IN_TEMPDB, 0); }
		public TerminalNode IGNORE_DUP_KEY() { return getToken(SQLServerStatementParser.IGNORE_DUP_KEY, 0); }
		public TerminalNode STATISTICS_NORECOMPUTE() { return getToken(SQLServerStatementParser.STATISTICS_NORECOMPUTE, 0); }
		public TerminalNode STATISTICS_INCREMENTAL() { return getToken(SQLServerStatementParser.STATISTICS_INCREMENTAL, 0); }
		public TerminalNode DROP_EXISTING() { return getToken(SQLServerStatementParser.DROP_EXISTING, 0); }
		public TerminalNode ONLINE() { return getToken(SQLServerStatementParser.ONLINE, 0); }
		public TerminalNode RESUMABLE() { return getToken(SQLServerStatementParser.RESUMABLE, 0); }
		public TerminalNode ALLOW_ROW_LOCKS() { return getToken(SQLServerStatementParser.ALLOW_ROW_LOCKS, 0); }
		public TerminalNode ALLOW_PAGE_LOCKS() { return getToken(SQLServerStatementParser.ALLOW_PAGE_LOCKS, 0); }
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public EqKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqKey; }
	}

	public final EqKeyContext eqKey() throws RecognitionException {
		EqKeyContext _localctx = new EqKeyContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_eqKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1873);
			_la = _input.LA(1);
			if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (ALLOW_PAGE_LOCKS - 88)) | (1L << (ALLOW_ROW_LOCKS - 88)) | (1L << (COMPRESSION_DELAY - 88)) | (1L << (DROP_EXISTING - 88)) | (1L << (IGNORE_DUP_KEY - 88)))) != 0) || ((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & ((1L << (ONLINE - 158)) | (1L << (PAD_INDEX - 158)) | (1L << (RESUMABLE - 158)) | (1L << (SORT_IN_TEMPDB - 158)) | (1L << (STATISTICS_INCREMENTAL - 158)) | (1L << (STATISTICS_NORECOMPUTE - 158)))) != 0)) ) {
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

	public static class EqOnOffContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public EqOnOffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOnOff; }
	}

	public final EqOnOffContext eqOnOff() throws RecognitionException {
		EqOnOffContext _localctx = new EqOnOffContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_eqOnOff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			match(EQ_);
			setState(1876);
			_la = _input.LA(1);
			if ( !(_la==ON || _la==OFF) ) {
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

	public static class OnPartitionClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode PARTITIONS() { return getToken(SQLServerStatementParser.PARTITIONS, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public PartitionExpressionsContext partitionExpressions() {
			return getRuleContext(PartitionExpressionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public OnPartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onPartitionClause; }
	}

	public final OnPartitionClauseContext onPartitionClause() throws RecognitionException {
		OnPartitionClauseContext _localctx = new OnPartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_onPartitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1878);
			match(ON);
			setState(1879);
			match(PARTITIONS);
			setState(1880);
			match(LP_);
			setState(1881);
			partitionExpressions();
			setState(1882);
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

	public static class PartitionExpressionsContext extends ParserRuleContext {
		public List<PartitionExpressionContext> partitionExpression() {
			return getRuleContexts(PartitionExpressionContext.class);
		}
		public PartitionExpressionContext partitionExpression(int i) {
			return getRuleContext(PartitionExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public PartitionExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionExpressions; }
	}

	public final PartitionExpressionsContext partitionExpressions() throws RecognitionException {
		PartitionExpressionsContext _localctx = new PartitionExpressionsContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_partitionExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			partitionExpression();
			setState(1889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1885);
				match(COMMA_);
				setState(1886);
				partitionExpression();
				}
				}
				setState(1891);
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

	public static class PartitionExpressionContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public NumberRangeContext numberRange() {
			return getRuleContext(NumberRangeContext.class,0);
		}
		public PartitionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionExpression; }
	}

	public final PartitionExpressionContext partitionExpression() throws RecognitionException {
		PartitionExpressionContext _localctx = new PartitionExpressionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_partitionExpression);
		try {
			setState(1894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1892);
				match(NUMBER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1893);
				numberRange();
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

	public static class NumberRangeContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER_() { return getTokens(SQLServerStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQLServerStatementParser.NUMBER_, i);
		}
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public NumberRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberRange; }
	}

	public final NumberRangeContext numberRange() throws RecognitionException {
		NumberRangeContext _localctx = new NumberRangeContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_numberRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			match(NUMBER_);
			setState(1897);
			match(TO);
			setState(1898);
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

	public static class LowPriorityLockWaitContext extends ParserRuleContext {
		public TerminalNode WAIT_AT_LOW_PRIORITY() { return getToken(SQLServerStatementParser.WAIT_AT_LOW_PRIORITY, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode MAX_DURATION() { return getToken(SQLServerStatementParser.MAX_DURATION, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode ABORT_AFTER_WAIT() { return getToken(SQLServerStatementParser.ABORT_AFTER_WAIT, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode NONE() { return getToken(SQLServerStatementParser.NONE, 0); }
		public TerminalNode SELF() { return getToken(SQLServerStatementParser.SELF, 0); }
		public TerminalNode BLOCKERS() { return getToken(SQLServerStatementParser.BLOCKERS, 0); }
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public LowPriorityLockWaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowPriorityLockWait; }
	}

	public final LowPriorityLockWaitContext lowPriorityLockWait() throws RecognitionException {
		LowPriorityLockWaitContext _localctx = new LowPriorityLockWaitContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_lowPriorityLockWait);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			match(WAIT_AT_LOW_PRIORITY);
			setState(1901);
			match(LP_);
			setState(1902);
			match(MAX_DURATION);
			setState(1903);
			match(EQ_);
			setState(1904);
			match(NUMBER_);
			setState(1906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUTES) {
				{
				setState(1905);
				match(MINUTES);
				}
			}

			setState(1908);
			match(COMMA_);
			setState(1909);
			match(ABORT_AFTER_WAIT);
			setState(1910);
			match(EQ_);
			setState(1911);
			_la = _input.LA(1);
			if ( !(_la==BLOCKERS || _la==NONE || _la==SELF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1912);
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

	public static class OnLowPriorLockWaitContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public LowPriorityLockWaitContext lowPriorityLockWait() {
			return getRuleContext(LowPriorityLockWaitContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public OnLowPriorLockWaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onLowPriorLockWait; }
	}

	public final OnLowPriorLockWaitContext onLowPriorLockWait() throws RecognitionException {
		OnLowPriorLockWaitContext _localctx = new OnLowPriorLockWaitContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_onLowPriorLockWait);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1914);
			match(ON);
			setState(1919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1915);
				match(LP_);
				setState(1916);
				lowPriorityLockWait();
				setState(1917);
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

	public static class IgnoredIdentifier_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public IgnoredIdentifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier_; }
	}

	public final IgnoredIdentifier_Context ignoredIdentifier_() throws RecognitionException {
		IgnoredIdentifier_Context _localctx = new IgnoredIdentifier_Context(_ctx, getState());
		enterRule(_localctx, 276, RULE_ignoredIdentifier_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			match(IDENTIFIER_);
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
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public IgnoredIdentifiers_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifiers_; }
	}

	public final IgnoredIdentifiers_Context ignoredIdentifiers_() throws RecognitionException {
		IgnoredIdentifiers_Context _localctx = new IgnoredIdentifiers_Context(_ctx, getState());
		enterRule(_localctx, 278, RULE_ignoredIdentifiers_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
			ignoredIdentifier_();
			setState(1928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1924);
				match(COMMA_);
				setState(1925);
				ignoredIdentifier_();
				}
				}
				setState(1930);
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

	public static class MatchNoneContext extends ParserRuleContext {
		public MatchNoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchNone; }
	}

	public final MatchNoneContext matchNone() throws RecognitionException {
		MatchNoneContext _localctx = new MatchNoneContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_matchNone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1931);
			match(T__0);
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
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLServerStatementParser.TRANSACTION, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_setTransaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1933);
			match(SET);
			setState(1934);
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
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode IMPLICIT_TRANSACTIONS() { return getToken(SQLServerStatementParser.IMPLICIT_TRANSACTIONS, 0); }
		public AutoCommitValueContext autoCommitValue() {
			return getRuleContext(AutoCommitValueContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public List<TerminalNode> AT_() { return getTokens(SQLServerStatementParser.AT_); }
		public TerminalNode AT_(int i) {
			return getToken(SQLServerStatementParser.AT_, i);
		}
		public TerminalNode TRANCOUNT() { return getToken(SQLServerStatementParser.TRANCOUNT, 0); }
		public TerminalNode GT_() { return getToken(SQLServerStatementParser.GT_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode COMMIT() { return getToken(SQLServerStatementParser.COMMIT, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public SetAutoCommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAutoCommit; }
	}

	public final SetAutoCommitContext setAutoCommit() throws RecognitionException {
		SetAutoCommitContext _localctx = new SetAutoCommitContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_setAutoCommit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1936);
				match(IF);
				setState(1937);
				match(AT_);
				setState(1938);
				match(AT_);
				setState(1939);
				match(TRANCOUNT);
				setState(1940);
				match(GT_);
				setState(1941);
				match(NUMBER_);
				setState(1942);
				match(COMMIT);
				setState(1943);
				match(TRAN);
				}
			}

			setState(1946);
			match(SET);
			setState(1947);
			match(IMPLICIT_TRANSACTIONS);
			setState(1948);
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
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public AutoCommitValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoCommitValue; }
	}

	public final AutoCommitValueContext autoCommitValue() throws RecognitionException {
		AutoCommitValueContext _localctx = new AutoCommitValueContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_autoCommitValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1950);
			_la = _input.LA(1);
			if ( !(_la==ON || _la==OFF) ) {
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

	public static class BeginTransactionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(SQLServerStatementParser.BEGIN, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLServerStatementParser.TRANSACTION, 0); }
		public BeginTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginTransaction; }
	}

	public final BeginTransactionContext beginTransaction() throws RecognitionException {
		BeginTransactionContext _localctx = new BeginTransactionContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_beginTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1952);
			match(BEGIN);
			setState(1953);
			_la = _input.LA(1);
			if ( !(_la==TRANSACTION || _la==TRAN) ) {
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

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(SQLServerStatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
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
		public TerminalNode ROLLBACK() { return getToken(SQLServerStatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
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
		public TerminalNode SAVE() { return getToken(SQLServerStatementParser.SAVE, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLServerStatementParser.TRANSACTION, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_savepoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			match(SAVE);
			setState(1960);
			_la = _input.LA(1);
			if ( !(_la==TRANSACTION || _la==TRAN) ) {
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

	public static class GrantContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(SQLServerStatementParser.GRANT, 0); }
		public ClassPrivilegesClause_Context classPrivilegesClause_() {
			return getRuleContext(ClassPrivilegesClause_Context.class,0);
		}
		public ClassTypePrivilegesClause_Context classTypePrivilegesClause_() {
			return getRuleContext(ClassTypePrivilegesClause_Context.class,0);
		}
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_grant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			match(GRANT);
			setState(1965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1963);
				classPrivilegesClause_();
				}
				break;
			case 2:
				{
				setState(1964);
				classTypePrivilegesClause_();
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

	public static class RevokeContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(SQLServerStatementParser.REVOKE, 0); }
		public ClassPrivilegesClause_Context classPrivilegesClause_() {
			return getRuleContext(ClassPrivilegesClause_Context.class,0);
		}
		public ClassTypePrivilegesClause_Context classTypePrivilegesClause_() {
			return getRuleContext(ClassTypePrivilegesClause_Context.class,0);
		}
		public TerminalNode GRANT() { return getToken(SQLServerStatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(SQLServerStatementParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_revoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			match(REVOKE);
			setState(1975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANT) {
					{
					setState(1968);
					match(GRANT);
					setState(1969);
					match(OPTION);
					setState(1970);
					match(FOR);
					}
				}

				setState(1973);
				classPrivilegesClause_();
				}
				break;
			case 2:
				{
				setState(1974);
				classTypePrivilegesClause_();
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

	public static class DenyContext extends ParserRuleContext {
		public TerminalNode DENY() { return getToken(SQLServerStatementParser.DENY, 0); }
		public ClassPrivilegesClause_Context classPrivilegesClause_() {
			return getRuleContext(ClassPrivilegesClause_Context.class,0);
		}
		public DenyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deny; }
	}

	public final DenyContext deny() throws RecognitionException {
		DenyContext _localctx = new DenyContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_deny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			match(DENY);
			setState(1978);
			classPrivilegesClause_();
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

	public static class ClassPrivilegesClause_Context extends ParserRuleContext {
		public ClassPrivileges_Context classPrivileges_() {
			return getRuleContext(ClassPrivileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public OnClassClause_Context onClassClause_() {
			return getRuleContext(OnClassClause_Context.class,0);
		}
		public ClassPrivilegesClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classPrivilegesClause_; }
	}

	public final ClassPrivilegesClause_Context classPrivilegesClause_() throws RecognitionException {
		ClassPrivilegesClause_Context _localctx = new ClassPrivilegesClause_Context(_ctx, getState());
		enterRule(_localctx, 302, RULE_classPrivilegesClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
			classPrivileges_();
			setState(1983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1981);
				match(ON);
				setState(1982);
				onClassClause_();
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

	public static class ClassPrivileges_Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public List<PrivilegeType_Context> privilegeType_() {
			return getRuleContexts(PrivilegeType_Context.class);
		}
		public PrivilegeType_Context privilegeType_(int i) {
			return getRuleContext(PrivilegeType_Context.class,i);
		}
		public TerminalNode PRIVILEGES() { return getToken(SQLServerStatementParser.PRIVILEGES, 0); }
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ClassPrivileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classPrivileges_; }
	}

	public final ClassPrivileges_Context classPrivileges_() throws RecognitionException {
		ClassPrivileges_Context _localctx = new ClassPrivileges_Context(_ctx, getState());
		enterRule(_localctx, 304, RULE_classPrivileges_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2003);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(1985);
				match(ALL);
				setState(1987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(1986);
					match(PRIVILEGES);
					}
				}

				}
				break;
			case IDENTIFIER_:
				{
				{
				setState(1989);
				privilegeType_();
				setState(1991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1990);
					columnNames();
					}
				}

				setState(2000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1993);
					match(COMMA_);
					setState(1994);
					privilegeType_();
					setState(1996);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LP_) {
						{
						setState(1995);
						columnNames();
						}
					}

					}
					}
					setState(2002);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class OnClassClause_Context extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public Class_Context class_() {
			return getRuleContext(Class_Context.class,0);
		}
		public OnClassClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClassClause_; }
	}

	public final OnClassClause_Context onClassClause_() throws RecognitionException {
		OnClassClause_Context _localctx = new OnClassClause_Context(_ctx, getState());
		enterRule(_localctx, 306, RULE_onClassClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(2005);
				class_();
				}
				break;
			}
			setState(2008);
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

	public static class ClassTypePrivilegesClause_Context extends ParserRuleContext {
		public ClassTypePrivileges_Context classTypePrivileges_() {
			return getRuleContext(ClassTypePrivileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public OnClassTypeClause_Context onClassTypeClause_() {
			return getRuleContext(OnClassTypeClause_Context.class,0);
		}
		public ClassTypePrivilegesClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTypePrivilegesClause_; }
	}

	public final ClassTypePrivilegesClause_Context classTypePrivilegesClause_() throws RecognitionException {
		ClassTypePrivilegesClause_Context _localctx = new ClassTypePrivilegesClause_Context(_ctx, getState());
		enterRule(_localctx, 308, RULE_classTypePrivilegesClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2010);
			classTypePrivileges_();
			setState(2013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2011);
				match(ON);
				setState(2012);
				onClassTypeClause_();
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

	public static class ClassTypePrivileges_Context extends ParserRuleContext {
		public List<PrivilegeType_Context> privilegeType_() {
			return getRuleContexts(PrivilegeType_Context.class);
		}
		public PrivilegeType_Context privilegeType_(int i) {
			return getRuleContext(PrivilegeType_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ClassTypePrivileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTypePrivileges_; }
	}

	public final ClassTypePrivileges_Context classTypePrivileges_() throws RecognitionException {
		ClassTypePrivileges_Context _localctx = new ClassTypePrivileges_Context(_ctx, getState());
		enterRule(_localctx, 310, RULE_classTypePrivileges_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2015);
			privilegeType_();
			setState(2020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2016);
				match(COMMA_);
				setState(2017);
				privilegeType_();
				}
				}
				setState(2022);
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

	public static class OnClassTypeClause_Context extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ClassType_Context classType_() {
			return getRuleContext(ClassType_Context.class,0);
		}
		public OnClassTypeClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClassTypeClause_; }
	}

	public final OnClassTypeClause_Context onClassTypeClause_() throws RecognitionException {
		OnClassTypeClause_Context _localctx = new OnClassTypeClause_Context(_ctx, getState());
		enterRule(_localctx, 312, RULE_onClassTypeClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (ROLE - 74)) | (1L << (USER - 74)) | (1L << (DATABASE - 74)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (LOGIN - 142)) | (1L << (OBJECT - 142)) | (1L << (SCHEMA - 142)))) != 0)) {
				{
				setState(2023);
				classType_();
				}
			}

			setState(2026);
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

	public static class PrivilegeType_Context extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER_() { return getTokens(SQLServerStatementParser.IDENTIFIER_); }
		public TerminalNode IDENTIFIER_(int i) {
			return getToken(SQLServerStatementParser.IDENTIFIER_, i);
		}
		public PrivilegeType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeType_; }
	}

	public final PrivilegeType_Context privilegeType_() throws RecognitionException {
		PrivilegeType_Context _localctx = new PrivilegeType_Context(_ctx, getState());
		enterRule(_localctx, 314, RULE_privilegeType_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2029); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(2028);
					match(IDENTIFIER_);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2031); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Class_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public List<TerminalNode> COLON_() { return getTokens(SQLServerStatementParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(SQLServerStatementParser.COLON_, i);
		}
		public Class_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_; }
	}

	public final Class_Context class_() throws RecognitionException {
		Class_Context _localctx = new Class_Context(_ctx, getState());
		enterRule(_localctx, 316, RULE_class_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2033);
			match(IDENTIFIER_);
			setState(2034);
			match(COLON_);
			setState(2035);
			match(COLON_);
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

	public static class ClassType_Context extends ParserRuleContext {
		public List<TerminalNode> COLON_() { return getTokens(SQLServerStatementParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(SQLServerStatementParser.COLON_, i);
		}
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode DATABASE() { return getToken(SQLServerStatementParser.DATABASE, 0); }
		public TerminalNode OBJECT() { return getToken(SQLServerStatementParser.OBJECT, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLServerStatementParser.SCHEMA, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public ClassType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_; }
	}

	public final ClassType_Context classType_() throws RecognitionException {
		ClassType_Context _localctx = new ClassType_Context(_ctx, getState());
		enterRule(_localctx, 318, RULE_classType_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2037);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (ROLE - 74)) | (1L << (USER - 74)) | (1L << (DATABASE - 74)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (LOGIN - 142)) | (1L << (OBJECT - 142)) | (1L << (SCHEMA - 142)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2038);
			match(COLON_);
			setState(2039);
			match(COLON_);
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
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2041);
			match(CREATE);
			setState(2042);
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
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_dropUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2044);
			match(DROP);
			setState(2045);
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
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2047);
			match(ALTER);
			setState(2048);
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
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2050);
			match(CREATE);
			setState(2051);
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
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			match(DROP);
			setState(2054);
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

	public static class AlterRoleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public AlterRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRole; }
	}

	public final AlterRoleContext alterRole() throws RecognitionException {
		AlterRoleContext _localctx = new AlterRoleContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_alterRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2056);
			match(ALTER);
			setState(2057);
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

	public static class CreateLoginContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public CreateLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createLogin; }
	}

	public final CreateLoginContext createLogin() throws RecognitionException {
		CreateLoginContext _localctx = new CreateLoginContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_createLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2059);
			match(CREATE);
			setState(2060);
			match(LOGIN);
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

	public static class DropLoginContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public DropLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropLogin; }
	}

	public final DropLoginContext dropLogin() throws RecognitionException {
		DropLoginContext _localctx = new DropLoginContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_dropLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2062);
			match(DROP);
			setState(2063);
			match(LOGIN);
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

	public static class AlterLoginContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public AlterLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterLogin; }
	}

	public final AlterLoginContext alterLogin() throws RecognitionException {
		AlterLoginContext _localctx = new AlterLoginContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_alterLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2065);
			match(ALTER);
			setState(2066);
			match(LOGIN);
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
		case 89:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 91:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 94:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 95:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
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
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 11);
		case 13:
			return precpred(_ctx, 10);
		case 14:
			return precpred(_ctx, 9);
		case 15:
			return precpred(_ctx, 8);
		case 16:
			return precpred(_ctx, 7);
		case 17:
			return precpred(_ctx, 6);
		case 18:
			return precpred(_ctx, 5);
		case 19:
			return precpred(_ctx, 4);
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 13);
		case 23:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00f9\u0817\4\2\t"+
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
		"\t\u00a9\4\u00aa\t\u00aa\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u016e\n\2\3"+
		"\2\5\2\u0171\n\2\3\3\3\3\5\3\u0175\n\3\3\3\5\3\u0178\n\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u0184\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5"+
		"\5\u018d\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u01a0\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u01aa\n\t"+
		"\3\t\3\t\3\t\7\t\u01af\n\t\f\t\16\t\u01b2\13\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\5\13\u01ba\n\13\3\13\3\13\3\13\3\13\7\13\u01c0\n\13\f\13\16\13\u01c3"+
		"\13\13\3\13\3\13\5\13\u01c7\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u01d2\n\13\5\13\u01d4\n\13\3\13\3\13\3\13\5\13\u01d9\n\13"+
		"\5\13\u01db\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u01e2\n\13\5\13\u01e4\n"+
		"\13\3\13\3\13\3\13\3\13\3\13\7\13\u01eb\n\13\f\13\16\13\u01ee\13\13\3"+
		"\13\3\13\5\13\u01f2\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u01f9\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u0207\n\16\3\16\3\16\3\16"+
		"\3\16\5\16\u020d\n\16\3\16\3\16\3\16\5\16\u0212\n\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u021c\n\16\3\16\5\16\u021f\n\16\5\16\u0221"+
		"\n\16\3\16\3\16\5\16\u0225\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u022c\n"+
		"\16\f\16\16\16\u022f\13\16\3\16\3\16\5\16\u0233\n\16\3\16\5\16\u0236\n"+
		"\16\3\16\3\16\3\16\3\16\5\16\u023c\n\16\5\16\u023e\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0249\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0252\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0268\n\17"+
		"\3\17\3\17\5\17\u026c\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0275"+
		"\n\17\f\17\16\17\u0278\13\17\3\17\3\17\5\17\u027c\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0284\n\17\3\17\3\17\3\17\5\17\u0289\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u029c\n\20\3\20\3\20\5\20\u02a0\n\20\5\20\u02a2\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u02ad\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u02b4\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u02bb\n\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\7\23\u02c3\n\23\f\23\16\23\u02c6\13\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u02cf\n\24\3\24\5\24\u02d2\n\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u02db\n\25\f\25\16\25\u02de\13"+
		"\25\3\25\3\25\3\25\7\25\u02e3\n\25\f\25\16\25\u02e6\13\25\5\25\u02e8\n"+
		"\25\3\25\5\25\u02eb\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u02fa\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0304\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u030f\n\26\3\26\5\26\u0312\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7"+
		"\26\u0329\n\26\f\26\16\26\u032c\13\26\3\26\5\26\u032f\n\26\3\27\3\27\5"+
		"\27\u0333\n\27\3\27\3\27\3\27\5\27\u0338\n\27\3\30\3\30\5\30\u033c\n\30"+
		"\3\30\3\30\5\30\u0340\n\30\3\31\5\31\u0343\n\31\3\31\5\31\u0346\n\31\3"+
		"\31\5\31\u0349\n\31\3\32\3\32\5\32\u034d\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\7\32\u0355\n\32\f\32\16\32\u0358\13\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0360\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u0367\n\34\3\35\3"+
		"\35\5\35\u036b\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \7 \u0380\n \f \16 \u0383\13 \3 \3 \5 \u0387"+
		"\n \3!\3!\3!\5!\u038c\n!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%"+
		"\3%\3%\3%\5%\u039e\n%\3%\3%\3%\3%\3&\3&\3&\5&\u03a7\n&\3&\3&\3&\3&\3&"+
		"\7&\u03ae\n&\f&\16&\u03b1\13&\3&\3&\5&\u03b5\n&\3&\5&\u03b8\n&\3&\3&\3"+
		"&\3&\5&\u03be\n&\5&\u03c0\n&\3\'\3\'\3\'\5\'\u03c5\n\'\3(\3(\3(\3)\3)"+
		"\5)\u03cc\n)\3)\3)\3)\5)\u03d1\n)\3*\3*\3*\5*\u03d6\n*\3+\3+\5+\u03da"+
		"\n+\3,\5,\u03dd\n,\3,\3,\5,\u03e1\n,\3,\5,\u03e4\n,\3-\3-\3-\5-\u03e9"+
		"\n-\3.\3.\5.\u03ed\n.\3.\3.\3.\3.\3.\7.\u03f4\n.\f.\16.\u03f7\13.\3/\3"+
		"/\3/\3/\3/\3/\5/\u03ff\n/\5/\u0401\n/\3/\5/\u0404\n/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u0416"+
		"\n\63\3\63\3\63\3\63\5\63\u041b\n\63\3\63\5\63\u041e\n\63\3\64\3\64\3"+
		"\64\3\64\3\65\3\65\5\65\u0426\n\65\3\65\3\65\3\65\3\65\7\65\u042c\n\65"+
		"\f\65\16\65\u042f\13\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0439"+
		"\n\65\5\65\u043b\n\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0443\n\66\3"+
		"\67\3\67\5\67\u0447\n\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\78\u0452"+
		"\n8\f8\168\u0455\138\38\38\39\39\59\u045b\n9\3:\3:\3:\3:\3:\5:\u0462\n"+
		":\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\5;\u046e\n;\3;\5;\u0471\n;\3;\3;\5;\u0475"+
		"\n;\3;\3;\5;\u0479\n;\3<\3<\3<\3<\3<\3<\3<\5<\u0482\n<\3=\5=\u0485\n="+
		"\3=\3=\5=\u0489\n=\3=\3=\3=\7=\u048e\n=\f=\16=\u0491\13=\3>\3>\5>\u0495"+
		"\n>\3?\3?\3?\3?\3?\7?\u049c\n?\f?\16?\u049f\13?\3?\3?\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u04b2\n@\5@\u04b4\n@\3A\3A\3A\5A\u04b9"+
		"\nA\3A\3A\3A\7A\u04be\nA\fA\16A\u04c1\13A\3B\3B\3B\5B\u04c6\nB\3B\3B\3"+
		"B\7B\u04cb\nB\fB\16B\u04ce\13B\3C\5C\u04d1\nC\3C\3C\3C\3C\3C\3C\7C\u04d9"+
		"\nC\fC\16C\u04dc\13C\5C\u04de\nC\3D\3D\3D\3D\3D\3D\7D\u04e6\nD\fD\16D"+
		"\u04e9\13D\5D\u04eb\nD\3E\3E\3E\5E\u04f0\nE\3E\3E\3E\3E\5E\u04f6\nE\3"+
		"E\3E\3E\3E\3E\5E\u04fd\nE\3F\3F\3F\3F\5F\u0503\nF\3F\3F\3G\3G\3G\3G\3"+
		"G\5G\u050c\nG\3H\3H\3H\3H\5H\u0512\nH\3I\3I\3I\3I\3I\5I\u0519\nI\3I\5"+
		"I\u051c\nI\3I\3I\3I\5I\u0521\nI\3I\5I\u0524\nI\3I\3I\3I\3I\3I\5I\u052b"+
		"\nI\5I\u052d\nI\3I\5I\u0530\nI\3J\3J\3J\5J\u0535\nJ\3K\3K\3K\3L\3L\3L"+
		"\3L\5L\u053e\nL\5L\u0540\nL\3M\3M\3M\5M\u0545\nM\3N\3N\3N\3N\3N\3N\3N"+
		"\5N\u054e\nN\5N\u0550\nN\3N\5N\u0553\nN\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u056c\nO\3O\3O\5O\u0570\nO"+
		"\5O\u0572\nO\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3V\3V\5V\u0584"+
		"\nV\5V\u0586\nV\3V\3V\3W\5W\u058b\nW\3W\3W\3X\3X\3X\3X\7X\u0593\nX\fX"+
		"\16X\u0596\13X\3X\3X\3Y\3Y\3Y\7Y\u059d\nY\fY\16Y\u05a0\13Y\3Z\3Z\3Z\3"+
		"Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u05b1\n[\3[\3[\3[\3[\3[\3[\3[\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\7[\u05c2\n[\f[\16[\u05c5\13[\3\\\3\\\3]\3]\3]\3"+
		"]\3]\3]\5]\u05cf\n]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\7]\u05de\n"+
		"]\f]\16]\u05e1\13]\3^\3^\3_\3_\5_\u05e7\n_\3_\3_\3_\3_\3_\5_\u05ee\n_"+
		"\3_\3_\3_\3_\3_\7_\u05f5\n_\f_\16_\u05f8\13_\3_\3_\3_\3_\5_\u05fe\n_\3"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u060c\n_\3_\3_\3_\3_\7_\u0612\n"+
		"_\f_\16_\u0615\13_\3_\3_\5_\u0619\n_\3_\3_\3_\3_\5_\u061f\n_\3`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\7`\u064b\n`\f`\16`\u064e"+
		"\13`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\5a\u0668\na\3a\3a\3a\3a\3a\7a\u066f\na\fa\16a\u0672\13a\3b\3b"+
		"\3b\5b\u0677\nb\3b\3b\5b\u067b\nb\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3f\3f"+
		"\5f\u0689\nf\3g\3g\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u069b"+
		"\nh\3h\3h\3h\5h\u06a0\nh\3h\3h\5h\u06a4\nh\5h\u06a6\nh\3i\3i\3j\3j\3k"+
		"\3k\3l\3l\3m\3m\3n\3n\3n\3n\3n\7n\u06b7\nn\fn\16n\u06ba\13n\3o\3o\3o\5"+
		"o\u06bf\no\3o\5o\u06c2\no\3p\3p\3q\3q\3q\3q\3q\3q\3q\5q\u06cd\nq\3q\3"+
		"q\3q\5q\u06d2\nq\3r\3r\3s\3s\3s\3s\5s\u06da\ns\3s\3s\3t\3t\3t\3t\3t\3"+
		"t\3t\3t\5t\u06e6\nt\3t\3t\3u\3u\3u\3u\3u\5u\u06ef\nu\3u\3u\3u\3u\5u\u06f5"+
		"\nu\3v\3v\3v\3w\3w\3w\5w\u06fd\nw\3w\5w\u0700\nw\3w\5w\u0703\nw\3w\3w"+
		"\3x\3x\3x\3x\3x\7x\u070c\nx\fx\16x\u070f\13x\3y\3y\3y\5y\u0714\ny\3y\5"+
		"y\u0717\ny\3z\3z\3z\3{\3{\5{\u071e\n{\3|\3|\3|\3|\3|\3}\3}\5}\u0727\n"+
		"}\3~\3~\3~\3~\3~\3~\5~\u072f\n~\3\177\3\177\3\177\3\177\3\177\3\177\5"+
		"\177\u0737\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0744\n\u0080\5\u0080\u0746\n"+
		"\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\5\u0082"+
		"\u074f\n\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085"+
		"\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087"+
		"\3\u0087\7\u0087\u0762\n\u0087\f\u0087\16\u0087\u0765\13\u0087\3\u0088"+
		"\3\u0088\5\u0088\u0769\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0775\n\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\5\u008b\u0782\n\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d"+
		"\7\u008d\u0789\n\u008d\f\u008d\16\u008d\u078c\13\u008d\3\u008e\3\u008e"+
		"\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\5\u0090\u079b\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094\3\u0094"+
		"\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\5\u0096\u07b0\n\u0096"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u07b6\n\u0097\3\u0097\3\u0097"+
		"\5\u0097\u07ba\n\u0097\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099"+
		"\5\u0099\u07c2\n\u0099\3\u009a\3\u009a\5\u009a\u07c6\n\u009a\3\u009a\3"+
		"\u009a\5\u009a\u07ca\n\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u07cf\n\u009a"+
		"\7\u009a\u07d1\n\u009a\f\u009a\16\u009a\u07d4\13\u009a\5\u009a\u07d6\n"+
		"\u009a\3\u009b\5\u009b\u07d9\n\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3"+
		"\u009c\5\u009c\u07e0\n\u009c\3\u009d\3\u009d\3\u009d\7\u009d\u07e5\n\u009d"+
		"\f\u009d\16\u009d\u07e8\13\u009d\3\u009e\5\u009e\u07eb\n\u009e\3\u009e"+
		"\3\u009e\3\u009f\6\u009f\u07f0\n\u009f\r\u009f\16\u009f\u07f1\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u07f1"+
		"\6\u00b4\u00b8\u00be\u00c0\u00ab\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\2\36\4\2bb\u009c\u009c"+
		"\5\2$$\u009d\u009d\u00a4\u00a4\4\2GG\u009f\u009f\3\2\u00b6\u00b7\4\2\u008e"+
		"\u008e\u00b1\u00b1\5\2\u008c\u008c\u00a1\u00a1\u00a6\u00a6\4\2OOxx\4\2"+
		"qq\u00aa\u00aa\4\2<<\u00c5\u00c5\4\2\35\35;;\4\2\64\64\u009b\u009b\4\2"+
		"\b\b\r\r\4\2==??\7\2::VVoo\u0098\u0099\u00c8\u00ca\5\2==PP]]\3\2\u00f5"+
		"\u00f6\6\2\21\21\35\35))++\4\2\5\5\7\7\3\2\u00e1\u00e6\4\2\f\f\'(\4\2"+
		"iiss\4\2NN\u00ab\u00ab\4\2hh\u0094\u0094\6\2$$de\u009d\u009d\u00a4\u00a4"+
		"\13\2Z[hhtt\u008a\u008a\u00a0\u00a0\u00a3\u00a3\u00b0\u00b0\u00b9\u00b9"+
		"\u00bb\u00bc\5\2__\u009d\u009d\u00b8\u00b8\4\2RR\u00c1\u00c1\b\2LLUUk"+
		"k\u0090\u0090\u009e\u009e\u00b5\u00b5\2\u08d6\2\u016d\3\2\2\2\4\u0172"+
		"\3\2\2\2\6\u017f\3\2\2\2\b\u0188\3\2\2\2\n\u0192\3\2\2\2\f\u0195\3\2\2"+
		"\2\16\u01a1\3\2\2\2\20\u01a5\3\2\2\2\22\u01b3\3\2\2\2\24\u01b9\3\2\2\2"+
		"\26\u01f8\3\2\2\2\30\u01fa\3\2\2\2\32\u0203\3\2\2\2\34\u0288\3\2\2\2\36"+
		"\u02a1\3\2\2\2 \u02a3\3\2\2\2\"\u02b3\3\2\2\2$\u02b5\3\2\2\2&\u02d1\3"+
		"\2\2\2(\u02d7\3\2\2\2*\u032e\3\2\2\2,\u0332\3\2\2\2.\u033b\3\2\2\2\60"+
		"\u0342\3\2\2\2\62\u034c\3\2\2\2\64\u035f\3\2\2\2\66\u0366\3\2\2\28\u0368"+
		"\3\2\2\2:\u036c\3\2\2\2<\u0370\3\2\2\2>\u0377\3\2\2\2@\u038b\3\2\2\2B"+
		"\u038d\3\2\2\2D\u0393\3\2\2\2F\u0396\3\2\2\2H\u0399\3\2\2\2J\u03a3\3\2"+
		"\2\2L\u03c4\3\2\2\2N\u03c6\3\2\2\2P\u03cb\3\2\2\2R\u03d2\3\2\2\2T\u03d9"+
		"\3\2\2\2V\u03dc\3\2\2\2X\u03e5\3\2\2\2Z\u03ec\3\2\2\2\\\u03f8\3\2\2\2"+
		"^\u0405\3\2\2\2`\u040b\3\2\2\2b\u040f\3\2\2\2d\u0411\3\2\2\2f\u041f\3"+
		"\2\2\2h\u0425\3\2\2\2j\u0442\3\2\2\2l\u0446\3\2\2\2n\u044d\3\2\2\2p\u0458"+
		"\3\2\2\2r\u045c\3\2\2\2t\u0466\3\2\2\2v\u047a\3\2\2\2x\u0484\3\2\2\2z"+
		"\u0492\3\2\2\2|\u0496\3\2\2\2~\u04b3\3\2\2\2\u0080\u04b5\3\2\2\2\u0082"+
		"\u04c2\3\2\2\2\u0084\u04d0\3\2\2\2\u0086\u04df\3\2\2\2\u0088\u04ec\3\2"+
		"\2\2\u008a\u04fe\3\2\2\2\u008c\u0506\3\2\2\2\u008e\u050d\3\2\2\2\u0090"+
		"\u0513\3\2\2\2\u0092\u0531\3\2\2\2\u0094\u0536\3\2\2\2\u0096\u0539\3\2"+
		"\2\2\u0098\u0544\3\2\2\2\u009a\u0546\3\2\2\2\u009c\u0571\3\2\2\2\u009e"+
		"\u0573\3\2\2\2\u00a0\u0575\3\2\2\2\u00a2\u0577\3\2\2\2\u00a4\u0579\3\2"+
		"\2\2\u00a6\u057b\3\2\2\2\u00a8\u057d\3\2\2\2\u00aa\u057f\3\2\2\2\u00ac"+
		"\u058a\3\2\2\2\u00ae\u058e\3\2\2\2\u00b0\u0599\3\2\2\2\u00b2\u05a1\3\2"+
		"\2\2\u00b4\u05b0\3\2\2\2\u00b6\u05c6\3\2\2\2\u00b8\u05c8\3\2\2\2\u00ba"+
		"\u05e2\3\2\2\2\u00bc\u061e\3\2\2\2\u00be\u0620\3\2\2\2\u00c0\u0667\3\2"+
		"\2\2\u00c2\u0673\3\2\2\2\u00c4\u067e\3\2\2\2\u00c6\u0680\3\2\2\2\u00c8"+
		"\u0682\3\2\2\2\u00ca\u0688\3\2\2\2\u00cc\u068a\3\2\2\2\u00ce\u06a5\3\2"+
		"\2\2\u00d0\u06a7\3\2\2\2\u00d2\u06a9\3\2\2\2\u00d4\u06ab\3\2\2\2\u00d6"+
		"\u06ad\3\2\2\2\u00d8\u06af\3\2\2\2\u00da\u06b1\3\2\2\2\u00dc\u06be\3\2"+
		"\2\2\u00de\u06c3\3\2\2\2\u00e0\u06c5\3\2\2\2\u00e2\u06d3\3\2\2\2\u00e4"+
		"\u06d5\3\2\2\2\u00e6\u06dd\3\2\2\2\u00e8\u06e9\3\2\2\2\u00ea\u06f6\3\2"+
		"\2\2\u00ec\u06f9\3\2\2\2\u00ee\u0706\3\2\2\2\u00f0\u0710\3\2\2\2\u00f2"+
		"\u0718\3\2\2\2\u00f4\u071d\3\2\2\2\u00f6\u071f\3\2\2\2\u00f8\u0726\3\2"+
		"\2\2\u00fa\u072e\3\2\2\2\u00fc\u0736\3\2\2\2\u00fe\u0745\3\2\2\2\u0100"+
		"\u0747\3\2\2\2\u0102\u074b\3\2\2\2\u0104\u0750\3\2\2\2\u0106\u0753\3\2"+
		"\2\2\u0108\u0755\3\2\2\2\u010a\u0758\3\2\2\2\u010c\u075e\3\2\2\2\u010e"+
		"\u0768\3\2\2\2\u0110\u076a\3\2\2\2\u0112\u076e\3\2\2\2\u0114\u077c\3\2"+
		"\2\2\u0116\u0783\3\2\2\2\u0118\u0785\3\2\2\2\u011a\u078d\3\2\2\2\u011c"+
		"\u078f\3\2\2\2\u011e\u079a\3\2\2\2\u0120\u07a0\3\2\2\2\u0122\u07a2\3\2"+
		"\2\2\u0124\u07a5\3\2\2\2\u0126\u07a7\3\2\2\2\u0128\u07a9\3\2\2\2\u012a"+
		"\u07ac\3\2\2\2\u012c\u07b1\3\2\2\2\u012e\u07bb\3\2\2\2\u0130\u07be\3\2"+
		"\2\2\u0132\u07d5\3\2\2\2\u0134\u07d8\3\2\2\2\u0136\u07dc\3\2\2\2\u0138"+
		"\u07e1\3\2\2\2\u013a\u07ea\3\2\2\2\u013c\u07ef\3\2\2\2\u013e\u07f3\3\2"+
		"\2\2\u0140\u07f7\3\2\2\2\u0142\u07fb\3\2\2\2\u0144\u07fe\3\2\2\2\u0146"+
		"\u0801\3\2\2\2\u0148\u0804\3\2\2\2\u014a\u0807\3\2\2\2\u014c\u080a\3\2"+
		"\2\2\u014e\u080d\3\2\2\2\u0150\u0810\3\2\2\2\u0152\u0813\3\2\2\2\u0154"+
		"\u016e\5\4\3\2\u0155\u016e\5\6\4\2\u0156\u016e\5\b\5\2\u0157\u016e\5\n"+
		"\6\2\u0158\u016e\5\f\7\2\u0159\u016e\5\20\t\2\u015a\u016e\5\16\b\2\u015b"+
		"\u016e\5\u011c\u008f\2\u015c\u016e\5\u0122\u0092\2\u015d\u016e\5\u011e"+
		"\u0090\2\u015e\u016e\5\u0124\u0093\2\u015f\u016e\5\u0126\u0094\2\u0160"+
		"\u016e\5\u0128\u0095\2\u0161\u016e\5\u012a\u0096\2\u0162\u016e\5\u012c"+
		"\u0097\2\u0163\u016e\5\u012e\u0098\2\u0164\u016e\5\u0142\u00a2\2\u0165"+
		"\u016e\5\u0144\u00a3\2\u0166\u016e\5\u0146\u00a4\2\u0167\u016e\5\u0148"+
		"\u00a5\2\u0168\u016e\5\u014a\u00a6\2\u0169\u016e\5\u014c\u00a7\2\u016a"+
		"\u016e\5\u014e\u00a8\2\u016b\u016e\5\u0150\u00a9\2\u016c\u016e\5\u0152"+
		"\u00aa\2\u016d\u0154\3\2\2\2\u016d\u0155\3\2\2\2\u016d\u0156\3\2\2\2\u016d"+
		"\u0157\3\2\2\2\u016d\u0158\3\2\2\2\u016d\u0159\3\2\2\2\u016d\u015a\3\2"+
		"\2\2\u016d\u015b\3\2\2\2\u016d\u015c\3\2\2\2\u016d\u015d\3\2\2\2\u016d"+
		"\u015e\3\2\2\2\u016d\u015f\3\2\2\2\u016d\u0160\3\2\2\2\u016d\u0161\3\2"+
		"\2\2\u016d\u0162\3\2\2\2\u016d\u0163\3\2\2\2\u016d\u0164\3\2\2\2\u016d"+
		"\u0165\3\2\2\2\u016d\u0166\3\2\2\2\u016d\u0167\3\2\2\2\u016d\u0168\3\2"+
		"\2\2\u016d\u0169\3\2\2\2\u016d\u016a\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016c\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0171\7\u00f4\2\2\u0170\u016f"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171\3\3\2\2\2\u0172\u0174\78\2\2\u0173"+
		"\u0175\7T\2\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2"+
		"\2\2\u0176\u0178\t\2\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017a\7E\2\2\u017a\u017b\5\u00a6T\2\u017b\u017c\7"+
		"G\2\2\u017c\u017d\5\u00a0Q\2\u017d\u017e\5\u00aeX\2\u017e\5\3\2\2\2\u017f"+
		"\u0180\7\60\2\2\u0180\u0183\7E\2\2\u0181\u0184\5\u00a6T\2\u0182\u0184"+
		"\7\5\2\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0186\7G\2\2\u0186\u0187\5\u00a0Q\2\u0187\7\3\2\2\2\u0188\u0189\7>\2"+
		"\2\u0189\u018c\7E\2\2\u018a\u018b\7\u0089\2\2\u018b\u018d\7\20\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\5\u00a6"+
		"T\2\u018f\u0190\7G\2\2\u0190\u0191\5\u00a0Q\2\u0191\t\3\2\2\2\u0192\u0193"+
		"\5\22\n\2\u0193\u0194\5\24\13\2\u0194\13\3\2\2\2\u0195\u019f\5`\61\2\u0196"+
		"\u01a0\5b\62\2\u0197\u01a0\5h\65\2\u0198\u01a0\5v<\2\u0199\u01a0\5\u0084"+
		"C\2\u019a\u01a0\5\u0086D\2\u019b\u01a0\5\u0088E\2\u019c\u01a0\5\u008a"+
		"F\2\u019d\u01a0\5\u009cO\2\u019e\u01a0\7\u00ac\2\2\u019f\u0196\3\2\2\2"+
		"\u019f\u0197\3\2\2\2\u019f\u0198\3\2\2\2\u019f\u0199\3\2\2\2\u019f\u019a"+
		"\3\2\2\2\u019f\u019b\3\2\2\2\u019f\u019c\3\2\2\2\u019f\u019d\3\2\2\2\u019f"+
		"\u019e\3\2\2\2\u01a0\r\3\2\2\2\u01a1\u01a2\7S\2\2\u01a2\u01a3\7P\2\2\u01a3"+
		"\u01a4\5\u00a0Q\2\u01a4\17\3\2\2\2\u01a5\u01a6\7>\2\2\u01a6\u01a9\7P\2"+
		"\2\u01a7\u01a8\7\u0089\2\2\u01a8\u01aa\7\20\2\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01b0\5\u00a0Q\2\u01ac\u01ad"+
		"\7\u00ee\2\2\u01ad\u01af\5\u00a0Q\2\u01ae\u01ac\3\2\2\2\u01af\u01b2\3"+
		"\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\21\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b3\u01b4\78\2\2\u01b4\u01b5\7P\2\2\u01b5\u01b6\5\u00a0"+
		"Q\2\u01b6\23\3\2\2\2\u01b7\u01b8\7\62\2\2\u01b8\u01ba\7{\2\2\u01b9\u01b7"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\7\u00e8\2"+
		"\2\u01bc\u01c1\5\26\f\2\u01bd\u01be\7\u00ee\2\2\u01be\u01c0\5\26\f\2\u01bf"+
		"\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2"+
		"\2\2\u01c2\u01c6\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\7\u00ee\2\2\u01c5"+
		"\u01c7\5\30\r\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3"+
		"\2\2\2\u01c8\u01d3\7\u00e9\2\2\u01c9\u01d1\7G\2\2\u01ca\u01cb\5\u009e"+
		"P\2\u01cb\u01cc\7\u00e8\2\2\u01cc\u01cd\5\u00a2R\2\u01cd\u01ce\7\u00e9"+
		"\2\2\u01ce\u01d2\3\2\2\2\u01cf\u01d2\5\u0116\u008c\2\u01d0\u01d2\7\u00f6"+
		"\2\2\u01d1\u01ca\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2"+
		"\u01d4\3\2\2\2\u01d3\u01c9\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01da\3\2"+
		"\2\2\u01d5\u01d8\7\u00c0\2\2\u01d6\u01d9\5\u0116\u008c\2\u01d7\u01d9\7"+
		"\u00f6\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01db\3\2\2\2"+
		"\u01da\u01d5\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01e3\3\2\2\2\u01dc\u01dd"+
		"\7z\2\2\u01dd\u01e2\5\u009eP\2\u01de\u01df\5\u0116\u008c\2\u01df\u01e0"+
		"\7\u00f6\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01dc\3\2\2\2\u01e1\u01de\3\2\2"+
		"\2\u01e2\u01e4\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01f1"+
		"\3\2\2\2\u01e5\u01e6\7-\2\2\u01e6\u01e7\7\u00e8\2\2\u01e7\u01ec\5\34\17"+
		"\2\u01e8\u01e9\7\u00ee\2\2\u01e9\u01eb\5\34\17\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2"+
		"\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f0\7\u00e9\2\2\u01f0\u01f2\3\2\2\2\u01f1"+
		"\u01e5\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\25\3\2\2\2\u01f3\u01f9\5(\25"+
		"\2\u01f4\u01f9\5\\/\2\u01f5\u01f9\5^\60\2\u01f6\u01f9\5P)\2\u01f7\u01f9"+
		"\5\32\16\2\u01f8\u01f3\3\2\2\2\u01f8\u01f4\3\2\2\2\u01f8\u01f5\3\2\2\2"+
		"\u01f8\u01f6\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9\27\3\2\2\2\u01fa\u01fb"+
		"\7\u00a7\2\2\u01fb\u01fc\7@\2\2\u01fc\u01fd\7\u00be\2\2\u01fd\u01fe\7"+
		"\u00e8\2\2\u01fe\u01ff\5\u00a2R\2\u01ff\u0200\7\u00ee\2\2\u0200\u0201"+
		"\5\u00a2R\2\u0201\u0202\7\u00e9\2\2\u0202\31\3\2\2\2\u0203\u0204\7E\2"+
		"\2\u0204\u0220\5\u00a6T\2\u0205\u0207\t\2\2\2\u0206\u0205\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0221\5\u00aeX\2\u0209\u020a"+
		"\7b\2\2\u020a\u0221\7d\2\2\u020b\u020d\7\u009c\2\2\u020c\u020b\3\2\2\2"+
		"\u020c\u020d\3\2\2\2\u020d\u0211\3\2\2\2\u020e\u020f\7d\2\2\u020f\u0212"+
		"\5\u00aeX\2\u0210\u0212\5:\36\2\u0211\u020e\3\2\2\2\u0211\u0210\3\2\2"+
		"\2\u0212\u0221\3\2\2\2\u0213\u0214\7b\2\2\u0214\u021e\7d\2\2\u0215\u0216"+
		"\7-\2\2\u0216\u0217\7\u00e8\2\2\u0217\u0218\7h\2\2\u0218\u0219\7\u00e1"+
		"\2\2\u0219\u021b\7\u00f7\2\2\u021a\u021c\7\u0097\2\2\u021b\u021a\3\2\2"+
		"\2\u021b\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\7\u00e9\2\2\u021e"+
		"\u0215\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u0206\3\2"+
		"\2\2\u0220\u0209\3\2\2\2\u0220\u020c\3\2\2\2\u0220\u0213\3\2\2\2\u0221"+
		"\u0224\3\2\2\2\u0222\u0223\7,\2\2\u0223\u0225\5\u00b4[\2\u0224\u0222\3"+
		"\2\2\2\u0224\u0225\3\2\2\2\u0225\u0232\3\2\2\2\u0226\u0227\7-\2\2\u0227"+
		"\u0228\7\u00e8\2\2\u0228\u022d\5\u00fe\u0080\2\u0229\u022a\7\u00ee\2\2"+
		"\u022a\u022c\5\u00fe\u0080\2\u022b\u0229\3\2\2\2\u022c\u022f\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u022d\3\2"+
		"\2\2\u0230\u0231\7\u00e9\2\2\u0231\u0233\3\2\2\2\u0232\u0226\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0236\5L\'\2\u0235\u0234\3\2"+
		"\2\2\u0235\u0236\3\2\2\2\u0236\u023d\3\2\2\2\u0237\u023b\7z\2\2\u0238"+
		"\u023c\5\u0116\u008c\2\u0239\u023c\5\u009eP\2\u023a\u023c\7\u00f6\2\2"+
		"\u023b\u0238\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023a\3\2\2\2\u023c\u023e"+
		"\3\2\2\2\u023d\u0237\3\2\2\2\u023d\u023e\3\2\2\2\u023e\33\3\2\2\2\u023f"+
		"\u0240\7m\2\2\u0240\u0241\7\u00e1\2\2\u0241\u0248\t\3\2\2\u0242\u0243"+
		"\7G\2\2\u0243\u0244\7\u00a5\2\2\u0244\u0245\7\u00e8\2\2\u0245\u0246\5"+
		"\u010c\u0087\2\u0246\u0247\7\u00e9\2\2\u0247\u0249\3\2\2\2\u0248\u0242"+
		"\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0289\3\2\2\2\u024a\u024b\7}\2\2\u024b"+
		"\u024c\7\u00e1\2\2\u024c\u0289\5\u0116\u008c\2\u024d\u024e\7|\2\2\u024e"+
		"\u0251\7\u00e1\2\2\u024f\u0252\5\u00a4S\2\u0250\u0252\7l\2\2\u0251\u024f"+
		"\3\2\2\2\u0251\u0250\3\2\2\2\u0252\u0289\3\2\2\2\u0253\u0254\7\177\2\2"+
		"\u0254\u0255\7\u00e1\2\2\u0255\u0289\5\u0116\u008c\2\u0256\u0257\7\u0080"+
		"\2\2\u0257\u0258\7\u00e1\2\2\u0258\u0289\5\u0116\u008c\2\u0259\u025a\7"+
		"~\2\2\u025a\u025b\7\u00e1\2\2\u025b\u0289\5\u0116\u008c\2\u025c\u025d"+
		"\7\u00bf\2\2\u025d\u025e\7\u00e1\2\2\u025e\u026b\7G\2\2\u025f\u0260\7"+
		"\u00e8\2\2\u0260\u0261\7\u0087\2\2\u0261\u0262\7\u00e1\2\2\u0262\u0267"+
		"\5\u00a0Q\2\u0263\u0264\7\u00ee\2\2\u0264\u0265\7n\2\2\u0265\u0266\7\u00e1"+
		"\2\2\u0266\u0268\t\4\2\2\u0267\u0263\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026a\7\u00e9\2\2\u026a\u026c\3\2\2\2\u026b\u025f"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u0289\3\2\2\2\u026d\u026e\7\u00ad\2"+
		"\2\u026e\u0283\7\u00e1\2\2\u026f\u027b\7G\2\2\u0270\u0271\7\u00e8\2\2"+
		"\u0271\u0276\5&\24\2\u0272\u0273\7\u00ee\2\2\u0273\u0275\5&\24\2\u0274"+
		"\u0272\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2"+
		"\2\2\u0277\u0279\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027a\7\u00e9\2\2\u027a"+
		"\u027c\3\2\2\2\u027b\u0270\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u0284\3\2"+
		"\2\2\u027d\u027e\7\u009f\2\2\u027e\u027f\7\u00e8\2\2\u027f\u0280\7\u0096"+
		"\2\2\u0280\u0281\7\u00e1\2\2\u0281\u0282\7\u00a6\2\2\u0282\u0284\7\u00e9"+
		"\2\2\u0283\u026f\3\2\2\2\u0283\u027d\3\2\2\2\u0284\u0289\3\2\2\2\u0285"+
		"\u0289\5\36\20\2\u0286\u0289\5 \21\2\u0287\u0289\5\"\22\2\u0288\u023f"+
		"\3\2\2\2\u0288\u024a\3\2\2\2\u0288\u024d\3\2\2\2\u0288\u0253\3\2\2\2\u0288"+
		"\u0256\3\2\2\2\u0288\u0259\3\2\2\2\u0288\u025c\3\2\2\2\u0288\u026d\3\2"+
		"\2\2\u0288\u0285\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0287\3\2\2\2\u0289"+
		"\35\3\2\2\2\u028a\u028b\7\u0095\2\2\u028b\u028c\7\u00e1\2\2\u028c\u02a2"+
		"\7G\2\2\u028d\u028e\7u\2\2\u028e\u028f\7\u00e1\2\2\u028f\u02a2\t\5\2\2"+
		"\u0290\u0291\7\u00bf\2\2\u0291\u0292\7\u00e1\2\2\u0292\u029f\7G\2\2\u0293"+
		"\u0294\7\u00e8\2\2\u0294\u0295\7\u0087\2\2\u0295\u0296\7\u00e1\2\2\u0296"+
		"\u029b\5\u00a0Q\2\u0297\u0298\7\u00ee\2\2\u0298\u0299\7n\2\2\u0299\u029a"+
		"\7\u00e1\2\2\u029a\u029c\t\4\2\2\u029b\u0297\3\2\2\2\u029b\u029c\3\2\2"+
		"\2\u029c\u029d\3\2\2\2\u029d\u029e\7\u00e9\2\2\u029e\u02a0\3\2\2\2\u029f"+
		"\u0293\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1\u028a\3\2"+
		"\2\2\u02a1\u028d\3\2\2\2\u02a1\u0290\3\2\2\2\u02a2\37\3\2\2\2\u02a3\u02a4"+
		"\7r\2\2\u02a4\u02ac\7\u00e1\2\2\u02a5\u02a6\7\u0084\2\2\u02a6\u02a7\7"+
		"\u00e8\2\2\u02a7\u02a8\5\u00a2R\2\u02a8\u02a9\7\u00e9\2\2\u02a9\u02ad"+
		"\3\2\2\2\u02aa\u02ad\7\u00b2\2\2\u02ab\u02ad\7\u00ae\2\2\u02ac\u02a5\3"+
		"\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ab\3\2\2\2\u02ad!\3\2\2\2\u02ae\u02af"+
		"\7b\2\2\u02af\u02b0\7d\2\2\u02b0\u02b4\7E\2\2\u02b1\u02b4\7\u0085\2\2"+
		"\u02b2\u02b4\5$\23\2\u02b3\u02ae\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b2"+
		"\3\2\2\2\u02b4#\3\2\2\2\u02b5\u02b6\7!\2\2\u02b6\u02b7\7\u00e8\2\2\u02b7"+
		"\u02b8\5\u00a2R\2\u02b8\u02ba\7\u00ab\2\2\u02b9\u02bb\t\6\2\2\u02ba\u02b9"+
		"\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\7@\2\2\u02bd"+
		"\u02be\7\u00c6\2\2\u02be\u02bf\7\u00e8\2\2\u02bf\u02c4\5\u00c0a\2\u02c0"+
		"\u02c1\7\u00ee\2\2\u02c1\u02c3\5\u00c0a\2\u02c2\u02c0\3\2\2\2\u02c3\u02c6"+
		"\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c7\3\2\2\2\u02c6"+
		"\u02c4\3\2\2\2\u02c7\u02c8\7\u00e9\2\2\u02c8\u02c9\7\u00e9\2\2\u02c9%"+
		"\3\2\2\2\u02ca\u02cb\7\u0082\2\2\u02cb\u02ce\7\u00e1\2\2\u02cc\u02cf\7"+
		"\35\2\2\u02cd\u02cf\5\u00c2b\2\u02ce\u02cc\3\2\2\2\u02ce\u02cd\3\2\2\2"+
		"\u02cf\u02d0\3\2\2\2\u02d0\u02d2\7\u00ee\2\2\u02d1\u02ca\3\2\2\2\u02d1"+
		"\u02d2\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\7\u0096\2\2\u02d4\u02d5"+
		"\7\u00e1\2\2\u02d5\u02d6\t\7\2\2\u02d6\'\3\2\2\2\u02d7\u02d8\5\u00a2R"+
		"\2\u02d8\u02dc\5\u00e0q\2\u02d9\u02db\5*\26\2\u02da\u02d9\3\2\2\2\u02db"+
		"\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02e7\3\2"+
		"\2\2\u02de\u02dc\3\2\2\2\u02df\u02e4\5,\27\2\u02e0\u02e1\7\u00ee\2\2\u02e1"+
		"\u02e3\5,\27\2\u02e2\u02e0\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2\3\2"+
		"\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7"+
		"\u02df\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02eb\5J"+
		"&\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb)\3\2\2\2\u02ec\u032f"+
		"\7y\2\2\u02ed\u02ee\7c\2\2\u02ee\u032f\5\u00a4S\2\u02ef\u032f\7\u00ba"+
		"\2\2\u02f0\u02f1\7\u0091\2\2\u02f1\u02f2\7-\2\2\u02f2\u02f3\7\u00e8\2"+
		"\2\u02f3\u02f4\7B\2\2\u02f4\u02f5\7\u00e1\2\2\u02f5\u02f6\7\u00f6\2\2"+
		"\u02f6\u032f\7\u00e9\2\2\u02f7\u02f8\7\67\2\2\u02f8\u02fa\5\u0116\u008c"+
		"\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc"+
		"\7;\2\2\u02fc\u032f\5\u00b4[\2\u02fd\u0303\7\u0088\2\2\u02fe\u02ff\7\u00e8"+
		"\2\2\u02ff\u0300\7\u00f7\2\2\u0300\u0301\7\u00ee\2\2\u0301\u0302\7\u00f7"+
		"\2\2\u0302\u0304\7\u00e9\2\2\u0303\u02fe\3\2\2\2\u0303\u0304\3\2\2\2\u0304"+
		"\u032f\3\2\2\2\u0305\u0306\7\34\2\2\u0306\u0307\7@\2\2\u0307\u032f\7\u00af"+
		"\2\2\u0308\u0309\7C\2\2\u0309\u030a\7\61\2\2\u030a\u030b\7\62\2\2\u030b"+
		"\u030c\7$\2\2\u030c\u030e\t\b\2\2\u030d\u030f\7\25\2\2\u030e\u030d\3\2"+
		"\2\2\u030e\u030f\3\2\2\2\u030f\u032f\3\2\2\2\u0310\u0312\7\34\2\2\u0311"+
		"\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u032f\7\35"+
		"\2\2\u0314\u032f\7\u00b3\2\2\u0315\u0316\7v\2\2\u0316\u0317\7-\2\2\u0317"+
		"\u0318\7\u00e8\2\2\u0318\u0319\7f\2\2\u0319\u031a\7\u00e1\2\2\u031a\u031b"+
		"\5\u0116\u008c\2\u031b\u031c\7\u00ee\2\2\u031c\u031d\7w\2\2\u031d\u031e"+
		"\7\u00e1\2\2\u031e\u031f\t\t\2\2\u031f\u0320\7\u00ee\2\2\u0320\u0321\7"+
		"Y\2\2\u0321\u0322\7\u00e1\2\2\u0322\u0323\7\u00f6\2\2\u0323\u0324\7\u00e9"+
		"\2\2\u0324\u032f\3\2\2\2\u0325\u032a\5,\27\2\u0326\u0327\7\u00ee\2\2\u0327"+
		"\u0329\5,\27\2\u0328\u0326\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2"+
		"\2\2\u032a\u032b\3\2\2\2\u032b\u032f\3\2\2\2\u032c\u032a\3\2\2\2\u032d"+
		"\u032f\5J&\2\u032e\u02ec\3\2\2\2\u032e\u02ed\3\2\2\2\u032e\u02ef\3\2\2"+
		"\2\u032e\u02f0\3\2\2\2\u032e\u02f9\3\2\2\2\u032e\u02fd\3\2\2\2\u032e\u0305"+
		"\3\2\2\2\u032e\u0308\3\2\2\2\u032e\u0311\3\2\2\2\u032e\u0314\3\2\2\2\u032e"+
		"\u0315\3\2\2\2\u032e\u0325\3\2\2\2\u032e\u032d\3\2\2\2\u032f+\3\2\2\2"+
		"\u0330\u0331\7\67\2\2\u0331\u0333\5\u0116\u008c\2\u0332\u0330\3\2\2\2"+
		"\u0332\u0333\3\2\2\2\u0333\u0337\3\2\2\2\u0334\u0338\5.\30\2\u0335\u0338"+
		"\5\62\32\2\u0336\u0338\5H%\2\u0337\u0334\3\2\2\2\u0337\u0335\3\2\2\2\u0337"+
		"\u0336\3\2\2\2\u0338-\3\2\2\2\u0339\u033c\5\u00acW\2\u033a\u033c\7T\2"+
		"\2\u033b\u0339\3\2\2\2\u033b\u033a\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u0340"+
		"\5\60\31\2\u033e\u0340\58\35\2\u033f\u033d\3\2\2\2\u033f\u033e\3\2\2\2"+
		"\u0340/\3\2\2\2\u0341\u0343\t\2\2\2\u0342\u0341\3\2\2\2\u0342\u0343\3"+
		"\2\2\2\u0343\u0345\3\2\2\2\u0344\u0346\5> \2\u0345\u0344\3\2\2\2\u0345"+
		"\u0346\3\2\2\2\u0346\u0348\3\2\2\2\u0347\u0349\5@!\2\u0348\u0347\3\2\2"+
		"\2\u0348\u0349\3\2\2\2\u0349\61\3\2\2\2\u034a\u034b\7A\2\2\u034b\u034d"+
		"\7\30\2\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2\2\2"+
		"\u034e\u034f\7J\2\2\u034f\u0350\5\u00a0Q\2\u0350\u0351\7\u00e8\2\2\u0351"+
		"\u0352\5\u00a2R\2\u0352\u0356\7\u00e9\2\2\u0353\u0355\5\64\33\2\u0354"+
		"\u0353\3\2\2\2\u0355\u0358\3\2\2\2\u0356\u0354\3\2\2\2\u0356\u0357\3\2"+
		"\2\2\u0357\63\3\2\2\2\u0358\u0356\3\2\2\2\u0359\u035a\7G\2\2\u035a\u035b"+
		"\t\n\2\2\u035b\u0360\5\66\34\2\u035c\u035d\7\34\2\2\u035d\u035e\7@\2\2"+
		"\u035e\u0360\7\u00af\2\2\u035f\u0359\3\2\2\2\u035f\u035c\3\2\2\2\u0360"+
		"\65\3\2\2\2\u0361\u0362\7F\2\2\u0362\u0367\7X\2\2\u0363\u0367\7\63\2\2"+
		"\u0364\u0365\7%\2\2\u0365\u0367\t\13\2\2\u0366\u0361\3\2\2\2\u0366\u0363"+
		"\3\2\2\2\u0366\u0364\3\2\2\2\u0367\67\3\2\2\2\u0368\u036a\7b\2\2\u0369"+
		"\u036b\5<\37\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2\2\2\u036b9\3\2\2\2"+
		"\u036c\u036d\7\u0084\2\2\u036d\u036e\5\u00aeX\2\u036e\u036f\5<\37\2\u036f"+
		";\3\2\2\2\u0370\u0371\7-\2\2\u0371\u0372\7\u00e8\2\2\u0372\u0373\7`\2"+
		"\2\u0373\u0374\7\u00e1\2\2\u0374\u0375\7\u00f7\2\2\u0375\u0376\7\u00e9"+
		"\2\2\u0376=\3\2\2\2\u0377\u0386\7-\2\2\u0378\u0379\7\u0081\2\2\u0379\u037a"+
		"\7\u00e1\2\2\u037a\u0387\7\u00f7\2\2\u037b\u037c\7\u00e8\2\2\u037c\u0381"+
		"\5\u00fe\u0080\2\u037d\u037e\7\u00ee\2\2\u037e\u0380\5\u00fe\u0080\2\u037f"+
		"\u037d\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u037f\3\2\2\2\u0381\u0382\3\2"+
		"\2\2\u0382\u0384\3\2\2\2\u0383\u0381\3\2\2\2\u0384\u0385\7\u00e9\2\2\u0385"+
		"\u0387\3\2\2\2\u0386\u0378\3\2\2\2\u0386\u037b\3\2\2\2\u0387?\3\2\2\2"+
		"\u0388\u038c\5B\"\2\u0389\u038c\5D#\2\u038a\u038c\5F$\2\u038b\u0388\3"+
		"\2\2\2\u038b\u0389\3\2\2\2\u038b\u038a\3\2\2\2\u038cA\3\2\2\2\u038d\u038e"+
		"\7G\2\2\u038e\u038f\5\u009eP\2\u038f\u0390\7\u00e8\2\2\u0390\u0391\5\u00a2"+
		"R\2\u0391\u0392\7\u00e9\2\2\u0392C\3\2\2\2\u0393\u0394\7G\2\2\u0394\u0395"+
		"\5\u0116\u008c\2\u0395E\3\2\2\2\u0396\u0397\7G\2\2\u0397\u0398\7\u00f6"+
		"\2\2\u0398G\3\2\2\2\u0399\u039d\7\64\2\2\u039a\u039b\7\34\2\2\u039b\u039c"+
		"\7@\2\2\u039c\u039e\7\u00af\2\2\u039d\u039a\3\2\2\2\u039d\u039e\3\2\2"+
		"\2\u039e\u039f\3\2\2\2\u039f\u03a0\7\u00e8\2\2\u03a0\u03a1\5\u00b4[\2"+
		"\u03a1\u03a2\7\u00e9\2\2\u03a2I\3\2\2\2\u03a3\u03a4\7E\2\2\u03a4\u03a6"+
		"\5\u00a6T\2\u03a5\u03a7\t\2\2\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2"+
		"\2\u03a7\u03b4\3\2\2\2\u03a8\u03a9\7-\2\2\u03a9\u03aa\7\u00e8\2\2\u03aa"+
		"\u03af\5\u00fe\u0080\2\u03ab\u03ac\7\u00ee\2\2\u03ac\u03ae\5\u00fe\u0080"+
		"\2\u03ad\u03ab\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af\u03ad\3\2\2\2\u03af\u03b0"+
		"\3\2\2\2\u03b0\u03b2\3\2\2\2\u03b1\u03af\3\2\2\2\u03b2\u03b3\7\u00e9\2"+
		"\2\u03b3\u03b5\3\2\2\2\u03b4\u03a8\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b7"+
		"\3\2\2\2\u03b6\u03b8\5L\'\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8"+
		"\u03bf\3\2\2\2\u03b9\u03bd\7z\2\2\u03ba\u03be\5\u0116\u008c\2\u03bb\u03be"+
		"\5\u009eP\2\u03bc\u03be\7\u00f6\2\2\u03bd\u03ba\3\2\2\2\u03bd\u03bb\3"+
		"\2\2\2\u03bd\u03bc\3\2\2\2\u03be\u03c0\3\2\2\2\u03bf\u03b9\3\2\2\2\u03bf"+
		"\u03c0\3\2\2\2\u03c0K\3\2\2\2\u03c1\u03c5\5B\"\2\u03c2\u03c5\5D#\2\u03c3"+
		"\u03c5\5N(\2\u03c4\u03c1\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4\u03c3\3\2\2"+
		"\2\u03c5M\3\2\2\2\u03c6\u03c7\7G\2\2\u03c7\u03c8\7;\2\2\u03c8O\3\2\2\2"+
		"\u03c9\u03ca\7\67\2\2\u03ca\u03cc\5\u0116\u008c\2\u03cb\u03c9\3\2\2\2"+
		"\u03cb\u03cc\3\2\2\2\u03cc\u03d0\3\2\2\2\u03cd\u03d1\5R*\2\u03ce\u03d1"+
		"\5Z.\2\u03cf\u03d1\5H%\2\u03d0\u03cd\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0"+
		"\u03cf\3\2\2\2\u03d1Q\3\2\2\2\u03d2\u03d5\5T+\2\u03d3\u03d6\5V,\2\u03d4"+
		"\u03d6\5X-\2\u03d5\u03d3\3\2\2\2\u03d5\u03d4\3\2\2\2\u03d6S\3\2\2\2\u03d7"+
		"\u03da\5\u00acW\2\u03d8\u03da\7T\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03d8\3"+
		"\2\2\2\u03daU\3\2\2\2\u03db\u03dd\t\2\2\2\u03dc\u03db\3\2\2\2\u03dc\u03dd"+
		"\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e0\5\u00aeX\2\u03df\u03e1\5> \2"+
		"\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e3\3\2\2\2\u03e2\u03e4"+
		"\5@!\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4W\3\2\2\2\u03e5\u03e8"+
		"\7\u009c\2\2\u03e6\u03e9\5\u00aeX\2\u03e7\u03e9\5:\36\2\u03e8\u03e6\3"+
		"\2\2\2\u03e8\u03e7\3\2\2\2\u03e9Y\3\2\2\2\u03ea\u03eb\7A\2\2\u03eb\u03ed"+
		"\7\30\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee\3\2\2\2"+
		"\u03ee\u03ef\5\u00aeX\2\u03ef\u03f0\7J\2\2\u03f0\u03f1\5\u00a0Q\2\u03f1"+
		"\u03f5\5\u00aeX\2\u03f2\u03f4\5\64\33\2\u03f3\u03f2\3\2\2\2\u03f4\u03f7"+
		"\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6[\3\2\2\2\u03f7"+
		"\u03f5\3\2\2\2\u03f8\u03f9\5\u00a2R\2\u03f9\u03fa\7\62\2\2\u03fa\u0400"+
		"\5\u00b4[\2\u03fb\u03fe\7\u00a8\2\2\u03fc\u03fd\7\34\2\2\u03fd\u03ff\7"+
		"\35\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0401\3\2\2\2\u0400"+
		"\u03fb\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0403\3\2\2\2\u0402\u0404\5,"+
		"\27\2\u0403\u0402\3\2\2\2\u0403\u0404\3\2\2\2\u0404]\3\2\2\2\u0405\u0406"+
		"\5\u0116\u008c\2\u0406\u0407\7\u00f5\2\2\u0407\u0408\7g\2\2\u0408\u0409"+
		"\7@\2\2\u0409\u040a\7\\\2\2\u040a_\3\2\2\2\u040b\u040c\7\60\2\2\u040c"+
		"\u040d\7P\2\2\u040d\u040e\5\u00a0Q\2\u040ea\3\2\2\2\u040f\u0410\5d\63"+
		"\2\u0410c\3\2\2\2\u0411\u0412\5f\64\2\u0412\u0415\5\u00e0q\2\u0413\u0414"+
		"\7c\2\2\u0414\u0416\5\u00a4S\2\u0415\u0413\3\2\2\2\u0415\u0416\3\2\2\2"+
		"\u0416\u041a\3\2\2\2\u0417\u041b\7\35\2\2\u0418\u0419\7\34\2\2\u0419\u041b"+
		"\7\35\2\2\u041a\u0417\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2"+
		"\u041b\u041d\3\2\2\2\u041c\u041e\7\u00ba\2\2\u041d\u041c\3\2\2\2\u041d"+
		"\u041e\3\2\2\2\u041ee\3\2\2\2\u041f\u0420\7\60\2\2\u0420\u0421\7\65\2"+
		"\2\u0421\u0422\5\u00a2R\2\u0422g\3\2\2\2\u0423\u0424\7-\2\2\u0424\u0426"+
		"\t\f\2\2\u0425\u0423\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427\3\2\2\2\u0427"+
		"\u043a\7/\2\2\u0428\u042d\5j\66\2\u0429\u042a\7\u00ee\2\2\u042a\u042c"+
		"\5j\66\2\u042b\u0429\3\2\2\2\u042c\u042f\3\2\2\2\u042d\u042b\3\2\2\2\u042d"+
		"\u042e\3\2\2\2\u042e\u043b\3\2\2\2\u042f\u042d\3\2\2\2\u0430\u0431\5r"+
		":\2\u0431\u0432\7\u00ee\2\2\u0432\u0433\5\30\r\2\u0433\u0439\3\2\2\2\u0434"+
		"\u0435\5\30\r\2\u0435\u0436\7\u00ee\2\2\u0436\u0437\5r:\2\u0437\u0439"+
		"\3\2\2\2\u0438\u0430\3\2\2\2\u0438\u0434\3\2\2\2\u0439\u043b\3\2\2\2\u043a"+
		"\u0428\3\2\2\2\u043a\u0438\3\2\2\2\u043bi\3\2\2\2\u043c\u0443\5(\25\2"+
		"\u043d\u0443\5\\/\2\u043e\u0443\5^\60\2\u043f\u0443\5P)\2\u0440\u0443"+
		"\5\u0092J\2\u0441\u0443\5l\67\2\u0442\u043c\3\2\2\2\u0442\u043d\3\2\2"+
		"\2\u0442\u043e\3\2\2\2\u0442\u043f\3\2\2\2\u0442\u0440\3\2\2\2\u0442\u0441"+
		"\3\2\2\2\u0443k\3\2\2\2\u0444\u0445\7\67\2\2\u0445\u0447\5\u0116\u008c"+
		"\2\u0446\u0444\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449"+
		"\7;\2\2\u0449\u044a\5\u00c0a\2\u044a\u044b\7@\2\2\u044b\u044c\5\u00a2"+
		"R\2\u044cm\3\2\2\2\u044d\u044e\7\u00e8\2\2\u044e\u0453\5p9\2\u044f\u0450"+
		"\7\u00ee\2\2\u0450\u0452\5p9\2\u0451\u044f\3\2\2\2\u0452\u0455\3\2\2\2"+
		"\u0453\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0456\3\2\2\2\u0455\u0453"+
		"\3\2\2\2\u0456\u0457\7\u00e9\2\2\u0457o\3\2\2\2\u0458\u045a\5\u00a2R\2"+
		"\u0459\u045b\t\r\2\2\u045a\u0459\3\2\2\2\u045a\u045b\3\2\2\2\u045bq\3"+
		"\2\2\2\u045c\u045d\5t;\2\u045d\u045e\7;\2\2\u045e\u0461\5\u00c0a\2\u045f"+
		"\u0460\7-\2\2\u0460\u0462\7\u00c6\2\2\u0461\u045f\3\2\2\2\u0461\u0462"+
		"\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0464\7\u00ee\2\2\u0464\u0465\5t;\2"+
		"\u0465s\3\2\2\2\u0466\u0467\5\u00a2R\2\u0467\u0468\5\u00e2r\2\u0468\u0469"+
		"\7C\2\2\u0469\u046a\7\61\2\2\u046a\u046b\7\62\2\2\u046b\u046d\7$\2\2\u046c"+
		"\u046e\t\b\2\2\u046d\u046c\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u0470\3\2"+
		"\2\2\u046f\u0471\7\25\2\2\u0470\u046f\3\2\2\2\u0470\u0471\3\2\2\2\u0471"+
		"\u0474\3\2\2\2\u0472\u0473\7\34\2\2\u0473\u0475\7\35\2\2\u0474\u0472\3"+
		"\2\2\2\u0474\u0475\3\2\2\2\u0475\u0478\3\2\2\2\u0476\u0477\7\67\2\2\u0477"+
		"\u0479\5\u0116\u008c\2\u0478\u0476\3\2\2\2\u0478\u0479\3\2\2\2\u0479u"+
		"\3\2\2\2\u047a\u0481\7>\2\2\u047b\u0482\5x=\2\u047c\u0482\5\u0080A\2\u047d"+
		"\u0482\5\u0082B\2\u047e\u047f\7\u00a7\2\2\u047f\u0480\7@\2\2\u0480\u0482"+
		"\7\u00be\2\2\u0481\u047b\3\2\2\2\u0481\u047c\3\2\2\2\u0481\u047d\3\2\2"+
		"\2\u0481\u047e\3\2\2\2\u0482w\3\2\2\2\u0483\u0485\7\67\2\2\u0484\u0483"+
		"\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0488\3\2\2\2\u0486\u0487\7\u0089\2"+
		"\2\u0487\u0489\7\20\2\2\u0488\u0486\3\2\2\2\u0488\u0489\3\2\2\2\u0489"+
		"\u048a\3\2\2\2\u048a\u048f\5z>\2\u048b\u048c\7\u00ee\2\2\u048c\u048e\5"+
		"z>\2\u048d\u048b\3\2\2\2\u048e\u0491\3\2\2\2\u048f\u048d\3\2\2\2\u048f"+
		"\u0490\3\2\2\2\u0490y\3\2\2\2\u0491\u048f\3\2\2\2\u0492\u0494\5\u0116"+
		"\u008c\2\u0493\u0495\5|?\2\u0494\u0493\3\2\2\2\u0494\u0495\3\2\2\2\u0495"+
		"{\3\2\2\2\u0496\u0497\7-\2\2\u0497\u0498\7\u00e8\2\2\u0498\u049d\5~@\2"+
		"\u0499\u049a\7\u00ee\2\2\u049a\u049c\5~@\2\u049b\u0499\3\2\2\2\u049c\u049f"+
		"\3\2\2\2\u049d\u049b\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a0\3\2\2\2\u049f"+
		"\u049d\3\2\2\2\u04a0\u04a1\7\u00e9\2\2\u04a1}\3\2\2\2\u04a2\u04a3\7\u0093"+
		"\2\2\u04a3\u04a4\7\u00e1\2\2\u04a4\u04b4\7\u00f7\2\2\u04a5\u04a6\7\u00a0"+
		"\2\2\u04a6\u04a7\7\u00e1\2\2\u04a7\u04b4\t\4\2\2\u04a8\u04a9\7\u009a\2"+
		"\2\u04a9\u04b1\7Q\2\2\u04aa\u04ab\5\u009eP\2\u04ab\u04ac\7\u00e8\2\2\u04ac"+
		"\u04ad\5\u00a2R\2\u04ad\u04ae\7\u00e9\2\2\u04ae\u04b2\3\2\2\2\u04af\u04b2"+
		"\5\u0116\u008c\2\u04b0\u04b2\7\u00f6\2\2\u04b1\u04aa\3\2\2\2\u04b1\u04af"+
		"\3\2\2\2\u04b1\u04b0\3\2\2\2\u04b2\u04b4\3\2\2\2\u04b3\u04a2\3\2\2\2\u04b3"+
		"\u04a5\3\2\2\2\u04b3\u04a8\3\2\2\2\u04b4\177\3\2\2\2\u04b5\u04b8\7\65"+
		"\2\2\u04b6\u04b7\7\u0089\2\2\u04b7\u04b9\7\20\2\2\u04b8\u04b6\3\2\2\2"+
		"\u04b8\u04b9\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bf\5\u00a2R\2\u04bb"+
		"\u04bc\7\u00ee\2\2\u04bc\u04be\5\u00a2R\2\u04bd\u04bb\3\2\2\2\u04be\u04c1"+
		"\3\2\2\2\u04bf\u04bd\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u0081\3\2\2\2\u04c1"+
		"\u04bf\3\2\2\2\u04c2\u04c5\7E\2\2\u04c3\u04c4\7\u0089\2\2\u04c4\u04c6"+
		"\7\20\2\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c7\3\2\2\2"+
		"\u04c7\u04cc\5\u00a6T\2\u04c8\u04c9\7\u00ee\2\2\u04c9\u04cb\5\u00a6T\2"+
		"\u04ca\u04c8\3\2\2\2\u04cb\u04ce\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cc\u04cd"+
		"\3\2\2\2\u04cd\u0083\3\2\2\2\u04ce\u04cc\3\2\2\2\u04cf\u04d1\7-\2\2\u04d0"+
		"\u04cf\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3\t\f"+
		"\2\2\u04d3\u04dd\7\67\2\2\u04d4\u04de\7\5\2\2\u04d5\u04da\5\u0116\u008c"+
		"\2\u04d6\u04d7\7\u00ee\2\2\u04d7\u04d9\5\u0116\u008c\2\u04d8\u04d6\3\2"+
		"\2\2\u04d9\u04dc\3\2\2\2\u04da\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db"+
		"\u04de\3\2\2\2\u04dc\u04da\3\2\2\2\u04dd\u04d4\3\2\2\2\u04dd\u04d5\3\2"+
		"\2\2\u04de\u0085\3\2\2\2\u04df\u04e0\t\16\2\2\u04e0\u04ea\7\u00c3\2\2"+
		"\u04e1\u04eb\7\5\2\2\u04e2\u04e7\5\u0116\u008c\2\u04e3\u04e4\7\u00ee\2"+
		"\2\u04e4\u04e6\5\u0116\u008c\2\u04e5\u04e3\3\2\2\2\u04e6\u04e9\3\2\2\2"+
		"\u04e7\u04e5\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04eb\3\2\2\2\u04e9\u04e7"+
		"\3\2\2\2\u04ea\u04e1\3\2\2\2\u04ea\u04e2\3\2\2\2\u04eb\u0087\3\2\2\2\u04ec"+
		"\u04ef\7\u00bd\2\2\u04ed\u04ee\7!\2\2\u04ee\u04f0\5\u00b4[\2\u04ef\u04ed"+
		"\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f2\7Q\2\2\u04f2"+
		"\u04f5\5\u00a0Q\2\u04f3\u04f4\7!\2\2\u04f4\u04f6\5\u00b4[\2\u04f5\u04f3"+
		"\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04fc\3\2\2\2\u04f7\u04f8\7-\2\2\u04f8"+
		"\u04f9\7\u00e8\2\2\u04f9\u04fa\5\u0112\u008a\2\u04fa\u04fb\7\u00e9\2\2"+
		"\u04fb\u04fd\3\2\2\2\u04fc\u04f7\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u0089"+
		"\3\2\2\2\u04fe\u04ff\7%\2\2\u04ff\u0502\7\u00e8\2\2\u0500\u0503\5\u008c"+
		"G\2\u0501\u0503\5\u008eH\2\u0502\u0500\3\2\2\2\u0502\u0501\3\2\2\2\u0503"+
		"\u0504\3\2\2\2\u0504\u0505\7\u00e9\2\2\u0505\u008b\3\2\2\2\u0506\u0507"+
		"\7z\2\2\u0507\u050b\7\u00e1\2\2\u0508\u050c\5\u009eP\2\u0509\u050c\5\u0116"+
		"\u008c\2\u050a\u050c\7\u00f6\2\2\u050b\u0508\3\2\2\2\u050b\u0509\3\2\2"+
		"\2\u050b\u050a\3\2\2\2\u050c\u008d\3\2\2\2\u050d\u050e\7\u00bf\2\2\u050e"+
		"\u0511\7\u00e1\2\2\u050f\u0512\7\u009f\2\2\u0510\u0512\5\u0090I\2\u0511"+
		"\u050f\3\2\2\2\u0511\u0510\3\2\2\2\u0512\u008f\3\2\2\2\u0513\u052f\7G"+
		"\2\2\u0514\u0518\7\u00e8\2\2\u0515\u0516\7\u0087\2\2\u0516\u0517\7\u00e1"+
		"\2\2\u0517\u0519\5\u00a0Q\2\u0518\u0515\3\2\2\2\u0518\u0519\3\2\2\2\u0519"+
		"\u0520\3\2\2\2\u051a\u051c\7\u00ee\2\2\u051b\u051a\3\2\2\2\u051b\u051c"+
		"\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051e\7n\2\2\u051e\u051f\7\u00e1\2"+
		"\2\u051f\u0521\t\4\2\2\u0520\u051b\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u052c"+
		"\3\2\2\2\u0522\u0524\7\u00ee\2\2\u0523\u0522\3\2\2\2\u0523\u0524\3\2\2"+
		"\2\u0524\u0525\3\2\2\2\u0525\u0526\7\u0086\2\2\u0526\u052a\7\u00e1\2\2"+
		"\u0527\u052b\7\u008d\2\2\u0528\u0529\7\u00f7\2\2\u0529\u052b\t\17\2\2"+
		"\u052a\u0527\3\2\2\2\u052a\u0528\3\2\2\2\u052b\u052d\3\2\2\2\u052c\u0523"+
		"\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u0530\7\u00e9\2"+
		"\2\u052f\u0514\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0091\3\2\2\2\u0531\u0534"+
		"\5\u0094K\2\u0532\u0535\5\u0096L\2\u0533\u0535\5\u009aN\2\u0534\u0532"+
		"\3\2\2\2\u0534\u0533\3\2\2\2\u0535\u0093\3\2\2\2\u0536\u0537\7E\2\2\u0537"+
		"\u0538\5\u00a6T\2\u0538\u0095\3\2\2\2\u0539\u053f\7\u009c\2\2\u053a\u0540"+
		"\5:\36\2\u053b\u053d\5n8\2\u053c\u053e\5\u0098M\2\u053d\u053c\3\2\2\2"+
		"\u053d\u053e\3\2\2\2\u053e\u0540\3\2\2\2\u053f\u053a\3\2\2\2\u053f\u053b"+
		"\3\2\2\2\u0540\u0097\3\2\2\2\u0541\u0542\7G\2\2\u0542\u0545\5\u0116\u008c"+
		"\2\u0543\u0545\7;\2\2\u0544\u0541\3\2\2\2\u0544\u0543\3\2\2\2\u0545\u0099"+
		"\3\2\2\2\u0546\u0547\7b\2\2\u0547\u054f\7d\2\2\u0548\u0549\7-\2\2\u0549"+
		"\u054a\7h\2\2\u054a\u054b\7\u00e1\2\2\u054b\u054d\7\u00f7\2\2\u054c\u054e"+
		"\7\u0097\2\2\u054d\u054c\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0550\3\2\2"+
		"\2\u054f\u0548\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0552\3\2\2\2\u0551\u0553"+
		"\5L\'\2\u0552\u0551\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u009b\3\2\2\2\u0554"+
		"\u0555\7%\2\2\u0555\u0556\7\u00e8\2\2\u0556\u0557\7\u008f\2\2\u0557\u0558"+
		"\7\u00e1\2\2\u0558\u0559\t\20\2\2\u0559\u0572\7\u00e9\2\2\u055a\u055b"+
		"\7\u0095\2\2\u055b\u055c\7\u00e1\2\2\u055c\u0572\7G\2\2\u055d\u055e\7"+
		"u\2\2\u055e\u055f\7\u00e1\2\2\u055f\u0572\t\5\2\2\u0560\u0561\7\u00bf"+
		"\2\2\u0561\u0562\7\u00e1\2\2\u0562\u056f\7G\2\2\u0563\u0564\7\u00e8\2"+
		"\2\u0564\u0565\7\u0087\2\2\u0565\u0566\7\u00e1\2\2\u0566\u056b\5\u00a0"+
		"Q\2\u0567\u0568\7\u00ee\2\2\u0568\u0569\7n\2\2\u0569\u056a\7\u00e1\2\2"+
		"\u056a\u056c\t\4\2\2\u056b\u0567\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056d"+
		"\3\2\2\2\u056d\u056e\7\u00e9\2\2\u056e\u0570\3\2\2\2\u056f\u0563\3\2\2"+
		"\2\u056f\u0570\3\2\2\2\u0570\u0572\3\2\2\2\u0571\u0554\3\2\2\2\u0571\u055a"+
		"\3\2\2\2\u0571\u055d\3\2\2\2\u0571\u0560\3\2\2\2\u0572\u009d\3\2\2\2\u0573"+
		"\u0574\7\u00f5\2\2\u0574\u009f\3\2\2\2\u0575\u0576\7\u00f5\2\2\u0576\u00a1"+
		"\3\2\2\2\u0577\u0578\7\u00f5\2\2\u0578\u00a3\3\2\2\2\u0579\u057a\t\21"+
		"\2\2\u057a\u00a5\3\2\2\2\u057b\u057c\7\u00f5\2\2\u057c\u00a7\3\2\2\2\u057d"+
		"\u057e\7\u00f5\2\2\u057e\u00a9\3\2\2\2\u057f\u0585\7\u00e8\2\2\u0580\u0583"+
		"\7\u00f7\2\2\u0581\u0582\7\u00ee\2\2\u0582\u0584\7\u00f7\2\2\u0583\u0581"+
		"\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0586\3\2\2\2\u0585\u0580\3\2\2\2\u0585"+
		"\u0586\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0588\7\u00e9\2\2\u0588\u00ab"+
		"\3\2\2\2\u0589\u058b\7\"\2\2\u058a\u0589\3\2\2\2\u058a\u058b\3\2\2\2\u058b"+
		"\u058c\3\2\2\2\u058c\u058d\7\30\2\2\u058d\u00ad\3\2\2\2\u058e\u058f\7"+
		"\u00e8\2\2\u058f\u0594\5p9\2\u0590\u0591\7\u00ee\2\2\u0591\u0593\5p9\2"+
		"\u0592\u0590\3\2\2\2\u0593\u0596\3\2\2\2\u0594\u0592\3\2\2\2\u0594\u0595"+
		"\3\2\2\2\u0595\u0597\3\2\2\2\u0596\u0594\3\2\2\2\u0597\u0598\7\u00e9\2"+
		"\2\u0598\u00af\3\2\2\2\u0599\u059e\5\u00b4[\2\u059a\u059b\7\u00ee\2\2"+
		"\u059b\u059d\5\u00b4[\2\u059c\u059a\3\2\2\2\u059d\u05a0\3\2\2\2\u059e"+
		"\u059c\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u00b1\3\2\2\2\u05a0\u059e\3\2"+
		"\2\2\u05a1\u05a2\7\u00e8\2\2\u05a2\u05a3\5\u00b0Y\2\u05a3\u05a4\7\u00e9"+
		"\2\2\u05a4\u00b3\3\2\2\2\u05a5\u05a6\b[\1\2\u05a6\u05a7\7\u00e8\2\2\u05a7"+
		"\u05a8\5\u00b4[\2\u05a8\u05a9\7\u00e9\2\2\u05a9\u05b1\3\2\2\2\u05aa\u05ab"+
		"\7\34\2\2\u05ab\u05b1\5\u00b4[\b\u05ac\u05ad\7\u00cf\2\2\u05ad\u05b1\5"+
		"\u00b4[\7\u05ae\u05b1\5\u00b8]\2\u05af\u05b1\5\u00b6\\\2\u05b0\u05a5\3"+
		"\2\2\2\u05b0\u05aa\3\2\2\2\u05b0\u05ac\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b0"+
		"\u05af\3\2\2\2\u05b1\u05c3\3\2\2\2\u05b2\u05b3\f\f\2\2\u05b3\u05b4\7\6"+
		"\2\2\u05b4\u05c2\5\u00b4[\r\u05b5\u05b6\f\13\2\2\u05b6\u05b7\7\u00cd\2"+
		"\2\u05b7\u05c2\5\u00b4[\f\u05b8\u05b9\f\n\2\2\u05b9\u05ba\7.\2\2\u05ba"+
		"\u05c2\5\u00b4[\13\u05bb\u05bc\f\6\2\2\u05bc\u05bd\7\37\2\2\u05bd\u05c2"+
		"\5\u00b4[\7\u05be\u05bf\f\5\2\2\u05bf\u05c0\7\u00ce\2\2\u05c0\u05c2\5"+
		"\u00b4[\6\u05c1\u05b2\3\2\2\2\u05c1\u05b5\3\2\2\2\u05c1\u05b8\3\2\2\2"+
		"\u05c1\u05bb\3\2\2\2\u05c1\u05be\3\2\2\2\u05c2\u05c5\3\2\2\2\u05c3\u05c1"+
		"\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u00b5\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c6"+
		"\u05c7\5\u011a\u008e\2\u05c7\u00b7\3\2\2\2\u05c8\u05c9\b]\1\2\u05c9\u05ca"+
		"\5\u00bc_\2\u05ca\u05df\3\2\2\2\u05cb\u05cc\f\7\2\2\u05cc\u05ce\7\27\2"+
		"\2\u05cd\u05cf\7\34\2\2\u05ce\u05cd\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf"+
		"\u05d0\3\2\2\2\u05d0\u05de\t\22\2\2\u05d1\u05d2\f\6\2\2\u05d2\u05d3\7"+
		"\u00df\2\2\u05d3\u05de\5\u00bc_\2\u05d4\u05d5\f\5\2\2\u05d5\u05d6\5\u00ba"+
		"^\2\u05d6\u05d7\5\u00bc_\2\u05d7\u05de\3\2\2\2\u05d8\u05d9\f\4\2\2\u05d9"+
		"\u05da\5\u00ba^\2\u05da\u05db\t\23\2\2\u05db\u05dc\5\u00d6l\2\u05dc\u05de"+
		"\3\2\2\2\u05dd\u05cb\3\2\2\2\u05dd\u05d1\3\2\2\2\u05dd\u05d4\3\2\2\2\u05dd"+
		"\u05d8\3\2\2\2\u05de\u05e1\3\2\2\2\u05df\u05dd\3\2\2\2\u05df\u05e0\3\2"+
		"\2\2\u05e0\u00b9\3\2\2\2\u05e1\u05df\3\2\2\2\u05e2\u05e3\t\24\2\2\u05e3"+
		"\u00bb\3\2\2\2\u05e4\u05e6\5\u00be`\2\u05e5\u05e7\7\34\2\2\u05e6\u05e5"+
		"\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05e9\7\26\2\2"+
		"\u05e9\u05ea\5\u00d6l\2\u05ea\u061f\3\2\2\2\u05eb\u05ed\5\u00be`\2\u05ec"+
		"\u05ee\7\34\2\2\u05ed\u05ec\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef\3"+
		"\2\2\2\u05ef\u05f0\7\26\2\2\u05f0\u05f1\7\u00e8\2\2\u05f1\u05f6\5\u00c0"+
		"a\2\u05f2\u05f3\7\u00ee\2\2\u05f3\u05f5\5\u00c0a\2\u05f4\u05f2\3\2\2\2"+
		"\u05f5\u05f8\3\2\2\2\u05f6\u05f4\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f9"+
		"\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f9\u05fa\7\u00e9\2\2\u05fa\u061f\3\2\2"+
		"\2\u05fb\u05fd\5\u00be`\2\u05fc\u05fe\7\34\2\2\u05fd\u05fc\3\2\2\2\u05fd"+
		"\u05fe\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0600\7\t\2\2\u0600\u0601\5\u00c0"+
		"a\2\u0601\u0602\7\6\2\2\u0602\u0603\5\u00bc_\2\u0603\u061f\3\2\2\2\u0604"+
		"\u0605\5\u00be`\2\u0605\u0606\7&\2\2\u0606\u0607\7\31\2\2\u0607\u0608"+
		"\5\u00c0a\2\u0608\u061f\3\2\2\2\u0609\u060b\5\u00be`\2\u060a\u060c\7\34"+
		"\2\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\3\2\2\2\u060d"+
		"\u060e\7\31\2\2\u060e\u0613\5\u00c0a\2\u060f\u0610\7\17\2\2\u0610\u0612"+
		"\5\u00c0a\2\u0611\u060f\3\2\2\2\u0612\u0615\3\2\2\2\u0613\u0611\3\2\2"+
		"\2\u0613\u0614\3\2\2\2\u0614\u061f\3\2\2\2\u0615\u0613\3\2\2\2\u0616\u0618"+
		"\5\u00be`\2\u0617\u0619\7\34\2\2\u0618\u0617\3\2\2\2\u0618\u0619\3\2\2"+
		"\2\u0619\u061a\3\2\2\2\u061a\u061b\7#\2\2\u061b\u061c\5\u00c0a\2\u061c"+
		"\u061f\3\2\2\2\u061d\u061f\5\u00be`\2\u061e\u05e4\3\2\2\2\u061e\u05eb"+
		"\3\2\2\2\u061e\u05fb\3\2\2\2\u061e\u0604\3\2\2\2\u061e\u0609\3\2\2\2\u061e"+
		"\u0616\3\2\2\2\u061e\u061d\3\2\2\2\u061f\u00bd\3\2\2\2\u0620\u0621\b`"+
		"\1\2\u0621\u0622\5\u00c0a\2\u0622\u064c\3\2\2\2\u0623\u0624\f\20\2\2\u0624"+
		"\u0625\7\u00d1\2\2\u0625\u064b\5\u00be`\21\u0626\u0627\f\17\2\2\u0627"+
		"\u0628\7\u00d2\2\2\u0628\u064b\5\u00be`\20\u0629\u062a\f\16\2\2\u062a"+
		"\u062b\7\u00d3\2\2\u062b\u064b\5\u00be`\17\u062c\u062d\f\r\2\2\u062d\u062e"+
		"\7\u00d4\2\2\u062e\u064b\5\u00be`\16\u062f\u0630\f\f\2\2\u0630\u0631\7"+
		"\u00d8\2\2\u0631\u064b\5\u00be`\r\u0632\u0633\f\13\2\2\u0633\u0634\7\u00d9"+
		"\2\2\u0634\u064b\5\u00be`\f\u0635\u0636\f\n\2\2\u0636\u0637\7\u00da\2"+
		"\2\u0637\u064b\5\u00be`\13\u0638\u0639\f\t\2\2\u0639\u063a\7\u00db\2\2"+
		"\u063a\u064b\5\u00be`\n\u063b\u063c\f\b\2\2\u063c\u063d\7\33\2\2\u063d"+
		"\u064b\5\u00be`\t\u063e\u063f\f\7\2\2\u063f\u0640\7\u00d6\2\2\u0640\u064b"+
		"\5\u00be`\b\u0641\u0642\f\6\2\2\u0642\u0643\7\u00d5\2\2\u0643\u064b\5"+
		"\u00be`\7\u0644\u0645\f\5\2\2\u0645\u0646\7\u00d8\2\2\u0646\u064b\5\u00c6"+
		"d\2\u0647\u0648\f\4\2\2\u0648\u0649\7\u00d9\2\2\u0649\u064b\5\u00c6d\2"+
		"\u064a\u0623\3\2\2\2\u064a\u0626\3\2\2\2\u064a\u0629\3\2\2\2\u064a\u062c"+
		"\3\2\2\2\u064a\u062f\3\2\2\2\u064a\u0632\3\2\2\2\u064a\u0635\3\2\2\2\u064a"+
		"\u0638\3\2\2\2\u064a\u063b\3\2\2\2\u064a\u063e\3\2\2\2\u064a\u0641\3\2"+
		"\2\2\u064a\u0644\3\2\2\2\u064a\u0647\3\2\2\2\u064b\u064e\3\2\2\2\u064c"+
		"\u064a\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u00bf\3\2\2\2\u064e\u064c\3\2"+
		"\2\2\u064f\u0650\ba\1\2\u0650\u0668\5\u00c2b\2\u0651\u0668\5\u00ceh\2"+
		"\u0652\u0668\5\u00a2R\2\u0653\u0668\5\u00ccg\2\u0654\u0655\7\u00d8\2\2"+
		"\u0655\u0668\5\u00c0a\16\u0656\u0657\7\u00d9\2\2\u0657\u0668\5\u00c0a"+
		"\r\u0658\u0659\7\u00d0\2\2\u0659\u0668\5\u00c0a\f\u065a\u065b\7\u00cf"+
		"\2\2\u065b\u0668\5\u00c0a\13\u065c\u065d\7\n\2\2\u065d\u0668\5\u00c0a"+
		"\n\u065e\u0668\5\u00b2Z\2\u065f\u0660\7$\2\2\u0660\u0668\5\u00b2Z\2\u0661"+
		"\u0668\5\u00d6l\2\u0662\u0663\7\20\2\2\u0663\u0668\5\u00d6l\2\u0664\u0668"+
		"\5\u00c8e\2\u0665\u0668\5\u00c6d\2\u0666\u0668\5\u00caf\2\u0667\u064f"+
		"\3\2\2\2\u0667\u0651\3\2\2\2\u0667\u0652\3\2\2\2\u0667\u0653\3\2\2\2\u0667"+
		"\u0654\3\2\2\2\u0667\u0656\3\2\2\2\u0667\u0658\3\2\2\2\u0667\u065a\3\2"+
		"\2\2\u0667\u065c\3\2\2\2\u0667\u065e\3\2\2\2\u0667\u065f\3\2\2\2\u0667"+
		"\u0661\3\2\2\2\u0667\u0662\3\2\2\2\u0667\u0664\3\2\2\2\u0667\u0665\3\2"+
		"\2\2\u0667\u0666\3\2\2\2\u0668\u0670\3\2\2\2\u0669\u066a\f\17\2\2\u066a"+
		"\u066b\7\u00cd\2\2\u066b\u066f\5\u00c0a\20\u066c\u066d\f\21\2\2\u066d"+
		"\u066f\5\u00d8m\2\u066e\u0669\3\2\2\2\u066e\u066c\3\2\2\2\u066f\u0672"+
		"\3\2\2\2\u0670\u066e\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u00c1\3\2\2\2\u0672"+
		"\u0670\3\2\2\2\u0673\u0674\7\u00f5\2\2\u0674\u0676\7\u00e8\2\2\u0675\u0677"+
		"\5\u00c4c\2\u0676\u0675\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u067a\3\2\2"+
		"\2\u0678\u067b\5\u00b0Y\2\u0679\u067b\7\u00da\2\2\u067a\u0678\3\2\2\2"+
		"\u067a\u0679\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067d"+
		"\7\u00e9\2\2\u067d\u00c3\3\2\2\2\u067e\u067f\7\16\2\2\u067f\u00c5\3\2"+
		"\2\2\u0680\u0681\5\u011a\u008e\2\u0681\u00c7\3\2\2\2\u0682\u0683\5\u011a"+
		"\u008e\2\u0683\u00c9\3\2\2\2\u0684\u0689\5\u00eav\2\u0685\u0689\5\u00e4"+
		"s\2\u0686\u0689\5\u00e6t\2\u0687\u0689\5\u00e8u\2\u0688\u0684\3\2\2\2"+
		"\u0688\u0685\3\2\2\2\u0688\u0686\3\2\2\2\u0688\u0687\3\2\2\2\u0689\u00cb"+
		"\3\2\2\2\u068a\u068b\5\u011a\u008e\2\u068b\u00cd\3\2\2\2\u068c\u06a6\5"+
		"\u00d0i\2\u068d\u06a6\5\u00d2j\2\u068e\u06a6\7)\2\2\u068f\u06a6\7\21\2"+
		"\2\u0690\u06a6\7\35\2\2\u0691\u0692\7\u00ea\2\2\u0692\u0693\7\u00f5\2"+
		"\2\u0693\u0694\7\u00f6\2\2\u0694\u06a6\7\u00eb\2\2\u0695\u06a6\7\u00f8"+
		"\2\2\u0696\u06a6\5\u00d4k\2\u0697\u0698\7\u00f5\2\2\u0698\u069a\7\u00f6"+
		"\2\2\u0699\u069b\5\u00d8m\2\u069a\u0699\3\2\2\2\u069a\u069b\3\2\2\2\u069b"+
		"\u06a6\3\2\2\2\u069c\u069d\t\25\2\2\u069d\u06a6\7\u00f6\2\2\u069e\u06a0"+
		"\7\u00f5\2\2\u069f\u069e\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a1\3\2\2"+
		"\2\u06a1\u06a3\7\u00f9\2\2\u06a2\u06a4\5\u00d8m\2\u06a3\u06a2\3\2\2\2"+
		"\u06a3\u06a4\3\2\2\2\u06a4\u06a6\3\2\2\2\u06a5\u068c\3\2\2\2\u06a5\u068d"+
		"\3\2\2\2\u06a5\u068e\3\2\2\2\u06a5\u068f\3\2\2\2\u06a5\u0690\3\2\2\2\u06a5"+
		"\u0691\3\2\2\2\u06a5\u0695\3\2\2\2\u06a5\u0696\3\2\2\2\u06a5\u0697\3\2"+
		"\2\2\u06a5\u069c\3\2\2\2\u06a5\u069f\3\2\2\2\u06a6\u00cf\3\2\2\2\u06a7"+
		"\u06a8\7\u00f2\2\2\u06a8\u00d1\3\2\2\2\u06a9\u06aa\7\u00f7\2\2\u06aa\u00d3"+
		"\3\2\2\2\u06ab\u06ac\7\u00f6\2\2\u06ac\u00d5\3\2\2\2\u06ad\u06ae\5\u011a"+
		"\u008e\2\u06ae\u00d7\3\2\2\2\u06af\u06b0\5\u011a\u008e\2\u06b0\u00d9\3"+
		"\2\2\2\u06b1\u06b2\7 \2\2\u06b2\u06b3\7\13\2\2\u06b3\u06b8\5\u00f0y\2"+
		"\u06b4\u06b5\7\u00ee\2\2\u06b5\u06b7\5\u00f0y\2\u06b6\u06b4\3\2\2\2\u06b7"+
		"\u06ba\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u00db\3\2"+
		"\2\2\u06ba\u06b8\3\2\2\2\u06bb\u06bf\5\u00a2R\2\u06bc\u06bf\5\u00d2j\2"+
		"\u06bd\u06bf\5\u00b4[\2\u06be\u06bb\3\2\2\2\u06be\u06bc\3\2\2\2\u06be"+
		"\u06bd\3\2\2\2\u06bf\u06c1\3\2\2\2\u06c0\u06c2\t\r\2\2\u06c1\u06c0\3\2"+
		"\2\2\u06c1\u06c2\3\2\2\2\u06c2\u00dd\3\2\2\2\u06c3\u06c4\7\u00da\2\2\u06c4"+
		"\u00df\3\2\2\2\u06c5\u06d1\5\u00e2r\2\u06c6\u06d2\5\u00aaV\2\u06c7\u06c8"+
		"\7\u00e8\2\2\u06c8\u06c9\7\u0092\2\2\u06c9\u06d2\7\u00e9\2\2\u06ca\u06cc"+
		"\7\u00e8\2\2\u06cb\u06cd\t\26\2\2\u06cc\u06cb\3\2\2\2\u06cc\u06cd\3\2"+
		"\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06cf\5\u0116\u008c\2\u06cf\u06d0\7\u00e9"+
		"\2\2\u06d0\u06d2\3\2\2\2\u06d1\u06c6\3\2\2\2\u06d1\u06c7\3\2\2\2\u06d1"+
		"\u06ca\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u00e1\3\2\2\2\u06d3\u06d4\7\u00f5"+
		"\2\2\u06d4\u00e3\3\2\2\2\u06d5\u06d9\7\u00f5\2\2\u06d6\u06d7\7-\2\2\u06d7"+
		"\u06d8\7\'\2\2\u06d8\u06da\7\u00cb\2\2\u06d9\u06d6\3\2\2\2\u06d9\u06da"+
		"\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u06dc\7\u00f6\2\2\u06dc\u00e5\3\2\2"+
		"\2\u06dd\u06de\7a\2\2\u06de\u06df\7\u00e8\2\2\u06df\u06e0\5\u00b4[\2\u06e0"+
		"\u06e1\7\62\2\2\u06e1\u06e5\5\u00e0q\2\u06e2\u06e3\7\u00e8\2\2\u06e3\u06e4"+
		"\7\u00f7\2\2\u06e4\u06e6\7\u00e9\2\2\u06e5\u06e2\3\2\2\2\u06e5\u06e6\3"+
		"\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e8\7\u00e9\2\2\u06e8\u00e7\3\2\2\2"+
		"\u06e9\u06ea\7j\2\2\u06ea\u06ee\5\u00e0q\2\u06eb\u06ec\7\u00e8\2\2\u06ec"+
		"\u06ed\7\u00f7\2\2\u06ed\u06ef\7\u00e9\2\2\u06ee\u06eb\3\2\2\2\u06ee\u06ef"+
		"\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f1\7\u00ee\2\2\u06f1\u06f4\5\u00b4"+
		"[\2\u06f2\u06f3\7\u00ee\2\2\u06f3\u06f5\7\u00f7\2\2\u06f4\u06f2\3\2\2"+
		"\2\u06f4\u06f5\3\2\2\2\u06f5\u00e9\3\2\2\2\u06f6\u06f7\5\u00c2b\2\u06f7"+
		"\u06f8\5\u00ecw\2\u06f8\u00eb\3\2\2\2\u06f9\u06fa\7\u00a2\2\2\u06fa\u06fc"+
		"\7\u00e8\2\2\u06fb\u06fd\5\u00eex\2\u06fc\u06fb\3\2\2\2\u06fc\u06fd\3"+
		"\2\2\2\u06fd\u06ff\3\2\2\2\u06fe\u0700\5\u00dan\2\u06ff\u06fe\3\2\2\2"+
		"\u06ff\u0700\3\2\2\2\u0700\u0702\3\2\2\2\u0701\u0703\5\u00f2z\2\u0702"+
		"\u0701\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u0705\7\u00e9"+
		"\2\2\u0705\u00ed\3\2\2\2\u0706\u0707\7!\2\2\u0707\u0708\7\13\2\2\u0708"+
		"\u070d\5\u00b4[\2\u0709\u070a\7\u00ee\2\2\u070a\u070c\5\u00b4[\2\u070b"+
		"\u0709\3\2\2\2\u070c\u070f\3\2\2\2\u070d\u070b\3\2\2\2\u070d\u070e\3\2"+
		"\2\2\u070e\u00ef\3\2\2\2\u070f\u070d\3\2\2\2\u0710\u0713\5\u00b4[\2\u0711"+
		"\u0712\7c\2\2\u0712\u0714\5\u00a4S\2\u0713\u0711\3\2\2\2\u0713\u0714\3"+
		"\2\2\2\u0714\u0716\3\2\2\2\u0715\u0717\t\r\2\2\u0716\u0715\3\2\2\2\u0716"+
		"\u0717\3\2\2\2\u0717\u00f1\3\2\2\2\u0718\u0719\t\27\2\2\u0719\u071a\5"+
		"\u00f4{\2\u071a\u00f3\3\2\2\2\u071b\u071e\5\u00fa~\2\u071c\u071e\5\u00f6"+
		"|\2\u071d\u071b\3\2\2\2\u071d\u071c\3\2\2\2\u071e\u00f5\3\2\2\2\u071f"+
		"\u0720\7\t\2\2\u0720\u0721\5\u00f8}\2\u0721\u0722\7\6\2\2\u0722\u0723"+
		"\5\u00f8}\2\u0723\u00f7\3\2\2\2\u0724\u0727\5\u00fa~\2\u0725\u0727\5\u00fc"+
		"\177\2\u0726\u0724\3\2\2\2\u0726\u0725\3\2\2\2\u0727\u00f9\3\2\2\2\u0728"+
		"\u0729\7\u00c4\2\2\u0729\u072f\7\u00a9\2\2\u072a\u072b\7\u00f7\2\2\u072b"+
		"\u072f\7\u00a9\2\2\u072c\u072d\79\2\2\u072d\u072f\7$\2\2\u072e\u0728\3"+
		"\2\2\2\u072e\u072a\3\2\2\2\u072e\u072c\3\2\2\2\u072f\u00fb\3\2\2\2\u0730"+
		"\u0731\7\u00c4\2\2\u0731\u0737\7\u0083\2\2\u0732\u0733\7\u00f7\2\2\u0733"+
		"\u0737\7\u0083\2\2\u0734\u0735\79\2\2\u0735\u0737\7$\2\2\u0736\u0730\3"+
		"\2\2\2\u0736\u0732\3\2\2\2\u0736\u0734\3\2\2\2\u0737\u00fd\3\2\2\2\u0738"+
		"\u0739\7\u0081\2\2\u0739\u073a\7\u00e1\2\2\u073a\u0746\7\u00f7\2\2\u073b"+
		"\u0746\5\u0104\u0083\2\u073c\u073d\t\30\2\2\u073d\u0746\5\u0102\u0082"+
		"\2\u073e\u073f\7\u0093\2\2\u073f\u0740\7\u00e1\2\2\u0740\u0746\7\u00f7"+
		"\2\2\u0741\u0743\5\u0100\u0081\2\u0742\u0744\5\u010a\u0086\2\u0743\u0742"+
		"\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0746\3\2\2\2\u0745\u0738\3\2\2\2\u0745"+
		"\u073b\3\2\2\2\u0745\u073c\3\2\2\2\u0745\u073e\3\2\2\2\u0745\u0741\3\2"+
		"\2\2\u0746\u00ff\3\2\2\2\u0747\u0748\7m\2\2\u0748\u0749\7\u00e1\2\2\u0749"+
		"\u074a\t\31\2\2\u074a\u0101\3\2\2\2\u074b\u074c\7\u00e1\2\2\u074c\u074e"+
		"\7\u00f7\2\2\u074d\u074f\7\u0097\2\2\u074e\u074d\3\2\2\2\u074e\u074f\3"+
		"\2\2\2\u074f\u0103\3\2\2\2\u0750\u0751\5\u0106\u0084\2\u0751\u0752\5\u0108"+
		"\u0085\2\u0752\u0105\3\2\2\2\u0753\u0754\t\32\2\2\u0754\u0107\3\2\2\2"+
		"\u0755\u0756\7\u00e1\2\2\u0756\u0757\t\4\2\2\u0757\u0109\3\2\2\2\u0758"+
		"\u0759\7G\2\2\u0759\u075a\7\u00a5\2\2\u075a\u075b\7\u00e8\2\2\u075b\u075c"+
		"\5\u010c\u0087\2\u075c\u075d\7\u00e9\2\2\u075d\u010b\3\2\2\2\u075e\u0763"+
		"\5\u010e\u0088\2\u075f\u0760\7\u00ee\2\2\u0760\u0762\5\u010e\u0088\2\u0761"+
		"\u075f\3\2\2\2\u0762\u0765\3\2\2\2\u0763\u0761\3\2\2\2\u0763\u0764\3\2"+
		"\2\2\u0764\u010d\3\2\2\2\u0765\u0763\3\2\2\2\u0766\u0769\7\u00f7\2\2\u0767"+
		"\u0769\5\u0110\u0089\2\u0768\u0766\3\2\2\2\u0768\u0767\3\2\2\2\u0769\u010f"+
		"\3\2\2\2\u076a\u076b\7\u00f7\2\2\u076b\u076c\7Q\2\2\u076c\u076d\7\u00f7"+
		"\2\2\u076d\u0111\3\2\2\2\u076e\u076f\7\u00c7\2\2\u076f\u0770\7\u00e8\2"+
		"\2\u0770\u0771\7\u0094\2\2\u0771\u0772\7\u00e1\2\2\u0772\u0774\7\u00f7"+
		"\2\2\u0773\u0775\7\u0097\2\2\u0774\u0773\3\2\2\2\u0774\u0775\3\2\2\2\u0775"+
		"\u0776\3\2\2\2\u0776\u0777\7\u00ee\2\2\u0777\u0778\7W\2\2\u0778\u0779"+
		"\7\u00e1\2\2\u0779\u077a\t\33\2\2\u077a\u077b\7\u00e9\2\2\u077b\u0113"+
		"\3\2\2\2\u077c\u0781\7G\2\2\u077d\u077e\7\u00e8\2\2\u077e\u077f\5\u0112"+
		"\u008a\2\u077f\u0780\7\u00e9\2\2\u0780\u0782\3\2\2\2\u0781\u077d\3\2\2"+
		"\2\u0781\u0782\3\2\2\2\u0782\u0115\3\2\2\2\u0783\u0784\7\u00f5\2\2\u0784"+
		"\u0117\3\2\2\2\u0785\u078a\5\u0116\u008c\2\u0786\u0787\7\u00ee\2\2\u0787"+
		"\u0789\5\u0116\u008c\2\u0788\u0786\3\2\2\2\u0789\u078c\3\2\2\2\u078a\u0788"+
		"\3\2\2\2\u078a\u078b\3\2\2\2\u078b\u0119\3\2\2\2\u078c\u078a\3\2\2\2\u078d"+
		"\u078e\7\3\2\2\u078e\u011b\3\2\2\2\u078f\u0790\7%\2\2\u0790\u0791\7R\2"+
		"\2\u0791\u011d\3\2\2\2\u0792\u0793\7\u0089\2\2\u0793\u0794\7\u00f3\2\2"+
		"\u0794\u0795\7\u00f3\2\2\u0795\u0796\7\u00c2\2\2\u0796\u0797\7\u00e3\2"+
		"\2\u0797\u0798\7\u00f7\2\2\u0798\u0799\7\66\2\2\u0799\u079b\7\u00c1\2"+
		"\2\u079a\u0792\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u079d"+
		"\7%\2\2\u079d\u079e\7\u008b\2\2\u079e\u079f\5\u0120\u0091\2\u079f\u011f"+
		"\3\2\2\2\u07a0\u07a1\t\4\2\2\u07a1\u0121\3\2\2\2\u07a2\u07a3\7^\2\2\u07a3"+
		"\u07a4\t\34\2\2\u07a4\u0123\3\2\2\2\u07a5\u07a6\7\66\2\2\u07a6\u0125\3"+
		"\2\2\2\u07a7\u07a8\7M\2\2\u07a8\u0127\3\2\2\2\u07a9\u07aa\7\u00b4\2\2"+
		"\u07aa\u07ab\t\34\2\2\u07ab\u0129\3\2\2\2\u07ac\u07af\7D\2\2\u07ad\u07b0"+
		"\5\u0130\u0099\2\u07ae\u07b0\5\u0136\u009c\2\u07af\u07ad\3\2\2\2\u07af"+
		"\u07ae\3\2\2\2\u07b0\u012b\3\2\2\2\u07b1\u07b9\7K\2\2\u07b2\u07b3\7D\2"+
		"\2\u07b3\u07b4\7H\2\2\u07b4\u07b6\7@\2\2\u07b5\u07b2\3\2\2\2\u07b5\u07b6"+
		"\3\2\2\2\u07b6\u07b7\3\2\2\2\u07b7\u07ba\5\u0130\u0099\2\u07b8\u07ba\5"+
		"\u0136\u009c\2\u07b9\u07b5\3\2\2\2\u07b9\u07b8\3\2\2\2\u07ba\u012d\3\2"+
		"\2\2\u07bb\u07bc\7p\2\2\u07bc\u07bd\5\u0130\u0099\2\u07bd\u012f\3\2\2"+
		"\2\u07be\u07c1\5\u0132\u009a\2\u07bf\u07c0\7G\2\2\u07c0\u07c2\5\u0134"+
		"\u009b\2\u07c1\u07bf\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u0131\3\2\2\2\u07c3"+
		"\u07c5\7\5\2\2\u07c4\u07c6\7I\2\2\u07c5\u07c4\3\2\2\2\u07c5\u07c6\3\2"+
		"\2\2\u07c6\u07d6\3\2\2\2\u07c7\u07c9\5\u013c\u009f\2\u07c8\u07ca\5\u00ae"+
		"X\2\u07c9\u07c8\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07d2\3\2\2\2\u07cb"+
		"\u07cc\7\u00ee\2\2\u07cc\u07ce\5\u013c\u009f\2\u07cd\u07cf\5\u00aeX\2"+
		"\u07ce\u07cd\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u07d1\3\2\2\2\u07d0\u07cb"+
		"\3\2\2\2\u07d1\u07d4\3\2\2\2\u07d2\u07d0\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3"+
		"\u07d6\3\2\2\2\u07d4\u07d2\3\2\2\2\u07d5\u07c3\3\2\2\2\u07d5\u07c7\3\2"+
		"\2\2\u07d6\u0133\3\2\2\2\u07d7\u07d9\5\u013e\u00a0\2\u07d8\u07d7\3\2\2"+
		"\2\u07d8\u07d9\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u07db\5\u00a0Q\2\u07db"+
		"\u0135\3\2\2\2\u07dc\u07df\5\u0138\u009d\2\u07dd\u07de\7G\2\2\u07de\u07e0"+
		"\5\u013a\u009e\2\u07df\u07dd\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u0137\3"+
		"\2\2\2\u07e1\u07e6\5\u013c\u009f\2\u07e2\u07e3\7\u00ee\2\2\u07e3\u07e5"+
		"\5\u013c\u009f\2\u07e4\u07e2\3\2\2\2\u07e5\u07e8\3\2\2\2\u07e6\u07e4\3"+
		"\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u0139\3\2\2\2\u07e8\u07e6\3\2\2\2\u07e9"+
		"\u07eb\5\u0140\u00a1\2\u07ea\u07e9\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u07ec"+
		"\3\2\2\2\u07ec\u07ed\5\u00a0Q\2\u07ed\u013b\3\2\2\2\u07ee\u07f0\7\u00f5"+
		"\2\2\u07ef\u07ee\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f2\3\2\2\2\u07f1"+
		"\u07ef\3\2\2\2\u07f2\u013d\3\2\2\2\u07f3\u07f4\7\u00f5\2\2\u07f4\u07f5"+
		"\7\u00d7\2\2\u07f5\u07f6\7\u00d7\2\2\u07f6\u013f\3\2\2\2\u07f7\u07f8\t"+
		"\35\2\2\u07f8\u07f9\7\u00d7\2\2\u07f9\u07fa\7\u00d7\2\2\u07fa\u0141\3"+
		"\2\2\2\u07fb\u07fc\78\2\2\u07fc\u07fd\7U\2\2\u07fd\u0143\3\2\2\2\u07fe"+
		"\u07ff\7>\2\2\u07ff\u0800\7U\2\2\u0800\u0145\3\2\2\2\u0801\u0802\7\60"+
		"\2\2\u0802\u0803\7U\2\2\u0803\u0147\3\2\2\2\u0804\u0805\78\2\2\u0805\u0806"+
		"\7L\2\2\u0806\u0149\3\2\2\2\u0807\u0808\7>\2\2\u0808\u0809\7L\2\2\u0809"+
		"\u014b\3\2\2\2\u080a\u080b\7\60\2\2\u080b\u080c\7L\2\2\u080c\u014d\3\2"+
		"\2\2\u080d\u080e\78\2\2\u080e\u080f\7\u0090\2\2\u080f\u014f\3\2\2\2\u0810"+
		"\u0811\7>\2\2\u0811\u0812\7\u0090\2\2\u0812\u0151\3\2\2\2\u0813\u0814"+
		"\7\60\2\2\u0814\u0815\7\u0090\2\2\u0815\u0153\3\2\2\2\u00e3\u016d\u0170"+
		"\u0174\u0177\u0183\u018c\u019f\u01a9\u01b0\u01b9\u01c1\u01c6\u01d1\u01d3"+
		"\u01d8\u01da\u01e1\u01e3\u01ec\u01f1\u01f8\u0206\u020c\u0211\u021b\u021e"+
		"\u0220\u0224\u022d\u0232\u0235\u023b\u023d\u0248\u0251\u0267\u026b\u0276"+
		"\u027b\u0283\u0288\u029b\u029f\u02a1\u02ac\u02b3\u02ba\u02c4\u02ce\u02d1"+
		"\u02dc\u02e4\u02e7\u02ea\u02f9\u0303\u030e\u0311\u032a\u032e\u0332\u0337"+
		"\u033b\u033f\u0342\u0345\u0348\u034c\u0356\u035f\u0366\u036a\u0381\u0386"+
		"\u038b\u039d\u03a6\u03af\u03b4\u03b7\u03bd\u03bf\u03c4\u03cb\u03d0\u03d5"+
		"\u03d9\u03dc\u03e0\u03e3\u03e8\u03ec\u03f5\u03fe\u0400\u0403\u0415\u041a"+
		"\u041d\u0425\u042d\u0438\u043a\u0442\u0446\u0453\u045a\u0461\u046d\u0470"+
		"\u0474\u0478\u0481\u0484\u0488\u048f\u0494\u049d\u04b1\u04b3\u04b8\u04bf"+
		"\u04c5\u04cc\u04d0\u04da\u04dd\u04e7\u04ea\u04ef\u04f5\u04fc\u0502\u050b"+
		"\u0511\u0518\u051b\u0520\u0523\u052a\u052c\u052f\u0534\u053d\u053f\u0544"+
		"\u054d\u054f\u0552\u056b\u056f\u0571\u0583\u0585\u058a\u0594\u059e\u05b0"+
		"\u05c1\u05c3\u05ce\u05dd\u05df\u05e6\u05ed\u05f6\u05fd\u060b\u0613\u0618"+
		"\u061e\u064a\u064c\u0667\u066e\u0670\u0676\u067a\u0688\u069a\u069f\u06a3"+
		"\u06a5\u06b8\u06be\u06c1\u06cc\u06d1\u06d9\u06e5\u06ee\u06f4\u06fc\u06ff"+
		"\u0702\u070d\u0713\u0716\u071d\u0726\u072e\u0736\u0743\u0745\u074e\u0763"+
		"\u0768\u0774\u0781\u078a\u079a\u07af\u07b5\u07b9\u07c1\u07c5\u07c9\u07ce"+
		"\u07d2\u07d5\u07d8\u07df\u07e6\u07ea\u07f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}