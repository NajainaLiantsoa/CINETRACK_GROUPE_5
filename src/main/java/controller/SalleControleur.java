package controller;

import service.SalleResultat;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import model.Salle;
import service.SalleService;
import java.util.Objects;
import static java.lang.Boolean.TRUE;


public class SalleControleur {
    @FXML
    private TextField nomSalle;
    @FXML
    private TextField CapaciteSalle;
    private final SalleService salleService = new SalleService();

    @FXML
    public void initialize() {
        System.out.println("SalleControleur initialise !");
    }

    private void afficherMessage(Alert.AlertType type, String titre, String message) {

        Alert alert = new Alert(type);
        alert.setTitle(titre);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.showAndWait();
    }

    public void ajouter_Salle(){

        String nom = nomSalle.getText();
        String nombre_en_String = CapaciteSalle.getText();
        int capacite;

        if (nom.isEmpty() || nombre_en_String.isEmpty()) {
            afficherMessage(Alert.AlertType.ERROR, "Erreur",
                    "Aucun donner inserer dans les champs !");
        } else {

            try {
                capacite = Integer.parseInt(CapaciteSalle.getText());

                Salle salle = new Salle(0, nom, capacite, TRUE);
                SalleResultat resultat = salleService.InsertionSalle(salle);

                switch(resultat) {
                    case INSERTION_REUSSIE:
                        afficherMessage(Alert.AlertType.INFORMATION,
                            "Message Succès", "Salle ajoutée avec succès ! Salle disponible par défaut");
                    break;

                    case ERREUR_INSERTION:
                        afficherMessage(Alert.AlertType.ERROR,
                                "Erreur dans l'ajout du salle", "Veuillez contactez le responsable informatique");
                        break;

                    case NOM_VIDE,SALLE_NULL:
                        afficherMessage(Alert.AlertType.ERROR,
                                "Erreur sur les donnees envoyer", "Les donnees envoyer ne sont pas conforme");
                        break;

                    case CAPACITE_INVALIDE:
                        afficherMessage(Alert.AlertType.INFORMATION,
                                "Capacité Negatives", "Une salle doit avoir une 1 place au moins");
                        break;
                }

            } catch (NumberFormatException e) {

                afficherMessage(Alert.AlertType.ERROR, "Error",
                        "Probleme lors du convertion!");

                nomSalle.clear();

            }
        }
    }

}
