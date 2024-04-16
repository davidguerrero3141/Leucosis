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
@Table(name = "resume_bovine")
public class BovineResume {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_resume_bovine")
	private Long idBovine;
	
	@Column(name = "mechanical_milking")
	private boolean mechanicalMilking;
	
	@Column(name = "cattle_exhibition")
	private boolean cattleExhibition;
	
	@Column(name = "shared_bull")
	private boolean sharedBull;
	
	@Column(name = "direct_mount")
	private boolean directMount;
	
	@Column(name = "artificial_insemination")
	private boolean artificialInsemination;
	
	@Column(name = "certified_semen")
	private boolean certifiedSemen;
	
	@Column(name = "single_needle_injection")
	private boolean singleNeedleInjection; 
	
	@Column(name = "lease_grazing")
	private boolean leaseGrazing;
	
	@Column(name="leucosis")
	private boolean leucosis;
	
	@JoinColumn(name ="id_bovine_fk",referencedColumnName ="id_bovine")
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Bovine bovine;
	
	@JoinColumn(name ="id_land_current_fk",referencedColumnName ="id_land")
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Land landCurrent;
	

	public Long getIdBovine() {
		return idBovine;
	}

	public void setIdBovine(Long idBovine) {
		this.idBovine = idBovine;
	}

	public boolean isMechanicalMilking() {
		return mechanicalMilking;
	}

	public void setMechanicalMilking(boolean mechanicalMilking) {
		this.mechanicalMilking = mechanicalMilking;
	}

	public boolean isCattleExhibition() {
		return cattleExhibition;
	}

	public void setCattleExhibition(boolean cattleExhibition) {
		this.cattleExhibition = cattleExhibition;
	}

	public boolean isSharedBull() {
		return sharedBull;
	}

	public void setSharedBull(boolean sharedBull) {
		this.sharedBull = sharedBull;
	}

	public boolean isDirectMount() {
		return directMount;
	}

	public void setDirectMount(boolean directMount) {
		this.directMount = directMount;
	}

	public boolean isArtificialInsemination() {
		return artificialInsemination;
	}

	public void setArtificialInsemination(boolean artificialInsemination) {
		this.artificialInsemination = artificialInsemination;
	}

	public boolean isCertifiedSemen() {
		return certifiedSemen;
	}

	public void setCertifiedSemen(boolean certifiedSemen) {
		this.certifiedSemen = certifiedSemen;
	}

	public boolean isSingleNeedleInjection() {
		return singleNeedleInjection;
	}

	public void setSingleNeedleInjection(boolean singleNeedleInjection) {
		this.singleNeedleInjection = singleNeedleInjection;
	}

	public boolean isLeaseGrazing() {
		return leaseGrazing;
	}

	public void setLeaseGrazing(boolean leaseGrazing) {
		this.leaseGrazing = leaseGrazing;
	}

	public Bovine getBovine() {
		return bovine;
	}

	public void setBovine(Bovine bovine) {
		this.bovine = bovine;
	}

	public Land getLandCurrent() {
		return landCurrent;
	}

	public void setLandCurrent(Land landCurrent) {
		this.landCurrent = landCurrent;
	}

}
