package com.xprod.spring.xprod.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity; // anciennement java
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="PRODUIT")

public class Produits implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="IDPRODUIT")
	private Long idProd;
	@Column(name="REFINTERNE")
	private String refInterneProd;
	@Column(name="DESIGNATION")
	private String designationProd;
	@Column(name="DESC")
	private String descProd;
	@Column(name="PRIXHT")
	private double prixProdHT;

	public Produits(Long idProd, String refInterneProd, String designationProd, String descProd, double prixProdHT) {
		super();
		this.idProd = idProd;
		this.refInterneProd = refInterneProd;
		this.designationProd = designationProd;
		this.descProd = descProd;
		this.prixProdHT = prixProdHT;
	}
	
	
	

	public Produits() {
		super();
	}




	public Long getIdProd() {
		return idProd;
	}
	public void setIdProd(Long idProd) {
		this.idProd = idProd;
	}
	public String getRefInterneProd() {
		return refInterneProd;
	}
	public void setRefInterneProd(String refInterneProd) {
		this.refInterneProd = refInterneProd;
	}
	public String getDesignationProd() {
		return designationProd;
	}
	public void setDesignationProd(String designationProd) {
		this.designationProd = designationProd;
	}
	public String getDescProd() {
		return descProd;
	}
	public void setDescProd(String descProd) {
		this.descProd = descProd;
	}
	public double getPrixProdHT() {
		return prixProdHT;
	}
	public void setPrixProdHT(double prixProdHT) {
		this.prixProdHT = prixProdHT;
	}

}
