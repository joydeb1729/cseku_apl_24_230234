package controller;

import model.club.Club;
import model.team.Team;
import model.player.JuniorPlayer;
import model.player.SeniorPlayer;
import model.staff.Coach;
import model.staff.Staff;
import model.stadium.Stadium;
import model.sponsor.Sponsor;
import view.ClubView;

import java.util.ArrayList;
import java.util.List;

/**
 * ================================================================
 * Controller: ClubController.java
 * ================================================================
 * The 'ClubController' class is the middleman between the view and the model. 
 * It retrieves data from the model and updates the view accordingly.
 *
 * The controller contains methods to initialize the club with data and 
 * update the view with the latest club information.
 *
 * Methods:
 * - initializeClubData: Initializes the model with data (players, teams, stadium, etc.).
 * - updateView: Passes the model data to the view to display the club's information.
 * ================================================================
 */
public class ClubController {
    
    private Club model;
    private ClubView view;


    public ClubController(Club model, ClubView view) {
        this.model = model;
        this.view = view;
    }


    public void initializeClubData() {
        // Creating Junior Players
        JuniorPlayer juniorPlayer1 = new JuniorPlayer("John Doe", 17, "Forward", "Basic Training");
        JuniorPlayer juniorPlayer2 = new JuniorPlayer("Alice Smith", 18, "Midfielder", "Intermediate Training");

        // Creating Senior Players
        SeniorPlayer seniorPlayer1 = new SeniorPlayer("James Bond", 29, "Goalkeeper", 10, 50000);
        SeniorPlayer seniorPlayer2 = new SeniorPlayer("Emma Watson", 27, "Defender", 6, 45000);


        Team teamA = new Team("Junior Team");
        teamA.addPlayer(juniorPlayer1);
        teamA.addPlayer(juniorPlayer2);

        Team teamB = new Team("Senior Team");
        teamB.addPlayer(seniorPlayer1);
        teamB.addPlayer(seniorPlayer2);


        Stadium stadium = new Stadium("Old Trafford", "Stretford", 50000);


        Sponsor sponsor = new Sponsor("Nike", 1000000);


        Staff coach = new Coach("Erik Ten Hag", "Coach", "Offensive Strategy", 25);
        List<Staff> staffMembers = new ArrayList<>();
        staffMembers.add(coach);

        List<Team> teams = new ArrayList<>();
        teams.add(teamA);
        teams.add(teamB);

        List<String> achievements = new ArrayList<>();
        achievements.add("League Champion 2023");
        achievements.add("FA Cup Winner 2022");
        achievements.add("UCL Winner 2008");

        this.model = new Club("Manchester United", 1900, achievements, teams, staffMembers, stadium, sponsor);
    }

    public void updateView() {
        view.displayClubInfo(model);
        view.displayTeamInfo(model);
        view.displayStaffInfo(model);
    }
}
