package graphtabelfile;

import javax.swing.*;
import java.awt.*;

public class SouthPanel extends JPanel {
    public SouthPanel() {
        String str = MyFunc.getMyFuncStr();
        String str2 = MyFunc2.getMyFuncStr();
        JLabel lbl1 = new JLabel("Функции:    " + str + "    и    " + str2);
        lbl1.setFont(new Font("SansSerif", Font.ITALIC + Font.BOLD, 22));
        add(lbl1);
    }


}
