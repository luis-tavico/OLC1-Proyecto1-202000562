package instructions;

import java.util.LinkedList;
import utils.Utils;
import utils.PythonUtils;

public class While implements Statement {
    private final String guid = Utils.generateGuid();

    @Override
    public String getGuid() {
        return this.guid;
    }

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
