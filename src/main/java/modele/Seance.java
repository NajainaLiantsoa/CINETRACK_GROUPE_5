package modele;

import java.time.LocalDate;
import java.time.LocalTime;

public class Seance {
      private int idSeance;
    private int idFilm;
    private int idSalle;
    private LocalDate dateSeance;
    private LocalTime heureDebut;


    public Seance(int idSeance, int idFilm, int idSalle, LocalDate dateSeance, LocalTime heureDebut) {
        this.idSeance = idSeance;
        this.idFilm = idFilm;
        this.idSalle = idSalle;
        this.dateSeance = dateSeance;
        this.heureDebut = heureDebut;
    }


    public int getIdSeance() {
        return this.idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }

    public int getIdFilm() {
        return this.idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public int getIdSalle() {
        return this.idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public LocalDate getDateSeance() {
        return this.dateSeance;
    }

    public void setDateSeance(LocalDate dateSeance) {
        this.dateSeance = dateSeance;
    }

    public LocalTime getHeureDebut() {
        return this.heureDebut;
    }

    public void setHeureDebut(LocalTime heureDebut) {
        this.heureDebut = heureDebut;
    }


}
