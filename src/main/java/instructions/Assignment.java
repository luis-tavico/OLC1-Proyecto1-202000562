package instructions;

import java.util.Iterator;
import java.util.LinkedList;

public class Assignment implements Statement {

    LinkedList<String> name_list;
    Operation expr;

    public Assignment(LinkedList<String> name_list, Operation expr) {
        this.name_list = name_list;
        this.expr = expr;
    }

    @Override
    public String translatePython() {
        StringBuilder str = new StringBuilder();
        Iterator<String> iterator = name_list.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            str.append(name);
            if (iterator.hasNext()) {
                str.append(",");
            }
        }

        str.append(" = ");

        iterator = name_list.iterator();

        while (iterator.hasNext()) {
            iterator.next();
            str.append(expr.translatePython());
            if (iterator.hasNext()) {
                str.append(",");
            }
        }

        str.append("\n");

        return str.toString();
    }

}
