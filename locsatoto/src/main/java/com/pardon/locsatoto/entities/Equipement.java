package com.pardon.locsatoto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Equipement {

	@Id
	private String nom;
	
	
	public Equipement() {
		
	}
	
	public String getNom() {
		return nom;
	}
}
