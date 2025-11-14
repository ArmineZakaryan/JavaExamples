package practics;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {
    public static void findDuplicateWords(String text) {
        String[] words = text.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            wordCount.put(lowerCaseWord, wordCount.getOrDefault(lowerCaseWord, 0) + 1);
        }
        System.out.println("Duplicate words:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times:");
            }
        }
    }

    public static void main(String[] args) {
        String text = "Hello world from java world hello";
        findDuplicateWords(text);
    }
}