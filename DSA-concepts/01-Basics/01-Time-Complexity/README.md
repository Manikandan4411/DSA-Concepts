# Time Complexity

## What is Time Complexity?

Time Complexity tells us **how much time an algorithm takes to run** as the input size increases.

It does not measure the exact time in seconds. Instead, it describes how the number of operations grows based on the input size.

---

## Why is Time Complexity Important?

Time Complexity helps us:

- Compare different algorithms
- Choose a faster solution
- Understand how an algorithm performs with large input
- Prepare for DSA coding interviews

---

## Big-O Notation

Big-O notation is commonly used to describe the **worst-case time complexity** of an algorithm.

### Common Time Complexities

| Big-O | Name | Example |
|---|---|---|
| `O(1)` | Constant | Accessing an array element |
| `O(log n)` | Logarithmic | Binary Search |
| `O(n)` | Linear | Loop through an array |
| `O(n log n)` | Linearithmic | Merge Sort |
| `O(n²)` | Quadratic | Nested loops |
| `O(2ⁿ)` | Exponential | Some recursive problems |

---

## 1. O(1) — Constant Time

The number of operations does not depend on the input size.

```java
int number = arr[0];
```

Even if the array contains 10 or 1,000,000 elements, accessing the first element takes constant time.

**Time Complexity:** `O(1)`

---

## 2. O(n) — Linear Time

The number of operations increases with the input size.

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

If `n` increases, the loop runs more times.

**Time Complexity:** `O(n)`

---

## 3. O(n²) — Quadratic Time

A loop inside another loop usually results in quadratic time.

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

For `n` elements, the inner loop runs `n` times for every outer-loop iteration.

**Time Complexity:** `O(n²)`

---

## 4. O(log n) — Logarithmic Time

The input size is reduced significantly in each step.

A common example is **Binary Search**.

```text
100 elements
   ↓
50 elements
   ↓
25 elements
   ↓
12 elements
   ↓
...
```

**Time Complexity:** `O(log n)`

---

## 5. O(n log n) — Linearithmic Time

This commonly appears in efficient sorting algorithms such as:

- Merge Sort
- Heap Sort
- Average-case Quick Sort

**Time Complexity:** `O(n log n)`

---

## Important Rule

When calculating Big-O:

### Ignore Constants

```java
for (int i = 0; i < n; i++) {
    // operation
}

for (int i = 0; i < n; i++) {
    // operation
}
```

This is:

`O(n + n)`

Simplified to:

`O(n)`

---

### Keep the Highest-Order Term

```text
O(n² + n + 1)
```

The highest-order term is `n²`.

Therefore:

**O(n²)**

---

## Time Complexity Order

From faster to slower:

```text
O(1)
↓
O(log n)
↓
O(n)
↓
O(n log n)
↓
O(n²)
↓
O(2ⁿ)
```

Generally, we prefer algorithms with lower time complexity, especially when the input size is large.

---

## Time Complexity vs Space Complexity

### Time Complexity

Measures how the **running time/number of operations** grows with input size.

### Space Complexity

Measures how much **additional memory** an algorithm needs as input size grows.

Example:

```java
int sum = 0;
```

The variable uses constant extra space.

**Space Complexity:** `O(1)`

---

## Key Takeaways

- Time Complexity describes algorithm efficiency.
- Big-O is commonly used to express complexity.
- `O(1)` is constant time.
- `O(log n)` is logarithmic time.
- `O(n)` is linear time.
- `O(n log n)` is common in efficient sorting.
- `O(n²)` commonly occurs with nested loops.
- Ignore constants when calculating Big-O.
- Keep the highest-order term.

---

## What We Learned

In this topic, we learned:

- What Time Complexity means
- Why Time Complexity is important
- Big-O notation
- Common Time Complexities
- How to identify complexity from loops
- Basic Time Complexity rules
- Difference between Time and Space Complexity