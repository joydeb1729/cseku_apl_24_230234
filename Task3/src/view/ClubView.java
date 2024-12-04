package view;



import model.club.Club;
import model.sponsor.Sponsor;
import model.stadium.Stadium;
import model.staff.Staff;
import model.team.Team;

import java.util.List;

/**
 * ================================================================
 * View: ClubView.java
 * ================================================================
 * The 'ClubView' class is responsible for presenting information
 * about the football club to the user. It includes methods to display
 * club details, achievements, and related information in a user-friendly
 * format.
 * ================================================================
 */
public class ClubView {

    public void displayClubDetails(Club club) {
        System.out.println("Club Name: " + club.getName());
        System.out.println("Founded Year: " + club.getFoundedYear());
        System.out.println("Achievements: " + String.join(", ", club.getAchievements()));

        Stadium stadium = club.getStadium();
        System.out.println("Stadium: " + stadium.getName() + " - " + stadium.getLocation() +
                " (" + stadium.getCapacity() + " seats)");

        Sponsor sponsor = club.getSponsor();
        System.out.println("Sponsor: " + sponsor.getName() +
                " ($" + sponsor.getContribution() + ")");

        System.out.println("Teams:");
        List<Team> teams = club.getTeams();
        for (Team team : teams) {
            System.out.println("  - " + team.getName());
        }

        System.out.println("Staffs:");
        List<Staff> staffMembers = club.getStaffMembers();
        for (Staff staff : staffMembers) {
            System.out.println("  - Name: " + staff.getName() + ", Role: " + staff.getRole());
        }

        System.out.println();
    }
}
