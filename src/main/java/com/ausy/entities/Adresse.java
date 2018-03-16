package com.ausy.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Adresse implements Serializable{
	@Id
	private Long id_adresse;
	private String pays;
	private String ville;
	private String rue;
	public Long getId_adresse() {
		return id_adresse;
	}
	public void setId_adresse(Long id_adresse) {
		this.id_adresse = id_adresse;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	
	public Adresse() {
		super();
	}
	public Adresse(String pays, String ville, String rue) {
		super();
		this.pays = pays;
		this.ville = ville;
		this.rue = rue;
	}
	
}
