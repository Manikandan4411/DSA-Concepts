public class RecursionBasics {

    // Example 1: Print numbers from 1 to N
    static void printNumbers(int n) {
        if (n == 0) {
            return; // Base case
        }

        printNumbers(n - 1); // Recursive call
        System.out.println(n);
    }

    // Example 2: Find factorial of a number
    static int factorial(int n) {
        if (n <= 1) {
            return 1; // Base case
        }

        return n * factorial(n - 1);
    }

    // Example 3: Find sum of numbers from 1 to N
    static int sumNumbers(int n) {
        if (n <= 0) {
            return 0; // Base case
        }

        return n + sumNumbers(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Print Numbers from 1 to N:");
        printNumbers(n);

        System.out.println("\nFactorial of " + n + ":");
        System.out.println(factorial(n));

        System.out.println("\nSum of Numbers from 1 to " + n + ":");
        System.out.println(sumNumbers(n));
    }
}