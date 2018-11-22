package YARS;// Generated from YARS.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YARSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9,
			T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, BlankNode = 15, BLANK_NODE_LABEL = 16,
			Dec = 17, STRING_LITERAL_QUOTE = 18, ALNUM_PLUS = 19, CONTEXT = 20, PN_CHARS = 21,
			PN_CHARS_U = 22, UCHAR = 23, PN_CHARS_BASE = 24, HEX = 25, DECIMAL = 26, SP = 27,
			NL = 28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
			"T__9", "T__10", "T__11", "T__12", "T__13", "BlankNode", "BLANK_NODE_LABEL",
			"Dec", "STRING_LITERAL_QUOTE", "ALNUM_PLUS", "CONTEXT", "PN_CHARS", "PN_CHARS_U",
			"UCHAR", "PN_CHARS_BASE", "HEX", "DECIMAL", "SP", "NL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'{'", "','", "'}'", "'('", "')'", "'-'", "'['", "']'", "'->'", 
		"'value'", "'lang'", "'vocab'", "'datatype'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, "BlankNode", "BLANK_NODE_LABEL", "Dec", "STRING_LITERAL_QUOTE",
			"ALNUM_PLUS", "CONTEXT", "PN_CHARS", "PN_CHARS_U", "UCHAR", "PN_CHARS_BASE",
			"HEX", "DECIMAL", "SP", "NL"
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


	public YARSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "YARS.g4"; }

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
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00dd\b\1\4\2" +
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
					"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4" +
					"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3" +
					"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3" +
					"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3" +
					"\21\3\21\5\21r\n\21\3\21\3\21\7\21v\n\21\f\21\16\21y\13\21\3\21\5\21|" +
					"\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u0085\n\23\f\23\16\23\u0088" +
					"\13\23\3\23\3\23\3\24\3\24\3\24\7\24\u008f\n\24\f\24\16\24\u0092\13\24" +
					"\3\24\5\24\u0095\n\24\3\25\3\25\3\25\3\25\7\25\u009b\n\25\f\25\16\25\u009e" +
					"\13\25\3\25\3\25\3\26\3\26\5\26\u00a4\n\26\3\27\3\27\5\27\u00a8\n\27\3" +
					"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3" +
					"\30\3\30\3\30\3\30\3\30\3\30\5\30\u00be\n\30\3\31\3\31\3\32\5\32\u00c3" +
					"\n\32\3\33\5\33\u00c6\n\33\3\33\6\33\u00c9\n\33\r\33\16\33\u00ca\3\33" +
					"\3\33\6\33\u00cf\n\33\r\33\16\33\u00d0\5\33\u00d3\n\33\3\34\6\34\u00d6" +
					"\n\34\r\34\16\34\u00d7\3\34\3\34\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7" +
					"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25" +
					")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\n\3\2\62;\6\2\f\f\17" +
					"\17$$^^\b\2%%\'(\60\61<<BB^^\7\2//\62;\u00b9\u00b9\u0302\u0371\u2041\u2042" +
					"\20\2\62;C\\c|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001" +
					"\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff" +
					"\5\2\62;CHch\4\2\13\13\"\"\4\2\f\f\17\17\2\u00f1\2\3\3\2\2\2\2\5\3\2\2" +
					"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21" +
					"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2" +
					"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3" +
					"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3" +
					"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3" +
					"\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21I\3\2\2\2\23K\3" +
					"\2\2\2\25M\3\2\2\2\27P\3\2\2\2\31V\3\2\2\2\33[\3\2\2\2\35a\3\2\2\2\37" +
					"j\3\2\2\2!l\3\2\2\2#}\3\2\2\2%\177\3\2\2\2\'\u008b\3\2\2\2)\u0096\3\2" +
					"\2\2+\u00a3\3\2\2\2-\u00a7\3\2\2\2/\u00bd\3\2\2\2\61\u00bf\3\2\2\2\63" +
					"\u00c2\3\2\2\2\65\u00c5\3\2\2\2\67\u00d5\3\2\2\29\u00db\3\2\2\2;<\7<\2" +
					"\2<\4\3\2\2\2=>\7}\2\2>\6\3\2\2\2?@\7.\2\2@\b\3\2\2\2AB\7\177\2\2B\n\3" +
					"\2\2\2CD\7*\2\2D\f\3\2\2\2EF\7+\2\2F\16\3\2\2\2GH\7/\2\2H\20\3\2\2\2I" +
					"J\7]\2\2J\22\3\2\2\2KL\7_\2\2L\24\3\2\2\2MN\7/\2\2NO\7@\2\2O\26\3\2\2" +
					"\2PQ\7x\2\2QR\7c\2\2RS\7n\2\2ST\7w\2\2TU\7g\2\2U\30\3\2\2\2VW\7n\2\2W" +
					"X\7c\2\2XY\7p\2\2YZ\7i\2\2Z\32\3\2\2\2[\\\7x\2\2\\]\7q\2\2]^\7e\2\2^_" +
					"\7c\2\2_`\7d\2\2`\34\3\2\2\2ab\7f\2\2bc\7c\2\2cd\7v\2\2de\7c\2\2ef\7v" +
					"\2\2fg\7{\2\2gh\7r\2\2hi\7g\2\2i\36\3\2\2\2jk\5!\21\2k \3\2\2\2lm\7a\2" +
					"\2mn\7<\2\2nq\3\2\2\2or\5-\27\2pr\t\2\2\2qo\3\2\2\2qp\3\2\2\2r{\3\2\2" +
					"\2sv\5+\26\2tv\7\60\2\2us\3\2\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2" +
					"\2\2xz\3\2\2\2yw\3\2\2\2z|\5+\26\2{w\3\2\2\2{|\3\2\2\2|\"\3\2\2\2}~\5" +
					"\65\33\2~$\3\2\2\2\177\u0086\7$\2\2\u0080\u0085\n\3\2\2\u0081\u0085\7" +
					")\2\2\u0082\u0083\7^\2\2\u0083\u0085\7$\2\2\u0084\u0080\3\2\2\2\u0084" +
					"\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2" +
					"\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089" +
					"\u008a\7$\2\2\u008a&\3\2\2\2\u008b\u0094\5\61\31\2\u008c\u008f\5+\26\2" +
					"\u008d\u008f\7\60\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0092" +
					"\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092" +
					"\u0090\3\2\2\2\u0093\u0095\5+\26\2\u0094\u0090\3\2\2\2\u0094\u0095\3\2" +
					"\2\2\u0095(\3\2\2\2\u0096\u009c\7>\2\2\u0097\u009b\5+\26\2\u0098\u009b" +
					"\t\4\2\2\u0099\u009b\5/\30\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a" +
					"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2" +
					"\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7@\2\2\u00a0" +
					"*\3\2\2\2\u00a1\u00a4\5-\27\2\u00a2\u00a4\t\5\2\2\u00a3\u00a1\3\2\2\2" +
					"\u00a3\u00a2\3\2\2\2\u00a4,\3\2\2\2\u00a5\u00a8\5\61\31\2\u00a6\u00a8" +
					"\7a\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8.\3\2\2\2\u00a9\u00aa" +
					"\7^\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\5\63\32\2\u00ad" +
					"\u00ae\5\63\32\2\u00ae\u00af\5\63\32\2\u00af\u00b0\5\63\32\2\u00b0\u00be" +
					"\3\2\2\2\u00b1\u00b2\7^\2\2\u00b2\u00b3\7W\2\2\u00b3\u00b4\3\2\2\2\u00b4" +
					"\u00b5\5\63\32\2\u00b5\u00b6\5\63\32\2\u00b6\u00b7\5\63\32\2\u00b7\u00b8" +
					"\5\63\32\2\u00b8\u00b9\5\63\32\2\u00b9\u00ba\5\63\32\2\u00ba\u00bb\5\63" +
					"\32\2\u00bb\u00bc\5\63\32\2\u00bc\u00be\3\2\2\2\u00bd\u00a9\3\2\2\2\u00bd" +
					"\u00b1\3\2\2\2\u00be\60\3\2\2\2\u00bf\u00c0\t\6\2\2\u00c0\62\3\2\2\2\u00c1" +
					"\u00c3\t\7\2\2\u00c2\u00c1\3\2\2\2\u00c3\64\3\2\2\2\u00c4\u00c6\7/\2\2" +
					"\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c9" +
					"\t\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca" +
					"\u00cb\3\2\2\2\u00cb\u00d2\3\2\2\2\u00cc\u00ce\7\60\2\2\u00cd\u00cf\t" +
					"\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0" +
					"\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00d3\3\2" +
					"\2\2\u00d3\66\3\2\2\2\u00d4\u00d6\t\b\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7" +
					"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9" +
					"\u00da\b\34\2\2\u00da8\3\2\2\2\u00db\u00dc\t\t\2\2\u00dc:\3\2\2\2\30\2" +
					"quw{\u0084\u0086\u008e\u0090\u0094\u009a\u009c\u00a3\u00a7\u00bd\u00c2" +
					"\u00c5\u00ca\u00d0\u00d2\u00d5\u00d7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}