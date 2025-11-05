package exceptions.smartCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SmartCalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please input first number");
            double a = scanner.nextDouble();

            System.out.println("Please input second number");
            double b = scanner.nextDouble();

            System.out.println("Please input operation(+, -, *, /)");
            String op = scanner.next();

            double result = calculate(a, b, op);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Please input only numbers!");
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        } catch (InvalidOperationException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program finished!");
        }
    }

    private static double calculate(double a, double b, String op) throws InvalidOperationException {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException();
                }
                return a / b;
            default:
                throw new InvalidOperationException("Unknown operation: " + op);
        }
    }
}