package staff;
import interfaces.SalaryManageable;

public class Staff implements SalaryManageable {
    /*
      The staff.Staff class provides an encapsulation of club staff members, storing their name, salary, and role within the club.
      The class enables salary adjustments for staff through the SalaryManageable interface.
     */
    private String name;
    private double salary;
    private String role;

    public Staff(String name, double salary, String role) {
        this.name = name;
        this.salary = salary;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void increaseSalary(double percentage) {
        if (percentage < 0) {
            throw new IllegalArgumentException("Percentage cannot be negative.");
        }
        this.salary += this.salary * (percentage / 100);
    }
}
