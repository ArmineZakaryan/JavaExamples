package practics;

public class MaxOfArray {

    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 9, 0, 1};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}