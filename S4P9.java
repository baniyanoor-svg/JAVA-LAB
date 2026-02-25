import java.util.*;

public class S4P9 {
    public static void main(String[] args) {
        List<Integer> li1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> li2 = Arrays.asList(3, 4, 5, 6, 7);
List<Integer> common =  new ArrayList<>(li1);
common.retainAll(li2);
System.out.println(common);

    }
}
