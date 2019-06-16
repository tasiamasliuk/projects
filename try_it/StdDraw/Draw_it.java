import java.util.Arrays;
import java.util.Random;

public class Draw_it {
    static void draw_funktion(int n){
        StdDraw.setXscale(0,n);
        StdDraw.setYscale(0,n*n);
        StdDraw.setPenRadius(.01);
        for (int i = 1; i <= n; i++) {
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.point(i,i);
            StdDraw.setPenColor(StdDraw.BOOK_RED);
            StdDraw.point(i, i*i);
            StdDraw.setPenColor(StdDraw.BOOK_BLUE);
            StdDraw.point(i, i*Math.log(i));
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.point(i,Math.exp(i));
        }
    }

    static void draw_array(double a[], int n){
        for (int i = 0; i < n; i++) {
            double x = 1.0 * i/n;
            double y = a[i]/2.0;
            double rw = 0.5/n;
            double rh = a[i]/2.0;
            StdDraw.filledRectangle(x,y,rw,rh);
        }
    }

    public static void main(String[] args) {
        int n = 100;
        draw_funktion(n);
        StdDraw.clear();

        n = 50;
        double[] a = new double[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextDouble();
        }
        Arrays.sort(a);
        draw_array(a,n);
    }
}
