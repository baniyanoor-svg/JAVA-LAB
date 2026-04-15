class S6P11 {

    public static void main(String[] args) {

        try {
            System.out.println("Outer try starts");

            try {
                System.out.println("Inner try starts");

                int x = 10 / 0;  // ArithmeticException

                System.out.println("Inner try ends");
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero");
            }

            System.out.println("Outer try continues");

            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index issue");
        }

        System.out.println("Program ends");
    }
}