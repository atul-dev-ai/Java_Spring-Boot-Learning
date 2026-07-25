package phase_07_methods.practice;

public class parameter {
    static void hello(String name) { // ekhane name hocche Parameter. 
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        hello("Atul"); // ekhaen Atul hocche arguments
        hello("Ankit");
    }
}
