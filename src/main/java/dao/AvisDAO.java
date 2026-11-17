package dao;

import java.util.List;

import model.Avis;

public interface AvisDAO {

    void insertAvis(Avis avis);

    void supprimerAvis(int idAvis);

    Avis rechercherAvis(int idAvis);

    List<Avis> getAllAvis();
}
