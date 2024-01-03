package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Prestataire;

public interface PrestataireRepository extends JpaRepository <Prestataire, Integer> {
	Prestataire findById(int id);
	}

