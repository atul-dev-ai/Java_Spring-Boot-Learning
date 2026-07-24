# 🧠 Learning: Phase 05 - Arrays and Strings

## 1. Arrays
An array is a collection of variables of the same type.
- **1D Array:**
```java
int[] numbers = {10, 20, 30, 40};
System.out.println(numbers[0]); // Prints 10

// Or define size first
int[] scores = new int[5];
scores[0] = 95;
```

- **2D Array (Matrix):**
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
System.out.println(matrix[0][1]); // Prints 2
```

## 2. Strings
Strings are objects that represent a sequence of characters.
```java
String greeting = "Hello";
String name = "World";

// Concatenation
String message = greeting + " " + name;

// Common Methods
int length = message.length(); // Length of string
String upper = message.toUpperCase(); // HELLO WORLD
char letter = message.charAt(0); // 'H'
boolean equal = greeting.equals("Hello"); // true (Always use .equals() for String comparison, not ==)
```
