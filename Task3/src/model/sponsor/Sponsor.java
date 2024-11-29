package model.sponsor;

/**
 * ================================================================
 * Model: Sponsor.java
 * ================================================================
 * The 'Sponsor' class represents a sponsor for the football club.
 * It contains details such as the sponsor's name and financial contribution to the club.
 * ================================================================
 */
public class Sponsor {
    private String name;
    private double contribution;

    public Sponsor(String name, double contribution) {
        this.name = name;
        this.contribution = contribution;
    }

    public String getName() { return name; }
    public double getContribution() { return contribution; }
}
