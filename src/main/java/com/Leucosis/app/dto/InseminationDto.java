package com.Leucosis.app.dto;

import java.sql.Date;



public class InseminationDto {

	private Date dateInsemination;
	private String madeBy;
	private boolean individualInstrument;
	private boolean certifiedSemen;
	private boolean directMount;
	private String observations;
	private long idBovine;
	
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
	public long getIdBovine() {
		return idBovine;
	}
	public void setIdBovine(long idBovine) {
		this.idBovine = idBovine;
	}
	public String getObservations() {
		return observations;
	}
	public void setObservations(String observations) {
		this.observations = observations;
	}
	
	
}
