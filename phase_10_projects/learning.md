# 🧠 Learning: Phase 10 - Projects

Projects are where you combine everything you've learned. Here’s how you structure your thought process for building a Java project:

## 1. Define the Requirements
What exactly should the application do?
*Example (Calculator): Needs to add, subtract, multiply, divide based on user input.*

## 2. Design the Classes (OOP)
What entities are involved?
*Example (Bank System): You need a `User` class, an `Account` class, and a `Transaction` class.*

## 3. Step-by-step Execution
1. Create a menu system using a `while` loop and `Scanner`.
2. Use `switch` statements to handle user choices.
3. Write isolated methods for each feature (e.g., `withdrawMoney()`, `depositMoney()`).
4. Handle edge cases with exceptions (e.g., trying to withdraw more than balance, dividing by zero).
5. (Optional) Save state using File Handling so data persists when the program closes.

## 4. Example: Mini Structure
```java
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        
        while(running) {
            System.out.println("1. Start Task\n2. Exit");
            int choice = sc.nextInt();
            
            if (choice == 1) {
                System.out.println("Task is running...");
            } else if (choice == 2) {
                System.out.println("Exiting...");
                running = false; // Exit loop
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
```
