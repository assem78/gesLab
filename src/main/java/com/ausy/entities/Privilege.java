package com.ausy.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Privilege implements Serializable{
	@Id
	private Long id_privilege;
	private String description;
	@ManyToMany(mappedBy="listePrivileges", cascade=CascadeType.ALL)
	private List<User> users;
	public Long getId_privilege() {
		return id_privilege;
	}
	public void setId_privilege(Long id_privilege) {
		this.id_privilege = id_privilege;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public Privilege() {
		super();
	}
	public Privilege(String description, List<User> users) {
		super();
		this.description = description;
		this.users = users;
	}
	
}
