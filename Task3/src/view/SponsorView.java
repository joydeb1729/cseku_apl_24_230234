package view;

/**
 * ================================================================
 * View: SponsorView.java
 * ================================================================
 * The 'SponsorView' class is responsible for displaying information
 * about the sponsor, including their name and contribution amount.
 * ================================================================
 */
public class SponsorView {
    public void displaySponsorDetails(String name, double contribution) {
        System.out.println("Sponsor Name: " + name);
        System.out.println("Financial Contribution: $" + contribution);
    }
}
