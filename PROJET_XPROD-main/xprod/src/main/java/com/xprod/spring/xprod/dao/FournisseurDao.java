package com.xprod.spring.xprod.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xprod.spring.xprod.domain.Fournisseur;
import com.xprod.spring.xprod.repository.IFournisseurRepository;

@Service
public class FournisseurDao {

	@Autowired
	IFournisseurRepository fournisseurRepository;
	
	//Liste de Fournisseur
			public List<Fournisseur> getFournisseur(){
				return fournisseurRepository.findAll();
				
			}
			
			//Save
			public Fournisseur saveFournisseur(Fournisseur fournisseur) {
				return fournisseurRepository.save(fournisseur);
				
			}
			
			//Get a Fournisseur
			public Fournisseur getFournisseurById(Long idFournisseur) {
				return fournisseurRepository.findById(idFournisseur).get();
			}
			
			
			//Delete a Fournisseur
				public void deleteFournisseur(Fournisseur fournisseur) {
					fournisseurRepository.delete(fournisseur);
				}
		
	
}
