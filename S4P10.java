
import java.util.*;

public class S4P10{

    static Deque<Integer> st = new ArrayDeque<>();

   
    public static void push(int x) {
        st.addFirst(x);
    }

 
    public static int pop() {
        return st.removeFirst();
    }

 
    public static int peek() {
        return st.peekFirst();
    }


    public static boolean isEmpty() {
        return st.isEmpty();
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);

        System.out.println("Top element: " + peek());  
        System.out.println("Removed: " + pop());        
        System.out.println("Top element: " + peek());   
        System.out.println("is Empty? " + isEmpty());   
    }
}
