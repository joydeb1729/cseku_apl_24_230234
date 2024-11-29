package view;

import model.club.Club;
import model.team.Team;
import model.player.Player;
import model.staff.Coach;
import model.staff.Staff;

/**
 * ================================================================
 * View: ClubView.java
 * ================================================================
 * The 'ClubView' class is responsible for displaying information
 * related to the football club, its teams, players, and staff.
 *
 * This class contains methods to output the data in a human-readable
 * format (via the console in this case). The view interacts with the
 * controller to retrieve the latest data from the model and present it
 * to the user.
 *
 * Methods:
 * - displayClubInfo: Displays general club information (name, founded year, achievements, etc.)
 * - displayTeamInfo: Displays information about the teams and players.
 * - displayStaffInfo: Displays information about coaching staff (i.e., the coach).
 * ================================================================
 */
public class ClubView {

    public void displayClubInfo(Club club) {
        System.out.println("Football Club: " + club.getName());
        System.out.println("Founded Year: " + club.getFoundedYear());
        System.out.println("Achievements: " + club.getAchievements());
        System.out.println("Stadium: " + club.getStadium().getName() + ", Capacity: " + club.getStadium().getCapacity());
        System.out.println("Sponsor: " + club.getSponsor().getName() + ", Contribution: " + club.getSponsor().getContribution());
    }

    public void displayTeamInfo(Club club) {
        for (Team team : club.getTeams()) {
            System.out.println("Team: " + team.getName());
            for (Player player : team.getPlayers()) {
                System.out.println("Player: " + player.getName() + ", Position: " + player.getPosition());
            }
        }
    }

    public void displayStaffInfo(Club club) {
        for (Staff staff : club.getStaffMembers()) {
            if (staff instanceof Coach) {
                Coach coachStaff = (Coach) staff;
                System.out.println("Coach: " + coachStaff.getName() + ", Expertise: " + coachStaff.getStrategyExpertise() + ", Training Hours: " + coachStaff.getTrainingHours());
            }
        }
    }
}
