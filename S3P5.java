class Account {
    int accNo;
    double balance;

    Account(int a, double b) {
        accNo = a;
        balance = b;
    }

}

class SavingAccount extends Account {

    double interestRate;

    SavingAccount(int a, double b, double i) {

        super(a, b);
        interestRate = i;
    }

    void Calculateinterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Accountno:" + accNo);
        System.out.println("Balance:" + balance);
        System.out.println("Interest:" + interest);

    }

}

public class S3P5 {
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount(45678, 900, 2);
        s1.Calculateinterest();

    }
}