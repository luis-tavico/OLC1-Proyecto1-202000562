package instructions;

import enums.EnumOperations;
import enums.EnumTerminals;
import enums.EnumUnitaryOperations;
import enums.TypeOperation;
import utils.PythonUtils;

public class Operation implements Statement {

    // Binary operations
    Operation left;
    Operation right;
    EnumOperations type;

    // Unitary operations;
    Operation op;
    EnumUnitaryOperations typeUnitary;

    // Terminal expresions
    String value;
    EnumTerminals typeTerminal;

    // Group
    Operation opGroup;

    // Flag Type
    private final TypeOperation typeOp;

    public Operation(Operation left, EnumOperations type, Operation right) {
        this.left = left;
        this.right = right;
        this.type = type;
        this.typeOp = TypeOperation.BINARY;
    }

    public Operation(Operation op, EnumUnitaryOperations typeUnitary) {
        this.op = op;
        this.typeUnitary = typeUnitary;
        this.typeOp = TypeOperation.UNITARY;
    }

    public Operation(String value, EnumTerminals typeTerminal) {
        this.typeTerminal = typeTerminal;
        this.typeOp = TypeOperation.TERMINAL;
        this.value = value;
    }

    public Operation(Operation value) {
        this.opGroup = value;
        this.typeOp = TypeOperation.GROUP;
    }

    public static boolean isNumber(String text) {
        boolean isNumber = false;
        try {
            Integer.parseInt(text);
            isNumber = true;
        } catch (NumberFormatException e) {
            isNumber = false;
        }
        try {
            Double.parseDouble(text);
            isNumber = true;
        } catch (NumberFormatException e) {
            isNumber = false;
        }
        return isNumber;
    }

    @Override
    public String translatePython() {
        StringBuilder str = new StringBuilder();

        switch (typeOp) {
            case BINARY -> {
                if (PythonUtils.pythonSymbolBinaryOperators(type).equals("+")) {
                    if (!isNumber(left.translatePython())) {
                        str.append(left.translatePython()).append(" , ").append(right.translatePython());
                    } else {
                        str.append(left.translatePython()).append(" ").append(PythonUtils.pythonSymbolBinaryOperators(type)).append(" ").append(right.translatePython());
                    }
                } else {
                    str.append(left.translatePython()).append(" ").append(PythonUtils.pythonSymbolBinaryOperators(type)).append(" ").append(right.translatePython());
                }
            }
            case UNITARY -> {
                if (PythonUtils.pythonSymbolUnitaryOperators(typeUnitary).equals("++") || PythonUtils.pythonSymbolUnitaryOperators(typeUnitary).equals("--")) {
                    str.append(op.translatePython()).append(PythonUtils.pythonSymbolUnitaryOperators(typeUnitary));
                } else {
                    str.append(PythonUtils.pythonSymbolUnitaryOperators(typeUnitary)).append(" ").append(op.translatePython());
                }
            }
            case TERMINAL -> {
                str.append(PythonUtils.pythonTerminals(value, typeTerminal));
            }
            case GROUP -> {
                str.append("(").append(opGroup.translatePython()).append(")");
            }
            default ->
                throw new AssertionError();
        }

        return str.toString();
    }

}
