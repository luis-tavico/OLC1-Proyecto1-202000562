package instructions;

public class Print implements Statement {
    Operation expr;

    public Print(Operation expr) {
        this.expr = expr;
    }

    @Override
    public String translatePython() {
        StringBuilder str = new StringBuilder();
        str.append("print(").append(expr.translatePython()).append(")");
        return str.toString();
    }
}