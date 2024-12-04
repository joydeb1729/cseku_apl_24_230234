package controller;

import model.player.SeniorPlayer;
import view.SeniorPlayerView;

/**
 * ================================================================
 * Controller: SeniorPlayerController.java
 * ================================================================
 * The 'SeniorPlayerController' class manages the interaction between the
 * 'SeniorPlayer' model and the 'SeniorPlayerView'. It updates the view with
 * senior player details and handles commands for modifying the senior player's data.
 * ================================================================
 */
public class SeniorPlayerController {
    private SeniorPlayer model;
    private SeniorPlayerView view;

    public SeniorPlayerController(SeniorPlayer model, SeniorPlayerView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displaySeniorPlayerDetails(model.getName(), model.getAge(), model.getPosition(),
                                        model.getYearsOfExperience(), model.getSalary(), model.isInjured());
    }

    public void setInjuryStatus(boolean isInjured) {
        model.setInjured(isInjured);
    }
}
