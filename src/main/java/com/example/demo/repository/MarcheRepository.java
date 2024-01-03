package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Marche;

public interface MarcheRepository extends JpaRepository<Marche, Integer> {
	Marche findById(int id);
	}