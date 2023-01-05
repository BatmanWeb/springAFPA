package com.xprod.spring.xprod.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="FOURNISSEUR")
public class Fournisseur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="IDFOUR")
	private Long id;
	@Column(name="NOM")
	private String nom;
	@Column(name="RS")
	private String rs;
	@Column(name="RUE")
	private String rue;
	@Column(name="CP")
	private String cp;
	@Column(name="VILLE")
	private String ville;
	@Column(name="PAYS")
	private String pays;
	@Column(name="TEL")
	private String tel;
	@Column(name="EMAIL")
	private String email;
	@Column(name="REFEXT")
	private String refExt;
	@Column(name="PRIXU")
	private double PrixU;
	
	
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRs() {
		return rs;
	}
	public void setRs(String rs) {
		this.rs = rs;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public Fournisseur(Long id, String nom, String rs, String rue, String cp, String ville, String pays, String tel,
			String email, String refExt, double prixU) {
		super();
		this.id = id;
		this.nom = nom;
		this.rs = rs;
		this.rue = rue;
		this.cp = cp;
		this.ville = ville;
		this.pays = pays;
		this.tel = tel;
		this.email = email;
		this.refExt = refExt;
		this.PrixU = prixU;
	}
	public Fournisseur() {
		super();
	}
	
	

	
	
}
