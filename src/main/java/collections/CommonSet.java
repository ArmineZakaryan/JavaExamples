package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonSet {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9, 2, 8));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 6, 5, 7, 9, 1, 0));

        Set<Integer> common = new HashSet<>(set1);
        common.retainAll(set2);
        System.out.println(common);
    }
}