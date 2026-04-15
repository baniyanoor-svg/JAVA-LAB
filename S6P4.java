import java.io.*;
import java.util.Scanner;

public class S6P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("enter first");
            String a = sc.nextLine();

            System.out.println("enter 2nd");
            String b = sc.nextLine();
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);

            int result = num1 / num2;
            System.out.println("Result" + result);
        }

        catch (ArithmeticException e) {
            System.out.println("arithmetic error raised");

        } catch (NumberFormatException e) {
            System.out.println(" NumberformatError:unable to parse into int");
        } catch (Exception e) {
            System.out.println("remaining errors");
        }

    }

}
