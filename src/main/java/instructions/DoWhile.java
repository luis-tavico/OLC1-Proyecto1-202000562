package instructions;

import java.util.LinkedList;
import utils.Utils;

public class DoWhile implements Statement {

    LinkedList<Statement> statements;
    Operation expr;

    public DoWhile(LinkedList<Statement> statements, Operation expr) {
        this.statements = statements;
        this.expr = expr;
    }

    public DoWhile(Operation expr) {
        this.expr = expr;
    }

    @Override
    public String translatePython() {
        StringBuilder str = new StringBuilder();
        str.append("while ").append("True:\n");
        for (Statement statement : statements) {
            if (statement != null) {
                str.append(Utils.addTabs(statement.translatePython())).append("\n");
            }
        }
        str.append("\tif ").append(expr.translatePython()).append(":\n");
        str.append("\t\tbreak");

        return str.toString();
    }

}
