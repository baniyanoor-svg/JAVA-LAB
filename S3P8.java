
class Order {
    int orderId;
    double amount;

    Order(int o, double a) {
        orderId = o;
        amount = a;
    }
}

class OnlineOrder extends Order {
    double deliveryCharge;

    OnlineOrder(int o, double a, double d) {
        super(o, a);
        deliveryCharge = d;
    }

    void finalBill() {
        double total = amount + deliveryCharge;
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: " + amount);
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Final Bill: " + total);
    }
}

public class S3P8 {
    public static void main(String[] args) {
        OnlineOrder o = new OnlineOrder(101, 500, 50);
        o.finalBill();
    }
}