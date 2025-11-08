package collections;

import java.util.LinkedList;
import java.util.List;

public class QueueEx {
    public static void main(String[] args) {
        List<String> customers = new LinkedList<>();
        customers.add("Bob");
        customers.add("Jon");
        customers.add("Sofi");

        System.out.println("Customers before remove: " + customers);
        customers.remove(0);
        System.out.println("Customers  after remove: " + customers);

    }
}