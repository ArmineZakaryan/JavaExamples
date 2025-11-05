package collections;

import java.util.*;

public class MargeNames {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Ann", "Bob", "Sepu");
        List<String> list2 = Arrays.asList("ANN", "Izabel", "Poxos");

        Map<String, Integer> commonNames = new HashMap<>();
        List<String> allNames = new ArrayList<>();
        allNames.addAll(list1);
        allNames.addAll(list2);

        for (String name : allNames) {
            name = name.toUpperCase();
            commonNames.put(name, commonNames.getOrDefault(name, 0) + 1);
        }
        System.out.println(commonNames);
    }
}