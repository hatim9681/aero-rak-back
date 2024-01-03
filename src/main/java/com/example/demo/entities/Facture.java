package com.example.demo.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String numero;
	private LocalDate date_fac;
	private LocalDate date_arrive;
	private LocalDate date_reception;
	private String nature;
	private LocalDate periode_debut;
	private LocalDate periode_fin;
	private String fournisseur;
	private String service;
	private double montant_ttc;
	private Boolean status = false;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "marche_id")
	private Marche marche;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	private Prestataire prestataire;
	private String observation;

	public Facture() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getDate_fac() {
		return date_fac;
	}

	public void setDate_fac(LocalDate date_fac) {
		this.date_fac = date_fac;
	}

	public LocalDate getDate_arrive() {
		return date_arrive;
	}

	public void setDate_arrive(LocalDate date_arrive) {
		this.date_arrive = date_arrive;
	}

	public LocalDate getDate_reception() {
		return date_reception;
	}

	public void setDate_reception(LocalDate date_reception) {
		this.date_reception = date_reception;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public LocalDate getPeriode_debut() {
		return periode_debut;
	}

	public void setPeriode_debut(LocalDate periode_debut) {
		this.periode_debut = periode_debut;
	}

	public LocalDate getPeriode_fin() {
		return periode_fin;
	}

	public void setPeriode_fin(LocalDate periode_fin) {
		this.periode_fin = periode_fin;
	}

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public double getMontant_ttc() {
		return montant_ttc;
	}

	public void setMontant_ttc(double montant_ttc) {
		this.montant_ttc = montant_ttc;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Marche getMarche() {
		return marche;
	}

	public void setMarche(Marche marche) {
		this.marche = marche;
	}

	public Prestataire getPrestataire() {
		return prestataire;
	}

	public void setPrestataire(Prestataire prestataire) {
		this.prestataire = prestataire;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

}
