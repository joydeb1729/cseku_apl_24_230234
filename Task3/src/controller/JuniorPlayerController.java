package controller;

import model.player.Player;
import view.JuniorPlayerView;

/**
 * ================================================================
 * Controller: JuniorPlayerController.java
 * ================================================================
 * The 'JuniorPlayerController' class manages the interaction between the
 * 'JuniorPlayer' model and the 'JuniorPlayerView'. It updates the view with
 * junior player details and handles commands for modifying the junior player's data.
 * ================================================================
 */
public class JuniorPlayerController {
    private Player model;
    private JuniorPlayerView view;

    public JuniorPlayerController(Player model, JuniorPlayerView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayJuniorPlayerDetails(model.getName(), model.getAge(), model.getPosition());
    }
}
