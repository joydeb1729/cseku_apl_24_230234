package model.staff;

/**
 * ================================================================
 * Model: Staff.java
 * ================================================================
 * The 'Staff' class represents a generic staff member (e.g., Coach, Assistant).
 * It contains the name and role of the staff member, along with a method to
 * retrieve staff information.
 * ================================================================
 */
public abstract class Staff {
    private String name;
    private String role;

    public Staff(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() { return name; }
    public String getRole() { return role; }
}
