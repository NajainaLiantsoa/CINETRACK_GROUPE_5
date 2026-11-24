import database.DatabaseConnection;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

public class databaseConnexionTest {

    @Test
    public void testConnexionDatabase() throws SQLException {

        // Appeler la méthode de connexion
        Connection connexion = DatabaseConnection.getConnection();

        // Vérifier que la connexion existe
        assertNotNull(connexion, "La connexion ne doit pas être null");

        // Vérifier que la connexion est ouverte
        assertFalse(connexion.isClosed(),
                "La connexion doit être ouverte");

        // Vérifier le nom de la base de données
        assertEquals("cinetrack",
                connexion.getCatalog(),
                "La base de données doit être cinetrack");

        // Fermer la connexion
        connexion.close();
    }
}