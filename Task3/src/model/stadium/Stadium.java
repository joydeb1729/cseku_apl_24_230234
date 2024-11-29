package model.stadium;

/**
 * ================================================================
 * Model: Stadium.java
 * ================================================================
 * The 'Stadium' class represents a football stadium. It includes details
 * such as the stadium's name, location, and seating capacity.
 * ================================================================
 */
public class Stadium {
    private String name;
    private String location;
    private int capacity;

    // Constructor
    public Stadium(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }

    // Getters
    public String getName() { return name; }
    public String getLocation() { return location; }
    public int getCapacity() { return capacity; }
}
