package instructions;

public class Variable {

    String variable_name = "";
    String variable_value;
    //String variable_type = "";

    /*
    public Variable(String variable_name, String variable_value, String variable_type) {
        this.variable_name = variable_name;
        //this.variable_value = variable_value;
        //this.variable_type = variable_type;
    }
     */
    public Variable(String variable_name, Operation variable_value) {
        this.variable_name = variable_name;
        this.variable_value = variable_value.translatePython();
        //this.variable_type = variable_type;
    }
}
