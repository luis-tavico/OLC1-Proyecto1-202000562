package instructions;

import enums.EnumTerminals;
import charts.BarChart;
import charts.PieChart;
import java.util.LinkedList;
import javax.swing.WindowConstants;

public class Function implements Statement {

    String funcId;
    LinkedList<Declaration_Assignment> decla_assigs = new LinkedList<>();
    LinkedList<Variable> variables = new LinkedList<>();
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

            /*
            for (Declaration_Assignment decla_assig : decla_assigs) {
                if (decla_assig != null) {
                    System.out.println(decla_assig.varId + ", " + decla_assig.expr.translatePython());
                    //variables.add(new Variable(decla_assig.varId, decla_assig.expr.translatePython(), ""));
                }
            }*/
        } else if (funcId.equalsIgnoreCase("GraficaBarras")) {
            double values[] = new double[0];
            String names[] = new String[0];
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
                    } else if (decla_assig.varId.equalsIgnoreCase("ejex")) {
                        names = new String[decla_assig.variables.size()];
                        int i = 0;
                        for (Operation operation : decla_assig.variables) {
                            if (operation != null) {
                                if (operation.typeTerminal.compareTo(EnumTerminals.ID) == 0) {
                                    for (Variable variable : variables) {
                                        if (variable != null) {
                                            if (operation.translatePython().equals(variable.variable_name)) {
                                                names[i] = variable.variable_value;
                                            }
                                        }
                                    }
                                } else {
                                    names[i] = operation.value;
                                }
                            }
                            i++;
                        }
                        for (String name : names) {
                            System.out.println(name);
                        }
                    } else if (decla_assig.varId.equalsIgnoreCase("valores")) {
                        values = new double[decla_assig.variables.size()];
                        int i = 0;
                        for (Operation operation : decla_assig.variables) {
                            if (operation != null) {
                                if (operation.typeTerminal.compareTo(EnumTerminals.ID) == 0) {
                                    for (Variable variable : variables) {
                                        if (variable != null) {
                                            if (operation.translatePython().equals(variable.variable_name)) {
                                                values[i] = convertToDecimal(variable.variable_value);
                                            }
                                        }
                                    }
                                } else {
                                    values[i] = convertToDecimal(operation.value);
                                }
                            }
                            i++;
                        }
                        for (double value : values) {
                            System.out.println(value);
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
            BarChart barChart = new BarChart();
            BarChart bar = new BarChart();
            bar.setSize(700, 400);
            bar.setLocationRelativeTo(null);
            bar.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            bar.createChart(title, titleX, titleY, values, names);
            bar.setVisible(true);

        } else if (funcId.equalsIgnoreCase("GraficaPie")) {
            double values[] = new double[0];
            String names[] = new String[0];
            String title = "";
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
                    } else if (decla_assig.varId.equalsIgnoreCase("ejex")) {
                        names = new String[decla_assig.variables.size()];
                        int i = 0;
                        for (Operation operation : decla_assig.variables) {
                            if (operation != null) {
                                if (operation.typeTerminal.compareTo(EnumTerminals.ID) == 0) {
                                    for (Variable variable : variables) {
                                        if (variable != null) {
                                            if (operation.translatePython().equals(variable.variable_name)) {
                                                names[i] = variable.variable_value;
                                            }
                                        }
                                    }
                                } else {
                                    names[i] = operation.value;
                                }
                            }
                            i++;
                        }
                        for (String name : names) {
                            System.out.println(name);
                        }
                    } else if (decla_assig.varId.equalsIgnoreCase("valores")) {
                        values = new double[decla_assig.variables.size()];
                        int i = 0;
                        for (Operation operation : decla_assig.variables) {
                            if (operation != null) {
                                if (operation.typeTerminal.compareTo(EnumTerminals.ID) == 0) {
                                    for (Variable variable : variables) {
                                        if (variable != null) {
                                            if (operation.translatePython().equals(variable.variable_name)) {
                                                values[i] = convertToDecimal(variable.variable_value);
                                            }
                                        }
                                    }
                                } else {
                                    values[i] = convertToDecimal(operation.value);
                                }
                            }
                            i++;
                        }
                        for (double value : values) {
                            System.out.println(value);
                        }
                    }
                }
            }
            PieChart pie = new PieChart();
            pie.setSize(700, 400);
            pie.setLocationRelativeTo(null);
            pie.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            pie.createChart(title, values, names);
            pie.setVisible(true);
        }
        
        return "";
    }

    public double convertToDecimal(String text) {
        try {
            return Double.parseDouble(text);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

}
