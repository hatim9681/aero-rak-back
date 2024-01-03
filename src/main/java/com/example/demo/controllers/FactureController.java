package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Facture;
import com.example.demo.entities.Marche;
import com.example.demo.entities.Prestataire;
import com.example.demo.service.FactureService;
import com.example.demo.service.MarcheService;
import com.example.demo.service.PrestataireService;

@RestController
@RequestMapping("/factures")
@CrossOrigin
public class FactureController {
	@Autowired
	private FactureService factureService;
	@Autowired
	private MarcheService marcheService;
	@Autowired
	private PrestataireService prestaService;

	// Create (POST) a new Facture
	@PostMapping("/save")
	public Facture createFacture(@RequestBody Facture Facture) {
		return factureService.save(Facture);
	}

	// Read (GET) a Facture by ID
	@GetMapping("/{id}")
	public Facture getFactureById(@PathVariable int id) {
		return factureService.findById(id);
	}

	// Update (PUT) an existing Facture
	@PutMapping("/edit/{id}")
	public Facture updateFacture(@PathVariable int id, @RequestBody Facture Facture) {
		Facture existingFacture = factureService.findById(id);
		if (existingFacture != null) {
			Facture.setId(id); // Set the ID of the updated Facture
			return factureService.save(Facture);
		}
		return null;
	}

	// Delete (DELETE) a Facture by ID
	@DeleteMapping("/delete/{id}")
	public void deleteFacture(@PathVariable int id) {
		Facture Facture = factureService.findById(id);

		factureService.delete(Facture);

	}

	// Read (GET) all Factures
	@GetMapping("/all")
	public List<Facture> getAllFactures() {
		return factureService.findAll();
	}

	// Count the number of Factures
	@GetMapping("/count")
	public long countFactures() {
		return factureService.count();
	}
	
	@GetMapping("/marche/{id}")
	public List<Facture> getFactureByMarche(@PathVariable int id)
	{
		Marche m=marcheService.findById(id);
		return m.getFactures();
	}
	@GetMapping("/prest/{id}")
	public List<Facture> getFactureByPrestataire(@PathVariable int id)
	{
		Prestataire p=prestaService.findById(id);
		return p.getFactures();
	}
	@PutMapping("/pay/{id}")
	public Facture pay(@PathVariable int id)
	{
		Facture facture = factureService.findById(id);
		facture.setStatus(true);
		return factureService.save(facture);
		
	}
}
