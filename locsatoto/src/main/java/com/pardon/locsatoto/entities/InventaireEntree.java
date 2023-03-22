package com.pardon.locsatoto.entities;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class InventaireEntree extends Inventaire{
	
	
	public InventaireEntree(String generalComment, List<Evaluation> evaluations) {
		super(generalComment, evaluations);
	}
	
	
	public InventaireEntree() {
		super() ;
	}

	

}
