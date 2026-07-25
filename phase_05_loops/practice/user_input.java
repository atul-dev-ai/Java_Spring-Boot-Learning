package phase_05_loops.practice;
import java.util.Scanner;
public class user_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(num);

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
