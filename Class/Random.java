import java.util.Random;

class random {
    static Random stdRandom = new Random();

    // Returns a random real number uniformly in [a, b).
    public static double uniform(double a, double b)
    {
        return a + stdRandom.nextDouble() * (b-a);
    }

    //Returns a random integer uniformly in [0, n).
    public static int uniform(int n)
    {
        return (int) (stdRandom.nextDouble() * n);
    }

    //Returns a random integer uniformly in [a, b).
    public static int uniform(int lo, int hi)
    {
        return lo + uniform(hi - lo);
    }

    //Returns a random integer from the specified discrete distribution.
    public static int discrete(double[] a)
    {//sum of array a[], mast be equal to 1.0.
     //a[i] >= 0.0 for each index

        double r = stdRandom.nextDouble();
        double sum = 0.0;
        for (int i = 0; i < a.length; i++)
        {
            sum = sum + a[i];
            if (sum >= r) return i;
        }
        return -1;
    }

    //Rearranges the elements of the specified array in uniformly random order.
    public static void shuffle(double[] a)
    {
        int N = a.length;
        for (int i = 0; i < N; i++)
        {
            int r = i + uniform(N-i);   // between i and n-1
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static void main(String[] args) {
        double[] temp = {4.0, 32.1, 2.31, 9.0, 1.1};
        for (int i = 0; i < 5; i++)
        {
            shuffle(temp);
            for (double t: temp) {
                System.out.print(t + " ");
            }
            System.out.println();
        }
    }
}
