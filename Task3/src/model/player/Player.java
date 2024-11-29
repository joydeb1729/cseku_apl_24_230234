package model.player;

/**
 * ================================================================
 * Model: Player.java
 * ================================================================
 * The 'Player' class is a base class representing a football player.
 * It contains common properties such as name, age, position, and specific
 * behavior for different player types (Junior or Senior).
 *
 * This is a base class; its subclasses will include JuniorPlayer and SeniorPlayer.
 * ================================================================
 */
public abstract class Player {
    private String name;
    private int age;
    private String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPosition() { return position; }
}
