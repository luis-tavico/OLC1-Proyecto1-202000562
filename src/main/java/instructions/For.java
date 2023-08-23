package instructions;

import java.util.LinkedList;
import utils.Utils;
import utils.PythonUtils;

public class For implements Statement {

    String varId;
    Operation expr1;
    Operation expr2;
    int incremental;
    LinkedList<Statement> statements;

    public For(String varId, Operation expr1, Operation expr2, LinkedList<Statement> statements) {
        this.varId = varId;
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.incremental = 1;
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

    @Override
    public String translatePython() {
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
    }

}
