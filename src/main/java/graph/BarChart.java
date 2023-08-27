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
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChart extends JFrame {

    DefaultCategoryDataset dataset;
    JFreeChart bar;
    ChartPanel chartPanel;

    public void createChart(String title, String titleX, String titleY, double[] values, String[] names) {
        dataset = new DefaultCategoryDataset();
        for (int i = 0; i < values.length; i++) {
            dataset.addValue(values[i], names[i], "");
        }
        bar = ChartFactory.createBarChart(title, titleX, titleY, dataset, PlotOrientation.VERTICAL, true, true, false);
        chartPanel = new ChartPanel(bar);
        chartPanel.setPreferredSize(new Dimension(700, 400));
        setContentPane(chartPanel);

        // Create the PDF document
        Document document = new Document(PageSize.LETTER);
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("./src/main/java/docs/grafica_barras.pdf"));
            document.open();
            PdfContentByte contentByte = writer.getDirectContent();
            Image chartImage = Image.getInstance(bar.createBufferedImage(600, 400, null), null);
            chartImage.setAbsolutePosition(5, 210);
            document.add(chartImage);
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }

    }

}
