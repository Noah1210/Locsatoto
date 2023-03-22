package com.pardon.locsatoto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Evaluation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String commentaire;
	
	@OneToOne
	private Etat etat;
	
	@OneToOne
	private Equipement equipement;
	
	public Evaluation() {
		
	}
	
	
	
	public Evaluation(String commentaire, Etat etat, Equipement equipement) {
		super();
		this.commentaire = commentaire;
		this.etat = etat;
		this.equipement = equipement;
	}



	public String getCommentaire() {
		return commentaire;
	}
	
	public Etat getEtat() {
		return etat;
	}
	
	public Equipement getEquipement() {
		return equipement;
	}
}
