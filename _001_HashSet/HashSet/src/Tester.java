
import com.app.enity.Employee;
import static com.app.managers.Manager.*;
import static com.app.seeder.PopulatedData.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Tester {

    public static void main(String[] args) {
        boolean exit = false;
        Set<Employee> employeeSet = new HashSet<>();
        try (Scanner sc = new Scanner(System.in)) {
            while (!exit) {
                System.out.println("1. Add Employees in bulk \n2. Add Employee \n3. View All Employees \n4. Search by Id \n5. Search by Name \n6. Search by Salary More than \n7. Search by Salary Less than \n8. Sort by ID \n9. Sort by Name \n10. Sort by Salary \n11. Sort by Department \n12. Sort by Contact no \n13. Sort by Department and Salary \n14. Remove by Name \n15. Remove by Department Name  \n16. Remove by ID \n0. Exit");
                int operation = sc.nextInt();
                switch (operation) {
                    case 1 -> {
                        System.out.println("*** Employee Add ***");
                        employeeSet = populatedEmplyee();
                    }

                    case 2 -> {
                        System.out.println("Enter Id :: ");
                        int id = sc.nextInt();
                        System.out.println("Enter name :: ");
                        String name = sc.next();
                        System.out.println("Enter salary :: ");
                        double salary = sc.nextDouble();
                        System.out.println("Enter department :: ");
                        String depatment = sc.next();
                        System.out.println("Enter contact number :: ");
                        String contactNo = sc.next();
                        employeeSet.add(new Employee(id, name, salary, depatment, contactNo));
                    }

                    case 3 -> {
                        System.out.println("*** All Employee ***");
                        getEmployee(employeeSet);
                    }

                    case 4 -> {
                        System.out.println("Search by Id \nEnter Employee Id ");
                        getById(employeeSet, sc.nextInt());
                    }

                    case 5 -> {
                        System.out.println("Search by Name \nEnter Employee Name :: ");
                        getByName(employeeSet, sc.next());
                    }

                    case 6 -> {
                        System.out.println("Search by Salary More than \nEnter Employee Salary :: ");
                        getByGreaterThan(employeeSet, sc.nextDouble());
                    }

                    case 7 -> {
                        System.out.println("Search by Salary More than \nEnter Employee Salary ::  ");
                        getByLessThan(employeeSet, sc.nextDouble());
                    }

                    case 8 -> {
                        System.out.println("Sort Employee by ID");
                        List<Employee> list = new ArrayList<>(employeeSet);
                        Collections.sort(list);
                        for (Employee e : list) {
                            System.out.println(e);
                        }
                    }

                    case 9 -> {
                        System.out.println("Sort by Name");
                        List<Employee> list = new ArrayList<>(employeeSet);
                        list.sort(Comparator.comparing(Employee::getName));
                        for (Employee e : list) {
                            System.out.println(e);
                        }
                    }

                    case 10 -> {
                        System.out.println("Sort by Salary");
                        List<Employee> list = new ArrayList<>(employeeSet);
                        list.sort(Comparator.comparingDouble(Employee::getSalary));
                        for (Employee e : list) {
                            System.out.println(e);
                        }
                    }

                    case 11 -> {
                        System.out.println("Sort by Department");
                        List<Employee> list = new ArrayList<>(employeeSet);
                        Collections.sort(list, (e1, e2) -> e1.getDepartment().compareTo(e2.getDepartment()));
                        for (Employee e : list) {
                            System.out.println(e);
                        }
                    }

                    case 12 -> {
                        List<Employee> list = new ArrayList<>(employeeSet);
                        list.sort((e1, e2) -> e1.getContactNo().compareTo(e2.getContactNo()));
                        for (Employee e : list) {
                            System.out.println(e);
                        }
                    }

                    case 13 -> {
                        List<Employee> list = new ArrayList<>(employeeSet);
                        list.sort(Comparator.comparing(Employee::getDepartment).thenComparingDouble(Employee::getSalary));
                        for (Employee e : list) {
                            System.out.println(e);
                        }
                    }

                    case 14 -> {
                        System.out.println("Enter employee name :: ");
                        int counter = 0;
                        String empName = sc.next();

                        Iterator<Employee> itr = employeeSet.iterator();
                        while (itr.hasNext()) {
                            Employee emp = itr.next();
                            if (emp.getName().equals(empName)) {
                                itr.remove();
                                counter++;
                            }
                        }
                        if (counter == 0) {
                            System.out.println("Enter valid name!!!");
                        }
                    }

                    case 15 -> {
                        System.out.println("Enter Department name :: ");
                        int counter = 0;
                        String dept = sc.next();
                        Iterator<Employee> itr = employeeSet.iterator();
                        while (itr.hasNext()) {
                            Employee emp = itr.next();
                            if (emp.getDepartment().equals(dept)) {
                                itr.remove();
                                counter++;
                            }
                        }
                        if (counter == 0) {
                            System.out.println("Enter valid department name!!!");
                        }
                    }

                    case 16 -> {
                        System.out.println("Enter ID :: ");
                        int id = sc.nextInt();
                        employeeSet.removeIf(emp -> emp.getId().equals(id));
                        getEmployee(employeeSet);
                    }
                    case 0 -> {
                        exit = true;
                        System.out.println("*** Good Bye!!! ***");
                    }

                    default ->
                        throw new AssertionError();
                }
            }

        } catch (Exception e) {
        }
    }
}
