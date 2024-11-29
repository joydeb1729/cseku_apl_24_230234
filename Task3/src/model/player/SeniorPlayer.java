package model.player;

/**
 * ================================================================
 * Model: SeniorPlayer.java
 * ================================================================
 * The 'SeniorPlayer' class represents a senior football player.
 * It extends the Player class and includes attributes specific to senior players
 * such as salary and injury status.
 * ================================================================
 */
public class SeniorPlayer extends Player {
    private int yearsOfExperience;
    private double salary;
    private boolean isInjured;

    public SeniorPlayer(String name, int age, String position, int yearsOfExperience, double salary) {
        super(name, age, position);
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
        this.isInjured = false;
    }

    public int getYearsOfExperience() { return yearsOfExperience; }
    public double getSalary() { return salary; }
    public boolean isInjured() { return isInjured; }
    public void setInjured(boolean injured) { this.isInjured = injured; }

    public double calculateSalary() {
        return this.salary + (this.yearsOfExperience * 1000);
    }
}
