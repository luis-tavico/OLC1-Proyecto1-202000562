package graph;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class PieChart extends JFrame {

    DefaultPieDataset dataset;
    JFreeChart pie;
    ChartPanel chartPanel;

    public void createChart(String title, double[] values, String[] names) {
        dataset = new DefaultPieDataset();
        for (int i = 0; i < values.length; i++) {
            dataset.setValue(names[i], values[i]);
        }
        pie = ChartFactory.createPieChart(title, dataset, true, true, false);
        chartPanel = new ChartPanel(pie);
        chartPanel.setPreferredSize(new Dimension(700, 400));
        setContentPane(chartPanel);
        
        // Create the PDF document
        Document document = new Document(PageSize.LETTER);
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("./src/main/java/docs/grafica_pie.pdf"));
            document.open();
            PdfContentByte contentByte = writer.getDirectContent();
            Image chartImage = Image.getInstance(pie.createBufferedImage(600, 400, null), null);
            chartImage.setAbsolutePosition(5, 210);
            document.add(chartImage);
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}