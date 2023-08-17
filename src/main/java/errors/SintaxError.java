package errors;

public class SintaxError {
    public String lexema;
    public int linea;
    public int columna;
    
    public SintaxError(String lexema, int linea, int columna){
        this.lexema = lexema;
        this.linea = linea;
        this.columna = columna;
    }
}
