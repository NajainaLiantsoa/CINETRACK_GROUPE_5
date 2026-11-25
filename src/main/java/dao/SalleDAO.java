package dao;

import java.util.List;

import model.Salle;

public interface SalleDAO {

    void ajouterSalle(Salle salle);

    void updateSalle(Salle salle);

    void supprimerSalle(int idSalle);

    Salle rechercherSalle(int idSalle);

    List<Salle> getAllSalles();
}
