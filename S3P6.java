class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;

    }
}

class Patient extends Person {
    String disease;
    String doctor;

    Patient(String n, int a, String d, String doc) {
        super(n, a);
        disease = d;
        doctor = doc;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Disease:" + disease);
        System.out.println("Doctor:" + doctor);

    }

}

public class S3P6 {
    public static void main(String[] args) {
        Patient p1 = new Patient("noor", 42, "fever", "shabnam");
        p1.display();

    }
}