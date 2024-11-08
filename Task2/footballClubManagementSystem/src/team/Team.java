package team;
import player.Player;
import staff.Coach;

import java.util.ArrayList;
import java.util.List;

public class Team {
    /*
     The team.Team class represents a football team within the club, containing information about its name, players, coach, formation,
     and match records (wins, losses, matches played).
     The class offers methods for adding or removing players, recording match results, and tracking overall team performance.
     */
    private String name;
    private List<Player> playerList;
    private Coach coach;
    private String formation;
    private int matchesPlayed;
    private String kit;
    private int wins;
    private int losses;

    public Team(String name, Coach coach, String formation, String kit) {
        this.name = name;
        this.playerList = new ArrayList<>();
        this.coach = coach;
        this.formation = formation;
        this.kit = kit;
        this.matchesPlayed = 0;
        this.wins = 0;
        this.losses = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public String getKit() {
        return kit;
    }

    public void setKit(String kit) {
        this.kit = kit;
    }

    public void addPlayer(Player player) {
        if (!playerList.contains(player)) {
            playerList.add(player);
        }
    }

    public void removePlayer(Player player) {
        if (playerList.contains(player)) {
            playerList.remove(player);
        }
    }

    public void recordMatchResult(boolean win) {
        matchesPlayed++;
        if (win) {
            wins++;
        } else {
            losses++;
        }
    }

    public String getTeamPerformance() {
        return String.format("Team: %s, Wins: %d, Losses: %d, Matches Played: %d",
                name, wins, losses, matchesPlayed);
    }
}
