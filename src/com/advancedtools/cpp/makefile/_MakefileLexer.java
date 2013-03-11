/* The following code was generated by JFlex 1.4.1 on 02.05.10 0:04 */

/* AdvancedTools, 2007, all rights reserved */
package com.advancedtools.cpp.makefile;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 02.05.10 0:04 from the specification file
 * <tt>C:/MinGW/1.0/home/Maxim/cf-c/idea/src/com/advancedtools/cpp/makefile/MakefileLexer.flex</tt>
 */
class _MakefileLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int TARGET_IDENTIFIER_PART = 14;
  public static final int IDENTIFIER_PART = 12;
  public static final int VAR_SELECTION = 6;
  public static final int DEFINITION = 16;
  public static final int VAR_REF = 8;
  public static final int DEF_VALUE = 4;
  public static final int YYINITIAL = 0;
  public static final int CONTINUE = 2;
  public static final int TARGETS = 10;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7,  8,  8, 
     9, 9
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\30\1\2\1\0\1\1\1\3\22\0\1\32\2\0\1\6"+
    "\1\15\3\0\1\16\1\17\1\0\1\34\4\0\12\4\1\31\1\0"+
    "\1\20\1\33\2\0\1\20\32\5\1\0\1\27\1\0\1\20\1\5"+
    "\1\0\2\5\1\25\1\11\1\12\1\10\2\5\1\7\2\5\1\21"+
    "\1\5\1\13\1\24\1\5\1\14\1\23\1\22\1\5\1\26\5\5"+
    "\57\0\1\5\12\0\1\5\4\0\1\5\5\0\27\5\1\0\37\5"+
    "\1\0\u01ca\5\4\0\14\5\16\0\5\5\7\0\1\5\1\0\1\5"+
    "\201\0\5\5\1\0\2\5\2\0\4\5\10\0\1\5\1\0\3\5"+
    "\1\0\1\5\1\0\24\5\1\0\123\5\1\0\213\5\10\0\232\5"+
    "\15\0\46\5\2\0\1\5\7\0\47\5\110\0\33\5\5\0\3\5"+
    "\56\0\52\5\43\0\2\5\1\0\143\5\1\0\1\5\17\0\2\5"+
    "\7\0\2\5\12\0\3\5\2\0\1\5\20\0\1\5\1\0\36\5"+
    "\35\0\131\5\13\0\1\5\30\0\41\5\11\0\2\5\4\0\1\5"+
    "\u0109\0\66\5\3\0\1\5\22\0\1\5\7\0\12\5\17\0\2\5"+
    "\10\0\5\5\5\0\10\5\2\0\2\5\2\0\26\5\1\0\7\5"+
    "\1\0\1\5\3\0\4\5\3\0\1\5\20\0\1\5\15\0\2\5"+
    "\1\0\3\5\16\0\2\5\23\0\6\5\4\0\2\5\2\0\26\5"+
    "\1\0\7\5\1\0\2\5\1\0\2\5\1\0\2\5\37\0\4\5"+
    "\1\0\1\5\23\0\3\5\20\0\11\5\1\0\3\5\1\0\26\5"+
    "\1\0\7\5\1\0\2\5\1\0\5\5\3\0\1\5\22\0\1\5"+
    "\17\0\2\5\43\0\10\5\2\0\2\5\2\0\26\5\1\0\7\5"+
    "\1\0\2\5\1\0\5\5\3\0\1\5\36\0\2\5\1\0\3\5"+
    "\17\0\1\5\21\0\1\5\1\0\6\5\3\0\3\5\1\0\4\5"+
    "\3\0\2\5\1\0\1\5\1\0\2\5\3\0\2\5\3\0\3\5"+
    "\3\0\14\5\26\0\1\5\64\0\10\5\1\0\3\5\1\0\27\5"+
    "\1\0\12\5\1\0\5\5\3\0\1\5\32\0\2\5\6\0\2\5"+
    "\43\0\10\5\1\0\3\5\1\0\27\5\1\0\12\5\1\0\5\5"+
    "\3\0\1\5\40\0\1\5\1\0\2\5\43\0\10\5\1\0\3\5"+
    "\1\0\27\5\1\0\20\5\3\0\1\5\42\0\2\5\30\0\6\5"+
    "\5\0\22\5\3\0\30\5\1\0\11\5\1\0\1\5\2\0\7\5"+
    "\72\0\60\5\1\0\2\5\14\0\7\5\72\0\2\5\1\0\1\5"+
    "\2\0\2\5\1\0\1\5\2\0\1\5\6\0\4\5\1\0\7\5"+
    "\1\0\3\5\1\0\1\5\1\0\1\5\2\0\2\5\1\0\4\5"+
    "\1\0\2\5\11\0\1\5\2\0\5\5\1\0\1\5\25\0\2\5"+
    "\42\0\1\5\77\0\10\5\1\0\44\5\33\0\4\5\164\0\53\5"+
    "\24\0\1\5\20\0\6\5\4\0\4\5\3\0\1\5\3\0\2\5"+
    "\7\0\3\5\4\0\15\5\14\0\1\5\21\0\46\5\12\0\53\5"+
    "\1\0\1\5\3\0\132\5\5\0\104\5\5\0\122\5\6\0\111\5"+
    "\1\0\4\5\2\0\7\5\1\0\1\5\1\0\4\5\2\0\51\5"+
    "\1\0\4\5\2\0\41\5\1\0\4\5\2\0\7\5\1\0\1\5"+
    "\1\0\4\5\2\0\17\5\1\0\71\5\1\0\4\5\2\0\103\5"+
    "\45\0\20\5\20\0\125\5\14\0\u026c\5\2\0\10\5\12\0\32\5"+
    "\5\0\113\5\25\0\15\5\1\0\4\5\16\0\22\5\16\0\22\5"+
    "\16\0\15\5\1\0\3\5\17\0\64\5\43\0\1\5\4\0\1\5"+
    "\103\0\130\5\10\0\51\5\1\0\1\5\125\0\35\5\63\0\36\5"+
    "\2\0\5\5\13\0\52\5\27\0\7\5\70\0\27\5\356\0\57\5"+
    "\21\0\7\5\67\0\36\5\15\0\2\5\120\0\44\5\51\0\3\5"+
    "\12\0\44\5\202\0\300\5\100\0\u0116\5\2\0\6\5\2\0\46\5"+
    "\2\0\6\5\2\0\10\5\1\0\1\5\1\0\1\5\1\0\1\5"+
    "\1\0\37\5\2\0\65\5\1\0\7\5\1\0\1\5\3\0\3\5"+
    "\1\0\7\5\3\0\4\5\2\0\6\5\4\0\15\5\5\0\3\5"+
    "\1\0\7\5\164\0\1\5\15\0\1\5\20\0\5\5\155\0\1\5"+
    "\4\0\1\5\2\0\12\5\1\0\1\5\3\0\5\5\6\0\1\5"+
    "\1\0\1\5\1\0\1\5\1\0\4\5\1\0\13\5\2\0\4\5"+
    "\5\0\5\5\4\0\1\5\64\0\2\5\u0a7b\0\57\5\1\0\57\5"+
    "\1\0\20\5\1\0\15\5\2\0\145\5\33\0\46\5\12\0\66\5"+
    "\11\0\1\5\20\0\27\5\11\0\7\5\1\0\7\5\1\0\7\5"+
    "\1\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5"+
    "\120\0\1\5\u01d5\0\2\5\52\0\5\5\5\0\2\5\4\0\126\5"+
    "\6\0\3\5\1\0\132\5\1\0\4\5\5\0\51\5\3\0\136\5"+
    "\21\0\30\5\70\0\20\5\u0200\0\u19b6\5\112\0\u51c4\5\74\0\u048d\5"+
    "\163\0\u010d\5\3\0\20\5\12\0\2\5\24\0\40\5\2\0\15\5"+
    "\20\0\31\5\177\0\11\5\2\0\147\5\2\0\2\5\156\0\7\5"+
    "\1\0\3\5\1\0\4\5\1\0\27\5\35\0\64\5\16\0\62\5"+
    "\126\0\34\5\12\0\27\5\271\0\51\5\27\0\3\5\1\0\10\5"+
    "\u01b4\0\u2ba4\5\u215c\0\u012e\5\2\0\73\5\5\0\152\5\46\0\7\5"+
    "\14\0\5\5\5\0\1\5\1\0\12\5\1\0\15\5\1\0\5\5"+
    "\1\0\1\5\1\0\2\5\1\0\2\5\1\0\154\5\41\0\u016b\5"+
    "\22\0\100\5\2\0\66\5\50\0\14\5\164\0\5\5\1\0\207\5"+
    "\44\0\32\5\6\0\32\5\13\0\131\5\3\0\6\5\2\0\6\5"+
    "\2\0\6\5\2\0\3\5\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\12\0\1\1\1\2\2\3\1\4\4\1\1\2\1\3"+
    "\1\1\1\4\3\1\1\2\1\5\2\2\1\6\1\1"+
    "\1\3\2\1\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\2\1\15\1\16\2\17\1\20\1\21\1\1\1\22"+
    "\1\23\1\24\1\1\5\0\1\25\1\26\1\0\1\27"+
    "\2\0\1\30\6\0\1\25\1\26\2\0\2\31\1\0"+
    "\1\32\7\0\1\30\11\0\1\33\3\0\1\34\2\0"+
    "\1\33\3\0\1\34\1\0\1\35\2\0\1\36\1\37"+
    "\1\35\2\0\1\36\1\37\1\40\1\0\1\40\1\0"+
    "\2\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\35\0\72\0\127\0\164\0\221\0\256\0\313"+
    "\0\350\0\u0105\0\u0122\0\u013f\0\u0122\0\u015c\0\u0179\0\u0196"+
    "\0\u01b3\0\u01d0\0\u01ed\0\u020a\0\u0227\0\u0244\0\u0261\0\u027e"+
    "\0\u029b\0\u02b8\0\u02d5\0\u0122\0\u0122\0\u02f2\0\u0122\0\u030f"+
    "\0\u032c\0\u0349\0\u0366\0\u0122\0\u0383\0\u0122\0\u0122\0\u03a0"+
    "\0\u03bd\0\u03da\0\u0122\0\u03f7\0\u0122\0\u0414\0\u0431\0\u0122"+
    "\0\u044e\0\u0122\0\u046b\0\u0122\0\u0488\0\u04a5\0\u04c2\0\u04df"+
    "\0\u04fc\0\u0519\0\u0122\0\u0122\0\u01ed\0\u01ed\0\u0244\0\u0536"+
    "\0\u01ed\0\u0553\0\u0570\0\u058d\0\u05aa\0\u05c7\0\u05e4\0\u01ed"+
    "\0\u01ed\0\u0601\0\u061e\0\u0122\0\u063b\0\u0658\0\u0122\0\u0675"+
    "\0\u0692\0\u06af\0\u06cc\0\u06e9\0\u0706\0\u0723\0\u0122\0\u0740"+
    "\0\u075d\0\u077a\0\u0797\0\u07b4\0\u07d1\0\u07ee\0\u080b\0\u0828"+
    "\0\u0122\0\u0845\0\u0862\0\u087f\0\u0122\0\u089c\0\u08b9\0\u0244"+
    "\0\u08d6\0\u08f3\0\u0910\0\u0244\0\u092d\0\u0122\0\u094a\0\u0967"+
    "\0\u0122\0\u0122\0\u0244\0\u0984\0\u09a1\0\u0244\0\u0244\0\u0122"+
    "\0\u09be\0\u0244\0\u09db\0\u0122\0\u0244";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\13\1\14\1\15\1\16\2\13\1\17\1\20\2\13"+
    "\1\21\2\13\1\22\12\13\1\14\1\13\1\14\2\13"+
    "\1\23\1\24\1\15\1\25\1\23\1\26\1\27\1\30"+
    "\2\26\1\31\2\26\1\32\3\23\6\26\1\23\1\14"+
    "\1\23\1\33\2\23\2\34\1\35\1\36\23\34\1\37"+
    "\5\34\2\40\1\15\1\41\11\40\1\42\11\40\1\43"+
    "\1\13\1\40\1\13\2\40\1\44\1\14\3\44\1\45"+
    "\1\44\6\45\2\44\1\46\1\44\6\45\1\44\1\14"+
    "\1\44\1\14\2\44\1\47\1\14\3\47\1\50\1\47"+
    "\6\50\4\47\6\50\1\47\1\14\1\47\1\14\2\47"+
    "\1\51\1\52\1\53\25\51\1\14\1\13\1\14\2\51"+
    "\2\54\1\55\12\54\1\56\12\54\1\55\1\54\1\55"+
    "\2\54\2\57\1\60\12\57\1\61\12\57\1\60\1\62"+
    "\1\60\2\57\1\13\1\14\1\15\1\16\1\13\1\63"+
    "\1\13\6\63\4\13\6\63\1\13\1\14\1\13\1\14"+
    "\1\64\1\65\36\0\1\14\26\0\1\14\1\0\1\14"+
    "\4\0\1\15\32\0\2\17\2\0\31\17\10\0\1\66"+
    "\2\0\1\67\34\0\1\70\5\0\1\71\1\0\1\72"+
    "\27\0\1\73\1\0\1\74\14\0\2\75\1\0\25\75"+
    "\1\0\1\76\1\0\3\75\1\24\1\0\25\75\1\14"+
    "\1\76\1\14\4\75\1\15\25\75\1\0\1\76\1\0"+
    "\4\75\1\0\1\75\2\77\1\75\6\77\4\75\6\77"+
    "\1\75\1\0\1\76\1\100\1\101\1\102\2\27\1\0"+
    "\1\75\24\27\1\17\1\27\1\17\2\27\2\75\1\0"+
    "\1\75\2\77\1\75\1\77\1\103\2\77\1\104\1\77"+
    "\4\75\6\77\1\75\1\0\1\76\1\100\1\101\1\102"+
    "\2\75\1\0\1\75\2\77\1\75\4\77\1\105\1\77"+
    "\4\75\1\106\1\77\1\107\3\77\1\75\1\0\1\76"+
    "\1\100\1\101\1\102\2\75\1\0\13\75\1\110\1\75"+
    "\1\111\7\75\1\0\1\76\1\0\2\75\1\0\1\14"+
    "\3\0\1\112\1\0\6\112\4\0\6\112\1\0\1\14"+
    "\1\0\1\33\4\0\1\35\32\0\2\40\1\0\12\40"+
    "\1\113\11\40\2\0\1\40\1\0\4\40\1\15\12\40"+
    "\1\113\11\40\2\0\1\40\1\0\20\40\1\73\10\40"+
    "\1\0\5\40\2\0\1\114\1\115\35\0\2\45\1\0"+
    "\6\45\4\0\6\45\12\0\2\50\1\0\6\50\4\0"+
    "\6\50\6\0\2\51\1\0\25\51\3\0\3\51\1\52"+
    "\1\0\25\51\1\14\1\0\1\14\2\51\2\54\1\0"+
    "\12\54\1\116\12\54\1\0\1\54\1\0\20\54\1\73"+
    "\16\54\2\57\1\0\12\57\1\0\12\57\3\0\2\57"+
    "\16\0\1\73\22\0\2\63\1\0\6\63\4\0\6\63"+
    "\41\0\1\117\12\0\1\120\1\121\1\122\46\0\1\123"+
    "\20\0\1\124\45\0\1\125\35\0\1\126\43\0\1\100"+
    "\1\127\1\130\2\75\1\0\25\75\1\0\1\76\1\0"+
    "\1\101\3\75\1\0\1\75\2\77\1\75\2\77\1\131"+
    "\1\132\1\133\1\77\4\75\6\77\1\75\1\0\1\76"+
    "\1\100\1\101\1\102\2\75\1\0\1\75\2\77\1\75"+
    "\6\77\4\75\4\77\1\134\1\77\1\75\1\0\1\76"+
    "\1\100\1\101\1\102\2\75\1\0\1\75\2\77\1\75"+
    "\2\77\1\135\3\77\4\75\6\77\1\75\1\0\1\76"+
    "\1\100\1\101\1\102\2\75\1\0\1\75\2\77\1\75"+
    "\6\77\4\75\1\77\1\136\4\77\1\75\1\0\1\76"+
    "\1\100\1\101\1\102\2\75\1\0\1\75\2\77\1\75"+
    "\6\77\4\75\2\77\1\137\3\77\1\75\1\0\1\76"+
    "\1\100\1\101\1\102\4\0\2\112\1\0\6\112\4\0"+
    "\6\112\3\0\1\100\1\127\1\130\16\40\1\0\10\40"+
    "\1\0\5\40\2\0\1\114\32\0\16\54\1\0\16\54"+
    "\12\0\1\140\36\0\1\141\31\0\1\142\44\0\1\143"+
    "\22\0\1\144\37\0\1\145\46\0\1\146\43\0\1\127"+
    "\1\0\2\75\1\0\1\75\2\77\1\75\3\77\1\147"+
    "\2\77\4\75\6\77\1\75\1\0\1\76\1\100\1\101"+
    "\1\102\2\75\1\0\1\75\2\77\1\75\5\77\1\150"+
    "\4\75\6\77\1\75\1\0\1\76\1\100\1\101\1\102"+
    "\2\75\1\0\1\75\2\77\1\75\2\77\1\151\3\77"+
    "\4\75\6\77\1\75\1\0\1\76\1\100\1\101\1\102"+
    "\2\75\1\0\1\75\2\77\1\75\6\77\4\75\1\152"+
    "\5\77\1\75\1\0\1\76\1\100\1\101\1\102\2\75"+
    "\1\0\1\75\2\77\1\75\1\153\5\77\4\75\6\77"+
    "\1\75\1\0\1\76\1\100\1\101\1\102\2\75\1\0"+
    "\1\75\2\77\1\75\3\77\1\154\2\77\4\75\6\77"+
    "\1\75\1\0\1\76\1\100\1\101\1\102\2\75\1\0"+
    "\1\75\2\77\1\75\6\77\4\75\3\77\1\155\2\77"+
    "\1\75\1\0\1\76\1\100\1\101\1\102\10\0\1\156"+
    "\36\0\1\157\50\0\1\160\16\0\1\161\47\0\1\162"+
    "\11\0\2\75\1\0\1\75\2\77\1\75\1\77\1\163"+
    "\4\77\4\75\6\77\1\75\1\0\1\76\1\100\1\101"+
    "\1\102\2\75\1\0\1\75\2\77\1\75\3\77\1\164"+
    "\2\77\4\75\6\77\1\75\1\0\1\76\1\100\1\101"+
    "\1\102\2\75\1\0\1\75\2\77\1\75\6\77\4\75"+
    "\5\77\1\165\1\75\1\0\1\76\1\100\1\101\1\102"+
    "\2\75\1\0\1\75\2\77\1\75\1\77\1\166\4\77"+
    "\4\75\6\77\1\75\1\0\1\76\1\100\1\101\1\102"+
    "\2\75\1\0\1\75\2\77\1\75\6\77\4\75\2\77"+
    "\1\167\3\77\1\75\1\0\1\76\1\100\1\101\1\102"+
    "\10\0\1\170\35\0\1\171\23\0\2\75\1\0\1\75"+
    "\2\77\1\75\1\77\1\172\4\77\4\75\6\77\1\75"+
    "\1\0\1\76\1\100\1\101\1\102\2\75\1\0\1\75"+
    "\2\77\1\75\2\77\1\173\3\77\4\75\6\77\1\75"+
    "\1\0\1\76\1\100\1\101\1\102\12\0\1\174\22\0"+
    "\2\75\1\0\1\75\2\77\1\75\3\77\1\175\2\77"+
    "\4\75\6\77\1\75\1\0\1\76\1\100\1\101\1\102";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2552];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\12\0\1\11\1\1\1\11\16\1\2\11\1\1\1\11"+
    "\4\1\1\11\1\1\2\11\3\1\1\11\1\1\1\11"+
    "\2\1\1\11\1\1\1\11\1\1\1\11\1\1\5\0"+
    "\2\11\1\0\1\1\2\0\1\1\6\0\2\1\2\0"+
    "\1\11\1\1\1\0\1\11\7\0\1\11\11\0\1\11"+
    "\3\0\1\11\2\0\1\1\3\0\1\1\1\0\1\11"+
    "\2\0\2\11\1\1\2\0\2\1\1\11\1\0\1\1"+
    "\1\0\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  private int prevState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public _MakefileLexer() {
      this((java.io.Reader)null);
    }

    public _MakefileLexer(boolean highlightMode) {
      this((java.io.Reader)null);
      isHighlightModeOn = highlightMode;
    }

    boolean isHighlightModeOn = false;


  _MakefileLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  _MakefileLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1410) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  private static final int SHIFT = 5;
  private static final int MASK = (1 << SHIFT) - 1;

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
    prevState = 0;
  }

  // For Demetra compatibility
  public void reset(CharSequence buffer, int initialState){
    zzBuffer = buffer;
    zzBufferArray = null; 
    zzCurrentPos = zzMarkedPos = zzStartRead = 0;
    zzPushbackPos = 0;
    zzAtEOF = false;
    zzAtBOL = true;
    zzEndRead = buffer.length();
    yybegin(initialState);
    prevState = 0;
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState + (prevState << 5);
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      if (zzMarkedPosL > zzStartRead) {
        switch ((zzBufferArray != null ? zzBufferArray[zzMarkedPosL - 1] : zzBufferL.charAt(zzMarkedPosL - 1))) {
          case '\n':
          case '\u000B':
          case '\u000C':
          case '\u0085':
          case '\u2028':
          case '\u2029':
            zzAtBOL = true;
            break;
          case '\r':
            if (zzMarkedPosL < zzEndReadL)
              zzAtBOL = (zzBufferArray != null ? zzBufferArray[zzMarkedPosL] : zzBufferL.charAt(zzMarkedPosL)) != '\n';
            else if (zzAtEOF)
              zzAtBOL = false;
            else {
              boolean eof = zzRefill();
              zzMarkedPosL = zzMarkedPos;
              zzEndReadL = zzEndRead;
              zzBufferL = zzBuffer;
              if (eof)
                zzAtBOL = false;
              else
                zzAtBOL = (zzBufferArray != null ? zzBufferArray[zzMarkedPosL] : zzBufferL.charAt(zzMarkedPosL)) != '\n';
            }
            break;
          default:
            zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArray != null ? zzBufferArray[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArray != null ? zzBufferArray[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 4: 
          { return MakefileTokenTypes.END_OF_LINE_COMMENT;
          }
        case 34: break;
        case 32: 
          { yybegin(VAR_REF); return MakefileTokenTypes.IFNDEF_KEYWORD;
          }
        case 35: break;
        case 29: 
          { yybegin(VAR_REF); return MakefileTokenTypes.IFDEF_KEYWORD;
          }
        case 36: break;
        case 18: 
          { yybegin(TARGETS); return MakefileTokenTypes.TARGET_IDENTIFIER_END;
          }
        case 37: break;
        case 24: 
          { yypushback(yylength()); yybegin(DEFINITION);
          }
        case 38: break;
        case 28: 
          { return MakefileTokenTypes.ELSE_KEYWORD;
          }
        case 39: break;
        case 14: 
          { return MakefileTokenTypes.IDENTIFIER_PART;
          }
        case 40: break;
        case 30: 
          { return MakefileTokenTypes.ENDIF_KEYWORD;
          }
        case 41: break;
        case 27: 
          { return MakefileTokenTypes.IFEQ_KEYWORD;
          }
        case 42: break;
        case 31: 
          { return MakefileTokenTypes.ERROR_KEYWORD;
          }
        case 43: break;
        case 17: 
          { yybegin(TARGETS);
          }
        case 44: break;
        case 22: 
          { return MakefileTokenTypes.BUILTIN_VAR;
          }
        case 45: break;
        case 23: 
          { yybegin(TARGET_IDENTIFIER_PART); yypushback(yylength()); return MakefileTokenTypes.TARGET_IDENTIFIER_START;
          }
        case 46: break;
        case 2: 
          { return MakefileTokenTypes.WHITE_SPACE;
          }
        case 47: break;
        case 16: 
          { return MakefileTokenTypes.TARGET_IDENTIFIER_PART;
          }
        case 48: break;
        case 3: 
          { yybegin(YYINITIAL); prevState = 0; return MakefileTokenTypes.WHITE_SPACE;
          }
        case 49: break;
        case 11: 
          { yybegin(YYINITIAL); return MakefileTokenTypes.VAR_REFERENCE;
          }
        case 50: break;
        case 1: 
          { return MakefileTokenTypes.TEMPLATE_DATA;
          }
        case 51: break;
        case 19: 
          { return MakefileTokenTypes.VAR_DEFINITION;
          }
        case 52: break;
        case 7: 
          { yybegin(prevState); prevState = 0; return MakefileTokenTypes.BAD_CHARACTER;
          }
        case 53: break;
        case 8: 
          { return MakefileTokenTypes.VAR_REFERENCE;
          }
        case 54: break;
        case 10: 
          { yybegin(YYINITIAL); return MakefileTokenTypes.BAD_CHARACTER;
          }
        case 55: break;
        case 9: 
          { yybegin(prevState); prevState = 0; return MakefileTokenTypes.VAR_REFERENCE_END;
          }
        case 56: break;
        case 15: 
          { yybegin(TARGETS); yypushback(yylength()); return MakefileTokenTypes.IDENTIFIER_END;
          }
        case 57: break;
        case 26: 
          { yybegin(DEF_VALUE); return MakefileTokenTypes.ADD_EQ;
          }
        case 58: break;
        case 21: 
          { prevState = zzLexicalState; yybegin(VAR_SELECTION); return MakefileTokenTypes.VAR_SELECTION_START;
          }
        case 59: break;
        case 13: 
          { yybegin(YYINITIAL); yypushback(1); return MakefileTokenTypes.TARGETS_END;
          }
        case 60: break;
        case 20: 
          { yybegin(DEF_VALUE); return MakefileTokenTypes.EQ;
          }
        case 61: break;
        case 12: 
          { yypushback(yylength()); yybegin(IDENTIFIER_PART); return MakefileTokenTypes.IDENTIFIER_START;
          }
        case 62: break;
        case 33: 
          { return MakefileTokenTypes.INCLUDE_KEYWORD;
          }
        case 63: break;
        case 5: 
          { yybegin(DEF_VALUE); yypushback(yylength());
          }
        case 64: break;
        case 25: 
          { yybegin(CONTINUE); yypushback(yylength());
          }
        case 65: break;
        case 6: 
          { return MakefileTokenTypes.CONTINUE_STATEMENT;
          }
        case 66: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
