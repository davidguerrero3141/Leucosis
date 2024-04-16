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
@Table(name = "bovine")
public class Bovine {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_bovine")
	private long idBovine;
	
	@Column(name = "name")
	private String nameBovine;
	
	@Column (name = "race")
	private String race;
	
	@Column (name = "gender")
	private String gender;
	
	@Column (name = "age")
	private int Years;
	
	@Column (name = "months")
	private int months;
	
	@Column (name = "birth_date")
	private Date birthDate;
	
	@Column (name = "own")
	private  boolean own;
	
	@Column (name = "live_state")
	private boolean liveState;
	
	@JoinColumn(name ="id_current_owner_fk",referencedColumnName ="id_user")
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private User currentOwner;

	public long getIdBovine() {
		return idBovine;
	}

	public void setIdBovine(long idBovine) {
		this.idBovine = idBovine;
	}

	public String getNameBovine() {
		return nameBovine;
	}

	public void setNameBovine(String nameBovine) {
		this.nameBovine = nameBovine;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getYears() {
		return Years;
	}

	public void setYears(int years) {
		Years = years;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isOwn() {
		return own;
	}

	public void setOwn(boolean own) {
		this.own = own;
	}

	public boolean isLiveState() {
		return liveState;
	}

	public void setLiveState(boolean liveState) {
		this.liveState = liveState;
	}
	
	public User getCurrentOwner() {
		return currentOwner;
	}

	public void setCurrentOwner(User currentOwner) {
		this.currentOwner = currentOwner;
	}
}
