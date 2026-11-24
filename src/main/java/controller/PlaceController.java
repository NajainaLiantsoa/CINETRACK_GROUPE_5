package controller;

import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import java.net.URL;

public class PlaceController implements Initializable{
    @FXML
private GridPane gridPlaces;

@Override
public void initialize(URL url, ResourceBundle rb) {

   int capacite = 60;
    int colonnes = 10;

for (int i = 0; i < capacite; i++) {

    int ligne = i / colonnes;
    int colonne = i % colonnes;

    Button place = new Button("P" + (i + 1));
    place.setPrefSize(60, 50);

    boolean disponible = Math.random() > 0.3;

    if (disponible) {
        place.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
    } else {
        place.setStyle("-fx-background-color: red; -fx-text-fill: white;");
        place.setDisable(true);
    }

    gridPlaces.add(place, colonne, ligne);
}
}
}
