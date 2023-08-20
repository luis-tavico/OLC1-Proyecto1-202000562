package utils;

import enums.EnumOperations;
import enums.EnumTerminals;
import enums.EnumUnitaryOperations;

public class PythonUtils {

    public static String pythonSymbolBinaryOperators(EnumOperations op) {
        switch (op) {
            case MAS -> {
                return "+";
            }
            case MENOS -> {
                return "-";
            }
            case POR -> {
                return "*";
            }
            case DIVIDIDO -> {
                return "/";
            }
            case AND -> {
                return "+";
            }
            case OR -> {
                return "+";
            }
            case IGUAL_QUE -> {
                return "+";
            }
            case DISTINTO_QUE -> {
                return "+";
            }
            case MAYOR -> {
                return "+";
            }
            case MENOR -> {
                return "+";
            }
            case MAYOR_IGUAL -> {
                return "+";
            }
            case MENOR_IGUAL -> {
                return "+";
            }
            default ->
                throw new AssertionError();
        }
    }

    public static String pythonTerminals(String value, EnumTerminals type) {
        switch (type) {
            case IDENTIFICADOR -> {
                return value;
            }
            case ENTERO -> {
                return value;
            }
            case DECIMAL -> {
                return value;
            }
            case CADENA -> {
                boolean contains = value.contains("\n");
                if (!contains) {
                    return "\"" + value + "\"";
                } else {
                    return "'''" + value + "'''";
                }
            }
            case CARACTER -> {
                return "'" + value + "'";
            }
            case BOOLEANO -> {
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
            case NEGATIVE -> {
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
