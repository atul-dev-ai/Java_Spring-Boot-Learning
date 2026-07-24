package phase_03_input_conditions.practice;

import java.util.Scanner;

public class scanner_demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        input.close();
    }
}