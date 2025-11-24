// Generated from src/main/java/org/VerificationTool/Boogie/Boogie.g4 by ANTLR 4.13.2
package org.VerificationTool.Boogie;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class BoogieLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PROCEDURE=2, FREE=3, REQUIRES=4, MODIFIES=5, ENSURES=6, ID=7, 
		WS=8, COMMENT=9, LINE_COMMENT=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PROCEDURE", "FREE", "REQUIRES", "MODIFIES", "ENSURES", "ID", 
			"WS", "COMMENT", "LINE_COMMENT", "LetterOrDigit", "Letter"
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


	public BoogieLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Boogie.g4"; }

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
		"\u0004\u0000\nq\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006G\b\u0006"+
		"\n\u0006\f\u0006J\t\u0006\u0001\u0007\u0004\u0007M\b\u0007\u000b\u0007"+
		"\f\u0007N\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\bW\b\b\n\b\f\bZ\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\te\b\t\n\t\f\th\t\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0003\nn\b\n\u0001\u000b\u0001\u000b\u0001X\u0000\f\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u0000\u0017\u0000\u0001\u0000\u0004\u0003\u0000\t\n\f"+
		"\r  \u0002\u0000\n\n\r\r\u0001\u000009\u0004\u0000$$AZ__azs\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000"+
		"\u0000\u0000\u0003\u001b\u0001\u0000\u0000\u0000\u0005%\u0001\u0000\u0000"+
		"\u0000\u0007*\u0001\u0000\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b"+
		"<\u0001\u0000\u0000\u0000\rD\u0001\u0000\u0000\u0000\u000fL\u0001\u0000"+
		"\u0000\u0000\u0011R\u0001\u0000\u0000\u0000\u0013`\u0001\u0000\u0000\u0000"+
		"\u0015m\u0001\u0000\u0000\u0000\u0017o\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005;\u0000\u0000\u001a\u0002\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		"p\u0000\u0000\u001c\u001d\u0005r\u0000\u0000\u001d\u001e\u0005o\u0000"+
		"\u0000\u001e\u001f\u0005c\u0000\u0000\u001f \u0005e\u0000\u0000 !\u0005"+
		"d\u0000\u0000!\"\u0005u\u0000\u0000\"#\u0005r\u0000\u0000#$\u0005e\u0000"+
		"\u0000$\u0004\u0001\u0000\u0000\u0000%&\u0005f\u0000\u0000&\'\u0005r\u0000"+
		"\u0000\'(\u0005e\u0000\u0000()\u0005e\u0000\u0000)\u0006\u0001\u0000\u0000"+
		"\u0000*+\u0005r\u0000\u0000+,\u0005e\u0000\u0000,-\u0005q\u0000\u0000"+
		"-.\u0005u\u0000\u0000./\u0005i\u0000\u0000/0\u0005r\u0000\u000001\u0005"+
		"e\u0000\u000012\u0005s\u0000\u00002\b\u0001\u0000\u0000\u000034\u0005"+
		"m\u0000\u000045\u0005o\u0000\u000056\u0005d\u0000\u000067\u0005i\u0000"+
		"\u000078\u0005f\u0000\u000089\u0005i\u0000\u00009:\u0005e\u0000\u0000"+
		":;\u0005s\u0000\u0000;\n\u0001\u0000\u0000\u0000<=\u0005E\u0000\u0000"+
		"=>\u0005N\u0000\u0000>?\u0005S\u0000\u0000?@\u0005U\u0000\u0000@A\u0005"+
		"R\u0000\u0000AB\u0005E\u0000\u0000BC\u0005S\u0000\u0000C\f\u0001\u0000"+
		"\u0000\u0000DH\u0003\u0017\u000b\u0000EG\u0003\u0015\n\u0000FE\u0001\u0000"+
		"\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000I\u000e\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000KM\u0007\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PQ\u0006\u0007\u0000\u0000Q\u0010\u0001\u0000\u0000"+
		"\u0000RS\u0005/\u0000\u0000ST\u0005*\u0000\u0000TX\u0001\u0000\u0000\u0000"+
		"UW\t\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005*\u0000\u0000\\]\u0005/\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^_\u0006\b\u0000\u0000_\u0012\u0001\u0000"+
		"\u0000\u0000`a\u0005/\u0000\u0000ab\u0005/\u0000\u0000bf\u0001\u0000\u0000"+
		"\u0000ce\b\u0001\u0000\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0006\t\u0000\u0000j\u0014\u0001"+
		"\u0000\u0000\u0000kn\u0003\u0017\u000b\u0000ln\u0007\u0002\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000n\u0016\u0001\u0000"+
		"\u0000\u0000op\u0007\u0003\u0000\u0000p\u0018\u0001\u0000\u0000\u0000"+
		"\u0006\u0000HNXfm\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}