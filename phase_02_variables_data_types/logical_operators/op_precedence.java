package phase_02_variables_data_types.logical_operators;

public class op_precedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2; // Multiplication ta age calculate hobe then addition
        int result2 = (10 + 5) * 2; // Parentheses er karone age addition hobe then multiplication. parentheses er priority beshi.
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
