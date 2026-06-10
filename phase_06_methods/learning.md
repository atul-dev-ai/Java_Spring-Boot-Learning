# 🧠 Learning: Phase 06 - Methods

Methods (or functions) are blocks of code that only run when they are called. They help reuse code.

## 1. Defining and Calling a Method
- `public static`: Modifiers (static means it belongs to the class, not an object).
- `void`: Return type (means it returns nothing).
```java
public class MethodDemo {
    // Definition
    public static void sayHello() {
        System.out.println("Hello there!");
    }

    public static void main(String[] args) {
        sayHello(); // Calling the method
    }
}
```

## 2. Parameters and Return Types
Methods can take inputs (parameters) and give back an output (return).
```java
public class Calculator {
    // Returns an int, takes two ints as parameters
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(5, 10);
        System.out.println("Sum is: " + sum);
    }
}
```

## 3. Method Overloading
Having multiple methods with the same name but different parameters.
```java
public static int multiply(int a, int b) { return a * b; }
public static double multiply(double a, double b) { return a * b; }
// Java automatically calls the correct one based on arguments provided.
```
