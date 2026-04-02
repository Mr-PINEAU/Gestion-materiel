package com.GestMateriel.simple.CRUD.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "materiel")
public class MaterielModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;           // ex: "Laptop Dell"
    private String type;          // ex: "ordinateur", "écran", "clavier"
    private String numeroSerie;
    private String etat;          // ex: "bon", "en panne", "en réparation"
    private String localisation;  // ex: "Bureau 12", "Salle serveur"

    // ✅ Constructeur vide (obligatoire pour JPA)
    public MaterielModel() {}

    // ✅ Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }

    public String getEtat() { return etat; }
    public void setEtat(String etat) { this.etat = etat; }

    public String getLocalisation() { return localisation; }
    public void setLocalisation(String localisation) { this.localisation = localisation; }
}