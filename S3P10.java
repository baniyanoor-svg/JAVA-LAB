class Recharge {
    String mobileNumber;
    double planAmount;

    Recharge(String m, double p) {
       mobileNumber =m;
         planAmount =p;
    }
}

class DataRecharge extends Recharge {
    double dataLimit;

    DataRecharge(String m, double p, double d) {
        super(m, p);
       dataLimit=d;
    }

    void display() {
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Plan Amount: " + planAmount);
        System.out.println("Data Limit: " + dataLimit + " GB");
        System.out.println("Benefits: Unlimited Calls + Data Pack");
    }
}

public class S3P10{
    public static void main(String[] args) {
        DataRecharge r1 = new DataRecharge("9876000000", 299, 1.5);
        r1.display();
    }
}