package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class UserControleur {

    @FXML
    private TextField txtIdentifiant;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Label lblMessage;

    @FXML
    private Button btnConnexion;

    @FXML
    public void initialize() {
        // Initialisation si nécessaire
    }

    @FXML
    public void handleConnexion(ActionEvent event) {
        String identifiant = txtIdentifiant != null ? txtIdentifiant.getText().trim() : "";
        String password = txtPassword != null ? txtPassword.getText() : "";

        if (identifiant.isEmpty() || password.isEmpty()) {
            afficherMessage("Veuillez renseigner votre identifiant et mot de passe.", true);
            return;
        }

        // Logique de validation / authentification
        System.out.println("Tentative de connexion pour : " + identifiant);
    }

    private void afficherMessage(String message, boolean estErreur) {
        if (lblMessage != null) {
            lblMessage.setText(message);
            lblMessage.setVisible(true);
            lblMessage.setManaged(true);
            if (estErreur) {
                lblMessage.setStyle("-fx-text-fill: #D32F2F;");
            } else {
                lblMessage.setStyle("-fx-text-fill: #0B1F3A;");
            }
        }
    }
}
