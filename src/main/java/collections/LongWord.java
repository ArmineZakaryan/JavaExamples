package collections;

public class LongWord {
    public static void main(String[] args) {

        String[] words = {"java", "programming", "world"};
        String longestWord = words[0];

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord);
    }
}