package collections.sortStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 100));
        students.add(new Student("Ann", 35));
        students.add(new Student("Jon", 60));

        Collections.sort(students);
        System.out.println("Sorted by name: ");
        for (Student s : students) {
            System.out.println(s);
        }
        Collections.sort(students, new GradeComparator());
        System.out.println("\nSorted by grade: ");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}