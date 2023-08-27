package instructions;

import java.util.LinkedList;

public class Function implements Statement {

    String funcId;
    LinkedList<Declaration_Assignment> decla_assigs;

    public Function(String funcId, LinkedList<Declaration_Assignment> decla_assigs) {
        this.funcId = funcId;
        this.decla_assigs = decla_assigs;
    }

    @Override
    public String translatePython() {

        for (Declaration_Assignment decla_assig : decla_assigs) {
            if (decla_assig != null) {
                System.out.println(decla_assig.varId);
                System.out.println(decla_assig.expr.translatePython());
            }
        }
        return "";
    }
}
