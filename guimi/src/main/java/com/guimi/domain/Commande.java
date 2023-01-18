package com.guimi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="LIGNECOMMANDE")

public class Commande {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COMMANDE_ID")
	private Long commande_id;
	@Column(name = "COMMANDEDATE")
	private int commandeDate;
	
	
	public Long getCommande_id() {
		return commande_id;
	}
	public void setCommande_id(Long commande_id) {
		this.commande_id = commande_id;
	}
	public int getCommandeDate() {
		return commandeDate;
	}
	public void setCommandeDate(int commandeDate) {
		this.commandeDate = commandeDate;
	}
	public Commande(Long commande_id, int commandeDate) {
		super();
		this.commande_id = commande_id;
		this.commandeDate = commandeDate;
	}
	public Commande() {
		super();
	}
	
	
}
