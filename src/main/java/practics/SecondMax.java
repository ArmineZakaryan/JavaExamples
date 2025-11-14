package practics;

public class SecondMax {

    public static void main(String[] args) {

        int[] numbers = {5, 7, 1, 0, 3, 9, 6, 21};
        int max = numbers[0];
        int secondMax = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] < max) {
                secondMax = numbers[i];
            }
        }
        System.out.println(secondMax);
    }
}