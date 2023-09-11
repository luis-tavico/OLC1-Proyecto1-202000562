package instructions;

import java.util.LinkedList;
import utils.Utils;

public class Switch implements Statement {

    Operation expr;
    LinkedList<Case> cases;
    Default default_case;

    public Switch(Operation expr) {
        this.expr = expr;
    }

    public Switch(Operation expr, LinkedList<Case> cases) {
        this.expr = expr;
        this.cases = cases;
    }

    public Switch(Operation expr, LinkedList<Case> cases, Default default_case) {
        this.expr = expr;
        this.cases = cases;
        this.default_case = default_case;
    }

    @Override
    public String translatePython() {

        StringBuilder str = new StringBuilder();
        str.append("match ").append(expr.translatePython()).append(":\n");

        for (Case aCase : cases) {
            if (aCase != null) {
                str.append(Utils.addTabs(aCase.translatePython())).append("\n");
            }
        }
        
        if (default_case != null) {
            str.append(Utils.addTabs(default_case.translatePython())).append("\n");
        }

        return str.toString();
    }

}
