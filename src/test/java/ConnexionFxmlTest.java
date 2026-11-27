import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConnexionFxmlTest {

    @BeforeAll
    public static void initJavaFX() {
        try {
            Platform.startup(() -> {});
        } catch (IllegalStateException e) {
            // Déjà démarré
        }
    }

    @Test
    public void testLoadConnexionFxml() throws Exception {
        URL resource = getClass().getResource("/view/auth/connexion.fxml");
        assertNotNull(resource, "Le fichier /view/auth/connexion.fxml doit exister");

        FXMLLoader loader = new FXMLLoader(resource);
        Object root = loader.load();
        assertNotNull(root);
        assertNotNull(loader.getController());
    }

    @Test
    public void testLoadSidebarFxml() throws Exception {
        URL resource = getClass().getResource("/view/layout/sidebar.fxml");
        assertNotNull(resource, "Le fichier /view/layout/sidebar.fxml doit exister");

        FXMLLoader loader = new FXMLLoader(resource);
        Object root = loader.load();
        assertNotNull(root);
        assertNotNull(loader.getController());
    }

    @Test
    public void testLoadDashboardFxml() throws Exception {
        URL resource = getClass().getResource("/view/dashboard/dashboard.fxml");
        assertNotNull(resource, "Le fichier /view/dashboard/dashboard.fxml doit exister");

        FXMLLoader loader = new FXMLLoader(resource);
        Object root = loader.load();
        assertNotNull(root);
        assertNotNull(loader.getController());
    }

    @Test
    public void testLoadGestionFilmsFxml() throws Exception {
        URL resource = getClass().getResource("/view/film/gestion_films.fxml");
        assertNotNull(resource, "Le fichier /view/film/gestion_films.fxml doit exister");

        FXMLLoader loader = new FXMLLoader(resource);
        Object root = loader.load();
        assertNotNull(root);
        assertNotNull(loader.getController());
    }

    @Test
    public void testLoadFormulaireFilmFxml() throws Exception {
        URL resource = getClass().getResource("/view/film/formulaire_film.fxml");
        assertNotNull(resource, "Le fichier /view/film/formulaire_film.fxml doit exister");

        FXMLLoader loader = new FXMLLoader(resource);
        Object root = loader.load();
        assertNotNull(root);
        assertNotNull(loader.getController());
    }
}
