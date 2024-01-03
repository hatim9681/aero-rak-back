package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Idao;
import com.example.demo.entities.Prestataire;
import com.example.demo.repository.PrestataireRepository;

@Service
public class PrestataireService implements Idao<Prestataire> {
	@Autowired
	private PrestataireRepository prestataireRepository;

	@Override
	public Prestataire save(Prestataire o) {
		return prestataireRepository.save(o);
	}

	@Override
	public Prestataire findById(int id) {
		return prestataireRepository.findById(id);
	}

	@Override
	public void delete(Prestataire o) {
		prestataireRepository.delete(o);
	}

	@Override
	public void update(Prestataire o) {
		prestataireRepository.save(o);

	}

	@Override
	public List<Prestataire> findAll() {
		return prestataireRepository.findAll();
	}

	public long count() {
		return prestataireRepository.count();
	}

	
}
