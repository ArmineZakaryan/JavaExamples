package exceptions;

import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            String input;
            System.out.println("Please give input ");
            input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } finally {
            System.out.println("Program finished!");
        }
    }
}
