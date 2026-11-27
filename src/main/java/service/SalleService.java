package service;

import dao.SalleDAO;
import dao.SalleDAOImpl;
import model.Salle;

public class SalleService {
    private final SalleDAO salleDAO;
    

    public SalleService() {
        this.salleDAO = new SalleDAOImpl();
    }

    public SalleResultat InsertionSalle(Salle salle_ajouter){

        // Vérification avant DAO
        if (salle_ajouter == null) {
            return SalleResultat.SALLE_NULL;
        }
        else if (salle_ajouter.getNomSalle() == null) {
            return SalleResultat.NOM_VIDE;
        }
        else if (salle_ajouter.getCapaciteSalle() <= 0){
            return SalleResultat.CAPACITE_INVALIDE;
        } else {
            boolean resultat = salleDAO.ajouterSalle(salle_ajouter);

            return resultat
                    ? SalleResultat.INSERTION_REUSSIE
                    : SalleResultat.ERREUR_INSERTION;
        }
    }
}

    
