package phase_07_methods.practice;

public class multiple_parameter {
    static void student(String name, int age) {
        System.out.print("Hello " + name + " ");
        System.out.println("your age is: " + age);
    }

    public static void main(String[] args) {
        student("Atul Paul", 21);
    }
}
