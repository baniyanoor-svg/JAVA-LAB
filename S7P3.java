class Employee {

    String name;
    String desg;
    double salary;

    Employee() {
        name = "Unknown";
        desg = "Unknown";
        salary = 0;

    }

    Employee(String n, String d, double s) {

        name = n;
        desg = d;
        salary = s;

    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Desg:" + desg);

        System.out.println("Salary:" + salary);
    }
}

public class S7P3 {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("noor", "teacher", 3000);
        e1.display();
        e2.display();

    }
}
