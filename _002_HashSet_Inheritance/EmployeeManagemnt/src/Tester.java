
import entity.Employee;
import entity.Manager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import static seeder.EmployeeSeeder.*;
import static utility.EmployeeUtility.*;

public class Tester {

    public static void main(String[] args) throws Exception {
        boolean exit = false;
        Set<Employee> empSet = new HashSet<>();
        try (Scanner sc = new Scanner(System.in)) {
            while (!exit) {
                System.out.println(
                        "1. Add Employees in Bulk\n"
                        + "2. Add Manager\n"
                        + "3. Add Developer\n"
                        + "4. Add Tester\n"
                        + "5. View All Employees\n"
                        + "6. View All Manger\n"
                        + "7. View All Developer\n"
                        + "8. View All Tester\n"
                        + "9. Sort by ID\n"
                        + "10. Sort by Name ASC\n"
                        + "11. Sort by Name DES\n"
                        + "12. Sort by Salary ASC\n"
                        + "13. Sort by Salary DES\n"
                        + "14. Sort by Department ASC\n"
                        + "15. Sort by Department DES\n"
                        + "16. Sort by Team size\n"
                        + "17. Search by ID\n"
                        + "18. Search by Name\n"
                        + "19. Remove by Name\n"
                        + "20. Remove by Department Name\n"
                        + "21. Remove by ID\n"
                        + "0. Exit"
                );
                int operation = sc.nextInt();
                switch (operation) {
                    case 1 -> {
                        empSet = populatedEmployee();
                        System.out.println("***** Employees Added *****");
                    }

                    case 2 -> {
                        empSet.add(populateManager());
                        System.out.println("***** Manger Added *****");
                    }
                    case 3 -> {
                        empSet.add(populateDeveloper());
                        System.out.println("***** Developer Added *****");
                    }

                    case 4 -> {
                        empSet.add(populateTester());
                        System.out.println("***** Tester Added *****");
                    }

                    case 5 -> {
                        System.out.println("***** All Employees *****");
                        getAllEmployee(empSet);
                    }

                    case 6 -> {
                        System.out.println("***** All Manager *****");
                        getAllManager(empSet);
                    }

                    case 7 -> {
                        System.out.println("***** All Developer *****");
                        getAllDeveloper(empSet);
                    }

                    case 8 -> {
                        System.out.println("***** All Tester *****");
                        getAllTester(empSet);
                    }

                    case 9 -> {
                        List<Employee> empList = new ArrayList<>(empSet);
                        Collections.sort(empList);
                        getAllEmployeeList(empList);
                    }

                    case 10 -> {
                        List<Employee> empList = new ArrayList<>(empSet);
                        Collections.sort(empList, (e1, e2) -> e1.getName().compareTo(e2.getName()));
                        getAllEmployeeList(empList);
                    }

                    case 11 -> {
                        List<Employee> empList = new ArrayList<>(empSet);
                        empList.sort(Comparator.comparing(Employee::getName).reversed());
                        getAllEmployeeList(empList);
                    }

                    case 12 -> {
                        List<Employee> empList = new ArrayList<>(empSet);
                        empList.sort(Comparator.comparing(Employee::getSalary));
                        getAllEmployeeList(empList);
                    }

                    case 13 -> {
                        List<Employee> empList = new ArrayList<>(empSet);
                        empList.sort(Comparator.comparing(Employee::getSalary).reversed());
                        getAllEmployeeList(empList);
                    }

                    case 14 -> {
                        List<Employee> empList = new ArrayList<>(empSet);
                        empList.sort(Comparator.comparing(Employee::getDepartment));
                        getAllEmployeeList(empList);
                    }

                    case 15 -> {
                        List<Employee> empList = new ArrayList<>(empSet);
                        empList.sort(Comparator.comparing(Employee::getDepartment).reversed());
                        getAllEmployeeList(empList);
                    }

                    case 16 -> {
                        List<Manager> mgrList = new ArrayList<>();

                        for (Employee e : empSet) {
                            if (e instanceof Manager) {
                                mgrList.add((Manager) e);
                            }
                        }
                        Collections.sort(mgrList, (e1, e2) -> e1.getTeamSize() - e2.getTeamSize());
                        for (Employee e : mgrList) {
                            System.out.println(e);
                        }
                    }

                    case 17 -> {
                        System.out.println("Enter ID :: ");
                        int searchId = sc.nextInt();
                        searchById(empSet, searchId);
                    }
                    case 18 -> {
                        System.out.println("Enter name :: ");
                        String target = sc.next();
                        searchByName(empSet, target);
                    }

                    case 19 -> {
                        System.out.println("Enter name :: ");
                        String target = sc.next();
                        empSet.removeIf(e1 -> e1.getName().equals(target));
                    }

                    case 20 -> {
                        System.out.println("Enter Department :: ");
                        String target = sc.next();
                        empSet.removeIf(e -> e.getDepartment().equals(target));
                    }

                    case 21 -> {
                        System.out.println("Enter ID :: ");
                        int target = sc.nextInt();
                        empSet.removeIf(e -> e.getId() == target);
                    }

                    case 0 -> {
                        exit = true;
                        System.out.println("***** Good bye!!! *****");
                    }

                    default ->
                        throw new AssertionError();
                }
            }
        } catch (Exception e) {
            System.err.println("Catch :: " + e);
        }

    }
}
