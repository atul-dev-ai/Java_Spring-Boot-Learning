package phase_03_input_conditions.practice;

import java.util.Scanner;
public class next_vs_nextLine {
    public static void main(String[] args) {
        // next() method reads input only until the first space, while nextLine() reads the entire line of input including spaces. next() found a space and stopped reading while nextLine() continued to read until the end of the line.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine(); //nextLine() method reads the entire line of input including spaces.
        System.out.print("enter your age: ");
        int age = input.nextInt();
        System.out.println("Hello, " + fullName + "! You are " + age + " Years old.");
        input.close();

        
    }
}
