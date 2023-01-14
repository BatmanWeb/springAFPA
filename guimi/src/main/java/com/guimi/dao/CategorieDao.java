package com.guimi.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guimi.domain.Categorie;
import com.guimi.repository.ICategorieRepository;

@Service
public class CategorieDao {
		@Autowired
		ICategorieRepository categorieRepository;
		
		// Liste de produits
		public List<Categorie> getCategories() {
			return categorieRepository.findAll();
			
		}
		
		//Save Produit
		public Categorie saveCategories(Categorie categorie) {
			return categorieRepository.save(categorie);
			
		}
		
		// get a Produit by ID
		public Categorie getCategoriesByID(Long idCat) {
			return categorieRepository.findById(idCat).get();
		}
		
		
		// Delete a produit
		
		public void deleteCategories(Categorie categorie) {
			categorieRepository.delete(categorie);
		
		}
		
		// Update 
		
		public Categorie updateCategories(Categorie categorie) {
			return categorieRepository.save(categorie);
			
		}

}
