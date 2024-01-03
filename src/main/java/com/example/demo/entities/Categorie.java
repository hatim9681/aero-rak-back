package com.example.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@JsonIgnore
	@JsonManagedReference
	@OneToMany(mappedBy = "categorie")
	private List<Marche> marches;

	public Categorie() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Marche> getMarches() {
		return marches;
	}

	public void setMarches(List<Marche> marches) {
		this.marches = marches;
	}

}
