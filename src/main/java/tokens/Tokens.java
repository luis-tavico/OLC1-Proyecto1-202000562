package tokens;

public class Tokens {
    public String lexeme;
    public String token;
    public int line;
    public int column;
    
    public Tokens(String lexeme, String token, int line, int column) {
        this.lexeme = lexeme;
        this.token = token;
        this.line = line;
        this.column = (column);
    }
}
