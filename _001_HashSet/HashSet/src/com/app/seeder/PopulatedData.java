package com.app.seeder;

import com.app.enity.Employee;
import java.util.HashSet;
import java.util.Set;

public class PopulatedData {

    public static Set<Employee> populatedEmplyee() {
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee(2, "Rahul", 75000, "Development", "9876543210"));
        employeeSet.add(new Employee(1, "Prathamesh", 90000, "RnD", "9821907236"));
        employeeSet.add(new Employee(4, "Amit", 67000, "Support", "9123456780"));
        employeeSet.add(new Employee(3, "Sneha", 82000, "QA", "9988776655"));
        employeeSet.add(new Employee(6, "Vikas", 88000, "DevOps", "9012345678"));
        employeeSet.add(new Employee(5, "Neha", 95000, "HR", "9090909090"));
        employeeSet.add(new Employee(8, "Rohan", 99000, "Architecture", "9765432109"));
        employeeSet.add(new Employee(7, "Pooja", 72000, "Testing", "9898989898"));
        employeeSet.add(new Employee(10, "Anjali", 79000, "Security", "9456123780"));
        employeeSet.add(new Employee(9, "Karan", 61000, "Networking", "9345678123"));
        return employeeSet;
    }
}
