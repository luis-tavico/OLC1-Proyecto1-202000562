package utils;

import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import analyzersStatPy.Lexical;
import analyzersStatPy.Syntactic;
import enums.EnumTypes;
import instructions.Statement;

public class Utils {

    public static AnalyzerResult loadFile(String input) throws Exception {
        Lexical scanner = new Lexical(new StringReader(input));
        Syntactic parser = new Syntactic(scanner);
        try {
            parser.parse();
        } catch (Exception ex) {
            throw ex;
        }
        return new AnalyzerResult(parser.AST, scanner.lexicalErrors, parser.errors, scanner.tokens);
    }

    public static String translatePython(LinkedList<Statement> ast) {
        StringBuilder str = new StringBuilder();
        LinkedList<Statement> methods = new LinkedList<>();
        LinkedList<Statement> mainStatements = new LinkedList<>();

        for (Statement statement : ast) {
            if (statement != null) {
                String className = statement.getClass().getSimpleName();
                if ("Procedure".equals(className) || "Function".equals(className)) {
                    methods.add(statement);
                } else {
                    mainStatements.add(statement);
                }
            }
        }

        for (Statement method : methods) {
            str.append(method.translatePython()).append("\n");
        }

        str.append("def main():\n");
        for (Statement statement : mainStatements) {
            str.append(addTabs(statement.translatePython())).append("\n");
        }
        str.append("if __name__ == '__main__':\n");
        str.append("\tmain()");
        return str.toString();
    }

    public static EnumTypes checkTypes(String type) {
        type = type.toLowerCase();
        switch (type) {
            case "int" -> {
                return EnumTypes.INTEGER;
            }
            case "double" -> {
                return EnumTypes.DECIMAL;
            }
            case "string" -> {
                return EnumTypes.TEXT;
            }
            case "char" -> {
                return EnumTypes.CHARACTER;
            }
            case "bool" -> {
                return EnumTypes.BOOLEAN;
            }
            default ->
                throw new AssertionError();
        }
    }

    public static String viewTypes(EnumTypes type) {
        switch (type) {
            case INTEGER -> {
                return "int";
            }
            case DECIMAL -> {
                return "double";
            }
            case TEXT -> {
                return "string";
            }
            case CHARACTER -> {
                return "char";
            }
            case BOOLEAN -> {
                return "bool";
            }
            default ->
                throw new AssertionError();
        }
    }

    public static String addTabs(String input) {
        StringBuilder str = new StringBuilder();
        List<String> lines = input.lines().toList();
        for (String line : lines) {
            str.append("\t").append(line).append("\n");
        }
        return str.toString();
    }

}
