package com.ausy.entities;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Patient implements Serializable{
	@Id
	private Long id_patient;
	@OneToMany(mappedBy="patient")
	private List<DossierMedical> listeDossierMedical;
	public Long getId_patient() {
		return id_patient;
	}
	public void setId_patient(Long id_patient) {
		this.id_patient = id_patient;
	}
	public List<DossierMedical> getListeDossierMedical() {
		return listeDossierMedical;
	}
	public void setListeDossierMedical(List<DossierMedical> listeDossierMedical) {
		this.listeDossierMedical = listeDossierMedical;
	}
	
	public Patient() {
		super();
	}
	public Patient(List<DossierMedical> listeDossierMedical) {
		super();
		this.listeDossierMedical = listeDossierMedical;
	}
	
}
