class Product{

    String name;
    int price;
    Product(String n,int p){
        name=n;
        price=p;
    }
}
class Electronics extends Product {

    int warrantyPeriod;
    
    Electronics(String n ,int p, int w){
 super(n,p);
warrantyPeriod =w;


    }

void display(){
System.out.println("Name:" +name);
System.out.println("Price:" +price);
System.out.println("Warranty:" +warrantyPeriod +"years");

}



}
public class S3P4 {
    public static void main(String[] args) {
        Electronics e1 = new Electronics("noor",890,4);
        e1.display();
      
       
    }}