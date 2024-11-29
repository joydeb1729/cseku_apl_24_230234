import controller.ClubController;
import model.club.Club;
import view.ClubView;

/**
 * ================================================================
 * Main: Main.java
 * ================================================================
 * The 'Main' class is the entry point of the application. It initializes
 * the MVC components (Model, View, and Controller) and runs the application.
 *
 * It creates instances of the view and controller, initializes the model with data,
 * and updates the view to display the football club's information.
 *
 * Methods:
 * - main: Initializes the MVC components and runs the application.
 * ================================================================
 */
public class Main {
    public static void main(String[] args) {
        // Creating the view
        ClubView view = new ClubView();

        // Creating the controller with the view
        ClubController controller = new ClubController(null, view);

        // Initializing the model with data
        controller.initializeClubData();

        // Updating the view with the club data
        controller.updateView();
    }
}
