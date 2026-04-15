import java.io.*;
public class S6P5 {
    public static void main(String[] args) throws IOException {
         try{FileReader file =new FileReader("notfound.txt");
        
    } catch(FileNotFoundException e){
        System.out.println("file not found");
    }
    finally{
        System.out.println("code running always");
    }
    
    }
}
