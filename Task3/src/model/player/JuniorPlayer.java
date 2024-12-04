package model.player;

/**
 * ================================================================
 * Model: JuniorPlayer.java
 * ================================================================
 * The 'JuniorPlayer' class represents a junior football player.
 * It extends the Player class and adds additional attributes specific
 * to junior players (e.g., training level).
 * ================================================================
 */
public class JuniorPlayer extends Player {
    private String trainingLevel;

    public JuniorPlayer(String name, int age, String position) {
        super(name, age, position);
        this.trainingLevel = trainingLevel;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void setTrainingLevel(String trainingLevel) {
        this.trainingLevel = trainingLevel;
    }

    @Override
    public String getPosition() {
        return super.getPosition();
    }

    public String getTrainingLevel() { return trainingLevel; }
}
