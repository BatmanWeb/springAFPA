package com.guimi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guimi.dao.CategorieDao;
import com.guimi.domain.Categorie;


@RestController
@RequestMapping
@CrossOrigin("*")
public class CategorieController {
	@Autowired
	CategorieDao categorieDao;
	
	
	@GetMapping("/categorie")
	public List<Categorie> getAllCategories(
			@Validated @RequestBody(required = false) 
			Categorie categorie
			) {
		return categorieDao.getCategories();
	}
	
	
	@PostMapping("/categories")
	public Categorie createCategorie(@Validated @RequestBody(required = false) 
			Categorie categorie
			) {
		return categorieDao.saveCategories(categorie);
	}
	

	@GetMapping("/categories/{idCat}")
	public ResponseEntity findCategorieById(@PathVariable(name = "idCat")Long idCat){
		if (idCat == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas le produit avec son ID");
		}
		
		Categorie categorie = categorieDao.getCategoriesByID(idCat);
		
		if (categorie == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(categorie); 
		
	}
	
	@PutMapping("/categories/{idCat}")
	public ResponseEntity<Categorie> updateProduit (@Validated @PathVariable(name = "idCat")Long idCat, @RequestBody(required = false) Categorie categorie) {
		if (categorie == null) {
			return ResponseEntity.notFound().build();
			
		}
		categorie.setIdCat(idCat);
		categorieDao.updateCategories(categorie);
		return ResponseEntity.ok().body(categorie);
	}
	
	@DeleteMapping("/categories/{idCat}")
	public ResponseEntity<Categorie> deleteProduit (@Validated @PathVariable(name = "idCat")Long idCat) {
		
		Categorie categorie = categorieDao.getCategoriesByID(idCat);
		
		if (categorie == null) {
			return ResponseEntity.notFound().build();
		
	}
		categorieDao.deleteCategories(categorie);
		return ResponseEntity.ok().body(categorie); 
	
	}

}
