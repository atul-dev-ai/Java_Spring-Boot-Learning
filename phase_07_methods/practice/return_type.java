package phase_07_methods.practice;

public class return_type {
    static int add(int a, int b) {
        return a + b; // return type holo int, mane method er reuslt Caller er kache ferot dewa.
    }
    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println(result);
    }
}
