package instructions;

import java.util.LinkedList;
import utils.Utils;

public class Switch implements Statement {

    Operation expr;
    LinkedList<Case> cases;
    LinkedList<Statement> default_statement;

    public Switch(Operation expr, LinkedList<Case> cases) {
        this.expr = expr;
        this.cases = cases;
    }

    public Switch(Operation expr, LinkedList<Case> cases, LinkedList<Statement> default_statement) {
        this.expr = expr;
        this.cases = cases;
        this.default_statement = default_statement;
    }

    public Switch(Operation expr) {
        this.expr = expr;
    }

    @Override
    public String translatePython() {
        StringBuilder str = new StringBuilder();
        str.append("match ").append(expr.translatePython()).append(":\n");

        for (Case aCase : cases) {
            str.append("\t").append("case ").append(aCase.expr.translatePython()).append(":\n");
            for (Statement statement : aCase.statements) {
                if (statement != null) {
                    str.append("\t").append(Utils.addTabs(statement.translatePython()));
                }
            }
            str.append("\n");
        }
        
        if (default_statement != null) {
            str.append("\t").append("case ").append("_").append(":\n");
            for (Statement statement : default_statement) {
                if (statement != null) {
                    str.append("\t").append(Utils.addTabs(statement.translatePython()));
                }
            }
        }
        str.append("\t");
        return str.toString();
        
    }

}
