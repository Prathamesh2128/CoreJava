package entity;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer() {
    }

    public Developer(int id, String name, String contactNo, double salary, String department,
            String programmingLanguage) {
        super(id, name, contactNo, salary, department);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Developer [" + super.toString() + ", programmingLanguage =" + programmingLanguage + "]";
    }


}
