class Employee {
    protected double salary = 50000;

}

class HR {
    void modifySalary(Employee e) {
        e.salary = 9000;
        System.out.println("hr updated salary:" + e.salary);
    }
}

class Finance {
    void showSalary(Employee e) {
        System.out.println("finance cant access salary");

    }
}

class Manager extends Employee {
    void showSalary() {
        System.out.println("Salary:" + salary);
    }
}

public class S5P6 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        HR hr = new HR();
        hr.modifySalary(emp);
        Finance f = new Finance();
        f.showSalary(emp);

        Manager m = new Manager();
        m.showSalary();
    }

}
