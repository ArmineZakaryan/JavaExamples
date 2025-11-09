package collections.sortEmployee;

import java.util.Comparator;

public class Compare implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int depCompare = e1.getDepartment().compareTo(e2.getDepartment());
        if (depCompare != 0)
            return depCompare;

        int salaryCompare = Double.compare(e2.getSalary(), e1.getSalary());
        if (salaryCompare != 0) return salaryCompare;

        return e1.getName().compareTo(e2.getName());
    }
}