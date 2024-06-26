package instructions;

import java.util.LinkedList;
import utils.Utils;

public class Case implements Statement {

    Operation expr;
    LinkedList<Statement> statements;

    public Case(Operation expr, LinkedList<Statement> statements) {
        this.expr = expr;
        this.statements = statements;
    }

    @Override
    public String translatePython() {

        StringBuilder str = new StringBuilder();
        str.append("case ").append(expr.translatePython()).append(" :\n");
        
        for (Statement statement : statements) {
            if (statement != null) {
                str.append(Utils.addTabs(statement.translatePython())).append("\n");
            }
        }

        return str.toString();
    }

}
