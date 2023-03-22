package com.pardon.locsatoto.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Appartement{
	
	@Id
	private String code;
	
	private String nom;
	
	private String adresse;
	
	private float tarifMois;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Equipement> equipements  = new HashSet<>();
	
	
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
	
	public Set<Equipement> getEquipements() {
		return equipements;
	}
}
