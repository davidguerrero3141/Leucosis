package com.Leucosis.app.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "change_owner_registration")
public class ChangeOwnerRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_change_ouner_registration")
	private Long idChangeOwnerRegistration;
	
	@Column(name = "observations")
	private String observations;
	
	@Column(name = "date")
	private Date dateRecord;
	
	@JoinColumn(name ="id_former_owner_fk",referencedColumnName ="id_user")
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private User userFormer;
	
	@JoinColumn(name ="id_new_owner_fk",referencedColumnName ="id_user")
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private User userNew;
	
	@JoinColumn(name ="id_bovine_fk",referencedColumnName ="id_bovine")
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Bovine bovine;

	public Long getIdChangeOwnerRegistration() {
		return idChangeOwnerRegistration;
	}

	public void setIdChangeOwnerRegistration(Long idChangeOwnerRegistration) {
		this.idChangeOwnerRegistration = idChangeOwnerRegistration;
	}

	public User getUserFormer() {
		return userFormer;
	}

	public void setUserFormer(User userFormer) {
		this.userFormer = userFormer;
	}

	public User getUserNew() {
		return userNew;
	}

	public void setUserNew(User userNew) {
		this.userNew = userNew;
	}

	public Bovine getBovine() {
		return bovine;
	}

	public void setBovine(Bovine bovine) {
		this.bovine = bovine;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public Date getDateRecord() {
		return dateRecord;
	}

	public void setDateRecord(Date dateRecord) {
		this.dateRecord = dateRecord;
	}
	
	
}
