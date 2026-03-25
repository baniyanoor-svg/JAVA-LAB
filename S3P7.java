class Student {

    String name;
    int marks;

    Student(String n, int m) {

        name = n;
        marks = m;

    }
}

class Result extends Student {

    char grade;

    Result(String n, int m) {
        super(n, m);
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';

        } else if (marks > 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
    }

    void display() {

        System.out.println("Name:" + name);
        System.out.println("Marks:" + marks);
        System.out.println("Grade:" + grade);
    }

}

public class S3P7 {
    public static void main(String[] args) {
        Result r1 = new Result("Noor", 79);
        r1.display();
    }
}