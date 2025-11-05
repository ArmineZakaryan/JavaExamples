package exceptions;

import java.util.Scanner;

public class ArrayIndex {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 8};
        Scanner scanner = new Scanner(System.in);
        int b = 0;

        try {
            System.out.println("Please input index");
            String index = scanner.nextLine();
            System.out.println("number of index " + index + ": " + numbers[Integer.parseInt(index)]);

            int result = numbers[1] / b;
            System.out.println(result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please chose index between 0 " + (numbers.length - 1));
        } catch (ArithmeticException e) {
            System.out.println("is not divisible by 0");
        } finally {
            System.out.println("Program finished");
        }
    }
}