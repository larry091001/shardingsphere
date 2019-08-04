// Generated from org\apache\shardingsphere\core\parse\antlr\autogen\OracleStatement.g4 by ANTLR 4.7.1
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
public class OracleStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, ALL=3, AND=4, ANY=5, ASC=6, BETWEEN=7, BINARY=8, BY=9, DATE=10, 
		DESC=11, DISTINCT=12, ESCAPE=13, EXISTS=14, FALSE=15, FROM=16, GROUP=17, 
		HAVING=18, IN=19, IS=20, KEY=21, LIKE=22, LIMIT=23, MOD=24, NOT=25, NULL=26, 
		OR=27, ORDER=28, PRIMARY=29, REGEXP=30, ROW=31, SET=32, SOUNDS=33, TIME=34, 
		TIMESTAMP=35, TRUE=36, UNION=37, UNKNOWN=38, WHERE=39, WITH=40, XOR=41, 
		ADD=42, ALTER=43, ALWAYS=44, AS=45, CASCADE=46, CHECK=47, COLUMN=48, COMMIT=49, 
		CONSTRAINT=50, CREATE=51, DAY=52, DEFAULT=53, DELETE=54, DISABLE=55, DROP=56, 
		ENABLE=57, FOR=58, FOREIGN=59, FUNCTION=60, GENERATED=61, GRANT=62, INDEX=63, 
		NO=64, ON=65, PRIVILEGES=66, READ=67, REFERENCES=68, REVOKE=69, ROLE=70, 
		ROLLBACK=71, ROWS=72, START=73, TABLE=74, TO=75, TRANSACTION=76, TRUNCATE=77, 
		UNIQUE=78, USER=79, YEAR=80, SELECT=81, INSERT=82, UPDATE=83, WRITE=84, 
		EXECUTE=85, USE=86, DEBUG=87, UNDER=88, FLASHBACK=89, ARCHIVE=90, REFRESH=91, 
		QUERY=92, REWRITE=93, KEEP=94, SEQUENCEE=95, INHERIT=96, TRANSLATE=97, 
		SQL=98, MERGE=99, VIEW=100, AT=101, BITMAP=102, CACHE=103, CASE=104, CHECKPOINT=105, 
		CONNECT=106, CONSTRAINTS=107, CYCLE=108, DBTIMEZONE=109, DECRYPT=110, 
		DEFERRABLE=111, DEFERRED=112, DIRECTORY=113, EDITION=114, ELEMENT=115, 
		ELSE=116, ENCRYPT=117, END=118, EXCEPTIONS=119, FORCE=120, GLOBAL=121, 
		IDENTIFIED=122, IDENTITY=123, IMMEDIATE=124, INCREMENT=125, INITIALLY=126, 
		INTO=127, INVALIDATE=128, JAVA=129, LEVELS=130, LOCAL=131, MAXVALUE=132, 
		MINING=133, MINVALUE=134, MODEL=135, MODIFY=136, MONTH=137, NATIONAL=138, 
		NEW=139, NOCACHE=140, NOCYCLE=141, NOMAXVALUE=142, NOMINVALUE=143, NOORDER=144, 
		NORELY=145, NOVALIDATE=146, OF=147, ONLY=148, PRESERVE=149, PRIOR=150, 
		PROFILE=151, REF=152, REKEY=153, RELY=154, RENAME=155, REPLACE=156, RESOURCE=157, 
		ROWID=158, SALT=159, SAVEPOINT=160, SCOPE=161, SECOND=162, SORT=163, SOURCE=164, 
		SUBSTITUTABLE=165, TABLESPACE=166, TEMPORARY=167, THEN=168, TRANSLATION=169, 
		TREAT=170, TYPE=171, UNUSED=172, USING=173, VALIDATE=174, VALUE=175, VARYING=176, 
		VIRTUAL=177, WHEN=178, ZONE=179, FOR_GENERATOR=180, AND_=181, OR_=182, 
		NOT_=183, TILDE_=184, VERTICAL_BAR_=185, AMPERSAND_=186, SIGNED_LEFT_SHIFT_=187, 
		SIGNED_RIGHT_SHIFT_=188, CARET_=189, MOD_=190, COLON_=191, PLUS_=192, 
		MINUS_=193, ASTERISK_=194, SLASH_=195, BACKSLASH_=196, DOT_=197, DOT_ASTERISK_=198, 
		SAFE_EQ_=199, DEQ_=200, EQ_=201, NEQ_=202, GT_=203, GTE_=204, LT_=205, 
		LTE_=206, POUND_=207, LP_=208, RP_=209, LBE_=210, RBE_=211, LBT_=212, 
		RBT_=213, COMMA_=214, DQ_=215, SQ_=216, BQ_=217, QUESTION_=218, AT_=219, 
		SEMI_=220, IDENTIFIER_=221, STRING_=222, NUMBER_=223, HEX_DIGIT_=224, 
		BIT_NUM_=225, SEQUENCE=226;
	public static final int
		RULE_execute = 0, RULE_createTable = 1, RULE_alterTable = 2, RULE_dropTable = 3, 
		RULE_truncateTable = 4, RULE_tablespaceClauseWithParen = 5, RULE_tablespaceClause = 6, 
		RULE_domainIndexClause = 7, RULE_relationalTable = 8, RULE_relationalProperties = 9, 
		RULE_relationalProperty = 10, RULE_tableProperties = 11, RULE_unionSelect = 12, 
		RULE_alterTableProperties = 13, RULE_renameTableSpecification = 14, RULE_columnClauses = 15, 
		RULE_opColumnClause = 16, RULE_addColumnSpecification = 17, RULE_columnOrVirtualDefinitions = 18, 
		RULE_columnOrVirtualDefinition = 19, RULE_modifyColumnSpecification = 20, 
		RULE_modifyColProperties = 21, RULE_modifyColSubstitutable = 22, RULE_dropColumnClause = 23, 
		RULE_dropColumnSpecification = 24, RULE_columnOrColumnList = 25, RULE_cascadeOrInvalidate = 26, 
		RULE_checkpointNumber = 27, RULE_renameColumnSpecification = 28, RULE_constraintClauses = 29, 
		RULE_addConstraintSpecification = 30, RULE_modifyConstraintClause = 31, 
		RULE_constraintWithName = 32, RULE_constraintOption = 33, RULE_constraintPrimaryOrUnique = 34, 
		RULE_renameConstraintClause = 35, RULE_dropConstraintClause = 36, RULE_alterExternalTable = 37, 
		RULE_columnDefinition = 38, RULE_identityClause = 39, RULE_identityOptions = 40, 
		RULE_virtualColumnDefinition = 41, RULE_inlineConstraint = 42, RULE_referencesClause = 43, 
		RULE_constraintState = 44, RULE_notDeferrable = 45, RULE_initiallyClause = 46, 
		RULE_exceptionsClause = 47, RULE_usingIndexClause = 48, RULE_inlineRefConstraint = 49, 
		RULE_outOfLineConstraint = 50, RULE_outOfLineRefConstraint = 51, RULE_encryptionSpec = 52, 
		RULE_objectProperties = 53, RULE_objectProperty = 54, RULE_columnProperties = 55, 
		RULE_columnProperty = 56, RULE_objectTypeColProperties = 57, RULE_substitutableColumnClause = 58, 
		RULE_createIndex = 59, RULE_tableIndexClause_ = 60, RULE_indexExpr_ = 61, 
		RULE_bitmapJoinIndexClause_ = 62, RULE_columnSortClause_ = 63, RULE_dropIndex = 64, 
		RULE_alterIndex = 65, RULE_schemaName = 66, RULE_tableName = 67, RULE_columnName = 68, 
		RULE_indexName = 69, RULE_oracleId = 70, RULE_collationName = 71, RULE_alias = 72, 
		RULE_dataTypeLength = 73, RULE_primaryKey = 74, RULE_columnNames = 75, 
		RULE_exprs = 76, RULE_exprList = 77, RULE_expr = 78, RULE_exprRecursive = 79, 
		RULE_booleanPrimary = 80, RULE_comparisonOperator = 81, RULE_predicate = 82, 
		RULE_bitExpr = 83, RULE_simpleExpr = 84, RULE_functionCall = 85, RULE_distinct = 86, 
		RULE_intervalExpr = 87, RULE_caseExpress = 88, RULE_privateExprOfDb = 89, 
		RULE_variable = 90, RULE_literal = 91, RULE_question = 92, RULE_number = 93, 
		RULE_string = 94, RULE_subquery = 95, RULE_collateClause = 96, RULE_orderByClause = 97, 
		RULE_orderByItem = 98, RULE_asterisk = 99, RULE_attributeName = 100, RULE_indexTypeName = 101, 
		RULE_simpleExprsWithParen = 102, RULE_simpleExprs = 103, RULE_lobItem = 104, 
		RULE_lobItems = 105, RULE_lobItemList = 106, RULE_dataType = 107, RULE_specialDatatype = 108, 
		RULE_dataTypeName_ = 109, RULE_datetimeTypeSuffix = 110, RULE_treatFunction = 111, 
		RULE_caseExpr = 112, RULE_simpleCaseExpr = 113, RULE_searchedCaseExpr = 114, 
		RULE_elseClause = 115, RULE_dateTimeExpr = 116, RULE_intervalExpression = 117, 
		RULE_objectAccessExpression = 118, RULE_constructorExpr = 119, RULE_ignoredIdentifier_ = 120, 
		RULE_ignoredIdentifiers_ = 121, RULE_matchNone = 122, RULE_setTransaction = 123, 
		RULE_commit = 124, RULE_rollback = 125, RULE_savepoint = 126, RULE_grant = 127, 
		RULE_revoke = 128, RULE_objectPrivileges_ = 129, RULE_objectPrivilegeType_ = 130, 
		RULE_onObjectClause_ = 131, RULE_otherPrivileges_ = 132, RULE_createUser = 133, 
		RULE_dropUser = 134, RULE_alterUser = 135, RULE_createRole = 136, RULE_dropRole = 137, 
		RULE_alterRole = 138;
	public static final String[] ruleNames = {
		"execute", "createTable", "alterTable", "dropTable", "truncateTable", 
		"tablespaceClauseWithParen", "tablespaceClause", "domainIndexClause", 
		"relationalTable", "relationalProperties", "relationalProperty", "tableProperties", 
		"unionSelect", "alterTableProperties", "renameTableSpecification", "columnClauses", 
		"opColumnClause", "addColumnSpecification", "columnOrVirtualDefinitions", 
		"columnOrVirtualDefinition", "modifyColumnSpecification", "modifyColProperties", 
		"modifyColSubstitutable", "dropColumnClause", "dropColumnSpecification", 
		"columnOrColumnList", "cascadeOrInvalidate", "checkpointNumber", "renameColumnSpecification", 
		"constraintClauses", "addConstraintSpecification", "modifyConstraintClause", 
		"constraintWithName", "constraintOption", "constraintPrimaryOrUnique", 
		"renameConstraintClause", "dropConstraintClause", "alterExternalTable", 
		"columnDefinition", "identityClause", "identityOptions", "virtualColumnDefinition", 
		"inlineConstraint", "referencesClause", "constraintState", "notDeferrable", 
		"initiallyClause", "exceptionsClause", "usingIndexClause", "inlineRefConstraint", 
		"outOfLineConstraint", "outOfLineRefConstraint", "encryptionSpec", "objectProperties", 
		"objectProperty", "columnProperties", "columnProperty", "objectTypeColProperties", 
		"substitutableColumnClause", "createIndex", "tableIndexClause_", "indexExpr_", 
		"bitmapJoinIndexClause_", "columnSortClause_", "dropIndex", "alterIndex", 
		"schemaName", "tableName", "columnName", "indexName", "oracleId", "collationName", 
		"alias", "dataTypeLength", "primaryKey", "columnNames", "exprs", "exprList", 
		"expr", "exprRecursive", "booleanPrimary", "comparisonOperator", "predicate", 
		"bitExpr", "simpleExpr", "functionCall", "distinct", "intervalExpr", "caseExpress", 
		"privateExprOfDb", "variable", "literal", "question", "number", "string", 
		"subquery", "collateClause", "orderByClause", "orderByItem", "asterisk", 
		"attributeName", "indexTypeName", "simpleExprsWithParen", "simpleExprs", 
		"lobItem", "lobItems", "lobItemList", "dataType", "specialDatatype", "dataTypeName_", 
		"datetimeTypeSuffix", "treatFunction", "caseExpr", "simpleCaseExpr", "searchedCaseExpr", 
		"elseClause", "dateTimeExpr", "intervalExpression", "objectAccessExpression", 
		"constructorExpr", "ignoredIdentifier_", "ignoredIdentifiers_", "matchNone", 
		"setTransaction", "commit", "rollback", "savepoint", "grant", "revoke", 
		"objectPrivileges_", "objectPrivilegeType_", "onObjectClause_", "otherPrivileges_", 
		"createUser", "dropUser", "alterUser", "createRole", "dropRole", "alterRole"
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
		null, null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'", 
		"'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", "'%'", 
		"':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", "'=='", 
		"'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "','", "'\"'", "'''", "'`'", "'?'", "'@'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WS", "ALL", "AND", "ANY", "ASC", "BETWEEN", "BINARY", "BY", 
		"DATE", "DESC", "DISTINCT", "ESCAPE", "EXISTS", "FALSE", "FROM", "GROUP", 
		"HAVING", "IN", "IS", "KEY", "LIKE", "LIMIT", "MOD", "NOT", "NULL", "OR", 
		"ORDER", "PRIMARY", "REGEXP", "ROW", "SET", "SOUNDS", "TIME", "TIMESTAMP", 
		"TRUE", "UNION", "UNKNOWN", "WHERE", "WITH", "XOR", "ADD", "ALTER", "ALWAYS", 
		"AS", "CASCADE", "CHECK", "COLUMN", "COMMIT", "CONSTRAINT", "CREATE", 
		"DAY", "DEFAULT", "DELETE", "DISABLE", "DROP", "ENABLE", "FOR", "FOREIGN", 
		"FUNCTION", "GENERATED", "GRANT", "INDEX", "NO", "ON", "PRIVILEGES", "READ", 
		"REFERENCES", "REVOKE", "ROLE", "ROLLBACK", "ROWS", "START", "TABLE", 
		"TO", "TRANSACTION", "TRUNCATE", "UNIQUE", "USER", "YEAR", "SELECT", "INSERT", 
		"UPDATE", "WRITE", "EXECUTE", "USE", "DEBUG", "UNDER", "FLASHBACK", "ARCHIVE", 
		"REFRESH", "QUERY", "REWRITE", "KEEP", "SEQUENCEE", "INHERIT", "TRANSLATE", 
		"SQL", "MERGE", "VIEW", "AT", "BITMAP", "CACHE", "CASE", "CHECKPOINT", 
		"CONNECT", "CONSTRAINTS", "CYCLE", "DBTIMEZONE", "DECRYPT", "DEFERRABLE", 
		"DEFERRED", "DIRECTORY", "EDITION", "ELEMENT", "ELSE", "ENCRYPT", "END", 
		"EXCEPTIONS", "FORCE", "GLOBAL", "IDENTIFIED", "IDENTITY", "IMMEDIATE", 
		"INCREMENT", "INITIALLY", "INTO", "INVALIDATE", "JAVA", "LEVELS", "LOCAL", 
		"MAXVALUE", "MINING", "MINVALUE", "MODEL", "MODIFY", "MONTH", "NATIONAL", 
		"NEW", "NOCACHE", "NOCYCLE", "NOMAXVALUE", "NOMINVALUE", "NOORDER", "NORELY", 
		"NOVALIDATE", "OF", "ONLY", "PRESERVE", "PRIOR", "PROFILE", "REF", "REKEY", 
		"RELY", "RENAME", "REPLACE", "RESOURCE", "ROWID", "SALT", "SAVEPOINT", 
		"SCOPE", "SECOND", "SORT", "SOURCE", "SUBSTITUTABLE", "TABLESPACE", "TEMPORARY", 
		"THEN", "TRANSLATION", "TREAT", "TYPE", "UNUSED", "USING", "VALIDATE", 
		"VALUE", "VARYING", "VIRTUAL", "WHEN", "ZONE", "FOR_GENERATOR", "AND_", 
		"OR_", "NOT_", "TILDE_", "VERTICAL_BAR_", "AMPERSAND_", "SIGNED_LEFT_SHIFT_", 
		"SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", "COLON_", "PLUS_", "MINUS_", 
		"ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", "DOT_ASTERISK_", "SAFE_EQ_", 
		"DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", "LP_", 
		"RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", "BQ_", 
		"QUESTION_", "AT_", "SEMI_", "IDENTIFIER_", "STRING_", "NUMBER_", "HEX_DIGIT_", 
		"BIT_NUM_", "SEQUENCE"
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
	public String getGrammarFileName() { return "OracleStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OracleStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExecuteContext extends ParserRuleContext {
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
		public AlterIndexContext alterIndex() {
			return getRuleContext(AlterIndexContext.class,0);
		}
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public RollbackContext rollback() {
			return getRuleContext(RollbackContext.class,0);
		}
		public SetTransactionContext setTransaction() {
			return getRuleContext(SetTransactionContext.class,0);
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
		public TerminalNode SEMI_() { return getToken(OracleStatementParser.SEMI_, 0); }
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
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(278);
				createTable();
				}
				break;
			case 2:
				{
				setState(279);
				alterTable();
				}
				break;
			case 3:
				{
				setState(280);
				dropTable();
				}
				break;
			case 4:
				{
				setState(281);
				truncateTable();
				}
				break;
			case 5:
				{
				setState(282);
				createIndex();
				}
				break;
			case 6:
				{
				setState(283);
				dropIndex();
				}
				break;
			case 7:
				{
				setState(284);
				alterIndex();
				}
				break;
			case 8:
				{
				setState(285);
				commit();
				}
				break;
			case 9:
				{
				setState(286);
				rollback();
				}
				break;
			case 10:
				{
				setState(287);
				setTransaction();
				}
				break;
			case 11:
				{
				setState(288);
				savepoint();
				}
				break;
			case 12:
				{
				setState(289);
				grant();
				}
				break;
			case 13:
				{
				setState(290);
				revoke();
				}
				break;
			case 14:
				{
				setState(291);
				createUser();
				}
				break;
			case 15:
				{
				setState(292);
				dropUser();
				}
				break;
			case 16:
				{
				setState(293);
				alterUser();
				}
				break;
			case 17:
				{
				setState(294);
				createRole();
				}
				break;
			case 18:
				{
				setState(295);
				dropRole();
				}
				break;
			case 19:
				{
				setState(296);
				alterRole();
				}
				break;
			}
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(299);
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

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public RelationalTableContext relationalTable() {
			return getRuleContext(RelationalTableContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(OracleStatementParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(OracleStatementParser.TEMPORARY, 0); }
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(CREATE);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(303);
				match(GLOBAL);
				setState(304);
				match(TEMPORARY);
				}
			}

			setState(307);
			match(TABLE);
			setState(308);
			tableName();
			setState(309);
			relationalTable();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterTablePropertiesContext alterTableProperties() {
			return getRuleContext(AlterTablePropertiesContext.class,0);
		}
		public ColumnClausesContext columnClauses() {
			return getRuleContext(ColumnClausesContext.class,0);
		}
		public ConstraintClausesContext constraintClauses() {
			return getRuleContext(ConstraintClausesContext.class,0);
		}
		public AlterExternalTableContext alterExternalTable() {
			return getRuleContext(AlterExternalTableContext.class,0);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(ALTER);
			setState(312);
			match(TABLE);
			setState(313);
			tableName();
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(314);
				alterTableProperties();
				}
				break;
			case 2:
				{
				setState(315);
				columnClauses();
				}
				break;
			case 3:
				{
				setState(316);
				constraintClauses();
				}
				break;
			case 4:
				{
				setState(317);
				alterExternalTable();
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(DROP);
			setState(321);
			match(TABLE);
			setState(322);
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

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(OracleStatementParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
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
		enterRule(_localctx, 8, RULE_truncateTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(TRUNCATE);
			setState(325);
			match(TABLE);
			setState(326);
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

	public static class TablespaceClauseWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TablespaceClauseContext tablespaceClause() {
			return getRuleContext(TablespaceClauseContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TablespaceClauseWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceClauseWithParen; }
	}

	public final TablespaceClauseWithParenContext tablespaceClauseWithParen() throws RecognitionException {
		TablespaceClauseWithParenContext _localctx = new TablespaceClauseWithParenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tablespaceClauseWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(LP_);
			setState(329);
			tablespaceClause();
			setState(330);
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

	public static class TablespaceClauseContext extends ParserRuleContext {
		public TerminalNode TABLESPACE() { return getToken(OracleStatementParser.TABLESPACE, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TablespaceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceClause; }
	}

	public final TablespaceClauseContext tablespaceClause() throws RecognitionException {
		TablespaceClauseContext _localctx = new TablespaceClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tablespaceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(TABLESPACE);
			setState(333);
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

	public static class DomainIndexClauseContext extends ParserRuleContext {
		public IndexTypeNameContext indexTypeName() {
			return getRuleContext(IndexTypeNameContext.class,0);
		}
		public DomainIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainIndexClause; }
	}

	public final DomainIndexClauseContext domainIndexClause() throws RecognitionException {
		DomainIndexClauseContext _localctx = new DomainIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_domainIndexClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			indexTypeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalTableContext extends ParserRuleContext {
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public RelationalPropertiesContext relationalProperties() {
			return getRuleContext(RelationalPropertiesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode ROWS() { return getToken(OracleStatementParser.ROWS, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode PRESERVE() { return getToken(OracleStatementParser.PRESERVE, 0); }
		public RelationalTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalTable; }
	}

	public final RelationalTableContext relationalTable() throws RecognitionException {
		RelationalTableContext _localctx = new RelationalTableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relationalTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(337);
				match(LP_);
				setState(338);
				relationalProperties();
				setState(339);
				match(RP_);
				}
			}

			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(343);
				match(ON);
				setState(344);
				match(COMMIT);
				setState(345);
				_la = _input.LA(1);
				if ( !(_la==DELETE || _la==PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(346);
				match(ROWS);
				}
			}

			setState(349);
			tableProperties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalPropertiesContext extends ParserRuleContext {
		public List<RelationalPropertyContext> relationalProperty() {
			return getRuleContexts(RelationalPropertyContext.class);
		}
		public RelationalPropertyContext relationalProperty(int i) {
			return getRuleContext(RelationalPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public RelationalPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalProperties; }
	}

	public final RelationalPropertiesContext relationalProperties() throws RecognitionException {
		RelationalPropertiesContext _localctx = new RelationalPropertiesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_relationalProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			relationalProperty();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(352);
				match(COMMA_);
				setState(353);
				relationalProperty();
				}
				}
				setState(358);
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

	public static class RelationalPropertyContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public VirtualColumnDefinitionContext virtualColumnDefinition() {
			return getRuleContext(VirtualColumnDefinitionContext.class,0);
		}
		public OutOfLineConstraintContext outOfLineConstraint() {
			return getRuleContext(OutOfLineConstraintContext.class,0);
		}
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public RelationalPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalProperty; }
	}

	public final RelationalPropertyContext relationalProperty() throws RecognitionException {
		RelationalPropertyContext _localctx = new RelationalPropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relationalProperty);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				virtualColumnDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				outOfLineConstraint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				outOfLineRefConstraint();
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

	public static class TablePropertiesContext extends ParserRuleContext {
		public ColumnPropertiesContext columnProperties() {
			return getRuleContext(ColumnPropertiesContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public UnionSelectContext unionSelect() {
			return getRuleContext(UnionSelectContext.class,0);
		}
		public TablePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperties; }
	}

	public final TablePropertiesContext tableProperties() throws RecognitionException {
		TablePropertiesContext _localctx = new TablePropertiesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tableProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(365);
				columnProperties();
				}
			}

			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(368);
				match(AS);
				setState(369);
				unionSelect();
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

	public static class UnionSelectContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public UnionSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionSelect; }
	}

	public final UnionSelectContext unionSelect() throws RecognitionException {
		UnionSelectContext _localctx = new UnionSelectContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unionSelect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
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

	public static class AlterTablePropertiesContext extends ParserRuleContext {
		public RenameTableSpecificationContext renameTableSpecification() {
			return getRuleContext(RenameTableSpecificationContext.class,0);
		}
		public TerminalNode REKEY() { return getToken(OracleStatementParser.REKEY, 0); }
		public EncryptionSpecContext encryptionSpec() {
			return getRuleContext(EncryptionSpecContext.class,0);
		}
		public AlterTablePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableProperties; }
	}

	public final AlterTablePropertiesContext alterTableProperties() throws RecognitionException {
		AlterTablePropertiesContext _localctx = new AlterTablePropertiesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_alterTableProperties);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				renameTableSpecification();
				}
				break;
			case REKEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(REKEY);
				setState(376);
				encryptionSpec();
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

	public static class RenameTableSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
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
		enterRule(_localctx, 28, RULE_renameTableSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(RENAME);
			setState(380);
			match(TO);
			setState(381);
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

	public static class ColumnClausesContext extends ParserRuleContext {
		public List<OpColumnClauseContext> opColumnClause() {
			return getRuleContexts(OpColumnClauseContext.class);
		}
		public OpColumnClauseContext opColumnClause(int i) {
			return getRuleContext(OpColumnClauseContext.class,i);
		}
		public RenameColumnSpecificationContext renameColumnSpecification() {
			return getRuleContext(RenameColumnSpecificationContext.class,0);
		}
		public ColumnClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnClauses; }
	}

	public final ColumnClausesContext columnClauses() throws RecognitionException {
		ColumnClausesContext _localctx = new ColumnClausesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_columnClauses);
		int _la;
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case ADD:
			case DROP:
			case MODIFY:
				enterOuterAlt(_localctx, 1);
				{
				setState(384); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(383);
					opColumnClause();
					}
					}
					setState(386); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ADD) | (1L << DROP))) != 0) || _la==MODIFY );
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				renameColumnSpecification();
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

	public static class OpColumnClauseContext extends ParserRuleContext {
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public DropColumnClauseContext dropColumnClause() {
			return getRuleContext(DropColumnClauseContext.class,0);
		}
		public OpColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opColumnClause; }
	}

	public final OpColumnClauseContext opColumnClause() throws RecognitionException {
		OpColumnClauseContext _localctx = new OpColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_opColumnClause);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				addColumnSpecification();
				}
				break;
			case MODIFY:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				modifyColumnSpecification();
				}
				break;
			case SET:
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				dropColumnClause();
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
		public TerminalNode ADD() { return getToken(OracleStatementParser.ADD, 0); }
		public ColumnOrVirtualDefinitionsContext columnOrVirtualDefinitions() {
			return getRuleContext(ColumnOrVirtualDefinitionsContext.class,0);
		}
		public ColumnPropertiesContext columnProperties() {
			return getRuleContext(ColumnPropertiesContext.class,0);
		}
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(ADD);
			setState(397);
			columnOrVirtualDefinitions();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(398);
				columnProperties();
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

	public static class ColumnOrVirtualDefinitionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ColumnOrVirtualDefinitionContext> columnOrVirtualDefinition() {
			return getRuleContexts(ColumnOrVirtualDefinitionContext.class);
		}
		public ColumnOrVirtualDefinitionContext columnOrVirtualDefinition(int i) {
			return getRuleContext(ColumnOrVirtualDefinitionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ColumnOrVirtualDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrVirtualDefinitions; }
	}

	public final ColumnOrVirtualDefinitionsContext columnOrVirtualDefinitions() throws RecognitionException {
		ColumnOrVirtualDefinitionsContext _localctx = new ColumnOrVirtualDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_columnOrVirtualDefinitions);
		int _la;
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				match(LP_);
				setState(402);
				columnOrVirtualDefinition();
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(403);
					match(COMMA_);
					setState(404);
					columnOrVirtualDefinition();
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(410);
				match(RP_);
				}
				break;
			case IDENTIFIER_:
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				columnOrVirtualDefinition();
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

	public static class ColumnOrVirtualDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public VirtualColumnDefinitionContext virtualColumnDefinition() {
			return getRuleContext(VirtualColumnDefinitionContext.class,0);
		}
		public ColumnOrVirtualDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrVirtualDefinition; }
	}

	public final ColumnOrVirtualDefinitionContext columnOrVirtualDefinition() throws RecognitionException {
		ColumnOrVirtualDefinitionContext _localctx = new ColumnOrVirtualDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_columnOrVirtualDefinition);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				virtualColumnDefinition();
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

	public static class ModifyColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(OracleStatementParser.MODIFY, 0); }
		public List<ModifyColPropertiesContext> modifyColProperties() {
			return getRuleContexts(ModifyColPropertiesContext.class);
		}
		public ModifyColPropertiesContext modifyColProperties(int i) {
			return getRuleContext(ModifyColPropertiesContext.class,i);
		}
		public ModifyColSubstitutableContext modifyColSubstitutable() {
			return getRuleContext(ModifyColSubstitutableContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_modifyColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(MODIFY);
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
			case IDENTIFIER_:
			case STRING_:
				{
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(420);
					match(LP_);
					}
				}

				setState(423);
				modifyColProperties();
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(424);
					match(COMMA_);
					setState(425);
					modifyColProperties();
					}
					}
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RP_) {
					{
					setState(431);
					match(RP_);
					}
				}

				}
				break;
			case COLUMN:
				{
				setState(434);
				modifyColSubstitutable();
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

	public static class ModifyColPropertiesContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENCRYPT() { return getToken(OracleStatementParser.ENCRYPT, 0); }
		public EncryptionSpecContext encryptionSpec() {
			return getRuleContext(EncryptionSpecContext.class,0);
		}
		public TerminalNode DECRYPT() { return getToken(OracleStatementParser.DECRYPT, 0); }
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public ModifyColPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColProperties; }
	}

	public final ModifyColPropertiesContext modifyColProperties() throws RecognitionException {
		ModifyColPropertiesContext _localctx = new ModifyColPropertiesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_modifyColProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			columnName();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIONAL || _la==IDENTIFIER_) {
				{
				setState(438);
				dataType();
				}
			}

			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(441);
				match(DEFAULT);
				setState(442);
				expr(0);
				}
			}

			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENCRYPT:
				{
				setState(445);
				match(ENCRYPT);
				setState(446);
				encryptionSpec();
				}
				break;
			case DECRYPT:
				{
				setState(447);
				match(DECRYPT);
				}
				break;
			case EOF:
			case KEY:
			case NOT:
			case NULL:
			case PRIMARY:
			case SET:
			case ADD:
			case CHECK:
			case CONSTRAINT:
			case DROP:
			case REFERENCES:
			case UNIQUE:
			case MODIFY:
			case RP_:
			case COMMA_:
			case SEMI_:
				break;
			default:
				break;
			}
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (KEY - 21)) | (1L << (NOT - 21)) | (1L << (NULL - 21)) | (1L << (PRIMARY - 21)) | (1L << (CHECK - 21)) | (1L << (CONSTRAINT - 21)) | (1L << (REFERENCES - 21)) | (1L << (UNIQUE - 21)))) != 0)) {
				{
				{
				setState(450);
				inlineConstraint();
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

	public static class ModifyColSubstitutableContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode SUBSTITUTABLE() { return getToken(OracleStatementParser.SUBSTITUTABLE, 0); }
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode LEVELS() { return getToken(OracleStatementParser.LEVELS, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode FORCE() { return getToken(OracleStatementParser.FORCE, 0); }
		public ModifyColSubstitutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColSubstitutable; }
	}

	public final ModifyColSubstitutableContext modifyColSubstitutable() throws RecognitionException {
		ModifyColSubstitutableContext _localctx = new ModifyColSubstitutableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_modifyColSubstitutable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(COLUMN);
			setState(457);
			columnName();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(458);
				match(NOT);
				}
			}

			setState(461);
			match(SUBSTITUTABLE);
			setState(462);
			match(AT);
			setState(463);
			match(ALL);
			setState(464);
			match(LEVELS);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORCE) {
				{
				setState(465);
				match(FORCE);
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

	public static class DropColumnClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode UNUSED() { return getToken(OracleStatementParser.UNUSED, 0); }
		public ColumnOrColumnListContext columnOrColumnList() {
			return getRuleContext(ColumnOrColumnListContext.class,0);
		}
		public List<CascadeOrInvalidateContext> cascadeOrInvalidate() {
			return getRuleContexts(CascadeOrInvalidateContext.class);
		}
		public CascadeOrInvalidateContext cascadeOrInvalidate(int i) {
			return getRuleContext(CascadeOrInvalidateContext.class,i);
		}
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public DropColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnClause; }
	}

	public final DropColumnClauseContext dropColumnClause() throws RecognitionException {
		DropColumnClauseContext _localctx = new DropColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dropColumnClause);
		int _la;
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				match(SET);
				setState(469);
				match(UNUSED);
				setState(470);
				columnOrColumnList();
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASCADE || _la==INVALIDATE) {
					{
					{
					setState(471);
					cascadeOrInvalidate();
					}
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				dropColumnSpecification();
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

	public static class DropColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public ColumnOrColumnListContext columnOrColumnList() {
			return getRuleContext(ColumnOrColumnListContext.class,0);
		}
		public List<CascadeOrInvalidateContext> cascadeOrInvalidate() {
			return getRuleContexts(CascadeOrInvalidateContext.class);
		}
		public CascadeOrInvalidateContext cascadeOrInvalidate(int i) {
			return getRuleContext(CascadeOrInvalidateContext.class,i);
		}
		public CheckpointNumberContext checkpointNumber() {
			return getRuleContext(CheckpointNumberContext.class,0);
		}
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
			setState(480);
			match(DROP);
			setState(481);
			columnOrColumnList();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASCADE || _la==INVALIDATE) {
				{
				{
				setState(482);
				cascadeOrInvalidate();
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHECKPOINT) {
				{
				setState(488);
				checkpointNumber();
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

	public static class ColumnOrColumnListContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ColumnOrColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrColumnList; }
	}

	public final ColumnOrColumnListContext columnOrColumnList() throws RecognitionException {
		ColumnOrColumnListContext _localctx = new ColumnOrColumnListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_columnOrColumnList);
		int _la;
		try {
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLUMN:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				match(COLUMN);
				setState(492);
				columnName();
				}
				break;
			case LP_:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				match(LP_);
				setState(494);
				columnName();
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(495);
					match(COMMA_);
					setState(496);
					columnName();
					}
					}
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(502);
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

	public static class CascadeOrInvalidateContext extends ParserRuleContext {
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(OracleStatementParser.CONSTRAINTS, 0); }
		public TerminalNode INVALIDATE() { return getToken(OracleStatementParser.INVALIDATE, 0); }
		public CascadeOrInvalidateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cascadeOrInvalidate; }
	}

	public final CascadeOrInvalidateContext cascadeOrInvalidate() throws RecognitionException {
		CascadeOrInvalidateContext _localctx = new CascadeOrInvalidateContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cascadeOrInvalidate);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASCADE:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				match(CASCADE);
				setState(507);
				match(CONSTRAINTS);
				}
				break;
			case INVALIDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(INVALIDATE);
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

	public static class CheckpointNumberContext extends ParserRuleContext {
		public TerminalNode CHECKPOINT() { return getToken(OracleStatementParser.CHECKPOINT, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public CheckpointNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkpointNumber; }
	}

	public final CheckpointNumberContext checkpointNumber() throws RecognitionException {
		CheckpointNumberContext _localctx = new CheckpointNumberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_checkpointNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(CHECKPOINT);
			setState(512);
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

	public static class RenameColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public RenameColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameColumnSpecification; }
	}

	public final RenameColumnSpecificationContext renameColumnSpecification() throws RecognitionException {
		RenameColumnSpecificationContext _localctx = new RenameColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_renameColumnSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(RENAME);
			setState(515);
			match(COLUMN);
			setState(516);
			columnName();
			setState(517);
			match(TO);
			setState(518);
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

	public static class ConstraintClausesContext extends ParserRuleContext {
		public AddConstraintSpecificationContext addConstraintSpecification() {
			return getRuleContext(AddConstraintSpecificationContext.class,0);
		}
		public ModifyConstraintClauseContext modifyConstraintClause() {
			return getRuleContext(ModifyConstraintClauseContext.class,0);
		}
		public RenameConstraintClauseContext renameConstraintClause() {
			return getRuleContext(RenameConstraintClauseContext.class,0);
		}
		public List<DropConstraintClauseContext> dropConstraintClause() {
			return getRuleContexts(DropConstraintClauseContext.class);
		}
		public DropConstraintClauseContext dropConstraintClause(int i) {
			return getRuleContext(DropConstraintClauseContext.class,i);
		}
		public ConstraintClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintClauses; }
	}

	public final ConstraintClausesContext constraintClauses() throws RecognitionException {
		ConstraintClausesContext _localctx = new ConstraintClausesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constraintClauses);
		int _la;
		try {
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				addConstraintSpecification();
				}
				break;
			case MODIFY:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				modifyConstraintClause();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(522);
				renameConstraintClause();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 4);
				{
				setState(524); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(523);
					dropConstraintClause();
					}
					}
					setState(526); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DROP );
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

	public static class AddConstraintSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(OracleStatementParser.ADD, 0); }
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public List<OutOfLineConstraintContext> outOfLineConstraint() {
			return getRuleContexts(OutOfLineConstraintContext.class);
		}
		public OutOfLineConstraintContext outOfLineConstraint(int i) {
			return getRuleContext(OutOfLineConstraintContext.class,i);
		}
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
			setState(530);
			match(ADD);
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(532); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(531);
					outOfLineConstraint();
					}
					}
					setState(534); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (KEY - 21)) | (1L << (PRIMARY - 21)) | (1L << (CHECK - 21)) | (1L << (CONSTRAINT - 21)) | (1L << (FOREIGN - 21)) | (1L << (UNIQUE - 21)))) != 0) );
				}
				break;
			case 2:
				{
				setState(536);
				outOfLineRefConstraint();
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

	public static class ModifyConstraintClauseContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(OracleStatementParser.MODIFY, 0); }
		public ConstraintOptionContext constraintOption() {
			return getRuleContext(ConstraintOptionContext.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public ModifyConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyConstraintClause; }
	}

	public final ModifyConstraintClauseContext modifyConstraintClause() throws RecognitionException {
		ModifyConstraintClauseContext _localctx = new ModifyConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_modifyConstraintClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(MODIFY);
			setState(540);
			constraintOption();
			setState(542); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(541);
				constraintState();
				}
				}
				setState(544); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (DEFERRABLE - 111)) | (1L << (EXCEPTIONS - 111)) | (1L << (INITIALLY - 111)) | (1L << (NORELY - 111)) | (1L << (NOVALIDATE - 111)) | (1L << (RELY - 111)) | (1L << (USING - 111)) | (1L << (VALIDATE - 111)))) != 0) );
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE) {
				{
				setState(546);
				match(CASCADE);
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

	public static class ConstraintWithNameContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintWithNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintWithName; }
	}

	public final ConstraintWithNameContext constraintWithName() throws RecognitionException {
		ConstraintWithNameContext _localctx = new ConstraintWithNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constraintWithName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(CONSTRAINT);
			setState(550);
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

	public static class ConstraintOptionContext extends ParserRuleContext {
		public ConstraintWithNameContext constraintWithName() {
			return getRuleContext(ConstraintWithNameContext.class,0);
		}
		public ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() {
			return getRuleContext(ConstraintPrimaryOrUniqueContext.class,0);
		}
		public ConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintOption; }
	}

	public final ConstraintOptionContext constraintOption() throws RecognitionException {
		ConstraintOptionContext _localctx = new ConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constraintOption);
		try {
			setState(554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				constraintWithName();
				}
				break;
			case KEY:
			case PRIMARY:
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				constraintPrimaryOrUnique();
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

	public static class ConstraintPrimaryOrUniqueContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ConstraintPrimaryOrUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintPrimaryOrUnique; }
	}

	public final ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() throws RecognitionException {
		ConstraintPrimaryOrUniqueContext _localctx = new ConstraintPrimaryOrUniqueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_constraintPrimaryOrUnique);
		try {
			setState(559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				match(UNIQUE);
				setState(558);
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

	public static class RenameConstraintClauseContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public ConstraintWithNameContext constraintWithName() {
			return getRuleContext(ConstraintWithNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public RenameConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameConstraintClause; }
	}

	public final RenameConstraintClauseContext renameConstraintClause() throws RecognitionException {
		RenameConstraintClauseContext _localctx = new RenameConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_renameConstraintClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(RENAME);
			setState(562);
			constraintWithName();
			setState(563);
			match(TO);
			setState(564);
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

	public static class DropConstraintClauseContext extends ParserRuleContext {
		public List<TerminalNode> DROP() { return getTokens(OracleStatementParser.DROP); }
		public TerminalNode DROP(int i) {
			return getToken(OracleStatementParser.DROP, i);
		}
		public ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() {
			return getRuleContext(ConstraintPrimaryOrUniqueContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public TerminalNode KEEP() { return getToken(OracleStatementParser.KEEP, 0); }
		public DropConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintClause; }
	}

	public final DropConstraintClauseContext dropConstraintClause() throws RecognitionException {
		DropConstraintClauseContext _localctx = new DropConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_dropConstraintClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(DROP);
			setState(580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
			case UNIQUE:
				{
				setState(567);
				constraintPrimaryOrUnique();
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE) {
					{
					setState(568);
					match(CASCADE);
					}
				}

				setState(573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(571);
					_la = _input.LA(1);
					if ( !(_la==DROP || _la==KEEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(572);
					match(INDEX);
					}
					break;
				}
				}
				break;
			case CONSTRAINT:
				{
				{
				setState(575);
				match(CONSTRAINT);
				setState(576);
				ignoredIdentifier_();
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE) {
					{
					setState(577);
					match(CASCADE);
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

	public static class AlterExternalTableContext extends ParserRuleContext {
		public List<AddColumnSpecificationContext> addColumnSpecification() {
			return getRuleContexts(AddColumnSpecificationContext.class);
		}
		public AddColumnSpecificationContext addColumnSpecification(int i) {
			return getRuleContext(AddColumnSpecificationContext.class,i);
		}
		public List<ModifyColumnSpecificationContext> modifyColumnSpecification() {
			return getRuleContexts(ModifyColumnSpecificationContext.class);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification(int i) {
			return getRuleContext(ModifyColumnSpecificationContext.class,i);
		}
		public List<DropColumnSpecificationContext> dropColumnSpecification() {
			return getRuleContexts(DropColumnSpecificationContext.class);
		}
		public DropColumnSpecificationContext dropColumnSpecification(int i) {
			return getRuleContext(DropColumnSpecificationContext.class,i);
		}
		public AlterExternalTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterExternalTable; }
	}

	public final AlterExternalTableContext alterExternalTable() throws RecognitionException {
		AlterExternalTableContext _localctx = new AlterExternalTableContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_alterExternalTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(585);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(582);
					addColumnSpecification();
					}
					break;
				case MODIFY:
					{
					setState(583);
					modifyColumnSpecification();
					}
					break;
				case DROP:
					{
					setState(584);
					dropColumnSpecification();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(587); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ADD || _la==DROP || _la==MODIFY );
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SORT() { return getToken(OracleStatementParser.SORT, 0); }
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentityClauseContext identityClause() {
			return getRuleContext(IdentityClauseContext.class,0);
		}
		public TerminalNode ENCRYPT() { return getToken(OracleStatementParser.ENCRYPT, 0); }
		public EncryptionSpecContext encryptionSpec() {
			return getRuleContext(EncryptionSpecContext.class,0);
		}
		public InlineRefConstraintContext inlineRefConstraint() {
			return getRuleContext(InlineRefConstraintContext.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			columnName();
			setState(590);
			dataType();
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(591);
				match(SORT);
				}
			}

			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(594);
				match(DEFAULT);
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(595);
					match(ON);
					setState(596);
					match(NULL);
					}
				}

				setState(599);
				expr(0);
				}
				break;
			case GENERATED:
				{
				setState(600);
				identityClause();
				}
				break;
			case EOF:
			case KEY:
			case NOT:
			case NULL:
			case PRIMARY:
			case SET:
			case WITH:
			case ADD:
			case CHECK:
			case COLUMN:
			case CONSTRAINT:
			case DROP:
			case REFERENCES:
			case UNIQUE:
			case ENCRYPT:
			case MODIFY:
			case SCOPE:
			case RP_:
			case COMMA_:
			case SEMI_:
				break;
			default:
				break;
			}
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENCRYPT) {
				{
				setState(603);
				match(ENCRYPT);
				setState(604);
				encryptionSpec();
				}
			}

			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(608); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(607);
					inlineConstraint();
					}
					}
					setState(610); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (KEY - 21)) | (1L << (NOT - 21)) | (1L << (NULL - 21)) | (1L << (PRIMARY - 21)) | (1L << (CHECK - 21)) | (1L << (CONSTRAINT - 21)) | (1L << (REFERENCES - 21)) | (1L << (UNIQUE - 21)))) != 0) );
				}
				break;
			case 2:
				{
				setState(612);
				inlineRefConstraint();
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

	public static class IdentityClauseContext extends ParserRuleContext {
		public TerminalNode GENERATED() { return getToken(OracleStatementParser.GENERATED, 0); }
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(OracleStatementParser.IDENTITY, 0); }
		public TerminalNode ALWAYS() { return getToken(OracleStatementParser.ALWAYS, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public List<IdentityOptionsContext> identityOptions() {
			return getRuleContexts(IdentityOptionsContext.class);
		}
		public IdentityOptionsContext identityOptions(int i) {
			return getRuleContext(IdentityOptionsContext.class,i);
		}
		public IdentityClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityClause; }
	}

	public final IdentityClauseContext identityClause() throws RecognitionException {
		IdentityClauseContext _localctx = new IdentityClauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_identityClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(GENERATED);
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALWAYS:
				{
				setState(616);
				match(ALWAYS);
				}
				break;
			case BY:
				{
				setState(617);
				match(BY);
				setState(618);
				match(DEFAULT);
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(619);
					match(ON);
					setState(620);
					match(NULL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(625);
			match(AS);
			setState(626);
			match(IDENTITY);
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(627);
				match(LP_);
				}
			}

			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER || _la==START || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (CACHE - 103)) | (1L << (CYCLE - 103)) | (1L << (INCREMENT - 103)) | (1L << (MAXVALUE - 103)) | (1L << (MINVALUE - 103)) | (1L << (NOCACHE - 103)) | (1L << (NOCYCLE - 103)) | (1L << (NOMAXVALUE - 103)) | (1L << (NOMINVALUE - 103)) | (1L << (NOORDER - 103)))) != 0)) {
				{
				setState(631); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(630);
					identityOptions();
					}
					}
					setState(633); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ORDER || _la==START || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (CACHE - 103)) | (1L << (CYCLE - 103)) | (1L << (INCREMENT - 103)) | (1L << (MAXVALUE - 103)) | (1L << (MINVALUE - 103)) | (1L << (NOCACHE - 103)) | (1L << (NOCYCLE - 103)) | (1L << (NOMAXVALUE - 103)) | (1L << (NOMINVALUE - 103)) | (1L << (NOORDER - 103)))) != 0) );
				}
			}

			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(637);
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

	public static class IdentityOptionsContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(OracleStatementParser.START, 0); }
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode LIMIT() { return getToken(OracleStatementParser.LIMIT, 0); }
		public TerminalNode VALUE() { return getToken(OracleStatementParser.VALUE, 0); }
		public TerminalNode INCREMENT() { return getToken(OracleStatementParser.INCREMENT, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode MAXVALUE() { return getToken(OracleStatementParser.MAXVALUE, 0); }
		public TerminalNode NOMAXVALUE() { return getToken(OracleStatementParser.NOMAXVALUE, 0); }
		public TerminalNode MINVALUE() { return getToken(OracleStatementParser.MINVALUE, 0); }
		public TerminalNode NOMINVALUE() { return getToken(OracleStatementParser.NOMINVALUE, 0); }
		public TerminalNode CYCLE() { return getToken(OracleStatementParser.CYCLE, 0); }
		public TerminalNode NOCYCLE() { return getToken(OracleStatementParser.NOCYCLE, 0); }
		public TerminalNode CACHE() { return getToken(OracleStatementParser.CACHE, 0); }
		public TerminalNode NOCACHE() { return getToken(OracleStatementParser.NOCACHE, 0); }
		public TerminalNode ORDER() { return getToken(OracleStatementParser.ORDER, 0); }
		public TerminalNode NOORDER() { return getToken(OracleStatementParser.NOORDER, 0); }
		public IdentityOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityOptions; }
	}

	public final IdentityOptionsContext identityOptions() throws RecognitionException {
		IdentityOptionsContext _localctx = new IdentityOptionsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_identityOptions);
		try {
			setState(663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				match(START);
				setState(641);
				match(WITH);
				setState(645);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER_:
					{
					setState(642);
					match(NUMBER_);
					}
					break;
				case LIMIT:
					{
					setState(643);
					match(LIMIT);
					setState(644);
					match(VALUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case INCREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				match(INCREMENT);
				setState(648);
				match(BY);
				setState(649);
				match(NUMBER_);
				}
				break;
			case MAXVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
				match(MAXVALUE);
				setState(651);
				match(NUMBER_);
				}
				break;
			case NOMAXVALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(652);
				match(NOMAXVALUE);
				}
				break;
			case MINVALUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(653);
				match(MINVALUE);
				setState(654);
				match(NUMBER_);
				}
				break;
			case NOMINVALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(655);
				match(NOMINVALUE);
				}
				break;
			case CYCLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(656);
				match(CYCLE);
				}
				break;
			case NOCYCLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(657);
				match(NOCYCLE);
				}
				break;
			case CACHE:
				enterOuterAlt(_localctx, 9);
				{
				setState(658);
				match(CACHE);
				setState(659);
				match(NUMBER_);
				}
				break;
			case NOCACHE:
				enterOuterAlt(_localctx, 10);
				{
				setState(660);
				match(NOCACHE);
				}
				break;
			case ORDER:
				enterOuterAlt(_localctx, 11);
				{
				setState(661);
				match(ORDER);
				}
				break;
			case NOORDER:
				enterOuterAlt(_localctx, 12);
				{
				setState(662);
				match(NOORDER);
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

	public static class VirtualColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(OracleStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(OracleStatementParser.ALWAYS, 0); }
		public TerminalNode VIRTUAL() { return getToken(OracleStatementParser.VIRTUAL, 0); }
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public VirtualColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtualColumnDefinition; }
	}

	public final VirtualColumnDefinitionContext virtualColumnDefinition() throws RecognitionException {
		VirtualColumnDefinitionContext _localctx = new VirtualColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_virtualColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			columnName();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIONAL || _la==IDENTIFIER_) {
				{
				setState(666);
				dataType();
				}
			}

			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GENERATED) {
				{
				setState(669);
				match(GENERATED);
				setState(670);
				match(ALWAYS);
				}
			}

			setState(673);
			match(AS);
			setState(674);
			match(LP_);
			setState(675);
			expr(0);
			setState(676);
			match(RP_);
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(677);
				match(VIRTUAL);
				}
			}

			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (KEY - 21)) | (1L << (NOT - 21)) | (1L << (NULL - 21)) | (1L << (PRIMARY - 21)) | (1L << (CHECK - 21)) | (1L << (CONSTRAINT - 21)) | (1L << (REFERENCES - 21)) | (1L << (UNIQUE - 21)))) != 0)) {
				{
				{
				setState(680);
				inlineConstraint();
				}
				}
				setState(685);
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

	public static class InlineConstraintContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(OracleStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public InlineConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineConstraint; }
	}

	public final InlineConstraintContext inlineConstraint() throws RecognitionException {
		InlineConstraintContext _localctx = new InlineConstraintContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_inlineConstraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(686);
				match(CONSTRAINT);
				setState(687);
				ignoredIdentifier_();
				}
			}

			setState(702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NULL:
				{
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(690);
					match(NOT);
					}
				}

				setState(693);
				match(NULL);
				}
				break;
			case UNIQUE:
				{
				setState(694);
				match(UNIQUE);
				}
				break;
			case KEY:
			case PRIMARY:
				{
				setState(695);
				primaryKey();
				}
				break;
			case REFERENCES:
				{
				setState(696);
				referencesClause();
				}
				break;
			case CHECK:
				{
				setState(697);
				match(CHECK);
				setState(698);
				match(LP_);
				setState(699);
				expr(0);
				setState(700);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(704);
					constraintState();
					}
					} 
				}
				setState(709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class ReferencesClauseContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(OracleStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public ReferencesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencesClause; }
	}

	public final ReferencesClauseContext referencesClause() throws RecognitionException {
		ReferencesClauseContext _localctx = new ReferencesClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_referencesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(REFERENCES);
			setState(711);
			tableName();
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(712);
				columnNames();
				}
			}

			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(715);
				match(ON);
				setState(716);
				match(DELETE);
				setState(720);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASCADE:
					{
					setState(717);
					match(CASCADE);
					}
					break;
				case SET:
					{
					setState(718);
					match(SET);
					setState(719);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ConstraintStateContext extends ParserRuleContext {
		public NotDeferrableContext notDeferrable() {
			return getRuleContext(NotDeferrableContext.class,0);
		}
		public InitiallyClauseContext initiallyClause() {
			return getRuleContext(InitiallyClauseContext.class,0);
		}
		public TerminalNode RELY() { return getToken(OracleStatementParser.RELY, 0); }
		public TerminalNode NORELY() { return getToken(OracleStatementParser.NORELY, 0); }
		public UsingIndexClauseContext usingIndexClause() {
			return getRuleContext(UsingIndexClauseContext.class,0);
		}
		public TerminalNode ENABLE() { return getToken(OracleStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(OracleStatementParser.DISABLE, 0); }
		public TerminalNode VALIDATE() { return getToken(OracleStatementParser.VALIDATE, 0); }
		public TerminalNode NOVALIDATE() { return getToken(OracleStatementParser.NOVALIDATE, 0); }
		public ExceptionsClauseContext exceptionsClause() {
			return getRuleContext(ExceptionsClauseContext.class,0);
		}
		public ConstraintStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintState; }
	}

	public final ConstraintStateContext constraintState() throws RecognitionException {
		ConstraintStateContext _localctx = new ConstraintStateContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constraintState);
		try {
			setState(734);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case DEFERRABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				notDeferrable();
				}
				break;
			case INITIALLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				initiallyClause();
				}
				break;
			case RELY:
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				match(RELY);
				}
				break;
			case NORELY:
				enterOuterAlt(_localctx, 4);
				{
				setState(727);
				match(NORELY);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 5);
				{
				setState(728);
				usingIndexClause();
				}
				break;
			case ENABLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(729);
				match(ENABLE);
				}
				break;
			case DISABLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(730);
				match(DISABLE);
				}
				break;
			case VALIDATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(731);
				match(VALIDATE);
				}
				break;
			case NOVALIDATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(732);
				match(NOVALIDATE);
				}
				break;
			case EXCEPTIONS:
				enterOuterAlt(_localctx, 10);
				{
				setState(733);
				exceptionsClause();
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

	public static class NotDeferrableContext extends ParserRuleContext {
		public TerminalNode DEFERRABLE() { return getToken(OracleStatementParser.DEFERRABLE, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public NotDeferrableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notDeferrable; }
	}

	public final NotDeferrableContext notDeferrable() throws RecognitionException {
		NotDeferrableContext _localctx = new NotDeferrableContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_notDeferrable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(736);
				match(NOT);
				}
			}

			setState(739);
			match(DEFERRABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitiallyClauseContext extends ParserRuleContext {
		public TerminalNode INITIALLY() { return getToken(OracleStatementParser.INITIALLY, 0); }
		public TerminalNode IMMEDIATE() { return getToken(OracleStatementParser.IMMEDIATE, 0); }
		public TerminalNode DEFERRED() { return getToken(OracleStatementParser.DEFERRED, 0); }
		public InitiallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initiallyClause; }
	}

	public final InitiallyClauseContext initiallyClause() throws RecognitionException {
		InitiallyClauseContext _localctx = new InitiallyClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_initiallyClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(INITIALLY);
			setState(742);
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
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionsClauseContext extends ParserRuleContext {
		public TerminalNode EXCEPTIONS() { return getToken(OracleStatementParser.EXCEPTIONS, 0); }
		public TerminalNode INTO() { return getToken(OracleStatementParser.INTO, 0); }
		public ExceptionsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionsClause; }
	}

	public final ExceptionsClauseContext exceptionsClause() throws RecognitionException {
		ExceptionsClauseContext _localctx = new ExceptionsClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_exceptionsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(EXCEPTIONS);
			setState(745);
			match(INTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingIndexClauseContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public UsingIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingIndexClause; }
	}

	public final UsingIndexClauseContext usingIndexClause() throws RecognitionException {
		UsingIndexClauseContext _localctx = new UsingIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_usingIndexClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(USING);
			setState(748);
			match(INDEX);
			setState(754);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
			case STRING_:
				{
				setState(749);
				indexName();
				}
				break;
			case LP_:
				{
				setState(750);
				match(LP_);
				setState(751);
				createIndex();
				setState(752);
				match(RP_);
				}
				break;
			case EOF:
			case KEY:
			case NOT:
			case NULL:
			case PRIMARY:
			case SET:
			case ADD:
			case CASCADE:
			case CHECK:
			case COLUMN:
			case CONSTRAINT:
			case DISABLE:
			case DROP:
			case ENABLE:
			case FOREIGN:
			case REFERENCES:
			case UNIQUE:
			case DEFERRABLE:
			case EXCEPTIONS:
			case INITIALLY:
			case MODIFY:
			case NORELY:
			case NOVALIDATE:
			case RELY:
			case USING:
			case VALIDATE:
			case RP_:
			case COMMA_:
			case SEMI_:
				break;
			default:
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

	public static class InlineRefConstraintContext extends ParserRuleContext {
		public TerminalNode SCOPE() { return getToken(OracleStatementParser.SCOPE, 0); }
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode ROWID() { return getToken(OracleStatementParser.ROWID, 0); }
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public InlineRefConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineRefConstraint; }
	}

	public final InlineRefConstraintContext inlineRefConstraint() throws RecognitionException {
		InlineRefConstraintContext _localctx = new InlineRefConstraintContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_inlineRefConstraint);
		int _la;
		try {
			setState(772);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				match(SCOPE);
				setState(757);
				match(IS);
				setState(758);
				tableName();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				match(WITH);
				setState(760);
				match(ROWID);
				}
				break;
			case CONSTRAINT:
			case REFERENCES:
				enterOuterAlt(_localctx, 3);
				{
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(761);
					match(CONSTRAINT);
					setState(762);
					ignoredIdentifier_();
					}
				}

				setState(765);
				referencesClause();
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (DEFERRABLE - 111)) | (1L << (EXCEPTIONS - 111)) | (1L << (INITIALLY - 111)) | (1L << (NORELY - 111)) | (1L << (NOVALIDATE - 111)) | (1L << (RELY - 111)) | (1L << (USING - 111)) | (1L << (VALIDATE - 111)))) != 0)) {
					{
					{
					setState(766);
					constraintState();
					}
					}
					setState(771);
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

	public static class OutOfLineConstraintContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(OracleStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(OracleStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public OutOfLineConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outOfLineConstraint; }
	}

	public final OutOfLineConstraintContext outOfLineConstraint() throws RecognitionException {
		OutOfLineConstraintContext _localctx = new OutOfLineConstraintContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_outOfLineConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(774);
				match(CONSTRAINT);
				setState(775);
				ignoredIdentifier_();
				}
			}

			setState(793);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIQUE:
				{
				setState(778);
				match(UNIQUE);
				setState(779);
				columnNames();
				}
				break;
			case KEY:
			case PRIMARY:
				{
				setState(780);
				primaryKey();
				setState(781);
				columnNames();
				}
				break;
			case FOREIGN:
				{
				setState(783);
				match(FOREIGN);
				setState(784);
				match(KEY);
				setState(785);
				columnNames();
				setState(786);
				referencesClause();
				}
				break;
			case CHECK:
				{
				setState(788);
				match(CHECK);
				setState(789);
				match(LP_);
				setState(790);
				expr(0);
				setState(791);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (DEFERRABLE - 111)) | (1L << (EXCEPTIONS - 111)) | (1L << (INITIALLY - 111)) | (1L << (NORELY - 111)) | (1L << (NOVALIDATE - 111)) | (1L << (RELY - 111)) | (1L << (USING - 111)) | (1L << (VALIDATE - 111)))) != 0)) {
				{
				{
				setState(795);
				constraintState();
				}
				}
				setState(800);
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

	public static class OutOfLineRefConstraintContext extends ParserRuleContext {
		public TerminalNode SCOPE() { return getToken(OracleStatementParser.SCOPE, 0); }
		public TerminalNode FOR() { return getToken(OracleStatementParser.FOR, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public LobItemContext lobItem() {
			return getRuleContext(LobItemContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode REF() { return getToken(OracleStatementParser.REF, 0); }
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode ROWID() { return getToken(OracleStatementParser.ROWID, 0); }
		public TerminalNode FOREIGN() { return getToken(OracleStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public LobItemListContext lobItemList() {
			return getRuleContext(LobItemListContext.class,0);
		}
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public OutOfLineRefConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outOfLineRefConstraint; }
	}

	public final OutOfLineRefConstraintContext outOfLineRefConstraint() throws RecognitionException {
		OutOfLineRefConstraintContext _localctx = new OutOfLineRefConstraintContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_outOfLineRefConstraint);
		int _la;
		try {
			setState(830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				match(SCOPE);
				setState(802);
				match(FOR);
				setState(803);
				match(LP_);
				setState(804);
				lobItem();
				setState(805);
				match(RP_);
				setState(806);
				match(IS);
				setState(807);
				tableName();
				}
				break;
			case REF:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				match(REF);
				setState(810);
				match(LP_);
				setState(811);
				lobItem();
				setState(812);
				match(RP_);
				setState(813);
				match(WITH);
				setState(814);
				match(ROWID);
				}
				break;
			case CONSTRAINT:
			case FOREIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(816);
					match(CONSTRAINT);
					setState(817);
					ignoredIdentifier_();
					}
				}

				setState(820);
				match(FOREIGN);
				setState(821);
				match(KEY);
				setState(822);
				lobItemList();
				setState(823);
				referencesClause();
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (DEFERRABLE - 111)) | (1L << (EXCEPTIONS - 111)) | (1L << (INITIALLY - 111)) | (1L << (NORELY - 111)) | (1L << (NOVALIDATE - 111)) | (1L << (RELY - 111)) | (1L << (USING - 111)) | (1L << (VALIDATE - 111)))) != 0)) {
					{
					{
					setState(824);
					constraintState();
					}
					}
					setState(829);
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

	public static class EncryptionSpecContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public List<TerminalNode> STRING_() { return getTokens(OracleStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(OracleStatementParser.STRING_, i);
		}
		public TerminalNode IDENTIFIED() { return getToken(OracleStatementParser.IDENTIFIED, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode SALT() { return getToken(OracleStatementParser.SALT, 0); }
		public TerminalNode NO() { return getToken(OracleStatementParser.NO, 0); }
		public EncryptionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encryptionSpec; }
	}

	public final EncryptionSpecContext encryptionSpec() throws RecognitionException {
		EncryptionSpecContext _localctx = new EncryptionSpecContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_encryptionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(832);
				match(USING);
				setState(833);
				match(STRING_);
				}
			}

			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIED) {
				{
				setState(836);
				match(IDENTIFIED);
				setState(837);
				match(BY);
				setState(838);
				match(STRING_);
				}
			}

			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_) {
				{
				setState(841);
				match(STRING_);
				}
			}

			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NO || _la==SALT) {
				{
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(844);
					match(NO);
					}
				}

				setState(847);
				match(SALT);
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

	public static class ObjectPropertiesContext extends ParserRuleContext {
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ObjectPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperties; }
	}

	public final ObjectPropertiesContext objectProperties() throws RecognitionException {
		ObjectPropertiesContext _localctx = new ObjectPropertiesContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_objectProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			objectProperty();
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(851);
				match(COMMA_);
				setState(852);
				objectProperty();
				}
				}
				setState(857);
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

	public static class ObjectPropertyContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public InlineRefConstraintContext inlineRefConstraint() {
			return getRuleContext(InlineRefConstraintContext.class,0);
		}
		public OutOfLineConstraintContext outOfLineConstraint() {
			return getRuleContext(OutOfLineConstraintContext.class,0);
		}
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_objectProperty);
		int _la;
		try {
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(858);
					columnName();
					}
					break;
				case 2:
					{
					setState(859);
					attributeName();
					}
					break;
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(862);
					match(DEFAULT);
					setState(863);
					expr(0);
					}
				}

				setState(875);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(869);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (KEY - 21)) | (1L << (NOT - 21)) | (1L << (NULL - 21)) | (1L << (PRIMARY - 21)) | (1L << (CHECK - 21)) | (1L << (CONSTRAINT - 21)) | (1L << (REFERENCES - 21)) | (1L << (UNIQUE - 21)))) != 0)) {
						{
						{
						setState(866);
						inlineConstraint();
						}
						}
						setState(871);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(873);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (WITH - 40)) | (1L << (CONSTRAINT - 40)) | (1L << (REFERENCES - 40)))) != 0) || _la==SCOPE) {
						{
						setState(872);
						inlineRefConstraint();
						}
					}

					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				outOfLineConstraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(878);
				outOfLineRefConstraint();
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

	public static class ColumnPropertiesContext extends ParserRuleContext {
		public List<ColumnPropertyContext> columnProperty() {
			return getRuleContexts(ColumnPropertyContext.class);
		}
		public ColumnPropertyContext columnProperty(int i) {
			return getRuleContext(ColumnPropertyContext.class,i);
		}
		public ColumnPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnProperties; }
	}

	public final ColumnPropertiesContext columnProperties() throws RecognitionException {
		ColumnPropertiesContext _localctx = new ColumnPropertiesContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_columnProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(881);
				columnProperty();
				}
				}
				setState(884); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLUMN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnPropertyContext extends ParserRuleContext {
		public ObjectTypeColPropertiesContext objectTypeColProperties() {
			return getRuleContext(ObjectTypeColPropertiesContext.class,0);
		}
		public ColumnPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnProperty; }
	}

	public final ColumnPropertyContext columnProperty() throws RecognitionException {
		ColumnPropertyContext _localctx = new ColumnPropertyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_columnProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			objectTypeColProperties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectTypeColPropertiesContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public SubstitutableColumnClauseContext substitutableColumnClause() {
			return getRuleContext(SubstitutableColumnClauseContext.class,0);
		}
		public ObjectTypeColPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectTypeColProperties; }
	}

	public final ObjectTypeColPropertiesContext objectTypeColProperties() throws RecognitionException {
		ObjectTypeColPropertiesContext _localctx = new ObjectTypeColPropertiesContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_objectTypeColProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(COLUMN);
			setState(889);
			columnName();
			setState(890);
			substitutableColumnClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubstitutableColumnClauseContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TerminalNode OF() { return getToken(OracleStatementParser.OF, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ELEMENT() { return getToken(OracleStatementParser.ELEMENT, 0); }
		public TerminalNode TYPE() { return getToken(OracleStatementParser.TYPE, 0); }
		public TerminalNode ONLY() { return getToken(OracleStatementParser.ONLY, 0); }
		public TerminalNode SUBSTITUTABLE() { return getToken(OracleStatementParser.SUBSTITUTABLE, 0); }
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode LEVELS() { return getToken(OracleStatementParser.LEVELS, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public SubstitutableColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substitutableColumnClause; }
	}

	public final SubstitutableColumnClauseContext substitutableColumnClause() throws RecognitionException {
		SubstitutableColumnClauseContext _localctx = new SubstitutableColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_substitutableColumnClause);
		int _la;
		try {
			setState(914);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IS:
			case ELEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELEMENT) {
					{
					setState(892);
					match(ELEMENT);
					}
				}

				setState(895);
				match(IS);
				setState(896);
				match(OF);
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(897);
					match(TYPE);
					}
				}

				setState(900);
				match(LP_);
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ONLY) {
					{
					setState(901);
					match(ONLY);
					}
				}

				setState(904);
				dataTypeName_();
				setState(905);
				match(RP_);
				}
				break;
			case NOT:
			case SUBSTITUTABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(907);
					match(NOT);
					}
				}

				setState(910);
				match(SUBSTITUTABLE);
				setState(911);
				match(AT);
				setState(912);
				match(ALL);
				setState(913);
				match(LEVELS);
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

	public static class CreateIndexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TableIndexClause_Context tableIndexClause_() {
			return getRuleContext(TableIndexClause_Context.class,0);
		}
		public BitmapJoinIndexClause_Context bitmapJoinIndexClause_() {
			return getRuleContext(BitmapJoinIndexClause_Context.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public TerminalNode BITMAP() { return getToken(OracleStatementParser.BITMAP, 0); }
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_createIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(CREATE);
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE || _la==BITMAP) {
				{
				setState(917);
				_la = _input.LA(1);
				if ( !(_la==UNIQUE || _la==BITMAP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(920);
			match(INDEX);
			setState(921);
			indexName();
			setState(922);
			match(ON);
			setState(925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(923);
				tableIndexClause_();
				}
				break;
			case 2:
				{
				setState(924);
				bitmapJoinIndexClause_();
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

	public static class TableIndexClause_Context extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<IndexExpr_Context> indexExpr_() {
			return getRuleContexts(IndexExpr_Context.class);
		}
		public IndexExpr_Context indexExpr_(int i) {
			return getRuleContext(IndexExpr_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TableIndexClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIndexClause_; }
	}

	public final TableIndexClause_Context tableIndexClause_() throws RecognitionException {
		TableIndexClause_Context _localctx = new TableIndexClause_Context(_ctx, getState());
		enterRule(_localctx, 120, RULE_tableIndexClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			tableName();
			setState(929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(928);
				alias();
				}
			}

			setState(931);
			match(LP_);
			setState(932);
			indexExpr_();
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(933);
				match(COMMA_);
				setState(934);
				indexExpr_();
				}
				}
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(940);
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

	public static class IndexExpr_Context extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public IndexExpr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexExpr_; }
	}

	public final IndexExpr_Context indexExpr_() throws RecognitionException {
		IndexExpr_Context _localctx = new IndexExpr_Context(_ctx, getState());
		enterRule(_localctx, 122, RULE_indexExpr_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(942);
				columnName();
				}
				break;
			case 2:
				{
				setState(943);
				expr(0);
				}
				break;
			}
			setState(947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(946);
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

	public static class BitmapJoinIndexClause_Context extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ColumnSortClause_Context> columnSortClause_() {
			return getRuleContexts(ColumnSortClause_Context.class);
		}
		public ColumnSortClause_Context columnSortClause_(int i) {
			return getRuleContext(ColumnSortClause_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(OracleStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public List<AliasContext> alias() {
			return getRuleContexts(AliasContext.class);
		}
		public AliasContext alias(int i) {
			return getRuleContext(AliasContext.class,i);
		}
		public BitmapJoinIndexClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitmapJoinIndexClause_; }
	}

	public final BitmapJoinIndexClause_Context bitmapJoinIndexClause_() throws RecognitionException {
		BitmapJoinIndexClause_Context _localctx = new BitmapJoinIndexClause_Context(_ctx, getState());
		enterRule(_localctx, 124, RULE_bitmapJoinIndexClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			tableName();
			setState(950);
			match(LP_);
			setState(951);
			columnSortClause_();
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(952);
				match(COMMA_);
				setState(953);
				columnSortClause_();
				}
				}
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(959);
			match(RP_);
			setState(960);
			match(FROM);
			setState(961);
			tableName();
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(962);
				alias();
				}
			}

			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(965);
				match(COMMA_);
				setState(966);
				tableName();
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER_) {
					{
					setState(967);
					alias();
					}
				}

				}
				}
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(975);
			match(WHERE);
			setState(976);
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

	public static class ColumnSortClause_Context extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public ColumnSortClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSortClause_; }
	}

	public final ColumnSortClause_Context columnSortClause_() throws RecognitionException {
		ColumnSortClause_Context _localctx = new ColumnSortClause_Context(_ctx, getState());
		enterRule(_localctx, 126, RULE_columnSortClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			tableName();
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(979);
				alias();
				}
				break;
			}
			setState(982);
			columnName();
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(983);
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

	public static class DropIndexContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_dropIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(DROP);
			setState(987);
			match(INDEX);
			setState(988);
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

	public static class AlterIndexContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public AlterIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndex; }
	}

	public final AlterIndexContext alterIndex() throws RecognitionException {
		AlterIndexContext _localctx = new AlterIndexContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_alterIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(ALTER);
			setState(991);
			match(INDEX);
			setState(992);
			indexName();
			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RENAME) {
				{
				setState(993);
				match(RENAME);
				setState(994);
				match(TO);
				setState(995);
				indexName();
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
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
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
		public OracleIdContext oracleId() {
			return getRuleContext(OracleIdContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			oracleId();
			}
		}
		catch (RecognitionException re) {
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
		public OracleIdContext oracleId() {
			return getRuleContext(OracleIdContext.class,0);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			oracleId();
			}
		}
		catch (RecognitionException re) {
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
		public OracleIdContext oracleId() {
			return getRuleContext(OracleIdContext.class,0);
		}
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			oracleId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OracleIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(OracleStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(OracleStatementParser.STRING_, i);
		}
		public List<TerminalNode> DOT_() { return getTokens(OracleStatementParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(OracleStatementParser.DOT_, i);
		}
		public OracleIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oracleId; }
	}

	public final OracleIdContext oracleId() throws RecognitionException {
		OracleIdContext _localctx = new OracleIdContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_oracleId);
		try {
			int _alt;
			setState(1015);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1006);
				match(IDENTIFIER_);
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1007);
						match(STRING_);
						setState(1008);
						match(DOT_);
						}
						} 
					}
					setState(1013);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				}
				setState(1014);
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

	public static class CollationNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_collationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
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

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(OracleStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(OracleStatementParser.NUMBER_, i);
		}
		public TerminalNode COMMA_() { return getToken(OracleStatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			match(LP_);
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER_) {
				{
				setState(1022);
				match(NUMBER_);
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(1023);
					match(COMMA_);
					setState(1024);
					match(NUMBER_);
					}
				}

				}
			}

			setState(1029);
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
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(OracleStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(1031);
				match(PRIMARY);
				}
			}

			setState(1034);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			match(LP_);
			setState(1037);
			columnName();
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1038);
				match(COMMA_);
				setState(1039);
				columnName();
				}
				}
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1045);
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
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			expr(0);
			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1048);
				match(COMMA_);
				setState(1049);
				expr(0);
				}
				}
				setState(1054);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_exprList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			match(LP_);
			setState(1056);
			exprs();
			setState(1057);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(OracleStatementParser.NOT_, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public ExprRecursiveContext exprRecursive() {
			return getRuleContext(ExprRecursiveContext.class,0);
		}
		public TerminalNode AND() { return getToken(OracleStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(OracleStatementParser.AND_, 0); }
		public TerminalNode XOR() { return getToken(OracleStatementParser.XOR, 0); }
		public TerminalNode OR() { return getToken(OracleStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(OracleStatementParser.OR_, 0); }
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
		int _startState = 156;
		enterRecursionRule(_localctx, 156, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1060);
				match(LP_);
				setState(1061);
				expr(0);
				setState(1062);
				match(RP_);
				}
				break;
			case 2:
				{
				setState(1064);
				match(NOT);
				setState(1065);
				expr(6);
				}
				break;
			case 3:
				{
				setState(1066);
				match(NOT_);
				setState(1067);
				expr(5);
				}
				break;
			case 4:
				{
				setState(1068);
				booleanPrimary(0);
				}
				break;
			case 5:
				{
				setState(1069);
				exprRecursive();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1089);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1087);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1072);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1073);
						match(AND);
						setState(1074);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1075);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1076);
						match(AND_);
						setState(1077);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1078);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1079);
						match(XOR);
						setState(1080);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1081);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1082);
						match(OR);
						setState(1083);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1084);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1085);
						match(OR_);
						setState(1086);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(1091);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
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
		public TerminalNode PRIOR() { return getToken(OracleStatementParser.PRIOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprRecursiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRecursive; }
	}

	public final ExprRecursiveContext exprRecursive() throws RecognitionException {
		ExprRecursiveContext _localctx = new ExprRecursiveContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_exprRecursive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			match(PRIOR);
			setState(1093);
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

	public static class BooleanPrimaryContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(OracleStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OracleStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(OracleStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(OracleStatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
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
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1096);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(1118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1098);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1099);
						match(IS);
						setState(1101);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1100);
							match(NOT);
							}
						}

						setState(1103);
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
						setState(1104);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1105);
						match(SAFE_EQ_);
						setState(1106);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1107);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1108);
						comparisonOperator();
						setState(1109);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1111);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1112);
						comparisonOperator();
						setState(1113);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1114);
						subquery();
						}
						break;
					}
					} 
				}
				setState(1120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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
		public TerminalNode EQ_() { return getToken(OracleStatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(OracleStatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(OracleStatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(OracleStatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(OracleStatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(OracleStatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			_la = _input.LA(1);
			if ( !(((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (EQ_ - 201)) | (1L << (NEQ_ - 201)) | (1L << (GT_ - 201)) | (1L << (GTE_ - 201)) | (1L << (LT_ - 201)) | (1L << (LTE_ - 201)))) != 0)) ) {
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
		public TerminalNode IN() { return getToken(OracleStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(OracleStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(OracleStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SOUNDS() { return getToken(OracleStatementParser.SOUNDS, 0); }
		public TerminalNode LIKE() { return getToken(OracleStatementParser.LIKE, 0); }
		public List<TerminalNode> ESCAPE() { return getTokens(OracleStatementParser.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(OracleStatementParser.ESCAPE, i);
		}
		public TerminalNode REGEXP() { return getToken(OracleStatementParser.REGEXP, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_predicate);
		int _la;
		try {
			int _alt;
			setState(1181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1123);
				bitExpr(0);
				setState(1125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1124);
					match(NOT);
					}
				}

				setState(1127);
				match(IN);
				setState(1128);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130);
				bitExpr(0);
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1131);
					match(NOT);
					}
				}

				setState(1134);
				match(IN);
				setState(1135);
				match(LP_);
				setState(1136);
				simpleExpr(0);
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1137);
					match(COMMA_);
					setState(1138);
					simpleExpr(0);
					}
					}
					setState(1143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1144);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1146);
				bitExpr(0);
				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1147);
					match(NOT);
					}
				}

				setState(1150);
				match(BETWEEN);
				setState(1151);
				simpleExpr(0);
				setState(1152);
				match(AND);
				setState(1153);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1155);
				bitExpr(0);
				setState(1156);
				match(SOUNDS);
				setState(1157);
				match(LIKE);
				setState(1158);
				simpleExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1160);
				bitExpr(0);
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1161);
					match(NOT);
					}
				}

				setState(1164);
				match(LIKE);
				setState(1165);
				simpleExpr(0);
				setState(1170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1166);
						match(ESCAPE);
						setState(1167);
						simpleExpr(0);
						}
						} 
					}
					setState(1172);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1173);
				bitExpr(0);
				setState(1175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1174);
					match(NOT);
					}
				}

				setState(1177);
				match(REGEXP);
				setState(1178);
				simpleExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1180);
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
		public TerminalNode VERTICAL_BAR_() { return getToken(OracleStatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(OracleStatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(OracleStatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(OracleStatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(OracleStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(OracleStatementParser.SLASH_, 0); }
		public TerminalNode MOD() { return getToken(OracleStatementParser.MOD, 0); }
		public TerminalNode MOD_() { return getToken(OracleStatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(OracleStatementParser.CARET_, 0); }
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
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1184);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1225);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1186);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1187);
						match(VERTICAL_BAR_);
						setState(1188);
						bitExpr(15);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1189);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1190);
						match(AMPERSAND_);
						setState(1191);
						bitExpr(14);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1192);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1193);
						match(SIGNED_LEFT_SHIFT_);
						setState(1194);
						bitExpr(13);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1195);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1196);
						match(SIGNED_RIGHT_SHIFT_);
						setState(1197);
						bitExpr(12);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1198);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1199);
						match(PLUS_);
						setState(1200);
						bitExpr(11);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1201);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1202);
						match(MINUS_);
						setState(1203);
						bitExpr(10);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1204);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1205);
						match(ASTERISK_);
						setState(1206);
						bitExpr(9);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1207);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1208);
						match(SLASH_);
						setState(1209);
						bitExpr(8);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1210);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1211);
						match(MOD);
						setState(1212);
						bitExpr(7);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1213);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1214);
						match(MOD_);
						setState(1215);
						bitExpr(6);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1216);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1217);
						match(CARET_);
						setState(1218);
						bitExpr(5);
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1219);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1220);
						match(PLUS_);
						setState(1221);
						intervalExpr();
						}
						break;
					case 13:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1222);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1223);
						match(MINUS_);
						setState(1224);
						intervalExpr();
						}
						break;
					}
					} 
				}
				setState(1229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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
		public TerminalNode PLUS_() { return getToken(OracleStatementParser.PLUS_, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(OracleStatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(OracleStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(OracleStatementParser.BINARY, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode ROW() { return getToken(OracleStatementParser.ROW, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(OracleStatementParser.EXISTS, 0); }
		public CaseExpressContext caseExpress() {
			return getRuleContext(CaseExpressContext.class,0);
		}
		public IntervalExprContext intervalExpr() {
			return getRuleContext(IntervalExprContext.class,0);
		}
		public PrivateExprOfDbContext privateExprOfDb() {
			return getRuleContext(PrivateExprOfDbContext.class,0);
		}
		public TerminalNode AND_() { return getToken(OracleStatementParser.AND_, 0); }
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
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_simpleExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1231);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1232);
				literal();
				}
				break;
			case 3:
				{
				setState(1233);
				columnName();
				}
				break;
			case 4:
				{
				setState(1234);
				variable();
				}
				break;
			case 5:
				{
				setState(1235);
				match(PLUS_);
				setState(1236);
				simpleExpr(12);
				}
				break;
			case 6:
				{
				setState(1237);
				match(MINUS_);
				setState(1238);
				simpleExpr(11);
				}
				break;
			case 7:
				{
				setState(1239);
				match(TILDE_);
				setState(1240);
				simpleExpr(10);
				}
				break;
			case 8:
				{
				setState(1241);
				match(NOT_);
				setState(1242);
				simpleExpr(9);
				}
				break;
			case 9:
				{
				setState(1243);
				match(BINARY);
				setState(1244);
				simpleExpr(8);
				}
				break;
			case 10:
				{
				setState(1245);
				exprList();
				}
				break;
			case 11:
				{
				setState(1246);
				match(ROW);
				setState(1247);
				exprList();
				}
				break;
			case 12:
				{
				setState(1248);
				subquery();
				}
				break;
			case 13:
				{
				setState(1249);
				match(EXISTS);
				setState(1250);
				subquery();
				}
				break;
			case 14:
				{
				setState(1251);
				caseExpress();
				}
				break;
			case 15:
				{
				setState(1252);
				intervalExpr();
				}
				break;
			case 16:
				{
				setState(1253);
				privateExprOfDb();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1261);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1256);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1257);
						match(AND_);
						setState(1258);
						simpleExpr(14);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1259);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1260);
						collateClause();
						}
						break;
					}
					} 
				}
				setState(1265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(IDENTIFIER_);
			setState(1267);
			match(LP_);
			setState(1269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1268);
				distinct();
				}
			}

			setState(1273);
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
			case CASE:
			case NEW:
			case PRIOR:
			case TREAT:
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
				setState(1271);
				exprs();
				}
				break;
			case ASTERISK_:
				{
				setState(1272);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1275);
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
		public TerminalNode DISTINCT() { return getToken(OracleStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
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
		enterRule(_localctx, 174, RULE_intervalExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
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
		enterRule(_localctx, 176, RULE_caseExpress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
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
		public TreatFunctionContext treatFunction() {
			return getRuleContext(TreatFunctionContext.class,0);
		}
		public CaseExprContext caseExpr() {
			return getRuleContext(CaseExprContext.class,0);
		}
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public ObjectAccessExpressionContext objectAccessExpression() {
			return getRuleContext(ObjectAccessExpressionContext.class,0);
		}
		public ConstructorExprContext constructorExpr() {
			return getRuleContext(ConstructorExprContext.class,0);
		}
		public PrivateExprOfDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateExprOfDb; }
	}

	public final PrivateExprOfDbContext privateExprOfDb() throws RecognitionException {
		PrivateExprOfDbContext _localctx = new PrivateExprOfDbContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_privateExprOfDb);
		try {
			setState(1288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1283);
				treatFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1284);
				caseExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1285);
				intervalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1286);
				objectAccessExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1287);
				constructorExpr();
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
		enterRule(_localctx, 180, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
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
		public TerminalNode TRUE() { return getToken(OracleStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OracleStatementParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public TerminalNode LBE_() { return getToken(OracleStatementParser.LBE_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public TerminalNode RBE_() { return getToken(OracleStatementParser.RBE_, 0); }
		public TerminalNode HEX_DIGIT_() { return getToken(OracleStatementParser.HEX_DIGIT_, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode DATE() { return getToken(OracleStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(OracleStatementParser.TIMESTAMP, 0); }
		public TerminalNode BIT_NUM_() { return getToken(OracleStatementParser.BIT_NUM_, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_literal);
		int _la;
		try {
			setState(1317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1292);
				question();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1293);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1294);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1295);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1296);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1297);
				match(LBE_);
				setState(1298);
				match(IDENTIFIER_);
				setState(1299);
				match(STRING_);
				setState(1300);
				match(RBE_);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1301);
				match(HEX_DIGIT_);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1302);
				string();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1303);
				match(IDENTIFIER_);
				setState(1304);
				match(STRING_);
				setState(1306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1305);
					collateClause();
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1308);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATE) | (1L << TIME) | (1L << TIMESTAMP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1309);
				match(STRING_);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER_) {
					{
					setState(1310);
					match(IDENTIFIER_);
					}
				}

				setState(1313);
				match(BIT_NUM_);
				setState(1315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1314);
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
		public TerminalNode QUESTION_() { return getToken(OracleStatementParser.QUESTION_, 0); }
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
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
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
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
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
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
		enterRule(_localctx, 190, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
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
		enterRule(_localctx, 192, RULE_collateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
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
		public TerminalNode ORDER() { return getToken(OracleStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			match(ORDER);
			setState(1330);
			match(BY);
			setState(1331);
			orderByItem();
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1332);
				match(COMMA_);
				setState(1333);
				orderByItem();
				}
				}
				setState(1338);
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
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1339);
				columnName();
				}
				break;
			case 2:
				{
				setState(1340);
				number();
				}
				break;
			case 3:
				{
				setState(1341);
				expr(0);
				}
				break;
			}
			setState(1345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1344);
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
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
		public AsteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asterisk; }
	}

	public final AsteriskContext asterisk() throws RecognitionException {
		AsteriskContext _localctx = new AsteriskContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_asterisk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
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

	public static class AttributeNameContext extends ParserRuleContext {
		public OracleIdContext oracleId() {
			return getRuleContext(OracleIdContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			oracleId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexTypeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public IndexTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexTypeName; }
	}

	public final IndexTypeNameContext indexTypeName() throws RecognitionException {
		IndexTypeNameContext _localctx = new IndexTypeNameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_indexTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1351);
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

	public static class SimpleExprsWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public SimpleExprsContext simpleExprs() {
			return getRuleContext(SimpleExprsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public SimpleExprsWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExprsWithParen; }
	}

	public final SimpleExprsWithParenContext simpleExprsWithParen() throws RecognitionException {
		SimpleExprsWithParenContext _localctx = new SimpleExprsWithParenContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_simpleExprsWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			match(LP_);
			setState(1354);
			simpleExprs();
			setState(1355);
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

	public static class SimpleExprsContext extends ParserRuleContext {
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public SimpleExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExprs; }
	}

	public final SimpleExprsContext simpleExprs() throws RecognitionException {
		SimpleExprsContext _localctx = new SimpleExprsContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_simpleExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			simpleExpr(0);
			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1358);
				match(COMMA_);
				setState(1359);
				simpleExpr(0);
				}
				}
				setState(1364);
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

	public static class LobItemContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public LobItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItem; }
	}

	public final LobItemContext lobItem() throws RecognitionException {
		LobItemContext _localctx = new LobItemContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_lobItem);
		try {
			setState(1367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1365);
				attributeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1366);
				columnName();
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

	public static class LobItemsContext extends ParserRuleContext {
		public List<LobItemContext> lobItem() {
			return getRuleContexts(LobItemContext.class);
		}
		public LobItemContext lobItem(int i) {
			return getRuleContext(LobItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public LobItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItems; }
	}

	public final LobItemsContext lobItems() throws RecognitionException {
		LobItemsContext _localctx = new LobItemsContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_lobItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			lobItem();
			setState(1374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1370);
				match(COMMA_);
				setState(1371);
				lobItem();
				}
				}
				setState(1376);
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

	public static class LobItemListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public LobItemsContext lobItems() {
			return getRuleContext(LobItemsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public LobItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItemList; }
	}

	public final LobItemListContext lobItemList() throws RecognitionException {
		LobItemListContext _localctx = new LobItemListContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_lobItemList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			match(LP_);
			setState(1378);
			lobItems();
			setState(1379);
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public SpecialDatatypeContext specialDatatype() {
			return getRuleContext(SpecialDatatypeContext.class,0);
		}
		public DatetimeTypeSuffixContext datetimeTypeSuffix() {
			return getRuleContext(DatetimeTypeSuffixContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_dataType);
		int _la;
		try {
			setState(1392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1381);
				dataTypeName_();
				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1382);
					dataTypeLength();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1385);
				specialDatatype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1386);
				dataTypeName_();
				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1387);
					dataTypeLength();
					}
				}

				setState(1390);
				datetimeTypeSuffix();
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

	public static class SpecialDatatypeContext extends ParserRuleContext {
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode NATIONAL() { return getToken(OracleStatementParser.NATIONAL, 0); }
		public TerminalNode VARYING() { return getToken(OracleStatementParser.VARYING, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public SpecialDatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialDatatype; }
	}

	public final SpecialDatatypeContext specialDatatype() throws RecognitionException {
		SpecialDatatypeContext _localctx = new SpecialDatatypeContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_specialDatatype);
		int _la;
		try {
			setState(1417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1394);
				dataTypeName_();
				{
				setState(1395);
				match(LP_);
				setState(1396);
				match(NUMBER_);
				setState(1397);
				match(IDENTIFIER_);
				setState(1398);
				match(RP_);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1400);
				match(NATIONAL);
				setState(1401);
				dataTypeName_();
				setState(1403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARYING) {
					{
					setState(1402);
					match(VARYING);
					}
				}

				setState(1405);
				match(LP_);
				setState(1406);
				match(NUMBER_);
				setState(1407);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1409);
				dataTypeName_();
				setState(1411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1410);
					match(LP_);
					}
				}

				setState(1413);
				columnName();
				setState(1415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1414);
					match(RP_);
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
		public List<TerminalNode> IDENTIFIER_() { return getTokens(OracleStatementParser.IDENTIFIER_); }
		public TerminalNode IDENTIFIER_(int i) {
			return getToken(OracleStatementParser.IDENTIFIER_, i);
		}
		public DataTypeName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName_; }
	}

	public final DataTypeName_Context dataTypeName_() throws RecognitionException {
		DataTypeName_Context _localctx = new DataTypeName_Context(_ctx, getState());
		enterRule(_localctx, 218, RULE_dataTypeName_);
		try {
			setState(1422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1419);
				match(IDENTIFIER_);
				setState(1420);
				match(IDENTIFIER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1421);
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

	public static class DatetimeTypeSuffixContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(OracleStatementParser.ZONE, 0); }
		public TerminalNode LOCAL() { return getToken(OracleStatementParser.LOCAL, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public TerminalNode MONTH() { return getToken(OracleStatementParser.MONTH, 0); }
		public TerminalNode SECOND() { return getToken(OracleStatementParser.SECOND, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DatetimeTypeSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimeTypeSuffix; }
	}

	public final DatetimeTypeSuffixContext datetimeTypeSuffix() throws RecognitionException {
		DatetimeTypeSuffixContext _localctx = new DatetimeTypeSuffixContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_datetimeTypeSuffix);
		int _la;
		try {
			setState(1441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1430);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1424);
					match(WITH);
					setState(1426);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LOCAL) {
						{
						setState(1425);
						match(LOCAL);
						}
					}

					setState(1428);
					match(TIME);
					setState(1429);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1432);
				match(TO);
				setState(1433);
				match(MONTH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1434);
				match(TO);
				setState(1435);
				match(SECOND);
				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1436);
					match(LP_);
					setState(1437);
					match(NUMBER_);
					setState(1438);
					match(RP_);
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

	public static class TreatFunctionContext extends ParserRuleContext {
		public TerminalNode TREAT() { return getToken(OracleStatementParser.TREAT, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode REF() { return getToken(OracleStatementParser.REF, 0); }
		public TreatFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treatFunction; }
	}

	public final TreatFunctionContext treatFunction() throws RecognitionException {
		TreatFunctionContext _localctx = new TreatFunctionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_treatFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			match(TREAT);
			setState(1444);
			match(LP_);
			setState(1445);
			expr(0);
			setState(1446);
			match(AS);
			setState(1448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(1447);
				match(REF);
				}
			}

			setState(1450);
			dataTypeName_();
			setState(1451);
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

	public static class CaseExprContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(OracleStatementParser.CASE, 0); }
		public TerminalNode END() { return getToken(OracleStatementParser.END, 0); }
		public SimpleCaseExprContext simpleCaseExpr() {
			return getRuleContext(SimpleCaseExprContext.class,0);
		}
		public SearchedCaseExprContext searchedCaseExpr() {
			return getRuleContext(SearchedCaseExprContext.class,0);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public CaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpr; }
	}

	public final CaseExprContext caseExpr() throws RecognitionException {
		CaseExprContext _localctx = new CaseExprContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_caseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			match(CASE);
			setState(1456);
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
			case CASE:
			case NEW:
			case PRIOR:
			case TREAT:
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
				setState(1454);
				simpleCaseExpr();
				}
				break;
			case WHEN:
				{
				setState(1455);
				searchedCaseExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1458);
				elseClause();
				}
			}

			setState(1461);
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

	public static class SimpleCaseExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SearchedCaseExprContext> searchedCaseExpr() {
			return getRuleContexts(SearchedCaseExprContext.class);
		}
		public SearchedCaseExprContext searchedCaseExpr(int i) {
			return getRuleContext(SearchedCaseExprContext.class,i);
		}
		public SimpleCaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCaseExpr; }
	}

	public final SimpleCaseExprContext simpleCaseExpr() throws RecognitionException {
		SimpleCaseExprContext _localctx = new SimpleCaseExprContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_simpleCaseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			expr(0);
			setState(1465); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1464);
				searchedCaseExpr();
				}
				}
				setState(1467); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchedCaseExprContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(OracleStatementParser.WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(OracleStatementParser.THEN, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public SearchedCaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchedCaseExpr; }
	}

	public final SearchedCaseExprContext searchedCaseExpr() throws RecognitionException {
		SearchedCaseExprContext _localctx = new SearchedCaseExprContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_searchedCaseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			match(WHEN);
			setState(1470);
			expr(0);
			setState(1471);
			match(THEN);
			setState(1472);
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

	public static class ElseClauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(OracleStatementParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
			match(ELSE);
			setState(1475);
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

	public static class DateTimeExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode LOCAL() { return getToken(OracleStatementParser.LOCAL, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(OracleStatementParser.ZONE, 0); }
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public TerminalNode DBTIMEZONE() { return getToken(OracleStatementParser.DBTIMEZONE, 0); }
		public DateTimeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeExpr; }
	}

	public final DateTimeExprContext dateTimeExpr() throws RecognitionException {
		DateTimeExprContext _localctx = new DateTimeExprContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_dateTimeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			expr(0);
			setState(1478);
			match(AT);
			setState(1487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOCAL:
				{
				setState(1479);
				match(LOCAL);
				}
				break;
			case TIME:
				{
				setState(1480);
				match(TIME);
				setState(1481);
				match(ZONE);
				setState(1485);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1482);
					match(STRING_);
					}
					break;
				case 2:
					{
					setState(1483);
					match(DBTIMEZONE);
					}
					break;
				case 3:
					{
					setState(1484);
					expr(0);
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

	public static class IntervalExpressionContext extends ParserRuleContext {
		public List<TerminalNode> LP_() { return getTokens(OracleStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(OracleStatementParser.LP_, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public List<TerminalNode> RP_() { return getTokens(OracleStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(OracleStatementParser.RP_, i);
		}
		public TerminalNode DAY() { return getToken(OracleStatementParser.DAY, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public TerminalNode SECOND() { return getToken(OracleStatementParser.SECOND, 0); }
		public TerminalNode YEAR() { return getToken(OracleStatementParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(OracleStatementParser.MONTH, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(OracleStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(OracleStatementParser.NUMBER_, i);
		}
		public IntervalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpression; }
	}

	public final IntervalExpressionContext intervalExpression() throws RecognitionException {
		IntervalExpressionContext _localctx = new IntervalExpressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_intervalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			match(LP_);
			setState(1490);
			expr(0);
			setState(1491);
			match(MINUS_);
			setState(1492);
			expr(0);
			setState(1493);
			match(RP_);
			setState(1515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DAY:
				{
				setState(1494);
				match(DAY);
				setState(1498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1495);
					match(LP_);
					setState(1496);
					match(NUMBER_);
					setState(1497);
					match(RP_);
					}
				}

				setState(1500);
				match(TO);
				setState(1501);
				match(SECOND);
				setState(1505);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1502);
					match(LP_);
					setState(1503);
					match(NUMBER_);
					setState(1504);
					match(RP_);
					}
					break;
				}
				}
				break;
			case YEAR:
				{
				setState(1507);
				match(YEAR);
				setState(1511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1508);
					match(LP_);
					setState(1509);
					match(NUMBER_);
					setState(1510);
					match(RP_);
					}
				}

				setState(1513);
				match(TO);
				setState(1514);
				match(MONTH);
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

	public static class ObjectAccessExpressionContext extends ParserRuleContext {
		public List<TerminalNode> DOT_() { return getTokens(OracleStatementParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(OracleStatementParser.DOT_, i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TreatFunctionContext treatFunction() {
			return getRuleContext(TreatFunctionContext.class,0);
		}
		public List<AttributeNameContext> attributeName() {
			return getRuleContexts(AttributeNameContext.class);
		}
		public AttributeNameContext attributeName(int i) {
			return getRuleContext(AttributeNameContext.class,i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ObjectAccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectAccessExpression; }
	}

	public final ObjectAccessExpressionContext objectAccessExpression() throws RecognitionException {
		ObjectAccessExpressionContext _localctx = new ObjectAccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_objectAccessExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				{
				setState(1517);
				match(LP_);
				setState(1518);
				simpleExpr(0);
				setState(1519);
				match(RP_);
				}
				break;
			case TREAT:
				{
				setState(1521);
				treatFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1524);
			match(DOT_);
			setState(1538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1525);
				attributeName();
				setState(1530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1526);
						match(DOT_);
						setState(1527);
						attributeName();
						}
						} 
					}
					setState(1532);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				}
				setState(1535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1533);
					match(DOT_);
					setState(1534);
					functionCall();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1537);
				functionCall();
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

	public static class ConstructorExprContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(OracleStatementParser.NEW, 0); }
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ConstructorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorExpr; }
	}

	public final ConstructorExprContext constructorExpr() throws RecognitionException {
		ConstructorExprContext _localctx = new ConstructorExprContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_constructorExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540);
			match(NEW);
			setState(1541);
			dataTypeName_();
			setState(1542);
			exprList();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public IgnoredIdentifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier_; }
	}

	public final IgnoredIdentifier_Context ignoredIdentifier_() throws RecognitionException {
		IgnoredIdentifier_Context _localctx = new IgnoredIdentifier_Context(_ctx, getState());
		enterRule(_localctx, 240, RULE_ignoredIdentifier_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
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
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public IgnoredIdentifiers_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifiers_; }
	}

	public final IgnoredIdentifiers_Context ignoredIdentifiers_() throws RecognitionException {
		IgnoredIdentifiers_Context _localctx = new IgnoredIdentifiers_Context(_ctx, getState());
		enterRule(_localctx, 242, RULE_ignoredIdentifiers_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			ignoredIdentifier_();
			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1547);
				match(COMMA_);
				setState(1548);
				ignoredIdentifier_();
				}
				}
				setState(1553);
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
		enterRule(_localctx, 244, RULE_matchNone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
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
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(OracleStatementParser.TRANSACTION, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_setTransaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			match(SET);
			setState(1557);
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

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
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
		public TerminalNode ROLLBACK() { return getToken(OracleStatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
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
		public TerminalNode SAVEPOINT() { return getToken(OracleStatementParser.SAVEPOINT, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_savepoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
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
		public TerminalNode GRANT() { return getToken(OracleStatementParser.GRANT, 0); }
		public ObjectPrivileges_Context objectPrivileges_() {
			return getRuleContext(ObjectPrivileges_Context.class,0);
		}
		public OtherPrivileges_Context otherPrivileges_() {
			return getRuleContext(OtherPrivileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public OnObjectClause_Context onObjectClause_() {
			return getRuleContext(OnObjectClause_Context.class,0);
		}
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_grant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			match(GRANT);
			setState(1572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
			case ALTER:
			case DELETE:
			case INDEX:
			case ON:
			case READ:
			case REFERENCES:
			case SELECT:
			case INSERT:
			case UPDATE:
			case WRITE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case QUERY:
			case KEEP:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
				{
				setState(1566);
				objectPrivileges_();
				setState(1569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1567);
					match(ON);
					setState(1568);
					onObjectClause_();
					}
				}

				}
				break;
			case IDENTIFIER_:
			case STRING_:
				{
				setState(1571);
				otherPrivileges_();
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
		public TerminalNode REVOKE() { return getToken(OracleStatementParser.REVOKE, 0); }
		public ObjectPrivileges_Context objectPrivileges_() {
			return getRuleContext(ObjectPrivileges_Context.class,0);
		}
		public OtherPrivileges_Context otherPrivileges_() {
			return getRuleContext(OtherPrivileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public OnObjectClause_Context onObjectClause_() {
			return getRuleContext(OnObjectClause_Context.class,0);
		}
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_revoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			match(REVOKE);
			setState(1581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
			case ALTER:
			case DELETE:
			case INDEX:
			case ON:
			case READ:
			case REFERENCES:
			case SELECT:
			case INSERT:
			case UPDATE:
			case WRITE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case QUERY:
			case KEEP:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
				{
				setState(1575);
				objectPrivileges_();
				setState(1578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1576);
					match(ON);
					setState(1577);
					onObjectClause_();
					}
				}

				}
				break;
			case IDENTIFIER_:
			case STRING_:
				{
				setState(1580);
				otherPrivileges_();
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

	public static class ObjectPrivileges_Context extends ParserRuleContext {
		public List<ObjectPrivilegeType_Context> objectPrivilegeType_() {
			return getRuleContexts(ObjectPrivilegeType_Context.class);
		}
		public ObjectPrivilegeType_Context objectPrivilegeType_(int i) {
			return getRuleContext(ObjectPrivilegeType_Context.class,i);
		}
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ObjectPrivileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPrivileges_; }
	}

	public final ObjectPrivileges_Context objectPrivileges_() throws RecognitionException {
		ObjectPrivileges_Context _localctx = new ObjectPrivileges_Context(_ctx, getState());
		enterRule(_localctx, 258, RULE_objectPrivileges_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			objectPrivilegeType_();
			setState(1585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1584);
				columnNames();
				}
			}

			setState(1594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1587);
				match(COMMA_);
				setState(1588);
				objectPrivilegeType_();
				setState(1590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1589);
					columnNames();
					}
				}

				}
				}
				setState(1596);
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

	public static class ObjectPrivilegeType_Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(OracleStatementParser.PRIVILEGES, 0); }
		public TerminalNode SELECT() { return getToken(OracleStatementParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(OracleStatementParser.INSERT, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(OracleStatementParser.UPDATE, 0); }
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode READ() { return getToken(OracleStatementParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(OracleStatementParser.WRITE, 0); }
		public TerminalNode EXECUTE() { return getToken(OracleStatementParser.EXECUTE, 0); }
		public TerminalNode USE() { return getToken(OracleStatementParser.USE, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public TerminalNode REFERENCES() { return getToken(OracleStatementParser.REFERENCES, 0); }
		public TerminalNode DEBUG() { return getToken(OracleStatementParser.DEBUG, 0); }
		public TerminalNode UNDER() { return getToken(OracleStatementParser.UNDER, 0); }
		public TerminalNode FLASHBACK() { return getToken(OracleStatementParser.FLASHBACK, 0); }
		public TerminalNode ARCHIVE() { return getToken(OracleStatementParser.ARCHIVE, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode REFRESH() { return getToken(OracleStatementParser.REFRESH, 0); }
		public TerminalNode QUERY() { return getToken(OracleStatementParser.QUERY, 0); }
		public TerminalNode REWRITE() { return getToken(OracleStatementParser.REWRITE, 0); }
		public TerminalNode KEEP() { return getToken(OracleStatementParser.KEEP, 0); }
		public TerminalNode SEQUENCE() { return getToken(OracleStatementParser.SEQUENCE, 0); }
		public TerminalNode INHERIT() { return getToken(OracleStatementParser.INHERIT, 0); }
		public TerminalNode TRANSLATE() { return getToken(OracleStatementParser.TRANSLATE, 0); }
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode MERGE() { return getToken(OracleStatementParser.MERGE, 0); }
		public TerminalNode VIEW() { return getToken(OracleStatementParser.VIEW, 0); }
		public ObjectPrivilegeType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPrivilegeType_; }
	}

	public final ObjectPrivilegeType_Context objectPrivilegeType_() throws RecognitionException {
		ObjectPrivilegeType_Context _localctx = new ObjectPrivilegeType_Context(_ctx, getState());
		enterRule(_localctx, 260, RULE_objectPrivilegeType_);
		int _la;
		try {
			setState(1629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1597);
				match(ALL);
				setState(1599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(1598);
					match(PRIVILEGES);
					}
				}

				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1601);
				match(SELECT);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1602);
				match(INSERT);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1603);
				match(DELETE);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1604);
				match(UPDATE);
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(1605);
				match(ALTER);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 7);
				{
				setState(1606);
				match(READ);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1607);
				match(WRITE);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1608);
				match(EXECUTE);
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1609);
				match(USE);
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 11);
				{
				setState(1610);
				match(INDEX);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 12);
				{
				setState(1611);
				match(REFERENCES);
				}
				break;
			case DEBUG:
				enterOuterAlt(_localctx, 13);
				{
				setState(1612);
				match(DEBUG);
				}
				break;
			case UNDER:
				enterOuterAlt(_localctx, 14);
				{
				setState(1613);
				match(UNDER);
				}
				break;
			case FLASHBACK:
				enterOuterAlt(_localctx, 15);
				{
				setState(1614);
				match(FLASHBACK);
				setState(1615);
				match(ARCHIVE);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 16);
				{
				setState(1616);
				match(ON);
				setState(1617);
				match(COMMIT);
				setState(1618);
				match(REFRESH);
				}
				break;
			case QUERY:
				enterOuterAlt(_localctx, 17);
				{
				setState(1619);
				match(QUERY);
				setState(1620);
				match(REWRITE);
				}
				break;
			case KEEP:
				enterOuterAlt(_localctx, 18);
				{
				setState(1621);
				match(KEEP);
				setState(1622);
				match(SEQUENCE);
				}
				break;
			case INHERIT:
				enterOuterAlt(_localctx, 19);
				{
				setState(1623);
				match(INHERIT);
				setState(1624);
				match(PRIVILEGES);
				}
				break;
			case TRANSLATE:
				enterOuterAlt(_localctx, 20);
				{
				setState(1625);
				match(TRANSLATE);
				setState(1626);
				match(SQL);
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 21);
				{
				setState(1627);
				match(MERGE);
				setState(1628);
				match(VIEW);
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
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public TerminalNode DIRECTORY() { return getToken(OracleStatementParser.DIRECTORY, 0); }
		public TerminalNode EDITION() { return getToken(OracleStatementParser.EDITION, 0); }
		public TerminalNode MINING() { return getToken(OracleStatementParser.MINING, 0); }
		public TerminalNode MODEL() { return getToken(OracleStatementParser.MODEL, 0); }
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode TRANSLATION() { return getToken(OracleStatementParser.TRANSLATION, 0); }
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public TerminalNode JAVA() { return getToken(OracleStatementParser.JAVA, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SOURCE() { return getToken(OracleStatementParser.SOURCE, 0); }
		public TerminalNode RESOURCE() { return getToken(OracleStatementParser.RESOURCE, 0); }
		public OnObjectClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onObjectClause_; }
	}

	public final OnObjectClause_Context onObjectClause_() throws RecognitionException {
		OnObjectClause_Context _localctx = new OnObjectClause_Context(_ctx, getState());
		enterRule(_localctx, 262, RULE_onObjectClause_);
		int _la;
		try {
			setState(1643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1631);
				match(USER);
				}
				break;
			case DIRECTORY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1632);
				match(DIRECTORY);
				}
				break;
			case EDITION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1633);
				match(EDITION);
				}
				break;
			case MINING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1634);
				match(MINING);
				setState(1635);
				match(MODEL);
				}
				break;
			case SQL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1636);
				match(SQL);
				setState(1637);
				match(TRANSLATION);
				setState(1638);
				match(PROFILE);
				}
				break;
			case JAVA:
				enterOuterAlt(_localctx, 6);
				{
				setState(1639);
				match(JAVA);
				setState(1640);
				_la = _input.LA(1);
				if ( !(_la==RESOURCE || _la==SOURCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1641);
				tableName();
				}
				break;
			case IDENTIFIER_:
			case STRING_:
				enterOuterAlt(_localctx, 7);
				{
				setState(1642);
				tableName();
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

	public static class OtherPrivileges_Context extends ParserRuleContext {
		public List<TerminalNode> STRING_() { return getTokens(OracleStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(OracleStatementParser.STRING_, i);
		}
		public List<TerminalNode> IDENTIFIER_() { return getTokens(OracleStatementParser.IDENTIFIER_); }
		public TerminalNode IDENTIFIER_(int i) {
			return getToken(OracleStatementParser.IDENTIFIER_, i);
		}
		public OtherPrivileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherPrivileges_; }
	}

	public final OtherPrivileges_Context otherPrivileges_() throws RecognitionException {
		OtherPrivileges_Context _localctx = new OtherPrivileges_Context(_ctx, getState());
		enterRule(_localctx, 264, RULE_otherPrivileges_);
		int _la;
		try {
			setState(1655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1646); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1645);
					match(STRING_);
					}
					}
					setState(1648); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING_ );
				}
				break;
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1651); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1650);
					match(IDENTIFIER_);
					}
					}
					setState(1653); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER_ );
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
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			match(CREATE);
			setState(1658);
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
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_dropUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
			match(DROP);
			setState(1661);
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
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			match(ALTER);
			setState(1664);
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
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			match(CREATE);
			setState(1667);
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
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			match(DROP);
			setState(1670);
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
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public AlterRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRole; }
	}

	public final AlterRoleContext alterRole() throws RecognitionException {
		AlterRoleContext _localctx = new AlterRoleContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_alterRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			match(ALTER);
			setState(1673);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 78:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 80:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 83:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 84:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00e4\u068e\4\2\t"+
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
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u012c\n\2\3"+
		"\2\5\2\u012f\n\2\3\3\3\3\3\3\5\3\u0134\n\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4\u0141\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0158\n\n\3\n\3\n\3\n"+
		"\3\n\5\n\u015e\n\n\3\n\3\n\3\13\3\13\3\13\7\13\u0165\n\13\f\13\16\13\u0168"+
		"\13\13\3\f\3\f\3\f\3\f\5\f\u016e\n\f\3\r\5\r\u0171\n\r\3\r\3\r\5\r\u0175"+
		"\n\r\3\16\3\16\3\17\3\17\3\17\5\17\u017c\n\17\3\20\3\20\3\20\3\20\3\21"+
		"\6\21\u0183\n\21\r\21\16\21\u0184\3\21\5\21\u0188\n\21\3\22\3\22\3\22"+
		"\5\22\u018d\n\22\3\23\3\23\3\23\5\23\u0192\n\23\3\24\3\24\3\24\3\24\7"+
		"\24\u0198\n\24\f\24\16\24\u019b\13\24\3\24\3\24\3\24\5\24\u01a0\n\24\3"+
		"\25\3\25\5\25\u01a4\n\25\3\26\3\26\5\26\u01a8\n\26\3\26\3\26\3\26\7\26"+
		"\u01ad\n\26\f\26\16\26\u01b0\13\26\3\26\5\26\u01b3\n\26\3\26\5\26\u01b6"+
		"\n\26\3\27\3\27\5\27\u01ba\n\27\3\27\3\27\5\27\u01be\n\27\3\27\3\27\3"+
		"\27\5\27\u01c3\n\27\3\27\7\27\u01c6\n\27\f\27\16\27\u01c9\13\27\3\30\3"+
		"\30\3\30\5\30\u01ce\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u01d5\n\30\3\31"+
		"\3\31\3\31\3\31\7\31\u01db\n\31\f\31\16\31\u01de\13\31\3\31\5\31\u01e1"+
		"\n\31\3\32\3\32\3\32\7\32\u01e6\n\32\f\32\16\32\u01e9\13\32\3\32\5\32"+
		"\u01ec\n\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u01f4\n\33\f\33\16\33\u01f7"+
		"\13\33\3\33\3\33\5\33\u01fb\n\33\3\34\3\34\3\34\5\34\u0200\n\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\6\37\u020f"+
		"\n\37\r\37\16\37\u0210\5\37\u0213\n\37\3 \3 \6 \u0217\n \r \16 \u0218"+
		"\3 \5 \u021c\n \3!\3!\3!\6!\u0221\n!\r!\16!\u0222\3!\5!\u0226\n!\3\"\3"+
		"\"\3\"\3#\3#\5#\u022d\n#\3$\3$\3$\5$\u0232\n$\3%\3%\3%\3%\3%\3&\3&\3&"+
		"\5&\u023c\n&\3&\3&\5&\u0240\n&\3&\3&\3&\5&\u0245\n&\5&\u0247\n&\3\'\3"+
		"\'\3\'\6\'\u024c\n\'\r\'\16\'\u024d\3(\3(\3(\5(\u0253\n(\3(\3(\3(\5(\u0258"+
		"\n(\3(\3(\5(\u025c\n(\3(\3(\5(\u0260\n(\3(\6(\u0263\n(\r(\16(\u0264\3"+
		"(\5(\u0268\n(\3)\3)\3)\3)\3)\3)\5)\u0270\n)\5)\u0272\n)\3)\3)\3)\5)\u0277"+
		"\n)\3)\6)\u027a\n)\r)\16)\u027b\5)\u027e\n)\3)\5)\u0281\n)\3*\3*\3*\3"+
		"*\3*\5*\u0288\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u029a"+
		"\n*\3+\3+\5+\u029e\n+\3+\3+\5+\u02a2\n+\3+\3+\3+\3+\3+\5+\u02a9\n+\3+"+
		"\7+\u02ac\n+\f+\16+\u02af\13+\3,\3,\5,\u02b3\n,\3,\5,\u02b6\n,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\5,\u02c1\n,\3,\7,\u02c4\n,\f,\16,\u02c7\13,\3-\3-"+
		"\3-\5-\u02cc\n-\3-\3-\3-\3-\3-\5-\u02d3\n-\5-\u02d5\n-\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\5.\u02e1\n.\3/\5/\u02e4\n/\3/\3/\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u02f5\n\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u02fe\n\63\3\63\3\63\7\63\u0302\n\63\f"+
		"\63\16\63\u0305\13\63\5\63\u0307\n\63\3\64\3\64\5\64\u030b\n\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5"+
		"\64\u031c\n\64\3\64\7\64\u031f\n\64\f\64\16\64\u0322\13\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\5\65\u0335\n\65\3\65\3\65\3\65\3\65\3\65\7\65\u033c\n\65\f\65\16\65"+
		"\u033f\13\65\5\65\u0341\n\65\3\66\3\66\5\66\u0345\n\66\3\66\3\66\3\66"+
		"\5\66\u034a\n\66\3\66\5\66\u034d\n\66\3\66\5\66\u0350\n\66\3\66\5\66\u0353"+
		"\n\66\3\67\3\67\3\67\7\67\u0358\n\67\f\67\16\67\u035b\13\67\38\38\58\u035f"+
		"\n8\38\38\58\u0363\n8\38\78\u0366\n8\f8\168\u0369\138\38\58\u036c\n8\5"+
		"8\u036e\n8\38\38\58\u0372\n8\39\69\u0375\n9\r9\169\u0376\3:\3:\3;\3;\3"+
		";\3;\3<\5<\u0380\n<\3<\3<\3<\5<\u0385\n<\3<\3<\5<\u0389\n<\3<\3<\3<\3"+
		"<\5<\u038f\n<\3<\3<\3<\3<\5<\u0395\n<\3=\3=\5=\u0399\n=\3=\3=\3=\3=\3"+
		"=\5=\u03a0\n=\3>\3>\5>\u03a4\n>\3>\3>\3>\3>\7>\u03aa\n>\f>\16>\u03ad\13"+
		">\3>\3>\3?\3?\5?\u03b3\n?\3?\5?\u03b6\n?\3@\3@\3@\3@\3@\7@\u03bd\n@\f"+
		"@\16@\u03c0\13@\3@\3@\3@\3@\5@\u03c6\n@\3@\3@\3@\5@\u03cb\n@\7@\u03cd"+
		"\n@\f@\16@\u03d0\13@\3@\3@\3@\3A\3A\5A\u03d7\nA\3A\3A\5A\u03db\nA\3B\3"+
		"B\3B\3B\3C\3C\3C\3C\3C\3C\5C\u03e7\nC\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3"+
		"H\7H\u03f4\nH\fH\16H\u03f7\13H\3H\5H\u03fa\nH\3I\3I\3J\3J\3K\3K\3K\3K"+
		"\5K\u0404\nK\5K\u0406\nK\3K\3K\3L\5L\u040b\nL\3L\3L\3M\3M\3M\3M\7M\u0413"+
		"\nM\fM\16M\u0416\13M\3M\3M\3N\3N\3N\7N\u041d\nN\fN\16N\u0420\13N\3O\3"+
		"O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0431\nP\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\3P\3P\3P\7P\u0442\nP\fP\16P\u0445\13P\3Q\3Q\3Q\3R"+
		"\3R\3R\3R\3R\3R\5R\u0450\nR\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\7R"+
		"\u045f\nR\fR\16R\u0462\13R\3S\3S\3T\3T\5T\u0468\nT\3T\3T\3T\3T\3T\5T\u046f"+
		"\nT\3T\3T\3T\3T\3T\7T\u0476\nT\fT\16T\u0479\13T\3T\3T\3T\3T\5T\u047f\n"+
		"T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u048d\nT\3T\3T\3T\3T\7T\u0493"+
		"\nT\fT\16T\u0496\13T\3T\3T\5T\u049a\nT\3T\3T\3T\3T\5T\u04a0\nT\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\7U\u04cc\nU\fU\16U\u04cf"+
		"\13U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3"+
		"V\3V\3V\5V\u04e9\nV\3V\3V\3V\3V\3V\7V\u04f0\nV\fV\16V\u04f3\13V\3W\3W"+
		"\3W\5W\u04f8\nW\3W\3W\5W\u04fc\nW\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3[\3["+
		"\3[\5[\u050b\n[\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u051d"+
		"\n]\3]\3]\3]\5]\u0522\n]\3]\3]\5]\u0526\n]\5]\u0528\n]\3^\3^\3_\3_\3`"+
		"\3`\3a\3a\3b\3b\3c\3c\3c\3c\3c\7c\u0539\nc\fc\16c\u053c\13c\3d\3d\3d\5"+
		"d\u0541\nd\3d\5d\u0544\nd\3e\3e\3f\3f\3g\3g\3h\3h\3h\3h\3i\3i\3i\7i\u0553"+
		"\ni\fi\16i\u0556\13i\3j\3j\5j\u055a\nj\3k\3k\3k\7k\u055f\nk\fk\16k\u0562"+
		"\13k\3l\3l\3l\3l\3m\3m\5m\u056a\nm\3m\3m\3m\5m\u056f\nm\3m\3m\5m\u0573"+
		"\nm\3n\3n\3n\3n\3n\3n\3n\3n\3n\5n\u057e\nn\3n\3n\3n\3n\3n\3n\5n\u0586"+
		"\nn\3n\3n\5n\u058a\nn\5n\u058c\nn\3o\3o\3o\5o\u0591\no\3p\3p\5p\u0595"+
		"\np\3p\3p\5p\u0599\np\3p\3p\3p\3p\3p\3p\3p\5p\u05a2\np\5p\u05a4\np\3q"+
		"\3q\3q\3q\3q\5q\u05ab\nq\3q\3q\3q\3r\3r\3r\5r\u05b3\nr\3r\5r\u05b6\nr"+
		"\3r\3r\3s\3s\6s\u05bc\ns\rs\16s\u05bd\3t\3t\3t\3t\3t\3u\3u\3u\3v\3v\3"+
		"v\3v\3v\3v\3v\3v\5v\u05d0\nv\5v\u05d2\nv\3w\3w\3w\3w\3w\3w\3w\3w\3w\5"+
		"w\u05dd\nw\3w\3w\3w\3w\3w\5w\u05e4\nw\3w\3w\3w\3w\5w\u05ea\nw\3w\3w\5"+
		"w\u05ee\nw\3x\3x\3x\3x\3x\5x\u05f5\nx\3x\3x\3x\3x\7x\u05fb\nx\fx\16x\u05fe"+
		"\13x\3x\3x\5x\u0602\nx\3x\5x\u0605\nx\3y\3y\3y\3y\3z\3z\3{\3{\3{\7{\u0610"+
		"\n{\f{\16{\u0613\13{\3|\3|\3}\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0624\n\u0081\3\u0081\5\u0081"+
		"\u0627\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u062d\n\u0082\3"+
		"\u0082\5\u0082\u0630\n\u0082\3\u0083\3\u0083\5\u0083\u0634\n\u0083\3\u0083"+
		"\3\u0083\3\u0083\5\u0083\u0639\n\u0083\7\u0083\u063b\n\u0083\f\u0083\16"+
		"\u0083\u063e\13\u0083\3\u0084\3\u0084\5\u0084\u0642\n\u0084\3\u0084\3"+
		"\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\5\u0084\u0660\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u066e\n\u0085"+
		"\3\u0086\6\u0086\u0671\n\u0086\r\u0086\16\u0086\u0672\3\u0086\6\u0086"+
		"\u0676\n\u0086\r\u0086\16\u0086\u0677\5\u0086\u067a\n\u0086\3\u0087\3"+
		"\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u008a"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\2\6\u009e\u00a2\u00a8\u00aa\u008d\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\2\r\4\288\u0097\u0097\4\2::``\4\2rr~~\4\2PPhh\4\2\b\b\r\r"+
		"\3\2\u00df\u00e0\6\2\21\21\34\34&&((\4\2\5\5\7\7\3\2\u00cb\u00d0\4\2\f"+
		"\f$%\4\2\u009f\u009f\u00a6\u00a6\2\u074e\2\u012b\3\2\2\2\4\u0130\3\2\2"+
		"\2\6\u0139\3\2\2\2\b\u0142\3\2\2\2\n\u0146\3\2\2\2\f\u014a\3\2\2\2\16"+
		"\u014e\3\2\2\2\20\u0151\3\2\2\2\22\u0157\3\2\2\2\24\u0161\3\2\2\2\26\u016d"+
		"\3\2\2\2\30\u0170\3\2\2\2\32\u0176\3\2\2\2\34\u017b\3\2\2\2\36\u017d\3"+
		"\2\2\2 \u0187\3\2\2\2\"\u018c\3\2\2\2$\u018e\3\2\2\2&\u019f\3\2\2\2(\u01a3"+
		"\3\2\2\2*\u01a5\3\2\2\2,\u01b7\3\2\2\2.\u01ca\3\2\2\2\60\u01e0\3\2\2\2"+
		"\62\u01e2\3\2\2\2\64\u01fa\3\2\2\2\66\u01ff\3\2\2\28\u0201\3\2\2\2:\u0204"+
		"\3\2\2\2<\u0212\3\2\2\2>\u0214\3\2\2\2@\u021d\3\2\2\2B\u0227\3\2\2\2D"+
		"\u022c\3\2\2\2F\u0231\3\2\2\2H\u0233\3\2\2\2J\u0238\3\2\2\2L\u024b\3\2"+
		"\2\2N\u024f\3\2\2\2P\u0269\3\2\2\2R\u0299\3\2\2\2T\u029b\3\2\2\2V\u02b2"+
		"\3\2\2\2X\u02c8\3\2\2\2Z\u02e0\3\2\2\2\\\u02e3\3\2\2\2^\u02e7\3\2\2\2"+
		"`\u02ea\3\2\2\2b\u02ed\3\2\2\2d\u0306\3\2\2\2f\u030a\3\2\2\2h\u0340\3"+
		"\2\2\2j\u0344\3\2\2\2l\u0354\3\2\2\2n\u0371\3\2\2\2p\u0374\3\2\2\2r\u0378"+
		"\3\2\2\2t\u037a\3\2\2\2v\u0394\3\2\2\2x\u0396\3\2\2\2z\u03a1\3\2\2\2|"+
		"\u03b2\3\2\2\2~\u03b7\3\2\2\2\u0080\u03d4\3\2\2\2\u0082\u03dc\3\2\2\2"+
		"\u0084\u03e0\3\2\2\2\u0086\u03e8\3\2\2\2\u0088\u03ea\3\2\2\2\u008a\u03ec"+
		"\3\2\2\2\u008c\u03ee\3\2\2\2\u008e\u03f9\3\2\2\2\u0090\u03fb\3\2\2\2\u0092"+
		"\u03fd\3\2\2\2\u0094\u03ff\3\2\2\2\u0096\u040a\3\2\2\2\u0098\u040e\3\2"+
		"\2\2\u009a\u0419\3\2\2\2\u009c\u0421\3\2\2\2\u009e\u0430\3\2\2\2\u00a0"+
		"\u0446\3\2\2\2\u00a2\u0449\3\2\2\2\u00a4\u0463\3\2\2\2\u00a6\u049f\3\2"+
		"\2\2\u00a8\u04a1\3\2\2\2\u00aa\u04e8\3\2\2\2\u00ac\u04f4\3\2\2\2\u00ae"+
		"\u04ff\3\2\2\2\u00b0\u0501\3\2\2\2\u00b2\u0503\3\2\2\2\u00b4\u050a\3\2"+
		"\2\2\u00b6\u050c\3\2\2\2\u00b8\u0527\3\2\2\2\u00ba\u0529\3\2\2\2\u00bc"+
		"\u052b\3\2\2\2\u00be\u052d\3\2\2\2\u00c0\u052f\3\2\2\2\u00c2\u0531\3\2"+
		"\2\2\u00c4\u0533\3\2\2\2\u00c6\u0540\3\2\2\2\u00c8\u0545\3\2\2\2\u00ca"+
		"\u0547\3\2\2\2\u00cc\u0549\3\2\2\2\u00ce\u054b\3\2\2\2\u00d0\u054f\3\2"+
		"\2\2\u00d2\u0559\3\2\2\2\u00d4\u055b\3\2\2\2\u00d6\u0563\3\2\2\2\u00d8"+
		"\u0572\3\2\2\2\u00da\u058b\3\2\2\2\u00dc\u0590\3\2\2\2\u00de\u05a3\3\2"+
		"\2\2\u00e0\u05a5\3\2\2\2\u00e2\u05af\3\2\2\2\u00e4\u05b9\3\2\2\2\u00e6"+
		"\u05bf\3\2\2\2\u00e8\u05c4\3\2\2\2\u00ea\u05c7\3\2\2\2\u00ec\u05d3\3\2"+
		"\2\2\u00ee\u05f4\3\2\2\2\u00f0\u0606\3\2\2\2\u00f2\u060a\3\2\2\2\u00f4"+
		"\u060c\3\2\2\2\u00f6\u0614\3\2\2\2\u00f8\u0616\3\2\2\2\u00fa\u0619\3\2"+
		"\2\2\u00fc\u061b\3\2\2\2\u00fe\u061d\3\2\2\2\u0100\u061f\3\2\2\2\u0102"+
		"\u0628\3\2\2\2\u0104\u0631\3\2\2\2\u0106\u065f\3\2\2\2\u0108\u066d\3\2"+
		"\2\2\u010a\u0679\3\2\2\2\u010c\u067b\3\2\2\2\u010e\u067e\3\2\2\2\u0110"+
		"\u0681\3\2\2\2\u0112\u0684\3\2\2\2\u0114\u0687\3\2\2\2\u0116\u068a\3\2"+
		"\2\2\u0118\u012c\5\4\3\2\u0119\u012c\5\6\4\2\u011a\u012c\5\b\5\2\u011b"+
		"\u012c\5\n\6\2\u011c\u012c\5x=\2\u011d\u012c\5\u0082B\2\u011e\u012c\5"+
		"\u0084C\2\u011f\u012c\5\u00fa~\2\u0120\u012c\5\u00fc\177\2\u0121\u012c"+
		"\5\u00f8}\2\u0122\u012c\5\u00fe\u0080\2\u0123\u012c\5\u0100\u0081\2\u0124"+
		"\u012c\5\u0102\u0082\2\u0125\u012c\5\u010c\u0087\2\u0126\u012c\5\u010e"+
		"\u0088\2\u0127\u012c\5\u0110\u0089\2\u0128\u012c\5\u0112\u008a\2\u0129"+
		"\u012c\5\u0114\u008b\2\u012a\u012c\5\u0116\u008c\2\u012b\u0118\3\2\2\2"+
		"\u012b\u0119\3\2\2\2\u012b\u011a\3\2\2\2\u012b\u011b\3\2\2\2\u012b\u011c"+
		"\3\2\2\2\u012b\u011d\3\2\2\2\u012b\u011e\3\2\2\2\u012b\u011f\3\2\2\2\u012b"+
		"\u0120\3\2\2\2\u012b\u0121\3\2\2\2\u012b\u0122\3\2\2\2\u012b\u0123\3\2"+
		"\2\2\u012b\u0124\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u0126\3\2\2\2\u012b"+
		"\u0127\3\2\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2"+
		"\2\2\u012c\u012e\3\2\2\2\u012d\u012f\7\u00de\2\2\u012e\u012d\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\3\3\2\2\2\u0130\u0133\7\65\2\2\u0131\u0132\7{\2\2"+
		"\u0132\u0134\7\u00a9\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\7L\2\2\u0136\u0137\5\u0088E\2\u0137\u0138\5"+
		"\22\n\2\u0138\5\3\2\2\2\u0139\u013a\7-\2\2\u013a\u013b\7L\2\2\u013b\u0140"+
		"\5\u0088E\2\u013c\u0141\5\34\17\2\u013d\u0141\5 \21\2\u013e\u0141\5<\37"+
		"\2\u013f\u0141\5L\'\2\u0140\u013c\3\2\2\2\u0140\u013d\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\7\3\2\2\2\u0142"+
		"\u0143\7:\2\2\u0143\u0144\7L\2\2\u0144\u0145\5\u0088E\2\u0145\t\3\2\2"+
		"\2\u0146\u0147\7O\2\2\u0147\u0148\7L\2\2\u0148\u0149\5\u0088E\2\u0149"+
		"\13\3\2\2\2\u014a\u014b\7\u00d2\2\2\u014b\u014c\5\16\b\2\u014c\u014d\7"+
		"\u00d3\2\2\u014d\r\3\2\2\2\u014e\u014f\7\u00a8\2\2\u014f\u0150\5\u00f2"+
		"z\2\u0150\17\3\2\2\2\u0151\u0152\5\u00ccg\2\u0152\21\3\2\2\2\u0153\u0154"+
		"\7\u00d2\2\2\u0154\u0155\5\24\13\2\u0155\u0156\7\u00d3\2\2\u0156\u0158"+
		"\3\2\2\2\u0157\u0153\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015d\3\2\2\2\u0159"+
		"\u015a\7C\2\2\u015a\u015b\7\63\2\2\u015b\u015c\t\2\2\2\u015c\u015e\7J"+
		"\2\2\u015d\u0159\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0160\5\30\r\2\u0160\23\3\2\2\2\u0161\u0166\5\26\f\2\u0162\u0163\7\u00d8"+
		"\2\2\u0163\u0165\5\26\f\2\u0164\u0162\3\2\2\2\u0165\u0168\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\25\3\2\2\2\u0168\u0166\3\2\2"+
		"\2\u0169\u016e\5N(\2\u016a\u016e\5T+\2\u016b\u016e\5f\64\2\u016c\u016e"+
		"\5h\65\2\u016d\u0169\3\2\2\2\u016d\u016a\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016c\3\2\2\2\u016e\27\3\2\2\2\u016f\u0171\5p9\2\u0170\u016f\3\2\2\2"+
		"\u0170\u0171\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0173\7/\2\2\u0173\u0175"+
		"\5\32\16\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\31\3\2\2\2\u0176"+
		"\u0177\5\u00f6|\2\u0177\33\3\2\2\2\u0178\u017c\5\36\20\2\u0179\u017a\7"+
		"\u009b\2\2\u017a\u017c\5j\66\2\u017b\u0178\3\2\2\2\u017b\u0179\3\2\2\2"+
		"\u017c\35\3\2\2\2\u017d\u017e\7\u009d\2\2\u017e\u017f\7M\2\2\u017f\u0180"+
		"\5\u0088E\2\u0180\37\3\2\2\2\u0181\u0183\5\"\22\2\u0182\u0181\3\2\2\2"+
		"\u0183\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0188"+
		"\3\2\2\2\u0186\u0188\5:\36\2\u0187\u0182\3\2\2\2\u0187\u0186\3\2\2\2\u0188"+
		"!\3\2\2\2\u0189\u018d\5$\23\2\u018a\u018d\5*\26\2\u018b\u018d\5\60\31"+
		"\2\u018c\u0189\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018d#"+
		"\3\2\2\2\u018e\u018f\7,\2\2\u018f\u0191\5&\24\2\u0190\u0192\5p9\2\u0191"+
		"\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192%\3\2\2\2\u0193\u0194\7\u00d2"+
		"\2\2\u0194\u0199\5(\25\2\u0195\u0196\7\u00d8\2\2\u0196\u0198\5(\25\2\u0197"+
		"\u0195\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7\u00d3\2\2\u019d"+
		"\u01a0\3\2\2\2\u019e\u01a0\5(\25\2\u019f\u0193\3\2\2\2\u019f\u019e\3\2"+
		"\2\2\u01a0\'\3\2\2\2\u01a1\u01a4\5N(\2\u01a2\u01a4\5T+\2\u01a3\u01a1\3"+
		"\2\2\2\u01a3\u01a2\3\2\2\2\u01a4)\3\2\2\2\u01a5\u01b5\7\u008a\2\2\u01a6"+
		"\u01a8\7\u00d2\2\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9\u01ae\5,\27\2\u01aa\u01ab\7\u00d8\2\2\u01ab\u01ad\5,\27"+
		"\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af"+
		"\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b3\7\u00d3\2"+
		"\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b6"+
		"\5.\30\2\u01b5\u01a7\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6+\3\2\2\2\u01b7"+
		"\u01b9\5\u008aF\2\u01b8\u01ba\5\u00d8m\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba"+
		"\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01bc\7\67\2\2\u01bc\u01be\5\u009e"+
		"P\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c2\3\2\2\2\u01bf"+
		"\u01c0\7w\2\2\u01c0\u01c3\5j\66\2\u01c1\u01c3\7p\2\2\u01c2\u01bf\3\2\2"+
		"\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c7\3\2\2\2\u01c4\u01c6"+
		"\5V,\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8-\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\7\62\2\2"+
		"\u01cb\u01cd\5\u008aF\2\u01cc\u01ce\7\33\2\2\u01cd\u01cc\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\7\u00a7\2\2\u01d0\u01d1"+
		"\7g\2\2\u01d1\u01d2\7\5\2\2\u01d2\u01d4\7\u0084\2\2\u01d3\u01d5\7z\2\2"+
		"\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5/\3\2\2\2\u01d6\u01d7\7"+
		"\"\2\2\u01d7\u01d8\7\u00ae\2\2\u01d8\u01dc\5\64\33\2\u01d9\u01db\5\66"+
		"\34\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01e1\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e1\5\62"+
		"\32\2\u01e0\u01d6\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1\61\3\2\2\2\u01e2\u01e3"+
		"\7:\2\2\u01e3\u01e7\5\64\33\2\u01e4\u01e6\5\66\34\2\u01e5\u01e4\3\2\2"+
		"\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01eb"+
		"\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ec\58\35\2\u01eb\u01ea\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\63\3\2\2\2\u01ed\u01ee\7\62\2\2\u01ee\u01fb\5\u008a"+
		"F\2\u01ef\u01f0\7\u00d2\2\2\u01f0\u01f5\5\u008aF\2\u01f1\u01f2\7\u00d8"+
		"\2\2\u01f2\u01f4\5\u008aF\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f8\u01f9\7\u00d3\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01ed\3\2\2\2\u01fa"+
		"\u01ef\3\2\2\2\u01fb\65\3\2\2\2\u01fc\u01fd\7\60\2\2\u01fd\u0200\7m\2"+
		"\2\u01fe\u0200\7\u0082\2\2\u01ff\u01fc\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200"+
		"\67\3\2\2\2\u0201\u0202\7k\2\2\u0202\u0203\7\u00e1\2\2\u02039\3\2\2\2"+
		"\u0204\u0205\7\u009d\2\2\u0205\u0206\7\62\2\2\u0206\u0207\5\u008aF\2\u0207"+
		"\u0208\7M\2\2\u0208\u0209\5\u008aF\2\u0209;\3\2\2\2\u020a\u0213\5> \2"+
		"\u020b\u0213\5@!\2\u020c\u0213\5H%\2\u020d\u020f\5J&\2\u020e\u020d\3\2"+
		"\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u0213\3\2\2\2\u0212\u020a\3\2\2\2\u0212\u020b\3\2\2\2\u0212\u020c\3\2"+
		"\2\2\u0212\u020e\3\2\2\2\u0213=\3\2\2\2\u0214\u021b\7,\2\2\u0215\u0217"+
		"\5f\64\2\u0216\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0216\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u021c\5h\65\2\u021b\u0216\3\2"+
		"\2\2\u021b\u021a\3\2\2\2\u021c?\3\2\2\2\u021d\u021e\7\u008a\2\2\u021e"+
		"\u0220\5D#\2\u021f\u0221\5Z.\2\u0220\u021f\3\2\2\2\u0221\u0222\3\2\2\2"+
		"\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0226"+
		"\7\60\2\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226A\3\2\2\2\u0227"+
		"\u0228\7\64\2\2\u0228\u0229\5\u00f2z\2\u0229C\3\2\2\2\u022a\u022d\5B\""+
		"\2\u022b\u022d\5F$\2\u022c\u022a\3\2\2\2\u022c\u022b\3\2\2\2\u022dE\3"+
		"\2\2\2\u022e\u0232\5\u0096L\2\u022f\u0230\7P\2\2\u0230\u0232\5\u0098M"+
		"\2\u0231\u022e\3\2\2\2\u0231\u022f\3\2\2\2\u0232G\3\2\2\2\u0233\u0234"+
		"\7\u009d\2\2\u0234\u0235\5B\"\2\u0235\u0236\7M\2\2\u0236\u0237\5\u00f2"+
		"z\2\u0237I\3\2\2\2\u0238\u0246\7:\2\2\u0239\u023b\5F$\2\u023a\u023c\7"+
		"\60\2\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023f\3\2\2\2\u023d"+
		"\u023e\t\3\2\2\u023e\u0240\7A\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2"+
		"\2\2\u0240\u0247\3\2\2\2\u0241\u0242\7\64\2\2\u0242\u0244\5\u00f2z\2\u0243"+
		"\u0245\7\60\2\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3"+
		"\2\2\2\u0246\u0239\3\2\2\2\u0246\u0241\3\2\2\2\u0247K\3\2\2\2\u0248\u024c"+
		"\5$\23\2\u0249\u024c\5*\26\2\u024a\u024c\5\62\32\2\u024b\u0248\3\2\2\2"+
		"\u024b\u0249\3\2\2\2\u024b\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024b"+
		"\3\2\2\2\u024d\u024e\3\2\2\2\u024eM\3\2\2\2\u024f\u0250\5\u008aF\2\u0250"+
		"\u0252\5\u00d8m\2\u0251\u0253\7\u00a5\2\2\u0252\u0251\3\2\2\2\u0252\u0253"+
		"\3\2\2\2\u0253\u025b\3\2\2\2\u0254\u0257\7\67\2\2\u0255\u0256\7C\2\2\u0256"+
		"\u0258\7\34\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3"+
		"\2\2\2\u0259\u025c\5\u009eP\2\u025a\u025c\5P)\2\u025b\u0254\3\2\2\2\u025b"+
		"\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025e\7w"+
		"\2\2\u025e\u0260\5j\66\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0267\3\2\2\2\u0261\u0263\5V,\2\u0262\u0261\3\2\2\2\u0263\u0264\3\2\2"+
		"\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0268"+
		"\5d\63\2\u0267\u0262\3\2\2\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"O\3\2\2\2\u0269\u0271\7?\2\2\u026a\u0272\7.\2\2\u026b\u026c\7\13\2\2\u026c"+
		"\u026f\7\67\2\2\u026d\u026e\7C\2\2\u026e\u0270\7\34\2\2\u026f\u026d\3"+
		"\2\2\2\u026f\u0270\3\2\2\2\u0270\u0272\3\2\2\2\u0271\u026a\3\2\2\2\u0271"+
		"\u026b\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\7/\2\2\u0274\u0276\7}\2"+
		"\2\u0275\u0277\7\u00d2\2\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"\u027d\3\2\2\2\u0278\u027a\5R*\2\u0279\u0278\3\2\2\2\u027a\u027b\3\2\2"+
		"\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u0279"+
		"\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\3\2\2\2\u027f\u0281\7\u00d3\2"+
		"\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281Q\3\2\2\2\u0282\u0283"+
		"\7K\2\2\u0283\u0287\7*\2\2\u0284\u0288\7\u00e1\2\2\u0285\u0286\7\31\2"+
		"\2\u0286\u0288\7\u00b1\2\2\u0287\u0284\3\2\2\2\u0287\u0285\3\2\2\2\u0288"+
		"\u029a\3\2\2\2\u0289\u028a\7\177\2\2\u028a\u028b\7\13\2\2\u028b\u029a"+
		"\7\u00e1\2\2\u028c\u028d\7\u0086\2\2\u028d\u029a\7\u00e1\2\2\u028e\u029a"+
		"\7\u0090\2\2\u028f\u0290\7\u0088\2\2\u0290\u029a\7\u00e1\2\2\u0291\u029a"+
		"\7\u0091\2\2\u0292\u029a\7n\2\2\u0293\u029a\7\u008f\2\2\u0294\u0295\7"+
		"i\2\2\u0295\u029a\7\u00e1\2\2\u0296\u029a\7\u008e\2\2\u0297\u029a\7\36"+
		"\2\2\u0298\u029a\7\u0092\2\2\u0299\u0282\3\2\2\2\u0299\u0289\3\2\2\2\u0299"+
		"\u028c\3\2\2\2\u0299\u028e\3\2\2\2\u0299\u028f\3\2\2\2\u0299\u0291\3\2"+
		"\2\2\u0299\u0292\3\2\2\2\u0299\u0293\3\2\2\2\u0299\u0294\3\2\2\2\u0299"+
		"\u0296\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u0298\3\2\2\2\u029aS\3\2\2\2"+
		"\u029b\u029d\5\u008aF\2\u029c\u029e\5\u00d8m\2\u029d\u029c\3\2\2\2\u029d"+
		"\u029e\3\2\2\2\u029e\u02a1\3\2\2\2\u029f\u02a0\7?\2\2\u02a0\u02a2\7.\2"+
		"\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4"+
		"\7/\2\2\u02a4\u02a5\7\u00d2\2\2\u02a5\u02a6\5\u009eP\2\u02a6\u02a8\7\u00d3"+
		"\2\2\u02a7\u02a9\7\u00b3\2\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"\u02ad\3\2\2\2\u02aa\u02ac\5V,\2\u02ab\u02aa\3\2\2\2\u02ac\u02af\3\2\2"+
		"\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02aeU\3\2\2\2\u02af\u02ad"+
		"\3\2\2\2\u02b0\u02b1\7\64\2\2\u02b1\u02b3\5\u00f2z\2\u02b2\u02b0\3\2\2"+
		"\2\u02b2\u02b3\3\2\2\2\u02b3\u02c0\3\2\2\2\u02b4\u02b6\7\33\2\2\u02b5"+
		"\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02c1\7\34"+
		"\2\2\u02b8\u02c1\7P\2\2\u02b9\u02c1\5\u0096L\2\u02ba\u02c1\5X-\2\u02bb"+
		"\u02bc\7\61\2\2\u02bc\u02bd\7\u00d2\2\2\u02bd\u02be\5\u009eP\2\u02be\u02bf"+
		"\7\u00d3\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02b5\3\2\2\2\u02c0\u02b8\3\2\2"+
		"\2\u02c0\u02b9\3\2\2\2\u02c0\u02ba\3\2\2\2\u02c0\u02bb\3\2\2\2\u02c1\u02c5"+
		"\3\2\2\2\u02c2\u02c4\5Z.\2\u02c3\u02c2\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5"+
		"\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6W\3\2\2\2\u02c7\u02c5\3\2\2\2"+
		"\u02c8\u02c9\7F\2\2\u02c9\u02cb\5\u0088E\2\u02ca\u02cc\5\u0098M\2\u02cb"+
		"\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02d4\3\2\2\2\u02cd\u02ce\7C"+
		"\2\2\u02ce\u02d2\78\2\2\u02cf\u02d3\7\60\2\2\u02d0\u02d1\7\"\2\2\u02d1"+
		"\u02d3\7\34\2\2\u02d2\u02cf\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d5\3"+
		"\2\2\2\u02d4\u02cd\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5Y\3\2\2\2\u02d6\u02e1"+
		"\5\\/\2\u02d7\u02e1\5^\60\2\u02d8\u02e1\7\u009c\2\2\u02d9\u02e1\7\u0093"+
		"\2\2\u02da\u02e1\5b\62\2\u02db\u02e1\7;\2\2\u02dc\u02e1\79\2\2\u02dd\u02e1"+
		"\7\u00b0\2\2\u02de\u02e1\7\u0094\2\2\u02df\u02e1\5`\61\2\u02e0\u02d6\3"+
		"\2\2\2\u02e0\u02d7\3\2\2\2\u02e0\u02d8\3\2\2\2\u02e0\u02d9\3\2\2\2\u02e0"+
		"\u02da\3\2\2\2\u02e0\u02db\3\2\2\2\u02e0\u02dc\3\2\2\2\u02e0\u02dd\3\2"+
		"\2\2\u02e0\u02de\3\2\2\2\u02e0\u02df\3\2\2\2\u02e1[\3\2\2\2\u02e2\u02e4"+
		"\7\33\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\3\2\2\2"+
		"\u02e5\u02e6\7q\2\2\u02e6]\3\2\2\2\u02e7\u02e8\7\u0080\2\2\u02e8\u02e9"+
		"\t\4\2\2\u02e9_\3\2\2\2\u02ea\u02eb\7y\2\2\u02eb\u02ec\7\u0081\2\2\u02ec"+
		"a\3\2\2\2\u02ed\u02ee\7\u00af\2\2\u02ee\u02f4\7A\2\2\u02ef\u02f5\5\u008c"+
		"G\2\u02f0\u02f1\7\u00d2\2\2\u02f1\u02f2\5x=\2\u02f2\u02f3\7\u00d3\2\2"+
		"\u02f3\u02f5\3\2\2\2\u02f4\u02ef\3\2\2\2\u02f4\u02f0\3\2\2\2\u02f4\u02f5"+
		"\3\2\2\2\u02f5c\3\2\2\2\u02f6\u02f7\7\u00a3\2\2\u02f7\u02f8\7\26\2\2\u02f8"+
		"\u0307\5\u0088E\2\u02f9\u02fa\7*\2\2\u02fa\u0307\7\u00a0\2\2\u02fb\u02fc"+
		"\7\64\2\2\u02fc\u02fe\5\u00f2z\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe\3\2\2"+
		"\2\u02fe\u02ff\3\2\2\2\u02ff\u0303\5X-\2\u0300\u0302\5Z.\2\u0301\u0300"+
		"\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304"+
		"\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u02f6\3\2\2\2\u0306\u02f9\3\2"+
		"\2\2\u0306\u02fd\3\2\2\2\u0307e\3\2\2\2\u0308\u0309\7\64\2\2\u0309\u030b"+
		"\5\u00f2z\2\u030a\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u031b\3\2\2"+
		"\2\u030c\u030d\7P\2\2\u030d\u031c\5\u0098M\2\u030e\u030f\5\u0096L\2\u030f"+
		"\u0310\5\u0098M\2\u0310\u031c\3\2\2\2\u0311\u0312\7=\2\2\u0312\u0313\7"+
		"\27\2\2\u0313\u0314\5\u0098M\2\u0314\u0315\5X-\2\u0315\u031c\3\2\2\2\u0316"+
		"\u0317\7\61\2\2\u0317\u0318\7\u00d2\2\2\u0318\u0319\5\u009eP\2\u0319\u031a"+
		"\7\u00d3\2\2\u031a\u031c\3\2\2\2\u031b\u030c\3\2\2\2\u031b\u030e\3\2\2"+
		"\2\u031b\u0311\3\2\2\2\u031b\u0316\3\2\2\2\u031c\u0320\3\2\2\2\u031d\u031f"+
		"\5Z.\2\u031e\u031d\3\2\2\2\u031f\u0322\3\2\2\2\u0320\u031e\3\2\2\2\u0320"+
		"\u0321\3\2\2\2\u0321g\3\2\2\2\u0322\u0320\3\2\2\2\u0323\u0324\7\u00a3"+
		"\2\2\u0324\u0325\7<\2\2\u0325\u0326\7\u00d2\2\2\u0326\u0327\5\u00d2j\2"+
		"\u0327\u0328\7\u00d3\2\2\u0328\u0329\7\26\2\2\u0329\u032a\5\u0088E\2\u032a"+
		"\u0341\3\2\2\2\u032b\u032c\7\u009a\2\2\u032c\u032d\7\u00d2\2\2\u032d\u032e"+
		"\5\u00d2j\2\u032e\u032f\7\u00d3\2\2\u032f\u0330\7*\2\2\u0330\u0331\7\u00a0"+
		"\2\2\u0331\u0341\3\2\2\2\u0332\u0333\7\64\2\2\u0333\u0335\5\u00f2z\2\u0334"+
		"\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\7="+
		"\2\2\u0337\u0338\7\27\2\2\u0338\u0339\5\u00d6l\2\u0339\u033d\5X-\2\u033a"+
		"\u033c\5Z.\2\u033b\u033a\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2\2"+
		"\2\u033d\u033e\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u0323"+
		"\3\2\2\2\u0340\u032b\3\2\2\2\u0340\u0334\3\2\2\2\u0341i\3\2\2\2\u0342"+
		"\u0343\7\u00af\2\2\u0343\u0345\7\u00e0\2\2\u0344\u0342\3\2\2\2\u0344\u0345"+
		"\3\2\2\2\u0345\u0349\3\2\2\2\u0346\u0347\7|\2\2\u0347\u0348\7\13\2\2\u0348"+
		"\u034a\7\u00e0\2\2\u0349\u0346\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034c"+
		"\3\2\2\2\u034b\u034d\7\u00e0\2\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2"+
		"\2\u034d\u0352\3\2\2\2\u034e\u0350\7B\2\2\u034f\u034e\3\2\2\2\u034f\u0350"+
		"\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0353\7\u00a1\2\2\u0352\u034f\3\2\2"+
		"\2\u0352\u0353\3\2\2\2\u0353k\3\2\2\2\u0354\u0359\5n8\2\u0355\u0356\7"+
		"\u00d8\2\2\u0356\u0358\5n8\2\u0357\u0355\3\2\2\2\u0358\u035b\3\2\2\2\u0359"+
		"\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035am\3\2\2\2\u035b\u0359\3\2\2\2"+
		"\u035c\u035f\5\u008aF\2\u035d\u035f\5\u00caf\2\u035e\u035c\3\2\2\2\u035e"+
		"\u035d\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u0361\7\67\2\2\u0361\u0363\5"+
		"\u009eP\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u036d\3\2\2\2"+
		"\u0364\u0366\5V,\2\u0365\u0364\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365"+
		"\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u036e\3\2\2\2\u0369\u0367\3\2\2\2\u036a"+
		"\u036c\5d\63\2\u036b\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036e\3\2"+
		"\2\2\u036d\u0367\3\2\2\2\u036d\u036b\3\2\2\2\u036e\u0372\3\2\2\2\u036f"+
		"\u0372\5f\64\2\u0370\u0372\5h\65\2\u0371\u035e\3\2\2\2\u0371\u036f\3\2"+
		"\2\2\u0371\u0370\3\2\2\2\u0372o\3\2\2\2\u0373\u0375\5r:\2\u0374\u0373"+
		"\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377"+
		"q\3\2\2\2\u0378\u0379\5t;\2\u0379s\3\2\2\2\u037a\u037b\7\62\2\2\u037b"+
		"\u037c\5\u008aF\2\u037c\u037d\5v<\2\u037du\3\2\2\2\u037e\u0380\7u\2\2"+
		"\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382"+
		"\7\26\2\2\u0382\u0384\7\u0095\2\2\u0383\u0385\7\u00ad\2\2\u0384\u0383"+
		"\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\7\u00d2\2"+
		"\2\u0387\u0389\7\u0096\2\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389"+
		"\u038a\3\2\2\2\u038a\u038b\5\u00dco\2\u038b\u038c\7\u00d3\2\2\u038c\u0395"+
		"\3\2\2\2\u038d\u038f\7\33\2\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2\2"+
		"\u038f\u0390\3\2\2\2\u0390\u0391\7\u00a7\2\2\u0391\u0392\7g\2\2\u0392"+
		"\u0393\7\5\2\2\u0393\u0395\7\u0084\2\2\u0394\u037f\3\2\2\2\u0394\u038e"+
		"\3\2\2\2\u0395w\3\2\2\2\u0396\u0398\7\65\2\2\u0397\u0399\t\5\2\2\u0398"+
		"\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b\7A"+
		"\2\2\u039b\u039c\5\u008cG\2\u039c\u039f\7C\2\2\u039d\u03a0\5z>\2\u039e"+
		"\u03a0\5~@\2\u039f\u039d\3\2\2\2\u039f\u039e\3\2\2\2\u03a0y\3\2\2\2\u03a1"+
		"\u03a3\5\u0088E\2\u03a2\u03a4\5\u0092J\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4"+
		"\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\7\u00d2\2\2\u03a6\u03ab\5|?\2"+
		"\u03a7\u03a8\7\u00d8\2\2\u03a8\u03aa\5|?\2\u03a9\u03a7\3\2\2\2\u03aa\u03ad"+
		"\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae\3\2\2\2\u03ad"+
		"\u03ab\3\2\2\2\u03ae\u03af\7\u00d3\2\2\u03af{\3\2\2\2\u03b0\u03b3\5\u008a"+
		"F\2\u03b1\u03b3\5\u009eP\2\u03b2\u03b0\3\2\2\2\u03b2\u03b1\3\2\2\2\u03b3"+
		"\u03b5\3\2\2\2\u03b4\u03b6\t\6\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2"+
		"\2\2\u03b6}\3\2\2\2\u03b7\u03b8\5\u0088E\2\u03b8\u03b9\7\u00d2\2\2\u03b9"+
		"\u03be\5\u0080A\2\u03ba\u03bb\7\u00d8\2\2\u03bb\u03bd\5\u0080A\2\u03bc"+
		"\u03ba\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2"+
		"\2\2\u03bf\u03c1\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1\u03c2\7\u00d3\2\2\u03c2"+
		"\u03c3\7\22\2\2\u03c3\u03c5\5\u0088E\2\u03c4\u03c6\5\u0092J\2\u03c5\u03c4"+
		"\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03ce\3\2\2\2\u03c7\u03c8\7\u00d8\2"+
		"\2\u03c8\u03ca\5\u0088E\2\u03c9\u03cb\5\u0092J\2\u03ca\u03c9\3\2\2\2\u03ca"+
		"\u03cb\3\2\2\2\u03cb\u03cd\3\2\2\2\u03cc\u03c7\3\2\2\2\u03cd\u03d0\3\2"+
		"\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0"+
		"\u03ce\3\2\2\2\u03d1\u03d2\7)\2\2\u03d2\u03d3\5\u009eP\2\u03d3\177\3\2"+
		"\2\2\u03d4\u03d6\5\u0088E\2\u03d5\u03d7\5\u0092J\2\u03d6\u03d5\3\2\2\2"+
		"\u03d6\u03d7\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\5\u008aF\2\u03d9"+
		"\u03db\t\6\2\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u0081\3\2"+
		"\2\2\u03dc\u03dd\7:\2\2\u03dd\u03de\7A\2\2\u03de\u03df\5\u008cG\2\u03df"+
		"\u0083\3\2\2\2\u03e0\u03e1\7-\2\2\u03e1\u03e2\7A\2\2\u03e2\u03e6\5\u008c"+
		"G\2\u03e3\u03e4\7\u009d\2\2\u03e4\u03e5\7M\2\2\u03e5\u03e7\5\u008cG\2"+
		"\u03e6\u03e3\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u0085\3\2\2\2\u03e8\u03e9"+
		"\7\u00df\2\2\u03e9\u0087\3\2\2\2\u03ea\u03eb\5\u008eH\2\u03eb\u0089\3"+
		"\2\2\2\u03ec\u03ed\5\u008eH\2\u03ed\u008b\3\2\2\2\u03ee\u03ef\5\u008e"+
		"H\2\u03ef\u008d\3\2\2\2\u03f0\u03fa\7\u00df\2\2\u03f1\u03f2\7\u00e0\2"+
		"\2\u03f2\u03f4\7\u00c7\2\2\u03f3\u03f1\3\2\2\2\u03f4\u03f7\3\2\2\2\u03f5"+
		"\u03f3\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f8\3\2\2\2\u03f7\u03f5\3\2"+
		"\2\2\u03f8\u03fa\7\u00e0\2\2\u03f9\u03f0\3\2\2\2\u03f9\u03f5\3\2\2\2\u03fa"+
		"\u008f\3\2\2\2\u03fb\u03fc\t\7\2\2\u03fc\u0091\3\2\2\2\u03fd\u03fe\7\u00df"+
		"\2\2\u03fe\u0093\3\2\2\2\u03ff\u0405\7\u00d2\2\2\u0400\u0403\7\u00e1\2"+
		"\2\u0401\u0402\7\u00d8\2\2\u0402\u0404\7\u00e1\2\2\u0403\u0401\3\2\2\2"+
		"\u0403\u0404\3\2\2\2\u0404\u0406\3\2\2\2\u0405\u0400\3\2\2\2\u0405\u0406"+
		"\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\7\u00d3\2\2\u0408\u0095\3\2\2"+
		"\2\u0409\u040b\7\37\2\2\u040a\u0409\3\2\2\2\u040a\u040b\3\2\2\2\u040b"+
		"\u040c\3\2\2\2\u040c\u040d\7\27\2\2\u040d\u0097\3\2\2\2\u040e\u040f\7"+
		"\u00d2\2\2\u040f\u0414\5\u008aF\2\u0410\u0411\7\u00d8\2\2\u0411\u0413"+
		"\5\u008aF\2\u0412\u0410\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2\2"+
		"\2\u0414\u0415\3\2\2\2\u0415\u0417\3\2\2\2\u0416\u0414\3\2\2\2\u0417\u0418"+
		"\7\u00d3\2\2\u0418\u0099\3\2\2\2\u0419\u041e\5\u009eP\2\u041a\u041b\7"+
		"\u00d8\2\2\u041b\u041d\5\u009eP\2\u041c\u041a\3\2\2\2\u041d\u0420\3\2"+
		"\2\2\u041e\u041c\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u009b\3\2\2\2\u0420"+
		"\u041e\3\2\2\2\u0421\u0422\7\u00d2\2\2\u0422\u0423\5\u009aN\2\u0423\u0424"+
		"\7\u00d3\2\2\u0424\u009d\3\2\2\2\u0425\u0426\bP\1\2\u0426\u0427\7\u00d2"+
		"\2\2\u0427\u0428\5\u009eP\2\u0428\u0429\7\u00d3\2\2\u0429\u0431\3\2\2"+
		"\2\u042a\u042b\7\33\2\2\u042b\u0431\5\u009eP\b\u042c\u042d\7\u00b9\2\2"+
		"\u042d\u0431\5\u009eP\7\u042e\u0431\5\u00a2R\2\u042f\u0431\5\u00a0Q\2"+
		"\u0430\u0425\3\2\2\2\u0430\u042a\3\2\2\2\u0430\u042c\3\2\2\2\u0430\u042e"+
		"\3\2\2\2\u0430\u042f\3\2\2\2\u0431\u0443\3\2\2\2\u0432\u0433\f\f\2\2\u0433"+
		"\u0434\7\6\2\2\u0434\u0442\5\u009eP\r\u0435\u0436\f\13\2\2\u0436\u0437"+
		"\7\u00b7\2\2\u0437\u0442\5\u009eP\f\u0438\u0439\f\n\2\2\u0439\u043a\7"+
		"+\2\2\u043a\u0442\5\u009eP\13\u043b\u043c\f\6\2\2\u043c\u043d\7\35\2\2"+
		"\u043d\u0442\5\u009eP\7\u043e\u043f\f\5\2\2\u043f\u0440\7\u00b8\2\2\u0440"+
		"\u0442\5\u009eP\6\u0441\u0432\3\2\2\2\u0441\u0435\3\2\2\2\u0441\u0438"+
		"\3\2\2\2\u0441\u043b\3\2\2\2\u0441\u043e\3\2\2\2\u0442\u0445\3\2\2\2\u0443"+
		"\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u009f\3\2\2\2\u0445\u0443\3\2"+
		"\2\2\u0446\u0447\7\u0098\2\2\u0447\u0448\5\u009eP\2\u0448\u00a1\3\2\2"+
		"\2\u0449\u044a\bR\1\2\u044a\u044b\5\u00a6T\2\u044b\u0460\3\2\2\2\u044c"+
		"\u044d\f\7\2\2\u044d\u044f\7\26\2\2\u044e\u0450\7\33\2\2\u044f\u044e\3"+
		"\2\2\2\u044f\u0450\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u045f\t\b\2\2\u0452"+
		"\u0453\f\6\2\2\u0453\u0454\7\u00c9\2\2\u0454\u045f\5\u00a6T\2\u0455\u0456"+
		"\f\5\2\2\u0456\u0457\5\u00a4S\2\u0457\u0458\5\u00a6T\2\u0458\u045f\3\2"+
		"\2\2\u0459\u045a\f\4\2\2\u045a\u045b\5\u00a4S\2\u045b\u045c\t\t\2\2\u045c"+
		"\u045d\5\u00c0a\2\u045d\u045f\3\2\2\2\u045e\u044c\3\2\2\2\u045e\u0452"+
		"\3\2\2\2\u045e\u0455\3\2\2\2\u045e\u0459\3\2\2\2\u045f\u0462\3\2\2\2\u0460"+
		"\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u00a3\3\2\2\2\u0462\u0460\3\2"+
		"\2\2\u0463\u0464\t\n\2\2\u0464\u00a5\3\2\2\2\u0465\u0467\5\u00a8U\2\u0466"+
		"\u0468\7\33\2\2\u0467\u0466\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\3"+
		"\2\2\2\u0469\u046a\7\25\2\2\u046a\u046b\5\u00c0a\2\u046b\u04a0\3\2\2\2"+
		"\u046c\u046e\5\u00a8U\2\u046d\u046f\7\33\2\2\u046e\u046d\3\2\2\2\u046e"+
		"\u046f\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0471\7\25\2\2\u0471\u0472\7"+
		"\u00d2\2\2\u0472\u0477\5\u00aaV\2\u0473\u0474\7\u00d8\2\2\u0474\u0476"+
		"\5\u00aaV\2\u0475\u0473\3\2\2\2\u0476\u0479\3\2\2\2\u0477\u0475\3\2\2"+
		"\2\u0477\u0478\3\2\2\2\u0478\u047a\3\2\2\2\u0479\u0477\3\2\2\2\u047a\u047b"+
		"\7\u00d3\2\2\u047b\u04a0\3\2\2\2\u047c\u047e\5\u00a8U\2\u047d\u047f\7"+
		"\33\2\2\u047e\u047d\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480\3\2\2\2\u0480"+
		"\u0481\7\t\2\2\u0481\u0482\5\u00aaV\2\u0482\u0483\7\6\2\2\u0483\u0484"+
		"\5\u00a6T\2\u0484\u04a0\3\2\2\2\u0485\u0486\5\u00a8U\2\u0486\u0487\7#"+
		"\2\2\u0487\u0488\7\30\2\2\u0488\u0489\5\u00aaV\2\u0489\u04a0\3\2\2\2\u048a"+
		"\u048c\5\u00a8U\2\u048b\u048d\7\33\2\2\u048c\u048b\3\2\2\2\u048c\u048d"+
		"\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f\7\30\2\2\u048f\u0494\5\u00aa"+
		"V\2\u0490\u0491\7\17\2\2\u0491\u0493\5\u00aaV\2\u0492\u0490\3\2\2\2\u0493"+
		"\u0496\3\2\2\2\u0494\u0492\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u04a0\3\2"+
		"\2\2\u0496\u0494\3\2\2\2\u0497\u0499\5\u00a8U\2\u0498\u049a\7\33\2\2\u0499"+
		"\u0498\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c\7 "+
		"\2\2\u049c\u049d\5\u00aaV\2\u049d\u04a0\3\2\2\2\u049e\u04a0\5\u00a8U\2"+
		"\u049f\u0465\3\2\2\2\u049f\u046c\3\2\2\2\u049f\u047c\3\2\2\2\u049f\u0485"+
		"\3\2\2\2\u049f\u048a\3\2\2\2\u049f\u0497\3\2\2\2\u049f\u049e\3\2\2\2\u04a0"+
		"\u00a7\3\2\2\2\u04a1\u04a2\bU\1\2\u04a2\u04a3\5\u00aaV\2\u04a3\u04cd\3"+
		"\2\2\2\u04a4\u04a5\f\20\2\2\u04a5\u04a6\7\u00bb\2\2\u04a6\u04cc\5\u00a8"+
		"U\21\u04a7\u04a8\f\17\2\2\u04a8\u04a9\7\u00bc\2\2\u04a9\u04cc\5\u00a8"+
		"U\20\u04aa\u04ab\f\16\2\2\u04ab\u04ac\7\u00bd\2\2\u04ac\u04cc\5\u00a8"+
		"U\17\u04ad\u04ae\f\r\2\2\u04ae\u04af\7\u00be\2\2\u04af\u04cc\5\u00a8U"+
		"\16\u04b0\u04b1\f\f\2\2\u04b1\u04b2\7\u00c2\2\2\u04b2\u04cc\5\u00a8U\r"+
		"\u04b3\u04b4\f\13\2\2\u04b4\u04b5\7\u00c3\2\2\u04b5\u04cc\5\u00a8U\f\u04b6"+
		"\u04b7\f\n\2\2\u04b7\u04b8\7\u00c4\2\2\u04b8\u04cc\5\u00a8U\13\u04b9\u04ba"+
		"\f\t\2\2\u04ba\u04bb\7\u00c5\2\2\u04bb\u04cc\5\u00a8U\n\u04bc\u04bd\f"+
		"\b\2\2\u04bd\u04be\7\32\2\2\u04be\u04cc\5\u00a8U\t\u04bf\u04c0\f\7\2\2"+
		"\u04c0\u04c1\7\u00c0\2\2\u04c1\u04cc\5\u00a8U\b\u04c2\u04c3\f\6\2\2\u04c3"+
		"\u04c4\7\u00bf\2\2\u04c4\u04cc\5\u00a8U\7\u04c5\u04c6\f\5\2\2\u04c6\u04c7"+
		"\7\u00c2\2\2\u04c7\u04cc\5\u00b0Y\2\u04c8\u04c9\f\4\2\2\u04c9\u04ca\7"+
		"\u00c3\2\2\u04ca\u04cc\5\u00b0Y\2\u04cb\u04a4\3\2\2\2\u04cb\u04a7\3\2"+
		"\2\2\u04cb\u04aa\3\2\2\2\u04cb\u04ad\3\2\2\2\u04cb\u04b0\3\2\2\2\u04cb"+
		"\u04b3\3\2\2\2\u04cb\u04b6\3\2\2\2\u04cb\u04b9\3\2\2\2\u04cb\u04bc\3\2"+
		"\2\2\u04cb\u04bf\3\2\2\2\u04cb\u04c2\3\2\2\2\u04cb\u04c5\3\2\2\2\u04cb"+
		"\u04c8\3\2\2\2\u04cc\u04cf\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04ce\3\2"+
		"\2\2\u04ce\u00a9\3\2\2\2\u04cf\u04cd\3\2\2\2\u04d0\u04d1\bV\1\2\u04d1"+
		"\u04e9\5\u00acW\2\u04d2\u04e9\5\u00b8]\2\u04d3\u04e9\5\u008aF\2\u04d4"+
		"\u04e9\5\u00b6\\\2\u04d5\u04d6\7\u00c2\2\2\u04d6\u04e9\5\u00aaV\16\u04d7"+
		"\u04d8\7\u00c3\2\2\u04d8\u04e9\5\u00aaV\r\u04d9\u04da\7\u00ba\2\2\u04da"+
		"\u04e9\5\u00aaV\f\u04db\u04dc\7\u00b9\2\2\u04dc\u04e9\5\u00aaV\13\u04dd"+
		"\u04de\7\n\2\2\u04de\u04e9\5\u00aaV\n\u04df\u04e9\5\u009cO\2\u04e0\u04e1"+
		"\7!\2\2\u04e1\u04e9\5\u009cO\2\u04e2\u04e9\5\u00c0a\2\u04e3\u04e4\7\20"+
		"\2\2\u04e4\u04e9\5\u00c0a\2\u04e5\u04e9\5\u00b2Z\2\u04e6\u04e9\5\u00b0"+
		"Y\2\u04e7\u04e9\5\u00b4[\2\u04e8\u04d0\3\2\2\2\u04e8\u04d2\3\2\2\2\u04e8"+
		"\u04d3\3\2\2\2\u04e8\u04d4\3\2\2\2\u04e8\u04d5\3\2\2\2\u04e8\u04d7\3\2"+
		"\2\2\u04e8\u04d9\3\2\2\2\u04e8\u04db\3\2\2\2\u04e8\u04dd\3\2\2\2\u04e8"+
		"\u04df\3\2\2\2\u04e8\u04e0\3\2\2\2\u04e8\u04e2\3\2\2\2\u04e8\u04e3\3\2"+
		"\2\2\u04e8\u04e5\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e8\u04e7\3\2\2\2\u04e9"+
		"\u04f1\3\2\2\2\u04ea\u04eb\f\17\2\2\u04eb\u04ec\7\u00b7\2\2\u04ec\u04f0"+
		"\5\u00aaV\20\u04ed\u04ee\f\21\2\2\u04ee\u04f0\5\u00c2b\2\u04ef\u04ea\3"+
		"\2\2\2\u04ef\u04ed\3\2\2\2\u04f0\u04f3\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1"+
		"\u04f2\3\2\2\2\u04f2\u00ab\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f4\u04f5\7\u00df"+
		"\2\2\u04f5\u04f7\7\u00d2\2\2\u04f6\u04f8\5\u00aeX\2\u04f7\u04f6\3\2\2"+
		"\2\u04f7\u04f8\3\2\2\2\u04f8\u04fb\3\2\2\2\u04f9\u04fc\5\u009aN\2\u04fa"+
		"\u04fc\7\u00c4\2\2\u04fb\u04f9\3\2\2\2\u04fb\u04fa\3\2\2\2\u04fb\u04fc"+
		"\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04fe\7\u00d3\2\2\u04fe\u00ad\3\2\2"+
		"\2\u04ff\u0500\7\16\2\2\u0500\u00af\3\2\2\2\u0501\u0502\5\u00f6|\2\u0502"+
		"\u00b1\3\2\2\2\u0503\u0504\5\u00f6|\2\u0504\u00b3\3\2\2\2\u0505\u050b"+
		"\5\u00e0q\2\u0506\u050b\5\u00e2r\2\u0507\u050b\5\u00ecw\2\u0508\u050b"+
		"\5\u00eex\2\u0509\u050b\5\u00f0y\2\u050a\u0505\3\2\2\2\u050a\u0506\3\2"+
		"\2\2\u050a\u0507\3\2\2\2\u050a\u0508\3\2\2\2\u050a\u0509\3\2\2\2\u050b"+
		"\u00b5\3\2\2\2\u050c\u050d\5\u00f6|\2\u050d\u00b7\3\2\2\2\u050e\u0528"+
		"\5\u00ba^\2\u050f\u0528\5\u00bc_\2\u0510\u0528\7&\2\2\u0511\u0528\7\21"+
		"\2\2\u0512\u0528\7\34\2\2\u0513\u0514\7\u00d4\2\2\u0514\u0515\7\u00df"+
		"\2\2\u0515\u0516\7\u00e0\2\2\u0516\u0528\7\u00d5\2\2\u0517\u0528\7\u00e2"+
		"\2\2\u0518\u0528\5\u00be`\2\u0519\u051a\7\u00df\2\2\u051a\u051c\7\u00e0"+
		"\2\2\u051b\u051d\5\u00c2b\2\u051c\u051b\3\2\2\2\u051c\u051d\3\2\2\2\u051d"+
		"\u0528\3\2\2\2\u051e\u051f\t\13\2\2\u051f\u0528\7\u00e0\2\2\u0520\u0522"+
		"\7\u00df\2\2\u0521\u0520\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0523\3\2\2"+
		"\2\u0523\u0525\7\u00e3\2\2\u0524\u0526\5\u00c2b\2\u0525\u0524\3\2\2\2"+
		"\u0525\u0526\3\2\2\2\u0526\u0528\3\2\2\2\u0527\u050e\3\2\2\2\u0527\u050f"+
		"\3\2\2\2\u0527\u0510\3\2\2\2\u0527\u0511\3\2\2\2\u0527\u0512\3\2\2\2\u0527"+
		"\u0513\3\2\2\2\u0527\u0517\3\2\2\2\u0527\u0518\3\2\2\2\u0527\u0519\3\2"+
		"\2\2\u0527\u051e\3\2\2\2\u0527\u0521\3\2\2\2\u0528\u00b9\3\2\2\2\u0529"+
		"\u052a\7\u00dc\2\2\u052a\u00bb\3\2\2\2\u052b\u052c\7\u00e1\2\2\u052c\u00bd"+
		"\3\2\2\2\u052d\u052e\7\u00e0\2\2\u052e\u00bf\3\2\2\2\u052f\u0530\5\u00f6"+
		"|\2\u0530\u00c1\3\2\2\2\u0531\u0532\5\u00f6|\2\u0532\u00c3\3\2\2\2\u0533"+
		"\u0534\7\36\2\2\u0534\u0535\7\13\2\2\u0535\u053a\5\u00c6d\2\u0536\u0537"+
		"\7\u00d8\2\2\u0537\u0539\5\u00c6d\2\u0538\u0536\3\2\2\2\u0539\u053c\3"+
		"\2\2\2\u053a\u0538\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u00c5\3\2\2\2\u053c"+
		"\u053a\3\2\2\2\u053d\u0541\5\u008aF\2\u053e\u0541\5\u00bc_\2\u053f\u0541"+
		"\5\u009eP\2\u0540\u053d\3\2\2\2\u0540\u053e\3\2\2\2\u0540\u053f\3\2\2"+
		"\2\u0541\u0543\3\2\2\2\u0542\u0544\t\6\2\2\u0543\u0542\3\2\2\2\u0543\u0544"+
		"\3\2\2\2\u0544\u00c7\3\2\2\2\u0545\u0546\7\u00c4\2\2\u0546\u00c9\3\2\2"+
		"\2\u0547\u0548\5\u008eH\2\u0548\u00cb\3\2\2\2\u0549\u054a\7\u00df\2\2"+
		"\u054a\u00cd\3\2\2\2\u054b\u054c\7\u00d2\2\2\u054c\u054d\5\u00d0i\2\u054d"+
		"\u054e\7\u00d3\2\2\u054e\u00cf\3\2\2\2\u054f\u0554\5\u00aaV\2\u0550\u0551"+
		"\7\u00d8\2\2\u0551\u0553\5\u00aaV\2\u0552\u0550\3\2\2\2\u0553\u0556\3"+
		"\2\2\2\u0554\u0552\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u00d1\3\2\2\2\u0556"+
		"\u0554\3\2\2\2\u0557\u055a\5\u00caf\2\u0558\u055a\5\u008aF\2\u0559\u0557"+
		"\3\2\2\2\u0559\u0558\3\2\2\2\u055a\u00d3\3\2\2\2\u055b\u0560\5\u00d2j"+
		"\2\u055c\u055d\7\u00d8\2\2\u055d\u055f\5\u00d2j\2\u055e\u055c\3\2\2\2"+
		"\u055f\u0562\3\2\2\2\u0560\u055e\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u00d5"+
		"\3\2\2\2\u0562\u0560\3\2\2\2\u0563\u0564\7\u00d2\2\2\u0564\u0565\5\u00d4"+
		"k\2\u0565\u0566\7\u00d3\2\2\u0566\u00d7\3\2\2\2\u0567\u0569\5\u00dco\2"+
		"\u0568\u056a\5\u0094K\2\u0569\u0568\3\2\2\2\u0569\u056a\3\2\2\2\u056a"+
		"\u0573\3\2\2\2\u056b\u0573\5\u00dan\2\u056c\u056e\5\u00dco\2\u056d\u056f"+
		"\5\u0094K\2\u056e\u056d\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0570\3\2\2"+
		"\2\u0570\u0571\5\u00dep\2\u0571\u0573\3\2\2\2\u0572\u0567\3\2\2\2\u0572"+
		"\u056b\3\2\2\2\u0572\u056c\3\2\2\2\u0573\u00d9\3\2\2\2\u0574\u0575\5\u00dc"+
		"o\2\u0575\u0576\7\u00d2\2\2\u0576\u0577\7\u00e1\2\2\u0577\u0578\7\u00df"+
		"\2\2\u0578\u0579\7\u00d3\2\2\u0579\u058c\3\2\2\2\u057a\u057b\7\u008c\2"+
		"\2\u057b\u057d\5\u00dco\2\u057c\u057e\7\u00b2\2\2\u057d\u057c\3\2\2\2"+
		"\u057d\u057e\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0580\7\u00d2\2\2\u0580"+
		"\u0581\7\u00e1\2\2\u0581\u0582\7\u00d3\2\2\u0582\u058c\3\2\2\2\u0583\u0585"+
		"\5\u00dco\2\u0584\u0586\7\u00d2\2\2\u0585\u0584\3\2\2\2\u0585\u0586\3"+
		"\2\2\2\u0586\u0587\3\2\2\2\u0587\u0589\5\u008aF\2\u0588\u058a\7\u00d3"+
		"\2\2\u0589\u0588\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058c\3\2\2\2\u058b"+
		"\u0574\3\2\2\2\u058b\u057a\3\2\2\2\u058b\u0583\3\2\2\2\u058c\u00db\3\2"+
		"\2\2\u058d\u058e\7\u00df\2\2\u058e\u0591\7\u00df\2\2\u058f\u0591\7\u00df"+
		"\2\2\u0590\u058d\3\2\2\2\u0590\u058f\3\2\2\2\u0591\u00dd\3\2\2\2\u0592"+
		"\u0594\7*\2\2\u0593\u0595\7\u0085\2\2\u0594\u0593\3\2\2\2\u0594\u0595"+
		"\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0597\7$\2\2\u0597\u0599\7\u00b5\2"+
		"\2\u0598\u0592\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u05a4\3\2\2\2\u059a\u059b"+
		"\7M\2\2\u059b\u05a4\7\u008b\2\2\u059c\u059d\7M\2\2\u059d\u05a1\7\u00a4"+
		"\2\2\u059e\u059f\7\u00d2\2\2\u059f\u05a0\7\u00e1\2\2\u05a0\u05a2\7\u00d3"+
		"\2\2\u05a1\u059e\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a4\3\2\2\2\u05a3"+
		"\u0598\3\2\2\2\u05a3\u059a\3\2\2\2\u05a3\u059c\3\2\2\2\u05a4\u00df\3\2"+
		"\2\2\u05a5\u05a6\7\u00ac\2\2\u05a6\u05a7\7\u00d2\2\2\u05a7\u05a8\5\u009e"+
		"P\2\u05a8\u05aa\7/\2\2\u05a9\u05ab\7\u009a\2\2\u05aa\u05a9\3\2\2\2\u05aa"+
		"\u05ab\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ad\5\u00dco\2\u05ad\u05ae"+
		"\7\u00d3\2\2\u05ae\u00e1\3\2\2\2\u05af\u05b2\7j\2\2\u05b0\u05b3\5\u00e4"+
		"s\2\u05b1\u05b3\5\u00e6t\2\u05b2\u05b0\3\2\2\2\u05b2\u05b1\3\2\2\2\u05b3"+
		"\u05b5\3\2\2\2\u05b4\u05b6\5\u00e8u\2\u05b5\u05b4\3\2\2\2\u05b5\u05b6"+
		"\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b8\7x\2\2\u05b8\u00e3\3\2\2\2\u05b9"+
		"\u05bb\5\u009eP\2\u05ba\u05bc\5\u00e6t\2\u05bb\u05ba\3\2\2\2\u05bc\u05bd"+
		"\3\2\2\2\u05bd\u05bb\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u00e5\3\2\2\2\u05bf"+
		"\u05c0\7\u00b4\2\2\u05c0\u05c1\5\u009eP\2\u05c1\u05c2\7\u00aa\2\2\u05c2"+
		"\u05c3\5\u00aaV\2\u05c3\u00e7\3\2\2\2\u05c4\u05c5\7v\2\2\u05c5\u05c6\5"+
		"\u009eP\2\u05c6\u00e9\3\2\2\2\u05c7\u05c8\5\u009eP\2\u05c8\u05d1\7g\2"+
		"\2\u05c9\u05d2\7\u0085\2\2\u05ca\u05cb\7$\2\2\u05cb\u05cf\7\u00b5\2\2"+
		"\u05cc\u05d0\7\u00e0\2\2\u05cd\u05d0\7o\2\2\u05ce\u05d0\5\u009eP\2\u05cf"+
		"\u05cc\3\2\2\2\u05cf\u05cd\3\2\2\2\u05cf\u05ce\3\2\2\2\u05d0\u05d2\3\2"+
		"\2\2\u05d1\u05c9\3\2\2\2\u05d1\u05ca\3\2\2\2\u05d2\u00eb\3\2\2\2\u05d3"+
		"\u05d4\7\u00d2\2\2\u05d4\u05d5\5\u009eP\2\u05d5\u05d6\7\u00c3\2\2\u05d6"+
		"\u05d7\5\u009eP\2\u05d7\u05ed\7\u00d3\2\2\u05d8\u05dc\7\66\2\2\u05d9\u05da"+
		"\7\u00d2\2\2\u05da\u05db\7\u00e1\2\2\u05db\u05dd\7\u00d3\2\2\u05dc\u05d9"+
		"\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\7M\2\2\u05df"+
		"\u05e3\7\u00a4\2\2\u05e0\u05e1\7\u00d2\2\2\u05e1\u05e2\7\u00e1\2\2\u05e2"+
		"\u05e4\7\u00d3\2\2\u05e3\u05e0\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05ee"+
		"\3\2\2\2\u05e5\u05e9\7R\2\2\u05e6\u05e7\7\u00d2\2\2\u05e7\u05e8\7\u00e1"+
		"\2\2\u05e8\u05ea\7\u00d3\2\2\u05e9\u05e6\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea"+
		"\u05eb\3\2\2\2\u05eb\u05ec\7M\2\2\u05ec\u05ee\7\u008b\2\2\u05ed\u05d8"+
		"\3\2\2\2\u05ed\u05e5\3\2\2\2\u05ee\u00ed\3\2\2\2\u05ef\u05f0\7\u00d2\2"+
		"\2\u05f0\u05f1\5\u00aaV\2\u05f1\u05f2\7\u00d3\2\2\u05f2\u05f5\3\2\2\2"+
		"\u05f3\u05f5\5\u00e0q\2\u05f4\u05ef\3\2\2\2\u05f4\u05f3\3\2\2\2\u05f5"+
		"\u05f6\3\2\2\2\u05f6\u0604\7\u00c7\2\2\u05f7\u05fc\5\u00caf\2\u05f8\u05f9"+
		"\7\u00c7\2\2\u05f9\u05fb\5\u00caf\2\u05fa\u05f8\3\2\2\2\u05fb\u05fe\3"+
		"\2\2\2\u05fc\u05fa\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u0601\3\2\2\2\u05fe"+
		"\u05fc\3\2\2\2\u05ff\u0600\7\u00c7\2\2\u0600\u0602\5\u00acW\2\u0601\u05ff"+
		"\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0605\3\2\2\2\u0603\u0605\5\u00acW"+
		"\2\u0604\u05f7\3\2\2\2\u0604\u0603\3\2\2\2\u0605\u00ef\3\2\2\2\u0606\u0607"+
		"\7\u008d\2\2\u0607\u0608\5\u00dco\2\u0608\u0609\5\u009cO\2\u0609\u00f1"+
		"\3\2\2\2\u060a\u060b\7\u00df\2\2\u060b\u00f3\3\2\2\2\u060c\u0611\5\u00f2"+
		"z\2\u060d\u060e\7\u00d8\2\2\u060e\u0610\5\u00f2z\2\u060f\u060d\3\2\2\2"+
		"\u0610\u0613\3\2\2\2\u0611\u060f\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u00f5"+
		"\3\2\2\2\u0613\u0611\3\2\2\2\u0614\u0615\7\3\2\2\u0615\u00f7\3\2\2\2\u0616"+
		"\u0617\7\"\2\2\u0617\u0618\7N\2\2\u0618\u00f9\3\2\2\2\u0619\u061a\7\63"+
		"\2\2\u061a\u00fb\3\2\2\2\u061b\u061c\7I\2\2\u061c\u00fd\3\2\2\2\u061d"+
		"\u061e\7\u00a2\2\2\u061e\u00ff\3\2\2\2\u061f\u0626\7@\2\2\u0620\u0623"+
		"\5\u0104\u0083\2\u0621\u0622\7C\2\2\u0622\u0624\5\u0108\u0085\2\u0623"+
		"\u0621\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0627\3\2\2\2\u0625\u0627\5\u010a"+
		"\u0086\2\u0626\u0620\3\2\2\2\u0626\u0625\3\2\2\2\u0627\u0101\3\2\2\2\u0628"+
		"\u062f\7G\2\2\u0629\u062c\5\u0104\u0083\2\u062a\u062b\7C\2\2\u062b\u062d"+
		"\5\u0108\u0085\2\u062c\u062a\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u0630\3"+
		"\2\2\2\u062e\u0630\5\u010a\u0086\2\u062f\u0629\3\2\2\2\u062f\u062e\3\2"+
		"\2\2\u0630\u0103\3\2\2\2\u0631\u0633\5\u0106\u0084\2\u0632\u0634\5\u0098"+
		"M\2\u0633\u0632\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u063c\3\2\2\2\u0635"+
		"\u0636\7\u00d8\2\2\u0636\u0638\5\u0106\u0084\2\u0637\u0639\5\u0098M\2"+
		"\u0638\u0637\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063b\3\2\2\2\u063a\u0635"+
		"\3\2\2\2\u063b\u063e\3\2\2\2\u063c\u063a\3\2\2\2\u063c\u063d\3\2\2\2\u063d"+
		"\u0105\3\2\2\2\u063e\u063c\3\2\2\2\u063f\u0641\7\5\2\2\u0640\u0642\7D"+
		"\2\2\u0641\u0640\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0660\3\2\2\2\u0643"+
		"\u0660\7S\2\2\u0644\u0660\7T\2\2\u0645\u0660\78\2\2\u0646\u0660\7U\2\2"+
		"\u0647\u0660\7-\2\2\u0648\u0660\7E\2\2\u0649\u0660\7V\2\2\u064a\u0660"+
		"\7W\2\2\u064b\u0660\7X\2\2\u064c\u0660\7A\2\2\u064d\u0660\7F\2\2\u064e"+
		"\u0660\7Y\2\2\u064f\u0660\7Z\2\2\u0650\u0651\7[\2\2\u0651\u0660\7\\\2"+
		"\2\u0652\u0653\7C\2\2\u0653\u0654\7\63\2\2\u0654\u0660\7]\2\2\u0655\u0656"+
		"\7^\2\2\u0656\u0660\7_\2\2\u0657\u0658\7`\2\2\u0658\u0660\7\u00e4\2\2"+
		"\u0659\u065a\7b\2\2\u065a\u0660\7D\2\2\u065b\u065c\7c\2\2\u065c\u0660"+
		"\7d\2\2\u065d\u065e\7e\2\2\u065e\u0660\7f\2\2\u065f\u063f\3\2\2\2\u065f"+
		"\u0643\3\2\2\2\u065f\u0644\3\2\2\2\u065f\u0645\3\2\2\2\u065f\u0646\3\2"+
		"\2\2\u065f\u0647\3\2\2\2\u065f\u0648\3\2\2\2\u065f\u0649\3\2\2\2\u065f"+
		"\u064a\3\2\2\2\u065f\u064b\3\2\2\2\u065f\u064c\3\2\2\2\u065f\u064d\3\2"+
		"\2\2\u065f\u064e\3\2\2\2\u065f\u064f\3\2\2\2\u065f\u0650\3\2\2\2\u065f"+
		"\u0652\3\2\2\2\u065f\u0655\3\2\2\2\u065f\u0657\3\2\2\2\u065f\u0659\3\2"+
		"\2\2\u065f\u065b\3\2\2\2\u065f\u065d\3\2\2\2\u0660\u0107\3\2\2\2\u0661"+
		"\u066e\7Q\2\2\u0662\u066e\7s\2\2\u0663\u066e\7t\2\2\u0664\u0665\7\u0087"+
		"\2\2\u0665\u066e\7\u0089\2\2\u0666\u0667\7d\2\2\u0667\u0668\7\u00ab\2"+
		"\2\u0668\u066e\7\u0099\2\2\u0669\u066a\7\u0083\2\2\u066a\u066b\t\f\2\2"+
		"\u066b\u066e\5\u0088E\2\u066c\u066e\5\u0088E\2\u066d\u0661\3\2\2\2\u066d"+
		"\u0662\3\2\2\2\u066d\u0663\3\2\2\2\u066d\u0664\3\2\2\2\u066d\u0666\3\2"+
		"\2\2\u066d\u0669\3\2\2\2\u066d\u066c\3\2\2\2\u066e\u0109\3\2\2\2\u066f"+
		"\u0671\7\u00e0\2\2\u0670\u066f\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0670"+
		"\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u067a\3\2\2\2\u0674\u0676\7\u00df\2"+
		"\2\u0675\u0674\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0675\3\2\2\2\u0677\u0678"+
		"\3\2\2\2\u0678\u067a\3\2\2\2\u0679\u0670\3\2\2\2\u0679\u0675\3\2\2\2\u067a"+
		"\u010b\3\2\2\2\u067b\u067c\7\65\2\2\u067c\u067d\7Q\2\2\u067d\u010d\3\2"+
		"\2\2\u067e\u067f\7:\2\2\u067f\u0680\7Q\2\2\u0680\u010f\3\2\2\2\u0681\u0682"+
		"\7-\2\2\u0682\u0683\7Q\2\2\u0683\u0111\3\2\2\2\u0684\u0685\7\65\2\2\u0685"+
		"\u0686\7H\2\2\u0686\u0113\3\2\2\2\u0687\u0688\7:\2\2\u0688\u0689\7H\2"+
		"\2\u0689\u0115\3\2\2\2\u068a\u068b\7-\2\2\u068b\u068c\7H\2\2\u068c\u0117"+
		"\3\2\2\2\u00c6\u012b\u012e\u0133\u0140\u0157\u015d\u0166\u016d\u0170\u0174"+
		"\u017b\u0184\u0187\u018c\u0191\u0199\u019f\u01a3\u01a7\u01ae\u01b2\u01b5"+
		"\u01b9\u01bd\u01c2\u01c7\u01cd\u01d4\u01dc\u01e0\u01e7\u01eb\u01f5\u01fa"+
		"\u01ff\u0210\u0212\u0218\u021b\u0222\u0225\u022c\u0231\u023b\u023f\u0244"+
		"\u0246\u024b\u024d\u0252\u0257\u025b\u025f\u0264\u0267\u026f\u0271\u0276"+
		"\u027b\u027d\u0280\u0287\u0299\u029d\u02a1\u02a8\u02ad\u02b2\u02b5\u02c0"+
		"\u02c5\u02cb\u02d2\u02d4\u02e0\u02e3\u02f4\u02fd\u0303\u0306\u030a\u031b"+
		"\u0320\u0334\u033d\u0340\u0344\u0349\u034c\u034f\u0352\u0359\u035e\u0362"+
		"\u0367\u036b\u036d\u0371\u0376\u037f\u0384\u0388\u038e\u0394\u0398\u039f"+
		"\u03a3\u03ab\u03b2\u03b5\u03be\u03c5\u03ca\u03ce\u03d6\u03da\u03e6\u03f5"+
		"\u03f9\u0403\u0405\u040a\u0414\u041e\u0430\u0441\u0443\u044f\u045e\u0460"+
		"\u0467\u046e\u0477\u047e\u048c\u0494\u0499\u049f\u04cb\u04cd\u04e8\u04ef"+
		"\u04f1\u04f7\u04fb\u050a\u051c\u0521\u0525\u0527\u053a\u0540\u0543\u0554"+
		"\u0559\u0560\u0569\u056e\u0572\u057d\u0585\u0589\u058b\u0590\u0594\u0598"+
		"\u05a1\u05a3\u05aa\u05b2\u05b5\u05bd\u05cf\u05d1\u05dc\u05e3\u05e9\u05ed"+
		"\u05f4\u05fc\u0601\u0604\u0611\u0623\u0626\u062c\u062f\u0633\u0638\u063c"+
		"\u0641\u065f\u066d\u0672\u0677\u0679";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}