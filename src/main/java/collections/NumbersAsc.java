package collections;

import java.util.Arrays;
import java.util.PriorityQueue;

public class NumbersAsc {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>(Arrays.asList(8, 3, 1, 6, 4, 5, 7, 9));
        while (!numbers.isEmpty()) {
            System.out.print(numbers.poll() + " ");
        }
    }
}