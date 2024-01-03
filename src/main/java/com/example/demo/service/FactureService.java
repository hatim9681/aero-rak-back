package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Idao;
import com.example.demo.entities.Facture;
import com.example.demo.repository.FactureRepository;

@Service
public class FactureService implements Idao<Facture> {
	@Autowired
	private FactureRepository factureRepository;

	@Override
	public Facture save(Facture o) {
		return factureRepository.save(o);
	}

	@Override
	public Facture findById(int id) {
		return factureRepository.findById(id);
	}

	@Override
	public void delete(Facture o) {
		factureRepository.delete(o);
	}

	@Override
	public void update(Facture o) {
		factureRepository.save(o);

	}

	@Override
	public List<Facture> findAll() {
		return factureRepository.findAll();
	}

	public long count() {
		return factureRepository.count();
	}

	
}
