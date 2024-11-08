package player;

public class JuniorPlayer extends Player {
    /*
     The player.JuniorPlayer class extends player.Player to include additional attributes specific to junior players, such as
     school affiliation and scholarship status.
     This subclass caters to the unique management of young talents who might be on scholarship or affiliated
     with a school, supporting recruitment and development needs.
     */
    private String schoolName;
    private boolean isOnScholarship;

    public JuniorPlayer(String name, int age, String position, double salary, String gender, int experienceYears, String schoolName, boolean isOnScholarship) {
        super(name, age, position, salary, gender, experienceYears);
        this.schoolName = schoolName;
        this.isOnScholarship = isOnScholarship;
    }

    public String getSchoolName() { return schoolName; }
    public boolean isOnScholarship() { return isOnScholarship; }

    public void setSchoolName(String schoolName) { this.schoolName = schoolName; }
    public void setOnScholarship(boolean onScholarship) { isOnScholarship = onScholarship; }

    @Override
    public String toString() {
        return "JuniorPlayer{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", position='" + getPosition() + '\'' +
                ", salary=" + getSalary() +
                ", gender='" + getGender() + '\'' +
                ", experienceYears=" + getExperienceYears() +
                ", schoolName='" + schoolName + '\'' +
                ", isOnScholarship=" + isOnScholarship +
                '}';
    }
}
