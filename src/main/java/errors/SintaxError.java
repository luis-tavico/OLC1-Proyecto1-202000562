package errors;

public class SintaxError {
    public String lexeme;
    public int line;
    public int column;
    
    public SintaxError(String lexeme, int line, int column){
        this.lexeme = lexeme;
        this.line = line;
        this.column = column;
    }
}
