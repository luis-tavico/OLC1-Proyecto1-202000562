package instructions;

import java.util.LinkedList;

public class Case implements Statement {

    Operation expr;
    LinkedList<Statement> statements;

    public Case(Operation expr, LinkedList<Statement> statements) {
        this.expr = expr;
        this.statements = statements;
    }

    @Override
    public String translatePython() {
        return null;
    }

}
