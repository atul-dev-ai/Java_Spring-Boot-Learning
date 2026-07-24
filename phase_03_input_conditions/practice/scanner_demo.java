package phase_03_input_conditions.practice;

import java.util.Scanner;

public class scanner_demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // ekhane Scanner class name, ar input holo object name. new mane memory allocate kora(notun object create kora) ar Scanner() holo constructor(object toiri kore). 
        // System.in mane holo keyboard theke input nite hobe. 
        System.out.print("Enter you name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        input.close();
    }
}