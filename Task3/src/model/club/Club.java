package model.club;

import model.team.Team;
import model.staff.Staff;
import model.sponsor.Sponsor;
import model.stadium.Stadium;

import java.util.List;

/**
 * ================================================================
 * Model: Club.java
 * ================================================================
 * The 'Club' class represents the data structure for a football club.
 * It includes the name, founding year, achievements, teams, staff members,
 * stadium, and sponsor related to the club.
 *
 * Methods in this class include constructors to initialize the club,
 * getters and setters for retrieving and updating the data, and logic related
 * to club information.
 * ================================================================
 */
public class Club {
    private String name;
    private int foundedYear;
    private List<String> achievements;
    private List<Team> teams;
    private List<Staff> staffMembers;
    private Stadium stadium;
    private Sponsor sponsor;


    public Club(String name, int foundedYear, List<String> achievements, List<Team> teams,
                List<Staff> staffMembers, Stadium stadium, Sponsor sponsor) {
        this.name = name;
        this.foundedYear = foundedYear;
        this.achievements = achievements;
        this.teams = teams;
        this.staffMembers = staffMembers;
        this.stadium = stadium;
        this.sponsor = sponsor;
    }

    public String getName() { return name; }
    public int getFoundedYear() { return foundedYear; }
    public List<String> getAchievements() { return achievements; }
    public List<Team> getTeams() { return teams; }
    public List<Staff> getStaffMembers() { return staffMembers; }
    public Stadium getStadium() { return stadium; }
    public Sponsor getSponsor() { return sponsor; }
}
