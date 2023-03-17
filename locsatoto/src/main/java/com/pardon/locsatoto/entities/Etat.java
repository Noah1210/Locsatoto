package com.pardon.locsatoto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Etat {

	@Id
	private String libelle;
	
	public Etat() {
		
	}
	
	public String getLibelle() {
		return libelle;
	}
}
