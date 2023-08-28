package instructions;

import java.util.LinkedList;
import utils.Utils;

public class ElseIf implements Statement {

    Operation expr;
    LinkedList<Statement> statements;

    public ElseIf(Operation expr, LinkedList<Statement> statements) {
        this.expr = expr;
        this.statements = statements;
    }

    @Override
    public String translatePython() {
        StringBuilder str = new StringBuilder();

        str.append("elif ").append(expr.translatePython()).append(":\n");
        for (Statement statement : statements) {
            if (statement != null) {
                str.append(Utils.addTabs(statement.translatePython())).append("\n");
            }
        }

        return str.toString();
    }

}
