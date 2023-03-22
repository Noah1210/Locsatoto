package com.pardon.locsatoto.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Agent implements UserDetails {
	@Id
	private String login;
	
	private String nom;
	
	private String prenom;
	
	private String mdp;
	
	public Agent() {
		super();
	}
	
	

	public Agent(String login, String nom, String prenom, String mdp) {
		super();
		this.login = login;
		this.nom = nom;
		this.prenom = prenom;
		this.mdp = mdp;
	}



	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> sesHabilitations = new ArrayList<>();
		SimpleGrantedAuthority habilitations = new SimpleGrantedAuthority("Admin");
		sesHabilitations.add(habilitations);
		return sesHabilitations;
	}

	@Override
	public String getPassword() {
		return mdp;
	}
	
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	@Override
	public String getUsername() {
		return login;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
