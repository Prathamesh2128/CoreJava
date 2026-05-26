package utility;

import entity.Developer;
import entity.Employee;
import entity.Manager;
import entity.Tester;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeUtility {

    public static void getAllEmployees(List<Employee> empList) {
        empList.forEach(k -> System.out.println(k));
    }

    public static void getAllManagers(List<Employee> empList) {
        for (Employee e : empList) {
            if (e instanceof Manager) {
                System.out.println(e);
            }
        }
    }

    public static void getAllDevelopers(List<Employee> empList) {
        for (Employee e : empList) {
            if (e instanceof Developer) {
                System.out.println(e);
            }
        }
    }

    public static void getAllTesters(List<Employee> empList) {
        for (Employee e : empList) {
            if (e instanceof Tester) {
                System.out.println(e);
            }
        }
    }

    public static void sortById(List<Employee> empList) {
        System.out.println("*** Sort by ID ***");
        Collections.sort(empList, (e1, e2) -> e2.getId() - e1.getId());
        getAllEmployees(empList);
    }

    public static void sortByNameTraditional(List<Employee> empList) {
        System.out.println("*** Sort by Name ***");
        Collections.sort(empList, (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
        getAllEmployees(empList);
    }

    public static void sortByNameStream(List<Employee> empList) {
        System.out.println("*** Sort by Name ***");
        empList.sort(Comparator.comparing(Employee::getName));
        getAllEmployees(empList);
    }

    public static void sortBySalaryTraditional(List<Employee> empList) {
        System.out.println("*** Sort by Salary ***");
        Collections.sort(empList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.getSalary(), o2.getSalary());
            }

        });

        getAllEmployees(empList);
    }

    public static void sortBySalaryStream(List<Employee> empList) {
        System.out.println("*** Sort by Salary ***");
        empList.sort(Comparator.comparing(Employee::getSalary).reversed());

        getAllEmployees(empList);
    }

    public static void sortByDepartmentTraditional(List<Employee> empList) {
        System.out.println("*** Sort by Department ***");
        Collections.sort(empList, (e1, e2) -> {
            return e1.getDepartment().compareTo(e2.getDepartment());
        });
        getAllEmployees(empList);
    }

    public static void sortByDepartmentStream(List<Employee> empList) {
        System.out.println("*** Sort by Department ***");
        empList.sort(Comparator.comparing(Employee::getDepartment));
        getAllEmployees(empList);
    }

    public static Employee searchById(List<Employee> empList, int target) {
        for (Employee emp : empList) {
            if (emp.getId() == target) {
                return emp;
            }
        }
        return null;
    }

    public static void searchByName(List<Employee> empList, String target) {
        empList.forEach(emp -> {
            if (emp.getName().equals(target)) {
                System.out.println(emp);
            }
        });
    }

    public static void removeByName(List<Employee> empList, String target) {
        empList.removeIf(k -> k.getName().equals(target));

        getAllEmployees(empList);
    }

    public static void removeById(List<Employee> empList, int target) {
        empList.removeIf(emp -> emp.getId() == target);

        getAllEmployees(empList);
    }

    public static void updateEmployeeName(Employee emp, String name) {
        emp.setName(name);
        System.out.println(emp);
    }
}
