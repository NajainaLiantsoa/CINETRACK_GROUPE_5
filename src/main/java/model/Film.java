package model;

import java.time.LocalDate;

public class Film {
    private int idFilm;
    private String titreFilm;
    private String genreFilm;
    private int dureeFilm;
    private String synopsisFilm;
    private LocalDate dateSortie;
    private int ageMinimum;
    private String langue;


    public Film(int idFilm, String titreFilm, String genreFilm, int dureeFilm, String synopsisFilm, LocalDate dateSortie, int ageMinimum, String langue) {
        this.idFilm = idFilm;
        this.titreFilm = titreFilm;
        this.genreFilm = genreFilm;
        this.dureeFilm = dureeFilm;
        this.synopsisFilm = synopsisFilm;
        this.dateSortie = dateSortie;
        this.ageMinimum = ageMinimum;
        this.langue = langue;
    }


    public int getIdFilm() {
        return this.idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getTitreFilm() {
        return this.titreFilm;
    }

    public void setTitreFilm(String titreFilm) {
        this.titreFilm = titreFilm;
    }

    public String getGenreFilm() {
        return this.genreFilm;
    }

    public void setGenreFilm(String genreFilm) {
        this.genreFilm = genreFilm;
    }

    public int getDureeFilm() {
        return this.dureeFilm;
    }

    public void setDureeFilm(int dureeFilm) {
        this.dureeFilm = dureeFilm;
    }

    public String getSynopsisFilm() {
        return this.synopsisFilm;
    }

    public void setSynopsisFilm(String synopsisFilm) {
        this.synopsisFilm = synopsisFilm;
    }

    public LocalDate getDateSortie() {
        return this.dateSortie;
    }

    public void setDateSortie(LocalDate dateSortie) {
        this.dateSortie = dateSortie;
    }

    public int getAgeMinimum() {
        return this.ageMinimum;
    }

    public void setAgeMinimum(int ageMinimum) {
        this.ageMinimum = ageMinimum;
    }

    public String getLangue() {
        return this.langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    

}
