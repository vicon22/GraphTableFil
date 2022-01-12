package graphtabelfile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RWRandomAccessFile {
    private double xMin, xMax, a1, a2;
    private int n;
    private String file = "rWtest.dat";
    RWRandomAccessFile(double xMin, double xMax, int n, double a1, double a2) {
        this.xMin = xMin;
        this.xMax = xMax;
        this.n = n;
        this.a1 = a1;
        this.a2 = a2;
    }
    RWRandomAccessFile(){};
    void writeFile() throws FileNotFoundException, IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "rw");
        rf.writeInt(n);
        rf.writeDouble(xMin);
        rf.writeDouble(xMax);
        rf.writeDouble(a1);
        rf.writeDouble(a2);
        for (int i = 0; i < n; i++) {
           double x = xMin + (xMax - xMin) * i/(n - 1);
           rf.writeDouble(MyFunc.getMyFunc(x, a1, a2));
        }
        rf.close();
        }
    double[] readFile() throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "r");
        n = rf.readInt();
        xMin = rf.readDouble();
        xMax = rf.readDouble();
        a1 = rf.readDouble();
        a2 = rf.readDouble();
        double[] y = new double[n];
        for (int i = 0; i < n; i++)
            y[i] = rf.readDouble();
        rf.close();
        return y;
    }
    int getN(){return n;};
    double getA1(){return a1;};
    double getA2(){return a2;};
    double getXmin(){ return xMin;};
    double getXmax(){ return xMax;};
}
