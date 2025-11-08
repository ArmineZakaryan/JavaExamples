package collections;

import java.util.Set;
import java.util.TreeSet;

public class SortNumbers {
    public static void main(String[] args) {
        Integer[] numbers = {8, 9, 6, 3, 1, 4, 5, 7};
        Set<Integer> sorted = new TreeSet<>();
        for (int a : numbers) {
            sorted.add(a);
        }
        System.out.println(sorted);
    }
}