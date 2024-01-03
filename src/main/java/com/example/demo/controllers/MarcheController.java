package com.example.demo.controllers;

import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Marche;
import com.example.demo.service.MarcheService;

@RestController
@RequestMapping("/marches")
@CrossOrigin
public class MarcheController {
	@Autowired
	private MarcheService marcheService;

	// Create (POST) a new Marche
	@PostMapping("/save")
	public Marche createMarche(@RequestBody Marche marche) {
		return marcheService.save(marche);
	}

	// Read (GET) a Marche by ID
	@GetMapping("/{id}")
	public Marche getMarcheById(@PathVariable int id) {
		return marcheService.findById(id);
	}

	// Update (PUT) an existing Marche
	@PutMapping("/edit/{id}")
	public Marche updateMarche(@PathVariable int id, @RequestBody Marche marche) {
		Marche existingMarche = marcheService.findById(id);
		if (existingMarche != null) {
			marche.setId(id); 
			LocalDate today = LocalDate.now();
		    LocalDate dateFin = marche.getDateFin();
		    if (dateFin != null && dateFin.isBefore(today) || dateFin.isEqual(today)) {
		        marche.setStatus(false); 
		    } else {
		        marche.setStatus(true); 
		    }// Set the ID of the updated Marche
			return marcheService.save(marche);
		}
		return null;
	}

	// Delete (DELETE) a Marche by ID
	@DeleteMapping("/delete/{id}")
	public void deleteMarche(@PathVariable int id) {
		Marche marche = marcheService.findById(id);

		marcheService.delete(marche);

	}

	// Read (GET) all Marches
	@GetMapping("/all")
	public List<Marche> getAllMarches() {
		return marcheService.findAll();
	}

	// Count the number of Marches
	@GetMapping("/count")
	public long countMarches() {
		return marcheService.count();
	}
	@PutMapping("/deadline/{id}")
	public Marche handleDeadline(@PathVariable int id) {
	    Marche marche = marcheService.findById(id);
	    LocalDate today = LocalDate.now();
	    LocalDate dateFin = marche.getDateFin();
	    if (dateFin != null && dateFin.isBefore(today) || dateFin.isEqual(today)) {
	        marche.setStatus(false); 
	    } else {
	        marche.setStatus(true); 
	    }
	    return marcheService.save(marche);
	}
	@PutMapping("/end/{id}")
	public Marche endMa(@PathVariable int id) {
	    Marche marche = marcheService.findById(id);
	    LocalDate today = LocalDate.now();
	    marche.setStatus(false); 
	    marche.setDateFin(today);
	    return marcheService.save(marche);
	}
}
