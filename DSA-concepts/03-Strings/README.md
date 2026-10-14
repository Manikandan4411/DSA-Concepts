# Strings in Java — DSA

## What is a String?

A String is a sequence of characters used to represent text in Java.

```java
String name = "Java";
```

## Why Are Strings Important?

- Used to store and process text.
- Common in coding interviews.
- Useful for searching, comparing, and reversing text.
- Important for solving palindrome and character-counting problems.

## Basic String Operations

### 1. Find Length

```java
String str = "Hello";
System.out.println(str.length());
```

Output: `5`

### 2. Access a Character

```java
System.out.println(str.charAt(0));
```

Output: `H`

### 3. Convert Case

```java
System.out.println(str.toUpperCase());
System.out.println(str.toLowerCase());
```

### 4. Extract a Substring

```java
System.out.println(str.substring(1, 4));
```

Output: `ell`

The ending index is excluded.

### 5. Compare Strings

```java
String a = "Java";
String b = "Java";

System.out.println(a.equals(b));
```

Output: `true`

Use `equals()` to compare string contents. The `==` operator compares object references.

### 6. Replace Text

```java
System.out.println("Hello Java".replace("Java", "World"));
```

Output: `Hello World`

### 7. Reverse a String

```java
String reversed = new StringBuilder("Java")
        .reverse()
        .toString();

System.out.println(reversed);
```

Output: `avaJ`

### 8. Check a Palindrome

A palindrome reads the same forward and backward.

Examples: `madam`, `level`, `121`

```java
String word = "madam";

String reversed = new StringBuilder(word)
        .reverse()
        .toString();

System.out.println(word.equals(reversed));
```

Output: `true`

## Common String Methods

| Method | Purpose |
|---|---|
| `length()` | Returns the number of characters |
| `charAt(index)` | Returns a character at an index |
| `substring()` | Extracts part of a string |
| `equals()` | Compares string contents |
| `contains()` | Checks whether text exists |
| `replace()` | Replaces characters or text |
| `toUpperCase()` | Converts to uppercase |
| `toLowerCase()` | Converts to lowercase |
| `trim()` | Removes leading and trailing characters with values up to U+0020 |
| `isEmpty()` | Checks whether the string length is zero |

## String Immutability

Strings in Java are immutable. This means their contents cannot be changed after creation.

```java
String str = "Java";
str = str + " DSA";

System.out.println(str);
```

Output: `Java DSA`

The concatenation creates a new string and assigns it to `str`.

## StringBuilder

`StringBuilder` is useful when performing repeated modifications to text.

```java
StringBuilder sb = new StringBuilder("Java");
sb.append(" DSA");

System.out.println(sb);
```

Output: `Java DSA`

## Time Complexity

Let `n` be the string length.

| Operation | Typical Complexity |
|---|---|
| `length()` | `O(1)` |
| `charAt()` | `O(1)` |
| Compare strings | Up to `O(n)` |
| Reverse using `StringBuilder` | `O(n)` |
| Count vowels by traversal | `O(n)` |

## Files in This Folder

- `StringBasics.java` — Basic string methods and examples.
- `StringOperations.java` — String manipulation, reversing, vowel counting, and palindrome checking.

## Key Takeaways

- Strings store text in Java.
- String indexes start at `0`.
- Strings are immutable.
- Use `equals()` to compare string contents.
- Use `StringBuilder` for repeated modifications.
- String manipulation is an important DSA interview topic.
