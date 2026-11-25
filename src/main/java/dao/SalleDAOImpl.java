package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DatabaseConnection;
import model.Salle;

public class SalleDAOImpl implements SalleDAO {

    @Override
    public boolean ajouterSalle(Salle salle) {
        String Requete_ajout_salle = "INSERT INTO Salle (nom_salle,capacite_salle) VALUES (?,?)";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(Requete_ajout_salle)) {

            ps.setString(1, salle.getNomSalle());
            ps.setInt(2, salle.getCapaciteSalle());

            ps.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        }
    }


    @Override
    public void updateSalle(Salle salle) {
        // Requête UPDATE
    }

    @Override
    public void supprimerSalle(int idSalle) {
        // Requête DELETE
    }

    @Override
    public Salle rechercherSalle(int idSalle) {
        // Requête SELECT WHERE
        return null;
    }

    @Override
    public List<Salle> getAllSalles() {
        // Requête SELECT
        return new ArrayList<>();
    }
}
