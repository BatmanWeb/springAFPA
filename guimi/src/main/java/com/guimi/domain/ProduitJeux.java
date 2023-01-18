package com.guimi.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="PRODUIT_JEUX")
public class ProduitJeux implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_JEU")
	private long idJeu;
	@Column(name="NOM_JEU", nullable= false)
	private String nomJeu;
	@Column(name="DESC_JEU", nullable= false)
	private String descJeu;
	@Column(name="PHOTO_JEU", nullable= false)
	private String photoJeu;
	@Column(name="PRIX_JEU", nullable= false)
	private int prixJeu;
	@Column(name="NOTE_JEU", nullable= false)
	private int noteJeu;
	@Column(name="COMPTEUR")
	private int compteur; // compteur de vue
	@Column(name="ACTIF", nullable= false)
	private boolean actif;
	
	
	
	
	public long getIdJeu() {
		return idJeu;
	}




	public void setIdJeu(long idJeu) {
		this.idJeu = idJeu;
	}




	public String getNomJeu() {
		return nomJeu;
	}




	public void setNomJeu(String nomJeu) {
		this.nomJeu = nomJeu;
	}




	public String getDescJeu() {
		return descJeu;
	}




	public void setDescJeu(String descJeu) {
		this.descJeu = descJeu;
	}




	public String getPhotoJeu() {
		return photoJeu;
	}




	public void setPhotoJeu(String photoJeu) {
		this.photoJeu = photoJeu;
	}




	public int getPrixJeu() {
		return prixJeu;
	}




	public void setPrixJeu(int prixJeu) {
		this.prixJeu = prixJeu;
	}




	public int getNoteJeu() {
		return noteJeu;
	}




	public void setNoteJeu(int noteJeu) {
		this.noteJeu = noteJeu;
	}




	



	public int getCompteur() {
		return compteur;
	}




	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}




	public boolean isActif() {
		return actif;
	}




	public void setActif(boolean actif) {
		this.actif = actif;
	}





	public ProduitJeux(long idJeu, String nomJeu, String descJeu, String photoJeu, int prixJeu, int noteJeu,
			int compteur, boolean actif) {
		super();
		this.idJeu = idJeu;
		this.nomJeu = nomJeu;
		this.descJeu = descJeu;
		this.photoJeu = photoJeu;
		this.prixJeu = prixJeu;
		this.noteJeu = noteJeu;
		this.compteur = compteur;
		this.actif = actif;
	}




	public ProduitJeux() {
		super();
	}
	
	
	
	
}


