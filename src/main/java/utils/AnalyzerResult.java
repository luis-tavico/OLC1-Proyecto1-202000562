package utils;

import java.util.LinkedList;
import instructions.Statement;
import errors.LexicalError;
import errors.SintaxError;
import tokens.Tokens;

public class AnalyzerResult {
    public LinkedList<Statement> ast;
    public LinkedList<LexicalError> lexErrors;
    public LinkedList<SintaxError> sintaxErrors;
    public LinkedList<Tokens> tokens;
    
    public AnalyzerResult(LinkedList<Statement> ast, LinkedList<LexicalError> lexErrors, LinkedList<SintaxError> sintaxErrors, LinkedList<Tokens> tokens) {
        this.ast = ast;
        this.lexErrors = lexErrors;
        this.sintaxErrors = sintaxErrors;
        this.tokens = tokens;
    }
    
}
