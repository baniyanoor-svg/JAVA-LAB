class BankAccount {
    String accountHolderName;
    double balance;

    BankAccount(String name, double balance) {
        accountHolderName = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Updated Balance: " + balance);
    }
}

public class S7P9 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Ali", 5000);
        b.deposit(2000);
    }
}
