class Car {

    String brand;
    double price;

    Car(String b, double p) {
        brand = b;
        price = p;

    }

    Car() {
        this("Unknown", 0.0);

    }

    void display() {

        System.out.println("Brand:" + brand + "Price:" + price);

    }

}

public class S7P6 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("bmw", 30000.0);
        c1.display();
        c2.display();
    }

}
