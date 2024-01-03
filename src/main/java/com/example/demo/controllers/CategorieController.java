package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Categorie;
import com.example.demo.service.CategorieService;

@RestController
@RequestMapping("/categories")
@CrossOrigin
public class CategorieController {
	@Autowired
	private CategorieService categorieService;

	// Create (POST) a new Categorie
	@PostMapping("/save")
	public Categorie createCategorie(@RequestBody Categorie Categorie) {
		return categorieService.save(Categorie);
	}

	// Read (GET) a Categorie by ID
	@GetMapping("/{id}")
	public Categorie getCategorieById(@PathVariable int id) {
		return categorieService.findById(id);
	}

	// Update (PUT) an existing Categorie
	@PutMapping("/edit/{id}")
	public Categorie updateCategorie(@PathVariable int id, @RequestBody Categorie Categorie) {
		Categorie existingCategorie = categorieService.findById(id);
		if (existingCategorie != null) {
			Categorie.setId(id); // Set the ID of the updated Categorie
			return categorieService.save(Categorie);
		}
		return null;
	}

	// Delete (DELETE) a Categorie by ID
	@DeleteMapping("/delete/{id}")
	public void deleteCategorie(@PathVariable int id) {
		Categorie Categorie = categorieService.findById(id);

		categorieService.delete(Categorie);

	}

	// Read (GET) all Categories
	@GetMapping("/all")
	public List<Categorie> getAllCategories() {
		return categorieService.findAll();
	}

	// Count the number of Categories
	@GetMapping("/count")
	public long countCategories() {
		return categorieService.count();
	}
}
