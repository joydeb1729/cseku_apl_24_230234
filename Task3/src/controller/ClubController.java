package controller;

import model.club.Club;
import view.ClubView;

/**
 * ================================================================
 * Controller: ClubController.java
 * ================================================================
 * The 'ClubController' class is responsible for managing the interaction
 * between the 'Club' model and the 'ClubView'. It updates the view based
 * on data from the model and handles user commands for modifying the club.
 * ================================================================
 */
public class ClubController {
    private Club model;
    private ClubView view;

    public ClubController(Club model, ClubView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayClubDetails(model);
    }
}
