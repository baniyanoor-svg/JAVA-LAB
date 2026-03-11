class Book {

    String title;
    double price;

    Book() {
        title = "Unknown";
        price = 0.0;

    }

    Book(String s, double d) {

        title = s;
        price = d;

    }

    void display() {
        System.out.println("Title" + title);

        System.out.println("Price" + price);

    }
}

public class S7P4 {

public static void main(String[] args) {
    Book b1 =new Book();
    Book b2 = new Book("rivalry", 200.000);
    b1.display();
    b2.display();
}

}
