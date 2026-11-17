package model;

import java.time.LocalDate;

public class Avis {

    private int idAvis;
    private int idClient;
    private int idFilm;
    private int note;
    private String commentaire;
    private LocalDate dateAvis;

    public Avis() {}

    public Avis(int idAvis, int idClient, int idFilm,
                int note, String commentaire,
                LocalDate dateAvis) {
        this.idAvis = idAvis;
        this.idClient = idClient;
        this.idFilm = idFilm;
        this.note = note;
        this.commentaire = commentaire;
        this.dateAvis = dateAvis;
    }

    // Getters et Setters
}