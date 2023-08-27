package graph;

import javax.swing.WindowConstants;

public class GenerateChart {

    public static void main(String[] args) {
        double valores [] = {75.0, 61.0, 70.0, 50.0, 63.0}; 
        String nombres [] = {"Juan", "Diana", "Pedro", "Sofia", "Roberto"};
        
        BarChart bar = new BarChart();
        bar.setSize(700, 400);
        bar.setLocationRelativeTo(null);
        bar.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        bar.createChart("Grafica", "Personas", "Escala", valores, nombres);
        //bar.setVisible(true);
        
        
        PieChart pie = new PieChart();
        pie.setSize(700, 400);
        pie.setLocationRelativeTo(null);
        pie.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pie.createChart("Grafica", valores, nombres);
        //pie.setVisible(true);
        
    }
    
}
