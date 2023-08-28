package instructions;

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

    @Override
    public String translatePython() {
        StringBuilder str = new StringBuilder();

        if (expr != null) {
            str.append(varId).append(" = ").append(expr.translatePython()).append("\n");
        } else {
            str.append("var ").append(varId);
        }

        return str.toString();
    }

}
