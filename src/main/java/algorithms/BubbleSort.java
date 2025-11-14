package algorithms;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean x;

        for (int i = 0; i < n-1; i++) {
            x = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    x = true;
                }
            }
            if (!x) break;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {0, 5, 6, 9, 1, 4, 7};
        bubbleSort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
