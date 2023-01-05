package com.xprod.spring.xprod.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUITAPPRO")
public class ProduitAppro extends Produits {
	@Column(name ="PRIXACHATUT")
    private double prixAchatUT;
	@Column(name="REFEXT")
	private String refExt;
	@Column(name="PRIXU")
	private double PrixU;
	
	
	public double getPrixAchatUT() {
		return prixAchatUT;
	}
	public void setPrixAchatUT(double prixAchatUT) {
		this.prixAchatUT = prixAchatUT;
	}
	public String getRefExt() {
		return refExt;
	}
	public void setRefExt(String refExt) {
		this.refExt = refExt;
	}
	public double getPrixU() {
		return PrixU;
	}
	public void setPrixU(double prixU) {
		this.PrixU = prixU;
	}
	public ProduitAppro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProduitAppro(Long idProd, String refInterneProd, String designationProd, String descProd, double prixProdHT,
			double prixAchatUT, String refExt, double prixU) {
		super(idProd, refInterneProd, designationProd, descProd, prixProdHT);
		this.prixAchatUT = prixAchatUT;
		this.refExt = refExt;
		this.PrixU = prixU;
	}
	public ProduitAppro(Long idProd, String refInterneProd, String designationProd, String descProd,
			double prixProdHT) {
		super(idProd, refInterneProd, designationProd, descProd, prixProdHT);
	}
	

	
	
	
	

	
	
	
	
	
	
}
