package phase_04_if_else;

import java.util.Scanner;

public class grade_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        if (marks >= 90 && marks <=100) {
            System.out.println("Grade A+");
        }
        else if (marks >= 80 && marks < 90) {
            System.out.println("Grade A");
        }
        else if (marks >= 70 && marks < 80) {
            System.out.println("Grade A-");
        }
        else if (marks >= 60 && marks < 70) {
            System.out.println("Grade B");
        }
        else if (marks >= 50 && marks < 60) {
            System.out.println("Grade B-");
        }
        else if (marks >= 33 && marks < 50) {
            System.out.println("Grade C");
        }
        else if (marks < 33) {
            System.out.println("Fail");
        }
        else {
            System.out.println("Invalid marks");
        }
        input.close();
    }
}
