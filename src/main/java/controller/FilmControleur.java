package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import model.Film;
import service.FilmService;

import java.time.LocalDate;

public class FilmControleur {

    private final FilmService filmService;

    // Inclusion de la barre latérale modulaire
    @FXML
    private SidebarController sidebarController;

    // Éléments de la vue liste (gestion_films.fxml)
    @FXML
    private TextField txtRecherche;

    @FXML
    private ComboBox<String> cbGenre;

    @FXML
    private ComboBox<String> cbLangue;

    @FXML
    private TableView<Film> tableFilms;

    @FXML
    private TableColumn<Film, Integer> colId;

    @FXML
    private TableColumn<Film, String> colTitre;

    @FXML
    private TableColumn<Film, String> colGenre;

    @FXML
    private TableColumn<Film, Integer> colDuree;

    @FXML
    private TableColumn<Film, LocalDate> colDateSortie;

    @FXML
    private TableColumn<Film, Integer> colAgeMin;

    @FXML
    private TableColumn<Film, String> colLangue;

    @FXML
    private Label lblTotalFilms;

    // Éléments de la vue formulaire (formulaire_film.fxml)
    @FXML
    private Text txtTitrePage;

    @FXML
    private TextField txtTitre;

    @FXML
    private ComboBox<String> cbFormGenre;

    @FXML
    private TextField txtDuree;

    @FXML
    private DatePicker dpDateSortie;

    @FXML
    private TextField txtAgeMinimum;

    @FXML
    private TextField txtLangue;

    @FXML
    private TextArea txtSynopsis;

    @FXML
    private Label lblMessage;

    @FXML
    private Button btnEnregistrer;

    // Constructeur par défaut requis par JavaFX FXMLLoader
    public FilmControleur() {
        this.filmService = null;
    }

    // Constructeur avec injection de dépendances
    public FilmControleur(FilmService filmService) {
        this.filmService = filmService;
    }

    @FXML
    public void initialize() {
        if (sidebarController != null) {
            sidebarController.setActiveItem("films");
        }
    }

    // --- Actions du catalogue (gestion_films.fxml) ---

    @FXML
    public void onRechercher(ActionEvent event) {
        System.out.println("Recherche de films lancée...");
    }

    @FXML
    public void onReinitialiser(ActionEvent event) {
        if (txtRecherche != null) txtRecherche.clear();
        if (cbGenre != null) cbGenre.setValue(null);
        if (cbLangue != null) cbLangue.setValue(null);
    }

    @FXML
    public void onNouveauFilm(ActionEvent event) {
        System.out.println("Navigation vers l'ajout d'un film");
    }

    @FXML
    public void onModifierFilm(ActionEvent event) {
        System.out.println("Modification du film sélectionné");
    }

    @FXML
    public void onSupprimerFilm(ActionEvent event) {
        System.out.println("Suppression du film sélectionné");
    }

    // --- Actions du formulaire (formulaire_film.fxml) ---

    @FXML
    public void onEnregistrer(ActionEvent event) {
        System.out.println("Enregistrement du film...");
    }

    @FXML
    public void onAnnuler(ActionEvent event) {
        System.out.println("Annulation et retour à la liste");
    }
}
