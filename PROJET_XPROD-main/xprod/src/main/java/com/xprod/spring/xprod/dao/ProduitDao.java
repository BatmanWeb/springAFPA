package com.xprod.spring.xprod.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xprod.spring.xprod.domain.Produit;
import com.xprod.spring.xprod.repository.IProduitRepository;

@Service
public class ProduitDao {

	@Autowired
	IProduitRepository produitRepository;
	
	//Liste de produits
	public List<Produit> getProduits(){
		return produitRepository.findAll();
		
	}
	
	//Save
	public Produit saveProduit(Produit produit) {
		return produitRepository.save(produit);
		
	}
	
	//Get a Produit
	public Produit getProduitById(Long idProduit) {
		return produitRepository.findById(idProduit).get();
	}
	
	
	//Delete a Produit
		public void deleteProduit(Produit produit) {
			produitRepository.delete(produit);
		}
} 
