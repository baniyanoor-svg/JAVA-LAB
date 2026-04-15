import java.util.Scanner;

class S6P10 {

    static void checkMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int sum = 0;

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                
                marks[i] = sc.nextInt();

                // validation
                checkMarks(marks[i]);

                sum += marks[i];
            }

            double avg = sum / 5.0;
            System.out.println("Average marks: " + avg);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Marks: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        } finally {
            System.out.println("Result processing completed.");
        }

        sc.close();
    }
}
