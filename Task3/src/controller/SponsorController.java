package controller;

import model.sponsor.Sponsor;
import view.SponsorView;

/**
 * ================================================================
 * Controller: SponsorController.java
 * ================================================================
 * The 'SponsorController' class manages the interaction between the
 * 'Sponsor' model and the 'SponsorView'. It updates the view based
 * on sponsor details and handles user commands for modifying data.
 * ================================================================
 */
public class SponsorController {
    private Sponsor model;
    private SponsorView view;

    public SponsorController(Sponsor model, SponsorView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displaySponsorDetails(model.getName(), model.getContribution());
    }
}
