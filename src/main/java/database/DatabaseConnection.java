package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/mini_produits";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Liantsoa16"; 

    private DatabaseConnection() {
    }

    /**
     * Fournit une nouvelle connexion active vers la base PostgreSQL.
     * Le DAO appellera cette méthode dans un bloc try-with-resources.
     * 
     * @return un objet Connection ouvert vers PostgreSQL
     * @throws SQLException si la connexion à la base échoue (identifiants, serveur éteint, etc.)
     */
    public static Connection getConnection() throws SQLException {
        // DriverManager utilise le driver PostgreSQL déclaré dans le pom.xml
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
