package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Facture;

public interface FactureRepository extends JpaRepository <Facture, Integer> {
	Facture findById(int id);
	}

