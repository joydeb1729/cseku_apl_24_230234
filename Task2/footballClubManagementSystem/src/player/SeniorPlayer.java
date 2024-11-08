package player;

public class SeniorPlayer extends Player {
    /*
     The player.SeniorPlayer class, a subclass of player.Player, adds attributes for tracking leadership skills and bonus earnings,
     which are typical for senior or veteran players within the club.
     This class can calculate a performance-based bonus based on the player’s salary.
     */
    private int leadershipSkills;
    private double bonusPercentage;

    public SeniorPlayer(String name, int age, String position, double salary, String gender, int experienceYears, int leadershipSkills, double bonusPercentage) {
        super(name, age, position, salary, gender, experienceYears);
        this.leadershipSkills = leadershipSkills;
        this.bonusPercentage = bonusPercentage;
    }

    public int getLeadershipSkills() { return leadershipSkills; }
    public double getBonusPercentage() { return bonusPercentage; }

    public void setLeadershipSkills(int leadershipSkills) { this.leadershipSkills = leadershipSkills; }
    public void setBonusPercentage(double bonusPercentage) { this.bonusPercentage = bonusPercentage; }

    public double calculateBonus() {
        return (getSalary() * bonusPercentage) / 100;
    }

    @Override
    public String toString() {
        return "SeniorPlayer{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", position='" + getPosition() + '\'' +
                ", salary=" + getSalary() +
                ", gender='" + getGender() + '\'' +
                ", experienceYears=" + getExperienceYears() +
                ", leadershipSkills=" + leadershipSkills +
                ", bonusPercentage=" + bonusPercentage +
                '}';
    }
}
