package collections;

import java.util.HashMap;
import java.util.Map;

public class RemoveRare {
    public static void main(String[] args) {
        String[] names = {"Bob", "Ann", "Ann", "Sepu", "Bob", "ANN"};
        Map<String, Integer> removeEl = new HashMap<>();

        for (String name : names) {
            name = name.toUpperCase();
            removeEl.put(name, removeEl.getOrDefault(name, 0) + 1);
        }
        removeEl.entrySet().removeIf(entry -> entry.getValue() == 1);
        System.out.println(removeEl);
    }
}