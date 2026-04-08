
class BookUnavailableException extends Exception {
    public BookUnavailableException(String message) {
        super(message);
    }
}

class Book {
    private int copiesAvailable;

    // Constructor
    public Book(int copies) {
        this.copiesAvailable = copies;
    }

    // Issue book
    public void issueBook() throws BookUnavailableException {
        if (copiesAvailable <= 0) {
            throw new BookUnavailableException("No copies available");
        }
        copiesAvailable--;
        System.out.println("Book issued. Remaining copies: " + copiesAvailable);
    }

    // Return book
    public void returnBook() {
        copiesAvailable++;
        System.out.println("Book returned. Available copies: " + copiesAvailable);
    }

    // Getter only (no direct modification)
    public int getCopiesAvailable() {
        return copiesAvailable;
    }
}

public class S5P10{
    public static void main(String[] args) {
        try {
            Book b = new Book(1);

            b.issueBook(); // OK
            b.issueBook(); // Exception

        } catch (BookUnavailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}