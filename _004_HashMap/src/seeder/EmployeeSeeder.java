package seeder;

import entity.Developer;
import entity.Employee;
import entity.Manager;
import entity.Tester;
import java.util.HashMap;
import java.util.Map;

public class EmployeeSeeder {

    public static Map<Integer, Employee> populateEmployee() {
        Map<Integer, Employee> empMap = new HashMap<>();
        empMap.put(90, new Manager(
                14,
                90,
                "Ritesh",
                "9874501236",
                950000.00,
                "Operations"
        ));

        empMap.put(91, new Manager(
                15,
                91,
                "Vaibhav",
                "9812345678",
                1050000.50,
                "Infrastructure"
        ));

        empMap.put(70, new Manager(
                16,
                70,
                "Deepak",
                "9900112233",
                870000.75,
                "Support"
        ));

        empMap.put(140, new Manager(
                17,
                140,
                "Nikhil",
                "9988771122",
                1300000.00,
                "Delivery"
        ));

        empMap.put(95, new Manager(
                18,
                95,
                "Sanjay",
                "9090901111",
                910000.25,
                "Administration"
        ));

        // Developers
        empMap.put(201, new Developer(
                201,
                "Priya",
                "9123456701",
                760000.45,
                "Frontend",
                "React"
        ));

        empMap.put(202, new Developer(
                202,
                "Kunal",
                "9123456702",
                830000.90,
                "Backend",
                "NodeJS"
        ));

        empMap.put(203, new Developer(
                203,
                "Tanvi",
                "9123456703",
                920000.15,
                "Cloud",
                "Azure"
        ));

        empMap.put(204, new Developer(
                204,
                "Harsh",
                "9123456704",
                680000.60,
                "Software",
                "Python"
        ));

        empMap.put(205, new Developer(
                205,
                "Mihir",
                "9123456705",
                990000.80,
                "RnD",
                "Java"
        ));

        // Testers
        empMap.put(301, new Tester(
                301,
                "Komal",
                "9988001101",
                540000.35,
                "QA",
                "Automation"
        ));

        empMap.put(302, new Tester(
                302,
                "Arjun",
                "9988001102",
                620000.90,
                "Testing",
                "Manual"
        ));

        empMap.put(303, new Tester(
                303,
                "Bhavna",
                "9988001103",
                710000.55,
                "QA",
                "API Testing"
        ));

        empMap.put(304, new Tester(
                304,
                "Yash",
                "9988001104",
                580000.25,
                "Security",
                "Penetration Testing"
        ));

        empMap.put(305, new Tester(
                305,
                "Sakshi",
                "9988001105",
                690000.75,
                "Performance",
                "Load Testing"
        ));
        return empMap;
    }

    public static Employee populateManager() {
        return new Manager(
                19,
                125,
                "Aditya",
                "9876501234",
                1150000.00,
                "Project Management"
        );
    }

    public static Employee populateDeveloper() {
        return new Developer(
                211,
                "Pallavi",
                "9123400011",
                840000.75,
                "Backend",
                "Spring Boot"
        );
    }

    public static Employee populateTester() {
        return new Tester(
                310,
                "Tejas",
                "9988774400",
                610000.40,
                "QA",
                "Automation"
        );
    }

}
