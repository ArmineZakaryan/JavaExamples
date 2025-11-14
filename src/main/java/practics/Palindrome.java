package practics;

public class Palindrome {

    public static boolean isPalindrome(String text) {
        text = text.toLowerCase();
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"madam", "Level", "hello", "radar"};
        for (String word : words) {
            System.out.println(word + " isPalindrome " + isPalindrome(word));
        }
    }
}