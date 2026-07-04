// Generated from c:/VsProjects/OpenSource/cligui/Fonlow.AntlrParser/Arguments.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ArgumentsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LiteralText=1, IntRange=2, Slash=3, Hyphen=4, Backtick=5, QuotedString=6, 
		Colon=7, Equal=8, NUMBER=9, WS=10;
	public static final int
		RULE_init = 0, RULE_parameters = 1, RULE_parameter = 2, RULE_parameterName = 3, 
		RULE_fixedParameter = 4, RULE_value = 5, RULE_quotedString = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "parameters", "parameter", "parameterName", "fixedParameter", 
			"value", "quotedString"
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

	@Override
	public String getGrammarFileName() { return "Arguments.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArgumentsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<FixedParameterContext> fixedParameter() {
			return getRuleContexts(FixedParameterContext.class);
		}
		public FixedParameterContext fixedParameter(int i) {
			return getRuleContext(FixedParameterContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(ArgumentsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ArgumentsParser.WS, i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 582L) != 0)) {
				{
				setState(14);
				fixedParameter();
				}
			}

			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(18); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(17);
						match(WS);
						}
						}
						setState(20); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					setState(22);
					fixedParameter();
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(28);
				match(WS);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			parameters();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(35);
				match(WS);
				}
				}
				setState(40);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(ArgumentsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ArgumentsParser.WS, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			parameter();
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(43); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(42);
						match(WS);
						}
						}
						setState(45); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					setState(47);
					parameter();
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public ParameterNameContext parameterName() {
			return getRuleContext(ParameterNameContext.class,0);
		}
		public TerminalNode Slash() { return getToken(ArgumentsParser.Slash, 0); }
		public TerminalNode Hyphen() { return getToken(ArgumentsParser.Hyphen, 0); }
		public TerminalNode Colon() { return getToken(ArgumentsParser.Colon, 0); }
		public TerminalNode Equal() { return getToken(ArgumentsParser.Equal, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(ArgumentsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ArgumentsParser.WS, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameter);
		int _la;
		try {
			int _alt;
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				_la = _input.LA(1);
				if ( !(_la==Slash || _la==Hyphen) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(54);
				parameterName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				_la = _input.LA(1);
				if ( !(_la==Slash || _la==Hyphen) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(56);
				parameterName();
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Colon:
					{
					setState(57);
					match(Colon);
					}
					break;
				case Equal:
					{
					setState(58);
					match(Equal);
					}
					break;
				case WS:
					{
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(59);
						match(WS);
						}
						}
						setState(62); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(66);
					value();
					setState(70);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(67);
							match(WS);
							}
							} 
						}
						setState(72);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					}
					}
					}
					setState(75); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 582L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterNameContext extends ParserRuleContext {
		public TerminalNode LiteralText() { return getToken(ArgumentsParser.LiteralText, 0); }
		public TerminalNode Hyphen() { return getToken(ArgumentsParser.Hyphen, 0); }
		public ParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterName; }
	}

	public final ParameterNameContext parameterName() throws RecognitionException {
		ParameterNameContext _localctx = new ParameterNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameterName);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(LiteralText);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(LiteralText);
				setState(81);
				match(Hyphen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FixedParameterContext extends ParserRuleContext {
		public QuotedStringContext quotedString() {
			return getRuleContext(QuotedStringContext.class,0);
		}
		public TerminalNode LiteralText() { return getToken(ArgumentsParser.LiteralText, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FixedParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedParameter; }
	}

	public final FixedParameterContext fixedParameter() throws RecognitionException {
		FixedParameterContext _localctx = new FixedParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fixedParameter);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				quotedString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(LiteralText);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public QuotedStringContext quotedString() {
			return getRuleContext(QuotedStringContext.class,0);
		}
		public List<TerminalNode> LiteralText() { return getTokens(ArgumentsParser.LiteralText); }
		public TerminalNode LiteralText(int i) {
			return getToken(ArgumentsParser.LiteralText, i);
		}
		public List<TerminalNode> Slash() { return getTokens(ArgumentsParser.Slash); }
		public TerminalNode Slash(int i) {
			return getToken(ArgumentsParser.Slash, i);
		}
		public List<TerminalNode> Hyphen() { return getTokens(ArgumentsParser.Hyphen); }
		public TerminalNode Hyphen(int i) {
			return getToken(ArgumentsParser.Hyphen, i);
		}
		public List<TerminalNode> Equal() { return getTokens(ArgumentsParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(ArgumentsParser.Equal, i);
		}
		public List<TerminalNode> Colon() { return getTokens(ArgumentsParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(ArgumentsParser.Colon, i);
		}
		public TerminalNode IntRange() { return getToken(ArgumentsParser.IntRange, 0); }
		public TerminalNode NUMBER() { return getToken(ArgumentsParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		int _la;
		try {
			int _alt;
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				quotedString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(LiteralText);
				setState(102); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(92); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(91);
								_la = _input.LA(1);
								if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 408L) != 0)) ) {
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
							setState(94); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(99);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(96);
								match(LiteralText);
								}
								} 
							}
							setState(101);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(104); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(LiteralText);
				setState(107);
				match(Equal);
				setState(108);
				match(LiteralText);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(IntRange);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				match(NUMBER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				match(LiteralText);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuotedStringContext extends ParserRuleContext {
		public TerminalNode QuotedString() { return getToken(ArgumentsParser.QuotedString, 0); }
		public QuotedStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedString; }
	}

	public final QuotedStringContext quotedString() throws RecognitionException {
		QuotedStringContext _localctx = new QuotedStringContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_quotedString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(QuotedString);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\nu\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0003\u0000\u0010"+
		"\b\u0000\u0001\u0000\u0004\u0000\u0013\b\u0000\u000b\u0000\f\u0000\u0014"+
		"\u0001\u0000\u0005\u0000\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001"+
		"\u0000\u0005\u0000\u001e\b\u0000\n\u0000\f\u0000!\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000%\b\u0000\n\u0000\f\u0000(\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0004\u0001,\b\u0001\u000b\u0001\f\u0001-\u0001\u0001\u0005"+
		"\u00011\b\u0001\n\u0001\f\u00014\t\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002=\b"+
		"\u0002\u000b\u0002\f\u0002>\u0003\u0002A\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002E\b\u0002\n\u0002\f\u0002H\t\u0002\u0004\u0002J\b\u0002\u000b"+
		"\u0002\f\u0002K\u0003\u0002N\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003S\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"X\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005]\b\u0005\u000b"+
		"\u0005\f\u0005^\u0001\u0005\u0005\u0005b\b\u0005\n\u0005\f\u0005e\t\u0005"+
		"\u0004\u0005g\b\u0005\u000b\u0005\f\u0005h\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005q\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006"+
		"\b\n\f\u0000\u0002\u0001\u0000\u0003\u0004\u0002\u0000\u0003\u0004\u0007"+
		"\b\u0085\u0000\u000f\u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000"+
		"\u0000\u0004M\u0001\u0000\u0000\u0000\u0006R\u0001\u0000\u0000\u0000\b"+
		"W\u0001\u0000\u0000\u0000\np\u0001\u0000\u0000\u0000\fr\u0001\u0000\u0000"+
		"\u0000\u000e\u0010\u0003\b\u0004\u0000\u000f\u000e\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0019\u0001\u0000\u0000\u0000"+
		"\u0011\u0013\u0005\n\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0013"+
		"\u0014\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016"+
		"\u0018\u0003\b\u0004\u0000\u0017\u0012\u0001\u0000\u0000\u0000\u0018\u001b"+
		"\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0001\u0000\u0000\u0000\u001a\u001f\u0001\u0000\u0000\u0000\u001b\u0019"+
		"\u0001\u0000\u0000\u0000\u001c\u001e\u0005\n\u0000\u0000\u001d\u001c\u0001"+
		"\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000\"&\u0003\u0002\u0001\u0000#%\u0005\n\u0000"+
		"\u0000$#\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\'\u0001\u0001\u0000\u0000\u0000"+
		"(&\u0001\u0000\u0000\u0000)2\u0003\u0004\u0002\u0000*,\u0005\n\u0000\u0000"+
		"+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0003\u0004"+
		"\u0002\u00000+\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u00003\u0003\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u000056\u0007\u0000\u0000\u00006N\u0003\u0006"+
		"\u0003\u000078\u0007\u0000\u0000\u00008@\u0003\u0006\u0003\u00009A\u0005"+
		"\u0007\u0000\u0000:A\u0005\b\u0000\u0000;=\u0005\n\u0000\u0000<;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000@9\u0001\u0000\u0000"+
		"\u0000@:\u0001\u0000\u0000\u0000@<\u0001\u0000\u0000\u0000AI\u0001\u0000"+
		"\u0000\u0000BF\u0003\n\u0005\u0000CE\u0005\n\u0000\u0000DC\u0001\u0000"+
		"\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"IB\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000M5\u0001\u0000"+
		"\u0000\u0000M7\u0001\u0000\u0000\u0000N\u0005\u0001\u0000\u0000\u0000"+
		"OS\u0005\u0001\u0000\u0000PQ\u0005\u0001\u0000\u0000QS\u0005\u0004\u0000"+
		"\u0000RO\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000S\u0007\u0001"+
		"\u0000\u0000\u0000TX\u0003\f\u0006\u0000UX\u0005\u0001\u0000\u0000VX\u0003"+
		"\n\u0005\u0000WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001"+
		"\u0000\u0000\u0000X\t\u0001\u0000\u0000\u0000Yq\u0003\f\u0006\u0000Zf"+
		"\u0005\u0001\u0000\u0000[]\u0007\u0001\u0000\u0000\\[\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_c\u0001\u0000\u0000\u0000`b\u0005\u0001\u0000\u0000a`\u0001"+
		"\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000f\\\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000iq\u0001\u0000\u0000\u0000jk\u0005"+
		"\u0001\u0000\u0000kl\u0005\b\u0000\u0000lq\u0005\u0001\u0000\u0000mq\u0005"+
		"\u0002\u0000\u0000nq\u0005\t\u0000\u0000oq\u0005\u0001\u0000\u0000pY\u0001"+
		"\u0000\u0000\u0000pZ\u0001\u0000\u0000\u0000pj\u0001\u0000\u0000\u0000"+
		"pm\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000"+
		"\u0000q\u000b\u0001\u0000\u0000\u0000rs\u0005\u0006\u0000\u0000s\r\u0001"+
		"\u0000\u0000\u0000\u0012\u000f\u0014\u0019\u001f&-2>@FKMRW^chp";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}