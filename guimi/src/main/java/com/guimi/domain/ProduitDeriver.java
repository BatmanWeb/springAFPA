package com.guimi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="PRODUIT_DERIV")
public class ProduitDeriver {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_PROD")
	private long idProd;
	@Column(name="NOM_PROD", nullable= false)
	private String nomProd;
	@Column(name="DESC_PROD", nullable= false)
	private String descProd;
	@Column(name="PHOTO_PROD", nullable= false)
	private String photoProd;
	@Column(name="PRIX_PROD", nullable= false)
	private int prixProd;
	@Column(name="NOTE_PROD", nullable= false)
	private int noteProd;
	@Column(name="ACTIF", nullable= false)
	private boolean actif;
	public long getIdProd() {
		return idProd;
	}
	public void setIdProd(long idProd) {
		this.idProd = idProd;
	}
	public String getNomProd() {
		return nomProd;
	}
	public void setNomProd(String nomProd) {
		this.nomProd = nomProd;
	}
	public String getDescProd() {
		return descProd;
	}
	public void setDescProd(String descProd) {
		this.descProd = descProd;
	}
	public String getPhotoProd() {
		return photoProd;
	}
	public void setPhotoProd(String photoProd) {
		this.photoProd = photoProd;
	}
	public int getPrixProd() {
		return prixProd;
	}
	public void setPrixProd(int prixProd) {
		this.prixProd = prixProd;
	}
	public int getNoteProd() {
		return noteProd;
	}
	public void setNoteProd(int noteProd) {
		this.noteProd = noteProd;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	public ProduitDeriver(long idProd, String nomProd, String descProd, String photoProd, int prixProd, int noteProd,
			boolean actif) {
		super();
		this.idProd = idProd;
		this.nomProd = nomProd;
		this.descProd = descProd;
		this.photoProd = photoProd;
		this.prixProd = prixProd;
		this.noteProd = noteProd;
		this.actif = actif;
	}
	public ProduitDeriver() {
		super();
	}
	
	
	
}
