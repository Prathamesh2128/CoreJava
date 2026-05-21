package entity;

public class Manager extends Employee {

    private int teamSize;

    public Manager() {
    }

    public Manager(int teamSize, int id, String name, String contactNo, double salary, String department) {
        super(id, name, contactNo, salary, department);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Manager [" + super.toString() + ", teamSize =" + teamSize + "]";
    }

}
