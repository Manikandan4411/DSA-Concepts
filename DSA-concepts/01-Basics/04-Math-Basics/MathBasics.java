public class MathBasics {

    // 1. Count digits
    static int countDigits(int n) {
        n = Math.abs(n);

        if (n == 0) {
            return 1;
        }

        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    // 2. Reverse a positive number
    static int reverseNumber(int n) {
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return reverse;
    }

    // 3. Check palindrome number
    static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }

        return n == reverseNumber(n);
    }

    // 4. Check prime number
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // 5. Find GCD using Euclidean algorithm
    static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    // 6. Find LCM for non-negative integers
    static long lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        return (long) Math.abs(a / gcd(a, b))
                * Math.abs((long) b);
    }

    // 7. Find factorial
    static long factorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException(
                    "Enter a number between 0 and 20."
            );
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    // 8. Check Armstrong number
    static boolean isArmstrong(int n) {
        if (n < 0) {
            return false;
        }

        int digits = countDigits(n);
        int temp = n;
        long sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += integerPower(digit, digits);
            temp = temp / 10;
        }

        return sum == n;
    }

    // Helper method to calculate integer power
    static long integerPower(int base, int exponent) {
        long result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }

    // 9. Calculate power for a non-negative exponent
    static long power(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException(
                    "Exponent must be non-negative."
            );
        }

        long result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }

    // 10. Find sum of digits
    static int sumOfDigits(int n) {
        n = Math.abs(n);
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        int number = 153;

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Reverse Number: " + reverseNumber(number));
        System.out.println("Is Palindrome: " + isPalindrome(121));
        System.out.println("Is Prime: " + isPrime(7));
        System.out.println("GCD of 12 and 18: " + gcd(12, 18));
        System.out.println("LCM of 4 and 6: " + lcm(4, 6));
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Is Armstrong: " + isArmstrong(number));
        System.out.println("2 Power 3: " + power(2, 3));
        System.out.println("Sum of Digits: " + sumOfDigits(1234));
    }
}