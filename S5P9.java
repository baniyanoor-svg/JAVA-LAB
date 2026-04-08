class InvalidDiscountException extends Exception {
    public InvalidDiscountException(String message) {
        super(message);
    }
}

class Order {
    private double price;

    // Constructor
    public Order(double price) {
        this.price = price;
    }

    // Public method to apply discount
    public void applyDiscount(double discount) throws InvalidDiscountException {
        if (discount > 50) {
            throw new InvalidDiscountException("Discount cannot exceed 50%");
        }
        price = price - (price * discount / 100);
        System.out.println("Discount applied. Final price: " + price);
    }

    // Getter (no direct modification allowed)
    public double getPrice() {
        return price;
    }
}

public class S5P9 {
    public static void main(String[] args) {
        try {
            Order order = new Order(1000);
            order.applyDiscount(30); // valid
            order.applyDiscount(60); // throws exception
        } catch (InvalidDiscountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
