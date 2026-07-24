package phase_03_input_conditions.practice;

import java.util.Scanner;
public class multiple_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter you age: ");
        int age = input.nextInt();

        System.out.print("Enter your height: ");
        double height = input.nextDouble();

        System.out.println("Hello, " + name + "! your age is: " + age + " and your height is: " + height);

        // better output
        System.out.printf("Hello, %s! Your age is: %d and your height is: %.2f%n", name, age, height);
        input.close();
    }
}
