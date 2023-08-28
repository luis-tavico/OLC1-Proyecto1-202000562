package instructions;

import enums.EnumTypes;
import java.util.LinkedList;

public class Declaration_Assignment implements Statement {

    String varId;
    //EnumTypes type;
    Operation expr;
    LinkedList<Operation> variables = new LinkedList<>(); 

    public Declaration_Assignment(String varId, LinkedList<Operation> variables) {
        this.varId = varId;
        this.variables = variables;
    }

    public Declaration_Assignment(String varId, Operation expr) {
        this.varId = varId;
        this.expr = expr;
    }

    public Declaration_Assignment(String varId) {
        this.varId = varId;
    }

    /*
    public Declaration_Assignment(String type, String varId, Operation expr) {
        this.type = Utils.checkTypes(type);
        this.varId = varId;
        this.expr = expr;
    }

    public Declaration_Assignment(String varId, Operation expr) {
        this.varId = varId;
        this.expr = expr;
    }

    public Declaration_Assignment(String type, String varId) {
        this.type = Utils.checkTypes(type);
        this.varId = varId;
    }
     */
    @Override
    public String translatePython() {
        StringBuilder str = new StringBuilder();

        str.append(varId).append(" = ").append(expr.translatePython()).append("\n");

        return str.toString();
        /*
        StringBuilder str = new StringBuilder();

        Iterator<String> iterator = name_list.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            str.append(name);
            if (iterator.hasNext()) {
                str.append(",");
            }
        }

        str.append(" = ");

        iterator = name_list.iterator();

        while (iterator.hasNext()) {
            iterator.next();
            str.append(expr.translatePython());
            if (iterator.hasNext()) {
                str.append(",");
            }
        }

        return str.toString();
         */

    }
}
