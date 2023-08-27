package utils;

import java.util.LinkedList;
import instructions.Statement;
import errors.LexicalError;
import errors.SintaxError;
import instructions.Variable;
import tokens.Tokens;

public class AnalyzerResult {

    public LinkedList<Statement> ast;
    public LinkedList<LexicalError> lexErrors;
    public LinkedList<SintaxError> sintaxErrors;
    public LinkedList<Tokens> tokens;
    public LinkedList<Variable> variables_json;

    public AnalyzerResult(LinkedList<Statement> ast, LinkedList<LexicalError> lexErrors, LinkedList<SintaxError> sintaxErrors, LinkedList<Tokens> tokens, LinkedList<Variable> variables_json) {
        this.ast = ast;
        this.lexErrors = lexErrors;
        this.sintaxErrors = sintaxErrors;
        this.tokens = tokens;
        this.variables_json = variables_json;
    }
    
    public AnalyzerResult(LinkedList<LexicalError> lexErrors, LinkedList<SintaxError> sintaxErrors, LinkedList<Tokens> tokens, LinkedList<Variable> variables_json) {
        this.lexErrors = lexErrors;
        this.sintaxErrors = sintaxErrors;
        this.tokens = tokens;
        this.variables_json = variables_json;
    }

}
