public class Factorial {
    public static void main(String[] args) {
        int n = 5; // Change this value to calculate the factorial of a different number
        long result = factorial(n);
        System.out.println("The factorial of " + n + " is: " + result);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }
}
