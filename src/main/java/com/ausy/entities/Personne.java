package com.ausy.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Personne implements Serializable{
	@Id
	private String nom;
	private String prenom;
	private String sex;
	private Date dateDeNaissance;
	private String nomMarital;
	private String adresse;
	private String email;
	private String numeroTel;
	private int numeroDeSecuriteSocial;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getNomMarital() {
		return nomMarital;
	}
	public void setNomMarital(String nomMarital) {
		this.nomMarital = nomMarital;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}
	public int getNumeroDeSecuriteSocial() {
		return numeroDeSecuriteSocial;
	}
	public void setNumeroDeSecuriteSocial(int numeroDeSecuriteSocial) {
		this.numeroDeSecuriteSocial = numeroDeSecuriteSocial;
	}
	
	public Personne() {
		super();
	}
	public Personne(String nom, String prenom, String sex, Date dateDeNaissance, String nomMarital, String adresse,
			String email, String numeroTel, int numeroDeSecuriteSocial) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sex = sex;
		this.dateDeNaissance = dateDeNaissance;
		this.nomMarital = nomMarital;
		this.adresse = adresse;
		this.email = email;
		this.numeroTel = numeroTel;
		this.numeroDeSecuriteSocial = numeroDeSecuriteSocial;
	}
	
}
