# Hashing in Java — DSA

## What is Hashing?

Hashing is a technique used to store and find data efficiently using a hash function.

Java provides `HashMap` and `HashSet` to work with hashed data.

## Why is Hashing Important?

- Quickly find values using keys.
- Count element frequencies.
- Remove duplicate elements.
- Solve array and string problems efficiently.

## 1. HashMap

A `HashMap` stores data as key-value pairs.

```java
HashMap<String, Integer> marks = new HashMap<>();

marks.put("Arun", 85);
marks.put("Ravi", 90);

System.out.println(marks.get("Arun"));
```

Output:

```text
85
```

**Common methods:**

| Method | Purpose |
|---|---|
| `put()` | Add or update a value |
| `get()` | Retrieve a value |
| `containsKey()` | Check whether a key exists |
| `remove()` | Remove an entry |
| `size()` | Return the number of entries |

## 2. HashSet

A `HashSet` stores unique elements. Duplicate elements are ignored.

```java
HashSet<Integer> numbers = new HashSet<>();

numbers.add(10);
numbers.add(20);
numbers.add(10);

System.out.println(numbers.size());
```

Output:

```text
2
```

**Common methods:**

| Method | Purpose |
|---|---|
| `add()` | Add an element |
| `contains()` | Check whether an element exists |
| `remove()` | Remove an element |
| `size()` | Return the number of elements |

## 3. Frequency Counting

Hashing is useful for counting how often each element appears.

```java
Map<Integer, Integer> frequency = new HashMap<>();

int[] arr = {10, 20, 10, 30, 10};

for (int num : arr) {
    frequency.put(num, frequency.getOrDefault(num, 0) + 1);
}

System.out.println(frequency);
```

Example output:

```text
{20=1, 10=3, 30=1}
```

The order of entries in a `HashMap` is not guaranteed.

## 4. Time Complexity

For `HashMap` and `HashSet`, common operations such as insertion, lookup, and removal take **O(1) on average**.

In the worst case, performance can be slower because of hash collisions and other implementation details.

| Operation | Average Time |
|---|---|
| Insert | `O(1)` |
| Search | `O(1)` |
| Delete | `O(1)` |
| Frequency counting for `n` elements | `O(n)` average |

## 5. HashMap vs HashSet

| HashMap | HashSet |
|---|---|
| Stores key-value pairs | Stores unique elements |
| Uses `put()` | Uses `add()` |
| Retrieves values using keys | Checks elements using `contains()` |
| Keys are unique | Elements are unique |

## Files in This Folder

- `HashingConcepts.java` — Basic hashing and frequency counting.
- `HashMapBasics.java` — Key-value operations.
- `HashSetBasics.java` — Unique elements and duplicate removal.

## Key Takeaways

- Hashing helps find data efficiently.
- `HashMap` stores key-value pairs.
- `HashSet` stores unique elements.
- `getOrDefault()` is useful for frequency counting.
- Hash-based operations are generally O(1) on average.
- Hashing is a common technique in DSA interview problems.
