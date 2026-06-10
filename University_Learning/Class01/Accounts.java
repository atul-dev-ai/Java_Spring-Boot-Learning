package University_Learning.Class01;

public class Accounts {
    private int accNo;
    private String title;
    private double balance;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    // public void display() {
    //     System.out.println("Account No: " + accNo);
    //     System.out.println(("Title: " + title));
    //     System.out.println("Balance: " + balance);
    // }

    public static void main(String[] args) {
        System.out.println("Account No: " + accNo);
        System.out.println(("Title: " + title));
        System.out.println("Balance: " + balance);
    }


}
// public void display() {
    // System.out.println("Account No: " + accNo);
    // System.out.println("Title: " + title);
    // System.out.println("Balance: " + balance);
// }