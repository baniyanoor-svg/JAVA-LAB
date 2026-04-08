
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

public class S5P3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            if (amount < 0) {
                throw new NegativeAmountException("Amount cannot be negative.");
            }

            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance.");
            }

            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + balance);

        } catch (NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input! Please enter a numeric value.");

        } finally {
            System.out.println("Thank you for using ATM.");
            sc.close();
        }
    }
}