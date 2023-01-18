package com.guimi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guimi.domain.Commande;
import com.guimi.repository.ICommandeRepository;

@Service
public class CommandeDao {
	@Autowired
	ICommandeRepository commandeRepository;
	
	 List<Commande> getCommandes() {
		return commandeRepository.findAll();
		
	}
	
	//Save Produit
	public Commande saveCommandes(Commande commande) {
		return commandeRepository.save(commande);
		
	}
	
	// get a Produit by ID
	public Commande getCommandesByID(Long commande_id) {
		return commandeRepository.findById(commande_id).get();
	}
	
	
	// Delete a produit
	
	public void deleteCommandes(Commande commande) {
		commandeRepository.delete(commande);
	
	}
	
	// Update 
	
	public Commande updateCommandes(Commande commande) {
		return commandeRepository.save(commande);
		
	}
}
