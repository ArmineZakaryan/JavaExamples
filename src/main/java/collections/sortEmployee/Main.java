package collections.sortEmployee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sofi", "ChicQuarters", 20));
        employees.add(new Employee("Bob", "The Style Edit", 400));
        employees.add(new Employee("Ann", "Trend Central", 900));


        Collections.sort(employees, new Compare());
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}