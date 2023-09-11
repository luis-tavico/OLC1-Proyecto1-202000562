package instructions;

import java.util.LinkedList;
import utils.Utils;

public class Default implements Statement {

    LinkedList<Statement> statements;

    public Default(LinkedList<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String translatePython() {

        StringBuilder str = new StringBuilder();
        str.append("case _ :\n");

        for (Statement statement : statements) {
            if (statement != null) {
                str.append(Utils.addTabs(statement.translatePython())).append("\n");
            }
        }

        return str.toString();

    }

}