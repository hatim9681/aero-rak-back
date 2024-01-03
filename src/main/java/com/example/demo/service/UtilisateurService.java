package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Idao;
import com.example.demo.entities.Utilisateur;
import com.example.demo.repository.UtilisateurRepository;

@Service
public class UtilisateurService implements Idao<Utilisateur> {
	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Override
	public Utilisateur save(Utilisateur o) {
		return utilisateurRepository.save(o);
	}

	@Override
	public Utilisateur findById(int id) {
		return utilisateurRepository.findById(id);
	}

	@Override
	public void delete(Utilisateur o) {
		utilisateurRepository.delete(o);
	}

	@Override
	public void update(Utilisateur o) {
		utilisateurRepository.save(o);

	}

	@Override
	public List<Utilisateur> findAll() {
		return utilisateurRepository.findAll();
	}

	public long count() {
		return utilisateurRepository.count();
	}

	public boolean existsByEmail(String email) {
		return utilisateurRepository.existsByEmail(email);
	}

	public int existsByEmailAndPassword(String email, String password) {
		if (utilisateurRepository.existsByEmailAndMotdePasse(email, password)) {
			Utilisateur u = utilisateurRepository.findByEmail(email);
			return u.getId();
		}
		return -1;

	}
}
