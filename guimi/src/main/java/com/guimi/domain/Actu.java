package com.guimi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="ACTU")
public class Actu {

	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ACTU_ID")
	private Long actu_id;
	@Column(name = "NOMACTU")
	private int nomActu;
	@Column(name = "DESCACTU")
	private String descActu;
	@Column(name = "DATEACTU")
	private double dateActu;
	@Column(name = "AUTEURACTU")
	private double auteurActu;
	public Long getActu_id() {
		return actu_id;
	}
	public void setActu_id(Long actu_id) {
		this.actu_id = actu_id;
	}
	public int getNomActu() {
		return nomActu;
	}
	public void setNomActu(int nomActu) {
		this.nomActu = nomActu;
	}
	public String getDescActu() {
		return descActu;
	}
	public void setDescActu(String descActu) {
		this.descActu = descActu;
	}
	public double getDateActu() {
		return dateActu;
	}
	public void setDateActu(double dateActu) {
		this.dateActu = dateActu;
	}
	public double getAuteurActu() {
		return auteurActu;
	}
	public void setAuteurActu(double auteurActu) {
		this.auteurActu = auteurActu;
	}
	public Actu(Long actu_id, int nomActu, String descActu, double dateActu, double auteurActu) {
		super();
		this.actu_id = actu_id;
		this.nomActu = nomActu;
		this.descActu = descActu;
		this.dateActu = dateActu;
		this.auteurActu = auteurActu;
	}
	public Actu() {
		super();
	}
	
	
	
}
