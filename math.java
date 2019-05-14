public class math {
    public static int abs(int x)
    {
        if (x < 0) return -x;
        else return x;
    }

    public static double abs(double x)
    {
        if (x < 0.0) return -x;
        else return x;
    }

    public static double sqrt(double c)
    {
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (abs(t - c/t) > err * t)
            t = (c/t + t) / 2.0;
        return t;
    }

    public static boolean isPrime(int N)
    {
        if (N < 2) return false;
        for (int i = 2; i*i <= N; i++)
            if (N % i == 0) return false;
        return true;
    }

    public static double hypotenuse(double a, double b)
    {return sqrt(a*a + b*b);}

    // harmonic number
    public static double harmonic(int N)
    {
        double sum = 0.0;
        for (int i = 1; i <= N; i++)
            sum += 1.0 / i;
        return  sum;
    }

    public static void main(String[] args) {
        double a = 9.0;
        double b = -9.0;
        double c = 6.0;

        System.out.println("Variables                                                : " + a + "    " + b + "    " + c);
        System.out.println("abs(double variable)                                     : "+abs(a) +"     "+ abs(b) +"    "+ abs(c));
        System.out.println("sqrt(double variable)                                    : "+sqrt(a) +"     "+ sqrt(b) +"    "+ sqrt(c));
        System.out.println("hypotenuse(double variable (3.0), double variable(4.0))  : "+hypotenuse(3.0,4.0));
        System.out.print("\n\n");

        int d = -13;
        int e = 1;
        int f = 29;

        System.out.println("Variables                                                : " + d + "      " + e + "       " + f);
        System.out.println("abs(int variable)                                         : "+abs(d) +"      "+ abs(e) +"       "+ abs(f));
        System.out.println("isPrime(int variable)                                    : "+isPrime(d) +"    "+ isPrime(e) +"   "+ isPrime(f));
        System.out.println("harmonic(int variable)                                   : "+harmonic(d) +"      "+ harmonic(e) +"     "+ harmonic(f));
    }
}
