package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Idao;
import com.example.demo.entities.Marche;
import com.example.demo.repository.MarcheRepository;

@Service
public class MarcheService implements Idao<Marche> {
	@Autowired
	private MarcheRepository marcheRepository;

	@Override
	public Marche save(Marche o) {
		return marcheRepository.save(o);
	}

	@Override
	public Marche findById(int id) {
		return marcheRepository.findById(id);
	}

	@Override
	public void delete(Marche o) {
		marcheRepository.delete(o);
	}

	@Override
	public void update(Marche o) {
		marcheRepository.save(o);

	}

	@Override
	public List<Marche> findAll() {
		return marcheRepository.findAll();
	}

	public long count() {
		return marcheRepository.count();
	}
}
