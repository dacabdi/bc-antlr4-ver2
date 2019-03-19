// Generated from /home/frogmedia/repos/bc-antlr4-ver2/grammar/bc.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		RULE_program = 0, RULE_statement_feed_list = 1, RULE_statement_feed = 2, 
		RULE_statement = 3, RULE_names_list = 4, RULE_auto_list = 5, RULE_statement_list = 6, 
		RULE_list = 7, RULE_list_item = 8, RULE_expr = 9, RULE_number = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement_feed_list", "statement_feed", "statement", "names_list", 
			"auto_list", "statement_list", "list", "list_item", "expr", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'quit'", "'{'", "'}'", "'print'", "'if'", "'('", "')'", "'else'", 
			"'while'", "'for'", "';'", "'break'", "'continue'", "'halt'", "'return'", 
			"'define'", "'auto'", "','", null, null, "'read'", "'sqrt'", "'s'", "'c'", 
			"'l'", "'e'", null, null, null, "'\n'", null, null, null, null, "'-'", 
			null, "'^'", null, "'&&'", "'||'", "'!'", null, "'='", null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "LISTSEPARATOR", "STATEMENT_DELIM", 
			"FUNCT", "READ", "SQRT", "SINE", "COSI", "NLOG", "EXPE", "NAME", "INT", 
			"FLOAT", "NEWLINE", "COMMENT", "WS", "INCDEC", "MULTIPLICATIVE", "NEGATE", 
			"ADDITIVE", "POW", "RELATIONAL", "AND", "OR", "NOT", "PASSIGN", "ASSIGNMENT", 
			"STRING", "STRINGDELIMITER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
		public Statement_feed_listContext statement_feed_list() {
			return getRuleContext(Statement_feed_listContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				statement_feed_list();
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

	public static class Statement_feed_listContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(bcParser.EOF, 0); }
		public List<Statement_feedContext> statement_feed() {
			return getRuleContexts(Statement_feedContext.class);
		}
		public Statement_feedContext statement_feed(int i) {
			return getRuleContext(Statement_feedContext.class,i);
		}
		public Statement_feed_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_feed_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterStatement_feed_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitStatement_feed_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitStatement_feed_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_feed_listContext statement_feed_list() throws RecognitionException {
		Statement_feed_listContext _localctx = new Statement_feed_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement_feed_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << STATEMENT_DELIM) | (1L << FUNCT) | (1L << READ) | (1L << NAME) | (1L << INT) | (1L << FLOAT) | (1L << INCDEC) | (1L << NEGATE) | (1L << NOT) | (1L << STRING))) != 0)) {
				{
				{
				setState(26);
				statement_feed();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_feedContext extends ParserRuleContext {
		public StatementContext s;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> STATEMENT_DELIM() { return getTokens(bcParser.STATEMENT_DELIM); }
		public TerminalNode STATEMENT_DELIM(int i) {
			return getToken(bcParser.STATEMENT_DELIM, i);
		}
		public Statement_feedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_feed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterStatement_feed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitStatement_feed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitStatement_feed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_feedContext statement_feed() throws RecognitionException {
		Statement_feedContext _localctx = new Statement_feedContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement_feed);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			((Statement_feedContext)_localctx).s = statement();
			setState(36); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(35);
					match(STATEMENT_DELIM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(38); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				match(T__1);
				setState(44);
				statement_list();
				setState(45);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				match(T__3);
				setState(48);
				list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				match(T__4);
				setState(50);
				match(T__5);
				setState(51);
				expr(0);
				setState(52);
				match(T__6);
				setState(53);
				statement();
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(54);
					match(T__7);
					setState(55);
					statement();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				match(T__8);
				setState(59);
				match(T__5);
				setState(60);
				expr(0);
				setState(61);
				match(T__6);
				setState(62);
				statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(64);
				match(T__9);
				setState(65);
				match(T__5);
				setState(66);
				expr(0);
				setState(67);
				match(T__10);
				setState(68);
				expr(0);
				setState(69);
				match(T__10);
				setState(70);
				expr(0);
				setState(71);
				match(T__6);
				setState(72);
				statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
				match(T__11);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(75);
				match(T__12);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(76);
				match(T__13);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(77);
				match(T__14);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(78);
				match(T__14);
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(79);
					match(T__5);
					setState(80);
					expr(0);
					setState(81);
					match(T__6);
					}
					break;
				case 2:
					{
					setState(83);
					expr(0);
					}
					break;
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(86);
				match(T__15);
				setState(87);
				match(NAME);
				setState(88);
				match(T__5);
				setState(89);
				names_list();
				setState(90);
				match(T__6);
				setState(91);
				match(T__1);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(92);
					auto_list();
					}
				}

				setState(95);
				statement_list();
				setState(96);
				match(T__2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitNames_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Names_listContext names_list() throws RecognitionException {
		Names_listContext _localctx = new Names_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_names_list);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				((Names_listContext)_localctx).curr = match(NAME);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LISTSEPARATOR) {
					{
					setState(102);
					match(LISTSEPARATOR);
					setState(103);
					((Names_listContext)_localctx).next = names_list();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitAuto_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Auto_listContext auto_list() throws RecognitionException {
		Auto_listContext _localctx = new Auto_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_auto_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__16);
			setState(110);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitStatement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement_list);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				((Statement_listContext)_localctx).curr = statement();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATEMENT_DELIM) {
					{
					setState(113);
					match(STATEMENT_DELIM);
					setState(114);
					((Statement_listContext)_localctx).next = statement_list();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
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
				setState(120);
				((ListContext)_localctx).curr = list_item();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LISTSEPARATOR) {
					{
					setState(121);
					match(LISTSEPARATOR);
					setState(122);
					((ListContext)_localctx).next = list();
					}
				}

				}
				break;
			case T__2:
			case T__7:
			case STATEMENT_DELIM:
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitList_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_itemContext list_item() throws RecognitionException {
		List_itemContext _localctx = new List_itemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_list_item);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
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
				setState(128);
				((List_itemContext)_localctx).item = expr(0);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(133);
				match(T__5);
				setState(134);
				expr(0);
				setState(135);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(137);
				match(INCDEC);
				setState(138);
				((ExprContext)_localctx).varid = match(NAME);
				}
				break;
			case 3:
				{
				setState(139);
				((ExprContext)_localctx).varid = match(NAME);
				setState(140);
				((ExprContext)_localctx).op = match(INCDEC);
				}
				break;
			case 4:
				{
				setState(141);
				((ExprContext)_localctx).op = match(NEGATE);
				setState(142);
				((ExprContext)_localctx).a = expr(15);
				}
				break;
			case 5:
				{
				setState(143);
				((ExprContext)_localctx).varid = match(NAME);
				setState(144);
				((ExprContext)_localctx).op = match(PASSIGN);
				setState(145);
				((ExprContext)_localctx).b = expr(11);
				}
				break;
			case 6:
				{
				setState(146);
				((ExprContext)_localctx).varid = match(NAME);
				setState(147);
				((ExprContext)_localctx).op = match(ASSIGNMENT);
				setState(148);
				((ExprContext)_localctx).b = expr(10);
				}
				break;
			case 7:
				{
				setState(149);
				((ExprContext)_localctx).op = match(NOT);
				setState(150);
				((ExprContext)_localctx).a = expr(8);
				}
				break;
			case 8:
				{
				setState(151);
				number();
				}
				break;
			case 9:
				{
				setState(152);
				((ExprContext)_localctx).varid = match(NAME);
				}
				break;
			case 10:
				{
				setState(153);
				((ExprContext)_localctx).funct = match(FUNCT);
				setState(154);
				match(T__5);
				setState(155);
				((ExprContext)_localctx).arg = expr(0);
				setState(156);
				match(T__6);
				}
				break;
			case 11:
				{
				setState(158);
				((ExprContext)_localctx).funct = match(NAME);
				setState(159);
				match(T__5);
				setState(160);
				((ExprContext)_localctx).arg = expr(0);
				setState(161);
				match(T__6);
				}
				break;
			case 12:
				{
				setState(163);
				match(READ);
				setState(164);
				match(T__5);
				setState(165);
				match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(169);
						((ExprContext)_localctx).op = match(POW);
						setState(170);
						((ExprContext)_localctx).b = expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(172);
						((ExprContext)_localctx).op = match(MULTIPLICATIVE);
						setState(173);
						((ExprContext)_localctx).b = expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(175);
						((ExprContext)_localctx).op = match(ADDITIVE);
						setState(176);
						((ExprContext)_localctx).b = expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(178);
						((ExprContext)_localctx).op = match(RELATIONAL);
						setState(179);
						((ExprContext)_localctx).b = expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(181);
						((ExprContext)_localctx).op = match(AND);
						setState(182);
						((ExprContext)_localctx).b = expr(8);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(184);
						((ExprContext)_localctx).op = match(OR);
						setState(185);
						((ExprContext)_localctx).b = expr(7);
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
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
		case 9:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00c4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\5\2\33\n\2\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3\3\3"+
		"\4\3\4\6\4\'\n\4\r\4\16\4(\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5;\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5W"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3\5\3\5\3\5\3\5\5\5f\n\5\3\6"+
		"\3\6\3\6\5\6k\n\6\3\6\5\6n\n\6\3\7\3\7\3\7\3\b\3\b\3\b\5\bv\n\b\3\b\5"+
		"\by\n\b\3\t\3\t\3\t\5\t~\n\t\3\t\5\t\u0081\n\t\3\n\3\n\5\n\u0085\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a9\n\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00bd\n\13\f\13\16\13\u00c0\13\13\3\f\3\f\3\f\2\3\24\r\2\4\6\b\n\f\16"+
		"\20\22\24\26\2\3\3\2\36\37\2\u00e4\2\32\3\2\2\2\4\37\3\2\2\2\6$\3\2\2"+
		"\2\be\3\2\2\2\nm\3\2\2\2\fo\3\2\2\2\16x\3\2\2\2\20\u0080\3\2\2\2\22\u0084"+
		"\3\2\2\2\24\u00a8\3\2\2\2\26\u00c1\3\2\2\2\30\33\3\2\2\2\31\33\5\4\3\2"+
		"\32\30\3\2\2\2\32\31\3\2\2\2\33\3\3\2\2\2\34\36\5\6\4\2\35\34\3\2\2\2"+
		"\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\2\2"+
		"\3#\5\3\2\2\2$&\5\b\5\2%\'\7\25\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3"+
		"\2\2\2)\7\3\2\2\2*f\7\3\2\2+f\5\24\13\2,f\7.\2\2-.\7\4\2\2./\5\16\b\2"+
		"/\60\7\5\2\2\60f\3\2\2\2\61\62\7\6\2\2\62f\5\20\t\2\63\64\7\7\2\2\64\65"+
		"\7\b\2\2\65\66\5\24\13\2\66\67\7\t\2\2\67:\5\b\5\289\7\n\2\29;\5\b\5\2"+
		":8\3\2\2\2:;\3\2\2\2;f\3\2\2\2<=\7\13\2\2=>\7\b\2\2>?\5\24\13\2?@\7\t"+
		"\2\2@A\5\b\5\2Af\3\2\2\2BC\7\f\2\2CD\7\b\2\2DE\5\24\13\2EF\7\r\2\2FG\5"+
		"\24\13\2GH\7\r\2\2HI\5\24\13\2IJ\7\t\2\2JK\5\b\5\2Kf\3\2\2\2Lf\7\16\2"+
		"\2Mf\7\17\2\2Nf\7\20\2\2Of\7\21\2\2PV\7\21\2\2QR\7\b\2\2RS\5\24\13\2S"+
		"T\7\t\2\2TW\3\2\2\2UW\5\24\13\2VQ\3\2\2\2VU\3\2\2\2Wf\3\2\2\2XY\7\22\2"+
		"\2YZ\7\35\2\2Z[\7\b\2\2[\\\5\n\6\2\\]\7\t\2\2]_\7\4\2\2^`\5\f\7\2_^\3"+
		"\2\2\2_`\3\2\2\2`a\3\2\2\2ab\5\16\b\2bc\7\5\2\2cf\3\2\2\2df\3\2\2\2e*"+
		"\3\2\2\2e+\3\2\2\2e,\3\2\2\2e-\3\2\2\2e\61\3\2\2\2e\63\3\2\2\2e<\3\2\2"+
		"\2eB\3\2\2\2eL\3\2\2\2eM\3\2\2\2eN\3\2\2\2eO\3\2\2\2eP\3\2\2\2eX\3\2\2"+
		"\2ed\3\2\2\2f\t\3\2\2\2gj\7\35\2\2hi\7\24\2\2ik\5\n\6\2jh\3\2\2\2jk\3"+
		"\2\2\2kn\3\2\2\2ln\3\2\2\2mg\3\2\2\2ml\3\2\2\2n\13\3\2\2\2op\7\23\2\2"+
		"pq\5\n\6\2q\r\3\2\2\2ru\5\b\5\2st\7\25\2\2tv\5\16\b\2us\3\2\2\2uv\3\2"+
		"\2\2vy\3\2\2\2wy\3\2\2\2xr\3\2\2\2xw\3\2\2\2y\17\3\2\2\2z}\5\22\n\2{|"+
		"\7\24\2\2|~\5\20\t\2}{\3\2\2\2}~\3\2\2\2~\u0081\3\2\2\2\177\u0081\3\2"+
		"\2\2\u0080z\3\2\2\2\u0080\177\3\2\2\2\u0081\21\3\2\2\2\u0082\u0085\5\24"+
		"\13\2\u0083\u0085\7.\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\23\3\2\2\2\u0086\u0087\b\13\1\2\u0087\u0088\7\b\2\2\u0088\u0089\5\24"+
		"\13\2\u0089\u008a\7\t\2\2\u008a\u00a9\3\2\2\2\u008b\u008c\7#\2\2\u008c"+
		"\u00a9\7\35\2\2\u008d\u008e\7\35\2\2\u008e\u00a9\7#\2\2\u008f\u0090\7"+
		"%\2\2\u0090\u00a9\5\24\13\21\u0091\u0092\7\35\2\2\u0092\u0093\7,\2\2\u0093"+
		"\u00a9\5\24\13\r\u0094\u0095\7\35\2\2\u0095\u0096\7-\2\2\u0096\u00a9\5"+
		"\24\13\f\u0097\u0098\7+\2\2\u0098\u00a9\5\24\13\n\u0099\u00a9\5\26\f\2"+
		"\u009a\u00a9\7\35\2\2\u009b\u009c\7\26\2\2\u009c\u009d\7\b\2\2\u009d\u009e"+
		"\5\24\13\2\u009e\u009f\7\t\2\2\u009f\u00a9\3\2\2\2\u00a0\u00a1\7\35\2"+
		"\2\u00a1\u00a2\7\b\2\2\u00a2\u00a3\5\24\13\2\u00a3\u00a4\7\t\2\2\u00a4"+
		"\u00a9\3\2\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00a7\7\b\2\2\u00a7\u00a9\7"+
		"\t\2\2\u00a8\u0086\3\2\2\2\u00a8\u008b\3\2\2\2\u00a8\u008d\3\2\2\2\u00a8"+
		"\u008f\3\2\2\2\u00a8\u0091\3\2\2\2\u00a8\u0094\3\2\2\2\u00a8\u0097\3\2"+
		"\2\2\u00a8\u0099\3\2\2\2\u00a8\u009a\3\2\2\2\u00a8\u009b\3\2\2\2\u00a8"+
		"\u00a0\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a9\u00be\3\2\2\2\u00aa\u00ab\f\20"+
		"\2\2\u00ab\u00ac\7\'\2\2\u00ac\u00bd\5\24\13\20\u00ad\u00ae\f\17\2\2\u00ae"+
		"\u00af\7$\2\2\u00af\u00bd\5\24\13\20\u00b0\u00b1\f\16\2\2\u00b1\u00b2"+
		"\7&\2\2\u00b2\u00bd\5\24\13\17\u00b3\u00b4\f\13\2\2\u00b4\u00b5\7(\2\2"+
		"\u00b5\u00bd\5\24\13\f\u00b6\u00b7\f\t\2\2\u00b7\u00b8\7)\2\2\u00b8\u00bd"+
		"\5\24\13\n\u00b9\u00ba\f\b\2\2\u00ba\u00bb\7*\2\2\u00bb\u00bd\5\24\13"+
		"\t\u00bc\u00aa\3\2\2\2\u00bc\u00ad\3\2\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b3"+
		"\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\25\3\2\2\2\u00c0\u00be\3\2\2"+
		"\2\u00c1\u00c2\t\2\2\2\u00c2\27\3\2\2\2\23\32\37(:V_ejmux}\u0080\u0084"+
		"\u00a8\u00bc\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}