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
		RULE_fixedParameter = 4, RULE_value = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "parameters", "parameter", "parameterName", "fixedParameter", 
			"value"
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
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 582L) != 0)) {
				{
				setState(12);
				fixedParameter();
				}
			}

			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(16); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(15);
						match(WS);
						}
						}
						setState(18); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					setState(20);
					fixedParameter();
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(26);
				match(WS);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			parameters();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(33);
				match(WS);
				}
				}
				setState(38);
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
			setState(39);
			parameter();
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(41); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(40);
						match(WS);
						}
						}
						setState(43); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					setState(45);
					parameter();
					}
					} 
				}
				setState(50);
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
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				_la = _input.LA(1);
				if ( !(_la==Slash || _la==Hyphen) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(52);
				parameterName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Colon:
					{
					setState(55);
					match(Colon);
					}
					break;
				case Equal:
					{
					setState(56);
					match(Equal);
					}
					break;
				case WS:
					{
					setState(58); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(57);
						match(WS);
						}
						}
						setState(60); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(64);
					value();
					setState(68);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(65);
							match(WS);
							}
							} 
						}
						setState(70);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					}
					}
					}
					setState(73); 
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(LiteralText);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(LiteralText);
				setState(79);
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
		public TerminalNode QuotedString() { return getToken(ArgumentsParser.QuotedString, 0); }
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(QuotedString);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(LiteralText);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
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
		public TerminalNode QuotedString() { return getToken(ArgumentsParser.QuotedString, 0); }
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(QuotedString);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(LiteralText);
				setState(100); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(90); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(89);
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
							setState(92); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(97);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(94);
								match(LiteralText);
								}
								} 
							}
							setState(99);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(102); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(LiteralText);
				setState(105);
				match(Equal);
				setState(106);
				match(LiteralText);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(IntRange);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				match(NUMBER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
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

	public static final String _serializedATN =
		"\u0004\u0001\nq\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0003\u0000\u000e\b\u0000\u0001\u0000\u0004"+
		"\u0000\u0011\b\u0000\u000b\u0000\f\u0000\u0012\u0001\u0000\u0005\u0000"+
		"\u0016\b\u0000\n\u0000\f\u0000\u0019\t\u0000\u0001\u0000\u0005\u0000\u001c"+
		"\b\u0000\n\u0000\f\u0000\u001f\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"#\b\u0000\n\u0000\f\u0000&\t\u0000\u0001\u0001\u0001\u0001\u0004\u0001"+
		"*\b\u0001\u000b\u0001\f\u0001+\u0001\u0001\u0005\u0001/\b\u0001\n\u0001"+
		"\f\u00012\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0004\u0002;\b\u0002\u000b\u0002\f\u0002"+
		"<\u0003\u0002?\b\u0002\u0001\u0002\u0001\u0002\u0005\u0002C\b\u0002\n"+
		"\u0002\f\u0002F\t\u0002\u0004\u0002H\b\u0002\u000b\u0002\f\u0002I\u0003"+
		"\u0002L\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003Q\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004V\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0004\u0005[\b\u0005\u000b\u0005\f\u0005\\\u0001"+
		"\u0005\u0005\u0005`\b\u0005\n\u0005\f\u0005c\t\u0005\u0004\u0005e\b\u0005"+
		"\u000b\u0005\f\u0005f\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005o\b\u0005\u0001\u0005\u0000\u0000"+
		"\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0002\u0001\u0000\u0003\u0004"+
		"\u0002\u0000\u0003\u0004\u0007\b\u0082\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0002\'\u0001\u0000\u0000\u0000\u0004K\u0001\u0000\u0000\u0000\u0006"+
		"P\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\nn\u0001\u0000\u0000"+
		"\u0000\f\u000e\u0003\b\u0004\u0000\r\f\u0001\u0000\u0000\u0000\r\u000e"+
		"\u0001\u0000\u0000\u0000\u000e\u0017\u0001\u0000\u0000\u0000\u000f\u0011"+
		"\u0005\n\u0000\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001"+
		"\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0016\u0003"+
		"\b\u0004\u0000\u0015\u0010\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000"+
		"\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000"+
		"\u0000\u0000\u0018\u001d\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000"+
		"\u0000\u0000\u001a\u001c\u0005\n\u0000\u0000\u001b\u001a\u0001\u0000\u0000"+
		"\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000"+
		"\u001f\u001d\u0001\u0000\u0000\u0000 $\u0003\u0002\u0001\u0000!#\u0005"+
		"\n\u0000\u0000\"!\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$\""+
		"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\u0001\u0001\u0000"+
		"\u0000\u0000&$\u0001\u0000\u0000\u0000\'0\u0003\u0004\u0002\u0000(*\u0005"+
		"\n\u0000\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-/\u0003\u0004\u0002\u0000.)\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001\u0003\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u000034\u0007\u0000\u0000\u0000"+
		"4L\u0003\u0006\u0003\u000056\u0007\u0000\u0000\u00006>\u0003\u0006\u0003"+
		"\u00007?\u0005\u0007\u0000\u00008?\u0005\b\u0000\u00009;\u0005\n\u0000"+
		"\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000>7\u0001"+
		"\u0000\u0000\u0000>8\u0001\u0000\u0000\u0000>:\u0001\u0000\u0000\u0000"+
		"?G\u0001\u0000\u0000\u0000@D\u0003\n\u0005\u0000AC\u0005\n\u0000\u0000"+
		"BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000G@\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000"+
		"K3\u0001\u0000\u0000\u0000K5\u0001\u0000\u0000\u0000L\u0005\u0001\u0000"+
		"\u0000\u0000MQ\u0005\u0001\u0000\u0000NO\u0005\u0001\u0000\u0000OQ\u0005"+
		"\u0004\u0000\u0000PM\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"Q\u0007\u0001\u0000\u0000\u0000RV\u0005\u0006\u0000\u0000SV\u0005\u0001"+
		"\u0000\u0000TV\u0003\n\u0005\u0000UR\u0001\u0000\u0000\u0000US\u0001\u0000"+
		"\u0000\u0000UT\u0001\u0000\u0000\u0000V\t\u0001\u0000\u0000\u0000Wo\u0005"+
		"\u0006\u0000\u0000Xd\u0005\u0001\u0000\u0000Y[\u0007\u0001\u0000\u0000"+
		"ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]a\u0001\u0000\u0000\u0000^`\u0005\u0001"+
		"\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000dZ\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000go\u0001\u0000"+
		"\u0000\u0000hi\u0005\u0001\u0000\u0000ij\u0005\b\u0000\u0000jo\u0005\u0001"+
		"\u0000\u0000ko\u0005\u0002\u0000\u0000lo\u0005\t\u0000\u0000mo\u0005\u0001"+
		"\u0000\u0000nW\u0001\u0000\u0000\u0000nX\u0001\u0000\u0000\u0000nh\u0001"+
		"\u0000\u0000\u0000nk\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"nm\u0001\u0000\u0000\u0000o\u000b\u0001\u0000\u0000\u0000\u0012\r\u0012"+
		"\u0017\u001d$+0<>DIKPU\\afn";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}