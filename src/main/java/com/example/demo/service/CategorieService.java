package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Idao;
import com.example.demo.entities.Categorie;
import com.example.demo.repository.CategorieRepository;

@Service
public class CategorieService implements Idao<Categorie> {
	@Autowired
	private CategorieRepository categorieRepository;

	@Override
	public Categorie save(Categorie o) {
		return categorieRepository.save(o);
	}

	@Override
	public Categorie findById(int id) {
		return categorieRepository.findById(id);
	}

	@Override
	public void delete(Categorie o) {
		categorieRepository.delete(o);
	}

	@Override
	public void update(Categorie o) {
		categorieRepository.save(o);

	}

	@Override
	public List<Categorie> findAll() {
		return categorieRepository.findAll();
	}

	public long count() {
		return categorieRepository.count();
	}

	
}
