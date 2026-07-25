package phase_04_if_else;

import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("This number is positive number.");
        }
        else {
            System.out.println("This number is negative.");
        }
        input.close();
    }
}
