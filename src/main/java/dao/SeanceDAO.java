package dao;

import java.util.List;

import model.Seance;

public interface SeanceDAO {

    void insererSeance(Seance seance);

    void modifierSeance(Seance seance);

    void supprimerSeance(int idSeance);

    Seance rechercherSeance(int idSeance);

    List<Seance> getAllSeances();
}
