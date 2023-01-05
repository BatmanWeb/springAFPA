package com.xprod.spring.xprod.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="COMMANDE")
public class Commande implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="IDCMD")
	private Long idCmdLong;
	@Column(name ="DATECMD")
	private LocalDateTime dateCmdLong;
	@Column(name ="FRAISPORT")
	private double fraisPortCmd;
	public Long getIdCmdLong() {
		return idCmdLong;
	}
	public void setIdCmdLong(Long idCmdLong) {
		this.idCmdLong = idCmdLong;
	}
	public LocalDateTime getDateCmdLong() {
		return dateCmdLong;
	}
	public void setDateCmdLong(LocalDateTime dateCmdLong) {
		this.dateCmdLong = dateCmdLong;
	}
	public double getFraisPortCmd() {
		return fraisPortCmd;
	}
	public void setFraisPortCmd(double fraisPortCmd) {
		this.fraisPortCmd = fraisPortCmd;
	}
	public Commande(Long idCmdLong, LocalDateTime dateCmdLong, double fraisPortCmd) {
		super();
		this.idCmdLong = idCmdLong;
		this.dateCmdLong = dateCmdLong;
		this.fraisPortCmd = fraisPortCmd;
	}
	public Commande() {
		super();
	}
	
	
}
