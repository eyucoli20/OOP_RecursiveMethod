public class RecursiveMethodsExample {
    public static void main(String[] args) {
        
        // Calling the recursive methods
        int factorialResult = factorial(5);
        System.out.println("Factorial of 5: " + factorialResult);

        int fibonacciResult = fibonacci(10);
        System.out.println("Fibonacci sequence at position 10: " + fibonacciResult);

        int sumOfDigitsResult = sumOfDigits(12345);
        System.out.println("Sum of digits in 12345: " + sumOfDigitsResult);

        int powerResult = power(2, 3);
        System.out.println("2^3: " + powerResult);

        int gcdResult = gcd(12, 18);
        System.out.println("GCD of 12 and 18: " + gcdResult);
    }

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Recursive method to calculate the Fibonacci sequence
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Recursive method to calculate the sum of digits in a number
    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        } else {
            return number % 10 + sumOfDigits(number / 10);
        }
    }

    // Recursive method to calculate the power of a number
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    // Recursive method to calculate the greatest common divisor (GCD) of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
