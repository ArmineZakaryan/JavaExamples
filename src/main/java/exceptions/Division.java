package exceptions;

public class Division {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Operation complete");
        }
    }
}