package exceptions;

import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please input array index");
            String index = scanner.nextLine();
            System.out.println("number of index " + index + ": " + numbers[Integer.parseInt(index)]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please chose index between 0 " + (numbers.length - 1));
        } finally {
            System.out.println("Program finished!");
        }
    }
}