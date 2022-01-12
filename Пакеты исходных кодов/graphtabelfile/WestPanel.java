package graphtabelfile;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class WestPanel extends JPanel {
    private static JTextField txt1 = new JTextField("0");
    private static JTextField txt2 = new JTextField("10");
    private static JTextField txt3 = new JTextField("100");
    private static JTextField txt4 = new JTextField("1");
    private static JTextField txt5 = new JTextField("2");
    public WestPanel() {
        int row = 5, col = 2, hgap = 0, vgap = 20;
        int w = Math.round(0.2f*MainFrame.getW());//150
        int h = Math.round(0.4f*MainFrame.getH());//100
        JPanel jp = new JPanel();
        jp.setBorder(new TitledBorder("Данные"));
        jp.setPreferredSize(new Dimension(w,h));
        jp.setLayout(new GridLayout(row, col, hgap, vgap));
        JLabel lbl1 = new JLabel("X мин");
        JLabel lbl2 = new JLabel("X макс");
        JLabel lbl3 = new JLabel("кол. точек (>1)");
        JLabel lbl4 = new JLabel("а1");
        JLabel lbl5 = new JLabel("а2");
        jp.add(lbl1);
        jp.add(txt1);
        jp.add(lbl2);
        jp.add(txt2);
        jp.add(lbl3);
        jp.add(txt3);
        jp.add(lbl4);
        jp.add(txt4);
        jp.add(lbl5);
        jp.add(txt5);
        add(jp);
    }

    public static String getText1(){return txt1.getText();}
    public static String getText2(){return txt2.getText();}
    public static String getText3(){return txt3.getText();}
    public static String getText4(){return txt4.getText();}
    public static String getText5(){return txt5.getText();}

    public static void setText1(String str){txt1.setText(str);}
    public static void setText2(String str){txt2.setText(str);}
    public static void setText3(String str){txt3.setText(str);}
    public static void setText4(String str){txt4.setText(str);}
    public static void setText5(String str){txt5.setText(str);}
}
