package instructions;

import java.util.LinkedList;

public class Case implements Statement {

    LinkedList<Statement> statements;

    public Case(LinkedList<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String translatePython() {
        return null;
    }

}
