public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Change this value to calculate a different number in the sequence
        long result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }

    public static long fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long[] fib = new long[n + 1];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            return fib[n];
        }
    }
}
