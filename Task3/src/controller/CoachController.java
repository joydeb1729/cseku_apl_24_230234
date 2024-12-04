package controller;

import model.staff.Coach;
import view.CoachView;

/**
 * ================================================================
 * Controller: CoachController.java
 * ================================================================
 * The 'CoachController' class handles the interaction between the
 * 'Coach' model and the 'CoachView'. It updates the view based on
 * coach details and processes user commands for updates.
 * ================================================================
 */
public class CoachController {
    private Coach model;
    private CoachView view;

    public CoachController(Coach model, CoachView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayCoachDetails(model.getName(), model.getRole(), model.getStrategyExpertise(), model.getTrainingHours());
    }
}
