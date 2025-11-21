package algorithms;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {8, 6, 0, 21, 9, 5};
        selectionSort(numbers);
        System.out.print("Sorted array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}