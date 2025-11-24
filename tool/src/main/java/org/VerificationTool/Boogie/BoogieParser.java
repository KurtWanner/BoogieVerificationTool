// Generated from src/main/java/org/VerificationTool/Boogie/Boogie.g4 by ANTLR 4.13.2
package org.VerificationTool.Boogie;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class BoogieParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PROCEDURE=2, FREE=3, REQUIRES=4, MODIFIES=5, ENSURES=6, ID=7, 
		WS=8, COMMENT=9, LINE_COMMENT=10;
	public static final int
		RULE_spec = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"spec"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'procedure'", "'free'", "'requires'", "'modifies'", "'ENSURES'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PROCEDURE", "FREE", "REQUIRES", "MODIFIES", "ENSURES", "ID", 
			"WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Boogie.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BoogieParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpecContext extends ParserRuleContext {
		public TerminalNode MODIFIES() { return getToken(BoogieParser.MODIFIES, 0); }
		public TerminalNode ID() { return getToken(BoogieParser.ID, 0); }
		public TerminalNode FREE() { return getToken(BoogieParser.FREE, 0); }
		public TerminalNode REQUIRES() { return getToken(BoogieParser.REQUIRES, 0); }
		public TerminalNode ENSURES() { return getToken(BoogieParser.ENSURES, 0); }
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoogieListener ) ((BoogieListener)listener).enterSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoogieListener ) ((BoogieListener)listener).exitSpec(this);
		}
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_spec);
		int _la;
		try {
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FREE) {
					{
					setState(2);
					match(FREE);
					}
				}

				setState(5);
				match(MODIFIES);
				setState(6);
				match(ID);
				setState(7);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FREE) {
					{
					setState(8);
					match(FREE);
					}
				}

				setState(11);
				match(REQUIRES);
				setState(12);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FREE) {
					{
					setState(13);
					match(FREE);
					}
				}

				setState(16);
				match(ENSURES);
				setState(17);
				match(T__0);
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
		"\u0004\u0001\n\u0015\u0002\u0000\u0007\u0000\u0001\u0000\u0003\u0000\u0004"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\n"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u000f\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\u0013\b\u0000\u0001\u0000\u0000\u0000"+
		"\u0001\u0000\u0000\u0000\u0018\u0000\u0012\u0001\u0000\u0000\u0000\u0002"+
		"\u0004\u0005\u0003\u0000\u0000\u0003\u0002\u0001\u0000\u0000\u0000\u0003"+
		"\u0004\u0001\u0000\u0000\u0000\u0004\u0005\u0001\u0000\u0000\u0000\u0005"+
		"\u0006\u0005\u0005\u0000\u0000\u0006\u0007\u0005\u0007\u0000\u0000\u0007"+
		"\u0013\u0005\u0001\u0000\u0000\b\n\u0005\u0003\u0000\u0000\t\b\u0001\u0000"+
		"\u0000\u0000\t\n\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000"+
		"\u000b\f\u0005\u0004\u0000\u0000\f\u0013\u0005\u0001\u0000\u0000\r\u000f"+
		"\u0005\u0003\u0000\u0000\u000e\r\u0001\u0000\u0000\u0000\u000e\u000f\u0001"+
		"\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0011\u0005"+
		"\u0006\u0000\u0000\u0011\u0013\u0005\u0001\u0000\u0000\u0012\u0003\u0001"+
		"\u0000\u0000\u0000\u0012\t\u0001\u0000\u0000\u0000\u0012\u000e\u0001\u0000"+
		"\u0000\u0000\u0013\u0001\u0001\u0000\u0000\u0000\u0004\u0003\t\u000e\u0012";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}