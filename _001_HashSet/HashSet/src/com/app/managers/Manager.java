package com.app.managers;

import com.app.enity.Employee;
import java.util.Set;

public class Manager {

    public static void getEmployee(Set<Employee> emp) {
        for (Employee e : emp) {
            System.out.println(e);
        }
    }

    public static void getById(Set<Employee> empSet, int searchEmpId) {
        for (Employee e : empSet) {
            if (e.getId().equals(searchEmpId)) {
                System.out.println(e);
            }
        }
    }

    public static void getByName(Set<Employee> empSet, String searchEmpName) {
        for (Employee e : empSet) {
            if (e.getName().equalsIgnoreCase(searchEmpName)) {
                System.out.println(e);
            }
        }
    }

    public static void getByGreaterThan(Set<Employee> empSet, double searchSalary) {
        for (Employee e : empSet) {
            if (e.getSalary() > searchSalary) {
                System.out.println(e);
                
            }
        }
    }

    public static void getByLessThan(Set<Employee> empSet, double searchSalary) {
        for (Employee e : empSet) {
            if (e.getSalary() < searchSalary) {
                System.out.println(e);
                
            }
        }
    }

}
