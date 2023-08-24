package instructions;

import enums.EnumTypes;
import java.util.Iterator;
import java.util.LinkedList;
import utils.Utils;

public class Declaration implements Statement {

    LinkedList<String> name_list;
    EnumTypes type;
    Operation expr;

    public Declaration(LinkedList<String> name_list, String type, Operation expr) {
        this.name_list = name_list;
        this.type = Utils.checkTypes(type);
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

        return str.toString();

    }

}
