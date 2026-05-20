# 🧠 Learning: Phase 03 - Input and Conditionals

## 1. Scanner (Taking User Input)
To take input from the user, we use the `Scanner` class from `java.util` package.
```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads a string
        System.out.println("Hello, " + name);
    }
}
```

## 2. If, Else If, Else
Used to execute code based on conditions.
```java
int marks = 85;

if (marks >= 80) {
    System.out.println("Grade: A+");
} else if (marks >= 70) {
    System.out.println("Grade: A");
} else {
    System.out.println("Grade: B");
}
```

## 3. Switch Statement
An alternative to long `if-else-if` ladders, useful when checking a single variable against many values.
```java
int day = 3;
switch(day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break; // Stops execution here
    default:
        System.out.println("Other day");
}
```
