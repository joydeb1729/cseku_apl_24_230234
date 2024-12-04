package view;

/**
 * ================================================================
 * View: PlayerView.java
 * ================================================================
 * The 'PlayerView' class is responsible for displaying details
 * about football players, including their name, age, and position.
 * ================================================================
 */
public class PlayerView {
    public void displayPlayerDetails(String name, int age, String position) {
        System.out.println("Player Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
    }
}
