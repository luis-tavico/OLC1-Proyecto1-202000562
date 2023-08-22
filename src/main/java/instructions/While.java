package instructions;

import java.util.LinkedList;
import utils.Utils;

public class While implements Statement {
    Operation expr;
    LinkedList<Statement> statements;

    public While(Operation expr, LinkedList<Statement> statements) {
        this.expr = expr;
        this.statements = statements;
    }

    public While(Operation expr) {
        this.expr = expr;
    }

    @Override
    public String translatePython() {
        StringBuilder str = new StringBuilder();

        str.append("while ").append(expr.translatePython()).append(":\n");
        for (Statement statement : statements) {
            if (statement != null) {
                str.append(Utils.addTabs(statement.translatePython())).append("\n");
            }
        }

        return str.toString();
    }
}
