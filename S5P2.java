
class Bank {
    private int balance;

    Bank(int b) {
        balance = b;
    }

    protected void withdraw(int b) {
        if (balance > 0) {
            balance = balance - b;
        }
    }

    public void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

}

public class S5P2 {
    public static void main(String[] args) {
        Bank b = new Bank(78990);
        b.checkBalance();
        b.withdraw(1234);
        b.checkBalance();
    }

}
