package com.xprod.spring.xprod.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUITFAB")
public class ProduitFabriquer extends Produits {
	@Column(name ="NBHEUREMOYEN")
	private Long nbHeureMoyen;
	@Column(name ="PRIXHT")
	private double prixHT;
	public Long getNbHeureMoyen() {
		return nbHeureMoyen;
	}
	public void setNbHeureMoyen(Long nbHeureMoyen) {
		this.nbHeureMoyen = nbHeureMoyen;
	}
	public double getPrixHT() {
		return prixHT;
	}
	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}
	
	public ProduitFabriquer(Long idProd, String refInterneProd, String designationProd, String descProd,
			double prixProdHT, Long nbHeureMoyen, double prixHT) {
		super(idProd, refInterneProd, designationProd, descProd, prixProdHT);
		this.nbHeureMoyen = nbHeureMoyen;
		this.prixHT = prixHT;
	}
	public ProduitFabriquer(Long idProd, String refInterneProd, String designationProd, String descProd,
			double prixProdHT) {
		super(idProd, refInterneProd, designationProd, descProd, prixProdHT);
	}
	public ProduitFabriquer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
