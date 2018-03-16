/**
 * 
 */
package com.ausy.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author mc_as
 *
 */
@Entity
public class Log implements Serializable{
	@Id
	private Long id_log;
	private User user;
	private Activite activite;
	private Date dateLog;
	public Long getId_log() {
		return id_log;
	}
	public void setId_log(Long id_log) {
		this.id_log = id_log;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Activite getActivite() {
		return activite;
	}
	public void setActivite(Activite activite) {
		this.activite = activite;
	}
	public Date getDateLog() {
		return dateLog;
	}
	public void setDateLog(Date dateLog) {
		this.dateLog = dateLog;
	}
	
	public Log() {
		super();
	}
	public Log(User user, Activite activite, Date dateLog) {
		super();
		this.user = user;
		this.activite = activite;
		this.dateLog = dateLog;
	}

}
