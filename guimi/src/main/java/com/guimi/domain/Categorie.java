package com.guimi.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CATEGORIE")
public class Categorie implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_CAT")
	private long idCat;
	@Column(name="NOM_CAT")
	private String nomCatString;
	
	
	public long getIdCat() {
		return idCat;
	}
	public void setIdCat(long idCat) {
		this.idCat = idCat;
	}
	public String getNomCatString() {
		return nomCatString;
	}
	public void setNomCatString(String nomCatString) {
		this.nomCatString = nomCatString;
	}
	public Categorie(long idCat, String nomCatString) {
		super();
		this.idCat = idCat;
		this.nomCatString = nomCatString;
	}
	public Categorie() {
		super();
	}
	
	
}
