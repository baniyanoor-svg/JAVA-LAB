
import java.io.*;
public class S6P2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        try{
            int index =10;
            int value =arr[index];
System.out.println("value at index" +index + ":" +value);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
        }
    }
}
