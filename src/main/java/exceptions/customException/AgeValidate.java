package exceptions.customException;

public class AgeValidate {
    public static void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        } else {
            System.out.println("Welcome!");
        }
    }
}
