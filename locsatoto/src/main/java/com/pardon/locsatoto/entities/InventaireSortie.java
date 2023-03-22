package com.pardon.locsatoto.entities;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class InventaireSortie extends Inventaire{

	private Float penalite;
	
	
	public InventaireSortie() {
		
	}
	
	public InventaireSortie(String generalComment, List<Evaluation> evaluations, Float penalite) {
		super(generalComment, evaluations);
		this.penalite = penalite;
	}
}
