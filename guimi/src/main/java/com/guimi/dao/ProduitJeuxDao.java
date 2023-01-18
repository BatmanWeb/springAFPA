package com.guimi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guimi.domain.ProduitJeux;
import com.guimi.repository.IProduitJeuxRepository;

@Service
public class ProduitJeuxDao {
	@Autowired
	IProduitJeuxRepository produitJeuxRepository;
	
	 List<ProduitJeux> getProduitJeux() {
		return produitJeuxRepository.findAll();
		
	}
	
	//Save Produit
	public ProduitJeux saveProduitJeux(ProduitJeux produitJeux ) {
		return produitJeuxRepository.save(produitJeux);
		
	}
	
	// get a Produit by ID
	public ProduitJeux getProduitJeuxByID(Long idJeu) {
		return produitJeuxRepository.findById(idJeu).get();
	}
	
	
	// Delete a produit
	
	public void deleteProduitJeux(ProduitJeux  idJeu) {
		produitJeuxRepository.delete(idJeu);
	
	}
	
	// Update 
	
	public ProduitJeux  updateProduitJeux(ProduitJeux  idJeu) {
		return produitJeuxRepository.save(idJeu);
		
	}
}
