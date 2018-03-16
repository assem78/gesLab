package com.ausy.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Activite implements Serializable{
	@Id
	@GeneratedValue
	private Long id_activite;
	private String type;
	private String description;
	@OneToMany(targetEntity=Log.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Log> listeLogs;
	public Long getId_activite() {
		return id_activite;
	}
	public void setId_activite(Long id_activite) {
		this.id_activite = id_activite;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Log> getListeLogs() {
		return listeLogs;
	}
	public void setListeLogs(List<Log> listeLogs) {
		this.listeLogs = listeLogs;
	}
	
	public Activite() {
		super();
	}
	public Activite(Long id_activite, String type, String description, List<Log> listeLogs) {
		super();
		this.id_activite = id_activite;
		this.type = type;
		this.description = description;
		this.listeLogs = listeLogs;
	}
		
}
