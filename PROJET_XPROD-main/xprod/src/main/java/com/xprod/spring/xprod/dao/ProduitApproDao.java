package com.xprod.spring.xprod.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.xprod.spring.xprod.domain.ProduitAppro;
import com.xprod.spring.xprod.repository.IProduitApproRepository;


@Service
public class ProduitApproDao {

	@Autowired
	IProduitApproRepository produitApproRepository;
	
	//Liste de produits
		public List<ProduitAppro> getProduits(){
			return produitApproRepository.findAll();
			
		}
		
		//Save
		public ProduitAppro saveProduit(ProduitAppro produit) {
			return produitApproRepository.save(produit);
			
		}
		
		//Get a Produit
		public ProduitAppro getProduitById(Long idProduit) {
			return produitApproRepository.findById(idProduit).get();
		}
		
		
		//Delete a Produit
			public void deleteProduit(ProduitAppro produit) {
				produitApproRepository.delete(produit);
			}
	
}
