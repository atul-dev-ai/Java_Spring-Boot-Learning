package phase_05_loops.practice;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int password;

        while(true) {
            System.out.print("Enter Password: ");
            password = input.nextInt();

            if (password == 1234) {
                System.out.println("Login Successfull");

                break;
            } else {
                System.out.println("Wrong password");
                break;
            }
        }
    }
}