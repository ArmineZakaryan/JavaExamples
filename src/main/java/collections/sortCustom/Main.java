package collections.sortCustom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Bob", 20));
        people.add(new Person("Jon", 14));
        people.add(new Person("Ann", 30));

        Collections.sort(people);
        // Collections.sort(people, Comparator.comparingInt(Person::getAge));

        System.out.println("Sorted by age (ASC): ");
        for (Person p : people) {
            System.out.println(p);
        }

        people.sort(Comparator.comparing(Person::getName));
        System.out.println("\nSorted by name (A-Z):");
        for (Person p : people) {
            System.out.println(p);
        }
        //people.forEach(System.out::println);
    }
}