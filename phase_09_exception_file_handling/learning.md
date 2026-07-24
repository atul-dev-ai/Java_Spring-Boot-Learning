# 🧠 Learning: Phase 08 - Exception and File Handling

## 1. Exception Handling (`try`, `catch`, `finally`)
Exceptions are runtime errors. Handling them prevents the program from crashing.
```java
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("This block always runs.");
        }
    }
}
```

## 2. File Handling
Reading from and writing to files.
- **Writing to a File:**
```java
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello File!");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
```
- **Reading from a File:**
```java
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
```
