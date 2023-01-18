package com.guimi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.guimi.domain.LigneCmd;
import com.guimi.repository.ILigneCmdRepository;

@Service
public class LigneCmdDao {
	@Autowired
	ILigneCmdRepository ligneCmdRepository;
	
	 List<LigneCmd> getLigneCmds() {
		return ligneCmdRepository.findAll();
		
	}
	
	//Save Produit
	public LigneCmd saveLigneCmds(LigneCmd commande) {
		return ligneCmdRepository.save(commande);
		
	}
	
	// get a Produit by ID
	public LigneCmd getLigneCmdsByID(Long ligneCommande_id) {
		return ligneCmdRepository.findById(ligneCommande_id).get();
	}
	
	
	// Delete a produit
	
	public void deleteLigneCmds(LigneCmd ligneCommande_id) {
		ligneCmdRepository.delete(ligneCommande_id);
	
	}
	
	// Update 
	
	public LigneCmd updateLigneCmds(LigneCmd ligneCommande_id) {
		return ligneCmdRepository.save(ligneCommande_id);
		
	}
}
