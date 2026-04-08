
import java.util.Scanner;

// Custom Exceptions
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class S5P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            if (name.trim().isEmpty()) {
                throw new InvalidNameException("Name cannot be empty");
            }

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // consume newline

            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above");
            }

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            if (!email.contains("@")) {
                throw new InvalidEmailException("Email must contain '@'");
            }

            System.out.println("Registration Successful!");

        } catch (InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            System.out.println("Form validation complete.");
        }

        sc.close();
    }
}







