package instructions;

import enums.EnumTypes;
import utils.Utils;

public class Param implements Statement {
    String id;
    EnumTypes type;

    public Param(String id, String type) {
        this.id = id;
        this.type = Utils.checkTypes(type);
    }

    @Override
    public String translatePython() {
        StringBuilder str = new StringBuilder();
        str.append(id);
        return str.toString();
    }

}
