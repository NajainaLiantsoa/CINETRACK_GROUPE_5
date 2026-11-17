package modele;

import java.time.LocalDate;

public class User {
     private int idUtilisateur;
    private String nomUtilisateur;
    private String emailUtilisateur;
    private String motDePasse;
    private String roleUtilisateur;
    private LocalDate dateCreation;
    private String statutUtilisateur;


    public User(int idUtilisateur, String nomUtilisateur, String emailUtilisateur, String motDePasse, String roleUtilisateur, LocalDate dateCreation, String statutUtilisateur) {
        this.idUtilisateur = idUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.emailUtilisateur = emailUtilisateur;
        this.motDePasse = motDePasse;
        this.roleUtilisateur = roleUtilisateur;
        this.dateCreation = dateCreation;
        this.statutUtilisateur = statutUtilisateur;
    }


    public int getIdUtilisateur() {
        return this.idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNomUtilisateur() {
        return this.nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getEmailUtilisateur() {
        return this.emailUtilisateur;
    }

    public void setEmailUtilisateur(String emailUtilisateur) {
        this.emailUtilisateur = emailUtilisateur;
    }

    public String getMotDePasse() {
        return this.motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getRoleUtilisateur() {
        return this.roleUtilisateur;
    }

    public void setRoleUtilisateur(String roleUtilisateur) {
        this.roleUtilisateur = roleUtilisateur;
    }

    public LocalDate getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getStatutUtilisateur() {
        return this.statutUtilisateur;
    }

    public void setStatutUtilisateur(String statutUtilisateur) {
        this.statutUtilisateur = statutUtilisateur;
    }

}
