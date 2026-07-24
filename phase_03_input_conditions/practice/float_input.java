package phase_03_input_conditions.practice;

import java.util.Scanner;
public class float_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your result in float: ");
        float result = input.nextFloat();
        System.out.println("Your result is: " + result);
        input.close();
    }
}
