package view;

/**
 * ================================================================
 * View: SeniorPlayerView.java
 * ================================================================
 * The 'SeniorPlayerView' class is responsible for displaying information
 * about senior players, including their name, age, position, years of experience,
 * salary, and injury status.
 * ================================================================
 */
public class SeniorPlayerView {
    public void displaySeniorPlayerDetails(String name, int age, String position, 
                                           int yearsOfExperience, double salary, boolean isInjured) {
        System.out.println("Senior Player Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Salary: $" + salary);
        System.out.println("Injury Status: " + (isInjured ? "Injured" : "Fit"));
    }
}
