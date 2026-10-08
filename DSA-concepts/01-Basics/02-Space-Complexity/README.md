# Space Complexity

## What is Space Complexity?

Space Complexity tells us **how much memory an algorithm needs** as the input size increases.

It focuses on the memory used by an algorithm while it is running.

---

## Why is Space Complexity Important?

Space Complexity helps us:

- Understand how much memory an algorithm uses
- Write memory-efficient programs
- Compare different solutions
- Handle large amounts of data
- Prepare for DSA coding interviews

---

## Types of Space

There are mainly two types of space to understand:

### 1. Input Space

Memory required to store the input given to the algorithm.

### 2. Auxiliary Space

Extra memory used by the algorithm apart from the input.

For DSA problems, we often focus on **Auxiliary Space**.

---

## Common Space Complexities

| Space Complexity | Meaning | Example |
|---|---|---|
| `O(1)` | Constant space | Using a few variables |
| `O(n)` | Linear space | Creating an array of size `n` |
| `O(n²)` | Quadratic space | Creating a 2D array |
| `O(log n)` | Logarithmic space | Some recursive algorithms |

---

## 1. O(1) — Constant Space

The algorithm uses a fixed amount of extra memory.

```java
int sum = 0;
int count = 0;
```

The number of variables does not depend on the input size.

**Space Complexity:** `O(1)`

---

## 2. O(n) — Linear Space

The amount of memory increases with the input size.

```java
int[] numbers = new int[n];
```

If `n` increases, the array needs more memory.

**Space Complexity:** `O(n)`

---

## 3. O(n²) — Quadratic Space

A two-dimensional array of size `n × n` requires quadratic space.

```java
int[][] matrix = new int[n][n];
```

For `n` rows and `n` columns:

`n × n = n²`

**Space Complexity:** `O(n²)`

---

## 4. O(log n) — Logarithmic Space

Some recursive algorithms use memory proportional to the depth of recursion.

For example, a recursive binary search can use:

**Space Complexity:** `O(log n)`

---

## Space Complexity and Loops

A loop does **not automatically mean** `O(n)` space.

Example:

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

The loop runs `n` times, so its **Time Complexity** is `O(n)`.

But it only uses a few variables, so its **Space Complexity** is:

`O(1)`

---

## Time vs Space Complexity

### Time Complexity

Measures how the number of operations grows with input size.

### Space Complexity

Measures how the memory usage grows with input size.

Example:

```java
int[] result = new int[n];

for (int i = 0; i < n; i++) {
    result[i] = i;
}
```

**Time Complexity:** `O(n)`

**Space Complexity:** `O(n)`

---

## Important Rule

When calculating space complexity, focus on the **extra memory** used by the algorithm.

For example:

```java
int sum = 0;
```

Only one variable is created.

**Space Complexity:** `O(1)`

But:

```java
int[] result = new int[n];
```

Memory grows with `n`.

**Space Complexity:** `O(n)`

---

## Key Takeaways

- Space Complexity measures memory usage.
- Auxiliary Space means extra memory used by the algorithm.
- `O(1)` means constant space.
- `O(n)` means memory grows linearly.
- `O(n²)` means memory grows quadratically.
- A loop does not automatically mean `O(n)` space.
- Extra arrays and data structures can increase space complexity.
- Recursive calls can use additional stack memory.

---

## What We Learned

In this topic, we learned:

- What Space Complexity means
- Input Space and Auxiliary Space
- Common Space Complexities
- `O(1)`, `O(n)`, `O(n²)`, and `O(log n)`
- How loops affect space complexity
- Difference between Time and Space Complexity