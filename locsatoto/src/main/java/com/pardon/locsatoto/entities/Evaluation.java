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
	
	private String commment;
	
	@OneToOne
	private Etat etat;
	
	@OneToOne
	private Equipement equipement;
	
	public Evaluation() {
		
	}
	
	public String getCommment() {
		return commment;
	}
	
	public Etat getEtat() {
		return etat;
	}
	
	public Equipement getEquipement() {
		return equipement;
	}
}
