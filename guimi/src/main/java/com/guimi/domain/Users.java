package com.guimi.domain;



import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USERS")
public class Users implements Serializable{

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_USER")
	private long idUser;
	@Column(name="EMAIL_USER", nullable= false)
	private String emailUser;
	@Column(name="ROLE_USER", nullable= false)
	private String roleUser;
	@Column(name="PSEUDO_USER", nullable= false)
	private String pseudoUser;
	@Column(name="NOM_USER")
	private String nomUser;
	@Column(name="TEL_USER")
	private String telephoneUser;
	@Column(name="PAYS_USER", nullable= false) //non null car nous avons besoin de connaitre le pays pour la tva
	private String paysUser;
	@Column(name="ADRESSES_USER")
	private String adresseUser;
	@Column(name="DATECREA_USER", nullable= false)
	private String datecreationUser;
	
	
	
	public long getIdUser() {
		return idUser;
	}



	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}



	public String getEmailUser() {
		return emailUser;
	}



	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}



	public String getRoleUser() {
		return roleUser;
	}



	public void setRoleUser(String roleUser) {
		this.roleUser = roleUser;
	}



	public String getPseudoUser() {
		return pseudoUser;
	}



	public void setPseudoUser(String pseudoUser) {
		this.pseudoUser = pseudoUser;
	}




	public String getNomUser() {
		return nomUser;
	}



	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}



	public String getTelephoneUser() {
		return telephoneUser;
	}



	public void setTelephoneUser(String telephoneUser) {
		this.telephoneUser = telephoneUser;
	}



	public String getPaysUser() {
		return paysUser;
	}



	public void setPaysUser(String paysUser) {
		this.paysUser = paysUser;
	}



	public String getAdresseUser() {
		return adresseUser;
	}



	public void setAdresseUser(String adresseUser) {
		this.adresseUser = adresseUser;
	}



	public String getDatecreationUser() {
		return datecreationUser;
	}

	public void setDatecreationUser(String datecreationUser) {
		this.datecreationUser = datecreationUser;
	}



	
	



	public Users(long idUser, String emailUser, String roleUser, String pseudoUser, String nomUser,
			String telephoneUser, String paysUser, String adresseUser, String datecreationUser) {
		super();
		this.idUser = idUser;
		this.emailUser = emailUser;
		this.roleUser = roleUser;
		this.pseudoUser = pseudoUser;
		this.nomUser = nomUser;
		this.telephoneUser = telephoneUser;
		this.paysUser = paysUser;
		this.adresseUser = adresseUser;
		this.datecreationUser = datecreationUser;
	}



	public Users() {
		super();
	}
	
	
	
}
