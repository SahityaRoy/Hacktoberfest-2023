public class prime {public static boolean isPrime(int num) {
    // Special case for numbers less than 2
    if (num < 2) {
        return false;
    }

    // Check for divisors from 2 to the square root of the number, inclusive
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }

    // If no divisors were found, the number is a prime number
    return true;
}}