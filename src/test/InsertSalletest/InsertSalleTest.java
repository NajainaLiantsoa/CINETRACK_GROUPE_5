package InsertSalletest;

import dao.SalleDAOImpl;
import model.Salle;
import dao.SalleDAO;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class InsertSalleTest {

    @Test
    public void testAfficherInterfaceSalle() throws Exception {

        CountDownLatch latch = new CountDownLatch(1);

        Platform.startup(() -> {
            try {

                FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("/view/GestionSalle.fxml")
                );

                Parent root = loader.load();

                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("CINETRACK - Gestion des salles");

                stage.show();

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                latch.countDown();
            }
        });

        assertTrue(
                latch.await(10, TimeUnit.SECONDS),
                "Le démarrage de JavaFX a échoué"
        );

        // Laisser la fenêtre ouverte pour le test visuel
        Thread.sleep(300000);

        Platform.exit();
    }
}