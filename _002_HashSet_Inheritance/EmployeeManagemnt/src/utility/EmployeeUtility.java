package utility;

import entity.Developer;
import entity.Employee;
import entity.Manager;
import entity.Tester;
import java.util.List;
import java.util.Set;

public class EmployeeUtility {

    public static void getAllEmployee(Set<Employee> empSet) {
        for (Employee e : empSet) {
            System.out.println(e);
        }
    }

    public static void getAllEmployeeList(List<Employee> empList) {
        for (Employee e : empList) {
            System.out.println(e);
        }
    }

    public static void getAllManager(Set<Employee> empSet) {
        for (Employee e : empSet) {
            if (e instanceof Manager) {
                System.out.println(e);
            }
        }
    }

    public static void getAllDeveloper(Set<Employee> empSet) {
        for (Employee e : empSet) {
            if (e instanceof Developer) {
                System.out.println(e);
            }
        }
    }

    public static void getAllTester(Set<Employee> empSet) {
        for (Employee e : empSet) {
            if (e instanceof Tester) {
                System.out.println(e);
            }
        }
    }

    public static void searchById(Set<Employee> empSet, int searchId) {
        for (Employee e : empSet) {
            if (e.getId() == searchId) {
                System.out.println(e);
            }
        }
    }

    public static void searchByName(Set<Employee> empSet, String target) {
        for (Employee e : empSet) {
            if (e.getName().equals(target)) {
                System.out.println(e);
            }

        }
    }
}
