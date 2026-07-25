package phase_05_loops.practice;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            // System.out.println(i * number);
            System.out.println(number + " x " + i + "=" + (number * i));
        }
        input.close();
    }
}
