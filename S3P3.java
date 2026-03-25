class Vehicle{


    int vehicleNo;
    String ownerName;
    Vehicle(int v,String o){
vehicleNo=v;
ownerName =o;

    }
}
class Car extends Vehicle{

String model;
String Fueltype;

Car(int v,String o,String m,String F){
    super(v,o);
model =m;
Fueltype =F;

}
void display(){
    System.out.println("" +vehicleNo);
System.out.println("" +ownerName);
    System.out.println("" +model);
    System.out.println("" +Fueltype);
    





}

}
public class S3P3 {
    public static void main(String[] args) {
        Car c1 = new Car(56,"noor","ferrari","petrol");
        c1.display();
      
       
    }}