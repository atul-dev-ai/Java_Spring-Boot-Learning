package phase_03_input_conditions.practice;

import java.util.Scanner;
public class full_program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("your name is: " + name);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("your age is: " + age);

        System.out.print("Enter your cgpa: ");
        double cgpa = input.nextDouble();
        System.out.println("Your cgpa is: " + cgpa);

        System.out.println();

        System.out.println("Student Information");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("CGPA: %.2f%n", cgpa);
        input.close();
    }
}
