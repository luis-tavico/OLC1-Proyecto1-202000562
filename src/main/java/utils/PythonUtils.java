package utils;

import enums.EnumOperations;
import enums.EnumTerminals;
import enums.EnumUnitaryOperations;

public class PythonUtils {

    public static String pythonSymbolBinaryOperators(EnumOperations op) {
        switch (op) {
            case PLUS -> {
                return "+";
            }
            case MINUS -> {
                return "-";
            }
            case TIMES -> {
                return "*";
            }
            case DIVIDE -> {
                return "/";
            }
            case AND -> {
                return "and";
            }
            case OR -> {
                return "or";
            }
            case EQUAL_TO -> {
                return "==";
            }
            case NOT_EQUAL_TO -> {
                return "!=";
            }
            case GREATER_THAN -> {
                return ">";
            }
            case LESS_THAN -> {
                return "<";
            }
            case GREATER_EQUAL -> {
                return ">=";
            }
            case LESS_EQUAL -> {
                return "<=";
            }
            default ->
                throw new AssertionError();
        }
    }

    public static String pythonTerminals(String value, EnumTerminals type) {
        switch (type) {
            case ID -> {
                return value;
            }
            case INTEGER -> {
                return value;
            }
            case DECIMAL -> {
                return value;
            }
            case TEXT -> {
                return value;

            }
            case CHARACTER -> {
                return value;
            }
            case BOOLEAN -> {
                if ("true".equals(value)) {
                    return "True";
                } else if ("false".equals(value)) {
                    return "False";
                }
            }
            default ->
                throw new AssertionError();
        }
        return null;
    }

    public static String pythonSymbolUnitaryOperators(EnumUnitaryOperations op) {
        switch (op) {
            case MINUS -> {
                return "-";
            }
            case NOT -> {
                return "not";
            }
            default ->
                throw new AssertionError();
        }

    }
}
