package phase_04_if_else;


public class nested_if {
    public static void main(String[] args) {
        int number = 20;

        if (number > 0) {
            System.out.println("This number is positive number.");
            if (number % 2 == 0) {
                System.out.println("This is an even number.");
            }
            else {
                System.out.println("This is an odd number.");
            }
        }
        else {
            System.out.println("This number is negative.");
        }
    }
}
