package collections;

import java.util.HashMap;
import java.util.Map;

public class SortFrequency {
    public static void main(String[] args) {

        String[] names = {"Jon", "Bob", "Sofi", "Luka", "Jon", "BOB", "Jon", "Sofi", "Jon", "Sofi"};
        Map<String, Integer> frequentName = new HashMap<>();

        for (String name : names) {
            name = name.toUpperCase();
            if (frequentName.containsKey(name)) {
                frequentName.put(name, frequentName.get(name) + 1);
            } else {
                frequentName.put(name, 1);
            }
        }

        frequentName.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}