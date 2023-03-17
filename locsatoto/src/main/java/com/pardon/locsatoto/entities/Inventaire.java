package com.pardon.locsatoto.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public abstract class Inventaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Date dateCreation;
	
	private String commentaire;
	
	@OneToMany
	private List<Evaluation> evaluation;
	
	
	public Inventaire() {

	}
	
	public String getCommentaire() {
		return commentaire;
	}
	
	public Date getDateCreation() {
		return dateCreation;
	}
	
	public List<Evaluation> getEvaluation() {
		return evaluation;
	}
	
}


