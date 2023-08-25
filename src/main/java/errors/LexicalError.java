package errors;

public class LexicalError {
    public String lexeme;
    public int line;
    public int column;
    
    public LexicalError(String lexeme, int line, int column){
        this.lexeme = lexeme;
        this.line = line;
        this.column = (column-1);
    }
}
