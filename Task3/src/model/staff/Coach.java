package model.staff;

/**
 * ================================================================
 * Model: Coach.java
 * ================================================================
 * The 'Coach' class extends the Staff class and represents a football coach.
 * It adds additional attributes such as strategy expertise and training hours.
 * ================================================================
 */
public class Coach extends Staff {
    private String strategyExpertise;
    private int trainingHours;

    public Coach(String name, String role, String strategyExpertise, int trainingHours) {
        super(name, role);
        this.strategyExpertise = strategyExpertise;
        this.trainingHours = trainingHours;
    }

    public String getStrategyExpertise() { return strategyExpertise; }
    public int getTrainingHours() { return trainingHours; }
}
