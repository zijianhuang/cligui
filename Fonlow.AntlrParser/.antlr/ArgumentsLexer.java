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
		LiteralText=1, IntRange=2, Slash=3, Hyphen=4, QuotedString=5, Colon=6, 
		Equal=7, NUMBER=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LiteralText", "IntRange", "Slash", "Hyphen", "AnyButAssign", "AnyButSeparatorsAndAssign", 
			"QuotedString", "Colon", "Equal", "NUMBER", "AnyString", "INT", "EXPONENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'/'", "'-'", null, "':'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LiteralText", "IntRange", "Slash", "Hyphen", "QuotedString", "Colon", 
			"Equal", "NUMBER", "WS"
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
		"\u0004\u0000\tl\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001f"+
		"\b\u0000\u000b\u0000\f\u0000 \u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u00067\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0003\t>\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\tC\b\t\n\t\f\tF\t\t\u0003\tH\b\t\u0001\t\u0001"+
		"\t\u0004\tL\b\t\u000b\t\f\tM\u0003\tP\b\t\u0001\t\u0003\tS\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0005\nX\b\n\n\n\f\n[\t\n\u0001\u000b\u0004\u000b^\b"+
		"\u000b\u000b\u000b\f\u000b_\u0001\f\u0001\f\u0003\fd\b\f\u0001\f\u0004"+
		"\fg\b\f\u000b\f\f\fh\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0000\u000b\u0000\r\u0005\u000f\u0006"+
		"\u0011\u0007\u0013\b\u0015\u0000\u0017\u0000\u0019\u0000\u001b\t\u0001"+
		"\u0000\u0006\u0007\u0000\t\n\r\r  \"\"::==``\t\u0000\t\n\r\r  \"\"--/"+
		"/::==``\u0001\u0000\"\"\u0002\u0000EEee\u0002\u0000++--\u0003\u0000\t"+
		"\n\r\r  s\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0001\u001e\u0001\u0000\u0000"+
		"\u0000\u0003\"\u0001\u0000\u0000\u0000\u0005&\u0001\u0000\u0000\u0000"+
		"\u0007(\u0001\u0000\u0000\u0000\t*\u0001\u0000\u0000\u0000\u000b,\u0001"+
		"\u0000\u0000\u0000\r6\u0001\u0000\u0000\u0000\u000f8\u0001\u0000\u0000"+
		"\u0000\u0011:\u0001\u0000\u0000\u0000\u0013=\u0001\u0000\u0000\u0000\u0015"+
		"Y\u0001\u0000\u0000\u0000\u0017]\u0001\u0000\u0000\u0000\u0019a\u0001"+
		"\u0000\u0000\u0000\u001bj\u0001\u0000\u0000\u0000\u001d\u001f\u0003\u000b"+
		"\u0005\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000"+
		"\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u0002"+
		"\u0001\u0000\u0000\u0000\"#\u0003\u0017\u000b\u0000#$\u0003\u0007\u0003"+
		"\u0000$%\u0003\u0017\u000b\u0000%\u0004\u0001\u0000\u0000\u0000&\'\u0005"+
		"/\u0000\u0000\'\u0006\u0001\u0000\u0000\u0000()\u0005-\u0000\u0000)\b"+
		"\u0001\u0000\u0000\u0000*+\b\u0000\u0000\u0000+\n\u0001\u0000\u0000\u0000"+
		",-\b\u0001\u0000\u0000-\f\u0001\u0000\u0000\u0000./\u0005\"\u0000\u0000"+
		"/0\u0003\u0015\n\u000001\u0005\"\u0000\u000017\u0001\u0000\u0000\u0000"+
		"23\u0005`\u0000\u000034\u0003\u0015\n\u000045\u0005`\u0000\u000057\u0001"+
		"\u0000\u0000\u00006.\u0001\u0000\u0000\u000062\u0001\u0000\u0000\u0000"+
		"7\u000e\u0001\u0000\u0000\u000089\u0005:\u0000\u00009\u0010\u0001\u0000"+
		"\u0000\u0000:;\u0005=\u0000\u0000;\u0012\u0001\u0000\u0000\u0000<>\u0005"+
		"-\u0000\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>G\u0001"+
		"\u0000\u0000\u0000?H\u00050\u0000\u0000@D\u000219\u0000AC\u0003\u0017"+
		"\u000b\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000G?\u0001\u0000\u0000\u0000G@\u0001\u0000\u0000"+
		"\u0000HO\u0001\u0000\u0000\u0000IK\u0005.\u0000\u0000JL\u0003\u0017\u000b"+
		"\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OI\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000"+
		"QS\u0003\u0019\f\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"S\u0014\u0001\u0000\u0000\u0000TU\u0005\"\u0000\u0000UX\u0005\"\u0000"+
		"\u0000VX\b\u0002\u0000\u0000WT\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Z\u0016\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"\\^\u000209\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0018\u0001\u0000"+
		"\u0000\u0000ac\u0007\u0003\u0000\u0000bd\u0007\u0004\u0000\u0000cb\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000"+
		"eg\u000209\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h"+
		"f\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u001a\u0001\u0000"+
		"\u0000\u0000jk\u0007\u0005\u0000\u0000k\u001c\u0001\u0000\u0000\u0000"+
		"\u000e\u0000 6=DGMORWY_ch\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}