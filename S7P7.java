

class Message {
    String s;
    Message(String t){
        s=t;
    }

    void displayLen() {

        System.out.println("Length:" + s.length());

    }
    void displayUpper() {

        System.out.println("Uppercase:" + s.toUpperCase());

    }
    

}

public class S7P7 {
    public static void main(String[] args) {
        Message m1=new Message("Java is powerful");
        Message m2=new Message("Java   is powerful");
       m1.displayLen();
       m2.displayUpper();
        
    }

}
