package dao;

import java.util.ArrayList;
import java.util.List;

import model.Salle;

public class SalleDAOImpl implements SalleDAO {

    @Override
    public void ajouterSalle(Salle salle) {
        // Requête INSERT
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
