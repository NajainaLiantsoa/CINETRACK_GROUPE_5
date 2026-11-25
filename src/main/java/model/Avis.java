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


    public int getIdAvis() {
        return this.idAvis;
    }

    public void setIdAvis(int idAvis) {
        this.idAvis = idAvis;
    }

    public int getIdClient() {
        return this.idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdFilm() {
        return this.idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public int getNote() {
        return this.note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return this.commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public LocalDate getDateAvis() {
        return this.dateAvis;
    }

    public void setDateAvis(LocalDate dateAvis) {
        this.dateAvis = dateAvis;
    }


    // Getters et Setters
}