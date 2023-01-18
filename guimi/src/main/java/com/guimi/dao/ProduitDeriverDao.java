package com.guimi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.guimi.domain.ProduitDeriver;
import com.guimi.repository.IProduitDeriverRepository;

@Service
public class ProduitDeriverDao {
	@Autowired
	IProduitDeriverRepository produitDeriverRepository;
	
	 List<ProduitDeriver> getProduitDerivers() {
		return produitDeriverRepository.findAll();
		
	}
	
	//Save Produit
	public ProduitDeriver saveProduitDerivers(ProduitDeriver idProd) {
		return produitDeriverRepository.save(idProd);
		
	}
	
	// get a Produit by ID
	public ProduitDeriver getProduitDeriversByID(Long idProd) {
		return produitDeriverRepository.findById(idProd).get();
	}
	
	
	// Delete a produit
	
	public void deleteProduitDerivers(ProduitDeriver idProd) {
		produitDeriverRepository.delete(idProd);
	
	}
	
	// Update 
	
	public ProduitDeriver updateProduitDerivers(ProduitDeriver idProd) {
		return produitDeriverRepository.save(idProd);
		
	}
}
