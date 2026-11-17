package modele;

import java.time.LocalDate;

public class Reservation {
     private int idReservation;
    private String numeroBillet;
    private int idClient;
    private int idSeance;
    private int idUtilisateur;
    private int idTarif;
    private LocalDate dateReservation;
    private String statutReservation;


    public Reservation(int idReservation, String numeroBillet, int idClient, int idSeance, int idUtilisateur, int idTarif, LocalDate dateReservation, String statutReservation) {
        this.idReservation = idReservation;
        this.numeroBillet = numeroBillet;
        this.idClient = idClient;
        this.idSeance = idSeance;
        this.idUtilisateur = idUtilisateur;
        this.idTarif = idTarif;
        this.dateReservation = dateReservation;
        this.statutReservation = statutReservation;
    }



    public int getIdReservation() {
        return this.idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public String getNumeroBillet() {
        return this.numeroBillet;
    }

    public void setNumeroBillet(String numeroBillet) {
        this.numeroBillet = numeroBillet;
    }

    public int getIdClient() {
        return this.idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdSeance() {
        return this.idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }

    public int getIdUtilisateur() {
        return this.idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdTarif() {
        return this.idTarif;
    }

    public void setIdTarif(int idTarif) {
        this.idTarif = idTarif;
    }

    public LocalDate getDateReservation() {
        return this.dateReservation;
    }

    public void setDateReservation(LocalDate dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getStatutReservation() {
        return this.statutReservation;
    }

    public void setStatutReservation(String statutReservation) {
        this.statutReservation = statutReservation;
    }

}
