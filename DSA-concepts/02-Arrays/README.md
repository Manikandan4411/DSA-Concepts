# Arrays in Java — DSA

## What is an Array?

An array is a data structure that stores multiple values of the same type in a single variable.

Example:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

## Why Are Arrays Important?

- Store multiple values efficiently.
- Access elements using indexes.
- Form the foundation for many DSA problems.
- Are used in searching, sorting, and other algorithms.

## Array Basics

### 1. Declaration

```java
int[] arr;
```

### 2. Initialization

```java
int[] arr = {10, 20, 30, 40, 50};
```

### 3. Access an Element

```java
System.out.println(arr[0]);
```

Output: `10`

Array indexes start from `0`.

### 4. Update an Element

```java
arr[1] = 25;
```

The second element changes from `20` to `25`.

### 5. Find Array Length

```java
System.out.println(arr.length);
```

Output: `5`

## Common Array Operations

| Operation | Description | Time Complexity |
|---|---|---|
| Access | Read an element by index | `O(1)` |
| Update | Change an element by index | `O(1)` |
| Traversal | Visit every element | `O(n)` |
| Linear Search | Find an element | `O(n)` |
| Insert | Add an element using a new array | `O(n)` |
| Delete | Remove an element using a new array | `O(n)` |

Here, `n` represents the number of elements.

## Array Traversal

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

This visits every element in the array.

**Time Complexity:** `O(n)`

## Linear Search

Linear Search checks each element until the target is found.

```java
int target = 30;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        System.out.println("Found at index: " + i);
        break;
    }
}
```

**Time Complexity:** `O(n)` in the worst case.

## Important Points

- Arrays have a fixed length after creation.
- Array indexes start at `0`.
- The last valid index is `arr.length - 1`.
- Accessing an invalid index causes `ArrayIndexOutOfBoundsException`.
- Inserting or deleting elements usually requires shifting elements or creating a new array.
- Java arrays can store primitive values or object references.

## Files in This Folder

- `ArrayBasics.java` — Basic array operations and examples.
- `Arraycomplexity.java` — Time complexity examples.
- `ArrayOperations.java` — Display, access, update, insert, search, and delete operations.

## Key Takeaways

Arrays are one of the fundamental data structures in DSA. Learn array traversal, searching, updating, and basic operations before moving on to advanced array problems.
