package instructions;

import enums.EnumTypes;
import utils.Utils;

public class Param implements Statement {
    private final String guid = Utils.generateGuid();

    @Override
    public String getGuid() {
        return this.guid;
    }

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
