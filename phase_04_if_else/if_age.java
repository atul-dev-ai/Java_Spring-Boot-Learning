package phase_04_if_else;
import java.util.Scanner;
public class if_age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You are eligibel for drinking");
        }
        else {
            System.out.println("You are not eligibel for drinking");
        }
        input.close();
    }
}
