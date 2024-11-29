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

    // Constructor
    public JuniorPlayer(String name, int age, String position, String trainingLevel) {
        super(name, age, position);
        this.trainingLevel = trainingLevel;
    }

    // Getter and Setter
    public String getTrainingLevel() { return trainingLevel; }
}
