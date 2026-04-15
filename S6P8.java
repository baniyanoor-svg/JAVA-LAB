   
   import java.io.*;
    public class S6P8{
    double balance = 5000;

    void withdraw(double amount) {
        if (amount > balance) {
            throw new ArithmeticException("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) {
        S6P8 acc = new S6P8();
       try{ acc.withdraw(6000); }
       catch(ArithmeticException e) {
        System.out.println( "Exception caught: " + e.getMessage());
       }
       finally{
        System.out.println("program continues");
       }
    }
}
