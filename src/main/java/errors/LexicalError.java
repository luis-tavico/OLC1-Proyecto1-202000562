package errors;

public class LexicalError {
    public String lexema;
    public int linea;
    public int columna;
    
    public LexicalError(String lexema, int linea, int columna){
        this.lexema = lexema;
        this.linea = linea;
        this.columna = columna;
    }
}
