package graphtabelfile;

//import static java.lang.String.format;
import javax.swing.*;

public class MakeTable {
    public MyJTable getTable(double xMin, double xMax, int n, double a1, double a2){
        Double[][] cells;
        String[] colNames = new String[]{" X ", MyFunc.getMyFuncStr(), MyFunc2.getMyFuncStr()};
        int k = 3;
        double x , dx = (xMax - xMin)/(n - 1);
        cells = new Double[n][k];
       // Approxim2 apr = new Approxim2();
        //a = apr.mnk(xMin, xMax, n);
        for(int i = 0; i<n; i++) {
            x = xMin + dx*i;
            cells[i][0] = x;
            cells[i][1] = MyFunc.getMyFunc(x, a1, a2);
            cells[i][2] = MyFunc2.getMyFunc(x, a1, a2);
        }
        return new MyJTable(cells, colNames);
    }
}

class MyJTable extends JTable {
    public MyJTable(final Object[][] rowData, final Object[] columnNames){
        super(rowData, columnNames);
    }
    @Override
    public boolean isCellEditable(int i, int i1){
        return (false);
    }
}
