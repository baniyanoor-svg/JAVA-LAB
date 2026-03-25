class Book {
    String title;
    String author;

    Book(String t, String a) {
        title = t;
        author = a;
    }
}

class IssuedBook extends Book {
    String issueDate;
    String returnDate;

    IssuedBook(String t, String a, String i, String r) {
        super(t, a);
        issueDate = i;
        returnDate = r;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Return Date: " + returnDate);
    }
}

public class S3P9 {
    public static void main(String[] args) {
        IssuedBook b1 = new IssuedBook("Java ", "Noor", "20-03-2026", "30-03-2026");
        b1.display();
    }
}