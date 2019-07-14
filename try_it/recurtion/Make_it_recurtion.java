public class Make_it_recurtion {
    public static int fibanacci(int n){
        if (n < 0)
            return -1;

        if (n >= 3)
            return fibanacci(n - 1) + fibanacci(n - 2);
        else
            return 1;
    }

    public static int factorial(int n){
        if (n < 0)
            return -1;

        if (n >= 1)
            return n * factorial(n-1);
        else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci 5th number: " + fibanacci(5));
        System.out.println("Fibonacci 15th number: " + fibanacci(15));
        System.out.println("Fibonacci 2th number: " + fibanacci(2));
        System.out.println("Fibonacci 3th number: " + fibanacci(3));

        System.out.println();
        System.out.println("Factorial 5th number: " + factorial(5));
        System.out.println("Factorial 15th number: " + factorial(8));
        System.out.println("Factorial 2th number: " + factorial(2));
        System.out.println("Factorial 3th number: " + factorial(3));
    }
}
