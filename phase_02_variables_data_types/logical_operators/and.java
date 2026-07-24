package phase_02_variables_data_types.logical_operators;

public class and {
    public static void main(String[] args) {
        boolean rain = false;
        boolean holiday = true;

        System.out.println("Is it a good day for a picnic? " + (rain && holiday));
    }
}
