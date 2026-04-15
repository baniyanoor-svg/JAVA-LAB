 import java.io.*;
 public class S6P6 {
   public static void main(String[] args) {
    
    String str ="abc";
    try{
        int num = Integer.parseInt(str);
        System.out.println("Parsed number" +num);
    }
    catch(NumberFormatException e){

        System.out.println("Error:unable to parse the string as an integer");
    }
    finally{
        System.out.println("file running .....");
    }
  }  
}

   