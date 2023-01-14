package com.guimi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guimi.dao.CategorieDao;
import com.guimi.domain.Categorie;

@RestController
@RequestMapping
@CrossOrigin("*")
public class CategorieController {
	@Autowired
	CategorieDao categorieDao;
	
	
	@GetMapping("/categorie")
	public List<Categorie> getAllCategories(
			@Validated @RequestBody(required = false) 
			Categorie categorie
			) {
		return categorieDao.getCategories();
	}
	
	
	@PostMapping("/categories")
	public Categorie createCategorie(@Validated @RequestBody(required = false) 
			Categorie categorie
			) {
		return categorieDao.saveCategories(categorie);
	}

}
