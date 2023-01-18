package com.guimi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.guimi.dao.ActuDao;
import com.guimi.domain.Actu;


public class ActuController {
	
	
	@Autowired
	ActuDao actuDao;
	
	
	@GetMapping("/actu")
	public List<Actu> getAllActus(
			@Validated @RequestBody(required = false) 
			Actu actu
			) {
		return actuDao.getActus();
	}
	
	
	@PostMapping("/actu")
	public Actu createCategorie(@Validated @RequestBody(required = false) 
			Actu actu
			) {
		return actuDao.saveActus(actu);
	}
	

	@GetMapping("/actu/{actu_id}")
	public ResponseEntity findCategorieById(@PathVariable(name = "actu_id")Long actu_id){
		if (actu_id == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas le produit avec son ID");
		}
		
		Actu actu = actuDao.getActusByID(actu_id);
		
		if (actu == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(actu); 
		
	}
	
	@PutMapping("/actu/{actu_id}")
	public ResponseEntity<Actu> updateProduit (@Validated @PathVariable(name = "actu_id")Long actu_id, @RequestBody(required = false) Actu actu) {
		if (actu == null) {
			return ResponseEntity.notFound().build();
			
		}
		actu.setActu_id(actu_id);
		actuDao.updateActus(actu);
		return ResponseEntity.ok().body(actu);
	}
	
	@DeleteMapping("/actu/{actu_id}")
	public ResponseEntity<Actu> deleteProduit (@Validated @PathVariable(name = "actu_id")Long actu_id) {
		
		Actu actu = actuDao.getActusByID(actu_id);
		
		if (actu == null) {
			return ResponseEntity.notFound().build();
		
	}
		actuDao.deleteActus(actu);
		return ResponseEntity.ok().body(actu); 
	
	}

}
