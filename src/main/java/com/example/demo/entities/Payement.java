package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
public class Payement {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String banque;
	private String rib;
	private String asf;
	private String cnss;
	private String decomptes;
	private String rapport;
	private String slo;
	private String penalites;

	@ManyToOne (fetch = FetchType.EAGER)
	private Marche marche;
	public Payement() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBanque() {
		return banque;
	}
	public void setBanque(String banque) {
		this.banque = banque;
	}
	public String getRib() {
		return rib;
	}
	public void setRib(String rib) {
		this.rib = rib;
	}
	public String getAsf() {
		return asf;
	}
	public void setAsf(String asf) {
		this.asf = asf;
	}
	public String getCnss() {
		return cnss;
	}
	public void setCnss(String cnss) {
		this.cnss = cnss;
	}
	public String getDecomptes() {
		return decomptes;
	}
	public void setDecomptes(String decomptes) {
		this.decomptes = decomptes;
	}
	public String getRapport() {
		return rapport;
	}
	public void setRapport(String rapport) {
		this.rapport = rapport;
	}
	public String getSlo() {
		return slo;
	}
	public void setSlo(String slo) {
		this.slo = slo;
	}
	public String getPenalites() {
		return penalites;
	}
	public void setPenalites(String penalites) {
		this.penalites = penalites;
	}
	public Marche getMarche() {
		return marche;
	}
	public void setMarche(Marche marche) {
		this.marche = marche;
	}
	
	

}
