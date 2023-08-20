package instructions;

import enums.EnumOperations;
import enums.EnumTerminals;
import enums.EnumUnitaryOperations;
import enums.TypeOperation;
import utils.PythonUtils;
import utils.Utils;

public class Operation implements Statement {

    private final String guid = Utils.generateGuid();

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

        if (typeTerminal == EnumTerminals.CARACTER) {
            if (value.length() > 1) {
                this.value = Character.toString((char) Integer.parseInt(value.replace("${", "").replace("}", "")));
            } else {
                this.value = value;
            }
            return;
        }
        this.value = value;

    }

    public Operation(Operation value) {
        this.opGroup = value;
        this.typeOp = TypeOperation.GROUP;
    }

    @Override
    public String getGuid() {
        return this.guid;
    }

    @Override
    public String translatePython() {
        StringBuilder str = new StringBuilder();

        switch (typeOp) {
            case BINARY -> {
                str.append(left.translatePython()).append(" ")
                        .append(PythonUtils.pythonSymbolBinaryOperators(type)).append(" ")
                        .append(right.translatePython());
            }
            case UNITARY -> {
                str.append(PythonUtils.pythonSymbolUnitaryOperators(typeUnitary)).append(" ").append(op.translatePython());
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
