package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Idao;
import com.example.demo.entities.Payement;
import com.example.demo.repository.PayementRepository;

@Service
public class PayementService implements Idao<Payement> {
	@Autowired
	private PayementRepository payementRepository;

	@Override
	public Payement save(Payement o) {
		return payementRepository.save(o);
	}

	@Override
	public Payement findById(int id) {
		return payementRepository.findById(id);
	}

	@Override
	public void delete(Payement o) {
		payementRepository.delete(o);
	}

	@Override
	public void update(Payement o) {
		payementRepository.save(o);

	}

	@Override
	public List<Payement> findAll() {
		return payementRepository.findAll();
	}

	public long count() {
		return payementRepository.count();
	}

	
}
