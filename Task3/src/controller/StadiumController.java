package controller;

import model.stadium.Stadium;
import view.StadiumView;

/**
 * ================================================================
 * Controller: StadiumController.java
 * ================================================================
 * The 'StadiumController' class manages the interaction between
 * the 'Stadium' model and the 'StadiumView'. It updates the view
 * based on stadium details and handles modifications.
 * ================================================================
 */
public class StadiumController {
    private Stadium model;
    private StadiumView view;

    public StadiumController(Stadium model, StadiumView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayStadiumDetails(model.getName(), model.getLocation(), model.getCapacity());
    }
}
