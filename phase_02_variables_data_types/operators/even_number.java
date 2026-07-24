package phase_02_variables_data_types.operators;

public class even_number {
    public static void main(String[] args) {
        int number = 10;
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } 
        else {
            System.out.println(number + " is not an even number.");
        }
    }
}