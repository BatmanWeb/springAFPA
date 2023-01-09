package com.xprod.spring.xprod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xprod.spring.xprod.dao.ProduitDao;
import com.xprod.spring.xprod.domain.Produit;

@RestController
@RequestMapping
public class ProduitController {
	@Autowired
	ProduitDao produitDao;
	
	@GetMapping("/produits")
	public List<Produit> getAllProduits(
			@Validated @RequestBody(required = false) Produit produit
			) {
		
		return produitDao.getProduits();
	}
	
	@PostMapping("/produits")
	public Produit createProduit(
			@Validated @RequestBody(required = false) Produit produit
			) {
		return produitDao.saveProduit(produit);
	}
	
	@GetMapping("/produits/{idProduit}")
	public ResponseEntity findProduitById(
			@PathVariable(name="idProduit")Long idProduit) {
		if(idProduit == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas le produit");
		}
		Produit produit = produitDao.getProduitById(idProduit);
		if(produit == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(produit);
	}
	
	
}
