
import entity.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static seeder.EmployeeSeeder.*;
import static utility.EmployeeUtility.*;

public class App {

    public static void main(String[] args) throws Exception {
        List<Employee> empList = new ArrayList<>();
        boolean exit = false;

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
                        + "10. Sort by Name by Traditional\n"
                        + "11. Sort by Name by Stream\n"
                        + "12. Sort by Salary Traditional\n"
                        + "13. Sort by Salary Stream\n"
                        + "14. Sort by Department Traditional\n"
                        + "15. Sort by Department Stream\n"
                        + "16. Sort by Team size\n"
                        + "17. Search by ID\n"
                        + "18. Search by Name\n"
                        + "19. Remove by Name\n"
                        + "20. Remove by ID\n"
                        + "21. Edit name\n"
                        + "0. Exit"
                );
                int operation = sc.nextInt();

                switch (operation) {
                    case 1 -> {
                        empList = populateEmployee();
                    }

                    case 2 -> {
                        empList.add(populateManager());
                    }

                    case 3 -> {
                        empList.add(populateDeveloper());
                    }

                    case 4 -> {
                        empList.add(populateTester());
                    }

                    case 5 -> {
                        System.out.println("*** All Employees ***");
                        getAllEmployees(empList);
                    }

                    case 6 -> {
                        System.out.println("*** All Managers ***");
                        getAllManagers(empList);
                    }

                    case 7 -> {
                        System.out.println("*** All Developers ***");
                        getAllDevelopers(empList);
                    }

                    case 8 -> {
                        System.out.println("*** All Testers ***");
                        getAllTesters(empList);
                    }

                    case 9 -> {
                        sortById(empList);
                    }

                    case 10 -> {
                        sortByNameTraditional(empList);
                    }

                    case 11 -> {
                        sortByNameStream(empList);
                    }

                    case 12 -> {
                        sortBySalaryTraditional(empList);
                    }

                    case 13 -> {
                        sortBySalaryStream(empList);
                    }

                    case 14 -> {
                        sortByDepartmentTraditional(empList);
                    }

                    case 15 -> {
                        sortByDepartmentStream(empList);
                    }

                    case 16 -> {
                        System.out.println("*** Sort by Team size ***");
                    }

                    case 17 -> {
                        System.out.println("Enter Id :: ");
                        int target = sc.nextInt();
                        Employee emp = searchById(empList, target);
                        if (emp != null) {
                            System.out.println(emp);
                        } else {
                            System.out.println("Employee Id not found!!!");
                        }
                    }

                    case 18 -> {
                        System.out.println("Enter name :: ");
                        String target = sc.next();
                        searchByName(empList, target);
                    }

                    case 19 -> {
                        System.out.println("Enter name :: ");
                        String target = sc.next();
                        removeByName(empList, target);
                    }

                    case 20 -> {
                        System.out.println("Enter Id :: ");
                        int target = sc.nextInt();
                        removeById(empList, target);
                    }

                    case 21 -> {
                        int target = sc.nextInt();
                        Employee emp = searchById(empList, target);
                        if (emp != null) {
                            String name = sc.next();
                            updateEmployeeName(emp, name);
                        } else {
                            System.out.println("Employee Id not found!!!");
                        }
                    }

                    case 0 -> {
                        exit = true;
                        System.out.println("*** Good bye ***");
                    }
                    default ->
                        throw new AssertionError();
                }
            }
        }
    }
}
