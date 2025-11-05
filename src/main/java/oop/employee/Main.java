package oop.employee;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Bob", 300, 1),
                new Employee("John", 500, 2),
                new Employee("Lia", 800, 6),
        };
        for (Employee employee : employees) {
            employee.calculateRaise();
        }
    }
}