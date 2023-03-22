package com.pardon.locsatoto.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public abstract class Inventaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@CreationTimestamp
	private Date dateCreation;
	
	private String commentaire;
	
	@OneToMany
	@JoinColumn(name="inventaire_id")
	private List<Evaluation> evaluation = new ArrayList<>();
	
	
	public Inventaire() {

	}
	
	
	
	public Inventaire(String commentaire, List<Evaluation> evaluation) {
		super();
		this.commentaire = commentaire;
		this.evaluation = evaluation;
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


