package core.number;

public class ArrayEx {
    public static void main(String[] args) {

        int[] array = {12, 6, -4, 56, 0, 33, -9, -5, 0};

        int max = array[0];
        int min = array[0];
        int countOfPositive = 0;
        int countOfNegative = 0;
        int countOfZero = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > 0) {
                countOfPositive++;
            } else if (array[i] < 0) {
                countOfNegative++;
            } else {
                countOfZero++;
            }

        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("Count of positive: " + countOfPositive);
        System.out.println("Count of negative: " + countOfNegative);
        System.out.println("Count of zero: " + countOfZero);
    }
}