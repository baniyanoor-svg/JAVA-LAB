
    

// Program for single inheritance

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

class InheritanceDemo {
    public static void main(String args[]) {

        Dog d = new Dog();

        d.sound(); // parent method
        d.bark();  // child method
    }
}