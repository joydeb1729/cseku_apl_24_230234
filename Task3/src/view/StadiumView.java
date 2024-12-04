package view;

/**
 * ================================================================
 * View: StadiumView.java
 * ================================================================
 * The 'StadiumView' class is responsible for presenting details
 * about the stadium, including its name, location, and capacity.
 * ================================================================
 */
public class StadiumView {
    public void displayStadiumDetails(String name, String location, int capacity) {
        System.out.println("Stadium Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity + " seats");
    }
}
