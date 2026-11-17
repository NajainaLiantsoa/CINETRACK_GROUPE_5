package modele;

import java.time.LocalDate;

public class Client {
    private int idClient;
    private String nomClient;
    private String telephoneClient;
    private LocalDate dateCreationClient;


    public Client(int idClient, String nomClient, String telephoneClient, LocalDate dateCreationClient) {
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.telephoneClient = telephoneClient;
        this.dateCreationClient = dateCreationClient;
    }


    public int getIdClient() {
        return this.idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNomClient() {
        return this.nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getTelephoneClient() {
        return this.telephoneClient;
    }

    public void setTelephoneClient(String telephoneClient) {
        this.telephoneClient = telephoneClient;
    }

    public LocalDate getDateCreationClient() {
        return this.dateCreationClient;
    }

    public void setDateCreationClient(LocalDate dateCreationClient) {
        this.dateCreationClient = dateCreationClient;
    }




}
