package instructions;

public class Variable {

    String variable_name = "";
    String variable_value;
    String path = "";
    
    public Variable(String variable_name, Operation variable_value, String path) {
        this.variable_name = variable_name;
        this.variable_value = variable_value.translatePython();
        this.path = path;
    }
    
    public Variable(String variable_name, String variable_value, String path) {
        this.variable_name = variable_name;
        this.variable_value = variable_value;
        this.path = path;
    }
    
    public String getName() {
        return this.variable_name;
    }
    
    public String getValue() {
        return this.variable_value;
    }
    
    public String getPath() {
        return this.path;
    }
}
