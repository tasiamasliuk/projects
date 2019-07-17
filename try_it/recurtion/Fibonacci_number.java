public class Fibonacci_number {
    public static int fib(int n){
        if (n < 0)
            return -1;

        if (n >= 3)
            return fib(n - 1) + fib(n - 2);
        else
            return 1;
    }

    public static int fib(int n, Integer[] memo){
        int result;
        if (memo[n] != null)
            return memo[n];
        if ((n == 1) || (n == 2))
            result = 1;
        else
            result = fib(n-1,memo) + fib(n-2,memo);
        memo[n] = result;
        return result;
    }

    public static int fib_memo(int n){
        Integer[] memo = new Integer[n+1];
        //memo = null;
        return fib(n,memo);
    }

    public static int fib_bottom_up(int n){
        if ((n == 1) || (n == 2))
            return 1;
        int[] bottom_up = new int[n+1];
        bottom_up[1] = 1;
        bottom_up[2] = 1;
        for (int i = 3; i <= n; i++) {
            bottom_up[i] = bottom_up[i-1] + bottom_up[i-2];
        }
        return bottom_up[n];
    }

    public static int fib_two_variables(int n){
            if ((n == 1) || (n == 2))
                return 1;
            int v1 = 1;
            int v2 = 1;

            for (int i = 3; i <= n; i++) {
                int temp = v1;
                v1 = v2;
                v2 += temp;
            }
            return v2;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci 5th number: " + fib_memo(5));
        System.out.println("Fibonacci 35th number: " + fib_memo(35));
        System.out.println("Fibonacci 1000th number: " + fib_memo(1000));

        System.out.println("Fibonacci 5th number: " + fib_bottom_up(5));
        System.out.println("Fibonacci 35th number: " + fib_bottom_up(35));
        System.out.println("Fibonacci 1000th number: " + fib_bottom_up(1000));

        System.out.println("Fibonacci 5th number: " + fib_two_variables(5));
        System.out.println("Fibonacci 35th number: " + fib_two_variables(35));
        System.out.println("Fibonacci 1000th number: " + fib_two_variables(1000));
    }
}
