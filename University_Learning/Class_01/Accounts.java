package University_Learning.Class_01;

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

    public static void main(String[] args) {
        Accounts acc = new Accounts();

        acc.setAccNo(1000101);
        acc.setTitle("Atull Paul");
        acc.setBalance(500000);

        System.out.println("Account No: " + acc.getAccNo());   
        System.out.println("Title: " + acc.getTitle());
        System.out.println("Balance: " + acc.getBalance());
    }

}

// public void display() {
    // System.out.println("Account No: " + accNo);
    // System.out.println("Title: " + title);
    // System.out.println("Balance: " + balance);
// }