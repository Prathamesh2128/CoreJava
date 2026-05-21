package entity;

public abstract class Employee extends Person implements Comparable<Employee> {

    private double salary;
    private String department;

    public Employee() {
    }

    public Employee(int id, String name, String contactNo, double salary, String department) {
        super(id, name, contactNo);
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [" + super.toString() + ", salary=" + salary + ", department=" + department + "]";
    }

    @Override
    public int compareTo(Employee o) {
        return this.getId() - o.getId();
    }

}
