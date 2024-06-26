/* The following code was generated by JFlex 1.7.0 */

package analyzersStatPy;

import java_cup.runtime.*;
import java.util.LinkedList;
import errors.LexicalError;
import tokens.Tokens;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>src/main/java/analyzersStatPy/Lexical.jflex</tt>
 */
public class Lexical implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  4,  6,  6,  5,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    30, 40,  9,  0, 55,  0, 38, 11, 43, 44,  3, 41, 52, 42,  8,  2, 
     7,  7,  7,  7,  7,  7,  7,  7,  7,  7, 54, 53, 49, 51, 50,  0, 
     0, 17, 34, 32, 27, 15, 16, 37, 33, 26, 20, 36, 18, 28, 29, 24, 
    20, 20, 13, 21, 12, 14, 23, 31, 20, 20, 20, 47, 10, 48,  0, 22, 
     0, 17, 34, 32, 27, 15, 16, 37, 33, 26, 20, 36, 18, 28, 29, 24, 
    20, 20, 13, 21, 12, 14, 23, 31, 20, 20, 20, 45, 39, 46,  0,  0, 
     0,  0,  0,  0,  0,  6,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\2\1\4\10\1\1\1\10\1\1\1\10\1\1\6\10"+
    "\2\1\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\2\3\0\1\31\3\0\4\10\2\0\3\10"+
    "\1\32\1\0\1\32\2\10\1\33\10\10\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\0\1\44"+
    "\1\31\2\45\1\10\1\0\2\10\1\46\2\0\2\10"+
    "\1\0\1\10\2\47\2\10\1\0\1\10\1\0\1\10"+
    "\1\0\1\10\1\0\5\10\1\0\1\2\1\0\1\50"+
    "\2\51\3\0\2\10\2\52\2\10\2\53\1\0\1\10"+
    "\1\0\1\10\2\54\1\10\1\0\1\10\1\55\1\10"+
    "\1\56\1\0\1\2\1\0\1\50\2\0\4\10\2\57"+
    "\2\60\1\0\1\10\1\0\1\10\2\61\1\0\1\62"+
    "\1\63\1\62\1\63\1\10\1\64\1\0\1\10\1\0"+
    "\1\10\1\65\1\66\1\0\1\10\2\67\2\70";

  private static int [] zzUnpackAction() {
    int [] result = new int[182];
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
    "\0\0\0\70\0\160\0\250\0\70\0\70\0\340\0\70"+
    "\0\u0118\0\u0150\0\u0188\0\u01c0\0\u01f8\0\u0230\0\u0268\0\u02a0"+
    "\0\u01c0\0\u02d8\0\u0310\0\u0348\0\u0380\0\u03b8\0\u03f0\0\u0428"+
    "\0\u0460\0\u0498\0\u04d0\0\u0508\0\u0540\0\u0578\0\70\0\70"+
    "\0\70\0\70\0\70\0\70\0\u05b0\0\u05e8\0\u0620\0\70"+
    "\0\70\0\70\0\70\0\u0658\0\u0690\0\u06c8\0\u0118\0\70"+
    "\0\u0700\0\u0738\0\u0770\0\u07a8\0\u07e0\0\u0818\0\u0850\0\u0888"+
    "\0\u08c0\0\u08f8\0\u0930\0\u0968\0\70\0\u09a0\0\u01c0\0\u09d8"+
    "\0\u0a10\0\u0a48\0\u0a80\0\u0ab8\0\u0af0\0\u0b28\0\u0b60\0\u0b98"+
    "\0\u0bd0\0\u0c08\0\70\0\70\0\70\0\70\0\70\0\70"+
    "\0\70\0\70\0\u0c40\0\u06c8\0\u0118\0\70\0\u0738\0\u0c78"+
    "\0\u0cb0\0\u0ce8\0\u0d20\0\u01c0\0\u0d58\0\u0d90\0\u0dc8\0\u0e00"+
    "\0\u0e38\0\u0e70\0\70\0\u01c0\0\u0ea8\0\u0ee0\0\u0f18\0\u0f50"+
    "\0\u0f88\0\u0fc0\0\u0ff8\0\u1030\0\u1068\0\u10a0\0\u10d8\0\u1110"+
    "\0\u1148\0\u1180\0\u11b8\0\70\0\u11f0\0\u01c0\0\u1228\0\u1260"+
    "\0\u1298\0\u12d0\0\u1308\0\u1340\0\u1378\0\70\0\u01c0\0\u13b0"+
    "\0\u13e8\0\70\0\u01c0\0\u1420\0\u1458\0\u1490\0\u14c8\0\70"+
    "\0\u01c0\0\u1500\0\u1538\0\u1570\0\u01c0\0\u15a8\0\u01c0\0\u15e0"+
    "\0\u15e0\0\u1618\0\70\0\u1650\0\u1688\0\u16c0\0\u16f8\0\u1730"+
    "\0\u1768\0\70\0\u01c0\0\70\0\u01c0\0\u17a0\0\u17d8\0\u1810"+
    "\0\u1848\0\70\0\u01c0\0\u1880\0\70\0\70\0\u01c0\0\u01c0"+
    "\0\u18b8\0\u01c0\0\u18f0\0\u1928\0\u1960\0\u1998\0\70\0\u01c0"+
    "\0\u19d0\0\u1a08\0\70\0\u01c0\0\70\0\u01c0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[182];
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
    "\1\2\1\3\1\4\1\5\1\6\1\3\1\0\1\7"+
    "\1\10\1\11\1\2\1\12\1\13\2\14\1\15\1\16"+
    "\2\14\1\17\1\14\1\20\1\21\1\22\1\14\1\23"+
    "\1\24\1\25\1\26\1\14\1\3\1\27\1\30\1\14"+
    "\1\31\1\2\2\14\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\71\0\1\3\3\0"+
    "\1\3\30\0\1\3\33\0\1\54\1\55\73\0\1\7"+
    "\1\56\57\0\11\57\1\60\1\61\55\57\12\62\1\63"+
    "\1\0\54\62\7\0\1\14\4\0\1\14\1\64\5\14"+
    "\1\0\5\14\1\0\4\14\1\0\4\14\1\0\2\14"+
    "\31\0\1\14\4\0\7\14\1\0\5\14\1\0\4\14"+
    "\1\0\4\14\1\0\2\14\31\0\1\14\4\0\6\14"+
    "\1\65\1\0\5\14\1\0\4\14\1\0\4\14\1\0"+
    "\2\14\31\0\1\14\4\0\5\14\1\66\1\14\1\0"+
    "\4\14\1\67\1\0\4\14\1\0\4\14\1\0\2\14"+
    "\36\0\1\70\22\0\1\71\37\0\1\14\4\0\1\72"+
    "\6\14\1\0\5\14\1\0\4\14\1\0\1\73\3\14"+
    "\1\0\2\14\31\0\1\14\4\0\7\14\1\0\4\14"+
    "\1\74\1\0\4\14\1\0\4\14\1\0\2\14\42\0"+
    "\1\75\14\0\1\76\41\0\1\14\4\0\4\14\1\77"+
    "\2\14\1\0\5\14\1\0\3\14\1\100\1\0\4\14"+
    "\1\0\2\14\31\0\1\14\4\0\3\14\1\101\3\14"+
    "\1\0\4\14\1\102\1\0\4\14\1\0\4\14\1\0"+
    "\2\14\31\0\1\14\4\0\5\14\1\103\1\14\1\0"+
    "\5\14\1\0\4\14\1\0\4\14\1\0\2\14\31\0"+
    "\1\14\4\0\1\14\1\104\5\14\1\0\5\14\1\0"+
    "\4\14\1\0\2\14\1\105\1\14\1\0\2\14\31\0"+
    "\1\14\4\0\5\14\1\106\1\14\1\0\4\14\1\107"+
    "\1\0\4\14\1\0\2\14\1\110\1\14\1\0\2\14"+
    "\31\0\1\14\4\0\1\14\1\111\5\14\1\0\4\14"+
    "\1\112\1\0\4\14\1\0\4\14\1\0\2\14\70\0"+
    "\1\113\70\0\1\114\103\0\1\115\55\0\1\116\70\0"+
    "\1\117\100\0\1\120\67\0\1\121\67\0\1\122\4\0"+
    "\4\54\3\0\61\54\3\55\1\123\64\55\7\0\1\124"+
    "\60\0\11\57\1\125\1\61\55\57\13\0\1\126\67\0"+
    "\1\127\63\0\1\14\4\0\2\14\1\130\4\14\1\0"+
    "\5\14\1\0\4\14\1\0\4\14\1\0\2\14\31\0"+
    "\1\14\4\0\7\14\1\131\1\14\1\132\3\14\1\0"+
    "\4\14\1\0\4\14\1\0\2\14\31\0\1\14\4\0"+
    "\6\14\1\133\1\0\5\14\1\0\4\14\1\0\4\14"+
    "\1\0\2\14\31\0\1\14\4\0\1\14\1\134\5\14"+
    "\1\0\5\14\1\0\4\14\1\0\4\14\1\0\2\14"+
    "\37\0\1\135\103\0\2\136\44\0\1\14\4\0\1\14"+
    "\1\137\5\14\1\0\5\14\1\0\4\14\1\0\4\14"+
    "\1\0\2\14\31\0\1\14\4\0\7\14\1\0\5\14"+
    "\1\136\1\140\3\14\1\0\4\14\1\0\2\14\31\0"+
    "\1\14\4\0\7\14\1\0\5\14\1\141\1\142\3\14"+
    "\1\0\4\14\1\0\2\14\36\0\1\143\62\0\1\14"+
    "\4\0\1\144\6\14\1\0\5\14\1\0\4\14\1\0"+
    "\4\14\1\0\2\14\31\0\1\14\4\0\4\14\1\145"+
    "\2\14\1\0\5\14\1\0\4\14\1\0\4\14\1\0"+
    "\2\14\31\0\1\14\4\0\2\14\1\146\4\14\1\0"+
    "\5\14\1\0\4\14\1\0\4\14\1\0\2\14\31\0"+
    "\1\14\4\0\7\14\1\0\5\14\1\147\1\150\3\14"+
    "\1\0\4\14\1\0\2\14\31\0\1\14\4\0\7\14"+
    "\1\0\5\14\1\151\1\152\3\14\1\0\4\14\1\0"+
    "\2\14\31\0\1\14\4\0\7\14\1\0\5\14\1\153"+
    "\1\154\3\14\1\0\4\14\1\0\2\14\31\0\1\14"+
    "\4\0\7\14\1\155\1\14\1\156\3\14\1\0\4\14"+
    "\1\0\4\14\1\0\2\14\31\0\1\14\4\0\7\14"+
    "\1\0\5\14\1\0\3\14\1\157\1\0\4\14\1\0"+
    "\2\14\31\0\1\14\4\0\5\14\1\160\1\14\1\0"+
    "\5\14\1\0\4\14\1\0\4\14\1\0\2\14\31\0"+
    "\1\14\4\0\3\14\1\161\3\14\1\0\5\14\1\0"+
    "\4\14\1\0\4\14\1\0\2\14\31\0\1\14\4\0"+
    "\7\14\1\0\4\14\1\162\1\0\4\14\1\0\4\14"+
    "\1\0\2\14\22\0\2\163\1\164\1\165\64\163\7\0"+
    "\1\14\4\0\3\14\1\166\3\14\1\0\5\14\1\0"+
    "\4\14\1\0\4\14\1\0\2\14\41\0\1\167\57\0"+
    "\1\14\4\0\3\14\1\170\3\14\1\0\5\14\1\0"+
    "\4\14\1\0\4\14\1\0\2\14\31\0\1\14\4\0"+
    "\7\14\1\171\1\14\1\130\3\14\1\0\4\14\1\0"+
    "\4\14\1\0\2\14\53\0\2\172\51\0\1\173\62\0"+
    "\1\14\4\0\7\14\1\0\5\14\1\172\1\174\3\14"+
    "\1\0\4\14\1\0\2\14\31\0\1\14\4\0\1\175"+
    "\6\14\1\0\5\14\1\0\4\14\1\0\4\14\1\0"+
    "\2\14\55\0\1\176\43\0\1\14\4\0\7\14\1\0"+
    "\5\14\1\0\1\14\1\177\2\14\1\0\4\14\1\0"+
    "\2\14\31\0\1\14\4\0\5\14\1\200\1\14\1\0"+
    "\5\14\1\0\4\14\1\0\4\14\1\0\2\14\31\0"+
    "\1\14\4\0\7\14\1\0\5\14\1\0\4\14\1\0"+
    "\3\14\1\201\1\0\2\14\57\0\1\202\41\0\1\14"+
    "\4\0\7\14\1\0\5\14\1\0\3\14\1\203\1\0"+
    "\4\14\1\0\2\14\36\0\1\204\62\0\1\14\4\0"+
    "\1\205\6\14\1\0\5\14\1\0\4\14\1\0\4\14"+
    "\1\0\2\14\44\0\1\206\54\0\1\14\4\0\6\14"+
    "\1\207\1\0\5\14\1\0\4\14\1\0\4\14\1\0"+
    "\2\14\41\0\1\210\57\0\1\14\4\0\3\14\1\211"+
    "\3\14\1\0\5\14\1\0\4\14\1\0\4\14\1\0"+
    "\2\14\31\0\1\14\4\0\1\212\6\14\1\213\1\14"+
    "\1\214\3\14\1\0\4\14\1\0\4\14\1\0\2\14"+
    "\31\0\1\14\4\0\1\14\1\215\5\14\1\0\5\14"+
    "\1\0\4\14\1\0\4\14\1\0\2\14\31\0\1\14"+
    "\4\0\5\14\1\216\1\14\1\0\5\14\1\0\4\14"+
    "\1\0\4\14\1\0\2\14\31\0\1\14\4\0\6\14"+
    "\1\217\1\0\5\14\1\0\4\14\1\0\4\14\1\0"+
    "\2\14\22\0\2\55\1\220\1\123\66\55\1\221\1\123"+
    "\64\55\36\0\1\222\40\0\1\14\4\0\7\14\1\0"+
    "\5\14\1\0\4\14\1\222\4\14\1\0\2\14\41\0"+
    "\1\223\105\0\1\224\72\0\1\225\36\0\1\14\4\0"+
    "\7\14\1\0\5\14\1\0\3\14\1\226\1\0\4\14"+
    "\1\0\2\14\31\0\1\14\4\0\7\14\1\0\5\14"+
    "\1\0\4\14\1\0\1\14\1\227\2\14\1\0\2\14"+
    "\31\0\1\14\4\0\2\14\1\230\4\14\1\0\5\14"+
    "\1\0\4\14\1\0\4\14\1\0\2\14\31\0\1\14"+
    "\4\0\6\14\1\231\1\0\5\14\1\0\4\14\1\0"+
    "\4\14\1\0\2\14\41\0\1\232\57\0\1\14\4\0"+
    "\3\14\1\233\3\14\1\0\5\14\1\0\4\14\1\0"+
    "\4\14\1\0\2\14\41\0\1\234\57\0\1\14\4\0"+
    "\3\14\1\235\3\14\1\0\5\14\1\0\4\14\1\0"+
    "\4\14\1\0\2\14\31\0\1\14\4\0\7\14\1\0"+
    "\5\14\1\236\1\237\3\14\1\0\4\14\1\0\2\14"+
    "\52\0\1\240\46\0\1\14\4\0\7\14\1\0\4\14"+
    "\1\241\1\0\4\14\1\0\4\14\1\0\2\14\31\0"+
    "\1\14\4\0\7\14\1\0\5\14\1\0\4\14\1\0"+
    "\4\14\1\242\1\243\1\14\24\0\1\163\116\0\2\244"+
    "\102\0\1\245\63\0\1\246\35\0\1\14\4\0\7\14"+
    "\1\0\5\14\1\0\4\14\1\0\4\14\1\0\1\14"+
    "\1\247\31\0\1\14\4\0\7\14\1\0\5\14\1\0"+
    "\4\14\1\0\2\14\1\250\1\14\1\0\2\14\31\0"+
    "\1\14\4\0\6\14\1\251\1\0\5\14\1\0\4\14"+
    "\1\0\4\14\1\0\2\14\31\0\1\14\4\0\3\14"+
    "\1\252\3\14\1\0\5\14\1\0\4\14\1\0\4\14"+
    "\1\0\2\14\57\0\1\253\41\0\1\14\4\0\7\14"+
    "\1\0\5\14\1\0\3\14\1\254\1\0\4\14\1\0"+
    "\2\14\44\0\1\255\54\0\1\14\4\0\6\14\1\256"+
    "\1\0\5\14\1\0\4\14\1\0\4\14\1\0\2\14"+
    "\42\0\1\257\56\0\1\14\4\0\1\260\6\14\1\0"+
    "\5\14\1\0\4\14\1\0\4\14\1\0\2\14\40\0"+
    "\1\261\60\0\1\14\4\0\2\14\1\262\4\14\1\0"+
    "\5\14\1\0\4\14\1\0\4\14\1\0\2\14\41\0"+
    "\1\263\57\0\1\14\4\0\3\14\1\264\3\14\1\0"+
    "\5\14\1\0\4\14\1\0\4\14\1\0\2\14\41\0"+
    "\1\265\57\0\1\14\4\0\3\14\1\266\3\14\1\0"+
    "\5\14\1\0\4\14\1\0\4\14\1\0\2\14\22\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6720];
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

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\2\11\1\1\1\11\26\1\6\11"+
    "\3\1\4\11\1\1\3\0\1\11\3\0\4\1\2\0"+
    "\3\1\1\11\1\0\14\1\10\11\1\0\2\1\1\11"+
    "\2\1\1\0\3\1\2\0\2\1\1\0\1\1\1\11"+
    "\3\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\5\1\1\0\1\11\1\0\3\1\3\0\2\1\1\11"+
    "\3\1\1\11\1\1\1\0\1\1\1\0\1\1\1\11"+
    "\2\1\1\0\4\1\1\0\1\1\1\0\1\11\2\0"+
    "\4\1\1\11\1\1\1\11\1\1\1\0\1\1\1\0"+
    "\1\1\1\11\1\1\1\0\2\11\4\1\1\0\1\1"+
    "\1\0\1\1\1\11\1\1\1\0\1\1\1\11\1\1"+
    "\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[182];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    public LinkedList<LexicalError> lexicalErrors;
    public LinkedList<Tokens> tokens;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexical(java.io.Reader in) {
      lexicalErrors = new LinkedList<>();
    tokens = new LinkedList<>();
    yyline = 1;
    yychar = 1;
    this.zzReader = in;
  }



  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { lexicalErrors.add(new LexicalError(yytext(), yyline, (int)yychar));
            } 
            // fall through
          case 57: break;
          case 2: 
            { 
            } 
            // fall through
          case 58: break;
          case 3: 
            { tokens.add(new Tokens(yytext(), "dividido", yyline, (int)yychar)); return new Symbol(sym.DIVIDE, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 59: break;
          case 4: 
            { tokens.add(new Tokens(yytext(), "multiplicado", yyline, (int)yychar)); return new Symbol(sym.TIMES, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 60: break;
          case 5: 
            { yychar = 0;
            } 
            // fall through
          case 61: break;
          case 6: 
            { tokens.add(new Tokens(yytext(), "entero", yyline, (int)yychar)); return new Symbol(sym.INTEGER, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 62: break;
          case 7: 
            { tokens.add(new Tokens(yytext(), "punto", yyline, (int)yychar)); return new Symbol(sym.PERIOD, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 63: break;
          case 8: 
            { tokens.add(new Tokens(yytext(), "identificador", yyline, (int)yychar)); return new Symbol(sym.ID, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 64: break;
          case 9: 
            { tokens.add(new Tokens(yytext(), "not", yyline, (int)yychar)); return new Symbol(sym.NOT, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 65: break;
          case 10: 
            { tokens.add(new Tokens(yytext(), "mas", yyline, (int)yychar)); return new Symbol(sym.PLUS, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 66: break;
          case 11: 
            { tokens.add(new Tokens(yytext(), "menos", yyline, (int)yychar)); return new Symbol(sym.MINUS, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 67: break;
          case 12: 
            { tokens.add(new Tokens(yytext(), "parentesis_abierto", yyline, (int)yychar)); return new Symbol(sym.LEFT_PARENTHESIS, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 68: break;
          case 13: 
            { tokens.add(new Tokens(yytext(), "parentesis_cerrado", yyline, (int)yychar)); return new Symbol(sym.RIGHT_PARENTHESIS, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 69: break;
          case 14: 
            { tokens.add(new Tokens(yytext(), "llave_abierta", yyline, (int)yychar)); return new Symbol(sym.LEFT_CURLY_BRACKET, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 70: break;
          case 15: 
            { tokens.add(new Tokens(yytext(), "llave_cerrada", yyline, (int)yychar)); return new Symbol(sym.RIGHT_CURLY_BRACKET, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 71: break;
          case 16: 
            { tokens.add(new Tokens(yytext(), "corchete_abierto", yyline, (int)yychar)); return new Symbol(sym.LEFT_SQUARE_BRACKET, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 72: break;
          case 17: 
            { tokens.add(new Tokens(yytext(), "corchete_cerrado", yyline, (int)yychar)); return new Symbol(sym.RIGHT_SQUARE_BRACKET, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 73: break;
          case 18: 
            { tokens.add(new Tokens(yytext(), "menor_que", yyline, (int)yychar)); return new Symbol(sym.LESS_THAN, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 74: break;
          case 19: 
            { tokens.add(new Tokens(yytext(), "mayor_que", yyline, (int)yychar)); return new Symbol(sym.GREATER_THAN, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 75: break;
          case 20: 
            { tokens.add(new Tokens(yytext(), "igual", yyline, (int)yychar)); return new Symbol(sym.EQUAL, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 76: break;
          case 21: 
            { tokens.add(new Tokens(yytext(), "coma", yyline, (int)yychar)); return new Symbol(sym.COMMA, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 77: break;
          case 22: 
            { tokens.add(new Tokens(yytext(), "punto_coma", yyline, (int)yychar)); return new Symbol(sym.SEMI_COLON, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 78: break;
          case 23: 
            { tokens.add(new Tokens(yytext(), "dos_puntos", yyline, (int)yychar)); return new Symbol(sym.COLON, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 79: break;
          case 24: 
            { tokens.add(new Tokens(yytext(), "dolar", yyline, (int)yychar)); return new Symbol(sym.DOLLAR, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 80: break;
          case 25: 
            { tokens.add(new Tokens(yytext(), "cadena", yyline, (int)yychar)); return new Symbol(sym.TEXT, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 81: break;
          case 26: 
            { tokens.add(new Tokens(yytext(), "if", yyline, (int)yychar)); return new Symbol(sym.IF, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 82: break;
          case 27: 
            { tokens.add(new Tokens(yytext(), "do", yyline, (int)yychar)); return new Symbol(sym.DO, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 83: break;
          case 28: 
            { tokens.add(new Tokens(yytext(), "and", yyline, (int)yychar)); return new Symbol(sym.AND, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 84: break;
          case 29: 
            { tokens.add(new Tokens(yytext(), "or", yyline, (int)yychar)); return new Symbol(sym.OR, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 85: break;
          case 30: 
            { tokens.add(new Tokens(yytext(), "distinto_que", yyline, (int)yychar)); return new Symbol(sym.NOT_EQUAL_TO, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 86: break;
          case 31: 
            { tokens.add(new Tokens(yytext(), "incremento", yyline, (int)yychar)); return new Symbol(sym.INCREASE, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 87: break;
          case 32: 
            { tokens.add(new Tokens(yytext(), "decremento", yyline, (int)yychar)); return new Symbol(sym.DECREASE, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 88: break;
          case 33: 
            { tokens.add(new Tokens(yytext(), "menor_igual", yyline, (int)yychar)); return new Symbol(sym.LESS_EQUAL, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 89: break;
          case 34: 
            { tokens.add(new Tokens(yytext(), "mayor_igual", yyline, (int)yychar)); return new Symbol(sym.GREATER_EQUAL, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 90: break;
          case 35: 
            { tokens.add(new Tokens(yytext(), "igual_que", yyline, (int)yychar)); return new Symbol(sym.EQUAL_TO, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 91: break;
          case 36: 
            { tokens.add(new Tokens(yytext(), "decimal", yyline, (int)yychar)); return new Symbol(sym.DECIMAL, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 92: break;
          case 37: 
            { tokens.add(new Tokens(yytext(), "caracter", yyline, (int)yychar)); return new Symbol(sym.CHARACTER, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 93: break;
          case 38: 
            { tokens.add(new Tokens(yytext(), "for", yyline, (int)yychar)); return new Symbol(sym.FOR, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 94: break;
          case 39: 
            { tokens.add(new Tokens(yytext(), "int", yyline, (int)yychar)); return new Symbol(sym.INT, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 95: break;
          case 40: 
            { tokens.add(new Tokens(yytext(), "boolean", yyline, (int)yychar)); return new Symbol(sym.BOOLEAN, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 96: break;
          case 41: 
            { tokens.add(new Tokens(yytext(), "else", yyline, (int)yychar)); return new Symbol(sym.ELSE, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 97: break;
          case 42: 
            { tokens.add(new Tokens(yytext(), "void", yyline, (int)yychar)); return new Symbol(sym.VOID, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 98: break;
          case 43: 
            { tokens.add(new Tokens(yytext(), "main", yyline, (int)yychar)); return new Symbol(sym.MAIN, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 99: break;
          case 44: 
            { tokens.add(new Tokens(yytext(), "case", yyline, (int)yychar)); return new Symbol(sym.CASE, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 100: break;
          case 45: 
            { tokens.add(new Tokens(yytext(), "char", yyline, (int)yychar)); return new Symbol(sym.CHAR, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 101: break;
          case 46: 
            { tokens.add(new Tokens(yytext(), "bool", yyline, (int)yychar)); return new Symbol(sym.BOOL, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 102: break;
          case 47: 
            { tokens.add(new Tokens(yytext(), "write", yyline, (int)yychar)); return new Symbol(sym.WRITE, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 103: break;
          case 48: 
            { tokens.add(new Tokens(yytext(), "while", yyline, (int)yychar)); return new Symbol(sym.WHILE, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 104: break;
          case 49: 
            { tokens.add(new Tokens(yytext(), "break", yyline, (int)yychar)); return new Symbol(sym.BREAK, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 105: break;
          case 50: 
            { tokens.add(new Tokens(yytext(), "string", yyline, (int)yychar)); return new Symbol(sym.STRING, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 106: break;
          case 51: 
            { tokens.add(new Tokens(yytext(), "switch", yyline, (int)yychar)); return new Symbol(sym.SWITCH, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 107: break;
          case 52: 
            { tokens.add(new Tokens(yytext(), "double", yyline, (int)yychar)); return new Symbol(sym.DOUBLE, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 108: break;
          case 53: 
            { tokens.add(new Tokens(yytext(), "else_if", yyline, (int)yychar)); return new Symbol(sym.ELSEIF, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 109: break;
          case 54: 
            { tokens.add(new Tokens(yytext(), "default", yyline, (int)yychar)); return new Symbol(sym.DEFAULT, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 110: break;
          case 55: 
            { tokens.add(new Tokens(yytext(), "console", yyline, (int)yychar)); return new Symbol(sym.CONSOLE, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 111: break;
          case 56: 
            { tokens.add(new Tokens(yytext(), "continue", yyline, (int)yychar)); return new Symbol(sym.CONTINUE, yyline, (int)yychar, yytext());
            } 
            // fall through
          case 112: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
