package com.ausy.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employe implements Serializable{
	@Id
	private Long id_emplye;
	private String nom_employe;
	private String prenom_emplye;
	private String adresse_emplye;
}
