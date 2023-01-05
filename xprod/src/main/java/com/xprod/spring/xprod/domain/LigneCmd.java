package com.xprod.spring.xprod.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="LIGNECMD")
public class LigneCmd implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="IDLIGNECMD")
	private Long idLigne;
	@Column(name="QTELIGNE")
	private String qteLigne;
	@Column(name="DATELIVRAISON")
	private String dateLivraison;
	@Column(name="PRIXULIGNE")
	private String prixUniLigne;
	public Long getIdLigne() {
		return idLigne;
	}
	public void setIdLigne(Long idLigne) {
		this.idLigne = idLigne;
	}
	public String getQteLigne() {
		return qteLigne;
	}
	public void setQteLigne(String qteLigne) {
		this.qteLigne = qteLigne;
	}
	public String getDateLivraison() {
		return dateLivraison;
	}
	public void setDateLivraison(String dateLivraison) {
		this.dateLivraison = dateLivraison;
	}
	public String getPrixUniLigne() {
		return prixUniLigne;
	}
	public void setPrixUniLigne(String prixUniLigne) {
		this.prixUniLigne = prixUniLigne;
	}
	public LigneCmd(Long idLigne, String qteLigne, String dateLivraison, String prixUniLigne) {
		super();
		this.idLigne = idLigne;
		this.qteLigne = qteLigne;
		this.dateLivraison = dateLivraison;
		this.prixUniLigne = prixUniLigne;
	}
	public LigneCmd() {
		super();
	}
	
	
}
