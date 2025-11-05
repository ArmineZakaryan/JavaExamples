package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "Ann", "Petro", "Luka", "Sofi");
        Collections.sort(names);
        System.out.println(names);
    }
}
