import java.io.*;

public class S6P7 {
  static void checkAge(int age) {
    try {
      if (age < 18) {
        throw new ArithmeticException("not eligible to vote");

      } else {
        System.out.println("eligible");
      }
    } catch (ArithmeticException e) {
      System.out.println("not able to vote");
    }
  }

  public static void main(String[] args) {

    checkAge(56);
  }
}
