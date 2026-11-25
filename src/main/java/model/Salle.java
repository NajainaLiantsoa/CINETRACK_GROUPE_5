package model;

public class Salle {
       private int idSalle;
    private String nomSalle;
    private int capaciteSalle;
    private Boolean statutSalle;


    public Salle(int idSalle, String nomSalle, int capaciteSalle, Boolean statutSalle) {
        this.idSalle = idSalle;
        this.nomSalle = nomSalle;
        this.capaciteSalle = capaciteSalle;
        this.statutSalle = statutSalle;
    }


    public int getIdSalle() {
        return this.idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public String getNomSalle() {
        return this.nomSalle;
    }

    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }

    public int getCapaciteSalle() {
        return this.capaciteSalle;
    }

    public void setCapaciteSalle(int capaciteSalle) {
        this.capaciteSalle = capaciteSalle;
    }

    public Boolean getStatutSalle() {
        return this.statutSalle;
    }

    public void setStatutSalle(Boolean statutSalle) {
        this.statutSalle = statutSalle;
    }


}
