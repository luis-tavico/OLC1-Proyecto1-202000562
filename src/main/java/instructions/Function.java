package instructions;

import enums.EnumTerminals;
import graph.BarChart;
import java.util.LinkedList;
import javax.swing.WindowConstants;

public class Function implements Statement {

    String funcId;
    LinkedList<Declaration_Assignment> decla_assigs;
    LinkedList<Variable> variables;
    LinkedList<Variable> variables_json = new LinkedList<>();

    public Function(String funcId, LinkedList<Declaration_Assignment> decla_assigs, LinkedList<Variable> variables, LinkedList<Variable> variables_json) {
        this.funcId = funcId;
        this.decla_assigs = decla_assigs;
        this.variables = variables;
        this.variables_json = variables_json;
    }

    @Override
    public String translatePython() {

        if (funcId.equalsIgnoreCase("DefinirGlobales")) {
            /*for (Declaration_Assignment decla_assig : decla_assigs) {
                if (decla_assig != null) {
                    //System.out.println(decla_assig.type);
                    variables.add(new Variable(decla_assig.varId, decla_assig.expr.translatePython(), ""));
                }
            }*/
        } else if (funcId.equalsIgnoreCase("GraficaBarras")) {
            String title = "";
            String titleX = "";
            String titleY = "";
            for (Declaration_Assignment decla_assig : decla_assigs) {
                if (decla_assig != null) {
                    if (decla_assig.varId.equalsIgnoreCase("titulo")) {
                        if (decla_assig.expr.typeTerminal.compareTo(EnumTerminals.ID) == 0) {
                            for (Variable variable : variables) {
                                if (variable != null) {
                                    if (decla_assig.expr.translatePython().equals(variable.variable_name)) {
                                        title = variable.variable_value;
                                    }
                                }
                            }
                        } else {
                            title = decla_assig.expr.translatePython();
                        }
                    } else if (decla_assig.varId.equalsIgnoreCase("titulox")) {
                        if (decla_assig.expr.typeTerminal.compareTo(EnumTerminals.ID) == 0) {
                            System.out.println("entro en titulox");
                        } else {
                            titleX = decla_assig.expr.translatePython();
                        }
                    } else if (decla_assig.varId.equalsIgnoreCase("tituloy")) {
                        if (decla_assig.expr.typeTerminal.compareTo(EnumTerminals.ID) == 0) {
                            System.out.println("entro en tituloy");
                        } else {
                            titleY = decla_assig.expr.translatePython();
                        }
                    }
                }
            }

            System.out.println(variables_json);
            for (Variable variable : variables_json) {
                if (variable != null) {
                    System.out.println(variable.getName() + ", " + variable.getValue());
                }
            }

            BarChart barChart = new BarChart();
            double valores[] = {75.0, 61.0, 70.0, 50.0, 63.0};
            String nombres[] = {"Juan", "Diana", "Pedro", "Sofia", "Roberto"};

            BarChart bar = new BarChart();
            bar.setSize(700, 400);
            bar.setLocationRelativeTo(null);
            bar.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            bar.createChart(title, titleX, titleY, valores, nombres);
            bar.setVisible(true);

        } else if (funcId.equalsIgnoreCase("GraficaPie")) {

            for (Variable variable : variables) {
                if (variable != null) {
                    System.out.println(variable.variable_name);
                }
            }
        }

        return "";
    }
}
