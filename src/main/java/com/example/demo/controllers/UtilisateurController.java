package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entities.Utilisateur;
import com.example.demo.service.UtilisateurService;

@RestController
@RequestMapping("/utilisateurs")
@CrossOrigin
public class UtilisateurController {
	@Autowired
	private UtilisateurService utilisateurService;

	
	    // Create (POST) a new Utilisateur
	    @PostMapping("/save")
	    public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur) {
	  
	        return utilisateurService.save(utilisateur);
	    }

	// Read (GET) a Utilisateur by ID
	@GetMapping("/{id}")
	public Utilisateur getUtilisateurById(@PathVariable int id) {
		return utilisateurService.findById(id);
	}

	// Update (PUT) an existing Utilisateur
	@PutMapping("/edit/{id}")
	public Utilisateur updateUtilisateur(@PathVariable int id, @RequestBody Utilisateur Utilisateur) {
		Utilisateur existingUtilisateur = utilisateurService.findById(id);
		if (existingUtilisateur != null) {
			Utilisateur.setId(id); // Set the ID of the updated Utilisateur
			return utilisateurService.save(Utilisateur);
		}
		return null;
	}

	// Delete (DELETE) a Utilisateur by ID
	@DeleteMapping("/delete/{id}")
	public void deleteUtilisateur(@PathVariable int id) {
		Utilisateur Utilisateur = utilisateurService.findById(id);

		utilisateurService.delete(Utilisateur);

	}

	// Read (GET) all Utilisateurs
	@GetMapping("/all")
	public List<Utilisateur> getAllUtilisateurs() {
		return utilisateurService.findAll();
	}

	// Count the number of Utilisateurs
	@GetMapping("/count")
	public long countUtilisateurs() {
		return utilisateurService.count();
	}
	@GetMapping("/check-email/{email}")
    public boolean checkIfEmailExists(@PathVariable String email) {
        return utilisateurService.existsByEmail(email);
    }
	@GetMapping("/check-account/{email}/{password}")
    public int checkIfAccountExists(@PathVariable String email, @PathVariable String password) {
        return utilisateurService.existsByEmailAndPassword(email, password);
    }
}
