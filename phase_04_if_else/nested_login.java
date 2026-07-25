package phase_04_if_else;

public class nested_login {
    public static void main(String[] args) {
        String username = "admIn";
        String password = "1234";

        if (username.equals("admin")) {
            if (password.equals("1234")) {
                System.out.println("Login Successful.");
            }
            else {
                System.out.println("Wrong password. Please try again.");
            }
        }
        else {
            System.out.println("Invalid username. Please try again.");
        }
    }
}
