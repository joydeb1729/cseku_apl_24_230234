package model.team;

import model.player.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * ================================================================
 * Model: Team.java
 * ================================================================
 * The 'Team' class represents a team within a football club. It contains
 * the name of the team and a list of players in that team.
 *
 * Methods in this class include adding players to the team and retrieving
 * team and player information.
 * ================================================================
 */
public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() { return name; }
    public List<Player> getPlayers() { return players; }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
