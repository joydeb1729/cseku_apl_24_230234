package view;

/**
 * ================================================================
 * View: JuniorPlayerView.java
 * ================================================================
 * The 'JuniorPlayerView' class is responsible for displaying information
 * about junior players, including their name, age, and position.
 * ================================================================
 */
public class JuniorPlayerView {
    public void displayJuniorPlayerDetails(String name, int age, String position) {
        System.out.println("Junior Player Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
    }
}
