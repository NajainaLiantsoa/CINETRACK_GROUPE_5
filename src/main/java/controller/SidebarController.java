package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SidebarController {

    @FXML
    private Button btnDashboard;

    @FXML
    private Button btnFilms;

    @FXML
    private Button btnSeances;

    @FXML
    private Button btnSalles;

    @FXML
    private Button btnTarifs;

    @FXML
    private Button btnReservations;

    @FXML
    private Label lblUtilisateur;

    @FXML
    public void initialize() {
        // Initialisation si nécessaire
    }

    public void setActiveItem(String itemName) {
        Button[] buttons = {btnDashboard, btnFilms, btnSeances, btnSalles, btnTarifs, btnReservations};
        for (Button btn : buttons) {
            if (btn != null) {
                btn.getStyleClass().remove("nav-item-active");
            }
        }

        if ("dashboard".equalsIgnoreCase(itemName) && btnDashboard != null) {
            btnDashboard.getStyleClass().add("nav-item-active");
        } else if ("films".equalsIgnoreCase(itemName) && btnFilms != null) {
            btnFilms.getStyleClass().add("nav-item-active");
        } else if ("seances".equalsIgnoreCase(itemName) && btnSeances != null) {
            btnSeances.getStyleClass().add("nav-item-active");
        } else if ("salles".equalsIgnoreCase(itemName) && btnSalles != null) {
            btnSalles.getStyleClass().add("nav-item-active");
        } else if ("tarifs".equalsIgnoreCase(itemName) && btnTarifs != null) {
            btnTarifs.getStyleClass().add("nav-item-active");
        } else if ("reservations".equalsIgnoreCase(itemName) && btnReservations != null) {
            btnReservations.getStyleClass().add("nav-item-active");
        }
    }

    @FXML
    public void onNavigateDashboard(ActionEvent event) {
        System.out.println("Navigation vers : Tableau de bord");
    }

    @FXML
    public void onNavigateFilms(ActionEvent event) {
        System.out.println("Navigation vers : Films");
    }

    @FXML
    public void onNavigateSeances(ActionEvent event) {
        System.out.println("Navigation vers : Séances");
    }

    @FXML
    public void onNavigateSalles(ActionEvent event) {
        System.out.println("Navigation vers : Salles");
    }

    @FXML
    public void onNavigateTarifs(ActionEvent event) {
        System.out.println("Navigation vers : Tarifs");
    }

    @FXML
    public void onNavigateReservations(ActionEvent event) {
        System.out.println("Navigation vers : Réservations");
    }

    @FXML
    public void onDeconnexion(ActionEvent event) {
        System.out.println("Action : Déconnexion");
    }
}
