package player;

import interfaces.*;

public abstract class Player implements Injurable, SalaryManageable {
    /*
     The abstract player.Player class provides the structure for representing a football player, including
     personal attributes (name, age, position) and professional details (salary, experience).
     As an Injurable and SalaryManageable entity, it supports injury tracking and salary adjustments.
     This class serves as a base for both junior and senior players.
     */
    private String name;
    private int age;
    private String position;
    private double salary;
    private String gender;
    private boolean injured;

    private int experienceYears;

    public Player(String name, int age, String position, double salary, String gender, int experienceYears) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.gender = gender;
        this.experienceYears = experienceYears;
        this.injured = false;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPosition() { return position; }
    public double getSalary() { return salary; }
    public String getGender() { return gender; }
    public boolean isInjured() { return injured; }
    public int getExperienceYears() { return experienceYears; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setPosition(String position) { this.position = position; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setGender(String gender) { this.gender = gender; }
    public void setExperienceYears(int experienceYears) { this.experienceYears = experienceYears; }

    @Override
    public void injure() {
        this.injured = true;
    }

    @Override
    public void recover() {
        this.injured = false;
    }

    @Override
    public void increaseSalary(double percentage) {
        this.salary += this.salary * (percentage / 100);
    }
}
