package phase_07_methods.practice;

public class params_vs_argu {
    static void hello(String name) {
        System.out.println("Hi " + name);
    }

    public static void main(String[] args) {
        hello("Atul");
        hello("Ankit"); // name hocche parameter ar Atul hochhe argument
    }
}
