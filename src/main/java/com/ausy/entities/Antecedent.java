package com.ausy.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Antecedent implements Serializable{
	@Id
	private Long id_antecedent;
	private String type_abtecedent;
	private String description;
	@ManyToMany(mappedBy="listAntecedents")
	private List<DossierMedical> dossiersMedical;
	public Long getId_antecedent() {
		return id_antecedent;
	}
	public void setId_antecedent(Long id_antecedent) {
		this.id_antecedent = id_antecedent;
	}
	public String getType_abtecedent() {
		return type_abtecedent;
	}
	public void setType_abtecedent(String type_abtecedent) {
		this.type_abtecedent = type_abtecedent;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<DossierMedical> getDossierMedical() {
		return dossiersMedical;
	}
	public void setDossierMedical(List<DossierMedical> dossierMedical) {
		this.dossiersMedical = dossierMedical;
	}
	
	public Antecedent() {
		super();
	}
	public Antecedent(String type_abtecedent, String description, List<DossierMedical> dossierMedical) {
		super();
		this.type_abtecedent = type_abtecedent;
		this.description = description;
		this.dossiersMedical = dossierMedical;
	}
	
}
