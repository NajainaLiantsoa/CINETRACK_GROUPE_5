package dao;

import java.util.List;

import model.Utilisateur;

public interface UtilisateurDAO {

    void insertUtilisateur(Utilisateur utilisateur);

    void modifierUtilisateur(Utilisateur utilisateur);

    void supprimerUtilisateur(int idUtilisateur);

    Utilisateur rechercherUtilisateur(int idUtilisateur);

    List<Utilisateur> getAllUtilisateurs();
}
