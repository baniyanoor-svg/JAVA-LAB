class Employee {

    String name;
    double basesalary;

    Employee(String n, double b) {
        name = n;
        basesalary = b;

    }
}

class Manager extends Employee {
    double bonus;

    Manager(String n, double b, double bon) {
        super(n, b);

        bonus = bon;

    }

    
    void totalSalary() {

        double total = basesalary + bonus;
        System.out.println("Name:" + name);
      System.out.println("base:" + basesalary);
     System.out.println("bonus:" + bonus);
         System.out.println("totalsalary:" + total);
    }
    

}

public class S3P2 {
    public static void main(String[] args) {
        Manager m1 = new Manager("noor",1000,500);
        
        m1.totalSalary();
       
    }}