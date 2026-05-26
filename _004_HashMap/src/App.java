
import entity.*;
import java.util.*;
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
                        + "10. Sort by Name by Stream\n"
                        + "11. Sort by Name by Traditional\n"
                        + "12. Sort by Salary Stream\n"
                        + "13. Sort by Salary Traditional\n"
                        + "14. Sort by Department Stream\n"
                        + "15. Sort by Department Traditional\n"
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
                        Map<Integer, Employee> sortedMap = empMap.entrySet()
                                .stream()
                                .sorted(Comparator.comparing(entry -> entry.getValue().getName()))
                                .collect(Collectors.toMap(
                                        Map.Entry::getKey, Map.Entry::getValue,
                                        (o1, o2) -> o1,
                                        LinkedHashMap::new
                                ));

                        sortedMap.forEach((k, v) -> System.out.println(v));
                    }

                    case 11 -> {
                        System.out.println("***** Sorted by Name *****");
                        List<Map.Entry<Integer, Employee>> empList = new LinkedList<>(empMap.entrySet());
                        Collections.sort(empList, (o1, o2) -> {
                            return o1.getValue().getName().compareTo(o2.getValue().getName());
                        });

                        Map<Integer, Employee> sortedMapEmp = new LinkedHashMap<>();
                        for (Map.Entry<Integer, Employee> entry : empList) {
                            sortedMapEmp.put(entry.getKey(), entry.getValue());
                        }

                        sortedMapEmp.forEach((k, v) -> {
                            System.out.println(v);
                        });
                    }

                    case 12 -> {
                        System.out.println("***** Sorted by Salary *****");
                        empMap.entrySet()
                                .stream()
                                .sorted(Comparator.comparing((Map.Entry< Integer, Employee> entry) -> entry.getValue().getSalary()).reversed())
                                .forEach(entry -> System.out.println(entry.getValue()));
                    }

                    case 13 -> {
                        System.out.println("***** Sorted by Salary *****");
                        List<Map.Entry<Integer, Employee>> empList = new LinkedList<>(empMap.entrySet());
                        empList.sort(Comparator.comparing(entry -> entry.getValue().getSalary()));

                        Map<Integer, Employee> sortedMap = new LinkedHashMap<>();
                        for (Map.Entry<Integer, Employee> entry : empList) {
                            sortedMap.put(entry.getKey(), entry.getValue());
                        }

                        sortedMap.forEach((k, v) -> System.out.println(v));
                    }

                    case 14 -> {
                        System.out.println("***** Sorted by Department *****");
                        empMap.entrySet()
                                .stream()
                                .sorted(Comparator.comparing((Map.Entry<Integer, Employee> entry) -> entry.getValue().getDepartment()).reversed())
                                .forEach(entry -> System.out.println(entry.getValue()));
                    }

                    case 15 -> {
                        System.out.println("***** Sorted by Department *****");
                        List<Map.Entry<Integer, Employee>> empList = new LinkedList<>(empMap.entrySet());
                        empList.sort(Comparator.comparing((Map.Entry<Integer, Employee> entry) -> entry.getValue().getDepartment()).reversed());

                        Map<Integer, Employee> sortedMap = new LinkedHashMap<>();
                        for (Map.Entry<Integer, Employee> entry : empList) {
                            sortedMap.put(entry.getKey(), entry.getValue());
                        }

                        sortedMap.forEach((k, v) -> System.out.println(v));
                    }

                    case 16 -> {
                        System.out.println("***** Sort by Team size *****");

                    }

                    case 17 -> {
                        System.out.println("***** Search by ID *****");
                        System.out.println("Enter Id :: ");
                        int id = sc.nextInt();

                        System.out.println(empMap.get(id));
                    }

                    case 18 -> {
                        System.out.println("***** Search by Name *****");
                        System.out.println("Enter Name :: ");

                        String name = sc.next();
                        empMap.forEach((k, v) -> {
                            if (v.getName().equals(name)) {
                                System.out.println(v);
                            }
                        });
                    }

                    case 19 -> {
                        System.out.println("***** Remove by Name *****");
                        System.out.println("Enter Name :: ");

                        String name = sc.next();
                        empMap.entrySet().removeIf(entry -> entry.getValue().getName().equals(name));

                        empMap.forEach((k, v) -> System.out.println(v));
                    }

                    case 20 -> {
                        System.out.println("Enter department :: ");

                        String department = sc.next();
                        System.out.println("***** Remove by Department Name *****");
                        empMap.entrySet().removeIf(entry -> entry.getValue().getDepartment().equals(department));

                        empMap.forEach((k, v) -> System.out.println(v));
                    }

                    case 21 -> {
                        System.out.println("***** Remove by ID *****");
                        System.out.println("Enter Id :: ");
                        int id = sc.nextInt();
                        empMap.remove(id);

                        empMap.forEach((k, v) -> System.out.println(v));
                    }

                    default ->
                        throw new AssertionError();
                }
            }
        } catch (Exception e) {
            System.out.println("error : " + e);
        }
    }
}
