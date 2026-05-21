package com.app.enity;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private Integer id;
    private String name;
    private double salary;
    private String department;
    private String contactNo;

    public Employee(Integer id, String name, double salary, String department, String contactNo) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.contactNo = contactNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", salary=").append(salary);
        sb.append(", department=").append(department);
        sb.append(", contactNo=").append(contactNo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        return Objects.equals(this.id, other.id) || Objects.equals(this.name, other.name);
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}
