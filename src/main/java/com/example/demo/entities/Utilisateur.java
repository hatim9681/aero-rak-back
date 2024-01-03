package com.example.demo.entities;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Builder;
@Entity
@Builder
public class Utilisateur {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nomComplet;
	private String role;
	private LocalDate dateNaissance;
	private String motdePasse;
	private String telephone;
	private String email;
	public Utilisateur() {
		super();
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomComplet() {
		return nomComplet;
	}
	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getMotdePasse() {
		return motdePasse;
	}
	public void setMotdePasse(String motdePasse) {
		this.motdePasse = motdePasse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
}
