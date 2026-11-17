package dao;

import java.util.List;

import model.Tarifs;

public interface TarifsDAO {

    void insertTarif(Tarifs tarif);

    void modifierTarif(Tarifs tarif);

    void supprimerTarif(int idTarif);

    Tarifs rechercherTarif(int idTarif);

    List<Tarifs> getAllTarifs();
}
