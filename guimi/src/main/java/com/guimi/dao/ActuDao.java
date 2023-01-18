package com.guimi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guimi.domain.Actu;
import com.guimi.repository.IActuRepository;


@Service
public class ActuDao {
	@Autowired
	IActuRepository actuRepository;
	
	// Liste de produits
	public List<Actu> getActus() {
		return actuRepository.findAll();
		
	}
	
	//Save Produit
	public Actu saveActus(Actu actu) {
		return actuRepository.save(actu);
		
	}
	
	// get a Produit by ID
	public Actu getActusByID(Long actu_id) {
		return actuRepository.findById(actu_id).get();
	}
	
	
	// Delete a produit
	
	public void deleteActus(Actu actu) {
		actuRepository.delete(actu);
	
	}
	
	// Update 
	
	public Actu updateActus(Actu actu) {
		return actuRepository.save(actu);
		
	}
}
