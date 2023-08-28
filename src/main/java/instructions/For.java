package instructions;

import java.util.LinkedList;
import utils.PythonUtils;
import utils.Utils;

public class For implements Statement {

    String varId;
    String min;
    Operation expr1;
    Operation expr2;
    LinkedList<Statement> statements;

    public For(String varId, String min, Operation expr1, Operation expr2, LinkedList<Statement> statements) {
        this.varId = varId;
        this.min = min;
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.statements = statements;
    }

    public For(String varId, String min, Operation expr1, Operation expr2) {
        this.varId = varId;
        this.min = min;
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public String translatePython() {

        StringBuilder str = new StringBuilder();
        //min = String.valueOf((Integer.parseInt(min) + 1));

        if (PythonUtils.pythonSymbolUnitaryOperators(expr2.typeUnitary).equals("++")) {
            str.append("for ").append(varId).append(" in range(").append(min).append(", ").append(expr1.right.translatePython()).append(", ").append("1").append("):\n");
        } else if (PythonUtils.pythonSymbolUnitaryOperators(expr2.typeUnitary).equals("--")) {

        }

        for (Statement statement : statements) {
            if (statement != null) {
                str.append(Utils.addTabs(statement.translatePython())).append("\n");
            }
        }
        return str.toString();
    }

}
