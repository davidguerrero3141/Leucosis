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
@Table(name = "insemination")
public class Insemination {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_insemination_bovine")
	private long idInsemination;
	
	@Column(name = "date_insemination")
	private Date dateInsemination;
	
	@Column(name="madeBy")
	private String madeBy;
	
	@Column(name="individual_instrument")
	private boolean individualInstrument;
	
	@Column(name="certified_semen")
	private boolean certifiedSemen;
	
	@Column(name="direct_mount")
	private boolean directMount;
	
	@Column(name="observations")
	private String observations;
	
	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	@JoinColumn(name ="id_bovine_fk",referencedColumnName ="id_bovine")
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Bovine bovine;

	public long getIdInsemination() {
		return idInsemination;
	}

	public void setIdInsemination(long idInsemination) {
		this.idInsemination = idInsemination;
	}

	public Date getDateInsemination() {
		return dateInsemination;
	}

	public void setDateInsemination(Date dateInsemination) {
		this.dateInsemination = dateInsemination;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public boolean isIndividualInstrument() {
		return individualInstrument;
	}

	public void setIndividualInstrument(boolean individualInstrument) {
		this.individualInstrument = individualInstrument;
	}

	public boolean isCertifiedSemen() {
		return certifiedSemen;
	}

	public void setCertifiedSemen(boolean certifiedSemen) {
		this.certifiedSemen = certifiedSemen;
	}

	public boolean isDirectMount() {
		return directMount;
	}

	public void setDirectMount(boolean directMount) {
		this.directMount = directMount;
	}

	public Bovine getBovine() {
		return bovine;
	}

	public void setBovine(Bovine bovine) {
		this.bovine = bovine;
	}
	
	

}
