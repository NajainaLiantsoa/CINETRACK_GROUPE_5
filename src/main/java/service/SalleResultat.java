package service;

public enum SalleResultat {

    // Erreur avant insertion
    SALLE_NULL,
    NOM_VIDE,
    CAPACITE_INVALIDE,

    // Résultats après DAO
    INSERTION_REUSSIE,
    ERREUR_INSERTION
}
