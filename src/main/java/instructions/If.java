package instructions;

import java.util.LinkedList;
import utils.Utils;

public class If implements Statement {

    Operation expr;
    LinkedList<Statement> statements;
    LinkedList<ElseIf> elifs;
    LinkedList<Statement> else_statements;

    public If(Operation expr, LinkedList<Statement> statements) {
        this.expr = expr;
        this.statements = statements;
    }

    public If(Operation expr, LinkedList<Statement> statements, LinkedList<Statement> else_statements) {
        this.expr = expr;
        this.statements = statements;
        this.else_statements = else_statements;
    }

    public If(Operation expr, LinkedList<Statement> statements, LinkedList<ElseIf> elifs, LinkedList<Statement> else_statements) {
        this.expr = expr;
        this.statements = statements;
        this.elifs = elifs;
        this.else_statements = else_statements;
    }

    @Override
    public String translatePython() {
        StringBuilder str = new StringBuilder();

        str.append("if ").append(expr.translatePython()).append(":\n");
        for (Statement statement : statements) {
            if (statement != null) {
                str.append(Utils.addTabs(statement.translatePython())).append("\n");
            }
        }

        if (elifs != null) {

            for (ElseIf elif : elifs) {
                str.append(elif.translatePython()).append("\n");
            }

        }

        if (else_statements != null) {
            str.append("else:\n");
            for (Statement else_statement : else_statements) {
                if (else_statement != null) {
                    str.append(Utils.addTabs(else_statement.translatePython())).append("\n");
                }
            }

        }

        return str.toString();
    }

}
