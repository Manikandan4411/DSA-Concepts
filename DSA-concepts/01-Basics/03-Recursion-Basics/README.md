# Recursion Basics in Java

## What is Recursion?

Recursion is a programming technique in which a method calls itself to solve a problem.

A recursive method breaks a problem into smaller subproblems until it reaches a condition that stops the recursion.

## Why is Recursion Important?

- Helps solve problems by breaking them into smaller problems.
- Makes tree and graph traversal easier to understand.
- Is useful for backtracking and Dynamic Programming.
- Is a common topic in Java and DSA interviews.

## Two Important Parts of Recursion

### 1. Base Case

The condition that stops the recursive calls.

Without a proper base case, recursion may continue until a `StackOverflowError` occurs.

### 2. Recursive Case

The part where a method calls itself with a smaller or simpler problem.

## Basic Syntax

```java
static void methodName(int n) {
    if (n == 0) {
        return; // Base case
    }

    methodName(n - 1); // Recursive case
}
```

## Example 1: Print Numbers from 1 to N

```java
static void printNumbers(int n) {
    if (n == 0) {
        return;
    }

    printNumbers(n - 1);
    System.out.println(n);
}
```

Calling `printNumbers(5)` prints:

```text
1
2
3
4
5
```

**Time Complexity:** `O(n)`

**Auxiliary Space Complexity:** `O(n)` because of the recursive call stack.

## Example 2: Factorial Using Recursion

Factorial of a number is the product of all positive integers from 1 to that number.

For example:

`5! = 5 × 4 × 3 × 2 × 1 = 120`

```java
static int factorial(int n) {
    if (n <= 1) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

Calling `factorial(5)` returns `120`.

**Time Complexity:** `O(n)`

**Auxiliary Space Complexity:** `O(n)` due to recursive calls.

## Example 3: Sum of Numbers from 1 to N

```java
static int sumNumbers(int n) {
    if (n <= 0) {
        return 0;
    }

    return n + sumNumbers(n - 1);
}
```

Calling `sumNumbers(5)` returns `15`.

Calculation:

`5 + 4 + 3 + 2 + 1 = 15`

**Time Complexity:** `O(n)`

**Auxiliary Space Complexity:** `O(n)`.

## How Recursion Works

Consider `factorial(3)`:

```text
factorial(3)
    3 * factorial(2)
        2 * factorial(1)
            returns 1
        returns 2
    returns 6
```

The recursive calls reach the base case first. Then the results return through the call stack.

## Recursion vs Iteration

| Recursion | Iteration |
|---|---|
| A method calls itself. | Uses loops such as `for` and `while`. |
| Uses the call stack for recursive calls. | Usually uses less auxiliary memory for simple loops. |
| Useful for trees and backtracking. | Useful for straightforward repetition. |

## Common Mistakes

- Forgetting the base case.
- Not making progress toward the base case.
- Using recursion for problems better solved with a loop.
- Ignoring the memory used by recursive calls.
- Passing very large inputs and causing a `StackOverflowError`.

## Key Takeaways

- Recursion means a method calls itself.
- Every recursive solution needs a valid stopping condition.
- The recursive case should move toward the base case.
- Recursive calls use call-stack memory.
- Recursion is useful in factorial, tree traversal, backtracking, and many DSA problems.

## What We Learned

- Definition of recursion
- Base case and recursive case
- Printing numbers using recursion
- Factorial using recursion
- Sum of numbers using recursion
- Time and auxiliary space complexity
- Difference between recursion and iteration
