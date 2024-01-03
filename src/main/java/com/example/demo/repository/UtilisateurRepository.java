package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
	Utilisateur findById(int id);
	Utilisateur findByEmail(String email);
	boolean existsByEmail(String email);
	boolean existsByEmailAndMotdePasse(String email, String password);
}
