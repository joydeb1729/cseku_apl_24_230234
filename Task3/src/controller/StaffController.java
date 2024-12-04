package controller;

import model.staff.Staff;
import view.StaffView;

/**
 * ================================================================
 * Controller: StaffController.java
 * ================================================================
 * The 'StaffController' class manages the interaction between the
 * 'Staff' model and the 'StaffView'. It updates the view with staff
 * details and handles commands for updating staff information.
 * ================================================================
 */
public class StaffController {
    private Staff model;
    private StaffView view;

    public StaffController(Staff model, StaffView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayStaffDetails(model.getName(), model.getRole());
    }
}
