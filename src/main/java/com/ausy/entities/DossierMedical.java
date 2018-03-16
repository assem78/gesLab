package com.ausy.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class DossierMedical implements Serializable{
	@Id
	private Long id_dossierMedical;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id_patient")
	private Patient patient;
	private Date dateCreationDossier;
	private String etat;
	@ManyToMany
	@JoinTable(name="Dossier_Antecedents",
				joinColumns = @JoinColumn(name="id_dossierMedical"),
				inverseJoinColumns=@JoinColumn(name="id_antecedent"))
	private List<Antecedent> listAntecedents;
	public Long getId_dossierMedical() {
		return id_dossierMedical;
	}
	public void setId_dossierMedical(Long id_dossierMedical) {
		this.id_dossierMedical = id_dossierMedical;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Date getDateCreationDossier() {
		return dateCreationDossier;
	}
	public void setDateCreationDossier(Date dateCreationDossier) {
		this.dateCreationDossier = dateCreationDossier;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public List<Antecedent> getListAntecedents() {
		return listAntecedents;
	}
	public void setListAntecedents(List<Antecedent> listAntecedents) {
		this.listAntecedents = listAntecedents;
	}
	
	public DossierMedical() {
		super();
	}
	public DossierMedical(Patient patient, Date dateCreationDossier, String etat, List<Antecedent> listAntecedents) {
		super();
		this.patient = patient;
		this.dateCreationDossier = dateCreationDossier;
		this.etat = etat;
		this.listAntecedents = listAntecedents;
	}
	
}
