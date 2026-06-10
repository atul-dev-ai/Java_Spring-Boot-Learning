# 🧠 Learning: Phase 02 - Variables, Data Types, Operators

## 1. Variables
Variables are containers for storing data values. 
```java
int age = 20;
String name = "Atul";
```

## 2. Data Types
- **Primitive:** `byte`, `short`, `int` (numbers), `long`, `float` (decimals), `double`, `boolean` (true/false), `char` (single character).
- **Non-Primitive:** `String`, Arrays, Classes.
```java
int score = 95;
double gpa = 3.8;
boolean isPassed = true;
char grade = 'A';
```

## 3. Type Casting
Converting one data type into another.
- **Implicit (Widening):** Automatic (e.g., `int` to `double`).
- **Explicit (Narrowing):** Manual (e.g., `double` to `int`).
```java
double myDouble = 9.78;
int myInt = (int) myDouble; // Manual casting: Output will be 9
```

## 4. Operators
- **Arithmetic:** `+`, `-`, `*`, `/`, `%` (modulo/remainder).
- **Relational (Comparison):** `==`, `!=`, `>`, `<`, `>=`, `<=`.
- **Logical:** `&&` (AND), `||` (OR), `!` (NOT).
- **Assignment:** `=`, `+=`, `-=`, etc.
- **Unary:** `++` (increment), `--` (decrement).
- **Ternary:** `condition ? value_if_true : value_if_false`
```java
int a = 10, b = 5;
int sum = a + b; // 15
boolean isGreater = (a > b); // true
String result = (a % 2 == 0) ? "Even" : "Odd"; // "Even"
```
