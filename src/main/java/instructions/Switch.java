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
        str.append("def switch (").append(expr.translatePython()).append("):\n\tswitcher = {\n");

        int i = 1;
        for (Case aCase : cases) {
            str.append("\t").append(aCase.expr.translatePython()).append(": ");
            for (Statement statement : aCase.statements) {
                if (statement != null) {
                    str.append(Utils.addTabs(statement.translatePython()).replaceAll("[\t\n]", ""));
                }
            }
            str.append(",\n");
            i++;
        }
        if (default_statement != null) {
            str.append("\t").append(String.valueOf(i)).append(": ");
            for (Statement else_statement : default_statement) {
                if (else_statement != null) {
                    str.append(Utils.addTabs(else_statement.translatePython()).replaceAll("[\t\n]", "")).append("\n");
                }
            }
        }
        str.append("\t}");
        return str.toString();

        /*
        StringBuilder str = new StringBuilder();
        str.append("def switch (").append(expr.translatePython()).append("):\n");

        int i = 0;
        for (Case aCase : cases) {
            if (i == 0) {
                str.append("\tif ").append(expr.translatePython()).append(" == ").append(aCase.expr.translatePython()).append(":\n");
                for (Statement statement : aCase.statements) {
                    if (statement != null) {
                        str.append("\t").append(Utils.addTabs(statement.translatePython())).append("\n");
                    }
                }

            } else {
                str.append("\telif ").append(expr.translatePython()).append(" == ").append(aCase.expr.translatePython()).append(":\n");
                for (Statement statement : aCase.statements) {
                    if (statement != null) {
                        str.append("\t").append(Utils.addTabs(statement.translatePython())).append("\n");
                    }
                }
            }
            i++;
        }
        if (default_statement != null) {
            str.append("\telse:\n");
            for (Statement else_statement : default_statement) {
                if (else_statement != null) {
                    str.append("\t").append(Utils.addTabs(else_statement.translatePython())).append("\n");
                }
            }
        }

        return str.toString();

    }
    */
        
    }

}
