package collections;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, String> phoneNumber = new HashMap<>();
        phoneNumber.put("Bob", "093-11-22-33");
        phoneNumber.put("Sofi", "094-22-33-44");
        phoneNumber.put("Jon", "099-33-44-55");

        System.out.println(phoneNumber.get("Jon"));
    }
}