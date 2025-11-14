package practics;


import java.util.HashMap;
import java.util.Map;

public class SymbolCount {
    public static void main(String[] args) {
        String text = "hello world";
        Map<Character, Integer> count = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}