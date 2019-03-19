// Generated from /home/frogmedia/repos/bc-antlr4-ver2/grammar/bc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bcLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"LISTSEPARATOR", "STATEMENT_DELIM", "FUNCT", "READ", "SQRT", "SINE", 
			"COSI", "NLOG", "EXPE", "NAME", "INT", "FLOAT", "NEWLINE", "COMMENT", 
			"WS", "INCDEC", "MULTIPLICATIVE", "NEGATE", "ADDITIVE", "POW", "RELATIONAL", 
			"AND", "OR", "NOT", "PASSIGN", "ASSIGNMENT", "STRING", "STRINGDELIMITER"
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


	public bcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "bc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u014d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\5\24\u00af\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00b7\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u00cc\n\34\r\34\16"+
		"\34\u00cd\3\34\7\34\u00d1\n\34\f\34\16\34\u00d4\13\34\3\34\3\34\6\34\u00d8"+
		"\n\34\r\34\16\34\u00d9\3\34\3\34\6\34\u00de\n\34\r\34\16\34\u00df\3\34"+
		"\7\34\u00e3\n\34\f\34\16\34\u00e6\13\34\5\34\u00e8\n\34\3\35\6\35\u00eb"+
		"\n\35\r\35\16\35\u00ec\3\36\7\36\u00f0\n\36\f\36\16\36\u00f3\13\36\3\36"+
		"\3\36\7\36\u00f7\n\36\f\36\16\36\u00fa\13\36\3\37\3\37\3 \3 \3 \3 \7 "+
		"\u0102\n \f \16 \u0105\13 \3 \3 \3 \3 \3 \3!\6!\u010d\n!\r!\16!\u010e"+
		"\3!\3!\3\"\3\"\3\"\3\"\5\"\u0117\n\"\3#\3#\3$\3$\3%\3%\5%\u011f\n%\3&"+
		"\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u012c\n\'\3(\3(\3(\3)\3)\3"+
		")\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u013f\n+\3,\3,\3-\3-\7-\u0145\n"+
		"-\f-\16-\u0148\13-\3-\3-\3.\3.\4\u0103\u0146\2/\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/\3\2\t\4\3\f\f==\3\2c|\5\2\62;aac|\3\2\62;\5\2\13\13\17\17"+
		"\"\"\5\2\'\',,\61\61\4\2>>@@\2\u0165\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\3]\3\2\2\2\5b\3\2\2\2\7d\3\2\2\2\tf\3\2\2\2\13l\3\2\2\2\ro\3"+
		"\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23x\3\2\2\2\25~\3\2\2\2\27\u0082\3\2\2"+
		"\2\31\u0084\3\2\2\2\33\u008a\3\2\2\2\35\u0093\3\2\2\2\37\u0098\3\2\2\2"+
		"!\u009f\3\2\2\2#\u00a6\3\2\2\2%\u00ab\3\2\2\2\'\u00ae\3\2\2\2)\u00b6\3"+
		"\2\2\2+\u00b8\3\2\2\2-\u00bd\3\2\2\2/\u00c2\3\2\2\2\61\u00c4\3\2\2\2\63"+
		"\u00c6\3\2\2\2\65\u00c8\3\2\2\2\67\u00e7\3\2\2\29\u00ea\3\2\2\2;\u00f1"+
		"\3\2\2\2=\u00fb\3\2\2\2?\u00fd\3\2\2\2A\u010c\3\2\2\2C\u0116\3\2\2\2E"+
		"\u0118\3\2\2\2G\u011a\3\2\2\2I\u011e\3\2\2\2K\u0120\3\2\2\2M\u012b\3\2"+
		"\2\2O\u012d\3\2\2\2Q\u0130\3\2\2\2S\u0133\3\2\2\2U\u013e\3\2\2\2W\u0140"+
		"\3\2\2\2Y\u0142\3\2\2\2[\u014b\3\2\2\2]^\7s\2\2^_\7w\2\2_`\7k\2\2`a\7"+
		"v\2\2a\4\3\2\2\2bc\7}\2\2c\6\3\2\2\2de\7\177\2\2e\b\3\2\2\2fg\7r\2\2g"+
		"h\7t\2\2hi\7k\2\2ij\7p\2\2jk\7v\2\2k\n\3\2\2\2lm\7k\2\2mn\7h\2\2n\f\3"+
		"\2\2\2op\7*\2\2p\16\3\2\2\2qr\7+\2\2r\20\3\2\2\2st\7g\2\2tu\7n\2\2uv\7"+
		"u\2\2vw\7g\2\2w\22\3\2\2\2xy\7y\2\2yz\7j\2\2z{\7k\2\2{|\7n\2\2|}\7g\2"+
		"\2}\24\3\2\2\2~\177\7h\2\2\177\u0080\7q\2\2\u0080\u0081\7t\2\2\u0081\26"+
		"\3\2\2\2\u0082\u0083\7=\2\2\u0083\30\3\2\2\2\u0084\u0085\7d\2\2\u0085"+
		"\u0086\7t\2\2\u0086\u0087\7g\2\2\u0087\u0088\7c\2\2\u0088\u0089\7m\2\2"+
		"\u0089\32\3\2\2\2\u008a\u008b\7e\2\2\u008b\u008c\7q\2\2\u008c\u008d\7"+
		"p\2\2\u008d\u008e\7v\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090\u0091"+
		"\7w\2\2\u0091\u0092\7g\2\2\u0092\34\3\2\2\2\u0093\u0094\7j\2\2\u0094\u0095"+
		"\7c\2\2\u0095\u0096\7n\2\2\u0096\u0097\7v\2\2\u0097\36\3\2\2\2\u0098\u0099"+
		"\7t\2\2\u0099\u009a\7g\2\2\u009a\u009b\7v\2\2\u009b\u009c\7w\2\2\u009c"+
		"\u009d\7t\2\2\u009d\u009e\7p\2\2\u009e \3\2\2\2\u009f\u00a0\7f\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7p\2\2"+
		"\u00a4\u00a5\7g\2\2\u00a5\"\3\2\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7w"+
		"\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7q\2\2\u00aa$\3\2\2\2\u00ab\u00ac"+
		"\7.\2\2\u00ac&\3\2\2\2\u00ad\u00af\t\2\2\2\u00ae\u00ad\3\2\2\2\u00af("+
		"\3\2\2\2\u00b0\u00b7\5+\26\2\u00b1\u00b7\5-\27\2\u00b2\u00b7\5/\30\2\u00b3"+
		"\u00b7\5\61\31\2\u00b4\u00b7\5\63\32\2\u00b5\u00b7\5\65\33\2\u00b6\u00b0"+
		"\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7*\3\2\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\u00ba\7g\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7f\2\2\u00bc,\3\2\2\2\u00bd"+
		"\u00be\7u\2\2\u00be\u00bf\7s\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7v\2\2"+
		"\u00c1.\3\2\2\2\u00c2\u00c3\7u\2\2\u00c3\60\3\2\2\2\u00c4\u00c5\7e\2\2"+
		"\u00c5\62\3\2\2\2\u00c6\u00c7\7n\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\7g\2"+
		"\2\u00c9\66\3\2\2\2\u00ca\u00cc\t\3\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d2\3\2\2\2\u00cf"+
		"\u00d1\t\4\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d7\7]\2\2\u00d6\u00d8\t\5\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00e8\7_\2\2\u00dc\u00de\t\3\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e4\3\2\2\2\u00e1"+
		"\u00e3\t\4\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00cb\3\2\2\2\u00e7\u00dd\3\2\2\2\u00e88\3\2\2\2\u00e9\u00eb\t\5\2\2"+
		"\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed:\3\2\2\2\u00ee\u00f0\t\5\2\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f8\7\60\2\2\u00f5\u00f7\t\5\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9<\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7\f\2\2\u00fc>\3\2"+
		"\2\2\u00fd\u00fe\7\61\2\2\u00fe\u00ff\7,\2\2\u00ff\u0103\3\2\2\2\u0100"+
		"\u0102\13\2\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0104\3"+
		"\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0107\7,\2\2\u0107\u0108\7\61\2\2\u0108\u0109\3\2\2\2\u0109\u010a\b "+
		"\2\2\u010a@\3\2\2\2\u010b\u010d\t\6\2\2\u010c\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\b!\2\2\u0111B\3\2\2\2\u0112\u0113\7-\2\2\u0113\u0117\7-\2\2\u0114"+
		"\u0115\7/\2\2\u0115\u0117\7/\2\2\u0116\u0112\3\2\2\2\u0116\u0114\3\2\2"+
		"\2\u0117D\3\2\2\2\u0118\u0119\t\7\2\2\u0119F\3\2\2\2\u011a\u011b\7/\2"+
		"\2\u011bH\3\2\2\2\u011c\u011f\7-\2\2\u011d\u011f\5G$\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011d\3\2\2\2\u011fJ\3\2\2\2\u0120\u0121\7`\2\2\u0121L\3\2"+
		"\2\2\u0122\u012c\t\b\2\2\u0123\u0124\7?\2\2\u0124\u012c\7?\2\2\u0125\u0126"+
		"\7>\2\2\u0126\u012c\7?\2\2\u0127\u0128\7@\2\2\u0128\u012c\7?\2\2\u0129"+
		"\u012a\7#\2\2\u012a\u012c\7?\2\2\u012b\u0122\3\2\2\2\u012b\u0123\3\2\2"+
		"\2\u012b\u0125\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u0129\3\2\2\2\u012cN"+
		"\3\2\2\2\u012d\u012e\7(\2\2\u012e\u012f\7(\2\2\u012fP\3\2\2\2\u0130\u0131"+
		"\7~\2\2\u0131\u0132\7~\2\2\u0132R\3\2\2\2\u0133\u0134\7#\2\2\u0134T\3"+
		"\2\2\2\u0135\u0136\5E#\2\u0136\u0137\7?\2\2\u0137\u013f\3\2\2\2\u0138"+
		"\u0139\5I%\2\u0139\u013a\7?\2\2\u013a\u013f\3\2\2\2\u013b\u013c\5K&\2"+
		"\u013c\u013d\7?\2\2\u013d\u013f\3\2\2\2\u013e\u0135\3\2\2\2\u013e\u0138"+
		"\3\2\2\2\u013e\u013b\3\2\2\2\u013fV\3\2\2\2\u0140\u0141\7?\2\2\u0141X"+
		"\3\2\2\2\u0142\u0146\5[.\2\u0143\u0145\13\2\2\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0149\u014a\5[.\2\u014aZ\3\2\2\2\u014b\u014c"+
		"\7$\2\2\u014c\\\3\2\2\2\25\2\u00ae\u00b6\u00cd\u00d2\u00d9\u00df\u00e4"+
		"\u00e7\u00ec\u00f1\u00f8\u0103\u010e\u0116\u011e\u012b\u013e\u0146\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}