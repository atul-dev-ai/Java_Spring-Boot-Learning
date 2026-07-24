package phase_03_input_conditions.practice;

import java.util.Scanner;

public class double_input {
    public static void main(String[] args) {
        System.out.println("This is for double input practice.");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = input.nextDouble();
        System.out.println("Hello, " + name + "! You are " + age + " years old and your height is " + height + " meters.");
        input.close();
    }
}
