package view;

/**
 * ================================================================
 * View: CoachView.java
 * ================================================================
 * The 'CoachView' class displays information about coaches,
 * including their expertise and training hours.
 * ================================================================
 */
public class CoachView {
    public void displayCoachDetails(String name, String role, String strategyExpertise, int trainingHours) {
        System.out.println("Coach Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Strategy Expertise: " + strategyExpertise);
        System.out.println("Training Hours: " + trainingHours);
    }
}
