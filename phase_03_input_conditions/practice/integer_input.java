package phase_03_input_conditions.practice;

import java.util.Scanner;

public class integer_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = input.nextInt(); // nextInt() method takes integer input from the user.
        System.out.println("You are " + age + " years old.");
        input.close(); // Closing the scanner to prevent resource leaks.
    }
}
