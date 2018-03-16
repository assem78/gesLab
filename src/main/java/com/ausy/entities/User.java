package com.ausy.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity
public class User extends Personne implements Serializable{
//	@Id
//	@GeneratedValue
	private Long id_user;
	private boolean isAdmin;
	//private String nom;
	@ManyToMany
	@JoinTable(name="User_Priv",
				joinColumns=@JoinColumn(name="id_user"),
				inverseJoinColumns=@JoinColumn(name="id_privilege"))
	private List<Privilege> listePrivileges;
	@OneToMany(targetEntity=Log.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Log> listeLogs;
	public User() {
		super();
	}
	public User(Long id_user, boolean isAdmin, List<Privilege> listePrivileges, List<Log> listeLogs) {
		super();
		this.id_user = id_user;
		this.isAdmin = isAdmin;
		this.listePrivileges = listePrivileges;
		this.listeLogs = listeLogs;
	}
		
}
