
import java.util.*;

public class S4P8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            if (frequencyMap.containsKey(word)) {

                frequencyMap.put(word, frequencyMap.get(word) + 1);

            } else {

                frequencyMap.put(word, 1);
            }
        }
        System.out.println(frequencyMap);

    }
}