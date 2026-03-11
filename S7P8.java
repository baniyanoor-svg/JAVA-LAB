

class Students {
    String name;
    int marks;

    Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + " Marks: " + marks);
    }}

public class S7P8{
    
    public static void main(String[] args) {
        Students[] s = new Students[3];

        s[0] = new Students("Ali", 85);
        s[1] = new Students("Sara", 90);
        s[2] = new Students("Naman", 78);

        for (int i = 0; i < s.length; i++) {
            s[i].display();
        }
    }
}















