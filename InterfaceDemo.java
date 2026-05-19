
    
// Program for multiple inheritance using interface

interface Father {
    void show1();
}

interface Mother {
    void show2();
}

class Child implements Father, Mother {

    public void show1() {
        System.out.println("Father Interface");
    }

    public void show2() {
        System.out.println("Mother Interface");
    }
}

class InterfaceDemo {
    public static void main(String args[]) {

        Child c = new Child();

        c.show1();
        c.show2();
    }
}
