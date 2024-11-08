package club;

import team.Team;
import player.Player;
import stadium.Stadium;
import staff.*;
import sponsor.Sponsor;

import java.util.ArrayList;
import java.util.List;

public class Club {
    /*
     The club.Club class encapsulates the essential components of a football club, including its name, stadium, teams,
     staff, sponsors, location, and financial balance.
     It includes methods for managing teams, adding revenue, and paying out salaries, supporting the club's financial
     and operational dynamics.
     The balance reflects the club's financial position, while lists of teams, staff, and sponsors maintain a roster of
     associated entities.
     */
    private String name;
    private Stadium stadium;
    private List<Team> teams;
    private List<Staff> staffs;
    private List<Sponsor> sponsors;
    private String location;
    private double balance;

    public Club(String name, Stadium stadium, String location) {
        this.name = name;
        this.stadium = stadium;
        this.location = location;
        this.teams = new ArrayList<>();
        this.staffs = new ArrayList<>();
        this.sponsors = new ArrayList<>();
        this.balance = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getBalance() {
        return balance;
    }

    public void addTeam(Team team) {
        if (!teams.contains(team)) {
            teams.add(team);
        }
    }

    public void removeTeam(Team team) {
        if (teams.contains(team)) {
            teams.remove(team);
        }
    }

    public void addRevenue(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void paySalaries() {
        for (Team team : teams) {
            for (Player p : team.getPlayerList()) {
                balance -= p.getSalary();
            }
            if (team.getCoach() != null) {
                balance -= team.getCoach().getSalary();
            }
        }
        for (Staff staff : staffs) {
            balance -= staff.getSalary();
        }
    }
}
