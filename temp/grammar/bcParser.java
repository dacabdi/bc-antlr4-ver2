// Generated from grammar/bc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		LISTSEPARATOR=18, STATEMENT_DELIM=19, FUNCT=20, READ=21, SQRT=22, SINE=23, 
		COSI=24, NLOG=25, EXPE=26, NAME=27, INT=28, FLOAT=29, NEWLINE=30, COMMENT=31, 
		WS=32, INCDEC=33, MULTIPLICATIVE=34, NEGATE=35, ADDITIVE=36, POW=37, RELATIONAL=38, 
		AND=39, OR=40, NOT=41, PASSIGN=42, ASSIGNMENT=43, STRING=44, STRINGDELIMITER=45;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_names_list = 2, RULE_auto_list = 3, 
		RULE_statement_list = 4, RULE_list = 5, RULE_list_item = 6, RULE_expr = 7, 
		RULE_number = 8;
	public static final String[] ruleNames = {
		"program", "statement", "names_list", "auto_list", "statement_list", "list", 
		"list_item", "expr", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'quit'", "'{'", "'}'", "'print'", "'if'", "'('", "')'", 
		"'else'", "'while'", "'for'", "'break'", "'continue'", "'halt'", "'return'", 
		"'define'", "'auto'", "','", null, null, "'read'", "'sqrt'", "'s'", "'c'", 
		"'l'", "'e'", null, null, null, "'\n'", null, null, null, null, "'-'", 
		null, "'^'", null, "'&&'", "'||'", "'!'", null, "'='", null, "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "LISTSEPARATOR", "STATEMENT_DELIM", 
		"FUNCT", "READ", "SQRT", "SINE", "COSI", "NLOG", "EXPE", "NAME", "INT", 
		"FLOAT", "NEWLINE", "COMMENT", "WS", "INCDEC", "MULTIPLICATIVE", "NEGATE", 
		"ADDITIVE", "POW", "RELATIONAL", "AND", "OR", "NOT", "PASSIGN", "ASSIGNMENT", 
		"STRING", "STRINGDELIMITER"
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
	public String getGrammarFileName() { return "bc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(bcParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(EOF);
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__5:
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case FUNCT:
			case READ:
			case NAME:
			case INT:
			case FLOAT:
			case INCDEC:
			case NEGATE:
			case NOT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				statement();
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==NEWLINE) {
					{
					{
					setState(21); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(20);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==NEWLINE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(23); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__0 || _la==NEWLINE );
					setState(25);
					statement();
					}
					}
					setState(30);
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

	public static class StatementContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STRING() { return getToken(bcParser.STRING, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode NAME() { return getToken(bcParser.NAME, 0); }
		public Names_listContext names_list() {
			return getRuleContext(Names_listContext.class,0);
		}
		public Auto_listContext auto_list() {
			return getRuleContext(Auto_listContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				match(T__2);
				setState(37);
				statement_list();
				setState(38);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				match(T__4);
				setState(41);
				list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				match(T__5);
				setState(43);
				match(T__6);
				setState(44);
				expr(0);
				setState(45);
				match(T__7);
				setState(46);
				statement();
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(47);
					match(T__8);
					setState(48);
					statement();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				match(T__9);
				setState(52);
				match(T__6);
				setState(53);
				expr(0);
				setState(54);
				match(T__7);
				setState(55);
				statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				match(T__10);
				setState(58);
				match(T__6);
				setState(59);
				expr(0);
				setState(60);
				match(T__0);
				setState(61);
				expr(0);
				setState(62);
				match(T__0);
				setState(63);
				expr(0);
				setState(64);
				match(T__7);
				setState(65);
				statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(67);
				match(T__11);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(68);
				match(T__12);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(69);
				match(T__13);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(70);
				match(T__14);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(71);
				match(T__14);
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(72);
					match(T__6);
					setState(73);
					expr(0);
					setState(74);
					match(T__7);
					}
					break;
				case 2:
					{
					setState(76);
					expr(0);
					}
					break;
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(79);
				match(T__15);
				setState(80);
				match(NAME);
				setState(81);
				match(T__6);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(82);
					names_list();
					}
				}

				setState(85);
				match(T__7);
				setState(86);
				match(T__2);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(87);
					auto_list();
					}
				}

				setState(90);
				statement_list();
				setState(91);
				match(T__3);
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

	public static class Names_listContext extends ParserRuleContext {
		public Token curr;
		public Names_listContext next;
		public TerminalNode NAME() { return getToken(bcParser.NAME, 0); }
		public TerminalNode LISTSEPARATOR() { return getToken(bcParser.LISTSEPARATOR, 0); }
		public Names_listContext names_list() {
			return getRuleContext(Names_listContext.class,0);
		}
		public Names_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_names_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterNames_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitNames_list(this);
		}
	}

	public final Names_listContext names_list() throws RecognitionException {
		Names_listContext _localctx = new Names_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_names_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			((Names_listContext)_localctx).curr = match(NAME);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LISTSEPARATOR) {
				{
				setState(96);
				match(LISTSEPARATOR);
				setState(97);
				((Names_listContext)_localctx).next = names_list();
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

	public static class Auto_listContext extends ParserRuleContext {
		public Names_listContext names_list() {
			return getRuleContext(Names_listContext.class,0);
		}
		public Auto_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auto_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterAuto_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitAuto_list(this);
		}
	}

	public final Auto_listContext auto_list() throws RecognitionException {
		Auto_listContext _localctx = new Auto_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_auto_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__16);
			setState(101);
			names_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public StatementContext curr;
		public Statement_listContext next;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode STATEMENT_DELIM() { return getToken(bcParser.STATEMENT_DELIM, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement_list);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__4:
			case T__5:
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case FUNCT:
			case READ:
			case NAME:
			case INT:
			case FLOAT:
			case INCDEC:
			case NEGATE:
			case NOT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				((Statement_listContext)_localctx).curr = statement();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATEMENT_DELIM) {
					{
					setState(104);
					match(STATEMENT_DELIM);
					setState(105);
					((Statement_listContext)_localctx).next = statement_list();
					}
				}

				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ListContext extends ParserRuleContext {
		public List_itemContext curr;
		public ListContext next;
		public List_itemContext list_item() {
			return getRuleContext(List_itemContext.class,0);
		}
		public TerminalNode LISTSEPARATOR() { return getToken(bcParser.LISTSEPARATOR, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			((ListContext)_localctx).curr = list_item();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LISTSEPARATOR) {
				{
				setState(112);
				match(LISTSEPARATOR);
				setState(113);
				((ListContext)_localctx).next = list();
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

	public static class List_itemContext extends ParserRuleContext {
		public ExprContext item;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(bcParser.STRING, 0); }
		public List_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterList_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitList_item(this);
		}
	}

	public final List_itemContext list_item() throws RecognitionException {
		List_itemContext _localctx = new List_itemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list_item);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case FUNCT:
			case READ:
			case NAME:
			case INT:
			case FLOAT:
			case INCDEC:
			case NEGATE:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				((List_itemContext)_localctx).item = expr(0);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(STRING);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext a;
		public Token varid;
		public Token op;
		public ExprContext b;
		public Token funct;
		public ExprContext arg;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INCDEC() { return getToken(bcParser.INCDEC, 0); }
		public TerminalNode NAME() { return getToken(bcParser.NAME, 0); }
		public TerminalNode NEGATE() { return getToken(bcParser.NEGATE, 0); }
		public TerminalNode PASSIGN() { return getToken(bcParser.PASSIGN, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(bcParser.ASSIGNMENT, 0); }
		public TerminalNode NOT() { return getToken(bcParser.NOT, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode FUNCT() { return getToken(bcParser.FUNCT, 0); }
		public TerminalNode READ() { return getToken(bcParser.READ, 0); }
		public TerminalNode POW() { return getToken(bcParser.POW, 0); }
		public TerminalNode MULTIPLICATIVE() { return getToken(bcParser.MULTIPLICATIVE, 0); }
		public TerminalNode ADDITIVE() { return getToken(bcParser.ADDITIVE, 0); }
		public TerminalNode RELATIONAL() { return getToken(bcParser.RELATIONAL, 0); }
		public TerminalNode AND() { return getToken(bcParser.AND, 0); }
		public TerminalNode OR() { return getToken(bcParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(121);
				match(T__6);
				setState(122);
				expr(0);
				setState(123);
				match(T__7);
				}
				break;
			case 2:
				{
				setState(125);
				match(INCDEC);
				setState(126);
				((ExprContext)_localctx).varid = match(NAME);
				}
				break;
			case 3:
				{
				setState(127);
				((ExprContext)_localctx).varid = match(NAME);
				setState(128);
				((ExprContext)_localctx).op = match(INCDEC);
				}
				break;
			case 4:
				{
				setState(129);
				((ExprContext)_localctx).op = match(NEGATE);
				setState(130);
				((ExprContext)_localctx).a = expr(15);
				}
				break;
			case 5:
				{
				setState(131);
				((ExprContext)_localctx).varid = match(NAME);
				setState(132);
				((ExprContext)_localctx).op = match(PASSIGN);
				setState(133);
				((ExprContext)_localctx).b = expr(11);
				}
				break;
			case 6:
				{
				setState(134);
				((ExprContext)_localctx).varid = match(NAME);
				setState(135);
				((ExprContext)_localctx).op = match(ASSIGNMENT);
				setState(136);
				((ExprContext)_localctx).b = expr(10);
				}
				break;
			case 7:
				{
				setState(137);
				((ExprContext)_localctx).op = match(NOT);
				setState(138);
				((ExprContext)_localctx).a = expr(8);
				}
				break;
			case 8:
				{
				setState(139);
				number();
				}
				break;
			case 9:
				{
				setState(140);
				((ExprContext)_localctx).varid = match(NAME);
				}
				break;
			case 10:
				{
				setState(141);
				((ExprContext)_localctx).funct = match(FUNCT);
				setState(142);
				match(T__6);
				setState(143);
				((ExprContext)_localctx).arg = expr(0);
				setState(144);
				match(T__7);
				}
				break;
			case 11:
				{
				setState(146);
				((ExprContext)_localctx).funct = match(NAME);
				setState(147);
				match(T__6);
				setState(148);
				((ExprContext)_localctx).arg = expr(0);
				setState(149);
				match(T__7);
				}
				break;
			case 12:
				{
				setState(151);
				match(READ);
				setState(152);
				match(T__6);
				setState(153);
				match(T__7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(174);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(157);
						((ExprContext)_localctx).op = match(POW);
						setState(158);
						((ExprContext)_localctx).b = expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(160);
						((ExprContext)_localctx).op = match(MULTIPLICATIVE);
						setState(161);
						((ExprContext)_localctx).b = expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(163);
						((ExprContext)_localctx).op = match(ADDITIVE);
						setState(164);
						((ExprContext)_localctx).b = expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(166);
						((ExprContext)_localctx).op = match(RELATIONAL);
						setState(167);
						((ExprContext)_localctx).b = expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(169);
						((ExprContext)_localctx).op = match(AND);
						setState(170);
						((ExprContext)_localctx).b = expr(8);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(172);
						((ExprContext)_localctx).op = match(OR);
						setState(173);
						((ExprContext)_localctx).b = expr(7);
						}
						break;
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(bcParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(bcParser.FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
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
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\6\2\30\n\2\r\2\16\2\31\3\2\7\2\35\n\2\f\2\16\2 \13\2\5\2\"\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3\3\3\3\3\3\3\3\5\3V\n"+
		"\3\3\3\3\3\3\3\5\3[\n\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3\4\5\4e\n\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\5\6m\n\6\3\6\5\6p\n\6\3\7\3\7\3\7\5\7u\n\7\3\b\3"+
		"\b\5\by\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u009d\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00b1\n\t\f\t\16\t\u00b4\13\t\3\n\3\n\3\n"+
		"\2\3\20\13\2\4\6\b\n\f\16\20\22\2\4\4\2\3\3  \3\2\36\37\2\u00d8\2!\3\2"+
		"\2\2\4_\3\2\2\2\6a\3\2\2\2\bf\3\2\2\2\no\3\2\2\2\fq\3\2\2\2\16x\3\2\2"+
		"\2\20\u009c\3\2\2\2\22\u00b5\3\2\2\2\24\"\7\2\2\3\25\36\5\4\3\2\26\30"+
		"\t\2\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\33"+
		"\3\2\2\2\33\35\5\4\3\2\34\27\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3"+
		"\2\2\2\37\"\3\2\2\2 \36\3\2\2\2!\24\3\2\2\2!\25\3\2\2\2\"\3\3\2\2\2#`"+
		"\7\4\2\2$`\5\20\t\2%`\7.\2\2&\'\7\5\2\2\'(\5\n\6\2()\7\6\2\2)`\3\2\2\2"+
		"*+\7\7\2\2+`\5\f\7\2,-\7\b\2\2-.\7\t\2\2./\5\20\t\2/\60\7\n\2\2\60\63"+
		"\5\4\3\2\61\62\7\13\2\2\62\64\5\4\3\2\63\61\3\2\2\2\63\64\3\2\2\2\64`"+
		"\3\2\2\2\65\66\7\f\2\2\66\67\7\t\2\2\678\5\20\t\289\7\n\2\29:\5\4\3\2"+
		":`\3\2\2\2;<\7\r\2\2<=\7\t\2\2=>\5\20\t\2>?\7\3\2\2?@\5\20\t\2@A\7\3\2"+
		"\2AB\5\20\t\2BC\7\n\2\2CD\5\4\3\2D`\3\2\2\2E`\7\16\2\2F`\7\17\2\2G`\7"+
		"\20\2\2H`\7\21\2\2IO\7\21\2\2JK\7\t\2\2KL\5\20\t\2LM\7\n\2\2MP\3\2\2\2"+
		"NP\5\20\t\2OJ\3\2\2\2ON\3\2\2\2P`\3\2\2\2QR\7\22\2\2RS\7\35\2\2SU\7\t"+
		"\2\2TV\5\6\4\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\n\2\2XZ\7\5\2\2Y[\5\b"+
		"\5\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\5\n\6\2]^\7\6\2\2^`\3\2\2\2_#\3"+
		"\2\2\2_$\3\2\2\2_%\3\2\2\2_&\3\2\2\2_*\3\2\2\2_,\3\2\2\2_\65\3\2\2\2_"+
		";\3\2\2\2_E\3\2\2\2_F\3\2\2\2_G\3\2\2\2_H\3\2\2\2_I\3\2\2\2_Q\3\2\2\2"+
		"`\5\3\2\2\2ad\7\35\2\2bc\7\24\2\2ce\5\6\4\2db\3\2\2\2de\3\2\2\2e\7\3\2"+
		"\2\2fg\7\23\2\2gh\5\6\4\2h\t\3\2\2\2il\5\4\3\2jk\7\25\2\2km\5\n\6\2lj"+
		"\3\2\2\2lm\3\2\2\2mp\3\2\2\2np\3\2\2\2oi\3\2\2\2on\3\2\2\2p\13\3\2\2\2"+
		"qt\5\16\b\2rs\7\24\2\2su\5\f\7\2tr\3\2\2\2tu\3\2\2\2u\r\3\2\2\2vy\5\20"+
		"\t\2wy\7.\2\2xv\3\2\2\2xw\3\2\2\2y\17\3\2\2\2z{\b\t\1\2{|\7\t\2\2|}\5"+
		"\20\t\2}~\7\n\2\2~\u009d\3\2\2\2\177\u0080\7#\2\2\u0080\u009d\7\35\2\2"+
		"\u0081\u0082\7\35\2\2\u0082\u009d\7#\2\2\u0083\u0084\7%\2\2\u0084\u009d"+
		"\5\20\t\21\u0085\u0086\7\35\2\2\u0086\u0087\7,\2\2\u0087\u009d\5\20\t"+
		"\r\u0088\u0089\7\35\2\2\u0089\u008a\7-\2\2\u008a\u009d\5\20\t\f\u008b"+
		"\u008c\7+\2\2\u008c\u009d\5\20\t\n\u008d\u009d\5\22\n\2\u008e\u009d\7"+
		"\35\2\2\u008f\u0090\7\26\2\2\u0090\u0091\7\t\2\2\u0091\u0092\5\20\t\2"+
		"\u0092\u0093\7\n\2\2\u0093\u009d\3\2\2\2\u0094\u0095\7\35\2\2\u0095\u0096"+
		"\7\t\2\2\u0096\u0097\5\20\t\2\u0097\u0098\7\n\2\2\u0098\u009d\3\2\2\2"+
		"\u0099\u009a\7\27\2\2\u009a\u009b\7\t\2\2\u009b\u009d\7\n\2\2\u009cz\3"+
		"\2\2\2\u009c\177\3\2\2\2\u009c\u0081\3\2\2\2\u009c\u0083\3\2\2\2\u009c"+
		"\u0085\3\2\2\2\u009c\u0088\3\2\2\2\u009c\u008b\3\2\2\2\u009c\u008d\3\2"+
		"\2\2\u009c\u008e\3\2\2\2\u009c\u008f\3\2\2\2\u009c\u0094\3\2\2\2\u009c"+
		"\u0099\3\2\2\2\u009d\u00b2\3\2\2\2\u009e\u009f\f\20\2\2\u009f\u00a0\7"+
		"\'\2\2\u00a0\u00b1\5\20\t\20\u00a1\u00a2\f\17\2\2\u00a2\u00a3\7$\2\2\u00a3"+
		"\u00b1\5\20\t\20\u00a4\u00a5\f\16\2\2\u00a5\u00a6\7&\2\2\u00a6\u00b1\5"+
		"\20\t\17\u00a7\u00a8\f\13\2\2\u00a8\u00a9\7(\2\2\u00a9\u00b1\5\20\t\f"+
		"\u00aa\u00ab\f\t\2\2\u00ab\u00ac\7)\2\2\u00ac\u00b1\5\20\t\n\u00ad\u00ae"+
		"\f\b\2\2\u00ae\u00af\7*\2\2\u00af\u00b1\5\20\t\t\u00b0\u009e\3\2\2\2\u00b0"+
		"\u00a1\3\2\2\2\u00b0\u00a4\3\2\2\2\u00b0\u00a7\3\2\2\2\u00b0\u00aa\3\2"+
		"\2\2\u00b0\u00ad\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\21\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\t\3\2"+
		"\2\u00b6\23\3\2\2\2\22\31\36!\63OUZ_dlotx\u009c\u00b0\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}