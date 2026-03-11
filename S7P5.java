class Student {
    int[] marks;

    Student(int[] m) {

        marks = m;

    }

    void calcualteAverage() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];

        }
        double avg = (double) sum / marks.length;
        System.out.println("Average:" + avg);
    }

}

public class S7P5 {
    public static void main(String[] args) {
        int[] m = { 23, 45, 56, 45, 78 };
        Student s1 = new Student(m);
        s1.calcualteAverage();
    }

}
