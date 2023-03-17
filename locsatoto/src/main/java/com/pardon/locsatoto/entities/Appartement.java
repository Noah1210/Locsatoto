package com.pardon.locsatoto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Appartement{
	
	@Id
	private String code;
	
	private String nom;
	
	private String adresse;
	
	private float tarifMois;
	
	
	public Appartement() {

	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getNom() {
		return nom;
	}
	
	public float getTarifMois() {
		return tarifMois;
	}
}
