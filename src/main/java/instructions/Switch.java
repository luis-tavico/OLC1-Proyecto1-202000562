package instructions;

import java.util.LinkedList;
import utils.Utils;

public class Switch implements Statement {

    Operation expr;
    LinkedList<Case> cases;
    LinkedList<Statement> default_statements;

    public Switch(Operation expr, LinkedList<Case> cases) {
        this.expr = expr;
        this.cases = cases;
    }

    public Switch(Operation expr, LinkedList<Case> cases, LinkedList<Statement> default_statements) {
        this.expr = expr;
        this.cases = cases;
        this.default_statements = default_statements;
    }

    public Switch(Operation expr) {
        this.expr = expr;
    }

    @Override
    public String translatePython() {
        StringBuilder str = new StringBuilder();

        str.append("def switch (").append(expr.translatePython()).append(")").append(":\n\tswitcher = {\n");
        for (Case aCase : cases) {
            str.append("\t\tcase ").append(expr.translatePython()).append(":\n");
            for (Statement statement : aCase.statements) {
                if (statement != null) {
                    str.append("\t\t").append(Utils.addTabs(statement.translatePython())).append("\n");
                }
            }
        }
        if (default_statements != null) {
            str.append("else:\n");
            for (Statement else_statement : default_statements) {
                if (else_statement != null) {
                    str.append(Utils.addTabs(else_statement.translatePython())).append("\n");
                }
            }
        }
        str.append("\n\t}");
        return str.toString();
    }

    /*
    public String translatePython() {
        StringBuilder str = new StringBuilder();

        int i = 0;
        for (Case aCase : cases) {
            if (i == 0) {
                str.append("if ").append(expr.translatePython()).append("==").append(":\n");
                for (Statement statement : aCase.statements) {
                    if (statement != null) {
                        str.append(Utils.addTabs(statement.translatePython())).append("\n");
                    }
                }

            } else {
                str.append("elif ").append(expr.translatePython()).append("==").append(":\n");
                for (Statement statement : aCase.statements) {
                    if (statement != null) {
                        str.append(Utils.addTabs(statement.translatePython())).append("\n");
                    }
                }
            }
            i++;
        }
        if (default_statements != null) {
            str.append("else:\n");
            for (Statement else_statement : default_statements) {
                if (else_statement != null) {
                    str.append(Utils.addTabs(else_statement.translatePython())).append("\n");
                }
            }
        }

        return str.toString();

    }
     */
}
