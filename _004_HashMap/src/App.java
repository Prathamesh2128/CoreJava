
import entity.Developer;
import entity.Employee;
import entity.Manager;
import entity.Tester;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static seeder.EmployeeSeeder.*;

public class App {

    public static void main(String[] args) throws Exception {
        Map<Integer, Employee> empMap = new HashMap<>();
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
                        empMap = populateEmployee();
                        System.out.println("***** Employee added *****");
                    }

                    case 2 -> {
                        empMap.put(125, populateManager());
                    }

                    case 3 -> {
                        empMap.put(211, populateDeveloper());
                    }

                    case 4 -> {
                        empMap.put(310, populateTester());
                    }

                    case 5 -> {
                        empMap.forEach((k, v) -> {
                            System.out.println(v);
                        });
                    }

                    case 6 -> {
                        System.out.println("***** All Manager *****");
                        empMap.forEach((k, v) -> {
                            if (v instanceof Manager) {
                                System.out.println(v);
                            }
                        });
                    }

                    case 7 -> {
                        System.out.println("***** All Developer *****");
                        empMap.forEach((k, v) -> {
                            if (v instanceof Developer) {
                                System.out.println(v);
                            }
                        });
                    }

                    case 8 -> {
                        System.out.println("***** All Tester *****");
                        empMap.forEach((k, v) -> {
                            if (v instanceof Tester) {
                                System.out.println(v);
                            }
                        });
                    }

                    case 9 -> {
                        System.out.println("***** Sorted by ID *****");
                        Map<Integer, Employee> empTreeMap = new TreeMap<>(empMap);
                        empTreeMap.forEach((k, v) -> {
                            System.out.println(v);
                        });
                    }

                    case 10 -> {
                        System.out.println("***** Sorted by Name *****");

                        LinkedHashMap<Integer, String> sorted
                                = empMap.entrySet()
                                        .stream()
                                        .sorted(Map.Entry.comparingByValue())
                                        .collect(Collectors.toMap(
                                                Map.Entry::getKey,
                                                Map.Entry::getValue,
                                                (e1, e2) -> e1,
                                                LinkedHashMap::new
                                        ));
                    }

                    default ->
                        throw new AssertionError();
                }
            }
        } catch (Exception e) {
        }
    }
}
