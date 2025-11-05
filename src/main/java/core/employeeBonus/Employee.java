package core.employeeBonus;

import java.util.Objects;

public class Employee {
    private String name;
    private double yearsOfExperience;
    private double salary;


    public Employee(String name, double yearsOfExperience, double salary) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(double yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Double.hashCode(yearsOfExperience);
        result = 31 * result + Double.hashCode(salary);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        return yearsOfExperience == employee.yearsOfExperience && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", salary=" + salary +
                '}';
    }


    public void calculateBonus() {
        double bonus;
        if (yearsOfExperience < 2) {
            System.out.println("Salary: " + salary + " no bonus ");
        } else if (yearsOfExperience <= 2) {
            bonus = salary * 0.1;
            System.out.println("Salary: " + salary + " bonus " + bonus);
        } else if (yearsOfExperience > 5) {
            bonus = salary * 0.2;
            System.out.println("Salary: " + salary + " bonus " + bonus);
        }
    }
}