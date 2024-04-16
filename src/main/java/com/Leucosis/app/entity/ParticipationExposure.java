package com.Leucosis.app.entity;

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
@Table(name = "participation_exposure")
public class ParticipationExposure {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_stake")
	private long idStake;
	
	@Column(name="description")
	private String description;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JoinColumn(name ="id_bovine_fk",referencedColumnName ="id_bovine")
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Bovine bovine;
	
	@JoinColumn(name ="id_exposure_fk",referencedColumnName ="id_exposure")
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Exposure exposure;

	public long getIdStake() {
		return idStake;
	}

	public void setIdStake(long idStake) {
		this.idStake = idStake;
	}

	public Bovine getBovine() {
		return bovine;
	}

	public void setBovine(Bovine bovine) {
		this.bovine = bovine;
	}

	public Exposure getExposure() {
		return exposure;
	}

	public void setExposure(Exposure exposure) {
		this.exposure = exposure;
	}

	
}
