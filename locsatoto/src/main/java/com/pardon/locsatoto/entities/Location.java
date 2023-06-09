package com.pardon.locsatoto.entities;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Location {

	@Id
	private String code;
	
	@CreationTimestamp
	private Date dateCreation;
	
	@ManyToOne
	private Appartement appartement;
	
	@OneToOne
	private InventaireEntree inventaireEntree;
	
	@OneToOne
	private InventaireSortie inventaireSortie;
	
	public Location() {
		
	}
	
	public String getCode() {
		return code;
	}
	
	public Date getDateCreation() {
		return dateCreation;
	}
	
	public Appartement getAppartement() {
		return appartement;
	}
	
	public InventaireEntree getInventaireEntree() {
		return inventaireEntree;
	}
	
	public InventaireSortie getInventaireSortie() {
		return inventaireSortie;
	}
	
	public void setInventaireEntree(InventaireEntree inventaireEntree) {
		this.inventaireEntree = inventaireEntree;
	}
	
	public void setInventaireSortie(InventaireSortie inventaireSortie) {
		this.inventaireSortie = inventaireSortie;
	}
	
	public String getInventaireStatus() {
		if(inventaireEntree != null && inventaireSortie == null) {
			return "1";
		}
		else if (inventaireEntree == null && inventaireSortie == null ) {
			return "2";
		}else {
			return "3";
		}
		
	}
}
