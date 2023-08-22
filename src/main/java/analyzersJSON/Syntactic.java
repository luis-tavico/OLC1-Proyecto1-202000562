
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analyzersJSON;

import java_cup.runtime.*;
import java.util.LinkedList;
import errors.SintaxError;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Syntactic extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Syntactic() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Syntactic(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Syntactic(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\031\000\002\002\003\000\002\002\004\000\002\003" +
    "\003\000\002\003\003\000\002\012\002\000\002\005\005" +
    "\000\002\013\002\000\002\005\006\000\002\006\005\000" +
    "\002\006\003\000\002\014\002\000\002\007\006\000\002" +
    "\015\002\000\002\010\005\000\002\016\002\000\002\010" +
    "\006\000\002\011\005\000\002\011\003\000\002\004\003" +
    "\000\002\004\003\000\002\004\003\000\002\004\003\000" +
    "\002\004\003\000\002\004\003\000\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\006\004\007\006\004\001\002\000\022\004" +
    "\ufff3\006\ufff3\007\ufff5\012\ufff3\013\ufff3\014\ufff3\015\ufff3" +
    "\016\ufff3\001\002\000\004\002\001\001\002\000\004\002" +
    "\ufffe\001\002\000\006\005\ufffd\015\ufffb\001\002\000\004" +
    "\002\012\001\002\000\004\002\uffff\001\002\000\004\002" +
    "\000\001\002\000\004\015\016\001\002\000\004\005\015" +
    "\001\002\000\012\002\ufffc\005\ufffc\007\ufffc\010\ufffc\001" +
    "\002\000\004\011\ufff7\001\002\000\006\005\022\010\021" +
    "\001\002\000\006\005\ufff8\010\ufff8\001\002\000\004\015" +
    "\016\001\002\000\012\002\ufffa\005\ufffa\007\ufffa\010\ufffa" +
    "\001\002\000\006\005\ufff9\010\ufff9\001\002\000\004\011" +
    "\025\001\002\000\020\004\007\006\004\012\032\013\026" +
    "\014\027\015\033\016\030\001\002\000\010\005\uffed\007" +
    "\uffed\010\uffed\001\002\000\010\005\uffee\007\uffee\010\uffee" +
    "\001\002\000\010\005\uffec\007\uffec\010\uffec\001\002\000" +
    "\010\005\uffe9\007\uffe9\010\uffe9\001\002\000\010\005\uffeb" +
    "\007\uffeb\010\uffeb\001\002\000\010\005\uffef\007\uffef\010" +
    "\uffef\001\002\000\010\005\uffea\007\uffea\010\uffea\001\002" +
    "\000\006\005\ufff6\010\ufff6\001\002\000\004\007\045\001" +
    "\002\000\020\004\007\006\004\012\032\013\026\014\027" +
    "\015\033\016\030\001\002\000\006\007\043\010\042\001" +
    "\002\000\006\007\ufff0\010\ufff0\001\002\000\020\004\007" +
    "\006\004\012\032\013\026\014\027\015\033\016\030\001" +
    "\002\000\012\002\ufff2\005\ufff2\007\ufff2\010\ufff2\001\002" +
    "\000\006\007\ufff1\010\ufff1\001\002\000\012\002\ufff4\005" +
    "\ufff4\007\ufff4\010\ufff4\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\012\002\007\003\004\005\005\010\010\001" +
    "\001\000\006\015\035\016\036\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\012\013\013\012\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\006\016\007\017\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\014\023\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\007\022\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\004\034\005\030" +
    "\010\033\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\012\004\040\005\030\010\033\011\037\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\004\043\005" +
    "\030\010\033\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Syntactic$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Syntactic$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Syntactic$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    public LinkedList<SintaxError> errors = new LinkedList<>();

    public void syntax_error(Symbol s){
        if (s.value != null)
            errors.add(new SintaxError(s.value.toString(), s.left, (s.right-1)));
        System.out.println("Error sintactico en: " + s.value.toString() + ", Linea: " + (s.left) + ", Columna: " + (s.right-1));
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception {
        System.out.println("Error sintactico NR en: " + s.value + ", Linea: " + (s.left+1) + ", Columna: " + (s.right+1));
    }

            

/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Syntactic$actions {
  private final Syntactic parser;

  /** Constructor */
  CUP$Syntactic$actions(Syntactic parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Syntactic$do_action_part00000000(
    int                        CUP$Syntactic$act_num,
    java_cup.runtime.lr_parser CUP$Syntactic$parser,
    java.util.Stack            CUP$Syntactic$stack,
    int                        CUP$Syntactic$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Syntactic$result;

      /* select the action based on the action number */
      switch (CUP$Syntactic$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // success ::= valid_json 
            {
              Object RESULT =null;
		 System.out.println("\nParsing completed successfully."); 
              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("success",0, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= success EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-1)).value;
		RESULT = start_val;
              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Syntactic$parser.done_parsing();
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // valid_json ::= array 
            {
              Object RESULT =null;

              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("valid_json",1, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // valid_json ::= object 
            {
              Object RESULT =null;

              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("valid_json",1, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // NT$0 ::= 
            {
              Object RESULT =null;
 System.out.println("\nParsing object... "); 
              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("NT$0",8, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // object ::= LEFT_CURLY_BRACKET NT$0 RIGHT_CURLY_BRACKET 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-1)).value;
		 System.out.println("Empty object parsed."); 
              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("object",3, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-2)), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // NT$1 ::= 
            {
              Object RESULT =null;
 System.out.println("\nParsing object... "); 
              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("NT$1",9, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // object ::= LEFT_CURLY_BRACKET NT$1 member_list RIGHT_CURLY_BRACKET 
            {
              Object RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-2)).value;
		 System.out.println("Object parsed."); 
              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("object",3, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-3)), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // member_list ::= member_list COMMA pair 
            {
              Object RESULT =null;

              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("member_list",4, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-2)), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // member_list ::= pair 
            {
              Object RESULT =null;

              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("member_list",4, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // NT$2 ::= 
            {
              Object RESULT =null;
		int kleft = ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()).left;
		int kright = ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()).right;
		String k = (String)((java_cup.runtime.Symbol) CUP$Syntactic$stack.peek()).value;
 System.out.print("Key " + k + " : "); 
              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("NT$2",10, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // pair ::= STRING NT$2 COLON value 
            {
              Object RESULT =null;
              // propagate RESULT from NT$2
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-2)).value;
		int kleft = ((java_cup.runtime.Symbol)CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-3)).left;
		int kright = ((java_cup.runtime.Symbol)CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-3)).right;
		String k = (String)((java_cup.runtime.Symbol) CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-3)).value;

              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("pair",5, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-3)), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // NT$3 ::= 
            {
              Object RESULT =null;
 System.out.println("\nParsing array... "); 
              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("NT$3",11, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // array ::= LEFT_SQUARE_BRACKET NT$3 RIGHT_SQUARE_BRACKET 
            {
              Object RESULT =null;
              // propagate RESULT from NT$3
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-1)).value;
		 System.out.println("Empty array parsed."); 
              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("array",6, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-2)), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // NT$4 ::= 
            {
              Object RESULT =null;
 System.out.println("\nParsing array... "); 
              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("NT$4",12, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // array ::= LEFT_SQUARE_BRACKET NT$4 value_list RIGHT_SQUARE_BRACKET 
            {
              Object RESULT =null;
              // propagate RESULT from NT$4
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-2)).value;
		 System.out.println("Array parsed."); 
              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("array",6, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-3)), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // value_list ::= value_list COMMA value 
            {
              Object RESULT =null;

              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("value_list",7, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.elementAt(CUP$Syntactic$top-2)), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // value_list ::= value 
            {
              Object RESULT =null;

              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("value_list",7, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // value ::= STRING 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$Syntactic$stack.peek()).value;
		 System.out.print(s + " (string)\n"); 
              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // value ::= INTEGER 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Syntactic$stack.peek()).value;
		 System.out.print(i + " (integer number)\n"); 
              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // value ::= DECIMAL 
            {
              Object RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()).right;
		String d = (String)((java_cup.runtime.Symbol) CUP$Syntactic$stack.peek()).value;
		 System.out.print(d.toString() + " (number in scientific notation)\n"); 
              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // value ::= BOOLEAN 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Syntactic$stack.peek()).value;
		 System.out.print(b + " (boolean literal)\n"); 
              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // value ::= NULL 
            {
              Object RESULT =null;
		 System.out.print("null (null literal)\n"); 
              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // value ::= array 
            {
              Object RESULT =null;

              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // value ::= object 
            {
              Object RESULT =null;

              CUP$Syntactic$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactic$stack.peek()), RESULT);
            }
          return CUP$Syntactic$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Syntactic$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Syntactic$do_action(
    int                        CUP$Syntactic$act_num,
    java_cup.runtime.lr_parser CUP$Syntactic$parser,
    java.util.Stack            CUP$Syntactic$stack,
    int                        CUP$Syntactic$top)
    throws java.lang.Exception
    {
              return CUP$Syntactic$do_action_part00000000(
                               CUP$Syntactic$act_num,
                               CUP$Syntactic$parser,
                               CUP$Syntactic$stack,
                               CUP$Syntactic$top);
    }
}

}
