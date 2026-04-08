class Result {
    private int marks;

    Result(int m) {
        marks = m;
    }

    public int getMarks() {
        return marks;

    }

    void setMarks(int marks) {
        this.marks = marks;
    }

}

class Admin {

    void updateMarks(Result r, int newmarks) {
        r.setMarks(newmarks);
    }

}

public class S5P1 {
    public static void main(String[] args) {

        Result r = new Result(34);
        System.out.println("Marks :" + r.getMarks());

        Admin a = new Admin();
        a.updateMarks(r, 67);
        System.out.println("updated:" + r.getMarks());

    }
}
