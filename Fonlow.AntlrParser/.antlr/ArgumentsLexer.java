// Generated from c:/VsProjects/OpenSource/cligui/Fonlow.AntlrParser/Arguments.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArgumentsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LiteralText=1, IntRange=2, Slash=3, Hyphen=4, Backtick=5, QuotedString=6, 
		Colon=7, Equal=8, NUMBER=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LiteralText", "IntRange", "Slash", "Hyphen", "Backtick", "QuotedString", 
			"Colon", "Equal", "NUMBER", "AnyButAssign", "AnyButSeparatorsAndAssign", 
			"AnyString", "INT", "EXPONENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'/'", "'-'", "'`'", null, "':'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LiteralText", "IntRange", "Slash", "Hyphen", "Backtick", "QuotedString", 
			"Colon", "Equal", "NUMBER", "WS"
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


	public ArgumentsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Arguments.g4"; }

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
		"\u0004\u0000\np\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0004\u0000!\b\u0000\u000b\u0000\f\u0000\"\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u00057\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0003\b>\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0005\bC\b\b\n\b\f\bF\t\b\u0003\bH\b\b\u0001"+
		"\b\u0001\b\u0004\bL\b\b\u000b\b\f\bM\u0003\bP\b\b\u0001\b\u0003\bS\b\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\\\b\u000b\n\u000b\f\u000b_\t\u000b\u0001\f\u0004\fb\b\f\u000b\f"+
		"\f\fc\u0001\r\u0001\r\u0003\rh\b\r\u0001\r\u0004\rk\b\r\u000b\r\f\rl\u0001"+
		"\u000e\u0001\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\u0000\u0015"+
		"\u0000\u0017\u0000\u0019\u0000\u001b\u0000\u001d\n\u0001\u0000\u0006\u0007"+
		"\u0000\t\n\r\r  \"\"::==``\t\u0000\t\n\r\r  \"\"--//::==``\u0001\u0000"+
		"\"\"\u0002\u0000EEee\u0002\u0000++--\u0003\u0000\t\n\r\r  w\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001 \u0001\u0000\u0000"+
		"\u0000\u0003$\u0001\u0000\u0000\u0000\u0005(\u0001\u0000\u0000\u0000\u0007"+
		"*\u0001\u0000\u0000\u0000\t,\u0001\u0000\u0000\u0000\u000b6\u0001\u0000"+
		"\u0000\u0000\r8\u0001\u0000\u0000\u0000\u000f:\u0001\u0000\u0000\u0000"+
		"\u0011=\u0001\u0000\u0000\u0000\u0013T\u0001\u0000\u0000\u0000\u0015V"+
		"\u0001\u0000\u0000\u0000\u0017]\u0001\u0000\u0000\u0000\u0019a\u0001\u0000"+
		"\u0000\u0000\u001be\u0001\u0000\u0000\u0000\u001dn\u0001\u0000\u0000\u0000"+
		"\u001f!\u0003\u0015\n\u0000 \u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\u0002"+
		"\u0001\u0000\u0000\u0000$%\u0003\u0019\f\u0000%&\u0003\u0007\u0003\u0000"+
		"&\'\u0003\u0019\f\u0000\'\u0004\u0001\u0000\u0000\u0000()\u0005/\u0000"+
		"\u0000)\u0006\u0001\u0000\u0000\u0000*+\u0005-\u0000\u0000+\b\u0001\u0000"+
		"\u0000\u0000,-\u0005`\u0000\u0000-\n\u0001\u0000\u0000\u0000./\u0005\""+
		"\u0000\u0000/0\u0003\u0017\u000b\u000001\u0005\"\u0000\u000017\u0001\u0000"+
		"\u0000\u000023\u0003\t\u0004\u000034\u0003\u0017\u000b\u000045\u0003\t"+
		"\u0004\u000057\u0001\u0000\u0000\u00006.\u0001\u0000\u0000\u000062\u0001"+
		"\u0000\u0000\u00007\f\u0001\u0000\u0000\u000089\u0005:\u0000\u00009\u000e"+
		"\u0001\u0000\u0000\u0000:;\u0005=\u0000\u0000;\u0010\u0001\u0000\u0000"+
		"\u0000<>\u0005-\u0000\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>G\u0001\u0000\u0000\u0000?H\u00050\u0000\u0000@D\u000219\u0000"+
		"AC\u0003\u0019\f\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000G?\u0001\u0000\u0000\u0000G@\u0001\u0000"+
		"\u0000\u0000HO\u0001\u0000\u0000\u0000IK\u0005.\u0000\u0000JL\u0003\u0019"+
		"\f\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OI\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000"+
		"QS\u0003\u001b\r\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"S\u0012\u0001\u0000\u0000\u0000TU\b\u0000\u0000\u0000U\u0014\u0001\u0000"+
		"\u0000\u0000VW\b\u0001\u0000\u0000W\u0016\u0001\u0000\u0000\u0000XY\u0005"+
		"\"\u0000\u0000Y\\\u0005\"\u0000\u0000Z\\\b\u0002\u0000\u0000[X\u0001\u0000"+
		"\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\u0018\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000`b\u000209\u0000a`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000d\u001a\u0001\u0000\u0000\u0000eg\u0007\u0003\u0000\u0000fh\u0007"+
		"\u0004\u0000\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hj\u0001\u0000\u0000\u0000ik\u000209\u0000ji\u0001\u0000\u0000\u0000k"+
		"l\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000m\u001c\u0001\u0000\u0000\u0000no\u0007\u0005\u0000\u0000o\u001e"+
		"\u0001\u0000\u0000\u0000\u000e\u0000\"6=DGMOR[]cgl\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}