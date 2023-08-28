
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analyzersJSON;

import java_cup.runtime.*;
import java.util.LinkedList;
import errors.SintaxError;
import instructions.Variable;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class SyntacticJSON extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public SyntacticJSON() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public SyntacticJSON(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public SyntacticJSON(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\021\000\002\002\004\000\002\002\003\000\002\003" +
    "\003\000\002\003\003\000\002\005\005\000\002\005\004" +
    "\000\002\006\005\000\002\006\003\000\002\007\005\000" +
    "\002\010\004\000\002\010\005\000\002\011\005\000\002" +
    "\011\003\000\002\004\003\000\002\004\003\000\002\004" +
    "\003\000\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\033\000\006\004\007\006\004\001\002\000\014\004" +
    "\007\006\004\007\032\012\026\013\023\001\002\000\004" +
    "\002\000\001\002\000\004\002\ufffe\001\002\000\006\005" +
    "\013\013\014\001\002\000\004\002\012\001\002\000\004" +
    "\002\uffff\001\002\000\004\002\001\001\002\000\012\002" +
    "\ufffc\005\ufffc\007\ufffc\010\ufffc\001\002\000\004\011\022" +
    "\001\002\000\006\005\020\010\017\001\002\000\006\005" +
    "\ufffa\010\ufffa\001\002\000\004\013\014\001\002\000\012" +
    "\002\ufffd\005\ufffd\007\ufffd\010\ufffd\001\002\000\006\005" +
    "\ufffb\010\ufffb\001\002\000\012\004\007\006\004\012\026" +
    "\013\023\001\002\000\010\005\ufff4\007\ufff4\010\ufff4\001" +
    "\002\000\010\005\ufff1\007\ufff1\010\ufff1\001\002\000\006" +
    "\005\ufff9\010\ufff9\001\002\000\010\005\ufff3\007\ufff3\010" +
    "\ufff3\001\002\000\010\005\ufff2\007\ufff2\010\ufff2\001\002" +
    "\000\006\007\034\010\033\001\002\000\006\007\ufff5\010" +
    "\ufff5\001\002\000\012\002\ufff8\005\ufff8\007\ufff8\010\ufff8" +
    "\001\002\000\012\004\007\006\004\012\026\013\023\001" +
    "\002\000\012\002\ufff7\005\ufff7\007\ufff7\010\ufff7\001\002" +
    "\000\006\007\ufff6\010\ufff6\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\033\000\012\002\007\003\004\005\005\010\010\001" +
    "\001\000\012\004\030\005\023\010\026\011\027\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\006\014\007" +
    "\015\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\007\020\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\004\024\005\023\010" +
    "\026\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\004\034" +
    "\005\023\010\026\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$SyntacticJSON$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$SyntacticJSON$actions(this);
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
    return action_obj.CUP$SyntacticJSON$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    public LinkedList<SintaxError> errors = new LinkedList<>();
    public LinkedList<Variable> variables_json = new LinkedList<>();
    public String file_path = "";

    public void setValues (LinkedList<Variable> variables_json, String path) {
        variables_json = variables_json;
        file_path = path;
    }

    public void syntax_error(Symbol s){
        if (s.value != null)
            errors.add(new SintaxError(s.value.toString(), s.left, s.right));
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.out.println("Error irrecuperable en: " + s.value + ", Linea: " + s.left + ", Columna: " + s.right);
    }

            

/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$SyntacticJSON$actions {
  private final SyntacticJSON parser;

  /** Constructor */
  CUP$SyntacticJSON$actions(SyntacticJSON parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$SyntacticJSON$do_action_part00000000(
    int                        CUP$SyntacticJSON$act_num,
    java_cup.runtime.lr_parser CUP$SyntacticJSON$parser,
    java.util.Stack            CUP$SyntacticJSON$stack,
    int                        CUP$SyntacticJSON$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$SyntacticJSON$result;

      /* select the action based on the action number */
      switch (CUP$SyntacticJSON$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= success EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.elementAt(CUP$SyntacticJSON$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.elementAt(CUP$SyntacticJSON$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$SyntacticJSON$stack.elementAt(CUP$SyntacticJSON$top-1)).value;
		RESULT = start_val;
              CUP$SyntacticJSON$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.elementAt(CUP$SyntacticJSON$top-1)), ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$SyntacticJSON$parser.done_parsing();
          return CUP$SyntacticJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // success ::= valid_json 
            {
              Object RESULT =null;

              CUP$SyntacticJSON$result = parser.getSymbolFactory().newSymbol("success",0, ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), RESULT);
            }
          return CUP$SyntacticJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // valid_json ::= array 
            {
              Object RESULT =null;

              CUP$SyntacticJSON$result = parser.getSymbolFactory().newSymbol("valid_json",1, ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), RESULT);
            }
          return CUP$SyntacticJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // valid_json ::= object 
            {
              Object RESULT =null;

              CUP$SyntacticJSON$result = parser.getSymbolFactory().newSymbol("valid_json",1, ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), RESULT);
            }
          return CUP$SyntacticJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // object ::= LEFT_CURLY_BRACKET member_list RIGHT_CURLY_BRACKET 
            {
              Object RESULT =null;

              CUP$SyntacticJSON$result = parser.getSymbolFactory().newSymbol("object",3, ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.elementAt(CUP$SyntacticJSON$top-2)), ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), RESULT);
            }
          return CUP$SyntacticJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // object ::= LEFT_CURLY_BRACKET RIGHT_CURLY_BRACKET 
            {
              Object RESULT =null;

              CUP$SyntacticJSON$result = parser.getSymbolFactory().newSymbol("object",3, ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.elementAt(CUP$SyntacticJSON$top-1)), ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), RESULT);
            }
          return CUP$SyntacticJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // member_list ::= member_list COMMA pair 
            {
              Object RESULT =null;

              CUP$SyntacticJSON$result = parser.getSymbolFactory().newSymbol("member_list",4, ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.elementAt(CUP$SyntacticJSON$top-2)), ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), RESULT);
            }
          return CUP$SyntacticJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // member_list ::= pair 
            {
              Object RESULT =null;

              CUP$SyntacticJSON$result = parser.getSymbolFactory().newSymbol("member_list",4, ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), RESULT);
            }
          return CUP$SyntacticJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // pair ::= STRING COLON value 
            {
              Object RESULT =null;
		int kleft = ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.elementAt(CUP$SyntacticJSON$top-2)).left;
		int kright = ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.elementAt(CUP$SyntacticJSON$top-2)).right;
		String k = (String)((java_cup.runtime.Symbol) CUP$SyntacticJSON$stack.elementAt(CUP$SyntacticJSON$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$SyntacticJSON$stack.peek()).value;
		 variables_json.add(new Variable(k, String.valueOf(v), file_path)); 
              CUP$SyntacticJSON$result = parser.getSymbolFactory().newSymbol("pair",5, ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.elementAt(CUP$SyntacticJSON$top-2)), ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), RESULT);
            }
          return CUP$SyntacticJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // array ::= LEFT_SQUARE_BRACKET RIGHT_SQUARE_BRACKET 
            {
              Object RESULT =null;

              CUP$SyntacticJSON$result = parser.getSymbolFactory().newSymbol("array",6, ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.elementAt(CUP$SyntacticJSON$top-1)), ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), RESULT);
            }
          return CUP$SyntacticJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // array ::= LEFT_SQUARE_BRACKET value_list RIGHT_SQUARE_BRACKET 
            {
              Object RESULT =null;

              CUP$SyntacticJSON$result = parser.getSymbolFactory().newSymbol("array",6, ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.elementAt(CUP$SyntacticJSON$top-2)), ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), RESULT);
            }
          return CUP$SyntacticJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // value_list ::= value_list COMMA value 
            {
              Object RESULT =null;

              CUP$SyntacticJSON$result = parser.getSymbolFactory().newSymbol("value_list",7, ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.elementAt(CUP$SyntacticJSON$top-2)), ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), RESULT);
            }
          return CUP$SyntacticJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // value_list ::= value 
            {
              Object RESULT =null;

              CUP$SyntacticJSON$result = parser.getSymbolFactory().newSymbol("value_list",7, ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), RESULT);
            }
          return CUP$SyntacticJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // value ::= STRING 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$SyntacticJSON$stack.peek()).value;
		 RESULT = s.toString(); 
              CUP$SyntacticJSON$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), RESULT);
            }
          return CUP$SyntacticJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // value ::= DECIMAL 
            {
              Object RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()).right;
		String d = (String)((java_cup.runtime.Symbol) CUP$SyntacticJSON$stack.peek()).value;
		 RESULT = d.toString(); 
              CUP$SyntacticJSON$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), RESULT);
            }
          return CUP$SyntacticJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // value ::= array 
            {
              Object RESULT =null;

              CUP$SyntacticJSON$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), RESULT);
            }
          return CUP$SyntacticJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // value ::= object 
            {
              Object RESULT =null;

              CUP$SyntacticJSON$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntacticJSON$stack.peek()), RESULT);
            }
          return CUP$SyntacticJSON$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$SyntacticJSON$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$SyntacticJSON$do_action(
    int                        CUP$SyntacticJSON$act_num,
    java_cup.runtime.lr_parser CUP$SyntacticJSON$parser,
    java.util.Stack            CUP$SyntacticJSON$stack,
    int                        CUP$SyntacticJSON$top)
    throws java.lang.Exception
    {
              return CUP$SyntacticJSON$do_action_part00000000(
                               CUP$SyntacticJSON$act_num,
                               CUP$SyntacticJSON$parser,
                               CUP$SyntacticJSON$stack,
                               CUP$SyntacticJSON$top);
    }
}

}
