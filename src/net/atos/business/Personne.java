package net.atos.business;

import java.util.Date;

public abstract class Personne {
    private int id_personne;
    private String nom;
    private String prenom;
    private String username;
    private String password;
    private Date datedinscription;

    public int getId_personne() {
        return id_personne;
    }

    public void setId_personne(int id_personne) {
        this.id_personne = id_personne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDatedinscription() {
        return datedinscription;
    }

    public void setDatedinscription(Date datedinscription) {
        this.datedinscription = datedinscription;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}

