package com.example.demo.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
public class Marche {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String numero;
	private String fournisseur;
	private Boolean status;
	private String prestation;
	private String attribution;
	private double montant_ttc;
	private double tva;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private String sitePaiement;
	private String ref_notif;
	private String num_caution_def;
	private double mt_caution_def;
	private String num_act_eng;
	private String ref_os_debut;
	private LocalDate date_os_debut;
	private String ref_os_arret;
	private LocalDate date_os_arret;
	private String ref_os_reprise;
	private LocalDate date_os_reprise;
	private String ref_os_aug;
	private LocalDate date_os_aug;
	private String pv_reception;
	private String main_levee;
	private String observation;

	@ManyToOne(fetch = FetchType.EAGER)
	private Categorie categorie;
	@JsonIgnore
	@OneToMany(mappedBy = "marche", cascade = CascadeType.ALL)
	private List<Facture> factures;
	@JsonIgnore
	@OneToMany(mappedBy = "marche", cascade = CascadeType.ALL)
	private List<Payement> payements;

	// Constructors
	public Marche() {
		// Default constructor
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

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getPrestation() {
		return prestation;
	}

	public void setPrestation(String prestation) {
		this.prestation = prestation;
	}

	public double getMontant_ttc() {
		return montant_ttc;
	}

	public void setMontant_ttc(double montant_ttc) {
		this.montant_ttc = montant_ttc;
	}

	public double getTva() {
		return tva;
	}

	public void setTva(double tva) {
		this.tva = tva;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	

	public String getSitePaiement() {
		return sitePaiement;
	}

	public void setSitePaiement(String sitePaiement) {
		this.sitePaiement = sitePaiement;
	}

	public String getAttribution() {
		return attribution;
	}

	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}

	public String getRef_notif() {
		return ref_notif;
	}

	public void setRef_notif(String ref_notif) {
		this.ref_notif = ref_notif;
	}

	public String getNum_caution_def() {
		return num_caution_def;
	}

	public void setNum_caution_def(String num_caution_def) {
		this.num_caution_def = num_caution_def;
	}

	public double getMt_caution_def() {
		return mt_caution_def;
	}

	public void setMt_caution_def(double mt_caution_def) {
		this.mt_caution_def = mt_caution_def;
	}

	public String getNum_act_eng() {
		return num_act_eng;
	}

	public void setNum_act_eng(String num_act_eng) {
		this.num_act_eng = num_act_eng;
	}

	public String getRef_os_debut() {
		return ref_os_debut;
	}

	public void setRef_os_debut(String ref_os_debut) {
		this.ref_os_debut = ref_os_debut;
	}

	public LocalDate getDate_os_debut() {
		return date_os_debut;
	}

	public void setDate_os_debut(LocalDate date_os_debut) {
		this.date_os_debut = date_os_debut;
	}

	public String getRef_os_arret() {
		return ref_os_arret;
	}

	public void setRef_os_arret(String ref_os_arret) {
		this.ref_os_arret = ref_os_arret;
	}

	public LocalDate getDate_os_arret() {
		return date_os_arret;
	}

	public void setDate_os_arret(LocalDate date_os_arret) {
		this.date_os_arret = date_os_arret;
	}

	public String getRef_os_reprise() {
		return ref_os_reprise;
	}

	public void setRef_os_reprise(String ref_os_reprise) {
		this.ref_os_reprise = ref_os_reprise;
	}

	public LocalDate getDate_os_reprise() {
		return date_os_reprise;
	}

	public void setDate_os_reprise(LocalDate date_os_reprise) {
		this.date_os_reprise = date_os_reprise;
	}

	public String getRef_os_aug() {
		return ref_os_aug;
	}

	public void setRef_os_aug(String ref_os_aug) {
		this.ref_os_aug = ref_os_aug;
	}

	public LocalDate getDate_os_aug() {
		return date_os_aug;
	}

	public void setDate_os_aug(LocalDate date_os_aug) {
		this.date_os_aug = date_os_aug;
	}

	public String getPv_reception() {
		return pv_reception;
	}

	public void setPv_reception(String pv_reception) {
		this.pv_reception = pv_reception;
	}

	public String getMain_levee() {
		return main_levee;
	}

	public void setMain_levee(String main_levee) {
		this.main_levee = main_levee;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	

	public List<Payement> getPayements() {
		return payements;
	}

	public void setPayements(List<Payement> payements) {
		this.payements = payements;
	}

	public List<Facture> getFactures() {
		return factures;
	}

	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}

}
