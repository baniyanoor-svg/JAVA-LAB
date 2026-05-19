// Program for exception handling

class ExceptionDemo {
    public static void main(String args[]) {

        int a = 10;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);
        }

        catch (ArithmeticException e) {
            System.out.println("Division by zero not possible");
        }

        finally {
            System.out.println("Program ended");
        }
    }
}
