package graphtabelfile;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {
    public CenterPanel() {
        double xMin = Verify.xMin;
        double xMax = Verify.xMax;
        int n = Verify.n;
        double a1 = Verify.a1;
        double a2 = Verify.a2;
        try{
            setLayout(new BorderLayout());
            add(new MakeGraph(xMin, xMax, n, a1, a2));
        }//отобразить график
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Ошибка при построения графика !");
        }
    }
}
