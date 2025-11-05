package collections;

import java.util.HashMap;
import java.util.Map;

public class MostFreqName {
    public static void main(String[] args) {
        String[] names = {"Bob", "Ann", "Ann", "Sepu", "Bob", "ANN"};
        Map<String, Integer> frequentName = new HashMap<>();

        for (String name : names) {
            name = name.toUpperCase();
            if (frequentName.containsKey(name)) {
                frequentName.put(name, frequentName.get(name) + 1);
            } else {
                frequentName.put(name, 1);
            }
        }

        String mostFrequent = "";
        int maxValue = 0;
        for (Map.Entry<String, Integer> entry : frequentName.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        System.out.println("Most frequent name: " + mostFrequent + " " + maxValue);
    }
}