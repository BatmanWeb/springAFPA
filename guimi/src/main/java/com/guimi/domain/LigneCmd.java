package com.guimi.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity 
@Table(name="LIGNECOMMANDE")
public class LigneCmd implements Serializable {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LIGNECOMMANDE_ID")
	private Long ligneCommande_id;
	@Column(name = "QTELIGNECOMMANDE")
	private int qteLigneCommande;
	@Column(name = "DATELIVRAISONLIGNECOMMANDE")
	private String prixLigneCommande;
	public Long getLigneCommande_id() {
		return ligneCommande_id;
	}
	public void setLigneCommande_id(Long ligneCommande_id) {
		this.ligneCommande_id = ligneCommande_id;
	}
	public int getQteLigneCommande() {
		return qteLigneCommande;
	}
	public void setQteLigneCommande(int qteLigneCommande) {
		this.qteLigneCommande = qteLigneCommande;
	}
	public String getPrixLigneCommande() {
		return prixLigneCommande;
	}
	public void setPrixLigneCommande(String prixLigneCommande) {
		this.prixLigneCommande = prixLigneCommande;
	}
	public LigneCmd(Long ligneCommande_id, int qteLigneCommande, String prixLigneCommande) {
		super();
		this.ligneCommande_id = ligneCommande_id;
		this.qteLigneCommande = qteLigneCommande;
		this.prixLigneCommande = prixLigneCommande;
	}
	public LigneCmd() {
		super();
	}
	
	
	

	
}
