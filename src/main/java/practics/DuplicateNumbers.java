package practics;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumbers {
    public static void main(String[] args) {

        int[] numbers = {5, 3, 7, 4, 2, 1, 2, 3};
        Map<Integer, Integer> numCount = new HashMap<>();

        for (int n : numbers) {
            numCount.put(n, numCount.getOrDefault(n, 0) + 1);
        }
        System.out.println("Duplicate numbers:");
        for (Map.Entry<Integer, Integer> entry : numCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}
