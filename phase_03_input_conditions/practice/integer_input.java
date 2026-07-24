package phase_03_input_conditions.practice;

import java.util.Scanner;

public class integer_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.print("Enter your age: ");
        int age = input.nextInt(); // nextInt() method takes integer input from the user.
        System.out.println("You are " + age + " years old.");
        // consume leftover newline after nextInt()
        input.nextLine();

        System.out.print("Enter Your Full name: ");
        String fullname = input.next();
        input.nextLine(); // consume the leftover newline character after next()
        System.out.println(fullname); // space er porer part ta print korbe na, karone next() method space er porer part ta ignore kore.

        System.out.print("Enter your favorite food name: ");
        String food = input.nextLine();
        System.out.println(food);
        input.close(); // close once at the end
    }
}
