# Math Basics in Java

## What are Math Basics in DSA?

Math Basics cover common mathematical operations and techniques used to solve Data Structures and Algorithms (DSA) problems.

These concepts help us solve coding problems efficiently and are frequently asked in Java developer interviews.

## Why are Math Basics Important?

- Help solve number-based coding problems.
- Improve logical thinking and problem-solving skills.
- Are useful in arrays, strings, and algorithm problems.
- Help optimize solutions for large inputs.
- Build a foundation for competitive programming.

## Topics Covered

1. Count Digits
2. Reverse a Number
3. Check Palindrome Number
4. Check Prime Number
5. Find GCD (Greatest Common Divisor)
6. Find LCM (Least Common Multiple)
7. Calculate Factorial
8. Check Armstrong Number
9. Calculate Power of a Number
10. Find the Sum of Digits

## 1. Count Digits

Count how many digits are present in a number.

Example:

`12345` contains `5` digits.

```java
int n = 12345;
int count = 0;

while (n > 0) {
    count++;
    n = n / 10;
}
```

**Time Complexity:** `O(d)`

Here, `d` is the number of digits.

## 2. Reverse a Number

Reverse the digits of a number.

Example:

`1234` → `4321`

```java
int n = 1234;
int reverse = 0;

while (n > 0) {
    int digit = n % 10;
    reverse = reverse * 10 + digit;
    n = n / 10;
}
```

**Time Complexity:** `O(d)`

## 3. Check Palindrome Number

A palindrome number reads the same forward and backward.

Examples: `121`, `1331`, `7`

Not a palindrome: `123`

**Time Complexity:** `O(d)`

## 4. Check Prime Number

A prime number is greater than 1 and has exactly two positive divisors: 1 and itself.

Examples: `2`, `3`, `5`, `7`, `11`

Numbers such as `1`, `4`, and `9` are not prime.

An efficient basic approach checks divisors up to the square root of the number.

**Time Complexity:** `O(√n)`

## 5. Find GCD

GCD stands for Greatest Common Divisor. It is the largest positive integer that divides two integers without a remainder.

Example:

GCD of `12` and `18` is `6`.

The Euclidean algorithm is an efficient way to find the GCD.

**Time Complexity:** `O(log(min(a, b)))` for positive integers.

## 6. Find LCM

LCM stands for Least Common Multiple. It is the smallest positive integer divisible by both numbers.

Example:

LCM of `4` and `6` is `12`.

Formula:

`LCM(a, b) = |a × b| / GCD(a, b)`

Handle zero inputs separately and use a suitable numeric type to avoid overflow.

## 7. Calculate Factorial

Factorial is the product of all positive integers from 1 to a given positive integer.

Example:

`5! = 5 × 4 × 3 × 2 × 1 = 120`

Also, `0! = 1`.

**Time Complexity:** `O(n)`

## 8. Check Armstrong Number

An Armstrong number is a number equal to the sum of its digits, each raised to the power of the number of digits.

Example:

`153 = 1³ + 5³ + 3³ = 153`

Therefore, `153` is an Armstrong number.

**Time Complexity:** `O(d)` digit-processing steps, excluding the cost of arithmetic on large numbers.

## 9. Calculate Power of a Number

Calculate a number raised to a non-negative integer power.

Example:

`2³ = 2 × 2 × 2 = 8`

Repeated multiplication takes `O(n)` multiplications for exponent `n`. Exponentiation by squaring can reduce this to `O(log n)` multiplications.

## 10. Find the Sum of Digits

Add all digits in a number.

Example:

`1234` → `1 + 2 + 3 + 4 = 10`

**Time Complexity:** `O(d)`

## Key Takeaways

- `% 10` extracts the last digit of a positive integer.
- `/ 10` removes the last digit when using integer division.
- Prime numbers have exactly two positive divisors.
- GCD and LCM are useful in number-based problems.
- Factorial and Armstrong numbers are common coding exercises.
- Efficient algorithms reduce unnecessary operations.

## What We Learned

- Basic number manipulation in Java
- Digit counting and reversal
- Palindrome and Armstrong number checks
- Prime number checking
- GCD and LCM calculations
- Factorial, power, and digit sum
- Time complexity of basic mathematical algorithms
