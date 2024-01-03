package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Categorie;

public interface CategorieRepository extends JpaRepository <Categorie, Integer> {
	Categorie findById(int id);
	}

