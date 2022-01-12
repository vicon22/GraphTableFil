package graphtabelfile;

import javax.swing.*;
import java.awt.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class MakeGraph extends JPanel {
    public MakeGraph (double xMin, double xMax, int n, double a1, double a2) {
        XYSeries series1;
        XYSeries series2;
        XYDataset xyDataset1;
        XYDataset xyDataset2;
        String str = MyFunc.getMyFuncStr();
        series1 = new XYSeries(str);
        str = MyFunc2.getMyFuncStr();
        series2 = new XYSeries(str);
        xyDataset1 = new XYSeriesCollection(series1);
        xyDataset2 = new XYSeriesCollection(series2);
        ((XYSeriesCollection) xyDataset1).addSeries(series2);
        str = null;
        JFreeChart chart1 = ChartFactory.createXYLineChart(str, "x", "y",
                xyDataset1, PlotOrientation.VERTICAL, true, true, false);
        double dx = (xMax-xMin)/(n-1);
        double x, y;
        for (int i = 0; i<n; i++) {
            x = xMin + dx*i;
            y = MyFunc.getMyFunc(x, a1, a2);
            series1.add(x,y);
        }
        for (int i = 0; i<n; i++) {
            x = xMin + dx*i;
            y = MyFunc2.getMyFunc(x, a1, a2);
            series2.add(x,y);
        }
        setLayout(new BorderLayout());
        add (new ChartPanel(chart1));
    }
}

