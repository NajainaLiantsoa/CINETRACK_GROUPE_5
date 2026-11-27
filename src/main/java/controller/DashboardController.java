package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DashboardController {

    @FXML
    private SidebarController sidebarController;

    @FXML
    private Label lblUtilisateur;

    @FXML
    private Label lblSeancesCount;

    @FXML
    private Label lblTauxOccupation;

    @FXML
    private Label lblEntreesCount;

    @FXML
    private Label lblRecetteJour;

    @FXML
    public void initialize() {
        if (sidebarController != null) {
            sidebarController.setActiveItem("dashboard");
        }
    }

    @FXML
    public void onNavigateSeances(ActionEvent event) {
        System.out.println("Navigation : Gestion des séances");
    }

    @FXML
    public void onNavigateSalles(ActionEvent event) {
        System.out.println("Navigation : Gestion des salles");
    }

    @FXML
    public void onNavigateTarifs(ActionEvent event) {
        System.out.println("Navigation : Gestion des tarifs");
    }

    @FXML
    public void onNouvelleSeance(ActionEvent event) {
        System.out.println("Action : Nouvelle séance");
    }

    @FXML
    public void onAjouterFilm(ActionEvent event) {
        System.out.println("Action : Ajouter un film");
    }
}
