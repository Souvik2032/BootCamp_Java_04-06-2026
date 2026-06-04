package bankAccount;

public class BankAccount {
    String acc_holder_name;
    double rem_balance;

    public void deposit(double amount) {
        rem_balance += amount;
    }

    public void withdraw(double amount) {
        rem_balance -= amount;
    }

    public void display() {
        System.out.println(rem_balance);
    }

    public void branchName() {
        System.out.println("ICIC Hyderabad");
    }

    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.acc_holder_name = "Souvik Layek";
        obj.rem_balance = 1000;
        obj.deposit(500);
        obj.withdraw(100);
        obj.display();
        obj.branchName();
    }
}