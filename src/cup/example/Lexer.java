/* The following code was generated by JFlex 1.3.5 on 23/5/21 21:09 */

package cup.example;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;
import java.util.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.3.5
 * on 23/5/21 21:09 from the specification file
 * <tt>file:/C:/Users/cabez/git/Practica_AnalizadorBVL_PL/lexer.jflex</tt>
 */
public class Lexer implements sym, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  final public static int YYEOF = -1;

  /** initial size of the lookahead buffer */
  final private static int YY_BUFFERSIZE = 16384;

  /** lexical states */
  final public static int CODESEG = 1;
  final public static int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  final private static String yycmap_packed = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\16\0\4\0\1\3\3\0"+
    "\1\0\1\0\1\35\1\15\1\25\1\26\1\20\1\23\1\22\1\10"+
    "\1\6\1\17\1\5\7\14\2\4\1\32\1\21\1\33\1\31\1\34"+
    "\2\0\1\36\1\56\1\12\1\40\1\13\1\50\2\16\1\54\2\16"+
    "\1\52\1\55\1\24\1\43\2\16\1\44\1\53\1\46\1\47\1\60"+
    "\1\16\1\11\2\16\1\27\1\0\1\30\1\0\1\16\1\0\1\37"+
    "\1\57\1\61\1\41\1\7\1\51\2\16\1\54\2\16\1\52\1\55"+
    "\1\24\1\43\2\16\1\44\1\53\1\46\1\47\1\60\1\16\1\11"+
    "\2\16\1\0\1\42\2\0\41\0\2\0\4\0\4\0\1\0\1\0"+
    "\1\45\1\0\7\0\1\0\4\0\1\0\5\0\27\0\1\0\37\0"+
    "\1\0\u01ca\0\4\0\14\0\16\0\5\0\7\0\1\0\1\0\1\0"+
    "\21\0\160\0\5\0\1\0\2\0\2\0\4\0\1\0\1\0\6\0"+
    "\1\0\1\0\3\0\1\0\1\0\1\0\24\0\1\0\123\0\1\0"+
    "\213\0\1\0\5\0\2\0\246\0\1\0\46\0\2\0\1\0\6\0"+
    "\51\0\6\0\1\0\1\0\55\0\1\0\1\0\1\0\2\0\1\0"+
    "\2\0\1\0\1\0\10\0\33\0\4\0\4\0\15\0\6\0\5\0"+
    "\1\0\4\0\13\0\1\0\1\0\3\0\53\0\37\0\4\0\2\0"+
    "\1\0\143\0\1\0\1\0\10\0\1\0\6\0\2\0\2\0\1\0"+
    "\4\0\2\0\12\0\3\0\2\0\1\0\17\0\1\0\1\0\1\0"+
    "\36\0\33\0\2\0\131\0\13\0\1\0\16\0\12\0\41\0\11\0"+
    "\2\0\4\0\1\0\2\0\1\0\30\0\4\0\1\0\11\0\1\0"+
    "\3\0\1\0\5\0\22\0\31\0\3\0\4\0\13\0\65\0\25\0"+
    "\1\0\22\0\13\0\61\0\66\0\3\0\1\0\22\0\1\0\7\0"+
    "\12\0\2\0\2\0\12\0\1\0\20\0\3\0\1\0\10\0\2\0"+
    "\2\0\2\0\26\0\1\0\7\0\1\0\1\0\3\0\4\0\2\0"+
    "\1\0\1\0\7\0\2\0\2\0\2\0\3\0\1\0\10\0\1\0"+
    "\4\0\2\0\1\0\3\0\2\0\2\0\12\0\4\0\7\0\2\0"+
    "\1\0\1\0\2\0\3\0\1\0\6\0\4\0\2\0\2\0\26\0"+
    "\1\0\7\0\1\0\2\0\1\0\2\0\1\0\2\0\2\0\1\0"+
    "\1\0\5\0\4\0\2\0\2\0\3\0\3\0\1\0\7\0\4\0"+
    "\1\0\1\0\7\0\14\0\3\0\1\0\13\0\3\0\1\0\11\0"+
    "\1\0\3\0\1\0\26\0\1\0\7\0\1\0\2\0\1\0\5\0"+
    "\2\0\1\0\1\0\10\0\1\0\3\0\1\0\3\0\2\0\1\0"+
    "\17\0\2\0\2\0\2\0\12\0\1\0\1\0\7\0\1\0\6\0"+
    "\1\0\3\0\1\0\10\0\2\0\2\0\2\0\26\0\1\0\7\0"+
    "\1\0\2\0\1\0\5\0\2\0\1\0\1\0\7\0\2\0\2\0"+
    "\2\0\3\0\7\0\3\0\4\0\2\0\1\0\3\0\2\0\2\0"+
    "\12\0\1\0\1\0\20\0\1\0\1\0\1\0\6\0\3\0\3\0"+
    "\1\0\4\0\3\0\2\0\1\0\1\0\1\0\2\0\3\0\2\0"+
    "\3\0\3\0\3\0\14\0\4\0\5\0\3\0\3\0\1\0\4\0"+
    "\2\0\1\0\6\0\1\0\16\0\12\0\11\0\1\0\6\0\5\0"+
    "\10\0\1\0\3\0\1\0\27\0\1\0\20\0\3\0\1\0\7\0"+
    "\1\0\3\0\1\0\4\0\7\0\2\0\1\0\3\0\5\0\2\0"+
    "\2\0\2\0\12\0\20\0\1\0\3\0\1\0\10\0\1\0\3\0"+
    "\1\0\27\0\1\0\12\0\1\0\5\0\2\0\1\0\1\0\7\0"+
    "\1\0\3\0\1\0\4\0\7\0\2\0\7\0\1\0\1\0\2\0"+
    "\2\0\2\0\12\0\1\0\2\0\15\0\4\0\11\0\1\0\3\0"+
    "\1\0\51\0\2\0\1\0\7\0\1\0\3\0\1\0\4\0\1\0"+
    "\5\0\3\0\1\0\7\0\3\0\2\0\2\0\12\0\12\0\6\0"+
    "\1\0\3\0\1\0\22\0\3\0\30\0\1\0\11\0\1\0\1\0"+
    "\2\0\7\0\3\0\1\0\4\0\6\0\1\0\1\0\1\0\10\0"+
    "\6\0\12\0\2\0\2\0\15\0\60\0\1\0\2\0\7\0\4\0"+
    "\10\0\10\0\1\0\12\0\47\0\2\0\1\0\1\0\1\0\5\0"+
    "\1\0\30\0\1\0\1\0\1\0\12\0\1\0\2\0\11\0\1\0"+
    "\2\0\5\0\1\0\1\0\1\0\6\0\2\0\12\0\2\0\4\0"+
    "\40\0\1\0\27\0\2\0\6\0\12\0\13\0\1\0\1\0\1\0"+
    "\1\0\1\0\4\0\2\0\10\0\1\0\44\0\4\0\24\0\1\0"+
    "\2\0\5\0\13\0\1\0\44\0\11\0\1\0\71\0\53\0\24\0"+
    "\1\0\12\0\6\0\6\0\4\0\4\0\3\0\1\0\3\0\2\0"+
    "\7\0\3\0\4\0\15\0\14\0\1\0\17\0\2\0\46\0\1\0"+
    "\1\0\5\0\1\0\2\0\53\0\1\0\u014d\0\1\0\4\0\2\0"+
    "\7\0\1\0\1\0\1\0\4\0\2\0\51\0\1\0\4\0\2\0"+
    "\41\0\1\0\4\0\2\0\7\0\1\0\1\0\1\0\4\0\2\0"+
    "\17\0\1\0\71\0\1\0\4\0\2\0\103\0\2\0\3\0\40\0"+
    "\20\0\20\0\126\0\2\0\6\0\3\0\u026c\0\2\0\21\0\1\0"+
    "\32\0\5\0\113\0\3\0\13\0\7\0\15\0\1\0\4\0\3\0"+
    "\13\0\22\0\3\0\13\0\22\0\2\0\14\0\15\0\1\0\3\0"+
    "\1\0\2\0\14\0\64\0\40\0\3\0\1\0\3\0\2\0\1\0"+
    "\2\0\12\0\41\0\4\0\1\0\12\0\6\0\131\0\7\0\5\0"+
    "\2\0\42\0\1\0\1\0\5\0\106\0\12\0\37\0\1\0\14\0"+
    "\4\0\14\0\12\0\12\0\36\0\2\0\5\0\13\0\54\0\4\0"+
    "\32\0\6\0\12\0\46\0\27\0\5\0\4\0\65\0\12\0\1\0"+
    "\35\0\2\0\13\0\6\0\12\0\15\0\1\0\10\0\16\0\1\0"+
    "\2\0\77\0\5\0\57\0\21\0\7\0\4\0\12\0\21\0\11\0"+
    "\14\0\3\0\36\0\15\0\2\0\12\0\54\0\16\0\14\0\44\0"+
    "\24\0\10\0\12\0\3\0\3\0\12\0\44\0\2\0\11\0\7\0"+
    "\53\0\2\0\3\0\20\0\3\0\1\0\25\0\4\0\1\0\6\0"+
    "\1\0\2\0\3\0\1\0\5\0\300\0\72\0\1\0\5\0\u0116\0"+
    "\2\0\6\0\2\0\46\0\2\0\6\0\2\0\10\0\1\0\1\0"+
    "\1\0\1\0\1\0\1\0\1\0\37\0\2\0\65\0\1\0\7\0"+
    "\1\0\1\0\3\0\3\0\1\0\7\0\3\0\4\0\2\0\6\0"+
    "\4\0\15\0\5\0\3\0\1\0\7\0\16\0\5\0\32\0\5\0"+
    "\20\0\2\0\23\0\1\0\13\0\5\0\1\0\12\0\1\0\1\0"+
    "\15\0\1\0\20\0\15\0\3\0\40\0\20\0\15\0\4\0\1\0"+
    "\3\0\14\0\21\0\1\0\4\0\1\0\2\0\12\0\1\0\1\0"+
    "\3\0\5\0\6\0\1\0\1\0\1\0\1\0\1\0\1\0\4\0"+
    "\1\0\13\0\2\0\4\0\5\0\5\0\4\0\1\0\21\0\51\0"+
    "\u0a77\0\57\0\1\0\57\0\1\0\205\0\6\0\4\0\3\0\2\0"+
    "\14\0\46\0\1\0\1\0\5\0\1\0\2\0\70\0\7\0\1\0"+
    "\17\0\1\0\27\0\11\0\7\0\1\0\7\0\1\0\7\0\1\0"+
    "\7\0\1\0\7\0\1\0\7\0\1\0\7\0\1\0\7\0\1\0"+
    "\40\0\57\0\1\0\u01d5\0\3\0\31\0\11\0\6\0\1\0\5\0"+
    "\2\0\5\0\4\0\126\0\2\0\2\0\2\0\3\0\1\0\132\0"+
    "\1\0\4\0\5\0\53\0\1\0\136\0\21\0\40\0\60\0\20\0"+
    "\u0200\0\u19c0\0\100\0\u51fd\0\3\0\u048d\0\103\0\56\0\2\0\u010d\0"+
    "\3\0\20\0\12\0\2\0\24\0\57\0\1\0\4\0\12\0\1\0"+
    "\37\0\2\0\120\0\2\0\45\0\11\0\2\0\147\0\2\0\65\0"+
    "\2\0\11\0\52\0\15\0\1\0\3\0\1\0\4\0\1\0\27\0"+
    "\5\0\4\0\1\0\13\0\1\0\7\0\64\0\14\0\2\0\62\0"+
    "\22\0\12\0\12\0\6\0\22\0\6\0\3\0\1\0\1\0\2\0"+
    "\13\0\34\0\10\0\2\0\27\0\15\0\14\0\35\0\3\0\4\0"+
    "\57\0\16\0\16\0\1\0\12\0\6\0\5\0\1\0\12\0\12\0"+
    "\5\0\1\0\51\0\16\0\11\0\3\0\1\0\10\0\2\0\2\0"+
    "\12\0\6\0\27\0\3\0\1\0\3\0\62\0\1\0\1\0\3\0"+
    "\2\0\2\0\5\0\2\0\1\0\1\0\1\0\30\0\3\0\2\0"+
    "\13\0\5\0\2\0\3\0\2\0\12\0\6\0\2\0\6\0\2\0"+
    "\6\0\11\0\7\0\1\0\7\0\1\0\53\0\1\0\16\0\6\0"+
    "\163\0\10\0\1\0\2\0\2\0\12\0\6\0\u2ba4\0\14\0\27\0"+
    "\4\0\61\0\u2104\0\u016e\0\2\0\152\0\46\0\7\0\14\0\5\0"+
    "\5\0\1\0\1\0\12\0\1\0\15\0\1\0\5\0\1\0\1\0"+
    "\1\0\2\0\1\0\2\0\1\0\154\0\41\0\u016b\0\22\0\100\0"+
    "\2\0\66\0\50\0\15\0\3\0\20\0\20\0\20\0\3\0\2\0"+
    "\30\0\3\0\31\0\1\0\6\0\5\0\1\0\207\0\2\0\1\0"+
    "\4\0\1\0\13\0\12\0\7\0\32\0\4\0\1\0\1\0\32\0"+
    "\13\0\131\0\3\0\6\0\2\0\6\0\2\0\6\0\2\0\3\0"+
    "\3\0\2\0\3\0\2\0\22\0\3\0\4\0";

  /** 
   * Translates characters to character classes
   */
  final private static char [] yycmap = yy_unpack_cmap(yycmap_packed);

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int yy_rowMap [] = { 
        0,    50,   100,   150,   100,   200,   250,   300,   350,   100, 
      400,   450,   500,   550,   100,   100,   100,   100,   600,   100, 
      100,   100,   100,   650,   700,   100,   100,   100,   750,   100, 
      800,   850,   100,   900,   950,  1000,  1050,  1100,  1150,   300, 
     1200,  1250,  1300,  1350,  1400,  1450,  1500,  1550,  1600,  1650, 
      100,   100,  1700,   400,  1750,  1800,  1850,  1900,  1950,  2000, 
     2050,  2100,  2150,  2150,  1300,  2200,  2250,   100,  2300,   400, 
      400,  2350,  2400,  2450,  2500,  2550,  2600,  2650,  2700,  2750, 
     2800,  2850,  2900,   400,   400,  2950,  3000,  3050,   400,  3100, 
     3150,  3200,  3250,  3300,  3350,  3400,   400,   400,  3450,  3500, 
     3550,  3600,   400,  3650,  3700,  3750,  3800,  3850,  3900,   400, 
     3950,   400,  4000,  4050,  4100,  4150,   400,   400,  4200,   400, 
      400,  4250,  4300,   400
  };

  /** 
   * The packed transition table of the DFA (part 0)
   */
  final private static String yy_packed0 = 
    "\1\3\1\4\2\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\11\1\6\1\15\1\13\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\2\35\2\13\1\36"+
    "\1\37\1\40\1\41\1\42\1\13\2\43\1\13\1\44"+
    "\1\13\1\45\2\46\1\47\1\14\62\3\64\0\1\5"+
    "\63\0\2\6\1\50\1\51\3\0\1\51\1\6\51\0"+
    "\1\6\1\52\1\50\1\51\1\0\1\53\1\0\1\51"+
    "\1\52\51\0\2\54\6\0\1\54\51\0\2\13\1\0"+
    "\1\13\1\0\4\13\1\0\1\13\5\0\1\55\11\0"+
    "\4\13\1\0\2\13\1\0\14\13\4\0\2\13\1\0"+
    "\1\13\1\0\4\13\1\0\1\13\5\0\1\13\11\0"+
    "\4\13\1\0\2\13\1\0\14\13\4\0\2\13\1\0"+
    "\1\13\1\0\4\13\1\0\1\13\5\0\1\13\11\0"+
    "\2\56\2\13\1\0\2\13\1\0\14\13\2\57\1\0"+
    "\57\57\17\0\1\60\1\61\45\0\2\13\1\0\1\13"+
    "\1\0\4\13\1\0\1\13\5\0\1\13\11\0\4\13"+
    "\1\0\1\62\1\13\1\0\14\13\31\0\1\63\61\0"+
    "\1\64\34\0\2\13\1\0\1\13\1\0\4\13\1\0"+
    "\1\13\5\0\1\65\11\0\4\13\1\0\2\13\1\0"+
    "\14\13\4\0\2\13\1\0\1\13\1\0\4\13\1\0"+
    "\1\13\5\0\1\13\11\0\4\13\1\0\1\13\1\66"+
    "\1\0\14\13\4\0\2\13\1\0\1\67\1\0\2\13"+
    "\1\67\1\13\1\0\1\13\5\0\1\13\11\0\4\13"+
    "\1\0\2\13\1\0\14\13\4\0\2\13\1\0\1\13"+
    "\1\0\4\13\1\0\1\13\5\0\1\13\11\0\4\13"+
    "\1\0\1\13\1\70\1\0\14\13\4\0\2\13\1\0"+
    "\1\13\1\0\4\13\1\0\1\13\5\0\1\13\11\0"+
    "\2\71\2\13\1\0\2\13\1\0\6\13\1\72\5\13"+
    "\4\0\2\13\1\0\1\13\1\0\4\13\1\0\1\13"+
    "\5\0\1\13\11\0\4\13\1\0\2\13\1\0\6\13"+
    "\1\73\5\13\4\0\2\13\1\0\1\13\1\0\4\13"+
    "\1\0\1\13\5\0\1\13\11\0\4\13\1\0\2\13"+
    "\1\0\6\13\1\74\5\13\4\0\2\13\1\0\1\13"+
    "\1\0\4\13\1\0\1\13\5\0\1\13\11\0\4\13"+
    "\1\0\1\75\1\13\1\0\14\13\4\0\2\13\1\0"+
    "\1\76\1\0\2\13\1\76\1\13\1\0\1\13\5\0"+
    "\1\13\11\0\4\13\1\0\2\13\1\0\14\13\4\0"+
    "\2\77\2\0\1\100\3\0\1\77\6\0\1\100\42\0"+
    "\1\6\1\52\1\50\1\51\3\0\1\51\1\52\51\0"+
    "\2\101\4\0\3\101\21\0\1\101\1\0\1\101\7\0"+
    "\1\101\5\0\1\101\7\0\2\54\1\0\1\51\3\0"+
    "\1\51\1\54\51\0\2\13\1\0\1\13\1\0\4\13"+
    "\1\0\1\13\5\0\1\13\11\0\4\13\1\0\2\13"+
    "\1\0\1\102\13\13\4\0\2\13\1\0\1\13\1\0"+
    "\4\13\1\0\1\13\5\0\1\13\11\0\4\13\1\0"+
    "\1\13\1\103\1\0\14\13\15\0\1\104\44\0\1\60"+
    "\1\4\1\5\57\60\20\61\1\105\41\61\4\0\2\13"+
    "\1\0\1\13\1\0\4\13\1\0\1\13\5\0\1\13"+
    "\11\0\4\13\1\0\2\13\1\0\1\106\13\13\4\0"+
    "\2\13\1\0\1\13\1\0\4\13\1\0\1\13\5\0"+
    "\1\13\11\0\2\13\2\107\1\0\2\13\1\0\14\13"+
    "\4\0\2\13\1\0\1\13\1\0\4\13\1\0\1\13"+
    "\5\0\1\13\11\0\2\110\2\13\1\0\2\13\1\0"+
    "\14\13\4\0\2\13\1\0\1\13\1\0\4\13\1\0"+
    "\1\13\5\0\1\13\11\0\4\13\1\0\2\13\1\0"+
    "\1\13\1\111\12\13\4\0\2\13\1\0\1\13\1\0"+
    "\4\13\1\0\1\13\5\0\1\13\11\0\4\13\1\0"+
    "\2\13\1\0\4\13\1\112\7\13\4\0\2\13\1\0"+
    "\1\13\1\0\4\13\1\0\1\13\5\0\1\113\11\0"+
    "\4\13\1\0\2\13\1\0\14\13\4\0\2\13\1\0"+
    "\1\13\1\0\4\13\1\0\1\13\5\0\1\114\11\0"+
    "\4\13\1\0\2\13\1\0\14\13\4\0\2\13\1\0"+
    "\1\115\1\0\2\13\1\115\1\13\1\0\1\13\5\0"+
    "\1\13\11\0\4\13\1\0\2\13\1\0\14\13\4\0"+
    "\2\13\1\0\1\13\1\0\4\13\1\0\1\13\5\0"+
    "\1\13\11\0\4\13\1\0\1\116\1\13\1\0\14\13"+
    "\4\0\2\13\1\0\1\13\1\0\1\13\1\117\2\13"+
    "\1\0\1\13\5\0\1\13\11\0\4\13\1\0\2\13"+
    "\1\0\13\13\1\117\4\0\2\77\6\0\1\77\51\0"+
    "\2\13\1\0\1\120\1\0\2\13\1\120\1\13\1\0"+
    "\1\13\5\0\1\13\11\0\4\13\1\0\1\121\1\122"+
    "\1\0\14\13\4\0\2\13\1\0\1\13\1\0\4\13"+
    "\1\0\1\13\5\0\1\13\11\0\2\123\2\13\1\0"+
    "\2\13\1\0\14\13\17\61\1\5\1\105\41\61\4\0"+
    "\2\13\1\0\1\13\1\0\4\13\1\0\1\13\5\0"+
    "\1\13\11\0\4\13\1\0\2\13\1\0\4\13\1\124"+
    "\7\13\4\0\2\13\1\0\1\125\1\0\2\13\1\125"+
    "\1\13\1\0\1\13\5\0\1\13\11\0\4\13\1\0"+
    "\2\13\1\0\14\13\4\0\2\13\1\0\1\13\1\0"+
    "\4\13\1\0\1\13\5\0\1\13\11\0\4\13\1\0"+
    "\2\13\1\0\5\13\1\126\6\13\4\0\2\13\1\0"+
    "\1\13\1\0\4\13\1\0\1\13\5\0\1\13\11\0"+
    "\4\13\1\0\2\13\1\0\5\13\1\127\1\13\1\130"+
    "\4\13\4\0\2\13\1\0\1\13\1\0\4\13\1\0"+
    "\1\13\5\0\1\13\11\0\4\13\1\0\1\131\1\13"+
    "\1\0\14\13\4\0\2\13\1\0\1\13\1\0\4\13"+
    "\1\0\1\13\5\0\1\132\11\0\4\13\1\0\2\13"+
    "\1\0\14\13\4\0\2\13\1\0\1\13\1\0\4\13"+
    "\1\0\1\13\5\0\1\13\11\0\4\13\1\0\2\13"+
    "\1\0\4\13\1\133\7\13\4\0\2\13\1\0\1\13"+
    "\1\0\4\13\1\0\1\13\5\0\1\13\11\0\4\13"+
    "\1\0\2\13\1\0\1\134\13\13\4\0\2\13\1\0"+
    "\1\13\1\0\4\13\1\0\1\13\5\0\1\13\11\0"+
    "\4\13\1\0\1\13\1\135\1\0\14\13\4\0\2\13"+
    "\1\0\1\13\1\0\4\13\1\0\1\13\5\0\1\136"+
    "\11\0\4\13\1\0\2\13\1\0\14\13\4\0\2\13"+
    "\1\0\1\13\1\0\4\13\1\0\1\13\5\0\1\13"+
    "\11\0\2\137\2\13\1\0\2\13\1\0\14\13\4\0"+
    "\2\13\1\0\1\13\1\0\1\13\1\140\2\13\1\0"+
    "\1\13\5\0\1\13\11\0\4\13\1\0\2\13\1\0"+
    "\13\13\1\140\4\0\2\13\1\0\1\141\1\0\2\13"+
    "\1\141\1\13\1\0\1\13\5\0\1\13\11\0\4\13"+
    "\1\0\2\13\1\0\14\13\4\0\2\13\1\0\1\13"+
    "\1\0\4\13\1\0\1\13\5\0\1\13\11\0\4\13"+
    "\1\0\2\13\1\0\6\13\1\142\5\13\4\0\2\13"+
    "\1\0\1\13\1\0\4\13\1\0\1\13\5\0\1\13"+
    "\11\0\4\13\1\0\2\13\1\0\6\13\1\143\5\13"+
    "\4\0\2\13\1\0\1\13\1\0\4\13\1\0\1\13"+
    "\5\0\1\13\11\0\4\13\1\0\2\13\1\0\1\144"+
    "\13\13\4\0\2\13\1\0\1\145\1\0\2\13\1\145"+
    "\1\13\1\0\1\13\5\0\1\13\11\0\4\13\1\0"+
    "\2\13\1\0\14\13\4\0\2\13\1\0\1\13\1\0"+
    "\4\13\1\0\1\13\5\0\1\13\11\0\4\13\1\0"+
    "\1\146\1\13\1\0\14\13\4\0\2\13\1\0\1\13"+
    "\1\0\4\13\1\0\1\13\5\0\1\13\11\0\4\13"+
    "\1\0\1\147\1\13\1\0\14\13\4\0\2\13\1\0"+
    "\1\13\1\0\1\13\1\150\2\13\1\0\1\13\5\0"+
    "\1\13\11\0\4\13\1\0\2\13\1\0\13\13\1\150"+
    "\4\0\2\13\1\0\1\13\1\0\4\13\1\0\1\13"+
    "\5\0\1\13\11\0\2\13\2\151\1\0\2\13\1\0"+
    "\14\13\4\0\2\13\1\0\1\13\1\0\4\13\1\0"+
    "\1\13\5\0\1\13\11\0\4\13\1\0\2\13\1\0"+
    "\1\152\13\13\4\0\2\13\1\0\1\153\1\0\2\13"+
    "\1\153\1\13\1\0\1\13\5\0\1\13\11\0\4\13"+
    "\1\0\2\13\1\0\14\13\4\0\2\13\1\0\1\13"+
    "\1\0\4\13\1\0\1\13\5\0\1\13\11\0\4\13"+
    "\1\0\1\13\1\154\1\0\14\13\4\0\2\13\1\0"+
    "\1\13\1\0\4\13\1\0\1\13\5\0\1\13\11\0"+
    "\2\155\2\13\1\0\2\13\1\0\14\13\4\0\2\13"+
    "\1\0\1\13\1\0\4\13\1\0\1\13\5\0\1\13"+
    "\11\0\4\13\1\0\1\13\1\156\1\0\14\13\4\0"+
    "\2\13\1\0\1\157\1\0\2\13\1\157\1\13\1\0"+
    "\1\13\5\0\1\13\11\0\4\13\1\0\2\13\1\0"+
    "\14\13\4\0\2\13\1\0\1\13\1\0\4\13\1\0"+
    "\1\13\5\0\1\13\11\0\2\160\2\13\1\0\2\13"+
    "\1\0\14\13\4\0\2\13\1\0\1\161\1\0\2\13"+
    "\1\161\1\13\1\0\1\13\5\0\1\13\11\0\4\13"+
    "\1\0\2\13\1\0\14\13\4\0\2\13\1\0\1\13"+
    "\1\0\4\13\1\0\1\13\5\0\1\162\11\0\4\13"+
    "\1\0\2\13\1\0\14\13\4\0\2\13\1\0\1\13"+
    "\1\0\4\13\1\0\1\13\5\0\1\13\11\0\2\163"+
    "\2\13\1\0\2\13\1\0\14\13\4\0\2\13\1\0"+
    "\1\13\1\0\4\13\1\0\1\13\5\0\1\164\11\0"+
    "\4\13\1\0\2\13\1\0\14\13\4\0\2\13\1\0"+
    "\1\13\1\0\4\13\1\0\1\13\5\0\1\13\11\0"+
    "\4\13\1\0\2\13\1\0\5\13\1\165\6\13\4\0"+
    "\2\13\1\0\1\13\1\0\4\13\1\0\1\13\5\0"+
    "\1\13\11\0\4\13\1\0\1\13\1\166\1\0\14\13"+
    "\4\0\2\13\1\0\1\13\1\0\4\13\1\0\1\13"+
    "\5\0\1\13\11\0\4\13\1\0\2\13\1\0\1\167"+
    "\13\13\4\0\2\13\1\0\1\13\1\0\4\13\1\0"+
    "\1\13\5\0\1\13\11\0\4\13\1\0\2\13\1\0"+
    "\5\13\1\170\6\13\4\0\2\13\1\0\1\13\1\0"+
    "\4\13\1\0\1\13\5\0\1\13\11\0\4\13\1\0"+
    "\1\171\1\13\1\0\14\13\4\0\2\13\1\0\1\13"+
    "\1\0\4\13\1\0\1\13\5\0\1\13\11\0\4\13"+
    "\1\0\1\13\1\172\1\0\14\13\4\0\2\13\1\0"+
    "\1\13\1\0\4\13\1\0\1\13\5\0\1\13\11\0"+
    "\2\173\2\13\1\0\2\13\1\0\14\13\4\0\2\13"+
    "\1\0\1\13\1\0\4\13\1\0\1\13\5\0\1\13"+
    "\11\0\4\13\1\0\2\13\1\0\5\13\1\174\6\13";

  /** 
   * The transition table of the DFA
   */
  final private static int yytrans [] = yy_unpack();


  /* error codes */
  final private static int YY_UNKNOWN_ERROR = 0;
  final private static int YY_ILLEGAL_STATE = 1;
  final private static int YY_NO_MATCH = 2;
  final private static int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  final private static String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private final static byte YY_ATTRIBUTE[] = {
     0,  0,  9,  1,  9,  1,  1,  1,  1,  9,  1,  1,  1,  1,  9,  9, 
     9,  9,  1,  9,  9,  9,  9,  1,  1,  9,  9,  9,  1,  9,  1,  1, 
     9,  1,  1,  1,  1,  1,  1,  0,  0,  1,  0,  1,  1,  1,  0,  0, 
     0,  1,  9,  9,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  0, 
     1,  1,  1,  9,  0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

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
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;

  /* user code: */
	

    public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
    }
    
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
		return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }
    
    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+ 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" + 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[4350];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] yy_unpack_cmap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2314) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  final public void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  final public void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  final public int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  final public void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  final public String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
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
  final public char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  final public int yylength() {
    return yy_markedPos-yy_startRead;
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
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
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
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      yychar+= yy_markedPos_l-yy_startRead;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 29: 
          {  return symbolFactory.newSymbol("OR", OR);  }
        case 125: break;
        case 53: 
          {  return symbolFactory.newSymbol("OR", OR);  }
        case 126: break;
        case 58: 
          {  return symbolFactory.newSymbol("SI", SI);  }
        case 127: break;
        case 5: 
        case 43: 
        case 62: 
          {  return symbolFactory.newSymbol("REALNUMBER", REALNUMBER, Double.parseDouble(yytext())); }
        case 128: break;
        case 6: 
        case 41: 
          {  return symbolFactory.newSymbol("NUMBER", NUMBER, Integer.parseInt(yytext(), 8)); }
        case 129: break;
        case 3: 
        case 4: 
          {   }
        case 130: break;
        case 111: 
          {  return symbolFactory.newSymbol("ENTRADA", ENTRADA);  }
        case 131: break;
        case 50: 
          {  return symbolFactory.newSymbol("ISEQUAL", ISEQUAL);  }
        case 132: break;
        case 23: 
          {  return symbolFactory.newSymbol("EQUAL", EQUAL);  }
        case 133: break;
        case 9: 
          {  return symbolFactory.newSymbol("MINUS", MINUS);  }
        case 134: break;
        case 14: 
          {  return symbolFactory.newSymbol("TIMES", TIMES);  }
        case 135: break;
        case 96: 
          {  return symbolFactory.newSymbol("FALSE", FALSE);  }
        case 136: break;
        case 97: 
          {  return symbolFactory.newSymbol("FINSI", FINSI);  }
        case 137: break;
        case 2: 
        case 7: 
        case 12: 
        case 24: 
          {  emit_warning("Unrecognized character '" +yytext()+"' -- ignored");
 }
        case 138: break;
        case 51: 
          {  return symbolFactory.newSymbol("ASIGNATION", ASIGNATION);  }
        case 139: break;
        case 27: 
          {  return symbolFactory.newSymbol("AND", AND);  }
        case 140: break;
        case 32: 
          {  return symbolFactory.newSymbol("NOT", NOT);  }
        case 141: break;
        case 69: 
          {  return symbolFactory.newSymbol("NOT", NOT);  }
        case 142: break;
        case 70: 
          {  return symbolFactory.newSymbol("AND", AND);  }
        case 143: break;
        case 120: 
          {  return symbolFactory.newSymbol("BOOLEANO", BOOLEANO);  }
        case 144: break;
        case 119: 
          {  return symbolFactory.newSymbol("MIENTRAS", MIENTRAS);  }
        case 145: break;
        case 117: 
          {  return symbolFactory.newSymbol("CARACTER", CARACTER);  }
        case 146: break;
        case 116: 
          {  return symbolFactory.newSymbol("ENTONCES", ENTONCES);  }
        case 147: break;
        case 22: 
          {  return symbolFactory.newSymbol("RBRACKET", RBRACKET);  }
        case 148: break;
        case 21: 
          {  return symbolFactory.newSymbol("LBRACKET", LBRACKET);  }
        case 149: break;
        case 13: 
          {  return symbolFactory.newSymbol("DIVISION", DIVISION);  }
        case 150: break;
        case 25: 
          {  return symbolFactory.newSymbol("LESSTHAN", LESSTHAN);  }
        case 151: break;
        case 26: 
          {  return symbolFactory.newSymbol("MORETHAN", MORETHAN);  }
        case 152: break;
        case 123: 
          {  return symbolFactory.newSymbol("FINMIENTRAS", FINMIENTRAS);  }
        case 153: break;
        case 17: 
          {  return symbolFactory.newSymbol("PLUS", PLUS);  }
        case 154: break;
        case 16: 
          {  return symbolFactory.newSymbol("COMA", COMA);  }
        case 155: break;
        case 15: 
          {  return symbolFactory.newSymbol("SEMI", SEMI);  }
        case 156: break;
        case 83: 
          {  return symbolFactory.newSymbol("REAL", REAL);  }
        case 157: break;
        case 84: 
          {  return symbolFactory.newSymbol("TRUE", TRUE);  }
        case 158: break;
        case 88: 
          {  return symbolFactory.newSymbol("SINO", SINO);  }
        case 159: break;
        case 109: 
          {  return symbolFactory.newSymbol("VECTOR", VECTOR);  }
        case 160: break;
        case 102: 
          {  return symbolFactory.newSymbol("ENTERO", ENTERO);  }
        case 161: break;
        case 20: 
          {  return symbolFactory.newSymbol("RPAREN", RPAREN);  }
        case 162: break;
        case 19: 
          {  return symbolFactory.newSymbol("LPAREN", LPAREN);  }
        case 163: break;
        case 18: 
          {  return symbolFactory.newSymbol("UMINUS", UMINUS);  }
        case 164: break;
        case 64: 
          {  return symbolFactory.newSymbol("NUMBER", NUMBER, Integer.decode(yytext())); }
        case 165: break;
        case 8: 
        case 10: 
        case 11: 
        case 28: 
        case 30: 
        case 31: 
        case 33: 
        case 34: 
        case 35: 
        case 36: 
        case 37: 
        case 38: 
        case 44: 
        case 45: 
        case 49: 
        case 52: 
        case 54: 
        case 55: 
        case 56: 
        case 57: 
        case 59: 
        case 60: 
        case 61: 
        case 65: 
        case 66: 
        case 71: 
        case 72: 
        case 73: 
        case 74: 
        case 75: 
        case 76: 
        case 77: 
        case 78: 
        case 79: 
        case 80: 
        case 81: 
        case 82: 
        case 85: 
        case 86: 
        case 87: 
        case 89: 
        case 90: 
        case 91: 
        case 92: 
        case 93: 
        case 94: 
        case 95: 
        case 98: 
        case 99: 
        case 100: 
        case 101: 
        case 103: 
        case 104: 
        case 105: 
        case 106: 
        case 107: 
        case 108: 
        case 110: 
        case 112: 
        case 113: 
        case 114: 
        case 115: 
        case 118: 
        case 121: 
        case 122: 
          {  return symbolFactory.newSymbol("IDENTIFIER", IDENTIFIER, yytext());  }
        case 166: break;
        case 67: 
          {  return symbolFactory.newSymbol("CHAR", CHAR, yytext().charAt(1));  }
        case 167: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              {     return symbolFactory.newSymbol("EOF",sym.EOF);
 }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
