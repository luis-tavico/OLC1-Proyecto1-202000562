package instructions;

import java.util.LinkedList;
import utils.Utils;

public class For implements Statement {

    String varId;
    String min;
    Operation expr1;
    Operation expr2;
    int incremental;
    LinkedList<Statement> statements;

    public For(String varId, String min, Operation expr, LinkedList<Statement> statements) {
        this.varId = varId;
        this.min = min;
        this.expr1 = expr;
        this.statements = statements;
    }

    public For(String varId, Operation expr) {
        this.varId = varId;
        this.expr1 = expr;
    }

    /*
    public For(String varId, Operation expr1, Operation expr2, LinkedList<Statement> statements) {
        this.varId = varId;
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.incremental = 1;
        this.statements = statements;
    }
    
    public For(String varId, Operation expr, LinkedList<Statement> statements) {
        this.varId = varId;
        this.expr1 = expr;
        this.statements = statements;
    }

    public For(String varId, Operation expr1, Operation expr2, String incremental, LinkedList<Statement> statements) {
        this.varId = varId;
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.incremental = Integer.parseInt(incremental);
        this.statements = statements;
    }

    public For(String varId, Operation expr1, Operation expr2) {
        this.varId = varId;
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.incremental = 1;
    }

    public For(String varId, Operation expr1, Operation expr2, String incremental) {
        this.varId = varId;
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.incremental = Integer.parseInt(incremental);
    }
     */
    @Override
    public String translatePython() {
        /*
        StringBuilder str = new StringBuilder();

        str.append("for ").append(varId).append(" in range(").append(expr1.translatePython())
                .append(",").append(expr2.translatePython());

        if (incremental != 0) {
            str.append(",").append(incremental);
        }

        str.append("):\n");

        for (Statement statement : statements) {
            if (statement != null) {
                str.append(Utils.addTabs(statement.translatePython())).append("\n");
            }
        }

        return str.toString();
         */
        StringBuilder str = new StringBuilder();
        str.append("for ").append(varId).append(" in range(").append(min).append(", ").append(expr1.right.translatePython()).append(", ").append(incremental).append("):\n");

        for (Statement statement : statements) {
            if (statement != null) {
                str.append(Utils.addTabs(statement.translatePython())).append("\n");
            }
        }
        return str.toString();
    }

}
