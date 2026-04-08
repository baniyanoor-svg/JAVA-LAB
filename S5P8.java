

import java.util.Scanner;

public class S5P8 {
    public static void main(String[] args) {
        String pass = "1234";
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        while (attempts < 3) {
            try {

                System.out.println("enter password");
                String input = sc.next();

                if (!input.equals(pass)) {
                    throw new Exception("wrong pswd");
                }
                System.out.println("login success");

            } catch (Exception e) {
                attempts++;
                System.out.println(e.getMessage());
            }
            finally{
               sc.close();
            }
        }
    }
}