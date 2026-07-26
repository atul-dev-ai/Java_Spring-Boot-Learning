package phase_07_methods.practice;

public class call_by_value { /* call_by_value -> Class Name. */ 
    static void change(int x) {
        x = 100;
    }
    /* ekhane change holo method, x holo parameter variable.
    a holo argument,
    change(1) -> method call.
    call_by_value -> Class Name. */
    public static void main(String[] args) {
        int a = 10; //a holo argument.(Actual parameter o bole.)
        change(a); //change(1) -> method call.
        System.out.println(a);
    }

}
