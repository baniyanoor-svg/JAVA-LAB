// Program to check sufficient balance

class AmountDemo {
    public static void main(String args[]) {

        int balance = 5000;
        int withdraw = 7000;

        try {

            if (withdraw > balance) {
                throw new Exception("Insufficient Balance");
            }

            else {
                System.out.println("Transaction Successful");
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}
