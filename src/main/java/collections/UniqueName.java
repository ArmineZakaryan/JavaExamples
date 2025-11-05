package collections;

import java.util.HashSet;
import java.util.Set;

public class UniqueName {
    public static void main(String[] args) {
        String[] names = {"Bob", "Ann", "John", "Luka", "Ann", "John", "Luka",};

        Set<String> uniqueNames = new HashSet<>();
        for (String name : names) {
            uniqueNames.add(name);
        }
        System.out.println(uniqueNames);
    }
}