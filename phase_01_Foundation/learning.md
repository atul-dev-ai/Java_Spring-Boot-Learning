# 🧠 Learning: Phase 01 - Java Foundation

## 1. What is Java?
Java is a high-level, class-based, object-oriented programming language. It is designed to have as few implementation dependencies as possible (Write Once, Run Anywhere - WORA).

## 2. JDK, JRE, JVM
- **JDK (Java Development Kit):** The full toolkit used to develop Java applications (includes JRE + development tools like compiler `javac`).
- **JRE (Java Runtime Environment):** Provides the libraries and JVM required to *run* a Java program.
- **JVM (Java Virtual Machine):** The engine that actually executes the Java bytecode line by line.

## 3. Compile vs Run
- **Compile:** The process of converting human-readable Java code (`.java`) into JVM-understandable bytecode (`.class`) using `javac`.
- **Run:** Executing the compiled `.class` file using the `java` command.

## 4. Java Program Structure
Every Java program must have at least one `class` and a `main` method to run.

```java
public class HelloWorld {
    // The main method is the entry point of the program
    public static void main(String[] args) {
        // This prints text to the console
        System.out.println("Hello, World!");
    }
}
```
- `public class HelloWorld`: Declares a class named `HelloWorld`.
- `public static void main(String[] args)`: The main method where execution begins.
- `System.out.println(...)`: Prints a line of text.
