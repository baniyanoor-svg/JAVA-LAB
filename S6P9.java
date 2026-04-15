
import java.io.*;

class InvalidPasswordException extends Exception {
InvalidPasswordException(String message){
    super(message);
}}
class S6P9{
    static void checkPassword(String password) throws InvalidPasswordException {

        if (password.length() < 8 || !password.matches(".*\\d.*")) {
            throw new InvalidPasswordException( "Password must be at least 8 characters and contain a digit");
        } else {
            System.out.println("Valid Password");
        }
    }

    public static void main(String[] args) {
        try {
            checkPassword("abc12"); // Test case
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
