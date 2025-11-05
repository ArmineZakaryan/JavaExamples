package exceptions.customException;

public class Main {

    public static void main(String[] args) {
        try {
            AgeValidate.validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program finished!");
        }
    }
}