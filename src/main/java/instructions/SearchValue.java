package instructions;

import java.util.LinkedList;
import enums.EnumTerminals;

public class SearchValue {

    LinkedList<Variable> variables_json = new LinkedList<>();
    String path = "";
    String variable_name = "";
    String variable_value = "";

    public SearchValue(LinkedList<Variable> variable_json, String path, String variable_name) {
        this.variables_json = variable_json;
        this.path = path;
        this.variable_name = variable_name;
    }

    public String getValue() {
        for (Variable variable : variables_json) {
            if (variable != null) {
                if (("\"" + variable.getPath() + "\"").equals(path)) {
                    if (variable.getName().equals(variable_name)) {
                        variable_value = variable.getValue();
                        return variable.getValue();
                    }
                }
            }
        }
        return "";
    }

    public EnumTerminals getTypeTerminal() {
        if (isNumber(variable_value)) {
            return EnumTerminals.DECIMAL;
        } else {
            return EnumTerminals.TEXT;
        }
    }

    public boolean isNumber(String text) {
        boolean isNumber = false;
        try {
            Double.parseDouble(text);
            isNumber = true;
        } catch (NumberFormatException e) {
            isNumber = false;
        }
        return isNumber;
    }

}
