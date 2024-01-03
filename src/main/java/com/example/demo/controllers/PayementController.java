package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Marche;
import com.example.demo.entities.Payement;
import com.example.demo.service.MarcheService;
import com.example.demo.service.PayementService;

@RestController
@RequestMapping("/payements")
@CrossOrigin
public class PayementController {
	@Autowired
	private PayementService payementService;
	@Autowired
	private MarcheService marcheService;

	// Create (POST) a new Payement
	@PostMapping("/save")
	public Payement createPayement(@RequestBody Payement Payement) {
		return payementService.save(Payement);
	}

	// Read (GET) a Payement by ID
	@GetMapping("/{id}")
	public Payement getPayementById(@PathVariable int id) {
		return payementService.findById(id);
	}

	// Update (PUT) an existing Payement
	@PutMapping("/edit/{id}")
	public Payement updatePayement(@PathVariable int id, @RequestBody Payement Payement) {
		Payement existingPayement = payementService.findById(id);
		if (existingPayement != null) {
			Payement.setId(id); // Set the ID of the updated Payement
			return payementService.save(Payement);
		}
		return null;
	}

	// Delete (DELETE) a Payement by ID
	@DeleteMapping("/delete/{id}")
	public void deletePayement(@PathVariable int id) {
		Payement Payement = payementService.findById(id);

		payementService.delete(Payement);

	}

	// Read (GET) all Payements 
	@GetMapping("/all")
	public List<Payement> getAllPayements() {
		return payementService.findAll();
	}

	// Count the number of Payements
	@GetMapping("/count")
	public long countPayements() {
		return payementService.count();
	}
	
	
	@GetMapping("/marche/{id}")
	public List<Payement> getFactureByMarche(@PathVariable int id)
	{
		Marche m=marcheService.findById(id);
		return m.getPayements();
	}
}
