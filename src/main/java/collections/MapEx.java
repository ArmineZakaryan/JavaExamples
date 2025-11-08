package collections;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {

        String[] names = {"Bob", "Ann", "ANN", "Sepu"};
        Map<String, Integer> words = new HashMap<>();

        for (String name : names) {
            name = name.toUpperCase();
            if (words.containsKey(name)) {
                words.put(name, words.get(name) + 1);
            } else {
                words.put(name, 1);
            }
        }
        System.out.println(words);
    }
}