// Generated from /home/tomas/Desktop/ProjetoC/agl-gg08/src/agl.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class aglLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, Boolean=76, Integer=77, Number=78, String=79, ID=80, 
		COMMENT=81, MLCOMMENT=82, WS=83, NL=84, ERROR=85;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
			"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
			"T__65", "T__66", "T__67", "T__68", "T__69", "T__70", "T__71", "T__72", 
			"T__73", "T__74", "Boolean", "Integer", "Number", "String", "ID", "COMMENT", 
			"MLCOMMENT", "WS", "NL", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'='", "'.'", "'['", "']'", "':'", "'close'", 
			"'refresh'", "'after'", "'print'", "'move'", "'by'", "'to'", "'play'", 
			"'with'", "'-'", "'+'", "'^'", "'*'", "'/'", "'%'", "'('", "')'", "'!'", 
			"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'&&'", "'||'", "','", 
			"'wait'", "'mouse click'", "'input'", "'load'", "'at'", "'do'", "'Enum'", 
			"'in'", "'action'", "'on'", "'if'", "'else'", "'::'", "'Model'", "'while'", 
			"'for'", "'..'", "'ms'", "'s'", "'Integer'", "'Number'", "'Point'", "'Vector'", 
			"'String'", "'Array'", "'Script'", "'Boolean'", "'View'", "'Dot'", "'Line'", 
			"'Rectangle'", "'Ellipse'", "'Text'", "'Arc'", "'ArcChord'", "'PieSlice'", 
			"'Polyline'", "'Spline'", "'Polygon'", "'Blob'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "Boolean", "Integer", "Number", "String", "ID", 
			"COMMENT", "MLCOMMENT", "WS", "NL", "ERROR"
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


	public aglLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "agl.g4"; }

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
		"\u0004\u0000U\u024e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007"+
		"I\u0002J\u0007J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007"+
		"N\u0002O\u0007O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007"+
		"S\u0002T\u0007T\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00014\u0001"+
		"4\u00014\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001"+
		"D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001J\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u0205\bK\u0001L\u0004"+
		"L\u0208\bL\u000bL\fL\u0209\u0001M\u0004M\u020d\bM\u000bM\fM\u020e\u0001"+
		"M\u0001M\u0004M\u0213\bM\u000bM\fM\u0214\u0003M\u0217\bM\u0001N\u0001"+
		"N\u0005N\u021b\bN\nN\fN\u021e\tN\u0001N\u0001N\u0001O\u0001O\u0005O\u0224"+
		"\bO\nO\fO\u0227\tO\u0001P\u0001P\u0005P\u022b\bP\nP\fP\u022e\tP\u0001"+
		"P\u0001P\u0003P\u0232\bP\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0005"+
		"Q\u023a\bQ\nQ\fQ\u023d\tQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001R\u0001"+
		"R\u0001R\u0001R\u0001S\u0003S\u0249\bS\u0001S\u0001S\u0001T\u0001T\u0003"+
		"\u021c\u022c\u023b\u0000U\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s"+
		":u;w<y={>}?\u007f@\u0081A\u0083B\u0085C\u0087D\u0089E\u008bF\u008dG\u008f"+
		"H\u0091I\u0093J\u0095K\u0097L\u0099M\u009bN\u009dO\u009fP\u00a1Q\u00a3"+
		"R\u00a5S\u00a7T\u00a9U\u0001\u0000\u0004\u0001\u000009\u0003\u0000AZ_"+
		"_az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u0258\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C"+
		"\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000"+
		"\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000"+
		"\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q"+
		"\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000"+
		"\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000"+
		"\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_"+
		"\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000"+
		"\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000"+
		"\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m"+
		"\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000"+
		"\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000\u0000"+
		"\u0000w\u0001\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000\u0000{"+
		"\u0001\u0000\u0000\u0000\u0000}\u0001\u0000\u0000\u0000\u0000\u007f\u0001"+
		"\u0000\u0000\u0000\u0000\u0081\u0001\u0000\u0000\u0000\u0000\u0083\u0001"+
		"\u0000\u0000\u0000\u0000\u0085\u0001\u0000\u0000\u0000\u0000\u0087\u0001"+
		"\u0000\u0000\u0000\u0000\u0089\u0001\u0000\u0000\u0000\u0000\u008b\u0001"+
		"\u0000\u0000\u0000\u0000\u008d\u0001\u0000\u0000\u0000\u0000\u008f\u0001"+
		"\u0000\u0000\u0000\u0000\u0091\u0001\u0000\u0000\u0000\u0000\u0093\u0001"+
		"\u0000\u0000\u0000\u0000\u0095\u0001\u0000\u0000\u0000\u0000\u0097\u0001"+
		"\u0000\u0000\u0000\u0000\u0099\u0001\u0000\u0000\u0000\u0000\u009b\u0001"+
		"\u0000\u0000\u0000\u0000\u009d\u0001\u0000\u0000\u0000\u0000\u009f\u0001"+
		"\u0000\u0000\u0000\u0000\u00a1\u0001\u0000\u0000\u0000\u0000\u00a3\u0001"+
		"\u0000\u0000\u0000\u0000\u00a5\u0001\u0000\u0000\u0000\u0000\u00a7\u0001"+
		"\u0000\u0000\u0000\u0000\u00a9\u0001\u0000\u0000\u0000\u0001\u00ab\u0001"+
		"\u0000\u0000\u0000\u0003\u00ad\u0001\u0000\u0000\u0000\u0005\u00af\u0001"+
		"\u0000\u0000\u0000\u0007\u00b1\u0001\u0000\u0000\u0000\t\u00b3\u0001\u0000"+
		"\u0000\u0000\u000b\u00b5\u0001\u0000\u0000\u0000\r\u00b7\u0001\u0000\u0000"+
		"\u0000\u000f\u00b9\u0001\u0000\u0000\u0000\u0011\u00bb\u0001\u0000\u0000"+
		"\u0000\u0013\u00c1\u0001\u0000\u0000\u0000\u0015\u00c9\u0001\u0000\u0000"+
		"\u0000\u0017\u00cf\u0001\u0000\u0000\u0000\u0019\u00d5\u0001\u0000\u0000"+
		"\u0000\u001b\u00da\u0001\u0000\u0000\u0000\u001d\u00dd\u0001\u0000\u0000"+
		"\u0000\u001f\u00e0\u0001\u0000\u0000\u0000!\u00e5\u0001\u0000\u0000\u0000"+
		"#\u00ea\u0001\u0000\u0000\u0000%\u00ec\u0001\u0000\u0000\u0000\'\u00ee"+
		"\u0001\u0000\u0000\u0000)\u00f0\u0001\u0000\u0000\u0000+\u00f2\u0001\u0000"+
		"\u0000\u0000-\u00f4\u0001\u0000\u0000\u0000/\u00f6\u0001\u0000\u0000\u0000"+
		"1\u00f8\u0001\u0000\u0000\u00003\u00fa\u0001\u0000\u0000\u00005\u00fc"+
		"\u0001\u0000\u0000\u00007\u00ff\u0001\u0000\u0000\u00009\u0102\u0001\u0000"+
		"\u0000\u0000;\u0104\u0001\u0000\u0000\u0000=\u0107\u0001\u0000\u0000\u0000"+
		"?\u0109\u0001\u0000\u0000\u0000A\u010c\u0001\u0000\u0000\u0000C\u010f"+
		"\u0001\u0000\u0000\u0000E\u0112\u0001\u0000\u0000\u0000G\u0114\u0001\u0000"+
		"\u0000\u0000I\u0119\u0001\u0000\u0000\u0000K\u0125\u0001\u0000\u0000\u0000"+
		"M\u012b\u0001\u0000\u0000\u0000O\u0130\u0001\u0000\u0000\u0000Q\u0133"+
		"\u0001\u0000\u0000\u0000S\u0136\u0001\u0000\u0000\u0000U\u013b\u0001\u0000"+
		"\u0000\u0000W\u013e\u0001\u0000\u0000\u0000Y\u0145\u0001\u0000\u0000\u0000"+
		"[\u0148\u0001\u0000\u0000\u0000]\u014b\u0001\u0000\u0000\u0000_\u0150"+
		"\u0001\u0000\u0000\u0000a\u0153\u0001\u0000\u0000\u0000c\u0159\u0001\u0000"+
		"\u0000\u0000e\u015f\u0001\u0000\u0000\u0000g\u0163\u0001\u0000\u0000\u0000"+
		"i\u0166\u0001\u0000\u0000\u0000k\u0169\u0001\u0000\u0000\u0000m\u016b"+
		"\u0001\u0000\u0000\u0000o\u0173\u0001\u0000\u0000\u0000q\u017a\u0001\u0000"+
		"\u0000\u0000s\u0180\u0001\u0000\u0000\u0000u\u0187\u0001\u0000\u0000\u0000"+
		"w\u018e\u0001\u0000\u0000\u0000y\u0194\u0001\u0000\u0000\u0000{\u019b"+
		"\u0001\u0000\u0000\u0000}\u01a3\u0001\u0000\u0000\u0000\u007f\u01a8\u0001"+
		"\u0000\u0000\u0000\u0081\u01ac\u0001\u0000\u0000\u0000\u0083\u01b1\u0001"+
		"\u0000\u0000\u0000\u0085\u01bb\u0001\u0000\u0000\u0000\u0087\u01c3\u0001"+
		"\u0000\u0000\u0000\u0089\u01c8\u0001\u0000\u0000\u0000\u008b\u01cc\u0001"+
		"\u0000\u0000\u0000\u008d\u01d5\u0001\u0000\u0000\u0000\u008f\u01de\u0001"+
		"\u0000\u0000\u0000\u0091\u01e7\u0001\u0000\u0000\u0000\u0093\u01ee\u0001"+
		"\u0000\u0000\u0000\u0095\u01f6\u0001\u0000\u0000\u0000\u0097\u0204\u0001"+
		"\u0000\u0000\u0000\u0099\u0207\u0001\u0000\u0000\u0000\u009b\u020c\u0001"+
		"\u0000\u0000\u0000\u009d\u0218\u0001\u0000\u0000\u0000\u009f\u0221\u0001"+
		"\u0000\u0000\u0000\u00a1\u0228\u0001\u0000\u0000\u0000\u00a3\u0235\u0001"+
		"\u0000\u0000\u0000\u00a5\u0243\u0001\u0000\u0000\u0000\u00a7\u0248\u0001"+
		"\u0000\u0000\u0000\u00a9\u024c\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"+
		"{\u0000\u0000\u00ac\u0002\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005}\u0000"+
		"\u0000\u00ae\u0004\u0001\u0000\u0000\u0000\u00af\u00b0\u0005;\u0000\u0000"+
		"\u00b0\u0006\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005=\u0000\u0000\u00b2"+
		"\b\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005.\u0000\u0000\u00b4\n\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005[\u0000\u0000\u00b6\f\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005]\u0000\u0000\u00b8\u000e\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005:\u0000\u0000\u00ba\u0010\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005c\u0000\u0000\u00bc\u00bd\u0005l\u0000\u0000\u00bd\u00be"+
		"\u0005o\u0000\u0000\u00be\u00bf\u0005s\u0000\u0000\u00bf\u00c0\u0005e"+
		"\u0000\u0000\u00c0\u0012\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005r\u0000"+
		"\u0000\u00c2\u00c3\u0005e\u0000\u0000\u00c3\u00c4\u0005f\u0000\u0000\u00c4"+
		"\u00c5\u0005r\u0000\u0000\u00c5\u00c6\u0005e\u0000\u0000\u00c6\u00c7\u0005"+
		"s\u0000\u0000\u00c7\u00c8\u0005h\u0000\u0000\u00c8\u0014\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0005a\u0000\u0000\u00ca\u00cb\u0005f\u0000\u0000\u00cb"+
		"\u00cc\u0005t\u0000\u0000\u00cc\u00cd\u0005e\u0000\u0000\u00cd\u00ce\u0005"+
		"r\u0000\u0000\u00ce\u0016\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005p\u0000"+
		"\u0000\u00d0\u00d1\u0005r\u0000\u0000\u00d1\u00d2\u0005i\u0000\u0000\u00d2"+
		"\u00d3\u0005n\u0000\u0000\u00d3\u00d4\u0005t\u0000\u0000\u00d4\u0018\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005m\u0000\u0000\u00d6\u00d7\u0005o\u0000"+
		"\u0000\u00d7\u00d8\u0005v\u0000\u0000\u00d8\u00d9\u0005e\u0000\u0000\u00d9"+
		"\u001a\u0001\u0000\u0000\u0000\u00da\u00db\u0005b\u0000\u0000\u00db\u00dc"+
		"\u0005y\u0000\u0000\u00dc\u001c\u0001\u0000\u0000\u0000\u00dd\u00de\u0005"+
		"t\u0000\u0000\u00de\u00df\u0005o\u0000\u0000\u00df\u001e\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0005p\u0000\u0000\u00e1\u00e2\u0005l\u0000\u0000\u00e2"+
		"\u00e3\u0005a\u0000\u0000\u00e3\u00e4\u0005y\u0000\u0000\u00e4 \u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005w\u0000\u0000\u00e6\u00e7\u0005i\u0000"+
		"\u0000\u00e7\u00e8\u0005t\u0000\u0000\u00e8\u00e9\u0005h\u0000\u0000\u00e9"+
		"\"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005-\u0000\u0000\u00eb$\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0005+\u0000\u0000\u00ed&\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0005^\u0000\u0000\u00ef(\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0005*\u0000\u0000\u00f1*\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005"+
		"/\u0000\u0000\u00f3,\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005%\u0000"+
		"\u0000\u00f5.\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005(\u0000\u0000\u00f7"+
		"0\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005)\u0000\u0000\u00f92\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0005!\u0000\u0000\u00fb4\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0005=\u0000\u0000\u00fd\u00fe\u0005=\u0000\u0000\u00fe"+
		"6\u0001\u0000\u0000\u0000\u00ff\u0100\u0005!\u0000\u0000\u0100\u0101\u0005"+
		"=\u0000\u0000\u01018\u0001\u0000\u0000\u0000\u0102\u0103\u0005<\u0000"+
		"\u0000\u0103:\u0001\u0000\u0000\u0000\u0104\u0105\u0005<\u0000\u0000\u0105"+
		"\u0106\u0005=\u0000\u0000\u0106<\u0001\u0000\u0000\u0000\u0107\u0108\u0005"+
		">\u0000\u0000\u0108>\u0001\u0000\u0000\u0000\u0109\u010a\u0005>\u0000"+
		"\u0000\u010a\u010b\u0005=\u0000\u0000\u010b@\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0005&\u0000\u0000\u010d\u010e\u0005&\u0000\u0000\u010eB\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0005|\u0000\u0000\u0110\u0111\u0005|\u0000"+
		"\u0000\u0111D\u0001\u0000\u0000\u0000\u0112\u0113\u0005,\u0000\u0000\u0113"+
		"F\u0001\u0000\u0000\u0000\u0114\u0115\u0005w\u0000\u0000\u0115\u0116\u0005"+
		"a\u0000\u0000\u0116\u0117\u0005i\u0000\u0000\u0117\u0118\u0005t\u0000"+
		"\u0000\u0118H\u0001\u0000\u0000\u0000\u0119\u011a\u0005m\u0000\u0000\u011a"+
		"\u011b\u0005o\u0000\u0000\u011b\u011c\u0005u\u0000\u0000\u011c\u011d\u0005"+
		"s\u0000\u0000\u011d\u011e\u0005e\u0000\u0000\u011e\u011f\u0005 \u0000"+
		"\u0000\u011f\u0120\u0005c\u0000\u0000\u0120\u0121\u0005l\u0000\u0000\u0121"+
		"\u0122\u0005i\u0000\u0000\u0122\u0123\u0005c\u0000\u0000\u0123\u0124\u0005"+
		"k\u0000\u0000\u0124J\u0001\u0000\u0000\u0000\u0125\u0126\u0005i\u0000"+
		"\u0000\u0126\u0127\u0005n\u0000\u0000\u0127\u0128\u0005p\u0000\u0000\u0128"+
		"\u0129\u0005u\u0000\u0000\u0129\u012a\u0005t\u0000\u0000\u012aL\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0005l\u0000\u0000\u012c\u012d\u0005o\u0000"+
		"\u0000\u012d\u012e\u0005a\u0000\u0000\u012e\u012f\u0005d\u0000\u0000\u012f"+
		"N\u0001\u0000\u0000\u0000\u0130\u0131\u0005a\u0000\u0000\u0131\u0132\u0005"+
		"t\u0000\u0000\u0132P\u0001\u0000\u0000\u0000\u0133\u0134\u0005d\u0000"+
		"\u0000\u0134\u0135\u0005o\u0000\u0000\u0135R\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0005E\u0000\u0000\u0137\u0138\u0005n\u0000\u0000\u0138\u0139\u0005"+
		"u\u0000\u0000\u0139\u013a\u0005m\u0000\u0000\u013aT\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0005i\u0000\u0000\u013c\u013d\u0005n\u0000\u0000\u013d"+
		"V\u0001\u0000\u0000\u0000\u013e\u013f\u0005a\u0000\u0000\u013f\u0140\u0005"+
		"c\u0000\u0000\u0140\u0141\u0005t\u0000\u0000\u0141\u0142\u0005i\u0000"+
		"\u0000\u0142\u0143\u0005o\u0000\u0000\u0143\u0144\u0005n\u0000\u0000\u0144"+
		"X\u0001\u0000\u0000\u0000\u0145\u0146\u0005o\u0000\u0000\u0146\u0147\u0005"+
		"n\u0000\u0000\u0147Z\u0001\u0000\u0000\u0000\u0148\u0149\u0005i\u0000"+
		"\u0000\u0149\u014a\u0005f\u0000\u0000\u014a\\\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0005e\u0000\u0000\u014c\u014d\u0005l\u0000\u0000\u014d\u014e"+
		"\u0005s\u0000\u0000\u014e\u014f\u0005e\u0000\u0000\u014f^\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0005:\u0000\u0000\u0151\u0152\u0005:\u0000\u0000"+
		"\u0152`\u0001\u0000\u0000\u0000\u0153\u0154\u0005M\u0000\u0000\u0154\u0155"+
		"\u0005o\u0000\u0000\u0155\u0156\u0005d\u0000\u0000\u0156\u0157\u0005e"+
		"\u0000\u0000\u0157\u0158\u0005l\u0000\u0000\u0158b\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\u0005w\u0000\u0000\u015a\u015b\u0005h\u0000\u0000\u015b\u015c"+
		"\u0005i\u0000\u0000\u015c\u015d\u0005l\u0000\u0000\u015d\u015e\u0005e"+
		"\u0000\u0000\u015ed\u0001\u0000\u0000\u0000\u015f\u0160\u0005f\u0000\u0000"+
		"\u0160\u0161\u0005o\u0000\u0000\u0161\u0162\u0005r\u0000\u0000\u0162f"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u0005.\u0000\u0000\u0164\u0165\u0005"+
		".\u0000\u0000\u0165h\u0001\u0000\u0000\u0000\u0166\u0167\u0005m\u0000"+
		"\u0000\u0167\u0168\u0005s\u0000\u0000\u0168j\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0005s\u0000\u0000\u016al\u0001\u0000\u0000\u0000\u016b\u016c\u0005"+
		"I\u0000\u0000\u016c\u016d\u0005n\u0000\u0000\u016d\u016e\u0005t\u0000"+
		"\u0000\u016e\u016f\u0005e\u0000\u0000\u016f\u0170\u0005g\u0000\u0000\u0170"+
		"\u0171\u0005e\u0000\u0000\u0171\u0172\u0005r\u0000\u0000\u0172n\u0001"+
		"\u0000\u0000\u0000\u0173\u0174\u0005N\u0000\u0000\u0174\u0175\u0005u\u0000"+
		"\u0000\u0175\u0176\u0005m\u0000\u0000\u0176\u0177\u0005b\u0000\u0000\u0177"+
		"\u0178\u0005e\u0000\u0000\u0178\u0179\u0005r\u0000\u0000\u0179p\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u0005P\u0000\u0000\u017b\u017c\u0005o\u0000"+
		"\u0000\u017c\u017d\u0005i\u0000\u0000\u017d\u017e\u0005n\u0000\u0000\u017e"+
		"\u017f\u0005t\u0000\u0000\u017fr\u0001\u0000\u0000\u0000\u0180\u0181\u0005"+
		"V\u0000\u0000\u0181\u0182\u0005e\u0000\u0000\u0182\u0183\u0005c\u0000"+
		"\u0000\u0183\u0184\u0005t\u0000\u0000\u0184\u0185\u0005o\u0000\u0000\u0185"+
		"\u0186\u0005r\u0000\u0000\u0186t\u0001\u0000\u0000\u0000\u0187\u0188\u0005"+
		"S\u0000\u0000\u0188\u0189\u0005t\u0000\u0000\u0189\u018a\u0005r\u0000"+
		"\u0000\u018a\u018b\u0005i\u0000\u0000\u018b\u018c\u0005n\u0000\u0000\u018c"+
		"\u018d\u0005g\u0000\u0000\u018dv\u0001\u0000\u0000\u0000\u018e\u018f\u0005"+
		"A\u0000\u0000\u018f\u0190\u0005r\u0000\u0000\u0190\u0191\u0005r\u0000"+
		"\u0000\u0191\u0192\u0005a\u0000\u0000\u0192\u0193\u0005y\u0000\u0000\u0193"+
		"x\u0001\u0000\u0000\u0000\u0194\u0195\u0005S\u0000\u0000\u0195\u0196\u0005"+
		"c\u0000\u0000\u0196\u0197\u0005r\u0000\u0000\u0197\u0198\u0005i\u0000"+
		"\u0000\u0198\u0199\u0005p\u0000\u0000\u0199\u019a\u0005t\u0000\u0000\u019a"+
		"z\u0001\u0000\u0000\u0000\u019b\u019c\u0005B\u0000\u0000\u019c\u019d\u0005"+
		"o\u0000\u0000\u019d\u019e\u0005o\u0000\u0000\u019e\u019f\u0005l\u0000"+
		"\u0000\u019f\u01a0\u0005e\u0000\u0000\u01a0\u01a1\u0005a\u0000\u0000\u01a1"+
		"\u01a2\u0005n\u0000\u0000\u01a2|\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005"+
		"V\u0000\u0000\u01a4\u01a5\u0005i\u0000\u0000\u01a5\u01a6\u0005e\u0000"+
		"\u0000\u01a6\u01a7\u0005w\u0000\u0000\u01a7~\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0005D\u0000\u0000\u01a9\u01aa\u0005o\u0000\u0000\u01aa\u01ab\u0005"+
		"t\u0000\u0000\u01ab\u0080\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005L\u0000"+
		"\u0000\u01ad\u01ae\u0005i\u0000\u0000\u01ae\u01af\u0005n\u0000\u0000\u01af"+
		"\u01b0\u0005e\u0000\u0000\u01b0\u0082\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0005R\u0000\u0000\u01b2\u01b3\u0005e\u0000\u0000\u01b3\u01b4\u0005c"+
		"\u0000\u0000\u01b4\u01b5\u0005t\u0000\u0000\u01b5\u01b6\u0005a\u0000\u0000"+
		"\u01b6\u01b7\u0005n\u0000\u0000\u01b7\u01b8\u0005g\u0000\u0000\u01b8\u01b9"+
		"\u0005l\u0000\u0000\u01b9\u01ba\u0005e\u0000\u0000\u01ba\u0084\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u0005E\u0000\u0000\u01bc\u01bd\u0005l\u0000\u0000"+
		"\u01bd\u01be\u0005l\u0000\u0000\u01be\u01bf\u0005i\u0000\u0000\u01bf\u01c0"+
		"\u0005p\u0000\u0000\u01c0\u01c1\u0005s\u0000\u0000\u01c1\u01c2\u0005e"+
		"\u0000\u0000\u01c2\u0086\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005T\u0000"+
		"\u0000\u01c4\u01c5\u0005e\u0000\u0000\u01c5\u01c6\u0005x\u0000\u0000\u01c6"+
		"\u01c7\u0005t\u0000\u0000\u01c7\u0088\u0001\u0000\u0000\u0000\u01c8\u01c9"+
		"\u0005A\u0000\u0000\u01c9\u01ca\u0005r\u0000\u0000\u01ca\u01cb\u0005c"+
		"\u0000\u0000\u01cb\u008a\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005A\u0000"+
		"\u0000\u01cd\u01ce\u0005r\u0000\u0000\u01ce\u01cf\u0005c\u0000\u0000\u01cf"+
		"\u01d0\u0005C\u0000\u0000\u01d0\u01d1\u0005h\u0000\u0000\u01d1\u01d2\u0005"+
		"o\u0000\u0000\u01d2\u01d3\u0005r\u0000\u0000\u01d3\u01d4\u0005d\u0000"+
		"\u0000\u01d4\u008c\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005P\u0000\u0000"+
		"\u01d6\u01d7\u0005i\u0000\u0000\u01d7\u01d8\u0005e\u0000\u0000\u01d8\u01d9"+
		"\u0005S\u0000\u0000\u01d9\u01da\u0005l\u0000\u0000\u01da\u01db\u0005i"+
		"\u0000\u0000\u01db\u01dc\u0005c\u0000\u0000\u01dc\u01dd\u0005e\u0000\u0000"+
		"\u01dd\u008e\u0001\u0000\u0000\u0000\u01de\u01df\u0005P\u0000\u0000\u01df"+
		"\u01e0\u0005o\u0000\u0000\u01e0\u01e1\u0005l\u0000\u0000\u01e1\u01e2\u0005"+
		"y\u0000\u0000\u01e2\u01e3\u0005l\u0000\u0000\u01e3\u01e4\u0005i\u0000"+
		"\u0000\u01e4\u01e5\u0005n\u0000\u0000\u01e5\u01e6\u0005e\u0000\u0000\u01e6"+
		"\u0090\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005S\u0000\u0000\u01e8\u01e9"+
		"\u0005p\u0000\u0000\u01e9\u01ea\u0005l\u0000\u0000\u01ea\u01eb\u0005i"+
		"\u0000\u0000\u01eb\u01ec\u0005n\u0000\u0000\u01ec\u01ed\u0005e\u0000\u0000"+
		"\u01ed\u0092\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005P\u0000\u0000\u01ef"+
		"\u01f0\u0005o\u0000\u0000\u01f0\u01f1\u0005l\u0000\u0000\u01f1\u01f2\u0005"+
		"y\u0000\u0000\u01f2\u01f3\u0005g\u0000\u0000\u01f3\u01f4\u0005o\u0000"+
		"\u0000\u01f4\u01f5\u0005n\u0000\u0000\u01f5\u0094\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f7\u0005B\u0000\u0000\u01f7\u01f8\u0005l\u0000\u0000\u01f8\u01f9"+
		"\u0005o\u0000\u0000\u01f9\u01fa\u0005b\u0000\u0000\u01fa\u0096\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0005T\u0000\u0000\u01fc\u01fd\u0005r\u0000\u0000"+
		"\u01fd\u01fe\u0005u\u0000\u0000\u01fe\u0205\u0005e\u0000\u0000\u01ff\u0200"+
		"\u0005F\u0000\u0000\u0200\u0201\u0005a\u0000\u0000\u0201\u0202\u0005l"+
		"\u0000\u0000\u0202\u0203\u0005s\u0000\u0000\u0203\u0205\u0005e\u0000\u0000"+
		"\u0204\u01fb\u0001\u0000\u0000\u0000\u0204\u01ff\u0001\u0000\u0000\u0000"+
		"\u0205\u0098\u0001\u0000\u0000\u0000\u0206\u0208\u0007\u0000\u0000\u0000"+
		"\u0207\u0206\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000"+
		"\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000"+
		"\u020a\u009a\u0001\u0000\u0000\u0000\u020b\u020d\u0007\u0000\u0000\u0000"+
		"\u020c\u020b\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000"+
		"\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000"+
		"\u020f\u0216\u0001\u0000\u0000\u0000\u0210\u0212\u0005.\u0000\u0000\u0211"+
		"\u0213\u0007\u0000\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0213"+
		"\u0214\u0001\u0000\u0000\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0214"+
		"\u0215\u0001\u0000\u0000\u0000\u0215\u0217\u0001\u0000\u0000\u0000\u0216"+
		"\u0210\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217"+
		"\u009c\u0001\u0000\u0000\u0000\u0218\u021c\u0005\"\u0000\u0000\u0219\u021b"+
		"\t\u0000\u0000\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021b\u021e\u0001"+
		"\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021c\u021a\u0001"+
		"\u0000\u0000\u0000\u021d\u021f\u0001\u0000\u0000\u0000\u021e\u021c\u0001"+
		"\u0000\u0000\u0000\u021f\u0220\u0005\"\u0000\u0000\u0220\u009e\u0001\u0000"+
		"\u0000\u0000\u0221\u0225\u0007\u0001\u0000\u0000\u0222\u0224\u0007\u0002"+
		"\u0000\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0224\u0227\u0001\u0000"+
		"\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000"+
		"\u0000\u0000\u0226\u00a0\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000"+
		"\u0000\u0000\u0228\u022c\u0005#\u0000\u0000\u0229\u022b\t\u0000\u0000"+
		"\u0000\u022a\u0229\u0001\u0000\u0000\u0000\u022b\u022e\u0001\u0000\u0000"+
		"\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022c\u022a\u0001\u0000\u0000"+
		"\u0000\u022d\u0231\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000"+
		"\u0000\u022f\u0232\u0003\u00a7S\u0000\u0230\u0232\u0005\u0000\u0000\u0001"+
		"\u0231\u022f\u0001\u0000\u0000\u0000\u0231\u0230\u0001\u0000\u0000\u0000"+
		"\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0234\u0006P\u0000\u0000\u0234"+
		"\u00a2\u0001\u0000\u0000\u0000\u0235\u0236\u0005#\u0000\u0000\u0236\u0237"+
		"\u0005(\u0000\u0000\u0237\u023b\u0001\u0000\u0000\u0000\u0238\u023a\t"+
		"\u0000\u0000\u0000\u0239\u0238\u0001\u0000\u0000\u0000\u023a\u023d\u0001"+
		"\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023b\u0239\u0001"+
		"\u0000\u0000\u0000\u023c\u023e\u0001\u0000\u0000\u0000\u023d\u023b\u0001"+
		"\u0000\u0000\u0000\u023e\u023f\u0005#\u0000\u0000\u023f\u0240\u0005)\u0000"+
		"\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241\u0242\u0006Q\u0000\u0000"+
		"\u0242\u00a4\u0001\u0000\u0000\u0000\u0243\u0244\u0007\u0003\u0000\u0000"+
		"\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0246\u0006R\u0000\u0000\u0246"+
		"\u00a6\u0001\u0000\u0000\u0000\u0247\u0249\u0005\r\u0000\u0000\u0248\u0247"+
		"\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024a"+
		"\u0001\u0000\u0000\u0000\u024a\u024b\u0005\n\u0000\u0000\u024b\u00a8\u0001"+
		"\u0000\u0000\u0000\u024c\u024d\t\u0000\u0000\u0000\u024d\u00aa\u0001\u0000"+
		"\u0000\u0000\f\u0000\u0204\u0209\u020e\u0214\u0216\u021c\u0225\u022c\u0231"+
		"\u023b\u0248\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}