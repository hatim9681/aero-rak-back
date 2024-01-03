package com.example.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
public class Prestataire {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String nom;
	private String service;
	private String commentaire ;
	@JsonManagedReference
	@JsonIgnore
    @OneToMany(mappedBy = "prestataire", cascade = CascadeType.ALL)
    private List<Facture> factures;
	public Prestataire() {
		super();
	}
	
	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Facture> getFactures() {
		return factures;
	}

	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}
	
	
	
    
   

}
