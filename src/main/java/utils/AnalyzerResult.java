package utils;

import java.util.LinkedList;
import errors.LexicalError;
import errors.SintaxError;
import instructions.Statement;

public class AnalyzerResult {
    public LinkedList<Statement> ast;
    public LinkedList<LexicalError> lexErrors;
    public LinkedList<SintaxError> sintaxErrors;
    
    public AnalyzerResult(LinkedList<Statement> ast, LinkedList<LexicalError> lexErrors, LinkedList<SintaxError> sintaxErrors) {
        this.ast = ast;
        this.lexErrors = lexErrors;
        this.sintaxErrors = sintaxErrors;
    }
    
}
