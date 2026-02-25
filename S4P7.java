
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class S4P7{
    public static void main(String[] args) {
        List<Integer>li= Arrays.asList(8,2,3,4);
        System.out.println("original list is" +li);
    Collections.sort(li);
     System.out.println(" sorted list is" +li);
    Collections.sort(li,Collections.reverseOrder());
     System.out.println(" reverse list is" +li);
    
}


    }