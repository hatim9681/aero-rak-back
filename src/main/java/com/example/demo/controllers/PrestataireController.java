package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Prestataire;
import com.example.demo.service.PrestataireService;

@RestController
@RequestMapping("/prestataires")
@CrossOrigin
public class PrestataireController {
	@Autowired
	private PrestataireService prestataireRepository;

	// Create (POST) a new Prestataire
	@PostMapping("/save")
	public Prestataire createPrestataire(@RequestBody Prestataire Prestataire) {
		return prestataireRepository.save(Prestataire);
	}

	// Read (GET) a Prestataire by ID
	@GetMapping("/{id}")
	public Prestataire getPrestataireById(@PathVariable int id) {
		return prestataireRepository.findById(id);
	}

	// Update (PUT) an existing Prestataire
	@PutMapping("/edit/{id}")
	public Prestataire updatePrestataire(@PathVariable int id, @RequestBody Prestataire Prestataire) {
		Prestataire existingPrestataire = prestataireRepository.findById(id);
		if (existingPrestataire != null) {
			Prestataire.setId(id); // Set the ID of the updated Prestataire
			return prestataireRepository.save(Prestataire);
		}
		return null;
	}

	// Delete (DELETE) a Prestataire by ID
	@DeleteMapping("/delete/{id}")
	public void deletePrestataire(@PathVariable int id) {
		Prestataire prestataire = prestataireRepository.findById(id);

		prestataireRepository.delete(prestataire);

	}

	// Read (GET) all Prestataires
	@GetMapping("/all")
	public List<Prestataire> getAllPrestataires() {
		return prestataireRepository.findAll();
	}

	// Count the number of Prestataires
	@GetMapping("/count")
	public long countPrestataires() {
		return prestataireRepository.count();
	}
}
