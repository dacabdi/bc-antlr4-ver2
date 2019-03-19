// Generated from /home/frogmedia/repos/bc-antlr4-ver2/grammar/bc.g4 by ANTLR 4.7.2
package bc;
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
		RULE_program = 0, RULE_statement = 1, RULE_names_list = 2, RULE_auto_list = 3, 
		RULE_statement_list = 4, RULE_list = 5, RULE_list_item = 6, RULE_expr = 7, 
		RULE_number = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "names_list", "auto_list", "statement_list", 
			"list", "list_item", "expr", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'quit'", "'{'", "'}'", "'print'", "'if'", "'('", "')'", 
			"'else'", "'while'", "'for'", "'break'", "'continue'", "'halt'", "'return'", 
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(bcParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(bcParser.NEWLINE, i);
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
		int _la;
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__0:
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
			case NEWLINE:
			case INCDEC:
			case NEGATE:
			case NOT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				statement();
				setState(22); 
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
					setState(21);
					statement();
					}
					}
					setState(24); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 || _la==NEWLINE );
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				match(T__2);
				setState(32);
				statement_list();
				setState(33);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(35);
				match(T__4);
				setState(36);
				list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(37);
				match(T__5);
				setState(38);
				match(T__6);
				setState(39);
				expr(0);
				setState(40);
				match(T__7);
				setState(41);
				statement();
				setState(44);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(42);
					match(T__8);
					setState(43);
					statement();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				match(T__9);
				setState(47);
				match(T__6);
				setState(48);
				expr(0);
				setState(49);
				match(T__7);
				setState(50);
				statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(52);
				match(T__10);
				setState(53);
				match(T__6);
				setState(54);
				expr(0);
				setState(55);
				match(T__0);
				setState(56);
				expr(0);
				setState(57);
				match(T__0);
				setState(58);
				expr(0);
				setState(59);
				match(T__7);
				setState(60);
				statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(62);
				match(T__11);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(63);
				match(T__12);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(64);
				match(T__13);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(65);
				match(T__14);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(66);
				match(T__14);
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(67);
					match(T__6);
					setState(68);
					expr(0);
					setState(69);
					match(T__7);
					}
					break;
				case 2:
					{
					setState(71);
					expr(0);
					}
					break;
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(74);
				match(T__15);
				setState(75);
				match(NAME);
				setState(76);
				match(T__6);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(77);
					names_list();
					}
				}

				setState(80);
				match(T__7);
				setState(81);
				match(T__2);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(82);
					auto_list();
					}
				}

				setState(85);
				statement_list();
				setState(86);
				match(T__3);
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
		enterRule(_localctx, 4, RULE_names_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((Names_listContext)_localctx).curr = match(NAME);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LISTSEPARATOR) {
				{
				setState(92);
				match(LISTSEPARATOR);
				setState(93);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitAuto_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Auto_listContext auto_list() throws RecognitionException {
		Auto_listContext _localctx = new Auto_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_auto_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__16);
			setState(97);
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
		enterRule(_localctx, 8, RULE_statement_list);
		int _la;
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				((Statement_listContext)_localctx).curr = statement();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATEMENT_DELIM) {
					{
					setState(100);
					match(STATEMENT_DELIM);
					setState(101);
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
		enterRule(_localctx, 10, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			((ListContext)_localctx).curr = list_item();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LISTSEPARATOR) {
				{
				setState(108);
				match(LISTSEPARATOR);
				setState(109);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitList_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_itemContext list_item() throws RecognitionException {
		List_itemContext _localctx = new List_itemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list_item);
		try {
			setState(114);
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
				setState(112);
				((List_itemContext)_localctx).item = expr(0);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(117);
				match(T__6);
				setState(118);
				expr(0);
				setState(119);
				match(T__7);
				}
				break;
			case 2:
				{
				setState(121);
				match(INCDEC);
				setState(122);
				((ExprContext)_localctx).varid = match(NAME);
				}
				break;
			case 3:
				{
				setState(123);
				((ExprContext)_localctx).varid = match(NAME);
				setState(124);
				((ExprContext)_localctx).op = match(INCDEC);
				}
				break;
			case 4:
				{
				setState(125);
				((ExprContext)_localctx).op = match(NEGATE);
				setState(126);
				((ExprContext)_localctx).a = expr(15);
				}
				break;
			case 5:
				{
				setState(127);
				((ExprContext)_localctx).varid = match(NAME);
				setState(128);
				((ExprContext)_localctx).op = match(PASSIGN);
				setState(129);
				((ExprContext)_localctx).b = expr(11);
				}
				break;
			case 6:
				{
				setState(130);
				((ExprContext)_localctx).varid = match(NAME);
				setState(131);
				((ExprContext)_localctx).op = match(ASSIGNMENT);
				setState(132);
				((ExprContext)_localctx).b = expr(10);
				}
				break;
			case 7:
				{
				setState(133);
				((ExprContext)_localctx).op = match(NOT);
				setState(134);
				((ExprContext)_localctx).a = expr(8);
				}
				break;
			case 8:
				{
				setState(135);
				number();
				}
				break;
			case 9:
				{
				setState(136);
				((ExprContext)_localctx).varid = match(NAME);
				}
				break;
			case 10:
				{
				setState(137);
				((ExprContext)_localctx).funct = match(FUNCT);
				setState(138);
				match(T__6);
				setState(139);
				((ExprContext)_localctx).arg = expr(0);
				setState(140);
				match(T__7);
				}
				break;
			case 11:
				{
				setState(142);
				((ExprContext)_localctx).funct = match(NAME);
				setState(143);
				match(T__6);
				setState(144);
				((ExprContext)_localctx).arg = expr(0);
				setState(145);
				match(T__7);
				}
				break;
			case 12:
				{
				setState(147);
				match(READ);
				setState(148);
				match(T__6);
				setState(149);
				match(T__7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(153);
						((ExprContext)_localctx).op = match(POW);
						setState(154);
						((ExprContext)_localctx).b = expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(156);
						((ExprContext)_localctx).op = match(MULTIPLICATIVE);
						setState(157);
						((ExprContext)_localctx).b = expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(159);
						((ExprContext)_localctx).op = match(ADDITIVE);
						setState(160);
						((ExprContext)_localctx).b = expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(162);
						((ExprContext)_localctx).op = match(RELATIONAL);
						setState(163);
						((ExprContext)_localctx).b = expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(165);
						((ExprContext)_localctx).op = match(AND);
						setState(166);
						((ExprContext)_localctx).b = expr(8);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(168);
						((ExprContext)_localctx).op = match(OR);
						setState(169);
						((ExprContext)_localctx).b = expr(7);
						}
						break;
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 16, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\6\2\31\n\2\r\2\16\2\32\5\2\35\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3K\n\3\3\3\3\3\3\3\3\3\5\3Q\n\3\3\3\3\3\3\3\5\3V\n\3\3\3"+
		"\3\3\3\3\3\3\5\3\\\n\3\3\4\3\4\3\4\5\4a\n\4\3\5\3\5\3\5\3\6\3\6\3\6\5"+
		"\6i\n\6\3\6\5\6l\n\6\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\5\bu\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0099\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u00ad\n\t\f\t\16\t\u00b0\13\t\3\n\3\n\3\n\2\3\20\13\2\4\6\b\n\f\16"+
		"\20\22\2\4\4\2\3\3  \3\2\36\37\2\u00d4\2\34\3\2\2\2\4[\3\2\2\2\6]\3\2"+
		"\2\2\bb\3\2\2\2\nk\3\2\2\2\fm\3\2\2\2\16t\3\2\2\2\20\u0098\3\2\2\2\22"+
		"\u00b1\3\2\2\2\24\35\3\2\2\2\25\30\5\4\3\2\26\27\t\2\2\2\27\31\5\4\3\2"+
		"\30\26\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2"+
		"\34\24\3\2\2\2\34\25\3\2\2\2\35\3\3\2\2\2\36\\\7\4\2\2\37\\\5\20\t\2 "+
		"\\\7.\2\2!\"\7\5\2\2\"#\5\n\6\2#$\7\6\2\2$\\\3\2\2\2%&\7\7\2\2&\\\5\f"+
		"\7\2\'(\7\b\2\2()\7\t\2\2)*\5\20\t\2*+\7\n\2\2+.\5\4\3\2,-\7\13\2\2-/"+
		"\5\4\3\2.,\3\2\2\2./\3\2\2\2/\\\3\2\2\2\60\61\7\f\2\2\61\62\7\t\2\2\62"+
		"\63\5\20\t\2\63\64\7\n\2\2\64\65\5\4\3\2\65\\\3\2\2\2\66\67\7\r\2\2\67"+
		"8\7\t\2\289\5\20\t\29:\7\3\2\2:;\5\20\t\2;<\7\3\2\2<=\5\20\t\2=>\7\n\2"+
		"\2>?\5\4\3\2?\\\3\2\2\2@\\\7\16\2\2A\\\7\17\2\2B\\\7\20\2\2C\\\7\21\2"+
		"\2DJ\7\21\2\2EF\7\t\2\2FG\5\20\t\2GH\7\n\2\2HK\3\2\2\2IK\5\20\t\2JE\3"+
		"\2\2\2JI\3\2\2\2K\\\3\2\2\2LM\7\22\2\2MN\7\35\2\2NP\7\t\2\2OQ\5\6\4\2"+
		"PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\n\2\2SU\7\5\2\2TV\5\b\5\2UT\3\2\2\2"+
		"UV\3\2\2\2VW\3\2\2\2WX\5\n\6\2XY\7\6\2\2Y\\\3\2\2\2Z\\\3\2\2\2[\36\3\2"+
		"\2\2[\37\3\2\2\2[ \3\2\2\2[!\3\2\2\2[%\3\2\2\2[\'\3\2\2\2[\60\3\2\2\2"+
		"[\66\3\2\2\2[@\3\2\2\2[A\3\2\2\2[B\3\2\2\2[C\3\2\2\2[D\3\2\2\2[L\3\2\2"+
		"\2[Z\3\2\2\2\\\5\3\2\2\2]`\7\35\2\2^_\7\24\2\2_a\5\6\4\2`^\3\2\2\2`a\3"+
		"\2\2\2a\7\3\2\2\2bc\7\23\2\2cd\5\6\4\2d\t\3\2\2\2eh\5\4\3\2fg\7\25\2\2"+
		"gi\5\n\6\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jl\3\2\2\2ke\3\2\2\2kj\3\2\2\2"+
		"l\13\3\2\2\2mp\5\16\b\2no\7\24\2\2oq\5\f\7\2pn\3\2\2\2pq\3\2\2\2q\r\3"+
		"\2\2\2ru\5\20\t\2su\7.\2\2tr\3\2\2\2ts\3\2\2\2u\17\3\2\2\2vw\b\t\1\2w"+
		"x\7\t\2\2xy\5\20\t\2yz\7\n\2\2z\u0099\3\2\2\2{|\7#\2\2|\u0099\7\35\2\2"+
		"}~\7\35\2\2~\u0099\7#\2\2\177\u0080\7%\2\2\u0080\u0099\5\20\t\21\u0081"+
		"\u0082\7\35\2\2\u0082\u0083\7,\2\2\u0083\u0099\5\20\t\r\u0084\u0085\7"+
		"\35\2\2\u0085\u0086\7-\2\2\u0086\u0099\5\20\t\f\u0087\u0088\7+\2\2\u0088"+
		"\u0099\5\20\t\n\u0089\u0099\5\22\n\2\u008a\u0099\7\35\2\2\u008b\u008c"+
		"\7\26\2\2\u008c\u008d\7\t\2\2\u008d\u008e\5\20\t\2\u008e\u008f\7\n\2\2"+
		"\u008f\u0099\3\2\2\2\u0090\u0091\7\35\2\2\u0091\u0092\7\t\2\2\u0092\u0093"+
		"\5\20\t\2\u0093\u0094\7\n\2\2\u0094\u0099\3\2\2\2\u0095\u0096\7\27\2\2"+
		"\u0096\u0097\7\t\2\2\u0097\u0099\7\n\2\2\u0098v\3\2\2\2\u0098{\3\2\2\2"+
		"\u0098}\3\2\2\2\u0098\177\3\2\2\2\u0098\u0081\3\2\2\2\u0098\u0084\3\2"+
		"\2\2\u0098\u0087\3\2\2\2\u0098\u0089\3\2\2\2\u0098\u008a\3\2\2\2\u0098"+
		"\u008b\3\2\2\2\u0098\u0090\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u00ae\3\2"+
		"\2\2\u009a\u009b\f\20\2\2\u009b\u009c\7\'\2\2\u009c\u00ad\5\20\t\20\u009d"+
		"\u009e\f\17\2\2\u009e\u009f\7$\2\2\u009f\u00ad\5\20\t\20\u00a0\u00a1\f"+
		"\16\2\2\u00a1\u00a2\7&\2\2\u00a2\u00ad\5\20\t\17\u00a3\u00a4\f\13\2\2"+
		"\u00a4\u00a5\7(\2\2\u00a5\u00ad\5\20\t\f\u00a6\u00a7\f\t\2\2\u00a7\u00a8"+
		"\7)\2\2\u00a8\u00ad\5\20\t\n\u00a9\u00aa\f\b\2\2\u00aa\u00ab\7*\2\2\u00ab"+
		"\u00ad\5\20\t\t\u00ac\u009a\3\2\2\2\u00ac\u009d\3\2\2\2\u00ac\u00a0\3"+
		"\2\2\2\u00ac\u00a3\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\21\3\2\2"+
		"\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\t\3\2\2\u00b2\23\3\2\2\2\21\32\34."+
		"JPU[`hkpt\u0098\u00ac\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}