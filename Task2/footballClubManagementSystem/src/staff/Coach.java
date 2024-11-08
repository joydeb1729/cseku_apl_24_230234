package staff;
import interfaces.SalaryManageable;

public class Coach implements SalaryManageable {
    /*
     The staff.Coach class represents a coach, detailing their name, experience, preferred strategy, and salary.
     This class implements SalaryManageable, so salary increments can be applied based on performance or experience level.
    */

    private String name;
    private int experience;
    private String strategy;
    private double salary;

    public Coach(String name, int experience, String strategy, double salary) {
        this.name = name;
        this.experience = experience;
        this.strategy = strategy;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public String getStrategy() {
        return strategy;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void changeStrategy(String newStrategy) {
        this.strategy = newStrategy;
    }

    @Override
    public void increaseSalary(double percentage) {
        if (percentage < 0) {
            throw new IllegalArgumentException("Percentage cannot be negative.");
        }
        this.salary += this.salary * (percentage / 100);
    }
}
