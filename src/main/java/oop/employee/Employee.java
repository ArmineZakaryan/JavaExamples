package oop.employee;

import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private int yearsOfExperience;

    public Employee(String name, double salary, int yearsOfExperience) {
        this.name = name;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && yearsOfExperience == employee.yearsOfExperience && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Double.hashCode(salary);
        result = 31 * result + yearsOfExperience;
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }

    public void calculateRaise() {
        double newSalary = salary;
        if (yearsOfExperience > 5) {
            newSalary = salary * 1.20;
        } else if (yearsOfExperience >= 2) {
            newSalary = salary * 1.10;
        } else {
            newSalary = salary * 1.05;
        }
        System.out.println("New salary for " + name + " " + newSalary);
    }
}