package collections;

import java.util.HashMap;
import java.util.Map;

public class CountNames {
    public static void main(String[] args) {

        String[] names = {"Bob", "Ann", "ANN", "Sepu"};
        Map<String, Integer> countOfName = new HashMap<>();

        for (String name : names) {
            name = name.toUpperCase();
            if (countOfName.containsKey(name)) {
                countOfName.put(name, countOfName.get(name) + 1);
            } else {
                countOfName.put(name, 1);
            }
        }
        System.out.println(countOfName);
    }
}