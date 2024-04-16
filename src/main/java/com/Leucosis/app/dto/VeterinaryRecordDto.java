package com.Leucosis.app.dto;

import java.sql.Date;

public class VeterinaryRecordDto {

	private Date dateRecord;
	private String typeSupplies;
	private String nameSupplies;
	private String doseSupplied;
	private String description;
	private boolean individualInstrument;
	private String madeBy;
	private long idBovine;

	public Date getDateRecord() {
		return dateRecord;
	}

	public void setDateRecord(Date dateRecord) {
		this.dateRecord = dateRecord;
	}

	public String getTypeSupplies() {
		return typeSupplies;
	}

	public void setTypeSupplies(String typeSupplies) {
		this.typeSupplies = typeSupplies;
	}

	public String getNameSupplies() {
		return nameSupplies;
	}

	public void setNameSupplies(String nameSupplies) {
		this.nameSupplies = nameSupplies;
	}

	public String getDoseSupplied() {
		return doseSupplied;
	}

	public void setDoseSupplied(String doseSupplied) {
		this.doseSupplied = doseSupplied;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isIndividualInstrument() {
		return individualInstrument;
	}

	public void setIndividualInstrument(boolean individualInstrument) {
		this.individualInstrument = individualInstrument;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public long getIdBovine() {
		return idBovine;
	}

	public void setIdBovine(long idBovine) {
		this.idBovine = idBovine;
	}

}
