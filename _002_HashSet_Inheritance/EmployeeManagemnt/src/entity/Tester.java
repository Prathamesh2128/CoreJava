package entity;

public class Tester extends Employee {

    private String testingType;

    public Tester() {
    }

    public Tester(int id, String name, String contactNo, double salary, String department, String testingType) {
        super(id, name, contactNo, salary, department);
        this.testingType = testingType;
    }

    public String getTestingType() {
        return testingType;
    }

    public void setTestingType(String testingType) {
        this.testingType = testingType;
    }

    @Override
    public String toString() {
        return "Tester [" + super.toString() + ", testingType =" + testingType + "]";
    }
}
