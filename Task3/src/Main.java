import controller.ClubController;
import controller.JuniorPlayerController;
import controller.SeniorPlayerController;
import model.club.Club;
import model.player.SeniorPlayer;
import model.player.Player;
import model.player.JuniorPlayer;
import model.sponsor.Sponsor;
import model.staff.Coach;
import model.staff.Staff;
import model.stadium.Stadium;
import model.team.Team;
import view.ClubView;
import view.JuniorPlayerView;
import view.SeniorPlayerView;

import java.util.ArrayList;
import java.util.List;

/**
 * ================================================================
 * Main: Main.java
 * ================================================================
 * The 'Main' class serves as the entry point for the Football Club
 * Management System. It demonstrates how models, views, and controllers
 * interact in the system to display and manipulate data.
 * ================================================================
 */
public class Main {
    public static void main(String[] args) {
        // Stadium Name
        Stadium stadium = new Stadium("Khulna Stadium", "Circuit House", 50000);

        // Sponsor Details
        Sponsor sponsor = new Sponsor("Banglalink", 1000000);


        Team seniorTeam = new Team("Senior Team");
        Team juniorTeam = new Team("Junior Team");

        SeniorPlayer seniorPlayer1 = new SeniorPlayer("Rahul", 21, "Forward", 5, 25000);
        SeniorPlayer seniorPlayer2 = new SeniorPlayer("Durjay", 22, "Midfielder", 4, 30000);
        JuniorPlayer juniorPlayer1 = new JuniorPlayer("Karim", 14, "Defender");
        JuniorPlayer juniorPlayer2 = new JuniorPlayer("Rahim", 13, "Goalkeeper");

        seniorTeam.addPlayer(seniorPlayer1);
        seniorTeam.addPlayer(seniorPlayer2);
        juniorTeam.addPlayer(juniorPlayer1);
        juniorTeam.addPlayer(juniorPlayer2);

        // Coach details
        Coach coach = new Coach("Ancelotti", "Coach", "Offensive", 8);
        Coach assistantCoach = new Coach("Xabi", "Assistant Coach", "Attacking", 3);

        List<Staff> staffMembers = new ArrayList<>();
        staffMembers.add(coach);
        staffMembers.add(assistantCoach);

        // Club Details
        List<Team> teams = new ArrayList<>();
        teams.add(seniorTeam);
        teams.add(juniorTeam);

        List<String> achievements = new ArrayList<>();
        achievements.add("League Champions 2023");
        achievements.add("Regional Cup Winners 2022");

        Club club = new Club("Champions FC", 1990, achievements, teams, staffMembers, stadium, sponsor);

        //Club Details
        ClubView clubView = new ClubView();
        ClubController clubController = new ClubController(club, clubView);
        clubController.updateView();
        System.out.println();

        SeniorPlayerView seniorPlayerView = new SeniorPlayerView();
        JuniorPlayerView juniorPlayerView = new JuniorPlayerView();

        // Player Controllers
        SeniorPlayerController seniorPlayerController1 = new SeniorPlayerController(seniorPlayer1, seniorPlayerView);
        SeniorPlayerController seniorPlayerController2 = new SeniorPlayerController(seniorPlayer2, seniorPlayerView);
        JuniorPlayerController juniorPlayerController1 = new JuniorPlayerController(juniorPlayer1, juniorPlayerView);
        JuniorPlayerController juniorPlayerController2 = new JuniorPlayerController(juniorPlayer2, juniorPlayerView);

        // Player Details
        seniorPlayerController1.updateView();
        seniorPlayerController2.updateView();
        System.out.println();

        juniorPlayerController1.updateView();
        juniorPlayerController2.updateView();

    }
}
