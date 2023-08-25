package instructions;

import enums.EnumTypes;
import java.util.Iterator;
import java.util.LinkedList;
import utils.Utils;

public class Function implements Statement {

    String funcId;
    EnumTypes type;
    LinkedList<Param> params_list;
    LinkedList<Statement> statements;

    public Function(String funcId, LinkedList<Statement> statements) {
        this.funcId = funcId;
        this.statements = statements;
    }

    public Function(String funcId, String type, LinkedList<Param> params_list, LinkedList<Statement> statements) {
        this.funcId = funcId;
        this.type = Utils.checkTypes(type);
        this.params_list = params_list;
        this.statements = statements;
    }

    /*
    public Function(String funcId, String type, LinkedList<Statement> statements) {
        this.funcId = funcId;
        this.type = Utils.checkTypes(type);
        this.statements = statements;
    }

    public Function(String funcId, String type, LinkedList<Param> params_list, LinkedList<Statement> statements) {
        this.funcId = funcId;
        this.type = Utils.checkTypes(type);
        this.params_list = params_list;
        this.statements = statements;
    }*/
    @Override
    public String translatePython() {
        StringBuilder str = new StringBuilder();
        
        if (funcId.equalsIgnoreCase("DefinirGlobales")) {
            System.out.println("es igual a DefinirGlobales");
            
        }
        if (funcId.equalsIgnoreCase("GraficaBarras")) {
            System.out.println("es igual a GraficaBarras");
        }

        str.append("def ").append(funcId).append("(");

        if (params_list != null) {
            Iterator<Param> iterator = params_list.iterator();

            while (iterator.hasNext()) {
                String args = iterator.next().translatePython();
                str.append(args);
                if (iterator.hasNext()) {
                    str.append(",");
                }
            }
        }

        str.append("):\n");

        for (Statement statement : statements) {
            if (statement != null) {
                str.append(Utils.addTabs(statement.translatePython())).append("\n");
            }
        }

        return str.toString();

    }

}
