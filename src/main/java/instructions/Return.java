package instructions;

import utils.Utils;

public class Return implements Statement {

    Operation expr;

    public Return(Operation expr) {
        this.expr = expr;
    }

    @Override
    public String translatePython() {
        StringBuilder str = new StringBuilder();

        str.append("return ").append(expr.translatePython());

        return str.toString();
    }
}
