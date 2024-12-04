package controller;

import model.player.Player;
import view.PlayerView;

/**
 * ================================================================
 * Controller: PlayerController.java
 * ================================================================
 * The 'PlayerController' class manages the interaction between the
 * 'Player' model and the 'PlayerView'. It updates the view based on
 * player information and handles updates to the player's data.
 * ================================================================
 */
public class PlayerController {
    private Player model;
    private PlayerView view;

    public PlayerController(Player model, PlayerView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayPlayerDetails(model.getName(), model.getAge(), model.getPosition());
    }
}
