package graphtabelfile;
import  java.awt.BorderLayout;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
	JFrame frame = new MainFrame();
    //JFrame frame = new JFrame();
	frame.setTitle("graph_table_file");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    }
}

class MyFunc {

    public static double getMyFunc(double x, double a1, double a2){
        return (a1 * Math.sin(x) + a2 * Math.cos(x));
    }
    public static double getApproxFunc(double x){
        return (Math.sin(x));
    }
    public static String getMyFuncStr() {
        return ("a1*sin(x)+a2*cos(x)");
    }
    public static String getApproxFuncStr() {
        return ("Approx1");
    }
}

class MyFunc2 {

    public static double getMyFunc(double x, double a1, double a2){
        return (a1 * x * Math.sin(a2 * x));
    }
    public static double getApproxFunc(double x){
        return (Math.sin(x));
    }
    public static String getMyFuncStr() {
        return ("a1*x*sin(a2*x)");
    }
    public static String getApproxFuncStr() {
        return ("Approx2");
    }
}