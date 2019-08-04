// Generated from org\apache\shardingsphere\core\parse\antlr\autogen\PostgreSQLStatement.g4 by ANTLR 4.7.1
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
public class PostgreSQLStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, ALL=3, AND=4, ANY=5, ASC=6, BETWEEN=7, BINARY=8, BY=9, DATE=10, 
		DESC=11, DISTINCT=12, ESCAPE=13, EXISTS=14, FALSE=15, FROM=16, GROUP=17, 
		HAVING=18, IN=19, IS=20, KEY=21, LIKE=22, LIMIT=23, MOD=24, NOT=25, NULL=26, 
		OFFSET=27, OR=28, ORDER=29, PARTITION=30, PRIMARY=31, REGEXP=32, ROW=33, 
		SET=34, SOUNDS=35, TIME=36, TIMESTAMP=37, TRUE=38, UNION=39, UNKNOWN=40, 
		WHERE=41, WITH=42, XOR=43, ADD=44, ALTER=45, ALWAYS=46, AS=47, CASCADE=48, 
		CHECK=49, COLUMN=50, COMMIT=51, CONSTRAINT=52, CREATE=53, CURRENT=54, 
		DAY=55, DEFAULT=56, DELETE=57, DISABLE=58, DROP=59, ENABLE=60, FOR=61, 
		FOREIGN=62, FUNCTION=63, GENERATED=64, GRANT=65, INDEX=66, ISOLATION=67, 
		LEVEL=68, NO=69, ON=70, OPTION=71, PRIVILEGES=72, READ=73, REFERENCES=74, 
		REVOKE=75, ROLE=76, ROLLBACK=77, ROWS=78, START=79, TABLE=80, TO=81, TRANSACTION=82, 
		TRUNCATE=83, UNIQUE=84, USER=85, YEAR=86, ACTION=87, ARRAY=88, BEGIN=89, 
		BRIN=90, BTREE=91, CACHE=92, CAST=93, CHARACTERISTICS=94, CLUSTER=95, 
		COLLATE=96, COMMENTS=97, CONCURRENTLY=98, CONNECT=99, CONSTRAINTS=100, 
		CURRENT_TIMESTAMP=101, CURRENT_USER=102, CYCLE=103, DATA=104, DATABASE=105, 
		DEFAULTS=106, DEFERRABLE=107, DEFERRED=108, DEPENDS=109, DOMAIN=110, EXCLUDING=111, 
		EXECUTE=112, EXTENDED=113, EXTENSION=114, EXTERNAL=115, EXTRACT=116, FILTER=117, 
		FIRST=118, FOLLOWING=119, FORCE=120, FULL=121, GIN=122, GIST=123, GLOBAL=124, 
		HASH=125, HOUR=126, IDENTITY=127, IF=128, IMMEDIATE=129, INCLUDING=130, 
		INCREMENT=131, INDEXES=132, INHERIT=133, INHERITS=134, INITIALLY=135, 
		INSERT=136, LANGUAGE=137, LARGE=138, LAST=139, LOCAL=140, LOGGED=141, 
		MAIN=142, MATCH=143, MAXVALUE=144, MINUTE=145, MINVALUE=146, MONTH=147, 
		NOTHING=148, NULLS=149, OBJECT=150, OF=151, OIDS=152, ONLY=153, OVER=154, 
		OWNED=155, OWNER=156, PARTIAL=157, PLAIN=158, PRECEDING=159, PROCEDURE=160, 
		RANGE=161, RENAME=162, REPLICA=163, RESET=164, RESTART=165, RESTRICT=166, 
		ROUTINE=167, RULE=168, SAVEPOINT=169, SCHEMA=170, SECOND=171, SECURITY=172, 
		SELECT=173, SEQUENCE=174, SESSION=175, SESSION_USER=176, SHOW=177, SIMPLE=178, 
		SPGIST=179, STATISTICS=180, STORAGE=181, TABLESPACE=182, TEMP=183, TEMPORARY=184, 
		TRIGGER=185, TYPE=186, UNBOUNDED=187, UNLOGGED=188, UPDATE=189, USAGE=190, 
		USING=191, VALID=192, VALIDATE=193, WITHIN=194, WITHOUT=195, ZONE=196, 
		FOR_GENERATOR=197, AND_=198, OR_=199, NOT_=200, TILDE_=201, VERTICAL_BAR_=202, 
		AMPERSAND_=203, SIGNED_LEFT_SHIFT_=204, SIGNED_RIGHT_SHIFT_=205, CARET_=206, 
		MOD_=207, COLON_=208, PLUS_=209, MINUS_=210, ASTERISK_=211, SLASH_=212, 
		BACKSLASH_=213, DOT_=214, DOT_ASTERISK_=215, SAFE_EQ_=216, DEQ_=217, EQ_=218, 
		NEQ_=219, GT_=220, GTE_=221, LT_=222, LTE_=223, POUND_=224, LP_=225, RP_=226, 
		LBE_=227, RBE_=228, LBT_=229, RBT_=230, COMMA_=231, DQ_=232, SQ_=233, 
		BQ_=234, QUESTION_=235, AT_=236, SEMI_=237, IDENTIFIER_=238, STRING_=239, 
		NUMBER_=240, HEX_DIGIT_=241, BIT_NUM_=242;
	public static final int
		RULE_execute = 0, RULE_createIndex = 1, RULE_dropIndex = 2, RULE_alterIndex = 3, 
		RULE_createTable = 4, RULE_alterTable = 5, RULE_truncateTable = 6, RULE_dropTable = 7, 
		RULE_alterIndexName = 8, RULE_renameIndexSpecification = 9, RULE_alterIndexDependsOnExtension = 10, 
		RULE_alterIndexSetTableSpace = 11, RULE_tableNameParts = 12, RULE_tableNamePart = 13, 
		RULE_createTableHeader = 14, RULE_createDefinitions = 15, RULE_createDefinition = 16, 
		RULE_likeOption = 17, RULE_inheritClause = 18, RULE_alterTableNameWithAsterisk = 19, 
		RULE_alterTableActions = 20, RULE_alterTableAction = 21, RULE_tableConstraintUsingIndex = 22, 
		RULE_addColumnSpecification = 23, RULE_dropColumnSpecification = 24, RULE_modifyColumnSpecification = 25, 
		RULE_alterColumn = 26, RULE_alterColumnSetOption = 27, RULE_attributeOptions = 28, 
		RULE_attributeOption = 29, RULE_addConstraintSpecification = 30, RULE_renameColumnSpecification = 31, 
		RULE_renameConstraint = 32, RULE_storageParameterWithValue = 33, RULE_storageParameter = 34, 
		RULE_alterTableNameExists = 35, RULE_renameTableSpecification = 36, RULE_usingIndexType = 37, 
		RULE_tableConstraint = 38, RULE_tableConstraintOption = 39, RULE_excludeElement = 40, 
		RULE_schemaName = 41, RULE_tableName = 42, RULE_columnName = 43, RULE_collationName = 44, 
		RULE_indexName = 45, RULE_alias = 46, RULE_dataTypeLength = 47, RULE_primaryKey = 48, 
		RULE_columnNames = 49, RULE_exprs = 50, RULE_exprList = 51, RULE_expr = 52, 
		RULE_exprRecursive = 53, RULE_booleanPrimary = 54, RULE_comparisonOperator = 55, 
		RULE_predicate = 56, RULE_bitExpr = 57, RULE_simpleExpr = 58, RULE_functionCall = 59, 
		RULE_distinct = 60, RULE_intervalExpr = 61, RULE_caseExpress = 62, RULE_privateExprOfDb = 63, 
		RULE_variable = 64, RULE_literal = 65, RULE_question = 66, RULE_number = 67, 
		RULE_string = 68, RULE_subquery = 69, RULE_collateClause = 70, RULE_orderByClause = 71, 
		RULE_orderByItem = 72, RULE_asterisk = 73, RULE_columnDefinition = 74, 
		RULE_columnConstraint = 75, RULE_constraintClause = 76, RULE_columnConstraintOption = 77, 
		RULE_checkOption = 78, RULE_defaultExpr = 79, RULE_sequenceOptions = 80, 
		RULE_sequenceOption = 81, RULE_indexParameters = 82, RULE_action = 83, 
		RULE_foreignKeyOnAction = 84, RULE_foreignKeyOn = 85, RULE_constraintOptionalParam = 86, 
		RULE_dataType = 87, RULE_dataTypeName_ = 88, RULE_intervalFields = 89, 
		RULE_intervalField = 90, RULE_pgExpr = 91, RULE_aggregateExpression = 92, 
		RULE_filterClause = 93, RULE_asteriskWithParen = 94, RULE_windowFunction = 95, 
		RULE_windowFunctionWithClause = 96, RULE_windowDefinition = 97, RULE_operator = 98, 
		RULE_frameClause = 99, RULE_frameStart = 100, RULE_frameEnd = 101, RULE_castExpr = 102, 
		RULE_castExprWithCOLON_ = 103, RULE_collateExpr = 104, RULE_arrayConstructorWithCast = 105, 
		RULE_arrayConstructor = 106, RULE_extractFromFunction = 107, RULE_ignoredIdentifier_ = 108, 
		RULE_ignoredIdentifiers_ = 109, RULE_matchNone = 110, RULE_setTransaction = 111, 
		RULE_beginTransaction = 112, RULE_commit = 113, RULE_rollback = 114, RULE_savepoint = 115, 
		RULE_grant = 116, RULE_revoke = 117, RULE_privileges_ = 118, RULE_privilegeType_ = 119, 
		RULE_onObjectClause_ = 120, RULE_createUser = 121, RULE_dropUser = 122, 
		RULE_alterUser = 123, RULE_createRole = 124, RULE_dropRole = 125, RULE_alterRole = 126, 
		RULE_show = 127, RULE_setParam = 128, RULE_scope = 129, RULE_setClause = 130, 
		RULE_timeZoneType = 131, RULE_resetParam = 132;
	public static final String[] ruleNames = {
		"execute", "createIndex", "dropIndex", "alterIndex", "createTable", "alterTable", 
		"truncateTable", "dropTable", "alterIndexName", "renameIndexSpecification", 
		"alterIndexDependsOnExtension", "alterIndexSetTableSpace", "tableNameParts", 
		"tableNamePart", "createTableHeader", "createDefinitions", "createDefinition", 
		"likeOption", "inheritClause", "alterTableNameWithAsterisk", "alterTableActions", 
		"alterTableAction", "tableConstraintUsingIndex", "addColumnSpecification", 
		"dropColumnSpecification", "modifyColumnSpecification", "alterColumn", 
		"alterColumnSetOption", "attributeOptions", "attributeOption", "addConstraintSpecification", 
		"renameColumnSpecification", "renameConstraint", "storageParameterWithValue", 
		"storageParameter", "alterTableNameExists", "renameTableSpecification", 
		"usingIndexType", "tableConstraint", "tableConstraintOption", "excludeElement", 
		"schemaName", "tableName", "columnName", "collationName", "indexName", 
		"alias", "dataTypeLength", "primaryKey", "columnNames", "exprs", "exprList", 
		"expr", "exprRecursive", "booleanPrimary", "comparisonOperator", "predicate", 
		"bitExpr", "simpleExpr", "functionCall", "distinct", "intervalExpr", "caseExpress", 
		"privateExprOfDb", "variable", "literal", "question", "number", "string", 
		"subquery", "collateClause", "orderByClause", "orderByItem", "asterisk", 
		"columnDefinition", "columnConstraint", "constraintClause", "columnConstraintOption", 
		"checkOption", "defaultExpr", "sequenceOptions", "sequenceOption", "indexParameters", 
		"action", "foreignKeyOnAction", "foreignKeyOn", "constraintOptionalParam", 
		"dataType", "dataTypeName_", "intervalFields", "intervalField", "pgExpr", 
		"aggregateExpression", "filterClause", "asteriskWithParen", "windowFunction", 
		"windowFunctionWithClause", "windowDefinition", "operator", "frameClause", 
		"frameStart", "frameEnd", "castExpr", "castExprWithCOLON_", "collateExpr", 
		"arrayConstructorWithCast", "arrayConstructor", "extractFromFunction", 
		"ignoredIdentifier_", "ignoredIdentifiers_", "matchNone", "setTransaction", 
		"beginTransaction", "commit", "rollback", "savepoint", "grant", "revoke", 
		"privileges_", "privilegeType_", "onObjectClause_", "createUser", "dropUser", 
		"alterUser", "createRole", "dropRole", "alterRole", "show", "setParam", 
		"scope", "setClause", "timeZoneType", "resetParam"
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
		null, null, null, null, null, null, null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'", 
		"'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", "'%'", 
		"':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", "'=='", 
		"'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "','", "'\"'", "'''", "'`'", "'?'", "'@'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WS", "ALL", "AND", "ANY", "ASC", "BETWEEN", "BINARY", "BY", 
		"DATE", "DESC", "DISTINCT", "ESCAPE", "EXISTS", "FALSE", "FROM", "GROUP", 
		"HAVING", "IN", "IS", "KEY", "LIKE", "LIMIT", "MOD", "NOT", "NULL", "OFFSET", 
		"OR", "ORDER", "PARTITION", "PRIMARY", "REGEXP", "ROW", "SET", "SOUNDS", 
		"TIME", "TIMESTAMP", "TRUE", "UNION", "UNKNOWN", "WHERE", "WITH", "XOR", 
		"ADD", "ALTER", "ALWAYS", "AS", "CASCADE", "CHECK", "COLUMN", "COMMIT", 
		"CONSTRAINT", "CREATE", "CURRENT", "DAY", "DEFAULT", "DELETE", "DISABLE", 
		"DROP", "ENABLE", "FOR", "FOREIGN", "FUNCTION", "GENERATED", "GRANT", 
		"INDEX", "ISOLATION", "LEVEL", "NO", "ON", "OPTION", "PRIVILEGES", "READ", 
		"REFERENCES", "REVOKE", "ROLE", "ROLLBACK", "ROWS", "START", "TABLE", 
		"TO", "TRANSACTION", "TRUNCATE", "UNIQUE", "USER", "YEAR", "ACTION", "ARRAY", 
		"BEGIN", "BRIN", "BTREE", "CACHE", "CAST", "CHARACTERISTICS", "CLUSTER", 
		"COLLATE", "COMMENTS", "CONCURRENTLY", "CONNECT", "CONSTRAINTS", "CURRENT_TIMESTAMP", 
		"CURRENT_USER", "CYCLE", "DATA", "DATABASE", "DEFAULTS", "DEFERRABLE", 
		"DEFERRED", "DEPENDS", "DOMAIN", "EXCLUDING", "EXECUTE", "EXTENDED", "EXTENSION", 
		"EXTERNAL", "EXTRACT", "FILTER", "FIRST", "FOLLOWING", "FORCE", "FULL", 
		"GIN", "GIST", "GLOBAL", "HASH", "HOUR", "IDENTITY", "IF", "IMMEDIATE", 
		"INCLUDING", "INCREMENT", "INDEXES", "INHERIT", "INHERITS", "INITIALLY", 
		"INSERT", "LANGUAGE", "LARGE", "LAST", "LOCAL", "LOGGED", "MAIN", "MATCH", 
		"MAXVALUE", "MINUTE", "MINVALUE", "MONTH", "NOTHING", "NULLS", "OBJECT", 
		"OF", "OIDS", "ONLY", "OVER", "OWNED", "OWNER", "PARTIAL", "PLAIN", "PRECEDING", 
		"PROCEDURE", "RANGE", "RENAME", "REPLICA", "RESET", "RESTART", "RESTRICT", 
		"ROUTINE", "RULE", "SAVEPOINT", "SCHEMA", "SECOND", "SECURITY", "SELECT", 
		"SEQUENCE", "SESSION", "SESSION_USER", "SHOW", "SIMPLE", "SPGIST", "STATISTICS", 
		"STORAGE", "TABLESPACE", "TEMP", "TEMPORARY", "TRIGGER", "TYPE", "UNBOUNDED", 
		"UNLOGGED", "UPDATE", "USAGE", "USING", "VALID", "VALIDATE", "WITHIN", 
		"WITHOUT", "ZONE", "FOR_GENERATOR", "AND_", "OR_", "NOT_", "TILDE_", "VERTICAL_BAR_", 
		"AMPERSAND_", "SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", 
		"COLON_", "PLUS_", "MINUS_", "ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", 
		"DOT_ASTERISK_", "SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", 
		"LTE_", "POUND_", "LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", 
		"DQ_", "SQ_", "BQ_", "QUESTION_", "AT_", "SEMI_", "IDENTIFIER_", "STRING_", 
		"NUMBER_", "HEX_DIGIT_", "BIT_NUM_"
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
	public String getGrammarFileName() { return "PostgreSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PostgreSQLStatementParser(TokenStream input) {
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
		public CreateRoleContext createRole() {
			return getRuleContext(CreateRoleContext.class,0);
		}
		public DropRoleContext dropRole() {
			return getRuleContext(DropRoleContext.class,0);
		}
		public AlterRoleContext alterRole() {
			return getRuleContext(AlterRoleContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public SetParamContext setParam() {
			return getRuleContext(SetParamContext.class,0);
		}
		public ResetParamContext resetParam() {
			return getRuleContext(ResetParamContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(PostgreSQLStatementParser.SEMI_, 0); }
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
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(266);
				createIndex();
				}
				break;
			case 2:
				{
				setState(267);
				alterIndex();
				}
				break;
			case 3:
				{
				setState(268);
				dropIndex();
				}
				break;
			case 4:
				{
				setState(269);
				createTable();
				}
				break;
			case 5:
				{
				setState(270);
				alterTable();
				}
				break;
			case 6:
				{
				setState(271);
				dropTable();
				}
				break;
			case 7:
				{
				setState(272);
				truncateTable();
				}
				break;
			case 8:
				{
				setState(273);
				setTransaction();
				}
				break;
			case 9:
				{
				setState(274);
				beginTransaction();
				}
				break;
			case 10:
				{
				setState(275);
				commit();
				}
				break;
			case 11:
				{
				setState(276);
				rollback();
				}
				break;
			case 12:
				{
				setState(277);
				savepoint();
				}
				break;
			case 13:
				{
				setState(278);
				grant();
				}
				break;
			case 14:
				{
				setState(279);
				revoke();
				}
				break;
			case 15:
				{
				setState(280);
				createUser();
				}
				break;
			case 16:
				{
				setState(281);
				dropUser();
				}
				break;
			case 17:
				{
				setState(282);
				alterUser();
				}
				break;
			case 18:
				{
				setState(283);
				createRole();
				}
				break;
			case 19:
				{
				setState(284);
				dropRole();
				}
				break;
			case 20:
				{
				setState(285);
				alterRole();
				}
				break;
			case 21:
				{
				setState(286);
				show();
				}
				break;
			case 22:
				{
				setState(287);
				setParam();
				}
				break;
			case 23:
				{
				setState(288);
				resetParam();
				}
				break;
			}
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(291);
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
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public TerminalNode CONCURRENTLY() { return getToken(PostgreSQLStatementParser.CONCURRENTLY, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
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
			setState(294);
			match(CREATE);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(295);
				match(UNIQUE);
				}
			}

			setState(298);
			match(INDEX);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONCURRENTLY) {
				{
				setState(299);
				match(CONCURRENTLY);
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF || _la==IDENTIFIER_) {
				{
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(302);
					match(IF);
					setState(303);
					match(NOT);
					setState(304);
					match(EXISTS);
					}
				}

				setState(307);
				indexName();
				}
			}

			setState(310);
			match(ON);
			setState(311);
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
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public TerminalNode CONCURRENTLY() { return getToken(PostgreSQLStatementParser.CONCURRENTLY, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dropIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(DROP);
			setState(314);
			match(INDEX);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONCURRENTLY) {
				{
				setState(315);
				match(CONCURRENTLY);
				}
			}

			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(318);
				match(IF);
				setState(319);
				match(EXISTS);
				}
			}

			setState(322);
			indexName();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(323);
				match(COMMA_);
				setState(324);
				indexName();
				}
				}
				setState(329);
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

	public static class AlterIndexContext extends ParserRuleContext {
		public AlterIndexNameContext alterIndexName() {
			return getRuleContext(AlterIndexNameContext.class,0);
		}
		public RenameIndexSpecificationContext renameIndexSpecification() {
			return getRuleContext(RenameIndexSpecificationContext.class,0);
		}
		public AlterIndexDependsOnExtensionContext alterIndexDependsOnExtension() {
			return getRuleContext(AlterIndexDependsOnExtensionContext.class,0);
		}
		public AlterIndexSetTableSpaceContext alterIndexSetTableSpace() {
			return getRuleContext(AlterIndexSetTableSpaceContext.class,0);
		}
		public AlterIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndex; }
	}

	public final AlterIndexContext alterIndex() throws RecognitionException {
		AlterIndexContext _localctx = new AlterIndexContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alterIndex);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				alterIndexName();
				setState(331);
				renameIndexSpecification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				alterIndexDependsOnExtension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				alterIndexSetTableSpace();
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

	public static class CreateTableContext extends ParserRuleContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public CreateDefinitionsContext createDefinitions() {
			return getRuleContext(CreateDefinitionsContext.class,0);
		}
		public InheritClauseContext inheritClause() {
			return getRuleContext(InheritClauseContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			createTableHeader();
			setState(338);
			createDefinitions();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(339);
				inheritClause();
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

	public static class AlterTableContext extends ParserRuleContext {
		public AlterTableNameWithAsteriskContext alterTableNameWithAsterisk() {
			return getRuleContext(AlterTableNameWithAsteriskContext.class,0);
		}
		public AlterTableActionsContext alterTableActions() {
			return getRuleContext(AlterTableActionsContext.class,0);
		}
		public RenameColumnSpecificationContext renameColumnSpecification() {
			return getRuleContext(RenameColumnSpecificationContext.class,0);
		}
		public RenameConstraintContext renameConstraint() {
			return getRuleContext(RenameConstraintContext.class,0);
		}
		public AlterTableNameExistsContext alterTableNameExists() {
			return getRuleContext(AlterTableNameExistsContext.class,0);
		}
		public RenameTableSpecificationContext renameTableSpecification() {
			return getRuleContext(RenameTableSpecificationContext.class,0);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alterTable);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				alterTableNameWithAsterisk();
				setState(346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(343);
					alterTableActions();
					}
					break;
				case 2:
					{
					setState(344);
					renameColumnSpecification();
					}
					break;
				case 3:
					{
					setState(345);
					renameConstraint();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				alterTableNameExists();
				setState(349);
				renameTableSpecification();
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

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(PostgreSQLStatementParser.TRUNCATE, 0); }
		public TableNamePartsContext tableNameParts() {
			return getRuleContext(TableNamePartsContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TerminalNode ONLY() { return getToken(PostgreSQLStatementParser.ONLY, 0); }
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_truncateTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(TRUNCATE);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(354);
				match(TABLE);
				}
			}

			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(357);
				match(ONLY);
				}
			}

			setState(360);
			tableNameParts();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
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
			setState(362);
			match(DROP);
			setState(363);
			match(TABLE);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(364);
				match(IF);
				setState(365);
				match(EXISTS);
				}
			}

			setState(368);
			tableName();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(369);
				match(COMMA_);
				setState(370);
				tableName();
				}
				}
				setState(375);
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

	public static class AlterIndexNameContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public AlterIndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexName; }
	}

	public final AlterIndexNameContext alterIndexName() throws RecognitionException {
		AlterIndexNameContext _localctx = new AlterIndexNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_alterIndexName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(ALTER);
			setState(377);
			match(INDEX);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(378);
				match(IF);
				setState(379);
				match(EXISTS);
				}
			}

			setState(382);
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

	public static class RenameIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public RenameIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameIndexSpecification; }
	}

	public final RenameIndexSpecificationContext renameIndexSpecification() throws RecognitionException {
		RenameIndexSpecificationContext _localctx = new RenameIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_renameIndexSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(RENAME);
			setState(385);
			match(TO);
			setState(386);
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

	public static class AlterIndexDependsOnExtensionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode DEPENDS() { return getToken(PostgreSQLStatementParser.DEPENDS, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public TerminalNode EXTENSION() { return getToken(PostgreSQLStatementParser.EXTENSION, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public AlterIndexDependsOnExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexDependsOnExtension; }
	}

	public final AlterIndexDependsOnExtensionContext alterIndexDependsOnExtension() throws RecognitionException {
		AlterIndexDependsOnExtensionContext _localctx = new AlterIndexDependsOnExtensionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_alterIndexDependsOnExtension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(ALTER);
			setState(389);
			match(INDEX);
			setState(390);
			indexName();
			setState(391);
			match(DEPENDS);
			setState(392);
			match(ON);
			setState(393);
			match(EXTENSION);
			setState(394);
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

	public static class AlterIndexSetTableSpaceContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode IN() { return getToken(PostgreSQLStatementParser.IN, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode OWNED() { return getToken(PostgreSQLStatementParser.OWNED, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public AlterIndexSetTableSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexSetTableSpace; }
	}

	public final AlterIndexSetTableSpaceContext alterIndexSetTableSpace() throws RecognitionException {
		AlterIndexSetTableSpaceContext _localctx = new AlterIndexSetTableSpaceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alterIndexSetTableSpace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(ALTER);
			setState(397);
			match(INDEX);
			setState(398);
			match(ALL);
			setState(399);
			match(IN);
			setState(400);
			match(TABLESPACE);
			setState(401);
			indexName();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OWNED) {
				{
				setState(402);
				match(OWNED);
				setState(403);
				match(BY);
				setState(404);
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

	public static class TableNamePartsContext extends ParserRuleContext {
		public List<TableNamePartContext> tableNamePart() {
			return getRuleContexts(TableNamePartContext.class);
		}
		public TableNamePartContext tableNamePart(int i) {
			return getRuleContext(TableNamePartContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TableNamePartsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNameParts; }
	}

	public final TableNamePartsContext tableNameParts() throws RecognitionException {
		TableNamePartsContext _localctx = new TableNamePartsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tableNameParts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			tableNamePart();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(408);
				match(COMMA_);
				setState(409);
				tableNamePart();
				}
				}
				setState(414);
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

	public static class TableNamePartContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public TableNamePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNamePart; }
	}

	public final TableNamePartContext tableNamePart() throws RecognitionException {
		TableNamePartContext _localctx = new TableNamePartContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tableNamePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			tableName();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK_) {
				{
				setState(416);
				match(ASTERISK_);
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

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode UNLOGGED() { return getToken(PostgreSQLStatementParser.UNLOGGED, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TerminalNode TEMPORARY() { return getToken(PostgreSQLStatementParser.TEMPORARY, 0); }
		public TerminalNode TEMP() { return getToken(PostgreSQLStatementParser.TEMP, 0); }
		public TerminalNode GLOBAL() { return getToken(PostgreSQLStatementParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(PostgreSQLStatementParser.LOCAL, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(CREATE);
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case LOCAL:
			case TEMP:
			case TEMPORARY:
				{
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==LOCAL) {
					{
					setState(420);
					_la = _input.LA(1);
					if ( !(_la==GLOBAL || _la==LOCAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(423);
				_la = _input.LA(1);
				if ( !(_la==TEMP || _la==TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case UNLOGGED:
				{
				setState(424);
				match(UNLOGGED);
				}
				break;
			case TABLE:
				break;
			default:
				break;
			}
			setState(427);
			match(TABLE);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(428);
				match(IF);
				setState(429);
				match(NOT);
				setState(430);
				match(EXISTS);
				}
			}

			setState(433);
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

	public static class CreateDefinitionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<CreateDefinitionContext> createDefinition() {
			return getRuleContexts(CreateDefinitionContext.class);
		}
		public CreateDefinitionContext createDefinition(int i) {
			return getRuleContext(CreateDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public CreateDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitions; }
	}

	public final CreateDefinitionsContext createDefinitions() throws RecognitionException {
		CreateDefinitionsContext _localctx = new CreateDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_createDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(LP_);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (KEY - 21)) | (1L << (LIKE - 21)) | (1L << (PRIMARY - 21)) | (1L << (CHECK - 21)) | (1L << (CONSTRAINT - 21)) | (1L << (FOREIGN - 21)) | (1L << (UNIQUE - 21)))) != 0) || _la==IDENTIFIER_) {
				{
				setState(436);
				createDefinition();
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(437);
					match(COMMA_);
					setState(438);
					createDefinition();
					}
					}
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(446);
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

	public static class CreateDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(PostgreSQLStatementParser.LIKE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<LikeOptionContext> likeOption() {
			return getRuleContexts(LikeOptionContext.class);
		}
		public LikeOptionContext likeOption(int i) {
			return getRuleContext(LikeOptionContext.class,i);
		}
		public CreateDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinition; }
	}

	public final CreateDefinitionContext createDefinition() throws RecognitionException {
		CreateDefinitionContext _localctx = new CreateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_createDefinition);
		int _la;
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				columnDefinition();
				}
				break;
			case KEY:
			case PRIMARY:
			case CHECK:
			case CONSTRAINT:
			case FOREIGN:
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				tableConstraint();
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				match(LIKE);
				setState(451);
				tableName();
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EXCLUDING || _la==INCLUDING) {
					{
					{
					setState(452);
					likeOption();
					}
					}
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class LikeOptionContext extends ParserRuleContext {
		public TerminalNode INCLUDING() { return getToken(PostgreSQLStatementParser.INCLUDING, 0); }
		public TerminalNode EXCLUDING() { return getToken(PostgreSQLStatementParser.EXCLUDING, 0); }
		public TerminalNode COMMENTS() { return getToken(PostgreSQLStatementParser.COMMENTS, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(PostgreSQLStatementParser.CONSTRAINTS, 0); }
		public TerminalNode DEFAULTS() { return getToken(PostgreSQLStatementParser.DEFAULTS, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode INDEXES() { return getToken(PostgreSQLStatementParser.INDEXES, 0); }
		public TerminalNode STATISTICS() { return getToken(PostgreSQLStatementParser.STATISTICS, 0); }
		public TerminalNode STORAGE() { return getToken(PostgreSQLStatementParser.STORAGE, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public LikeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeOption; }
	}

	public final LikeOptionContext likeOption() throws RecognitionException {
		LikeOptionContext _localctx = new LikeOptionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_likeOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_la = _input.LA(1);
			if ( !(_la==EXCLUDING || _la==INCLUDING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(461);
			_la = _input.LA(1);
			if ( !(_la==ALL || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (COMMENTS - 97)) | (1L << (CONSTRAINTS - 97)) | (1L << (DEFAULTS - 97)) | (1L << (IDENTITY - 97)) | (1L << (INDEXES - 97)))) != 0) || _la==STATISTICS || _la==STORAGE) ) {
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

	public static class InheritClauseContext extends ParserRuleContext {
		public TerminalNode INHERITS() { return getToken(PostgreSQLStatementParser.INHERITS, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public InheritClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritClause; }
	}

	public final InheritClauseContext inheritClause() throws RecognitionException {
		InheritClauseContext _localctx = new InheritClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_inheritClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(INHERITS);
			setState(464);
			match(LP_);
			setState(465);
			tableName();
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(466);
				match(COMMA_);
				setState(467);
				tableName();
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(473);
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

	public static class AlterTableNameWithAsteriskContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TerminalNode ONLY() { return getToken(PostgreSQLStatementParser.ONLY, 0); }
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public AlterTableNameWithAsteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableNameWithAsterisk; }
	}

	public final AlterTableNameWithAsteriskContext alterTableNameWithAsterisk() throws RecognitionException {
		AlterTableNameWithAsteriskContext _localctx = new AlterTableNameWithAsteriskContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_alterTableNameWithAsterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(ALTER);
			setState(476);
			match(TABLE);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(477);
				match(IF);
				setState(478);
				match(EXISTS);
				}
			}

			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(481);
				match(ONLY);
				}
			}

			setState(484);
			tableName();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK_) {
				{
				setState(485);
				match(ASTERISK_);
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

	public static class AlterTableActionsContext extends ParserRuleContext {
		public List<AlterTableActionContext> alterTableAction() {
			return getRuleContexts(AlterTableActionContext.class);
		}
		public AlterTableActionContext alterTableAction(int i) {
			return getRuleContext(AlterTableActionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public AlterTableActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableActions; }
	}

	public final AlterTableActionsContext alterTableActions() throws RecognitionException {
		AlterTableActionsContext _localctx = new AlterTableActionsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_alterTableActions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			alterTableAction();
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(489);
				match(COMMA_);
				setState(490);
				alterTableAction();
				}
				}
				setState(495);
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

	public static class AlterTableActionContext extends ParserRuleContext {
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public AddConstraintSpecificationContext addConstraintSpecification() {
			return getRuleContext(AddConstraintSpecificationContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public TerminalNode VALIDATE() { return getToken(PostgreSQLStatementParser.VALIDATE, 0); }
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public TerminalNode TRIGGER() { return getToken(PostgreSQLStatementParser.TRIGGER, 0); }
		public TerminalNode DISABLE() { return getToken(PostgreSQLStatementParser.DISABLE, 0); }
		public TerminalNode ENABLE() { return getToken(PostgreSQLStatementParser.ENABLE, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public TerminalNode REPLICA() { return getToken(PostgreSQLStatementParser.REPLICA, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode RULE() { return getToken(PostgreSQLStatementParser.RULE, 0); }
		public TerminalNode ROW() { return getToken(PostgreSQLStatementParser.ROW, 0); }
		public TerminalNode LEVEL() { return getToken(PostgreSQLStatementParser.LEVEL, 0); }
		public TerminalNode SECURITY() { return getToken(PostgreSQLStatementParser.SECURITY, 0); }
		public TerminalNode FORCE() { return getToken(PostgreSQLStatementParser.FORCE, 0); }
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode CLUSTER() { return getToken(PostgreSQLStatementParser.CLUSTER, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode WITHOUT() { return getToken(PostgreSQLStatementParser.WITHOUT, 0); }
		public TerminalNode OIDS() { return getToken(PostgreSQLStatementParser.OIDS, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public TerminalNode LOGGED() { return getToken(PostgreSQLStatementParser.LOGGED, 0); }
		public TerminalNode UNLOGGED() { return getToken(PostgreSQLStatementParser.UNLOGGED, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<StorageParameterWithValueContext> storageParameterWithValue() {
			return getRuleContexts(StorageParameterWithValueContext.class);
		}
		public StorageParameterWithValueContext storageParameterWithValue(int i) {
			return getRuleContext(StorageParameterWithValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public List<StorageParameterContext> storageParameter() {
			return getRuleContexts(StorageParameterContext.class);
		}
		public StorageParameterContext storageParameter(int i) {
			return getRuleContext(StorageParameterContext.class,i);
		}
		public TerminalNode INHERIT() { return getToken(PostgreSQLStatementParser.INHERIT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode OF() { return getToken(PostgreSQLStatementParser.OF, 0); }
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode OWNER() { return getToken(PostgreSQLStatementParser.OWNER, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TerminalNode CURRENT_USER() { return getToken(PostgreSQLStatementParser.CURRENT_USER, 0); }
		public TerminalNode SESSION_USER() { return getToken(PostgreSQLStatementParser.SESSION_USER, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLStatementParser.FULL, 0); }
		public TerminalNode NOTHING() { return getToken(PostgreSQLStatementParser.NOTHING, 0); }
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public AlterTableActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAction; }
	}

	public final AlterTableActionContext alterTableAction() throws RecognitionException {
		AlterTableActionContext _localctx = new AlterTableActionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_alterTableAction);
		int _la;
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				addColumnSpecification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				dropColumnSpecification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				modifyColumnSpecification();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(499);
				addConstraintSpecification();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(500);
				match(ALTER);
				setState(501);
				match(CONSTRAINT);
				setState(502);
				ignoredIdentifier_();
				setState(503);
				constraintOptionalParam();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(505);
				match(VALIDATE);
				setState(506);
				match(CONSTRAINT);
				setState(507);
				ignoredIdentifier_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(508);
				match(DROP);
				setState(509);
				match(CONSTRAINT);
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(510);
					match(IF);
					setState(511);
					match(EXISTS);
					}
				}

				setState(514);
				ignoredIdentifier_();
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(515);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
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
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(518);
				_la = _input.LA(1);
				if ( !(_la==DISABLE || _la==ENABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(519);
				match(TRIGGER);
				setState(523);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER_:
					{
					setState(520);
					ignoredIdentifier_();
					}
					break;
				case ALL:
					{
					setState(521);
					match(ALL);
					}
					break;
				case USER:
					{
					setState(522);
					match(USER);
					}
					break;
				case EOF:
				case COMMA_:
				case SEMI_:
					break;
				default:
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(525);
				match(ENABLE);
				setState(526);
				_la = _input.LA(1);
				if ( !(_la==ALWAYS || _la==REPLICA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(527);
				match(TRIGGER);
				setState(528);
				ignoredIdentifier_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(529);
				_la = _input.LA(1);
				if ( !(_la==DISABLE || _la==ENABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(530);
				match(RULE);
				setState(531);
				ignoredIdentifier_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(532);
				match(ENABLE);
				setState(533);
				_la = _input.LA(1);
				if ( !(_la==ALWAYS || _la==REPLICA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(534);
				match(RULE);
				setState(535);
				ignoredIdentifier_();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(542);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DISABLE:
					{
					setState(536);
					match(DISABLE);
					}
					break;
				case ENABLE:
					{
					setState(537);
					match(ENABLE);
					}
					break;
				case NO:
				case FORCE:
					{
					{
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(538);
						match(NO);
						}
					}

					setState(541);
					match(FORCE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(544);
				match(ROW);
				setState(545);
				match(LEVEL);
				setState(546);
				match(SECURITY);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(547);
				match(CLUSTER);
				setState(548);
				match(ON);
				setState(549);
				indexName();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(550);
				match(SET);
				setState(551);
				match(WITHOUT);
				setState(552);
				match(CLUSTER);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(553);
				match(SET);
				setState(554);
				_la = _input.LA(1);
				if ( !(_la==WITH || _la==WITHOUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(555);
				match(OIDS);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(556);
				match(SET);
				setState(557);
				match(TABLESPACE);
				setState(558);
				ignoredIdentifier_();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(559);
				match(SET);
				setState(560);
				_la = _input.LA(1);
				if ( !(_la==LOGGED || _la==UNLOGGED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(561);
				match(SET);
				setState(562);
				match(LP_);
				setState(563);
				storageParameterWithValue();
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(564);
					match(COMMA_);
					setState(565);
					storageParameterWithValue();
					}
					}
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(571);
				match(RP_);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(573);
				match(RESET);
				setState(574);
				match(LP_);
				setState(575);
				storageParameter();
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(576);
					match(COMMA_);
					setState(577);
					storageParameter();
					}
					}
					setState(582);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(583);
				match(RP_);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(585);
				match(INHERIT);
				setState(586);
				tableName();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(587);
				match(NO);
				setState(588);
				match(INHERIT);
				setState(589);
				tableName();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(590);
				match(OF);
				setState(591);
				dataTypeName_();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(592);
				match(NOT);
				setState(593);
				match(OF);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(594);
				match(OWNER);
				setState(595);
				match(TO);
				setState(599);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER_:
					{
					setState(596);
					ignoredIdentifier_();
					}
					break;
				case CURRENT_USER:
					{
					setState(597);
					match(CURRENT_USER);
					}
					break;
				case SESSION_USER:
					{
					setState(598);
					match(SESSION_USER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(601);
				match(REPLICA);
				setState(602);
				match(IDENTITY);
				setState(609);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFAULT:
					{
					setState(603);
					match(DEFAULT);
					}
					break;
				case USING:
					{
					{
					setState(604);
					match(USING);
					setState(605);
					match(INDEX);
					setState(606);
					indexName();
					}
					}
					break;
				case FULL:
					{
					setState(607);
					match(FULL);
					}
					break;
				case NOTHING:
					{
					setState(608);
					match(NOTHING);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class TableConstraintUsingIndexContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TableConstraintUsingIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraintUsingIndex; }
	}

	public final TableConstraintUsingIndexContext tableConstraintUsingIndex() throws RecognitionException {
		TableConstraintUsingIndexContext _localctx = new TableConstraintUsingIndexContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tableConstraintUsingIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(613);
				match(CONSTRAINT);
				setState(614);
				ignoredIdentifier_();
				}
			}

			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIQUE:
				{
				setState(617);
				match(UNIQUE);
				}
				break;
			case KEY:
			case PRIMARY:
				{
				setState(618);
				primaryKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(621);
			match(USING);
			setState(622);
			match(INDEX);
			setState(623);
			indexName();
			setState(624);
			constraintOptionalParam();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ADD() { return getToken(PostgreSQLStatementParser.ADD, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(ADD);
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(627);
				match(COLUMN);
				}
			}

			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(630);
				match(IF);
				setState(631);
				match(NOT);
				setState(632);
				match(EXISTS);
				}
			}

			setState(635);
			columnDefinition();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dropColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(DROP);
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(638);
				match(COLUMN);
				}
			}

			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(641);
				match(IF);
				setState(642);
				match(EXISTS);
				}
			}

			setState(645);
			columnName();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(646);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
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

	public static class ModifyColumnSpecificationContext extends ParserRuleContext {
		public AlterColumnContext alterColumn() {
			return getRuleContext(AlterColumnContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(PostgreSQLStatementParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode DATA() { return getToken(PostgreSQLStatementParser.DATA, 0); }
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode ADD() { return getToken(PostgreSQLStatementParser.ADD, 0); }
		public TerminalNode GENERATED() { return getToken(PostgreSQLStatementParser.GENERATED, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public SequenceOptionsContext sequenceOptions() {
			return getRuleContext(SequenceOptionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public List<AlterColumnSetOptionContext> alterColumnSetOption() {
			return getRuleContexts(AlterColumnSetOptionContext.class);
		}
		public AlterColumnSetOptionContext alterColumnSetOption(int i) {
			return getRuleContext(AlterColumnSetOptionContext.class,i);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TerminalNode STATISTICS() { return getToken(PostgreSQLStatementParser.STATISTICS, 0); }
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public AttributeOptionsContext attributeOptions() {
			return getRuleContext(AttributeOptionsContext.class,0);
		}
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public TerminalNode STORAGE() { return getToken(PostgreSQLStatementParser.STORAGE, 0); }
		public TerminalNode PLAIN() { return getToken(PostgreSQLStatementParser.PLAIN, 0); }
		public TerminalNode EXTERNAL() { return getToken(PostgreSQLStatementParser.EXTERNAL, 0); }
		public TerminalNode EXTENDED() { return getToken(PostgreSQLStatementParser.EXTENDED, 0); }
		public TerminalNode MAIN() { return getToken(PostgreSQLStatementParser.MAIN, 0); }
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_modifyColumnSpecification);
		int _la;
		try {
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				alterColumn();
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(650);
					match(SET);
					setState(651);
					match(DATA);
					}
				}

				setState(654);
				match(TYPE);
				setState(655);
				dataType();
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(656);
					collateClause();
					}
				}

				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(659);
					match(USING);
					setState(660);
					simpleExpr(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				alterColumn();
				setState(664);
				match(SET);
				setState(665);
				match(DEFAULT);
				setState(666);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(668);
				alterColumn();
				setState(669);
				match(DROP);
				setState(670);
				match(DEFAULT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(672);
				alterColumn();
				setState(673);
				_la = _input.LA(1);
				if ( !(_la==SET || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(674);
				match(NOT);
				setState(675);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(677);
				alterColumn();
				setState(678);
				match(ADD);
				setState(679);
				match(GENERATED);
				setState(683);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALWAYS:
					{
					setState(680);
					match(ALWAYS);
					}
					break;
				case BY:
					{
					{
					setState(681);
					match(BY);
					setState(682);
					match(DEFAULT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(685);
				match(AS);
				setState(686);
				match(IDENTITY);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(687);
					match(LP_);
					setState(688);
					sequenceOptions();
					setState(689);
					match(RP_);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(693);
				alterColumn();
				setState(694);
				alterColumnSetOption();
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SET || _la==RESTART) {
					{
					{
					setState(695);
					alterColumnSetOption();
					}
					}
					setState(700);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(701);
				alterColumn();
				setState(702);
				match(DROP);
				setState(703);
				match(IDENTITY);
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(704);
					match(IF);
					setState(705);
					match(EXISTS);
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(708);
				alterColumn();
				setState(709);
				match(SET);
				setState(710);
				match(STATISTICS);
				setState(711);
				match(NUMBER_);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(713);
				alterColumn();
				setState(714);
				match(SET);
				setState(715);
				match(LP_);
				setState(716);
				attributeOptions();
				setState(717);
				match(RP_);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(719);
				alterColumn();
				setState(720);
				match(RESET);
				setState(721);
				match(LP_);
				setState(722);
				attributeOptions();
				setState(723);
				match(RP_);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(725);
				alterColumn();
				setState(726);
				match(SET);
				setState(727);
				match(STORAGE);
				setState(728);
				_la = _input.LA(1);
				if ( !(((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (EXTENDED - 113)) | (1L << (EXTERNAL - 113)) | (1L << (MAIN - 113)) | (1L << (PLAIN - 113)))) != 0)) ) {
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
		}
		catch (RecognitionException re) {
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
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public AlterColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumn; }
	}

	public final AlterColumnContext alterColumn() throws RecognitionException {
		AlterColumnContext _localctx = new AlterColumnContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_alterColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(ALTER);
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(733);
				match(COLUMN);
				}
			}

			setState(736);
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

	public static class AlterColumnSetOptionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode GENERATED() { return getToken(PostgreSQLStatementParser.GENERATED, 0); }
		public SequenceOptionContext sequenceOption() {
			return getRuleContext(SequenceOptionContext.class,0);
		}
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public TerminalNode RESTART() { return getToken(PostgreSQLStatementParser.RESTART, 0); }
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public AlterColumnSetOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnSetOption; }
	}

	public final AlterColumnSetOptionContext alterColumnSetOption() throws RecognitionException {
		AlterColumnSetOptionContext _localctx = new AlterColumnSetOptionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_alterColumnSetOption);
		int _la;
		try {
			setState(755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				match(SET);
				setState(746);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GENERATED:
					{
					setState(739);
					match(GENERATED);
					setState(743);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ALWAYS:
						{
						setState(740);
						match(ALWAYS);
						}
						break;
					case BY:
						{
						setState(741);
						match(BY);
						setState(742);
						match(DEFAULT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case NO:
				case START:
				case CACHE:
				case CYCLE:
				case INCREMENT:
				case MAXVALUE:
				case MINVALUE:
					{
					setState(745);
					sequenceOption();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case RESTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				match(RESTART);
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH || _la==NUMBER_) {
					{
					setState(750);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(749);
						match(WITH);
						}
					}

					setState(752);
					match(NUMBER_);
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

	public static class AttributeOptionsContext extends ParserRuleContext {
		public List<AttributeOptionContext> attributeOption() {
			return getRuleContexts(AttributeOptionContext.class);
		}
		public AttributeOptionContext attributeOption(int i) {
			return getRuleContext(AttributeOptionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public AttributeOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeOptions; }
	}

	public final AttributeOptionsContext attributeOptions() throws RecognitionException {
		AttributeOptionsContext _localctx = new AttributeOptionsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_attributeOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			attributeOption();
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(758);
				match(COMMA_);
				setState(759);
				attributeOption();
				}
				}
				setState(764);
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

	public static class AttributeOptionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public AttributeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeOption; }
	}

	public final AttributeOptionContext attributeOption() throws RecognitionException {
		AttributeOptionContext _localctx = new AttributeOptionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_attributeOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(IDENTIFIER_);
			setState(766);
			match(EQ_);
			setState(767);
			simpleExpr(0);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ADD() { return getToken(PostgreSQLStatementParser.ADD, 0); }
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TableConstraintUsingIndexContext tableConstraintUsingIndex() {
			return getRuleContext(TableConstraintUsingIndexContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode VALID() { return getToken(PostgreSQLStatementParser.VALID, 0); }
		public AddConstraintSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraintSpecification; }
	}

	public final AddConstraintSpecificationContext addConstraintSpecification() throws RecognitionException {
		AddConstraintSpecificationContext _localctx = new AddConstraintSpecificationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_addConstraintSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(ADD);
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(770);
				tableConstraint();
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(771);
					match(NOT);
					setState(772);
					match(VALID);
					}
				}

				}
				break;
			case 2:
				{
				setState(775);
				tableConstraintUsingIndex();
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

	public static class RenameColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public RenameColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameColumnSpecification; }
	}

	public final RenameColumnSpecificationContext renameColumnSpecification() throws RecognitionException {
		RenameColumnSpecificationContext _localctx = new RenameColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_renameColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(RENAME);
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(779);
				match(COLUMN);
				}
			}

			setState(782);
			columnName();
			setState(783);
			match(TO);
			setState(784);
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

	public static class RenameConstraintContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public List<IgnoredIdentifier_Context> ignoredIdentifier_() {
			return getRuleContexts(IgnoredIdentifier_Context.class);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_(int i) {
			return getRuleContext(IgnoredIdentifier_Context.class,i);
		}
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public RenameConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameConstraint; }
	}

	public final RenameConstraintContext renameConstraint() throws RecognitionException {
		RenameConstraintContext _localctx = new RenameConstraintContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_renameConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(RENAME);
			setState(787);
			match(CONSTRAINT);
			setState(788);
			ignoredIdentifier_();
			setState(789);
			match(TO);
			setState(790);
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

	public static class StorageParameterWithValueContext extends ParserRuleContext {
		public StorageParameterContext storageParameter() {
			return getRuleContext(StorageParameterContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public StorageParameterWithValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageParameterWithValue; }
	}

	public final StorageParameterWithValueContext storageParameterWithValue() throws RecognitionException {
		StorageParameterWithValueContext _localctx = new StorageParameterWithValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_storageParameterWithValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			storageParameter();
			setState(793);
			match(EQ_);
			setState(794);
			simpleExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public StorageParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageParameter; }
	}

	public final StorageParameterContext storageParameter() throws RecognitionException {
		StorageParameterContext _localctx = new StorageParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_storageParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
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

	public static class AlterTableNameExistsContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public AlterTableNameExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableNameExists; }
	}

	public final AlterTableNameExistsContext alterTableNameExists() throws RecognitionException {
		AlterTableNameExistsContext _localctx = new AlterTableNameExistsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_alterTableNameExists);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(ALTER);
			setState(799);
			match(TABLE);
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(800);
				match(IF);
				setState(801);
				match(EXISTS);
				}
			}

			setState(804);
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

	public static class RenameTableSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public RenameTableSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameTableSpecification; }
	}

	public final RenameTableSpecificationContext renameTableSpecification() throws RecognitionException {
		RenameTableSpecificationContext _localctx = new RenameTableSpecificationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_renameTableSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(RENAME);
			setState(807);
			match(TO);
			setState(808);
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

	public static class UsingIndexTypeContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode BTREE() { return getToken(PostgreSQLStatementParser.BTREE, 0); }
		public TerminalNode HASH() { return getToken(PostgreSQLStatementParser.HASH, 0); }
		public TerminalNode GIST() { return getToken(PostgreSQLStatementParser.GIST, 0); }
		public TerminalNode SPGIST() { return getToken(PostgreSQLStatementParser.SPGIST, 0); }
		public TerminalNode GIN() { return getToken(PostgreSQLStatementParser.GIN, 0); }
		public TerminalNode BRIN() { return getToken(PostgreSQLStatementParser.BRIN, 0); }
		public UsingIndexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingIndexType; }
	}

	public final UsingIndexTypeContext usingIndexType() throws RecognitionException {
		UsingIndexTypeContext _localctx = new UsingIndexTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_usingIndexType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(USING);
			setState(811);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (BRIN - 90)) | (1L << (BTREE - 90)) | (1L << (GIN - 90)) | (1L << (GIST - 90)) | (1L << (HASH - 90)))) != 0) || _la==SPGIST) ) {
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

	public static class TableConstraintContext extends ParserRuleContext {
		public TableConstraintOptionContext tableConstraintOption() {
			return getRuleContext(TableConstraintOptionContext.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public ConstraintClauseContext constraintClause() {
			return getRuleContext(ConstraintClauseContext.class,0);
		}
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tableConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(813);
				constraintClause();
				}
			}

			setState(816);
			tableConstraintOption();
			setState(817);
			constraintOptionalParam();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableConstraintOptionContext extends ParserRuleContext {
		public CheckOptionContext checkOption() {
			return getRuleContext(CheckOptionContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public IndexParametersContext indexParameters() {
			return getRuleContext(IndexParametersContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(PostgreSQLStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(PostgreSQLStatementParser.KEY, 0); }
		public TerminalNode REFERENCES() { return getToken(PostgreSQLStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(PostgreSQLStatementParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLStatementParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(PostgreSQLStatementParser.PARTIAL, 0); }
		public TerminalNode SIMPLE() { return getToken(PostgreSQLStatementParser.SIMPLE, 0); }
		public List<ForeignKeyOnActionContext> foreignKeyOnAction() {
			return getRuleContexts(ForeignKeyOnActionContext.class);
		}
		public ForeignKeyOnActionContext foreignKeyOnAction(int i) {
			return getRuleContext(ForeignKeyOnActionContext.class,i);
		}
		public TableConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraintOption; }
	}

	public final TableConstraintOptionContext tableConstraintOption() throws RecognitionException {
		TableConstraintOptionContext _localctx = new TableConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tableConstraintOption);
		int _la;
		try {
			setState(848);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHECK:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				checkOption();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				match(UNIQUE);
				setState(821);
				columnNames();
				setState(822);
				indexParameters();
				}
				break;
			case KEY:
			case PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(824);
				primaryKey();
				setState(825);
				columnNames();
				setState(826);
				indexParameters();
				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(828);
				match(FOREIGN);
				setState(829);
				match(KEY);
				setState(830);
				columnNames();
				setState(831);
				match(REFERENCES);
				setState(832);
				tableName();
				setState(833);
				columnNames();
				setState(840);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(834);
					match(MATCH);
					setState(835);
					match(FULL);
					}
					break;
				case 2:
					{
					setState(836);
					match(MATCH);
					setState(837);
					match(PARTIAL);
					}
					break;
				case 3:
					{
					setState(838);
					match(MATCH);
					setState(839);
					match(SIMPLE);
					}
					break;
				}
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON) {
					{
					{
					setState(842);
					foreignKeyOnAction();
					}
					}
					setState(847);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ExcludeElementContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode NULLS() { return getToken(PostgreSQLStatementParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(PostgreSQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PostgreSQLStatementParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(PostgreSQLStatementParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(PostgreSQLStatementParser.LAST, 0); }
		public ExcludeElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_excludeElement; }
	}

	public final ExcludeElementContext excludeElement() throws RecognitionException {
		ExcludeElementContext _localctx = new ExcludeElementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_excludeElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(850);
				columnName();
				}
				break;
			case 2:
				{
				setState(851);
				expr(0);
				}
				break;
			}
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(854);
				ignoredIdentifier_();
				}
			}

			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(857);
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

			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(860);
				match(NULLS);
				setState(861);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
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

	public static class SchemaNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
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
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
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
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
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
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_collationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
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
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
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
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
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
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(PostgreSQLStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(PostgreSQLStatementParser.NUMBER_, i);
		}
		public TerminalNode COMMA_() { return getToken(PostgreSQLStatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(LP_);
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER_) {
				{
				setState(877);
				match(NUMBER_);
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(878);
					match(COMMA_);
					setState(879);
					match(NUMBER_);
					}
				}

				}
			}

			setState(884);
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
		public TerminalNode KEY() { return getToken(PostgreSQLStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(PostgreSQLStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(886);
				match(PRIMARY);
				}
			}

			setState(889);
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
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(LP_);
			setState(892);
			columnName();
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(893);
				match(COMMA_);
				setState(894);
				columnName();
				}
				}
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(900);
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
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			expr(0);
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(903);
				match(COMMA_);
				setState(904);
				expr(0);
				}
				}
				setState(909);
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
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_exprList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(LP_);
			setState(911);
			exprs();
			setState(912);
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
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(PostgreSQLStatementParser.NOT_, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public ExprRecursiveContext exprRecursive() {
			return getRuleContext(ExprRecursiveContext.class,0);
		}
		public TerminalNode AND() { return getToken(PostgreSQLStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(PostgreSQLStatementParser.AND_, 0); }
		public TerminalNode XOR() { return getToken(PostgreSQLStatementParser.XOR, 0); }
		public TerminalNode OR() { return getToken(PostgreSQLStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(PostgreSQLStatementParser.OR_, 0); }
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
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(915);
				match(LP_);
				setState(916);
				expr(0);
				setState(917);
				match(RP_);
				}
				break;
			case 2:
				{
				setState(919);
				match(NOT);
				setState(920);
				expr(6);
				}
				break;
			case 3:
				{
				setState(921);
				match(NOT_);
				setState(922);
				expr(5);
				}
				break;
			case 4:
				{
				setState(923);
				booleanPrimary(0);
				}
				break;
			case 5:
				{
				setState(924);
				exprRecursive();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(944);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(942);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(927);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(928);
						match(AND);
						setState(929);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(930);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(931);
						match(AND_);
						setState(932);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(933);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(934);
						match(XOR);
						setState(935);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(936);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(937);
						match(OR);
						setState(938);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(939);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(940);
						match(OR_);
						setState(941);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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
		enterRule(_localctx, 106, RULE_exprRecursive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
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
		public TerminalNode IS() { return getToken(PostgreSQLStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(PostgreSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PostgreSQLStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(PostgreSQLStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(PostgreSQLStatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(PostgreSQLStatementParser.ANY, 0); }
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(950);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(972);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(970);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(952);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(953);
						match(IS);
						setState(955);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(954);
							match(NOT);
							}
						}

						setState(957);
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
						setState(958);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(959);
						match(SAFE_EQ_);
						setState(960);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(961);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(962);
						comparisonOperator();
						setState(963);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(965);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(966);
						comparisonOperator();
						setState(967);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(968);
						subquery();
						}
						break;
					}
					} 
				}
				setState(974);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(PostgreSQLStatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(PostgreSQLStatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(PostgreSQLStatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(PostgreSQLStatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(PostgreSQLStatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_la = _input.LA(1);
			if ( !(((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (EQ_ - 218)) | (1L << (NEQ_ - 218)) | (1L << (GT_ - 218)) | (1L << (GTE_ - 218)) | (1L << (LT_ - 218)) | (1L << (LTE_ - 218)))) != 0)) ) {
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
		public TerminalNode IN() { return getToken(PostgreSQLStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(PostgreSQLStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(PostgreSQLStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SOUNDS() { return getToken(PostgreSQLStatementParser.SOUNDS, 0); }
		public TerminalNode LIKE() { return getToken(PostgreSQLStatementParser.LIKE, 0); }
		public List<TerminalNode> ESCAPE() { return getTokens(PostgreSQLStatementParser.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(PostgreSQLStatementParser.ESCAPE, i);
		}
		public TerminalNode REGEXP() { return getToken(PostgreSQLStatementParser.REGEXP, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_predicate);
		int _la;
		try {
			int _alt;
			setState(1035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(977);
				bitExpr(0);
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(978);
					match(NOT);
					}
				}

				setState(981);
				match(IN);
				setState(982);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
				bitExpr(0);
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(985);
					match(NOT);
					}
				}

				setState(988);
				match(IN);
				setState(989);
				match(LP_);
				setState(990);
				simpleExpr(0);
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(991);
					match(COMMA_);
					setState(992);
					simpleExpr(0);
					}
					}
					setState(997);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(998);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1000);
				bitExpr(0);
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1001);
					match(NOT);
					}
				}

				setState(1004);
				match(BETWEEN);
				setState(1005);
				simpleExpr(0);
				setState(1006);
				match(AND);
				setState(1007);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1009);
				bitExpr(0);
				setState(1010);
				match(SOUNDS);
				setState(1011);
				match(LIKE);
				setState(1012);
				simpleExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1014);
				bitExpr(0);
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1015);
					match(NOT);
					}
				}

				setState(1018);
				match(LIKE);
				setState(1019);
				simpleExpr(0);
				setState(1024);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1020);
						match(ESCAPE);
						setState(1021);
						simpleExpr(0);
						}
						} 
					}
					setState(1026);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1027);
				bitExpr(0);
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1028);
					match(NOT);
					}
				}

				setState(1031);
				match(REGEXP);
				setState(1032);
				simpleExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1034);
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
		public TerminalNode VERTICAL_BAR_() { return getToken(PostgreSQLStatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(PostgreSQLStatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(PostgreSQLStatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(PostgreSQLStatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(PostgreSQLStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(PostgreSQLStatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(PostgreSQLStatementParser.SLASH_, 0); }
		public TerminalNode MOD() { return getToken(PostgreSQLStatementParser.MOD, 0); }
		public TerminalNode MOD_() { return getToken(PostgreSQLStatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(PostgreSQLStatementParser.CARET_, 0); }
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1038);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1081);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1079);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1040);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1041);
						match(VERTICAL_BAR_);
						setState(1042);
						bitExpr(15);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1043);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1044);
						match(AMPERSAND_);
						setState(1045);
						bitExpr(14);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1046);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1047);
						match(SIGNED_LEFT_SHIFT_);
						setState(1048);
						bitExpr(13);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1049);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1050);
						match(SIGNED_RIGHT_SHIFT_);
						setState(1051);
						bitExpr(12);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1052);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1053);
						match(PLUS_);
						setState(1054);
						bitExpr(11);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1055);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1056);
						match(MINUS_);
						setState(1057);
						bitExpr(10);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1058);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1059);
						match(ASTERISK_);
						setState(1060);
						bitExpr(9);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1061);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1062);
						match(SLASH_);
						setState(1063);
						bitExpr(8);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1064);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1065);
						match(MOD);
						setState(1066);
						bitExpr(7);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1067);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1068);
						match(MOD_);
						setState(1069);
						bitExpr(6);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1070);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1071);
						match(CARET_);
						setState(1072);
						bitExpr(5);
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1073);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1074);
						match(PLUS_);
						setState(1075);
						intervalExpr();
						}
						break;
					case 13:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1076);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1077);
						match(MINUS_);
						setState(1078);
						intervalExpr();
						}
						break;
					}
					} 
				}
				setState(1083);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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
		public TerminalNode PLUS_() { return getToken(PostgreSQLStatementParser.PLUS_, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode MINUS_() { return getToken(PostgreSQLStatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(PostgreSQLStatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(PostgreSQLStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(PostgreSQLStatementParser.BINARY, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode ROW() { return getToken(PostgreSQLStatementParser.ROW, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public CaseExpressContext caseExpress() {
			return getRuleContext(CaseExpressContext.class,0);
		}
		public IntervalExprContext intervalExpr() {
			return getRuleContext(IntervalExprContext.class,0);
		}
		public PrivateExprOfDbContext privateExprOfDb() {
			return getRuleContext(PrivateExprOfDbContext.class,0);
		}
		public TerminalNode AND_() { return getToken(PostgreSQLStatementParser.AND_, 0); }
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_simpleExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(1085);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1086);
				literal();
				}
				break;
			case 3:
				{
				setState(1087);
				columnName();
				}
				break;
			case 4:
				{
				setState(1088);
				variable();
				}
				break;
			case 5:
				{
				setState(1089);
				match(PLUS_);
				setState(1090);
				simpleExpr(12);
				}
				break;
			case 6:
				{
				setState(1091);
				match(MINUS_);
				setState(1092);
				simpleExpr(11);
				}
				break;
			case 7:
				{
				setState(1093);
				match(TILDE_);
				setState(1094);
				simpleExpr(10);
				}
				break;
			case 8:
				{
				setState(1095);
				match(NOT_);
				setState(1096);
				simpleExpr(9);
				}
				break;
			case 9:
				{
				setState(1097);
				match(BINARY);
				setState(1098);
				simpleExpr(8);
				}
				break;
			case 10:
				{
				setState(1099);
				exprList();
				}
				break;
			case 11:
				{
				setState(1100);
				match(ROW);
				setState(1101);
				exprList();
				}
				break;
			case 12:
				{
				setState(1102);
				subquery();
				}
				break;
			case 13:
				{
				setState(1103);
				match(EXISTS);
				setState(1104);
				subquery();
				}
				break;
			case 14:
				{
				setState(1105);
				caseExpress();
				}
				break;
			case 15:
				{
				setState(1106);
				intervalExpr();
				}
				break;
			case 16:
				{
				setState(1107);
				privateExprOfDb();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1110);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1111);
						match(AND_);
						setState(1112);
						simpleExpr(14);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1113);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1114);
						collateClause();
						}
						break;
					}
					} 
				}
				setState(1119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			match(IDENTIFIER_);
			setState(1121);
			match(LP_);
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1122);
				distinct();
				}
			}

			setState(1127);
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
			case ARRAY:
			case EXTRACT:
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
				setState(1125);
				exprs();
				}
				break;
			case ASTERISK_:
				{
				setState(1126);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1129);
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
		public TerminalNode DISTINCT() { return getToken(PostgreSQLStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
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
		enterRule(_localctx, 122, RULE_intervalExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
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
		enterRule(_localctx, 124, RULE_caseExpress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
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
		public AggregateExpressionContext aggregateExpression() {
			return getRuleContext(AggregateExpressionContext.class,0);
		}
		public WindowFunctionContext windowFunction() {
			return getRuleContext(WindowFunctionContext.class,0);
		}
		public ArrayConstructorWithCastContext arrayConstructorWithCast() {
			return getRuleContext(ArrayConstructorWithCastContext.class,0);
		}
		public TerminalNode TIMESTAMP() { return getToken(PostgreSQLStatementParser.TIMESTAMP, 0); }
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(PostgreSQLStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(PostgreSQLStatementParser.ZONE, 0); }
		public ExtractFromFunctionContext extractFromFunction() {
			return getRuleContext(ExtractFromFunctionContext.class,0);
		}
		public PrivateExprOfDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateExprOfDb; }
	}

	public final PrivateExprOfDbContext privateExprOfDb() throws RecognitionException {
		PrivateExprOfDbContext _localctx = new PrivateExprOfDbContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_privateExprOfDb);
		int _la;
		try {
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1137);
				aggregateExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				windowFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1139);
				arrayConstructorWithCast();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1140);
				match(TIMESTAMP);
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1141);
					match(WITH);
					setState(1142);
					match(TIME);
					setState(1143);
					match(ZONE);
					}
				}

				setState(1146);
				match(STRING_);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1147);
				extractFromFunction();
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
		enterRule(_localctx, 128, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
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
		public TerminalNode TRUE() { return getToken(PostgreSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PostgreSQLStatementParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode LBE_() { return getToken(PostgreSQLStatementParser.LBE_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public TerminalNode RBE_() { return getToken(PostgreSQLStatementParser.RBE_, 0); }
		public TerminalNode HEX_DIGIT_() { return getToken(PostgreSQLStatementParser.HEX_DIGIT_, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode DATE() { return getToken(PostgreSQLStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(PostgreSQLStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(PostgreSQLStatementParser.TIMESTAMP, 0); }
		public TerminalNode BIT_NUM_() { return getToken(PostgreSQLStatementParser.BIT_NUM_, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_literal);
		int _la;
		try {
			setState(1177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1152);
				question();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1153);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1154);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1155);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1156);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1157);
				match(LBE_);
				setState(1158);
				match(IDENTIFIER_);
				setState(1159);
				match(STRING_);
				setState(1160);
				match(RBE_);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1161);
				match(HEX_DIGIT_);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1162);
				string();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1163);
				match(IDENTIFIER_);
				setState(1164);
				match(STRING_);
				setState(1166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(1165);
					collateClause();
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1168);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATE) | (1L << TIME) | (1L << TIMESTAMP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1169);
				match(STRING_);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER_) {
					{
					setState(1170);
					match(IDENTIFIER_);
					}
				}

				setState(1173);
				match(BIT_NUM_);
				setState(1175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1174);
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
		public TerminalNode QUESTION_() { return getToken(PostgreSQLStatementParser.QUESTION_, 0); }
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
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
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
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
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
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
		enterRule(_localctx, 138, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
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
		public TerminalNode COLLATE() { return getToken(PostgreSQLStatementParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public CollateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause; }
	}

	public final CollateClauseContext collateClause() throws RecognitionException {
		CollateClauseContext _localctx = new CollateClauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_collateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			match(COLLATE);
			setState(1188);
			collationName();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ORDER() { return getToken(PostgreSQLStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(PostgreSQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PostgreSQLStatementParser.DESC, 0); }
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(PostgreSQLStatementParser.NULLS, 0); }
		public TerminalNode FIRST() { return getToken(PostgreSQLStatementParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(PostgreSQLStatementParser.LAST, 0); }
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			match(ORDER);
			setState(1191);
			match(BY);
			setState(1192);
			expr(0);
			setState(1197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
				{
				setState(1193);
				match(ASC);
				}
				break;
			case DESC:
				{
				setState(1194);
				match(DESC);
				}
				break;
			case USING:
				{
				setState(1195);
				match(USING);
				setState(1196);
				operator();
				}
				break;
			case ROWS:
			case NULLS:
			case RANGE:
			case RP_:
			case COMMA_:
				break;
			default:
				break;
			}
			setState(1201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1199);
				match(NULLS);
				setState(1200);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
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
		public TerminalNode ASC() { return getToken(PostgreSQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PostgreSQLStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1203);
				columnName();
				}
				break;
			case 2:
				{
				setState(1204);
				number();
				}
				break;
			case 3:
				{
				setState(1205);
				expr(0);
				}
				break;
			}
			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1208);
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
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public AsteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asterisk; }
	}

	public final AsteriskContext asterisk() throws RecognitionException {
		AsteriskContext _localctx = new AsteriskContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_asterisk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			columnName();
			setState(1214);
			dataType();
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(1215);
				collateClause();
				}
			}

			setState(1221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (KEY - 21)) | (1L << (NOT - 21)) | (1L << (NULL - 21)) | (1L << (PRIMARY - 21)) | (1L << (CHECK - 21)) | (1L << (CONSTRAINT - 21)) | (1L << (DEFAULT - 21)) | (1L << (GENERATED - 21)) | (1L << (REFERENCES - 21)) | (1L << (UNIQUE - 21)))) != 0)) {
				{
				{
				setState(1218);
				columnConstraint();
				}
				}
				setState(1223);
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

	public static class ColumnConstraintContext extends ParserRuleContext {
		public ColumnConstraintOptionContext columnConstraintOption() {
			return getRuleContext(ColumnConstraintOptionContext.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public ConstraintClauseContext constraintClause() {
			return getRuleContext(ConstraintClauseContext.class,0);
		}
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_columnConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1224);
				constraintClause();
				}
			}

			setState(1227);
			columnConstraintOption();
			setState(1228);
			constraintOptionalParam();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintClauseContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintClause; }
	}

	public final ConstraintClauseContext constraintClause() throws RecognitionException {
		ConstraintClauseContext _localctx = new ConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_constraintClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			match(CONSTRAINT);
			setState(1231);
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

	public static class ColumnConstraintOptionContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public CheckOptionContext checkOption() {
			return getRuleContext(CheckOptionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public DefaultExprContext defaultExpr() {
			return getRuleContext(DefaultExprContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(PostgreSQLStatementParser.GENERATED, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public SequenceOptionsContext sequenceOptions() {
			return getRuleContext(SequenceOptionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public IndexParametersContext indexParameters() {
			return getRuleContext(IndexParametersContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode REFERENCES() { return getToken(PostgreSQLStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(PostgreSQLStatementParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLStatementParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(PostgreSQLStatementParser.PARTIAL, 0); }
		public TerminalNode SIMPLE() { return getToken(PostgreSQLStatementParser.SIMPLE, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public TerminalNode DELETE() { return getToken(PostgreSQLStatementParser.DELETE, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public List<ForeignKeyOnActionContext> foreignKeyOnAction() {
			return getRuleContexts(ForeignKeyOnActionContext.class);
		}
		public ForeignKeyOnActionContext foreignKeyOnAction(int i) {
			return getRuleContext(ForeignKeyOnActionContext.class,i);
		}
		public ColumnConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraintOption; }
	}

	public final ColumnConstraintOptionContext columnConstraintOption() throws RecognitionException {
		ColumnConstraintOptionContext _localctx = new ColumnConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_columnConstraintOption);
		int _la;
		try {
			setState(1286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1233);
					match(NOT);
					}
				}

				setState(1236);
				match(NULL);
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1237);
				checkOption();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1238);
				match(DEFAULT);
				setState(1239);
				defaultExpr();
				}
				break;
			case GENERATED:
				enterOuterAlt(_localctx, 4);
				{
				setState(1240);
				match(GENERATED);
				setState(1244);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALWAYS:
					{
					setState(1241);
					match(ALWAYS);
					}
					break;
				case BY:
					{
					setState(1242);
					match(BY);
					setState(1243);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1246);
				match(AS);
				setState(1247);
				match(IDENTITY);
				setState(1252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1248);
					match(LP_);
					setState(1249);
					sequenceOptions();
					setState(1250);
					match(RP_);
					}
				}

				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1254);
				match(UNIQUE);
				setState(1255);
				indexParameters();
				}
				break;
			case KEY:
			case PRIMARY:
				enterOuterAlt(_localctx, 6);
				{
				setState(1256);
				primaryKey();
				setState(1257);
				indexParameters();
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 7);
				{
				setState(1259);
				match(REFERENCES);
				setState(1260);
				tableName();
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1261);
					match(LP_);
					setState(1262);
					columnName();
					setState(1263);
					match(RP_);
					}
				}

				setState(1273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1267);
					match(MATCH);
					setState(1268);
					match(FULL);
					}
					break;
				case 2:
					{
					setState(1269);
					match(MATCH);
					setState(1270);
					match(PARTIAL);
					}
					break;
				case 3:
					{
					setState(1271);
					match(MATCH);
					setState(1272);
					match(SIMPLE);
					}
					break;
				}
				setState(1278);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1275);
					match(ON);
					setState(1276);
					match(DELETE);
					setState(1277);
					action();
					}
					break;
				}
				setState(1283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON) {
					{
					{
					setState(1280);
					foreignKeyOnAction();
					}
					}
					setState(1285);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class CheckOptionContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(PostgreSQLStatementParser.CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode INHERIT() { return getToken(PostgreSQLStatementParser.INHERIT, 0); }
		public CheckOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkOption; }
	}

	public final CheckOptionContext checkOption() throws RecognitionException {
		CheckOptionContext _localctx = new CheckOptionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_checkOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(CHECK);
			setState(1289);
			expr(0);
			setState(1292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NO) {
				{
				setState(1290);
				match(NO);
				setState(1291);
				match(INHERIT);
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

	public static class DefaultExprContext extends ParserRuleContext {
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(PostgreSQLStatementParser.CURRENT_TIMESTAMP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefaultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultExpr; }
	}

	public final DefaultExprContext defaultExpr() throws RecognitionException {
		DefaultExprContext _localctx = new DefaultExprContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_defaultExpr);
		try {
			setState(1296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1294);
				match(CURRENT_TIMESTAMP);
				}
				break;
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
			case ARRAY:
			case EXTRACT:
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
				enterOuterAlt(_localctx, 2);
				{
				setState(1295);
				expr(0);
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

	public static class SequenceOptionsContext extends ParserRuleContext {
		public List<SequenceOptionContext> sequenceOption() {
			return getRuleContexts(SequenceOptionContext.class);
		}
		public SequenceOptionContext sequenceOption(int i) {
			return getRuleContext(SequenceOptionContext.class,i);
		}
		public SequenceOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceOptions; }
	}

	public final SequenceOptionsContext sequenceOptions() throws RecognitionException {
		SequenceOptionsContext _localctx = new SequenceOptionsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_sequenceOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1298);
				sequenceOption();
				}
				}
				setState(1301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (NO - 69)) | (1L << (START - 69)) | (1L << (CACHE - 69)) | (1L << (CYCLE - 69)) | (1L << (INCREMENT - 69)))) != 0) || _la==MAXVALUE || _la==MINVALUE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceOptionContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(PostgreSQLStatementParser.START, 0); }
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public TerminalNode INCREMENT() { return getToken(PostgreSQLStatementParser.INCREMENT, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public TerminalNode MAXVALUE() { return getToken(PostgreSQLStatementParser.MAXVALUE, 0); }
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode MINVALUE() { return getToken(PostgreSQLStatementParser.MINVALUE, 0); }
		public TerminalNode CYCLE() { return getToken(PostgreSQLStatementParser.CYCLE, 0); }
		public TerminalNode CACHE() { return getToken(PostgreSQLStatementParser.CACHE, 0); }
		public SequenceOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceOption; }
	}

	public final SequenceOptionContext sequenceOption() throws RecognitionException {
		SequenceOptionContext _localctx = new SequenceOptionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_sequenceOption);
		int _la;
		try {
			setState(1326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1303);
				match(START);
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1304);
					match(WITH);
					}
				}

				setState(1307);
				match(NUMBER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1308);
				match(INCREMENT);
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(1309);
					match(BY);
					}
				}

				setState(1312);
				match(NUMBER_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1313);
				match(MAXVALUE);
				setState(1314);
				match(NUMBER_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1315);
				match(NO);
				setState(1316);
				match(MAXVALUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1317);
				match(MINVALUE);
				setState(1318);
				match(NUMBER_);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1319);
				match(NO);
				setState(1320);
				match(MINVALUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1321);
				match(CYCLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1322);
				match(NO);
				setState(1323);
				match(CYCLE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1324);
				match(CACHE);
				setState(1325);
				match(NUMBER_);
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

	public static class IndexParametersContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public IndexParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexParameters; }
	}

	public final IndexParametersContext indexParameters() throws RecognitionException {
		IndexParametersContext _localctx = new IndexParametersContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_indexParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1328);
				match(USING);
				setState(1329);
				match(INDEX);
				setState(1330);
				match(TABLESPACE);
				setState(1331);
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

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(PostgreSQLStatementParser.ACTION, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_action);
		int _la;
		try {
			setState(1340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1334);
				match(NO);
				setState(1335);
				match(ACTION);
				}
				break;
			case RESTRICT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1336);
				match(RESTRICT);
				}
				break;
			case CASCADE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1337);
				match(CASCADE);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(1338);
				match(SET);
				setState(1339);
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

	public static class ForeignKeyOnActionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public TerminalNode UPDATE() { return getToken(PostgreSQLStatementParser.UPDATE, 0); }
		public ForeignKeyOnContext foreignKeyOn() {
			return getRuleContext(ForeignKeyOnContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(PostgreSQLStatementParser.DELETE, 0); }
		public ForeignKeyOnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOnAction; }
	}

	public final ForeignKeyOnActionContext foreignKeyOnAction() throws RecognitionException {
		ForeignKeyOnActionContext _localctx = new ForeignKeyOnActionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_foreignKeyOnAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
			match(ON);
			setState(1347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPDATE:
				{
				setState(1343);
				match(UPDATE);
				setState(1344);
				foreignKeyOn();
				}
				break;
			case DELETE:
				{
				setState(1345);
				match(DELETE);
				setState(1346);
				foreignKeyOn();
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

	public static class ForeignKeyOnContext extends ParserRuleContext {
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(PostgreSQLStatementParser.ACTION, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public ForeignKeyOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOn; }
	}

	public final ForeignKeyOnContext foreignKeyOn() throws RecognitionException {
		ForeignKeyOnContext _localctx = new ForeignKeyOnContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_foreignKeyOn);
		try {
			setState(1357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1349);
				match(RESTRICT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1350);
				match(CASCADE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1351);
				match(SET);
				setState(1352);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1353);
				match(NO);
				setState(1354);
				match(ACTION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1355);
				match(SET);
				setState(1356);
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

	public static class ConstraintOptionalParamContext extends ParserRuleContext {
		public TerminalNode DEFERRABLE() { return getToken(PostgreSQLStatementParser.DEFERRABLE, 0); }
		public TerminalNode INITIALLY() { return getToken(PostgreSQLStatementParser.INITIALLY, 0); }
		public TerminalNode DEFERRED() { return getToken(PostgreSQLStatementParser.DEFERRED, 0); }
		public TerminalNode IMMEDIATE() { return getToken(PostgreSQLStatementParser.IMMEDIATE, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public ConstraintOptionalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintOptionalParam; }
	}

	public final ConstraintOptionalParamContext constraintOptionalParam() throws RecognitionException {
		ConstraintOptionalParamContext _localctx = new ConstraintOptionalParamContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_constraintOptionalParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1359);
					match(NOT);
					}
				}

				setState(1362);
				match(DEFERRABLE);
				}
				break;
			}
			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIALLY) {
				{
				setState(1365);
				match(INITIALLY);
				setState(1366);
				_la = _input.LA(1);
				if ( !(_la==DEFERRED || _la==IMMEDIATE) ) {
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public IntervalFieldsContext intervalFields() {
			return getRuleContext(IntervalFieldsContext.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public TerminalNode WITHOUT() { return getToken(PostgreSQLStatementParser.WITHOUT, 0); }
		public TerminalNode TIME() { return getToken(PostgreSQLStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(PostgreSQLStatementParser.ZONE, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public List<TerminalNode> LBT_() { return getTokens(PostgreSQLStatementParser.LBT_); }
		public TerminalNode LBT_(int i) {
			return getToken(PostgreSQLStatementParser.LBT_, i);
		}
		public List<TerminalNode> RBT_() { return getTokens(PostgreSQLStatementParser.RBT_); }
		public TerminalNode RBT_(int i) {
			return getToken(PostgreSQLStatementParser.RBT_, i);
		}
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_dataType);
		try {
			int _alt;
			setState(1392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1369);
				dataTypeName_();
				setState(1371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1370);
					intervalFields();
					}
					break;
				}
				setState(1374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1373);
					dataTypeLength();
					}
					break;
				}
				setState(1382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1376);
					match(WITHOUT);
					setState(1377);
					match(TIME);
					setState(1378);
					match(ZONE);
					}
					break;
				case 2:
					{
					setState(1379);
					match(WITH);
					setState(1380);
					match(TIME);
					setState(1381);
					match(ZONE);
					}
					break;
				}
				setState(1388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1384);
						match(LBT_);
						setState(1385);
						match(RBT_);
						}
						} 
					}
					setState(1390);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1391);
				match(IDENTIFIER_);
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
		public List<TerminalNode> IDENTIFIER_() { return getTokens(PostgreSQLStatementParser.IDENTIFIER_); }
		public TerminalNode IDENTIFIER_(int i) {
			return getToken(PostgreSQLStatementParser.IDENTIFIER_, i);
		}
		public DataTypeName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName_; }
	}

	public final DataTypeName_Context dataTypeName_() throws RecognitionException {
		DataTypeName_Context _localctx = new DataTypeName_Context(_ctx, getState());
		enterRule(_localctx, 176, RULE_dataTypeName_);
		try {
			setState(1397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1394);
				match(IDENTIFIER_);
				setState(1395);
				match(IDENTIFIER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1396);
				match(IDENTIFIER_);
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

	public static class IntervalFieldsContext extends ParserRuleContext {
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public IntervalFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalFields; }
	}

	public final IntervalFieldsContext intervalFields() throws RecognitionException {
		IntervalFieldsContext _localctx = new IntervalFieldsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_intervalFields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			intervalField();
			setState(1402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1400);
				match(TO);
				setState(1401);
				intervalField();
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

	public static class IntervalFieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(PostgreSQLStatementParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(PostgreSQLStatementParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(PostgreSQLStatementParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(PostgreSQLStatementParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(PostgreSQLStatementParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(PostgreSQLStatementParser.SECOND, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_intervalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			_la = _input.LA(1);
			if ( !(_la==DAY || _la==YEAR || ((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (HOUR - 126)) | (1L << (MINUTE - 126)) | (1L << (MONTH - 126)) | (1L << (SECOND - 126)))) != 0)) ) {
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

	public static class PgExprContext extends ParserRuleContext {
		public CastExprContext castExpr() {
			return getRuleContext(CastExprContext.class,0);
		}
		public CollateExprContext collateExpr() {
			return getRuleContext(CollateExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgExpr; }
	}

	public final PgExprContext pgExpr() throws RecognitionException {
		PgExprContext _localctx = new PgExprContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_pgExpr);
		try {
			setState(1409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1406);
				castExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1407);
				collateExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1408);
				expr(0);
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

	public static class AggregateExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public AsteriskWithParenContext asteriskWithParen() {
			return getRuleContext(AsteriskWithParenContext.class,0);
		}
		public List<TerminalNode> LP_() { return getTokens(PostgreSQLStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(PostgreSQLStatementParser.LP_, i);
		}
		public List<ExprsContext> exprs() {
			return getRuleContexts(ExprsContext.class);
		}
		public ExprsContext exprs(int i) {
			return getRuleContext(ExprsContext.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(PostgreSQLStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(PostgreSQLStatementParser.RP_, i);
		}
		public TerminalNode WITHIN() { return getToken(PostgreSQLStatementParser.WITHIN, 0); }
		public TerminalNode GROUP() { return getToken(PostgreSQLStatementParser.GROUP, 0); }
		public List<OrderByClauseContext> orderByClause() {
			return getRuleContexts(OrderByClauseContext.class);
		}
		public OrderByClauseContext orderByClause(int i) {
			return getRuleContext(OrderByClauseContext.class,i);
		}
		public FilterClauseContext filterClause() {
			return getRuleContext(FilterClauseContext.class,0);
		}
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(PostgreSQLStatementParser.DISTINCT, 0); }
		public AggregateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateExpression; }
	}

	public final AggregateExpressionContext aggregateExpression() throws RecognitionException {
		AggregateExpressionContext _localctx = new AggregateExpressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_aggregateExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
			match(IDENTIFIER_);
			{
			setState(1412);
			match(LP_);
			setState(1414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(1413);
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

			setState(1416);
			exprs();
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1417);
				orderByClause();
				}
			}

			setState(1420);
			match(RP_);
			}
			setState(1422);
			asteriskWithParen();
			{
			setState(1423);
			match(LP_);
			setState(1424);
			exprs();
			setState(1425);
			match(RP_);
			setState(1426);
			match(WITHIN);
			setState(1427);
			match(GROUP);
			setState(1428);
			match(LP_);
			setState(1429);
			orderByClause();
			setState(1430);
			match(RP_);
			}
			setState(1433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1432);
				filterClause();
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

	public static class FilterClauseContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(PostgreSQLStatementParser.FILTER, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode WHERE() { return getToken(PostgreSQLStatementParser.WHERE, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public FilterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterClause; }
	}

	public final FilterClauseContext filterClause() throws RecognitionException {
		FilterClauseContext _localctx = new FilterClauseContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_filterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
			match(FILTER);
			setState(1436);
			match(LP_);
			setState(1437);
			match(WHERE);
			setState(1438);
			booleanPrimary(0);
			setState(1439);
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

	public static class AsteriskWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public AsteriskWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asteriskWithParen; }
	}

	public final AsteriskWithParenContext asteriskWithParen() throws RecognitionException {
		AsteriskWithParenContext _localctx = new AsteriskWithParenContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_asteriskWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(LP_);
			setState(1442);
			match(ASTERISK_);
			setState(1443);
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

	public static class WindowFunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public WindowFunctionWithClauseContext windowFunctionWithClause() {
			return getRuleContext(WindowFunctionWithClauseContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public AsteriskWithParenContext asteriskWithParen() {
			return getRuleContext(AsteriskWithParenContext.class,0);
		}
		public FilterClauseContext filterClause() {
			return getRuleContext(FilterClauseContext.class,0);
		}
		public WindowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunction; }
	}

	public final WindowFunctionContext windowFunction() throws RecognitionException {
		WindowFunctionContext _localctx = new WindowFunctionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_windowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			match(IDENTIFIER_);
			setState(1448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1446);
				exprList();
				}
				break;
			case 2:
				{
				setState(1447);
				asteriskWithParen();
				}
				break;
			}
			setState(1451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER) {
				{
				setState(1450);
				filterClause();
				}
			}

			setState(1453);
			windowFunctionWithClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFunctionWithClauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(PostgreSQLStatementParser.OVER, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public WindowDefinitionContext windowDefinition() {
			return getRuleContext(WindowDefinitionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public WindowFunctionWithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunctionWithClause; }
	}

	public final WindowFunctionWithClauseContext windowFunctionWithClause() throws RecognitionException {
		WindowFunctionWithClauseContext _localctx = new WindowFunctionWithClauseContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_windowFunctionWithClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			match(OVER);
			setState(1461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				{
				setState(1456);
				match(IDENTIFIER_);
				}
				break;
			case LP_:
				{
				setState(1457);
				match(LP_);
				setState(1458);
				windowDefinition();
				setState(1459);
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

	public static class WindowDefinitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode PARTITION() { return getToken(PostgreSQLStatementParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public List<OrderByClauseContext> orderByClause() {
			return getRuleContexts(OrderByClauseContext.class);
		}
		public OrderByClauseContext orderByClause(int i) {
			return getRuleContext(OrderByClauseContext.class,i);
		}
		public FrameClauseContext frameClause() {
			return getRuleContext(FrameClauseContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public WindowDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowDefinition; }
	}

	public final WindowDefinitionContext windowDefinition() throws RecognitionException {
		WindowDefinitionContext _localctx = new WindowDefinitionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_windowDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(1463);
				match(IDENTIFIER_);
				}
			}

			setState(1469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1466);
				match(PARTITION);
				setState(1467);
				match(BY);
				setState(1468);
				exprs();
				}
			}

			setState(1479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1471);
				orderByClause();
				setState(1476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1472);
					match(COMMA_);
					setState(1473);
					orderByClause();
					}
					}
					setState(1478);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROWS || _la==RANGE) {
				{
				setState(1481);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode SAFE_EQ_() { return getToken(PostgreSQLStatementParser.SAFE_EQ_, 0); }
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public TerminalNode NEQ_() { return getToken(PostgreSQLStatementParser.NEQ_, 0); }
		public TerminalNode GT_() { return getToken(PostgreSQLStatementParser.GT_, 0); }
		public TerminalNode GTE_() { return getToken(PostgreSQLStatementParser.GTE_, 0); }
		public TerminalNode LT_() { return getToken(PostgreSQLStatementParser.LT_, 0); }
		public TerminalNode LTE_() { return getToken(PostgreSQLStatementParser.LTE_, 0); }
		public TerminalNode AND_() { return getToken(PostgreSQLStatementParser.AND_, 0); }
		public TerminalNode OR_() { return getToken(PostgreSQLStatementParser.OR_, 0); }
		public TerminalNode NOT_() { return getToken(PostgreSQLStatementParser.NOT_, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			_la = _input.LA(1);
			if ( !(((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (AND_ - 198)) | (1L << (OR_ - 198)) | (1L << (NOT_ - 198)) | (1L << (SAFE_EQ_ - 198)) | (1L << (EQ_ - 198)) | (1L << (NEQ_ - 198)) | (1L << (GT_ - 198)) | (1L << (GTE_ - 198)) | (1L << (LT_ - 198)) | (1L << (LTE_ - 198)))) != 0)) ) {
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

	public static class FrameClauseContext extends ParserRuleContext {
		public FrameStartContext frameStart() {
			return getRuleContext(FrameStartContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(PostgreSQLStatementParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(PostgreSQLStatementParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(PostgreSQLStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(PostgreSQLStatementParser.AND, 0); }
		public FrameEndContext frameEnd() {
			return getRuleContext(FrameEndContext.class,0);
		}
		public FrameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameClause; }
	}

	public final FrameClauseContext frameClause() throws RecognitionException {
		FrameClauseContext _localctx = new FrameClauseContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_frameClause);
		int _la;
		try {
			setState(1494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1486);
				_la = _input.LA(1);
				if ( !(_la==ROWS || _la==RANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1487);
				frameStart();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1488);
				_la = _input.LA(1);
				if ( !(_la==ROWS || _la==RANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1489);
				match(BETWEEN);
				setState(1490);
				frameStart();
				setState(1491);
				match(AND);
				setState(1492);
				frameEnd();
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

	public static class FrameStartContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(PostgreSQLStatementParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(PostgreSQLStatementParser.PRECEDING, 0); }
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public TerminalNode CURRENT() { return getToken(PostgreSQLStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(PostgreSQLStatementParser.ROW, 0); }
		public TerminalNode FOLLOWING() { return getToken(PostgreSQLStatementParser.FOLLOWING, 0); }
		public FrameStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameStart; }
	}

	public final FrameStartContext frameStart() throws RecognitionException {
		FrameStartContext _localctx = new FrameStartContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_frameStart);
		try {
			setState(1506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1496);
				match(UNBOUNDED);
				setState(1497);
				match(PRECEDING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1498);
				match(NUMBER_);
				setState(1499);
				match(PRECEDING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1500);
				match(CURRENT);
				setState(1501);
				match(ROW);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1502);
				match(NUMBER_);
				setState(1503);
				match(FOLLOWING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1504);
				match(UNBOUNDED);
				setState(1505);
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
		enterRule(_localctx, 202, RULE_frameEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
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

	public static class CastExprContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(PostgreSQLStatementParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COLON_() { return getTokens(PostgreSQLStatementParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(PostgreSQLStatementParser.COLON_, i);
		}
		public CastExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpr; }
	}

	public final CastExprContext castExpr() throws RecognitionException {
		CastExprContext _localctx = new CastExprContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_castExpr);
		try {
			setState(1522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1510);
				match(CAST);
				setState(1511);
				match(LP_);
				setState(1512);
				expr(0);
				setState(1513);
				match(AS);
				setState(1514);
				dataType();
				setState(1515);
				match(RP_);
				}
				break;
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
			case ARRAY:
			case EXTRACT:
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
				enterOuterAlt(_localctx, 2);
				{
				setState(1517);
				expr(0);
				setState(1518);
				match(COLON_);
				setState(1519);
				match(COLON_);
				setState(1520);
				dataType();
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

	public static class CastExprWithCOLON_Context extends ParserRuleContext {
		public List<TerminalNode> COLON_() { return getTokens(PostgreSQLStatementParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(PostgreSQLStatementParser.COLON_, i);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> LBT_() { return getTokens(PostgreSQLStatementParser.LBT_); }
		public TerminalNode LBT_(int i) {
			return getToken(PostgreSQLStatementParser.LBT_, i);
		}
		public List<TerminalNode> RBT_() { return getTokens(PostgreSQLStatementParser.RBT_); }
		public TerminalNode RBT_(int i) {
			return getToken(PostgreSQLStatementParser.RBT_, i);
		}
		public CastExprWithCOLON_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExprWithCOLON_; }
	}

	public final CastExprWithCOLON_Context castExprWithCOLON_() throws RecognitionException {
		CastExprWithCOLON_Context _localctx = new CastExprWithCOLON_Context(_ctx, getState());
		enterRule(_localctx, 206, RULE_castExprWithCOLON_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			match(COLON_);
			setState(1525);
			match(COLON_);
			setState(1526);
			dataType();
			setState(1531);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1527);
					match(LBT_);
					setState(1528);
					match(RBT_);
					}
					} 
				}
				setState(1533);
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
			exitRule();
		}
		return _localctx;
	}

	public static class CollateExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COLLATE() { return getToken(PostgreSQLStatementParser.COLLATE, 0); }
		public CollateExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateExpr; }
	}

	public final CollateExprContext collateExpr() throws RecognitionException {
		CollateExprContext _localctx = new CollateExprContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_collateExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			expr(0);
			setState(1535);
			match(COLLATE);
			setState(1536);
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

	public static class ArrayConstructorWithCastContext extends ParserRuleContext {
		public ArrayConstructorContext arrayConstructor() {
			return getRuleContext(ArrayConstructorContext.class,0);
		}
		public CastExprWithCOLON_Context castExprWithCOLON_() {
			return getRuleContext(CastExprWithCOLON_Context.class,0);
		}
		public TerminalNode ARRAY() { return getToken(PostgreSQLStatementParser.ARRAY, 0); }
		public TerminalNode LBT_() { return getToken(PostgreSQLStatementParser.LBT_, 0); }
		public TerminalNode RBT_() { return getToken(PostgreSQLStatementParser.RBT_, 0); }
		public ArrayConstructorWithCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayConstructorWithCast; }
	}

	public final ArrayConstructorWithCastContext arrayConstructorWithCast() throws RecognitionException {
		ArrayConstructorWithCastContext _localctx = new ArrayConstructorWithCastContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_arrayConstructorWithCast);
		try {
			setState(1546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1538);
				arrayConstructor();
				setState(1540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1539);
					castExprWithCOLON_();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1542);
				match(ARRAY);
				setState(1543);
				match(LBT_);
				setState(1544);
				match(RBT_);
				setState(1545);
				castExprWithCOLON_();
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

	public static class ArrayConstructorContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(PostgreSQLStatementParser.ARRAY, 0); }
		public TerminalNode LBT_() { return getToken(PostgreSQLStatementParser.LBT_, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RBT_() { return getToken(PostgreSQLStatementParser.RBT_, 0); }
		public List<ArrayConstructorContext> arrayConstructor() {
			return getRuleContexts(ArrayConstructorContext.class);
		}
		public ArrayConstructorContext arrayConstructor(int i) {
			return getRuleContext(ArrayConstructorContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public ArrayConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayConstructor; }
	}

	public final ArrayConstructorContext arrayConstructor() throws RecognitionException {
		ArrayConstructorContext _localctx = new ArrayConstructorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_arrayConstructor);
		int _la;
		try {
			setState(1565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1548);
				match(ARRAY);
				setState(1549);
				match(LBT_);
				setState(1550);
				exprs();
				setState(1551);
				match(RBT_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1553);
				match(ARRAY);
				setState(1554);
				match(LBT_);
				setState(1555);
				arrayConstructor();
				setState(1560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1556);
					match(COMMA_);
					setState(1557);
					arrayConstructor();
					}
					}
					setState(1562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1563);
				match(RBT_);
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

	public static class ExtractFromFunctionContext extends ParserRuleContext {
		public TerminalNode EXTRACT() { return getToken(PostgreSQLStatementParser.EXTRACT, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<TerminalNode> IDENTIFIER_() { return getTokens(PostgreSQLStatementParser.IDENTIFIER_); }
		public TerminalNode IDENTIFIER_(int i) {
			return getToken(PostgreSQLStatementParser.IDENTIFIER_, i);
		}
		public TerminalNode FROM() { return getToken(PostgreSQLStatementParser.FROM, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public ExtractFromFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractFromFunction; }
	}

	public final ExtractFromFunctionContext extractFromFunction() throws RecognitionException {
		ExtractFromFunctionContext _localctx = new ExtractFromFunctionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_extractFromFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			match(EXTRACT);
			setState(1568);
			match(LP_);
			setState(1569);
			match(IDENTIFIER_);
			setState(1570);
			match(FROM);
			setState(1571);
			match(IDENTIFIER_);
			setState(1572);
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

	public static class IgnoredIdentifier_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public IgnoredIdentifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier_; }
	}

	public final IgnoredIdentifier_Context ignoredIdentifier_() throws RecognitionException {
		IgnoredIdentifier_Context _localctx = new IgnoredIdentifier_Context(_ctx, getState());
		enterRule(_localctx, 216, RULE_ignoredIdentifier_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
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
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public IgnoredIdentifiers_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifiers_; }
	}

	public final IgnoredIdentifiers_Context ignoredIdentifiers_() throws RecognitionException {
		IgnoredIdentifiers_Context _localctx = new IgnoredIdentifiers_Context(_ctx, getState());
		enterRule(_localctx, 218, RULE_ignoredIdentifiers_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			ignoredIdentifier_();
			setState(1581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1577);
				match(COMMA_);
				setState(1578);
				ignoredIdentifier_();
				}
				}
				setState(1583);
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
		enterRule(_localctx, 220, RULE_matchNone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
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
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLStatementParser.TRANSACTION, 0); }
		public TerminalNode SESSION() { return getToken(PostgreSQLStatementParser.SESSION, 0); }
		public TerminalNode CHARACTERISTICS() { return getToken(PostgreSQLStatementParser.CHARACTERISTICS, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_setTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			match(SET);
			setState(1590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SESSION) {
				{
				setState(1587);
				match(SESSION);
				setState(1588);
				match(CHARACTERISTICS);
				setState(1589);
				match(AS);
				}
			}

			setState(1592);
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

	public static class BeginTransactionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PostgreSQLStatementParser.BEGIN, 0); }
		public TerminalNode START() { return getToken(PostgreSQLStatementParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLStatementParser.TRANSACTION, 0); }
		public BeginTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginTransaction; }
	}

	public final BeginTransactionContext beginTransaction() throws RecognitionException {
		BeginTransactionContext _localctx = new BeginTransactionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_beginTransaction);
		try {
			setState(1597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1594);
				match(BEGIN);
				}
				break;
			case START:
				enterOuterAlt(_localctx, 2);
				{
				setState(1595);
				match(START);
				setState(1596);
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
		public TerminalNode COMMIT() { return getToken(PostgreSQLStatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
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
		public TerminalNode ROLLBACK() { return getToken(PostgreSQLStatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601);
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
		public TerminalNode SAVEPOINT() { return getToken(PostgreSQLStatementParser.SAVEPOINT, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_savepoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
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
		public TerminalNode GRANT() { return getToken(PostgreSQLStatementParser.GRANT, 0); }
		public Privileges_Context privileges_() {
			return getRuleContext(Privileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public OnObjectClause_Context onObjectClause_() {
			return getRuleContext(OnObjectClause_Context.class,0);
		}
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_grant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			match(GRANT);
			setState(1611);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
			case CREATE:
			case DELETE:
			case REFERENCES:
			case TRUNCATE:
			case CONNECT:
			case EXECUTE:
			case INSERT:
			case SELECT:
			case TEMP:
			case TEMPORARY:
			case TRIGGER:
			case UPDATE:
			case USAGE:
				{
				setState(1606);
				privileges_();
				setState(1607);
				match(ON);
				setState(1608);
				onObjectClause_();
				}
				break;
			case IDENTIFIER_:
				{
				setState(1610);
				ignoredIdentifiers_();
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

	public static class RevokeContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(PostgreSQLStatementParser.REVOKE, 0); }
		public Privileges_Context privileges_() {
			return getRuleContext(Privileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public OnObjectClause_Context onObjectClause_() {
			return getRuleContext(OnObjectClause_Context.class,0);
		}
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public TerminalNode GRANT() { return getToken(PostgreSQLStatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(PostgreSQLStatementParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(PostgreSQLStatementParser.FOR, 0); }
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_revoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613);
			match(REVOKE);
			setState(1617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GRANT) {
				{
				setState(1614);
				match(GRANT);
				setState(1615);
				match(OPTION);
				setState(1616);
				match(FOR);
				}
			}

			setState(1624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
			case CREATE:
			case DELETE:
			case REFERENCES:
			case TRUNCATE:
			case CONNECT:
			case EXECUTE:
			case INSERT:
			case SELECT:
			case TEMP:
			case TEMPORARY:
			case TRIGGER:
			case UPDATE:
			case USAGE:
				{
				setState(1619);
				privileges_();
				setState(1620);
				match(ON);
				setState(1621);
				onObjectClause_();
				}
				break;
			case IDENTIFIER_:
				{
				setState(1623);
				ignoredIdentifiers_();
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
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public Privileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privileges_; }
	}

	public final Privileges_Context privileges_() throws RecognitionException {
		Privileges_Context _localctx = new Privileges_Context(_ctx, getState());
		enterRule(_localctx, 236, RULE_privileges_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			privilegeType_();
			setState(1628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1627);
				columnNames();
				}
			}

			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1630);
				match(COMMA_);
				setState(1631);
				privilegeType_();
				setState(1633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1632);
					columnNames();
					}
				}

				}
				}
				setState(1639);
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
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(PostgreSQLStatementParser.PRIVILEGES, 0); }
		public TerminalNode SELECT() { return getToken(PostgreSQLStatementParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(PostgreSQLStatementParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(PostgreSQLStatementParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(PostgreSQLStatementParser.DELETE, 0); }
		public TerminalNode TRUNCATE() { return getToken(PostgreSQLStatementParser.TRUNCATE, 0); }
		public TerminalNode REFERENCES() { return getToken(PostgreSQLStatementParser.REFERENCES, 0); }
		public TerminalNode TRIGGER() { return getToken(PostgreSQLStatementParser.TRIGGER, 0); }
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode CONNECT() { return getToken(PostgreSQLStatementParser.CONNECT, 0); }
		public TerminalNode TEMPORARY() { return getToken(PostgreSQLStatementParser.TEMPORARY, 0); }
		public TerminalNode TEMP() { return getToken(PostgreSQLStatementParser.TEMP, 0); }
		public TerminalNode EXECUTE() { return getToken(PostgreSQLStatementParser.EXECUTE, 0); }
		public TerminalNode USAGE() { return getToken(PostgreSQLStatementParser.USAGE, 0); }
		public PrivilegeType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeType_; }
	}

	public final PrivilegeType_Context privilegeType_() throws RecognitionException {
		PrivilegeType_Context _localctx = new PrivilegeType_Context(_ctx, getState());
		enterRule(_localctx, 238, RULE_privilegeType_);
		int _la;
		try {
			setState(1657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1640);
				match(ALL);
				setState(1642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(1641);
					match(PRIVILEGES);
					}
				}

				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1644);
				match(SELECT);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1645);
				match(INSERT);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1646);
				match(UPDATE);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1647);
				match(DELETE);
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1648);
				match(TRUNCATE);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 7);
				{
				setState(1649);
				match(REFERENCES);
				}
				break;
			case TRIGGER:
				enterOuterAlt(_localctx, 8);
				{
				setState(1650);
				match(TRIGGER);
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1651);
				match(CREATE);
				}
				break;
			case CONNECT:
				enterOuterAlt(_localctx, 10);
				{
				setState(1652);
				match(CONNECT);
				}
				break;
			case TEMPORARY:
				enterOuterAlt(_localctx, 11);
				{
				setState(1653);
				match(TEMPORARY);
				}
				break;
			case TEMP:
				enterOuterAlt(_localctx, 12);
				{
				setState(1654);
				match(TEMP);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 13);
				{
				setState(1655);
				match(EXECUTE);
				}
				break;
			case USAGE:
				enterOuterAlt(_localctx, 14);
				{
				setState(1656);
				match(USAGE);
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

	public static class OnObjectClause_Context extends ParserRuleContext {
		public TerminalNode SEQUENCE() { return getToken(PostgreSQLStatementParser.SEQUENCE, 0); }
		public TerminalNode DATABASE() { return getToken(PostgreSQLStatementParser.DATABASE, 0); }
		public TerminalNode DOMAIN() { return getToken(PostgreSQLStatementParser.DOMAIN, 0); }
		public TerminalNode FOREIGN() { return getToken(PostgreSQLStatementParser.FOREIGN, 0); }
		public TerminalNode FUNCTION() { return getToken(PostgreSQLStatementParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(PostgreSQLStatementParser.PROCEDURE, 0); }
		public TerminalNode ROUTINE() { return getToken(PostgreSQLStatementParser.ROUTINE, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode LANGUAGE() { return getToken(PostgreSQLStatementParser.LANGUAGE, 0); }
		public TerminalNode LARGE() { return getToken(PostgreSQLStatementParser.LARGE, 0); }
		public TerminalNode OBJECT() { return getToken(PostgreSQLStatementParser.OBJECT, 0); }
		public TerminalNode SCHEMA() { return getToken(PostgreSQLStatementParser.SCHEMA, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public TerminalNode TYPE() { return getToken(PostgreSQLStatementParser.TYPE, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public OnObjectClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onObjectClause_; }
	}

	public final OnObjectClause_Context onObjectClause_() throws RecognitionException {
		OnObjectClause_Context _localctx = new OnObjectClause_Context(_ctx, getState());
		enterRule(_localctx, 240, RULE_onObjectClause_);
		int _la;
		try {
			setState(1684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEQUENCE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1659);
				match(SEQUENCE);
				}
				break;
			case DATABASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1660);
				match(DATABASE);
				}
				break;
			case DOMAIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1661);
				match(DOMAIN);
				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1662);
				match(FOREIGN);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 5);
				{
				setState(1663);
				match(FUNCTION);
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1664);
				match(PROCEDURE);
				}
				break;
			case ROUTINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1665);
				match(ROUTINE);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1666);
				match(ALL);
				}
				break;
			case LANGUAGE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1667);
				match(LANGUAGE);
				}
				break;
			case LARGE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1668);
				match(LARGE);
				setState(1669);
				match(OBJECT);
				}
				break;
			case SCHEMA:
				enterOuterAlt(_localctx, 11);
				{
				setState(1670);
				match(SCHEMA);
				}
				break;
			case TABLESPACE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1671);
				match(TABLESPACE);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 13);
				{
				setState(1672);
				match(TYPE);
				}
				break;
			case TABLE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 14);
				{
				setState(1674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(1673);
					match(TABLE);
					}
				}

				setState(1676);
				tableName();
				setState(1681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1677);
					match(COMMA_);
					setState(1678);
					tableName();
					}
					}
					setState(1683);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class CreateUserContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
			match(CREATE);
			setState(1687);
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
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_dropUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			match(DROP);
			setState(1690);
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
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
			match(ALTER);
			setState(1693);
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
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			match(CREATE);
			setState(1696);
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
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			match(DROP);
			setState(1699);
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
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public AlterRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRole; }
	}

	public final AlterRoleContext alterRole() throws RecognitionException {
		AlterRoleContext _localctx = new AlterRoleContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_alterRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			match(ALTER);
			setState(1702);
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

	public static class ShowContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(PostgreSQLStatementParser.SHOW, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLStatementParser.TRANSACTION, 0); }
		public TerminalNode ISOLATION() { return getToken(PostgreSQLStatementParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(PostgreSQLStatementParser.LEVEL, 0); }
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			match(SHOW);
			setState(1710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(1705);
				match(ALL);
				}
				break;
			case IDENTIFIER_:
				{
				setState(1706);
				match(IDENTIFIER_);
				}
				break;
			case TRANSACTION:
				{
				setState(1707);
				match(TRANSACTION);
				setState(1708);
				match(ISOLATION);
				setState(1709);
				match(LEVEL);
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

	public static class SetParamContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public SetParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setParam; }
	}

	public final SetParamContext setParam() throws RecognitionException {
		SetParamContext _localctx = new SetParamContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_setParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			match(SET);
			setState(1714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL || _la==SESSION) {
				{
				setState(1713);
				scope();
				}
			}

			setState(1716);
			setClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeContext extends ParserRuleContext {
		public TerminalNode SESSION() { return getToken(PostgreSQLStatementParser.SESSION, 0); }
		public TerminalNode LOCAL() { return getToken(PostgreSQLStatementParser.LOCAL, 0); }
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			_la = _input.LA(1);
			if ( !(_la==LOCAL || _la==SESSION) ) {
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

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(PostgreSQLStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(PostgreSQLStatementParser.ZONE, 0); }
		public TimeZoneTypeContext timeZoneType() {
			return getRuleContext(TimeZoneTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_setClause);
		int _la;
		try {
			setState(1726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1720);
				match(TIME);
				setState(1721);
				match(ZONE);
				setState(1722);
				timeZoneType();
				}
				break;
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1723);
				match(IDENTIFIER_);
				setState(1724);
				_la = _input.LA(1);
				if ( !(_la==TO || _la==EQ_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1725);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==STRING_) ) {
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

	public static class TimeZoneTypeContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public TerminalNode LOCAL() { return getToken(PostgreSQLStatementParser.LOCAL, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public TimeZoneTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneType; }
	}

	public final TimeZoneTypeContext timeZoneType() throws RecognitionException {
		TimeZoneTypeContext _localctx = new TimeZoneTypeContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_timeZoneType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT || _la==LOCAL || _la==NUMBER_) ) {
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

	public static class ResetParamContext extends ParserRuleContext {
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public ResetParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetParam; }
	}

	public final ResetParamContext resetParam() throws RecognitionException {
		ResetParamContext _localctx = new ResetParamContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_resetParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			match(RESET);
			setState(1731);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==IDENTIFIER_) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 52:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 54:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 57:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 58:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00f4\u06c8\4\2\t"+
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
		"\t\u0085\4\u0086\t\u0086\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0124\n\2\3\2\5\2\u0127"+
		"\n\2\3\3\3\3\5\3\u012b\n\3\3\3\3\3\5\3\u012f\n\3\3\3\3\3\3\3\5\3\u0134"+
		"\n\3\3\3\5\3\u0137\n\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\u013f\n\4\3\4\3\4\5"+
		"\4\u0143\n\4\3\4\3\4\3\4\7\4\u0148\n\4\f\4\16\4\u014b\13\4\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u0152\n\5\3\6\3\6\3\6\5\6\u0157\n\6\3\7\3\7\3\7\3\7\5\7\u015d"+
		"\n\7\3\7\3\7\3\7\5\7\u0162\n\7\3\b\3\b\5\b\u0166\n\b\3\b\5\b\u0169\n\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u0171\n\t\3\t\3\t\3\t\7\t\u0176\n\t\f\t\16"+
		"\t\u0179\13\t\3\n\3\n\3\n\3\n\5\n\u017f\n\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0198\n\r\3\16\3\16\3\16\7\16\u019d\n\16\f\16\16\16\u01a0\13\16\3\17"+
		"\3\17\5\17\u01a4\n\17\3\20\3\20\5\20\u01a8\n\20\3\20\3\20\5\20\u01ac\n"+
		"\20\3\20\3\20\3\20\3\20\5\20\u01b2\n\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\7\21\u01ba\n\21\f\21\16\21\u01bd\13\21\5\21\u01bf\n\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u01c8\n\22\f\22\16\22\u01cb\13\22\5\22\u01cd"+
		"\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u01d7\n\24\f\24\16"+
		"\24\u01da\13\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u01e2\n\25\3\25\5\25"+
		"\u01e5\n\25\3\25\3\25\5\25\u01e9\n\25\3\26\3\26\3\26\7\26\u01ee\n\26\f"+
		"\26\16\26\u01f1\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0203\n\27\3\27\3\27\5\27\u0207\n"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u020e\n\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u021e\n\27\3\27\5\27"+
		"\u0221\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0239\n\27\f\27"+
		"\16\27\u023c\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0245\n\27"+
		"\f\27\16\27\u0248\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u025a\n\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0264\n\27\5\27\u0266\n\27\3\30\3\30\5\30\u026a"+
		"\n\30\3\30\3\30\5\30\u026e\n\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\5\31"+
		"\u0277\n\31\3\31\3\31\3\31\5\31\u027c\n\31\3\31\3\31\3\32\3\32\5\32\u0282"+
		"\n\32\3\32\3\32\5\32\u0286\n\32\3\32\3\32\5\32\u028a\n\32\3\33\3\33\3"+
		"\33\5\33\u028f\n\33\3\33\3\33\3\33\5\33\u0294\n\33\3\33\3\33\5\33\u0298"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02ae\n\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u02b6\n\33\3\33\3\33\3\33\7\33\u02bb\n\33\f\33\16\33\u02be"+
		"\13\33\3\33\3\33\3\33\3\33\3\33\5\33\u02c5\n\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u02dd\n\33\3\34\3\34\5\34\u02e1\n\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u02ea\n\35\3\35\5\35\u02ed\n\35\3\35\3"+
		"\35\5\35\u02f1\n\35\3\35\5\35\u02f4\n\35\5\35\u02f6\n\35\3\36\3\36\3\36"+
		"\7\36\u02fb\n\36\f\36\16\36\u02fe\13\36\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \5 \u0308\n \3 \5 \u030b\n \3!\3!\5!\u030f\n!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\3%\3%\5%\u0325\n%\3%\3%\3&\3&\3&"+
		"\3&\3\'\3\'\3\'\3(\5(\u0331\n(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u034b\n)\3)\7)\u034e\n)\f)\16)\u0351"+
		"\13)\5)\u0353\n)\3*\3*\5*\u0357\n*\3*\5*\u035a\n*\3*\5*\u035d\n*\3*\3"+
		"*\5*\u0361\n*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\5\61\u0373\n\61\5\61\u0375\n\61\3\61\3\61\3\62\5\62\u037a\n\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\7\63\u0382\n\63\f\63\16\63\u0385\13\63\3\63"+
		"\3\63\3\64\3\64\3\64\7\64\u038c\n\64\f\64\16\64\u038f\13\64\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u03a0\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\7\66\u03b1\n\66\f\66\16\66\u03b4\13\66\3\67\3\67\38\3"+
		"8\38\38\38\38\58\u03be\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\78\u03cd"+
		"\n8\f8\168\u03d0\138\39\39\3:\3:\5:\u03d6\n:\3:\3:\3:\3:\3:\5:\u03dd\n"+
		":\3:\3:\3:\3:\3:\7:\u03e4\n:\f:\16:\u03e7\13:\3:\3:\3:\3:\5:\u03ed\n:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u03fb\n:\3:\3:\3:\3:\7:\u0401"+
		"\n:\f:\16:\u0404\13:\3:\3:\5:\u0408\n:\3:\3:\3:\3:\5:\u040e\n:\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\7;\u043a\n;\f;\16;\u043d"+
		"\13;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\5<\u0457\n<\3<\3<\3<\3<\3<\7<\u045e\n<\f<\16<\u0461\13<\3=\3="+
		"\3=\5=\u0466\n=\3=\3=\5=\u046a\n=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3A"+
		"\3A\3A\3A\5A\u047b\nA\3A\3A\5A\u047f\nA\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\5C\u0491\nC\3C\3C\3C\5C\u0496\nC\3C\3C\5C\u049a\nC"+
		"\5C\u049c\nC\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\5I"+
		"\u04b0\nI\3I\3I\5I\u04b4\nI\3J\3J\3J\5J\u04b9\nJ\3J\5J\u04bc\nJ\3K\3K"+
		"\3L\3L\3L\5L\u04c3\nL\3L\7L\u04c6\nL\fL\16L\u04c9\13L\3M\5M\u04cc\nM\3"+
		"M\3M\3M\3N\3N\3N\3O\5O\u04d5\nO\3O\3O\3O\3O\3O\3O\3O\3O\5O\u04df\nO\3"+
		"O\3O\3O\3O\3O\3O\5O\u04e7\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u04f4"+
		"\nO\3O\3O\3O\3O\3O\3O\5O\u04fc\nO\3O\3O\3O\5O\u0501\nO\3O\7O\u0504\nO"+
		"\fO\16O\u0507\13O\5O\u0509\nO\3P\3P\3P\3P\5P\u050f\nP\3Q\3Q\5Q\u0513\n"+
		"Q\3R\6R\u0516\nR\rR\16R\u0517\3S\3S\5S\u051c\nS\3S\3S\3S\5S\u0521\nS\3"+
		"S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0531\nS\3T\3T\3T\3T\5T\u0537"+
		"\nT\3U\3U\3U\3U\3U\3U\5U\u053f\nU\3V\3V\3V\3V\3V\5V\u0546\nV\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\5W\u0550\nW\3X\5X\u0553\nX\3X\5X\u0556\nX\3X\3X\5X\u055a"+
		"\nX\3Y\3Y\5Y\u055e\nY\3Y\5Y\u0561\nY\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0569\nY\3Y"+
		"\3Y\7Y\u056d\nY\fY\16Y\u0570\13Y\3Y\5Y\u0573\nY\3Z\3Z\3Z\5Z\u0578\nZ\3"+
		"[\3[\3[\5[\u057d\n[\3\\\3\\\3]\3]\3]\5]\u0584\n]\3^\3^\3^\5^\u0589\n^"+
		"\3^\3^\5^\u058d\n^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u059c\n^"+
		"\3_\3_\3_\3_\3_\3_\3`\3`\3`\3`\3a\3a\3a\5a\u05ab\na\3a\5a\u05ae\na\3a"+
		"\3a\3b\3b\3b\3b\3b\3b\5b\u05b8\nb\3c\5c\u05bb\nc\3c\3c\3c\5c\u05c0\nc"+
		"\3c\3c\3c\7c\u05c5\nc\fc\16c\u05c8\13c\5c\u05ca\nc\3c\5c\u05cd\nc\3d\3"+
		"d\3e\3e\3e\3e\3e\3e\3e\3e\5e\u05d9\ne\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5"+
		"f\u05e5\nf\3g\3g\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u05f5\nh\3i\3"+
		"i\3i\3i\3i\7i\u05fc\ni\fi\16i\u05ff\13i\3j\3j\3j\3j\3k\3k\5k\u0607\nk"+
		"\3k\3k\3k\3k\5k\u060d\nk\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\7l\u0619\nl\fl"+
		"\16l\u061c\13l\3l\3l\5l\u0620\nl\3m\3m\3m\3m\3m\3m\3m\3n\3n\3o\3o\3o\7"+
		"o\u062e\no\fo\16o\u0631\13o\3p\3p\3q\3q\3q\3q\5q\u0639\nq\3q\3q\3r\3r"+
		"\3r\5r\u0640\nr\3s\3s\3t\3t\3u\3u\3v\3v\3v\3v\3v\3v\5v\u064e\nv\3w\3w"+
		"\3w\3w\5w\u0654\nw\3w\3w\3w\3w\3w\5w\u065b\nw\3x\3x\5x\u065f\nx\3x\3x"+
		"\3x\5x\u0664\nx\7x\u0666\nx\fx\16x\u0669\13x\3y\3y\5y\u066d\ny\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\5y\u067c\ny\3z\3z\3z\3z\3z\3z\3z\3z\3"+
		"z\3z\3z\3z\3z\3z\3z\5z\u068d\nz\3z\3z\3z\7z\u0692\nz\fz\16z\u0695\13z"+
		"\5z\u0697\nz\3{\3{\3{\3|\3|\3|\3}\3}\3}\3~\3~\3~\3\177\3\177\3\177\3\u0080"+
		"\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081"+
		"\u06b1\n\u0081\3\u0082\3\u0082\5\u0082\u06b5\n\u0082\3\u0082\3\u0082\3"+
		"\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084"+
		"\u06c1\n\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\2\6jnt"+
		"v\u0087\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\2 \4\2~~\u008e\u008e\3\2\u00b9\u00ba\4\2qq\u0084"+
		"\u0084\t\2\5\5ccffll\u0081\u0081\u0086\u0086\u00b6\u00b7\4\2\62\62\u00a8"+
		"\u00a8\4\2<<>>\4\2\60\60\u00a5\u00a5\4\2,,\u00c5\u00c5\4\2\u008f\u008f"+
		"\u00be\u00be\4\2$$==\6\2ssuu\u0090\u0090\u00a0\u00a0\6\2\\]|}\177\177"+
		"\u00b5\u00b5\4\2\b\b\r\r\4\2xx\u008d\u008d\3\2\u00f0\u00f1\6\2\21\21\34"+
		"\34((**\4\2\5\5\7\7\3\2\u00dc\u00e1\4\2\f\f&\'\4\2\34\34::\4\2nn\u0083"+
		"\u0083\b\299XX\u0080\u0080\u0093\u0093\u0095\u0095\u00ad\u00ad\4\2\5\5"+
		"\16\16\5\2\u00c8\u00ca\u00da\u00da\u00dc\u00e1\4\2PP\u00a3\u00a3\4\2\u008e"+
		"\u008e\u00b1\u00b1\4\2SS\u00dc\u00dc\4\2::\u00f1\u00f1\5\2::\u008e\u008e"+
		"\u00f2\u00f2\4\2\5\5\u00f0\u00f0\2\u07a1\2\u0123\3\2\2\2\4\u0128\3\2\2"+
		"\2\6\u013b\3\2\2\2\b\u0151\3\2\2\2\n\u0153\3\2\2\2\f\u0161\3\2\2\2\16"+
		"\u0163\3\2\2\2\20\u016c\3\2\2\2\22\u017a\3\2\2\2\24\u0182\3\2\2\2\26\u0186"+
		"\3\2\2\2\30\u018e\3\2\2\2\32\u0199\3\2\2\2\34\u01a1\3\2\2\2\36\u01a5\3"+
		"\2\2\2 \u01b5\3\2\2\2\"\u01cc\3\2\2\2$\u01ce\3\2\2\2&\u01d1\3\2\2\2(\u01dd"+
		"\3\2\2\2*\u01ea\3\2\2\2,\u0265\3\2\2\2.\u0269\3\2\2\2\60\u0274\3\2\2\2"+
		"\62\u027f\3\2\2\2\64\u02dc\3\2\2\2\66\u02de\3\2\2\28\u02f5\3\2\2\2:\u02f7"+
		"\3\2\2\2<\u02ff\3\2\2\2>\u0303\3\2\2\2@\u030c\3\2\2\2B\u0314\3\2\2\2D"+
		"\u031a\3\2\2\2F\u031e\3\2\2\2H\u0320\3\2\2\2J\u0328\3\2\2\2L\u032c\3\2"+
		"\2\2N\u0330\3\2\2\2P\u0352\3\2\2\2R\u0356\3\2\2\2T\u0362\3\2\2\2V\u0364"+
		"\3\2\2\2X\u0366\3\2\2\2Z\u0368\3\2\2\2\\\u036a\3\2\2\2^\u036c\3\2\2\2"+
		"`\u036e\3\2\2\2b\u0379\3\2\2\2d\u037d\3\2\2\2f\u0388\3\2\2\2h\u0390\3"+
		"\2\2\2j\u039f\3\2\2\2l\u03b5\3\2\2\2n\u03b7\3\2\2\2p\u03d1\3\2\2\2r\u040d"+
		"\3\2\2\2t\u040f\3\2\2\2v\u0456\3\2\2\2x\u0462\3\2\2\2z\u046d\3\2\2\2|"+
		"\u046f\3\2\2\2~\u0471\3\2\2\2\u0080\u047e\3\2\2\2\u0082\u0480\3\2\2\2"+
		"\u0084\u049b\3\2\2\2\u0086\u049d\3\2\2\2\u0088\u049f\3\2\2\2\u008a\u04a1"+
		"\3\2\2\2\u008c\u04a3\3\2\2\2\u008e\u04a5\3\2\2\2\u0090\u04a8\3\2\2\2\u0092"+
		"\u04b8\3\2\2\2\u0094\u04bd\3\2\2\2\u0096\u04bf\3\2\2\2\u0098\u04cb\3\2"+
		"\2\2\u009a\u04d0\3\2\2\2\u009c\u0508\3\2\2\2\u009e\u050a\3\2\2\2\u00a0"+
		"\u0512\3\2\2\2\u00a2\u0515\3\2\2\2\u00a4\u0530\3\2\2\2\u00a6\u0536\3\2"+
		"\2\2\u00a8\u053e\3\2\2\2\u00aa\u0540\3\2\2\2\u00ac\u054f\3\2\2\2\u00ae"+
		"\u0555\3\2\2\2\u00b0\u0572\3\2\2\2\u00b2\u0577\3\2\2\2\u00b4\u0579\3\2"+
		"\2\2\u00b6\u057e\3\2\2\2\u00b8\u0583\3\2\2\2\u00ba\u0585\3\2\2\2\u00bc"+
		"\u059d\3\2\2\2\u00be\u05a3\3\2\2\2\u00c0\u05a7\3\2\2\2\u00c2\u05b1\3\2"+
		"\2\2\u00c4\u05ba\3\2\2\2\u00c6\u05ce\3\2\2\2\u00c8\u05d8\3\2\2\2\u00ca"+
		"\u05e4\3\2\2\2\u00cc\u05e6\3\2\2\2\u00ce\u05f4\3\2\2\2\u00d0\u05f6\3\2"+
		"\2\2\u00d2\u0600\3\2\2\2\u00d4\u060c\3\2\2\2\u00d6\u061f\3\2\2\2\u00d8"+
		"\u0621\3\2\2\2\u00da\u0628\3\2\2\2\u00dc\u062a\3\2\2\2\u00de\u0632\3\2"+
		"\2\2\u00e0\u0634\3\2\2\2\u00e2\u063f\3\2\2\2\u00e4\u0641\3\2\2\2\u00e6"+
		"\u0643\3\2\2\2\u00e8\u0645\3\2\2\2\u00ea\u0647\3\2\2\2\u00ec\u064f\3\2"+
		"\2\2\u00ee\u065c\3\2\2\2\u00f0\u067b\3\2\2\2\u00f2\u0696\3\2\2\2\u00f4"+
		"\u0698\3\2\2\2\u00f6\u069b\3\2\2\2\u00f8\u069e\3\2\2\2\u00fa\u06a1\3\2"+
		"\2\2\u00fc\u06a4\3\2\2\2\u00fe\u06a7\3\2\2\2\u0100\u06aa\3\2\2\2\u0102"+
		"\u06b2\3\2\2\2\u0104\u06b8\3\2\2\2\u0106\u06c0\3\2\2\2\u0108\u06c2\3\2"+
		"\2\2\u010a\u06c4\3\2\2\2\u010c\u0124\5\4\3\2\u010d\u0124\5\b\5\2\u010e"+
		"\u0124\5\6\4\2\u010f\u0124\5\n\6\2\u0110\u0124\5\f\7\2\u0111\u0124\5\20"+
		"\t\2\u0112\u0124\5\16\b\2\u0113\u0124\5\u00e0q\2\u0114\u0124\5\u00e2r"+
		"\2\u0115\u0124\5\u00e4s\2\u0116\u0124\5\u00e6t\2\u0117\u0124\5\u00e8u"+
		"\2\u0118\u0124\5\u00eav\2\u0119\u0124\5\u00ecw\2\u011a\u0124\5\u00f4{"+
		"\2\u011b\u0124\5\u00f6|\2\u011c\u0124\5\u00f8}\2\u011d\u0124\5\u00fa~"+
		"\2\u011e\u0124\5\u00fc\177\2\u011f\u0124\5\u00fe\u0080\2\u0120\u0124\5"+
		"\u0100\u0081\2\u0121\u0124\5\u0102\u0082\2\u0122\u0124\5\u010a\u0086\2"+
		"\u0123\u010c\3\2\2\2\u0123\u010d\3\2\2\2\u0123\u010e\3\2\2\2\u0123\u010f"+
		"\3\2\2\2\u0123\u0110\3\2\2\2\u0123\u0111\3\2\2\2\u0123\u0112\3\2\2\2\u0123"+
		"\u0113\3\2\2\2\u0123\u0114\3\2\2\2\u0123\u0115\3\2\2\2\u0123\u0116\3\2"+
		"\2\2\u0123\u0117\3\2\2\2\u0123\u0118\3\2\2\2\u0123\u0119\3\2\2\2\u0123"+
		"\u011a\3\2\2\2\u0123\u011b\3\2\2\2\u0123\u011c\3\2\2\2\u0123\u011d\3\2"+
		"\2\2\u0123\u011e\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0127\7\u00ef"+
		"\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\3\3\2\2\2\u0128\u012a"+
		"\7\67\2\2\u0129\u012b\7V\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012e\7D\2\2\u012d\u012f\7d\2\2\u012e\u012d\3\2\2"+
		"\2\u012e\u012f\3\2\2\2\u012f\u0136\3\2\2\2\u0130\u0131\7\u0082\2\2\u0131"+
		"\u0132\7\33\2\2\u0132\u0134\7\20\2\2\u0133\u0130\3\2\2\2\u0133\u0134\3"+
		"\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\5\\/\2\u0136\u0133\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7H\2\2\u0139\u013a\5V,"+
		"\2\u013a\5\3\2\2\2\u013b\u013c\7=\2\2\u013c\u013e\7D\2\2\u013d\u013f\7"+
		"d\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0142\3\2\2\2\u0140"+
		"\u0141\7\u0082\2\2\u0141\u0143\7\20\2\2\u0142\u0140\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0149\5\\/\2\u0145\u0146\7\u00e9\2"+
		"\2\u0146\u0148\5\\/\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\7\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014d\5\22\n\2\u014d\u014e\5\24\13\2\u014e\u0152\3\2\2\2\u014f\u0152"+
		"\5\26\f\2\u0150\u0152\5\30\r\2\u0151\u014c\3\2\2\2\u0151\u014f\3\2\2\2"+
		"\u0151\u0150\3\2\2\2\u0152\t\3\2\2\2\u0153\u0154\5\36\20\2\u0154\u0156"+
		"\5 \21\2\u0155\u0157\5&\24\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\13\3\2\2\2\u0158\u015c\5(\25\2\u0159\u015d\5*\26\2\u015a\u015d\5@!\2"+
		"\u015b\u015d\5B\"\2\u015c\u0159\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015b"+
		"\3\2\2\2\u015d\u0162\3\2\2\2\u015e\u015f\5H%\2\u015f\u0160\5J&\2\u0160"+
		"\u0162\3\2\2\2\u0161\u0158\3\2\2\2\u0161\u015e\3\2\2\2\u0162\r\3\2\2\2"+
		"\u0163\u0165\7U\2\2\u0164\u0166\7R\2\2\u0165\u0164\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0169\7\u009b\2\2\u0168\u0167\3\2\2"+
		"\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\5\32\16\2\u016b"+
		"\17\3\2\2\2\u016c\u016d\7=\2\2\u016d\u0170\7R\2\2\u016e\u016f\7\u0082"+
		"\2\2\u016f\u0171\7\20\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0177\5V,\2\u0173\u0174\7\u00e9\2\2\u0174\u0176\5"+
		"V,\2\u0175\u0173\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\21\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7/\2\2"+
		"\u017b\u017e\7D\2\2\u017c\u017d\7\u0082\2\2\u017d\u017f\7\20\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\5\\"+
		"/\2\u0181\23\3\2\2\2\u0182\u0183\7\u00a4\2\2\u0183\u0184\7S\2\2\u0184"+
		"\u0185\5\\/\2\u0185\25\3\2\2\2\u0186\u0187\7/\2\2\u0187\u0188\7D\2\2\u0188"+
		"\u0189\5\\/\2\u0189\u018a\7o\2\2\u018a\u018b\7H\2\2\u018b\u018c\7t\2\2"+
		"\u018c\u018d\5\u00dan\2\u018d\27\3\2\2\2\u018e\u018f\7/\2\2\u018f\u0190"+
		"\7D\2\2\u0190\u0191\7\5\2\2\u0191\u0192\7\25\2\2\u0192\u0193\7\u00b8\2"+
		"\2\u0193\u0197\5\\/\2\u0194\u0195\7\u009d\2\2\u0195\u0196\7\13\2\2\u0196"+
		"\u0198\5\u00dco\2\u0197\u0194\3\2\2\2\u0197\u0198\3\2\2\2\u0198\31\3\2"+
		"\2\2\u0199\u019e\5\34\17\2\u019a\u019b\7\u00e9\2\2\u019b\u019d\5\34\17"+
		"\2\u019c\u019a\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\33\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3\5V,\2\u01a2"+
		"\u01a4\7\u00d5\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\35\3"+
		"\2\2\2\u01a5\u01ab\7\67\2\2\u01a6\u01a8\t\2\2\2\u01a7\u01a6\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ac\t\3\2\2\u01aa\u01ac\7\u00be"+
		"\2\2\u01ab\u01a7\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01b1\7R\2\2\u01ae\u01af\7\u0082\2\2\u01af\u01b0"+
		"\7\33\2\2\u01b0\u01b2\7\20\2\2\u01b1\u01ae\3\2\2\2\u01b1\u01b2\3\2\2\2"+
		"\u01b2\u01b3\3\2\2\2\u01b3\u01b4\5V,\2\u01b4\37\3\2\2\2\u01b5\u01be\7"+
		"\u00e3\2\2\u01b6\u01bb\5\"\22\2\u01b7\u01b8\7\u00e9\2\2\u01b8\u01ba\5"+
		"\"\22\2\u01b9\u01b7\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01b6\3\2"+
		"\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\7\u00e4\2\2\u01c1"+
		"!\3\2\2\2\u01c2\u01cd\5\u0096L\2\u01c3\u01cd\5N(\2\u01c4\u01c5\7\30\2"+
		"\2\u01c5\u01c9\5V,\2\u01c6\u01c8\5$\23\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb"+
		"\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cc\u01c2\3\2\2\2\u01cc\u01c3\3\2\2\2\u01cc\u01c4\3\2"+
		"\2\2\u01cd#\3\2\2\2\u01ce\u01cf\t\4\2\2\u01cf\u01d0\t\5\2\2\u01d0%\3\2"+
		"\2\2\u01d1\u01d2\7\u0088\2\2\u01d2\u01d3\7\u00e3\2\2\u01d3\u01d8\5V,\2"+
		"\u01d4\u01d5\7\u00e9\2\2\u01d5\u01d7\5V,\2\u01d6\u01d4\3\2\2\2\u01d7\u01da"+
		"\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2\2\2\u01da"+
		"\u01d8\3\2\2\2\u01db\u01dc\7\u00e4\2\2\u01dc\'\3\2\2\2\u01dd\u01de\7/"+
		"\2\2\u01de\u01e1\7R\2\2\u01df\u01e0\7\u0082\2\2\u01e0\u01e2\7\20\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e5\7\u009b"+
		"\2\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e8\5V,\2\u01e7\u01e9\7\u00d5\2\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3"+
		"\2\2\2\u01e9)\3\2\2\2\u01ea\u01ef\5,\27\2\u01eb\u01ec\7\u00e9\2\2\u01ec"+
		"\u01ee\5,\27\2\u01ed\u01eb\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2"+
		"\2\2\u01ef\u01f0\3\2\2\2\u01f0+\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u0266"+
		"\5\60\31\2\u01f3\u0266\5\62\32\2\u01f4\u0266\5\64\33\2\u01f5\u0266\5>"+
		" \2\u01f6\u01f7\7/\2\2\u01f7\u01f8\7\66\2\2\u01f8\u01f9\5\u00dan\2\u01f9"+
		"\u01fa\5\u00aeX\2\u01fa\u0266\3\2\2\2\u01fb\u01fc\7\u00c3\2\2\u01fc\u01fd"+
		"\7\66\2\2\u01fd\u0266\5\u00dan\2\u01fe\u01ff\7=\2\2\u01ff\u0202\7\66\2"+
		"\2\u0200\u0201\7\u0082\2\2\u0201\u0203\7\20\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\5\u00dan\2\u0205\u0207"+
		"\t\6\2\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0266\3\2\2\2\u0208"+
		"\u0209\t\7\2\2\u0209\u020d\7\u00bb\2\2\u020a\u020e\5\u00dan\2\u020b\u020e"+
		"\7\5\2\2\u020c\u020e\7W\2\2\u020d\u020a\3\2\2\2\u020d\u020b\3\2\2\2\u020d"+
		"\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0266\3\2\2\2\u020f\u0210\7>"+
		"\2\2\u0210\u0211\t\b\2\2\u0211\u0212\7\u00bb\2\2\u0212\u0266\5\u00dan"+
		"\2\u0213\u0214\t\7\2\2\u0214\u0215\7\u00aa\2\2\u0215\u0266\5\u00dan\2"+
		"\u0216\u0217\7>\2\2\u0217\u0218\t\b\2\2\u0218\u0219\7\u00aa\2\2\u0219"+
		"\u0266\5\u00dan\2\u021a\u0221\7<\2\2\u021b\u0221\7>\2\2\u021c\u021e\7"+
		"G\2\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u0221\7z\2\2\u0220\u021a\3\2\2\2\u0220\u021b\3\2\2\2\u0220\u021d\3\2"+
		"\2\2\u0221\u0222\3\2\2\2\u0222\u0223\7#\2\2\u0223\u0224\7F\2\2\u0224\u0266"+
		"\7\u00ae\2\2\u0225\u0226\7a\2\2\u0226\u0227\7H\2\2\u0227\u0266\5\\/\2"+
		"\u0228\u0229\7$\2\2\u0229\u022a\7\u00c5\2\2\u022a\u0266\7a\2\2\u022b\u022c"+
		"\7$\2\2\u022c\u022d\t\t\2\2\u022d\u0266\7\u009a\2\2\u022e\u022f\7$\2\2"+
		"\u022f\u0230\7\u00b8\2\2\u0230\u0266\5\u00dan\2\u0231\u0232\7$\2\2\u0232"+
		"\u0266\t\n\2\2\u0233\u0234\7$\2\2\u0234\u0235\7\u00e3\2\2\u0235\u023a"+
		"\5D#\2\u0236\u0237\7\u00e9\2\2\u0237\u0239\5D#\2\u0238\u0236\3\2\2\2\u0239"+
		"\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d\3\2"+
		"\2\2\u023c\u023a\3\2\2\2\u023d\u023e\7\u00e4\2\2\u023e\u0266\3\2\2\2\u023f"+
		"\u0240\7\u00a6\2\2\u0240\u0241\7\u00e3\2\2\u0241\u0246\5F$\2\u0242\u0243"+
		"\7\u00e9\2\2\u0243\u0245\5F$\2\u0244\u0242\3\2\2\2\u0245\u0248\3\2\2\2"+
		"\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\3\2\2\2\u0248\u0246"+
		"\3\2\2\2\u0249\u024a\7\u00e4\2\2\u024a\u0266\3\2\2\2\u024b\u024c\7\u0087"+
		"\2\2\u024c\u0266\5V,\2\u024d\u024e\7G\2\2\u024e\u024f\7\u0087\2\2\u024f"+
		"\u0266\5V,\2\u0250\u0251\7\u0099\2\2\u0251\u0266\5\u00b2Z\2\u0252\u0253"+
		"\7\33\2\2\u0253\u0266\7\u0099\2\2\u0254\u0255\7\u009e\2\2\u0255\u0259"+
		"\7S\2\2\u0256\u025a\5\u00dan\2\u0257\u025a\7h\2\2\u0258\u025a\7\u00b2"+
		"\2\2\u0259\u0256\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u0258\3\2\2\2\u025a"+
		"\u0266\3\2\2\2\u025b\u025c\7\u00a5\2\2\u025c\u0263\7\u0081\2\2\u025d\u0264"+
		"\7:\2\2\u025e\u025f\7\u00c1\2\2\u025f\u0260\7D\2\2\u0260\u0264\5\\/\2"+
		"\u0261\u0264\7{\2\2\u0262\u0264\7\u0096\2\2\u0263\u025d\3\2\2\2\u0263"+
		"\u025e\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0262\3\2\2\2\u0264\u0266\3\2"+
		"\2\2\u0265\u01f2\3\2\2\2\u0265\u01f3\3\2\2\2\u0265\u01f4\3\2\2\2\u0265"+
		"\u01f5\3\2\2\2\u0265\u01f6\3\2\2\2\u0265\u01fb\3\2\2\2\u0265\u01fe\3\2"+
		"\2\2\u0265\u0208\3\2\2\2\u0265\u020f\3\2\2\2\u0265\u0213\3\2\2\2\u0265"+
		"\u0216\3\2\2\2\u0265\u0220\3\2\2\2\u0265\u0225\3\2\2\2\u0265\u0228\3\2"+
		"\2\2\u0265\u022b\3\2\2\2\u0265\u022e\3\2\2\2\u0265\u0231\3\2\2\2\u0265"+
		"\u0233\3\2\2\2\u0265\u023f\3\2\2\2\u0265\u024b\3\2\2\2\u0265\u024d\3\2"+
		"\2\2\u0265\u0250\3\2\2\2\u0265\u0252\3\2\2\2\u0265\u0254\3\2\2\2\u0265"+
		"\u025b\3\2\2\2\u0266-\3\2\2\2\u0267\u0268\7\66\2\2\u0268\u026a\5\u00da"+
		"n\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026d\3\2\2\2\u026b"+
		"\u026e\7V\2\2\u026c\u026e\5b\62\2\u026d\u026b\3\2\2\2\u026d\u026c\3\2"+
		"\2\2\u026e\u026f\3\2\2\2\u026f\u0270\7\u00c1\2\2\u0270\u0271\7D\2\2\u0271"+
		"\u0272\5\\/\2\u0272\u0273\5\u00aeX\2\u0273/\3\2\2\2\u0274\u0276\7.\2\2"+
		"\u0275\u0277\7\64\2\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027b"+
		"\3\2\2\2\u0278\u0279\7\u0082\2\2\u0279\u027a\7\33\2\2\u027a\u027c\7\20"+
		"\2\2\u027b\u0278\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u027e\5\u0096L\2\u027e\61\3\2\2\2\u027f\u0281\7=\2\2\u0280\u0282\7\64"+
		"\2\2\u0281\u0280\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0285\3\2\2\2\u0283"+
		"\u0284\7\u0082\2\2\u0284\u0286\7\20\2\2\u0285\u0283\3\2\2\2\u0285\u0286"+
		"\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0289\5X-\2\u0288\u028a\t\6\2\2\u0289"+
		"\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\63\3\2\2\2\u028b\u028e\5\66\34"+
		"\2\u028c\u028d\7$\2\2\u028d\u028f\7j\2\2\u028e\u028c\3\2\2\2\u028e\u028f"+
		"\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\7\u00bc\2\2\u0291\u0293\5\u00b0"+
		"Y\2\u0292\u0294\5\u008eH\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0297\3\2\2\2\u0295\u0296\7\u00c1\2\2\u0296\u0298\5v<\2\u0297\u0295\3"+
		"\2\2\2\u0297\u0298\3\2\2\2\u0298\u02dd\3\2\2\2\u0299\u029a\5\66\34\2\u029a"+
		"\u029b\7$\2\2\u029b\u029c\7:\2\2\u029c\u029d\5j\66\2\u029d\u02dd\3\2\2"+
		"\2\u029e\u029f\5\66\34\2\u029f\u02a0\7=\2\2\u02a0\u02a1\7:\2\2\u02a1\u02dd"+
		"\3\2\2\2\u02a2\u02a3\5\66\34\2\u02a3\u02a4\t\13\2\2\u02a4\u02a5\7\33\2"+
		"\2\u02a5\u02a6\7\34\2\2\u02a6\u02dd\3\2\2\2\u02a7\u02a8\5\66\34\2\u02a8"+
		"\u02a9\7.\2\2\u02a9\u02ad\7B\2\2\u02aa\u02ae\7\60\2\2\u02ab\u02ac\7\13"+
		"\2\2\u02ac\u02ae\7:\2\2\u02ad\u02aa\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b0\7\61\2\2\u02b0\u02b5\7\u0081\2\2\u02b1\u02b2"+
		"\7\u00e3\2\2\u02b2\u02b3\5\u00a2R\2\u02b3\u02b4\7\u00e4\2\2\u02b4\u02b6"+
		"\3\2\2\2\u02b5\u02b1\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02dd\3\2\2\2\u02b7"+
		"\u02b8\5\66\34\2\u02b8\u02bc\58\35\2\u02b9\u02bb\58\35\2\u02ba\u02b9\3"+
		"\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"\u02dd\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c0\5\66\34\2\u02c0\u02c1\7"+
		"=\2\2\u02c1\u02c4\7\u0081\2\2\u02c2\u02c3\7\u0082\2\2\u02c3\u02c5\7\20"+
		"\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02dd\3\2\2\2\u02c6"+
		"\u02c7\5\66\34\2\u02c7\u02c8\7$\2\2\u02c8\u02c9\7\u00b6\2\2\u02c9\u02ca"+
		"\7\u00f2\2\2\u02ca\u02dd\3\2\2\2\u02cb\u02cc\5\66\34\2\u02cc\u02cd\7$"+
		"\2\2\u02cd\u02ce\7\u00e3\2\2\u02ce\u02cf\5:\36\2\u02cf\u02d0\7\u00e4\2"+
		"\2\u02d0\u02dd\3\2\2\2\u02d1\u02d2\5\66\34\2\u02d2\u02d3\7\u00a6\2\2\u02d3"+
		"\u02d4\7\u00e3\2\2\u02d4\u02d5\5:\36\2\u02d5\u02d6\7\u00e4\2\2\u02d6\u02dd"+
		"\3\2\2\2\u02d7\u02d8\5\66\34\2\u02d8\u02d9\7$\2\2\u02d9\u02da\7\u00b7"+
		"\2\2\u02da\u02db\t\f\2\2\u02db\u02dd\3\2\2\2\u02dc\u028b\3\2\2\2\u02dc"+
		"\u0299\3\2\2\2\u02dc\u029e\3\2\2\2\u02dc\u02a2\3\2\2\2\u02dc\u02a7\3\2"+
		"\2\2\u02dc\u02b7\3\2\2\2\u02dc\u02bf\3\2\2\2\u02dc\u02c6\3\2\2\2\u02dc"+
		"\u02cb\3\2\2\2\u02dc\u02d1\3\2\2\2\u02dc\u02d7\3\2\2\2\u02dd\65\3\2\2"+
		"\2\u02de\u02e0\7/\2\2\u02df\u02e1\7\64\2\2\u02e0\u02df\3\2\2\2\u02e0\u02e1"+
		"\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\5X-\2\u02e3\67\3\2\2\2\u02e4"+
		"\u02ec\7$\2\2\u02e5\u02e9\7B\2\2\u02e6\u02ea\7\60\2\2\u02e7\u02e8\7\13"+
		"\2\2\u02e8\u02ea\7:\2\2\u02e9\u02e6\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea"+
		"\u02ed\3\2\2\2\u02eb\u02ed\5\u00a4S\2\u02ec\u02e5\3\2\2\2\u02ec\u02eb"+
		"\3\2\2\2\u02ed\u02f6\3\2\2\2\u02ee\u02f3\7\u00a7\2\2\u02ef\u02f1\7,\2"+
		"\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4"+
		"\7\u00f2\2\2\u02f3\u02f0\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f6\3\2\2"+
		"\2\u02f5\u02e4\3\2\2\2\u02f5\u02ee\3\2\2\2\u02f69\3\2\2\2\u02f7\u02fc"+
		"\5<\37\2\u02f8\u02f9\7\u00e9\2\2\u02f9\u02fb\5<\37\2\u02fa\u02f8\3\2\2"+
		"\2\u02fb\u02fe\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd;"+
		"\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ff\u0300\7\u00f0\2\2\u0300\u0301\7\u00dc"+
		"\2\2\u0301\u0302\5v<\2\u0302=\3\2\2\2\u0303\u030a\7.\2\2\u0304\u0307\5"+
		"N(\2\u0305\u0306\7\33\2\2\u0306\u0308\7\u00c2\2\2\u0307\u0305\3\2\2\2"+
		"\u0307\u0308\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u030b\5.\30\2\u030a\u0304"+
		"\3\2\2\2\u030a\u0309\3\2\2\2\u030b?\3\2\2\2\u030c\u030e\7\u00a4\2\2\u030d"+
		"\u030f\7\64\2\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3"+
		"\2\2\2\u0310\u0311\5X-\2\u0311\u0312\7S\2\2\u0312\u0313\5X-\2\u0313A\3"+
		"\2\2\2\u0314\u0315\7\u00a4\2\2\u0315\u0316\7\66\2\2\u0316\u0317\5\u00da"+
		"n\2\u0317\u0318\7S\2\2\u0318\u0319\5\u00dan\2\u0319C\3\2\2\2\u031a\u031b"+
		"\5F$\2\u031b\u031c\7\u00dc\2\2\u031c\u031d\5v<\2\u031dE\3\2\2\2\u031e"+
		"\u031f\7\u00f0\2\2\u031fG\3\2\2\2\u0320\u0321\7/\2\2\u0321\u0324\7R\2"+
		"\2\u0322\u0323\7\u0082\2\2\u0323\u0325\7\20\2\2\u0324\u0322\3\2\2\2\u0324"+
		"\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\5V,\2\u0327I\3\2\2\2\u0328"+
		"\u0329\7\u00a4\2\2\u0329\u032a\7S\2\2\u032a\u032b\5V,\2\u032bK\3\2\2\2"+
		"\u032c\u032d\7\u00c1\2\2\u032d\u032e\t\r\2\2\u032eM\3\2\2\2\u032f\u0331"+
		"\5\u009aN\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\3\2\2"+
		"\2\u0332\u0333\5P)\2\u0333\u0334\5\u00aeX\2\u0334O\3\2\2\2\u0335\u0353"+
		"\5\u009eP\2\u0336\u0337\7V\2\2\u0337\u0338\5d\63\2\u0338\u0339\5\u00a6"+
		"T\2\u0339\u0353\3\2\2\2\u033a\u033b\5b\62\2\u033b\u033c\5d\63\2\u033c"+
		"\u033d\5\u00a6T\2\u033d\u0353\3\2\2\2\u033e\u033f\7@\2\2\u033f\u0340\7"+
		"\27\2\2\u0340\u0341\5d\63\2\u0341\u0342\7L\2\2\u0342\u0343\5V,\2\u0343"+
		"\u034a\5d\63\2\u0344\u0345\7\u0091\2\2\u0345\u034b\7{\2\2\u0346\u0347"+
		"\7\u0091\2\2\u0347\u034b\7\u009f\2\2\u0348\u0349\7\u0091\2\2\u0349\u034b"+
		"\7\u00b4\2\2\u034a\u0344\3\2\2\2\u034a\u0346\3\2\2\2\u034a\u0348\3\2\2"+
		"\2\u034a\u034b\3\2\2\2\u034b\u034f\3\2\2\2\u034c\u034e\5\u00aaV\2\u034d"+
		"\u034c\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2\2\u034f\u0350\3\2"+
		"\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2\2\2\u0352\u0335\3\2\2\2\u0352"+
		"\u0336\3\2\2\2\u0352\u033a\3\2\2\2\u0352\u033e\3\2\2\2\u0353Q\3\2\2\2"+
		"\u0354\u0357\5X-\2\u0355\u0357\5j\66\2\u0356\u0354\3\2\2\2\u0356\u0355"+
		"\3\2\2\2\u0357\u0359\3\2\2\2\u0358\u035a\5\u00dan\2\u0359\u0358\3\2\2"+
		"\2\u0359\u035a\3\2\2\2\u035a\u035c\3\2\2\2\u035b\u035d\t\16\2\2\u035c"+
		"\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035f\7\u0097"+
		"\2\2\u035f\u0361\t\17\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361"+
		"S\3\2\2\2\u0362\u0363\7\u00f0\2\2\u0363U\3\2\2\2\u0364\u0365\7\u00f0\2"+
		"\2\u0365W\3\2\2\2\u0366\u0367\7\u00f0\2\2\u0367Y\3\2\2\2\u0368\u0369\t"+
		"\20\2\2\u0369[\3\2\2\2\u036a\u036b\7\u00f0\2\2\u036b]\3\2\2\2\u036c\u036d"+
		"\7\u00f0\2\2\u036d_\3\2\2\2\u036e\u0374\7\u00e3\2\2\u036f\u0372\7\u00f2"+
		"\2\2\u0370\u0371\7\u00e9\2\2\u0371\u0373\7\u00f2\2\2\u0372\u0370\3\2\2"+
		"\2\u0372\u0373\3\2\2\2\u0373\u0375\3\2\2\2\u0374\u036f\3\2\2\2\u0374\u0375"+
		"\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\7\u00e4\2\2\u0377a\3\2\2\2\u0378"+
		"\u037a\7!\2\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\3\2"+
		"\2\2\u037b\u037c\7\27\2\2\u037cc\3\2\2\2\u037d\u037e\7\u00e3\2\2\u037e"+
		"\u0383\5X-\2\u037f\u0380\7\u00e9\2\2\u0380\u0382\5X-\2\u0381\u037f\3\2"+
		"\2\2\u0382\u0385\3\2\2\2\u0383\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384"+
		"\u0386\3\2\2\2\u0385\u0383\3\2\2\2\u0386\u0387\7\u00e4\2\2\u0387e\3\2"+
		"\2\2\u0388\u038d\5j\66\2\u0389\u038a\7\u00e9\2\2\u038a\u038c\5j\66\2\u038b"+
		"\u0389\3\2\2\2\u038c\u038f\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2"+
		"\2\2\u038eg\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u0391\7\u00e3\2\2\u0391"+
		"\u0392\5f\64\2\u0392\u0393\7\u00e4\2\2\u0393i\3\2\2\2\u0394\u0395\b\66"+
		"\1\2\u0395\u0396\7\u00e3\2\2\u0396\u0397\5j\66\2\u0397\u0398\7\u00e4\2"+
		"\2\u0398\u03a0\3\2\2\2\u0399\u039a\7\33\2\2\u039a\u03a0\5j\66\b\u039b"+
		"\u039c\7\u00ca\2\2\u039c\u03a0\5j\66\7\u039d\u03a0\5n8\2\u039e\u03a0\5"+
		"l\67\2\u039f\u0394\3\2\2\2\u039f\u0399\3\2\2\2\u039f\u039b\3\2\2\2\u039f"+
		"\u039d\3\2\2\2\u039f\u039e\3\2\2\2\u03a0\u03b2\3\2\2\2\u03a1\u03a2\f\f"+
		"\2\2\u03a2\u03a3\7\6\2\2\u03a3\u03b1\5j\66\r\u03a4\u03a5\f\13\2\2\u03a5"+
		"\u03a6\7\u00c8\2\2\u03a6\u03b1\5j\66\f\u03a7\u03a8\f\n\2\2\u03a8\u03a9"+
		"\7-\2\2\u03a9\u03b1\5j\66\13\u03aa\u03ab\f\6\2\2\u03ab\u03ac\7\36\2\2"+
		"\u03ac\u03b1\5j\66\7\u03ad\u03ae\f\5\2\2\u03ae\u03af\7\u00c9\2\2\u03af"+
		"\u03b1\5j\66\6\u03b0\u03a1\3\2\2\2\u03b0\u03a4\3\2\2\2\u03b0\u03a7\3\2"+
		"\2\2\u03b0\u03aa\3\2\2\2\u03b0\u03ad\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2"+
		"\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3k\3\2\2\2\u03b4\u03b2\3\2\2\2"+
		"\u03b5\u03b6\5\u00dep\2\u03b6m\3\2\2\2\u03b7\u03b8\b8\1\2\u03b8\u03b9"+
		"\5r:\2\u03b9\u03ce\3\2\2\2\u03ba\u03bb\f\7\2\2\u03bb\u03bd\7\26\2\2\u03bc"+
		"\u03be\7\33\2\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\3"+
		"\2\2\2\u03bf\u03cd\t\21\2\2\u03c0\u03c1\f\6\2\2\u03c1\u03c2\7\u00da\2"+
		"\2\u03c2\u03cd\5r:\2\u03c3\u03c4\f\5\2\2\u03c4\u03c5\5p9\2\u03c5\u03c6"+
		"\5r:\2\u03c6\u03cd\3\2\2\2\u03c7\u03c8\f\4\2\2\u03c8\u03c9\5p9\2\u03c9"+
		"\u03ca\t\22\2\2\u03ca\u03cb\5\u008cG\2\u03cb\u03cd\3\2\2\2\u03cc\u03ba"+
		"\3\2\2\2\u03cc\u03c0\3\2\2\2\u03cc\u03c3\3\2\2\2\u03cc\u03c7\3\2\2\2\u03cd"+
		"\u03d0\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cfo\3\2\2\2"+
		"\u03d0\u03ce\3\2\2\2\u03d1\u03d2\t\23\2\2\u03d2q\3\2\2\2\u03d3\u03d5\5"+
		"t;\2\u03d4\u03d6\7\33\2\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6"+
		"\u03d7\3\2\2\2\u03d7\u03d8\7\25\2\2\u03d8\u03d9\5\u008cG\2\u03d9\u040e"+
		"\3\2\2\2\u03da\u03dc\5t;\2\u03db\u03dd\7\33\2\2\u03dc\u03db\3\2\2\2\u03dc"+
		"\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\7\25\2\2\u03df\u03e0\7"+
		"\u00e3\2\2\u03e0\u03e5\5v<\2\u03e1\u03e2\7\u00e9\2\2\u03e2\u03e4\5v<\2"+
		"\u03e3\u03e1\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e5\u03e6"+
		"\3\2\2\2\u03e6\u03e8\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e8\u03e9\7\u00e4\2"+
		"\2\u03e9\u040e\3\2\2\2\u03ea\u03ec\5t;\2\u03eb\u03ed\7\33\2\2\u03ec\u03eb"+
		"\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\7\t\2\2\u03ef"+
		"\u03f0\5v<\2\u03f0\u03f1\7\6\2\2\u03f1\u03f2\5r:\2\u03f2\u040e\3\2\2\2"+
		"\u03f3\u03f4\5t;\2\u03f4\u03f5\7%\2\2\u03f5\u03f6\7\30\2\2\u03f6\u03f7"+
		"\5v<\2\u03f7\u040e\3\2\2\2\u03f8\u03fa\5t;\2\u03f9\u03fb\7\33\2\2\u03fa"+
		"\u03f9\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd\7\30"+
		"\2\2\u03fd\u0402\5v<\2\u03fe\u03ff\7\17\2\2\u03ff\u0401\5v<\2\u0400\u03fe"+
		"\3\2\2\2\u0401\u0404\3\2\2\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403"+
		"\u040e\3\2\2\2\u0404\u0402\3\2\2\2\u0405\u0407\5t;\2\u0406\u0408\7\33"+
		"\2\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409"+
		"\u040a\7\"\2\2\u040a\u040b\5v<\2\u040b\u040e\3\2\2\2\u040c\u040e\5t;\2"+
		"\u040d\u03d3\3\2\2\2\u040d\u03da\3\2\2\2\u040d\u03ea\3\2\2\2\u040d\u03f3"+
		"\3\2\2\2\u040d\u03f8\3\2\2\2\u040d\u0405\3\2\2\2\u040d\u040c\3\2\2\2\u040e"+
		"s\3\2\2\2\u040f\u0410\b;\1\2\u0410\u0411\5v<\2\u0411\u043b\3\2\2\2\u0412"+
		"\u0413\f\20\2\2\u0413\u0414\7\u00cc\2\2\u0414\u043a\5t;\21\u0415\u0416"+
		"\f\17\2\2\u0416\u0417\7\u00cd\2\2\u0417\u043a\5t;\20\u0418\u0419\f\16"+
		"\2\2\u0419\u041a\7\u00ce\2\2\u041a\u043a\5t;\17\u041b\u041c\f\r\2\2\u041c"+
		"\u041d\7\u00cf\2\2\u041d\u043a\5t;\16\u041e\u041f\f\f\2\2\u041f\u0420"+
		"\7\u00d3\2\2\u0420\u043a\5t;\r\u0421\u0422\f\13\2\2\u0422\u0423\7\u00d4"+
		"\2\2\u0423\u043a\5t;\f\u0424\u0425\f\n\2\2\u0425\u0426\7\u00d5\2\2\u0426"+
		"\u043a\5t;\13\u0427\u0428\f\t\2\2\u0428\u0429\7\u00d6\2\2\u0429\u043a"+
		"\5t;\n\u042a\u042b\f\b\2\2\u042b\u042c\7\32\2\2\u042c\u043a\5t;\t\u042d"+
		"\u042e\f\7\2\2\u042e\u042f\7\u00d1\2\2\u042f\u043a\5t;\b\u0430\u0431\f"+
		"\6\2\2\u0431\u0432\7\u00d0\2\2\u0432\u043a\5t;\7\u0433\u0434\f\5\2\2\u0434"+
		"\u0435\7\u00d3\2\2\u0435\u043a\5|?\2\u0436\u0437\f\4\2\2\u0437\u0438\7"+
		"\u00d4\2\2\u0438\u043a\5|?\2\u0439\u0412\3\2\2\2\u0439\u0415\3\2\2\2\u0439"+
		"\u0418\3\2\2\2\u0439\u041b\3\2\2\2\u0439\u041e\3\2\2\2\u0439\u0421\3\2"+
		"\2\2\u0439\u0424\3\2\2\2\u0439\u0427\3\2\2\2\u0439\u042a\3\2\2\2\u0439"+
		"\u042d\3\2\2\2\u0439\u0430\3\2\2\2\u0439\u0433\3\2\2\2\u0439\u0436\3\2"+
		"\2\2\u043a\u043d\3\2\2\2\u043b\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c"+
		"u\3\2\2\2\u043d\u043b\3\2\2\2\u043e\u043f\b<\1\2\u043f\u0457\5x=\2\u0440"+
		"\u0457\5\u0084C\2\u0441\u0457\5X-\2\u0442\u0457\5\u0082B\2\u0443\u0444"+
		"\7\u00d3\2\2\u0444\u0457\5v<\16\u0445\u0446\7\u00d4\2\2\u0446\u0457\5"+
		"v<\r\u0447\u0448\7\u00cb\2\2\u0448\u0457\5v<\f\u0449\u044a\7\u00ca\2\2"+
		"\u044a\u0457\5v<\13\u044b\u044c\7\n\2\2\u044c\u0457\5v<\n\u044d\u0457"+
		"\5h\65\2\u044e\u044f\7#\2\2\u044f\u0457\5h\65\2\u0450\u0457\5\u008cG\2"+
		"\u0451\u0452\7\20\2\2\u0452\u0457\5\u008cG\2\u0453\u0457\5~@\2\u0454\u0457"+
		"\5|?\2\u0455\u0457\5\u0080A\2\u0456\u043e\3\2\2\2\u0456\u0440\3\2\2\2"+
		"\u0456\u0441\3\2\2\2\u0456\u0442\3\2\2\2\u0456\u0443\3\2\2\2\u0456\u0445"+
		"\3\2\2\2\u0456\u0447\3\2\2\2\u0456\u0449\3\2\2\2\u0456\u044b\3\2\2\2\u0456"+
		"\u044d\3\2\2\2\u0456\u044e\3\2\2\2\u0456\u0450\3\2\2\2\u0456\u0451\3\2"+
		"\2\2\u0456\u0453\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0455\3\2\2\2\u0457"+
		"\u045f\3\2\2\2\u0458\u0459\f\17\2\2\u0459\u045a\7\u00c8\2\2\u045a\u045e"+
		"\5v<\20\u045b\u045c\f\21\2\2\u045c\u045e\5\u008eH\2\u045d\u0458\3\2\2"+
		"\2\u045d\u045b\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u045f\u0460"+
		"\3\2\2\2\u0460w\3\2\2\2\u0461\u045f\3\2\2\2\u0462\u0463\7\u00f0\2\2\u0463"+
		"\u0465\7\u00e3\2\2\u0464\u0466\5z>\2\u0465\u0464\3\2\2\2\u0465\u0466\3"+
		"\2\2\2\u0466\u0469\3\2\2\2\u0467\u046a\5f\64\2\u0468\u046a\7\u00d5\2\2"+
		"\u0469\u0467\3\2\2\2\u0469\u0468\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046b"+
		"\3\2\2\2\u046b\u046c\7\u00e4\2\2\u046cy\3\2\2\2\u046d\u046e\7\16\2\2\u046e"+
		"{\3\2\2\2\u046f\u0470\5\u00dep\2\u0470}\3\2\2\2\u0471\u0472\5\u00dep\2"+
		"\u0472\177\3\2\2\2\u0473\u047f\5\u00ba^\2\u0474\u047f\5\u00c0a\2\u0475"+
		"\u047f\5\u00d4k\2\u0476\u047a\7\'\2\2\u0477\u0478\7,\2\2\u0478\u0479\7"+
		"&\2\2\u0479\u047b\7\u00c6\2\2\u047a\u0477\3\2\2\2\u047a\u047b\3\2\2\2"+
		"\u047b\u047c\3\2\2\2\u047c\u047f\7\u00f1\2\2\u047d\u047f\5\u00d8m\2\u047e"+
		"\u0473\3\2\2\2\u047e\u0474\3\2\2\2\u047e\u0475\3\2\2\2\u047e\u0476\3\2"+
		"\2\2\u047e\u047d\3\2\2\2\u047f\u0081\3\2\2\2\u0480\u0481\5\u00dep\2\u0481"+
		"\u0083\3\2\2\2\u0482\u049c\5\u0086D\2\u0483\u049c\5\u0088E\2\u0484\u049c"+
		"\7(\2\2\u0485\u049c\7\21\2\2\u0486\u049c\7\34\2\2\u0487\u0488\7\u00e5"+
		"\2\2\u0488\u0489\7\u00f0\2\2\u0489\u048a\7\u00f1\2\2\u048a\u049c\7\u00e6"+
		"\2\2\u048b\u049c\7\u00f3\2\2\u048c\u049c\5\u008aF\2\u048d\u048e\7\u00f0"+
		"\2\2\u048e\u0490\7\u00f1\2\2\u048f\u0491\5\u008eH\2\u0490\u048f\3\2\2"+
		"\2\u0490\u0491\3\2\2\2\u0491\u049c\3\2\2\2\u0492\u0493\t\24\2\2\u0493"+
		"\u049c\7\u00f1\2\2\u0494\u0496\7\u00f0\2\2\u0495\u0494\3\2\2\2\u0495\u0496"+
		"\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0499\7\u00f4\2\2\u0498\u049a\5\u008e"+
		"H\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049c\3\2\2\2\u049b"+
		"\u0482\3\2\2\2\u049b\u0483\3\2\2\2\u049b\u0484\3\2\2\2\u049b\u0485\3\2"+
		"\2\2\u049b\u0486\3\2\2\2\u049b\u0487\3\2\2\2\u049b\u048b\3\2\2\2\u049b"+
		"\u048c\3\2\2\2\u049b\u048d\3\2\2\2\u049b\u0492\3\2\2\2\u049b\u0495\3\2"+
		"\2\2\u049c\u0085\3\2\2\2\u049d\u049e\7\u00ed\2\2\u049e\u0087\3\2\2\2\u049f"+
		"\u04a0\7\u00f2\2\2\u04a0\u0089\3\2\2\2\u04a1\u04a2\7\u00f1\2\2\u04a2\u008b"+
		"\3\2\2\2\u04a3\u04a4\5\u00dep\2\u04a4\u008d\3\2\2\2\u04a5\u04a6\7b\2\2"+
		"\u04a6\u04a7\5Z.\2\u04a7\u008f\3\2\2\2\u04a8\u04a9\7\37\2\2\u04a9\u04aa"+
		"\7\13\2\2\u04aa\u04af\5j\66\2\u04ab\u04b0\7\b\2\2\u04ac\u04b0\7\r\2\2"+
		"\u04ad\u04ae\7\u00c1\2\2\u04ae\u04b0\5\u00c6d\2\u04af\u04ab\3\2\2\2\u04af"+
		"\u04ac\3\2\2\2\u04af\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b3\3\2"+
		"\2\2\u04b1\u04b2\7\u0097\2\2\u04b2\u04b4\t\17\2\2\u04b3\u04b1\3\2\2\2"+
		"\u04b3\u04b4\3\2\2\2\u04b4\u0091\3\2\2\2\u04b5\u04b9\5X-\2\u04b6\u04b9"+
		"\5\u0088E\2\u04b7\u04b9\5j\66\2\u04b8\u04b5\3\2\2\2\u04b8\u04b6\3\2\2"+
		"\2\u04b8\u04b7\3\2\2\2\u04b9\u04bb\3\2\2\2\u04ba\u04bc\t\16\2\2\u04bb"+
		"\u04ba\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u0093\3\2\2\2\u04bd\u04be\7\u00d5"+
		"\2\2\u04be\u0095\3\2\2\2\u04bf\u04c0\5X-\2\u04c0\u04c2\5\u00b0Y\2\u04c1"+
		"\u04c3\5\u008eH\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c7"+
		"\3\2\2\2\u04c4\u04c6\5\u0098M\2\u04c5\u04c4\3\2\2\2\u04c6\u04c9\3\2\2"+
		"\2\u04c7\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u0097\3\2\2\2\u04c9\u04c7"+
		"\3\2\2\2\u04ca\u04cc\5\u009aN\2\u04cb\u04ca\3\2\2\2\u04cb\u04cc\3\2\2"+
		"\2\u04cc\u04cd\3\2\2\2\u04cd\u04ce\5\u009cO\2\u04ce\u04cf\5\u00aeX\2\u04cf"+
		"\u0099\3\2\2\2\u04d0\u04d1\7\66\2\2\u04d1\u04d2\5\u00dan\2\u04d2\u009b"+
		"\3\2\2\2\u04d3\u04d5\7\33\2\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2"+
		"\u04d5\u04d6\3\2\2\2\u04d6\u0509\7\34\2\2\u04d7\u0509\5\u009eP\2\u04d8"+
		"\u04d9\7:\2\2\u04d9\u0509\5\u00a0Q\2\u04da\u04de\7B\2\2\u04db\u04df\7"+
		"\60\2\2\u04dc\u04dd\7\13\2\2\u04dd\u04df\7:\2\2\u04de\u04db\3\2\2\2\u04de"+
		"\u04dc\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\7\61\2\2\u04e1\u04e6\7"+
		"\u0081\2\2\u04e2\u04e3\7\u00e3\2\2\u04e3\u04e4\5\u00a2R\2\u04e4\u04e5"+
		"\7\u00e4\2\2\u04e5\u04e7\3\2\2\2\u04e6\u04e2\3\2\2\2\u04e6\u04e7\3\2\2"+
		"\2\u04e7\u0509\3\2\2\2\u04e8\u04e9\7V\2\2\u04e9\u0509\5\u00a6T\2\u04ea"+
		"\u04eb\5b\62\2\u04eb\u04ec\5\u00a6T\2\u04ec\u0509\3\2\2\2\u04ed\u04ee"+
		"\7L\2\2\u04ee\u04f3\5V,\2\u04ef\u04f0\7\u00e3\2\2\u04f0\u04f1\5X-\2\u04f1"+
		"\u04f2\7\u00e4\2\2\u04f2\u04f4\3\2\2\2\u04f3\u04ef\3\2\2\2\u04f3\u04f4"+
		"\3\2\2\2\u04f4\u04fb\3\2\2\2\u04f5\u04f6\7\u0091\2\2\u04f6\u04fc\7{\2"+
		"\2\u04f7\u04f8\7\u0091\2\2\u04f8\u04fc\7\u009f\2\2\u04f9\u04fa\7\u0091"+
		"\2\2\u04fa\u04fc\7\u00b4\2\2\u04fb\u04f5\3\2\2\2\u04fb\u04f7\3\2\2\2\u04fb"+
		"\u04f9\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u0500\3\2\2\2\u04fd\u04fe\7H"+
		"\2\2\u04fe\u04ff\7;\2\2\u04ff\u0501\5\u00a8U\2\u0500\u04fd\3\2\2\2\u0500"+
		"\u0501\3\2\2\2\u0501\u0505\3\2\2\2\u0502\u0504\5\u00aaV\2\u0503\u0502"+
		"\3\2\2\2\u0504\u0507\3\2\2\2\u0505\u0503\3\2\2\2\u0505\u0506\3\2\2\2\u0506"+
		"\u0509\3\2\2\2\u0507\u0505\3\2\2\2\u0508\u04d4\3\2\2\2\u0508\u04d7\3\2"+
		"\2\2\u0508\u04d8\3\2\2\2\u0508\u04da\3\2\2\2\u0508\u04e8\3\2\2\2\u0508"+
		"\u04ea\3\2\2\2\u0508\u04ed\3\2\2\2\u0509\u009d\3\2\2\2\u050a\u050b\7\63"+
		"\2\2\u050b\u050e\5j\66\2\u050c\u050d\7G\2\2\u050d\u050f\7\u0087\2\2\u050e"+
		"\u050c\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u009f\3\2\2\2\u0510\u0513\7g"+
		"\2\2\u0511\u0513\5j\66\2\u0512\u0510\3\2\2\2\u0512\u0511\3\2\2\2\u0513"+
		"\u00a1\3\2\2\2\u0514\u0516\5\u00a4S\2\u0515\u0514\3\2\2\2\u0516\u0517"+
		"\3\2\2\2\u0517\u0515\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u00a3\3\2\2\2\u0519"+
		"\u051b\7Q\2\2\u051a\u051c\7,\2\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2"+
		"\2\u051c\u051d\3\2\2\2\u051d\u0531\7\u00f2\2\2\u051e\u0520\7\u0085\2\2"+
		"\u051f\u0521\7\13\2\2\u0520\u051f\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0522"+
		"\3\2\2\2\u0522\u0531\7\u00f2\2\2\u0523\u0524\7\u0092\2\2\u0524\u0531\7"+
		"\u00f2\2\2\u0525\u0526\7G\2\2\u0526\u0531\7\u0092\2\2\u0527\u0528\7\u0094"+
		"\2\2\u0528\u0531\7\u00f2\2\2\u0529\u052a\7G\2\2\u052a\u0531\7\u0094\2"+
		"\2\u052b\u0531\7i\2\2\u052c\u052d\7G\2\2\u052d\u0531\7i\2\2\u052e\u052f"+
		"\7^\2\2\u052f\u0531\7\u00f2\2\2\u0530\u0519\3\2\2\2\u0530\u051e\3\2\2"+
		"\2\u0530\u0523\3\2\2\2\u0530\u0525\3\2\2\2\u0530\u0527\3\2\2\2\u0530\u0529"+
		"\3\2\2\2\u0530\u052b\3\2\2\2\u0530\u052c\3\2\2\2\u0530\u052e\3\2\2\2\u0531"+
		"\u00a5\3\2\2\2\u0532\u0533\7\u00c1\2\2\u0533\u0534\7D\2\2\u0534\u0535"+
		"\7\u00b8\2\2\u0535\u0537\5\u00dan\2\u0536\u0532\3\2\2\2\u0536\u0537\3"+
		"\2\2\2\u0537\u00a7\3\2\2\2\u0538\u0539\7G\2\2\u0539\u053f\7Y\2\2\u053a"+
		"\u053f\7\u00a8\2\2\u053b\u053f\7\62\2\2\u053c\u053d\7$\2\2\u053d\u053f"+
		"\t\25\2\2\u053e\u0538\3\2\2\2\u053e\u053a\3\2\2\2\u053e\u053b\3\2\2\2"+
		"\u053e\u053c\3\2\2\2\u053f\u00a9\3\2\2\2\u0540\u0545\7H\2\2\u0541\u0542"+
		"\7\u00bf\2\2\u0542\u0546\5\u00acW\2\u0543\u0544\7;\2\2\u0544\u0546\5\u00ac"+
		"W\2\u0545\u0541\3\2\2\2\u0545\u0543\3\2\2\2\u0546\u00ab\3\2\2\2\u0547"+
		"\u0550\7\u00a8\2\2\u0548\u0550\7\62\2\2\u0549\u054a\7$\2\2\u054a\u0550"+
		"\7\34\2\2\u054b\u054c\7G\2\2\u054c\u0550\7Y\2\2\u054d\u054e\7$\2\2\u054e"+
		"\u0550\7:\2\2\u054f\u0547\3\2\2\2\u054f\u0548\3\2\2\2\u054f\u0549\3\2"+
		"\2\2\u054f\u054b\3\2\2\2\u054f\u054d\3\2\2\2\u0550\u00ad\3\2\2\2\u0551"+
		"\u0553\7\33\2\2\u0552\u0551\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0554\3"+
		"\2\2\2\u0554\u0556\7m\2\2\u0555\u0552\3\2\2\2\u0555\u0556\3\2\2\2\u0556"+
		"\u0559\3\2\2\2\u0557\u0558\7\u0089\2\2\u0558\u055a\t\26\2\2\u0559\u0557"+
		"\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u00af\3\2\2\2\u055b\u055d\5\u00b2Z"+
		"\2\u055c\u055e\5\u00b4[\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e"+
		"\u0560\3\2\2\2\u055f\u0561\5`\61\2\u0560\u055f\3\2\2\2\u0560\u0561\3\2"+
		"\2\2\u0561\u0568\3\2\2\2\u0562\u0563\7\u00c5\2\2\u0563\u0564\7&\2\2\u0564"+
		"\u0569\7\u00c6\2\2\u0565\u0566\7,\2\2\u0566\u0567\7&\2\2\u0567\u0569\7"+
		"\u00c6\2\2\u0568\u0562\3\2\2\2\u0568\u0565\3\2\2\2\u0568\u0569\3\2\2\2"+
		"\u0569\u056e\3\2\2\2\u056a\u056b\7\u00e7\2\2\u056b\u056d\7\u00e8\2\2\u056c"+
		"\u056a\3\2\2\2\u056d\u0570\3\2\2\2\u056e\u056c\3\2\2\2\u056e\u056f\3\2"+
		"\2\2\u056f\u0573\3\2\2\2\u0570\u056e\3\2\2\2\u0571\u0573\7\u00f0\2\2\u0572"+
		"\u055b\3\2\2\2\u0572\u0571\3\2\2\2\u0573\u00b1\3\2\2\2\u0574\u0575\7\u00f0"+
		"\2\2\u0575\u0578\7\u00f0\2\2\u0576\u0578\7\u00f0\2\2\u0577\u0574\3\2\2"+
		"\2\u0577\u0576\3\2\2\2\u0578\u00b3\3\2\2\2\u0579\u057c\5\u00b6\\\2\u057a"+
		"\u057b\7S\2\2\u057b\u057d\5\u00b6\\\2\u057c\u057a\3\2\2\2\u057c\u057d"+
		"\3\2\2\2\u057d\u00b5\3\2\2\2\u057e\u057f\t\27\2\2\u057f\u00b7\3\2\2\2"+
		"\u0580\u0584\5\u00ceh\2\u0581\u0584\5\u00d2j\2\u0582\u0584\5j\66\2\u0583"+
		"\u0580\3\2\2\2\u0583\u0581\3\2\2\2\u0583\u0582\3\2\2\2\u0584\u00b9\3\2"+
		"\2\2\u0585\u0586\7\u00f0\2\2\u0586\u0588\7\u00e3\2\2\u0587\u0589\t\30"+
		"\2\2\u0588\u0587\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058a\3\2\2\2\u058a"+
		"\u058c\5f\64\2\u058b\u058d\5\u0090I\2\u058c\u058b\3\2\2\2\u058c\u058d"+
		"\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u058f\7\u00e4\2\2\u058f\u0590\3\2\2"+
		"\2\u0590\u0591\5\u00be`\2\u0591\u0592\7\u00e3\2\2\u0592\u0593\5f\64\2"+
		"\u0593\u0594\7\u00e4\2\2\u0594\u0595\7\u00c4\2\2\u0595\u0596\7\23\2\2"+
		"\u0596\u0597\7\u00e3\2\2\u0597\u0598\5\u0090I\2\u0598\u0599\7\u00e4\2"+
		"\2\u0599\u059b\3\2\2\2\u059a\u059c\5\u00bc_\2\u059b\u059a\3\2\2\2\u059b"+
		"\u059c\3\2\2\2\u059c\u00bb\3\2\2\2\u059d\u059e\7w\2\2\u059e\u059f\7\u00e3"+
		"\2\2\u059f\u05a0\7+\2\2\u05a0\u05a1\5n8\2\u05a1\u05a2\7\u00e4\2\2\u05a2"+
		"\u00bd\3\2\2\2\u05a3\u05a4\7\u00e3\2\2\u05a4\u05a5\7\u00d5\2\2\u05a5\u05a6"+
		"\7\u00e4\2\2\u05a6\u00bf\3\2\2\2\u05a7\u05aa\7\u00f0\2\2\u05a8\u05ab\5"+
		"h\65\2\u05a9\u05ab\5\u00be`\2\u05aa\u05a8\3\2\2\2\u05aa\u05a9\3\2\2\2"+
		"\u05ab\u05ad\3\2\2\2\u05ac\u05ae\5\u00bc_\2\u05ad\u05ac\3\2\2\2\u05ad"+
		"\u05ae\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b0\5\u00c2b\2\u05b0\u00c1"+
		"\3\2\2\2\u05b1\u05b7\7\u009c\2\2\u05b2\u05b8\7\u00f0\2\2\u05b3\u05b4\7"+
		"\u00e3\2\2\u05b4\u05b5\5\u00c4c\2\u05b5\u05b6\7\u00e4\2\2\u05b6\u05b8"+
		"\3\2\2\2\u05b7\u05b2\3\2\2\2\u05b7\u05b3\3\2\2\2\u05b8\u00c3\3\2\2\2\u05b9"+
		"\u05bb\7\u00f0\2\2\u05ba\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bf"+
		"\3\2\2\2\u05bc\u05bd\7 \2\2\u05bd\u05be\7\13\2\2\u05be\u05c0\5f\64\2\u05bf"+
		"\u05bc\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c9\3\2\2\2\u05c1\u05c6\5\u0090"+
		"I\2\u05c2\u05c3\7\u00e9\2\2\u05c3\u05c5\5\u0090I\2\u05c4\u05c2\3\2\2\2"+
		"\u05c5\u05c8\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05ca"+
		"\3\2\2\2\u05c8\u05c6\3\2\2\2\u05c9\u05c1\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca"+
		"\u05cc\3\2\2\2\u05cb\u05cd\5\u00c8e\2\u05cc\u05cb\3\2\2\2\u05cc\u05cd"+
		"\3\2\2\2\u05cd\u00c5\3\2\2\2\u05ce\u05cf\t\31\2\2\u05cf\u00c7\3\2\2\2"+
		"\u05d0\u05d1\t\32\2\2\u05d1\u05d9\5\u00caf\2\u05d2\u05d3\t\32\2\2\u05d3"+
		"\u05d4\7\t\2\2\u05d4\u05d5\5\u00caf\2\u05d5\u05d6\7\6\2\2\u05d6\u05d7"+
		"\5\u00ccg\2\u05d7\u05d9\3\2\2\2\u05d8\u05d0\3\2\2\2\u05d8\u05d2\3\2\2"+
		"\2\u05d9\u00c9\3\2\2\2\u05da\u05db\7\u00bd\2\2\u05db\u05e5\7\u00a1\2\2"+
		"\u05dc\u05dd\7\u00f2\2\2\u05dd\u05e5\7\u00a1\2\2\u05de\u05df\78\2\2\u05df"+
		"\u05e5\7#\2\2\u05e0\u05e1\7\u00f2\2\2\u05e1\u05e5\7y\2\2\u05e2\u05e3\7"+
		"\u00bd\2\2\u05e3\u05e5\7y\2\2\u05e4\u05da\3\2\2\2\u05e4\u05dc\3\2\2\2"+
		"\u05e4\u05de\3\2\2\2\u05e4\u05e0\3\2\2\2\u05e4\u05e2\3\2\2\2\u05e5\u00cb"+
		"\3\2\2\2\u05e6\u05e7\5\u00caf\2\u05e7\u00cd\3\2\2\2\u05e8\u05e9\7_\2\2"+
		"\u05e9\u05ea\7\u00e3\2\2\u05ea\u05eb\5j\66\2\u05eb\u05ec\7\61\2\2\u05ec"+
		"\u05ed\5\u00b0Y\2\u05ed\u05ee\7\u00e4\2\2\u05ee\u05f5\3\2\2\2\u05ef\u05f0"+
		"\5j\66\2\u05f0\u05f1\7\u00d2\2\2\u05f1\u05f2\7\u00d2\2\2\u05f2\u05f3\5"+
		"\u00b0Y\2\u05f3\u05f5\3\2\2\2\u05f4\u05e8\3\2\2\2\u05f4\u05ef\3\2\2\2"+
		"\u05f5\u00cf\3\2\2\2\u05f6\u05f7\7\u00d2\2\2\u05f7\u05f8\7\u00d2\2\2\u05f8"+
		"\u05fd\5\u00b0Y\2\u05f9\u05fa\7\u00e7\2\2\u05fa\u05fc\7\u00e8\2\2\u05fb"+
		"\u05f9\3\2\2\2\u05fc\u05ff\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fd\u05fe\3\2"+
		"\2\2\u05fe\u00d1\3\2\2\2\u05ff\u05fd\3\2\2\2\u0600\u0601\5j\66\2\u0601"+
		"\u0602\7b\2\2\u0602\u0603\5j\66\2\u0603\u00d3\3\2\2\2\u0604\u0606\5\u00d6"+
		"l\2\u0605\u0607\5\u00d0i\2\u0606\u0605\3\2\2\2\u0606\u0607\3\2\2\2\u0607"+
		"\u060d\3\2\2\2\u0608\u0609\7Z\2\2\u0609\u060a\7\u00e7\2\2\u060a\u060b"+
		"\7\u00e8\2\2\u060b\u060d\5\u00d0i\2\u060c\u0604\3\2\2\2\u060c\u0608\3"+
		"\2\2\2\u060d\u00d5\3\2\2\2\u060e\u060f\7Z\2\2\u060f\u0610\7\u00e7\2\2"+
		"\u0610\u0611\5f\64\2\u0611\u0612\7\u00e8\2\2\u0612\u0620\3\2\2\2\u0613"+
		"\u0614\7Z\2\2\u0614\u0615\7\u00e7\2\2\u0615\u061a\5\u00d6l\2\u0616\u0617"+
		"\7\u00e9\2\2\u0617\u0619\5\u00d6l\2\u0618\u0616\3\2\2\2\u0619\u061c\3"+
		"\2\2\2\u061a\u0618\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061d\3\2\2\2\u061c"+
		"\u061a\3\2\2\2\u061d\u061e\7\u00e8\2\2\u061e\u0620\3\2\2\2\u061f\u060e"+
		"\3\2\2\2\u061f\u0613\3\2\2\2\u0620\u00d7\3\2\2\2\u0621\u0622\7v\2\2\u0622"+
		"\u0623\7\u00e3\2\2\u0623\u0624\7\u00f0\2\2\u0624\u0625\7\22\2\2\u0625"+
		"\u0626\7\u00f0\2\2\u0626\u0627\7\u00e4\2\2\u0627\u00d9\3\2\2\2\u0628\u0629"+
		"\7\u00f0\2\2\u0629\u00db\3\2\2\2\u062a\u062f\5\u00dan\2\u062b\u062c\7"+
		"\u00e9\2\2\u062c\u062e\5\u00dan\2\u062d\u062b\3\2\2\2\u062e\u0631\3\2"+
		"\2\2\u062f\u062d\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u00dd\3\2\2\2\u0631"+
		"\u062f\3\2\2\2\u0632\u0633\7\3\2\2\u0633\u00df\3\2\2\2\u0634\u0638\7$"+
		"\2\2\u0635\u0636\7\u00b1\2\2\u0636\u0637\7`\2\2\u0637\u0639\7\61\2\2\u0638"+
		"\u0635\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b\7T"+
		"\2\2\u063b\u00e1\3\2\2\2\u063c\u0640\7[\2\2\u063d\u063e\7Q\2\2\u063e\u0640"+
		"\7T\2\2\u063f\u063c\3\2\2\2\u063f\u063d\3\2\2\2\u0640\u00e3\3\2\2\2\u0641"+
		"\u0642\7\65\2\2\u0642\u00e5\3\2\2\2\u0643\u0644\7O\2\2\u0644\u00e7\3\2"+
		"\2\2\u0645\u0646\7\u00ab\2\2\u0646\u00e9\3\2\2\2\u0647\u064d\7C\2\2\u0648"+
		"\u0649\5\u00eex\2\u0649\u064a\7H\2\2\u064a\u064b\5\u00f2z\2\u064b\u064e"+
		"\3\2\2\2\u064c\u064e\5\u00dco\2\u064d\u0648\3\2\2\2\u064d\u064c\3\2\2"+
		"\2\u064e\u00eb\3\2\2\2\u064f\u0653\7M\2\2\u0650\u0651\7C\2\2\u0651\u0652"+
		"\7I\2\2\u0652\u0654\7?\2\2\u0653\u0650\3\2\2\2\u0653\u0654\3\2\2\2\u0654"+
		"\u065a\3\2\2\2\u0655\u0656\5\u00eex\2\u0656\u0657\7H\2\2\u0657\u0658\5"+
		"\u00f2z\2\u0658\u065b\3\2\2\2\u0659\u065b\5\u00dco\2\u065a\u0655\3\2\2"+
		"\2\u065a\u0659\3\2\2\2\u065b\u00ed\3\2\2\2\u065c\u065e\5\u00f0y\2\u065d"+
		"\u065f\5d\63\2\u065e\u065d\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0667\3\2"+
		"\2\2\u0660\u0661\7\u00e9\2\2\u0661\u0663\5\u00f0y\2\u0662\u0664\5d\63"+
		"\2\u0663\u0662\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0666\3\2\2\2\u0665\u0660"+
		"\3\2\2\2\u0666\u0669\3\2\2\2\u0667\u0665\3\2\2\2\u0667\u0668\3\2\2\2\u0668"+
		"\u00ef\3\2\2\2\u0669\u0667\3\2\2\2\u066a\u066c\7\5\2\2\u066b\u066d\7J"+
		"\2\2\u066c\u066b\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u067c\3\2\2\2\u066e"+
		"\u067c\7\u00af\2\2\u066f\u067c\7\u008a\2\2\u0670\u067c\7\u00bf\2\2\u0671"+
		"\u067c\7;\2\2\u0672\u067c\7U\2\2\u0673\u067c\7L\2\2\u0674\u067c\7\u00bb"+
		"\2\2\u0675\u067c\7\67\2\2\u0676\u067c\7e\2\2\u0677\u067c\7\u00ba\2\2\u0678"+
		"\u067c\7\u00b9\2\2\u0679\u067c\7r\2\2\u067a\u067c\7\u00c0\2\2\u067b\u066a"+
		"\3\2\2\2\u067b\u066e\3\2\2\2\u067b\u066f\3\2\2\2\u067b\u0670\3\2\2\2\u067b"+
		"\u0671\3\2\2\2\u067b\u0672\3\2\2\2\u067b\u0673\3\2\2\2\u067b\u0674\3\2"+
		"\2\2\u067b\u0675\3\2\2\2\u067b\u0676\3\2\2\2\u067b\u0677\3\2\2\2\u067b"+
		"\u0678\3\2\2\2\u067b\u0679\3\2\2\2\u067b\u067a\3\2\2\2\u067c\u00f1\3\2"+
		"\2\2\u067d\u0697\7\u00b0\2\2\u067e\u0697\7k\2\2\u067f\u0697\7p\2\2\u0680"+
		"\u0697\7@\2\2\u0681\u0697\7A\2\2\u0682\u0697\7\u00a2\2\2\u0683\u0697\7"+
		"\u00a9\2\2\u0684\u0697\7\5\2\2\u0685\u0697\7\u008b\2\2\u0686\u0687\7\u008c"+
		"\2\2\u0687\u0697\7\u0098\2\2\u0688\u0697\7\u00ac\2\2\u0689\u0697\7\u00b8"+
		"\2\2\u068a\u0697\7\u00bc\2\2\u068b\u068d\7R\2\2\u068c\u068b\3\2\2\2\u068c"+
		"\u068d\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u0693\5V,\2\u068f\u0690\7\u00e9"+
		"\2\2\u0690\u0692\5V,\2\u0691\u068f\3\2\2\2\u0692\u0695\3\2\2\2\u0693\u0691"+
		"\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0697\3\2\2\2\u0695\u0693\3\2\2\2\u0696"+
		"\u067d\3\2\2\2\u0696\u067e\3\2\2\2\u0696\u067f\3\2\2\2\u0696\u0680\3\2"+
		"\2\2\u0696\u0681\3\2\2\2\u0696\u0682\3\2\2\2\u0696\u0683\3\2\2\2\u0696"+
		"\u0684\3\2\2\2\u0696\u0685\3\2\2\2\u0696\u0686\3\2\2\2\u0696\u0688\3\2"+
		"\2\2\u0696\u0689\3\2\2\2\u0696\u068a\3\2\2\2\u0696\u068c\3\2\2\2\u0697"+
		"\u00f3\3\2\2\2\u0698\u0699\7\67\2\2\u0699\u069a\7W\2\2\u069a\u00f5\3\2"+
		"\2\2\u069b\u069c\7=\2\2\u069c\u069d\7W\2\2\u069d\u00f7\3\2\2\2\u069e\u069f"+
		"\7/\2\2\u069f\u06a0\7W\2\2\u06a0\u00f9\3\2\2\2\u06a1\u06a2\7\67\2\2\u06a2"+
		"\u06a3\7N\2\2\u06a3\u00fb\3\2\2\2\u06a4\u06a5\7=\2\2\u06a5\u06a6\7N\2"+
		"\2\u06a6\u00fd\3\2\2\2\u06a7\u06a8\7/\2\2\u06a8\u06a9\7N\2\2\u06a9\u00ff"+
		"\3\2\2\2\u06aa\u06b0\7\u00b3\2\2\u06ab\u06b1\7\5\2\2\u06ac\u06b1\7\u00f0"+
		"\2\2\u06ad\u06ae\7T\2\2\u06ae\u06af\7E\2\2\u06af\u06b1\7F\2\2\u06b0\u06ab"+
		"\3\2\2\2\u06b0\u06ac\3\2\2\2\u06b0\u06ad\3\2\2\2\u06b1\u0101\3\2\2\2\u06b2"+
		"\u06b4\7$\2\2\u06b3\u06b5\5\u0104\u0083\2\u06b4\u06b3\3\2\2\2\u06b4\u06b5"+
		"\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06b7\5\u0106\u0084\2\u06b7\u0103\3"+
		"\2\2\2\u06b8\u06b9\t\33\2\2\u06b9\u0105\3\2\2\2\u06ba\u06bb\7&\2\2\u06bb"+
		"\u06bc\7\u00c6\2\2\u06bc\u06c1\5\u0108\u0085\2\u06bd\u06be\7\u00f0\2\2"+
		"\u06be\u06bf\t\34\2\2\u06bf\u06c1\t\35\2\2\u06c0\u06ba\3\2\2\2\u06c0\u06bd"+
		"\3\2\2\2\u06c1\u0107\3\2\2\2\u06c2\u06c3\t\36\2\2\u06c3\u0109\3\2\2\2"+
		"\u06c4\u06c5\7\u00a6\2\2\u06c5\u06c6\t\37\2\2\u06c6\u010b\3\2\2\2\u00b7"+
		"\u0123\u0126\u012a\u012e\u0133\u0136\u013e\u0142\u0149\u0151\u0156\u015c"+
		"\u0161\u0165\u0168\u0170\u0177\u017e\u0197\u019e\u01a3\u01a7\u01ab\u01b1"+
		"\u01bb\u01be\u01c9\u01cc\u01d8\u01e1\u01e4\u01e8\u01ef\u0202\u0206\u020d"+
		"\u021d\u0220\u023a\u0246\u0259\u0263\u0265\u0269\u026d\u0276\u027b\u0281"+
		"\u0285\u0289\u028e\u0293\u0297\u02ad\u02b5\u02bc\u02c4\u02dc\u02e0\u02e9"+
		"\u02ec\u02f0\u02f3\u02f5\u02fc\u0307\u030a\u030e\u0324\u0330\u034a\u034f"+
		"\u0352\u0356\u0359\u035c\u0360\u0372\u0374\u0379\u0383\u038d\u039f\u03b0"+
		"\u03b2\u03bd\u03cc\u03ce\u03d5\u03dc\u03e5\u03ec\u03fa\u0402\u0407\u040d"+
		"\u0439\u043b\u0456\u045d\u045f\u0465\u0469\u047a\u047e\u0490\u0495\u0499"+
		"\u049b\u04af\u04b3\u04b8\u04bb\u04c2\u04c7\u04cb\u04d4\u04de\u04e6\u04f3"+
		"\u04fb\u0500\u0505\u0508\u050e\u0512\u0517\u051b\u0520\u0530\u0536\u053e"+
		"\u0545\u054f\u0552\u0555\u0559\u055d\u0560\u0568\u056e\u0572\u0577\u057c"+
		"\u0583\u0588\u058c\u059b\u05aa\u05ad\u05b7\u05ba\u05bf\u05c6\u05c9\u05cc"+
		"\u05d8\u05e4\u05f4\u05fd\u0606\u060c\u061a\u061f\u062f\u0638\u063f\u064d"+
		"\u0653\u065a\u065e\u0663\u0667\u066c\u067b\u068c\u0693\u0696\u06b0\u06b4"+
		"\u06c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}