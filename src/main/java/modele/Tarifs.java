package modele;

public class Tarifs {
        private int idTarif;
    private String nomTarif;
    private String descriptionTarifs;
    private double prixTarifs;
    private String statutTarifs;


    public Tarifs(int idTarif, String nomTarif, String descriptionTarifs, double prixTarifs, String statutTarifs) {
        this.idTarif = idTarif;
        this.nomTarif = nomTarif;
        this.descriptionTarifs = descriptionTarifs;
        this.prixTarifs = prixTarifs;
        this.statutTarifs = statutTarifs;
    }


    public int getIdTarif() {
        return this.idTarif;
    }

    public void setIdTarif(int idTarif) {
        this.idTarif = idTarif;
    }

    public String getNomTarif() {
        return this.nomTarif;
    }

    public void setNomTarif(String nomTarif) {
        this.nomTarif = nomTarif;
    }

    public String getDescriptionTarifs() {
        return this.descriptionTarifs;
    }

    public void setDescriptionTarifs(String descriptionTarifs) {
        this.descriptionTarifs = descriptionTarifs;
    }

    public double getPrixTarifs() {
        return this.prixTarifs;
    }

    public void setPrixTarifs(double prixTarifs) {
        this.prixTarifs = prixTarifs;
    }

    public String getStatutTarifs() {
        return this.statutTarifs;
    }

    public void setStatutTarifs(String statutTarifs) {
        this.statutTarifs = statutTarifs;
    }


}
