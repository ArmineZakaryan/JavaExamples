package core.employeeBonus;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Bon", 1, 200);
        employees[1] = new Employee("Jon", 1.5, 250);
        employees[2] = new Employee("Oli", 2, 400);
        employees[3] = new Employee("Peter", 5, 500);
        employees[4] = new Employee("Bob", 6, 700);

        for (int i = 0; i < employees.length; i++) {
            employees[i].calculateBonus();
        }
    }
}