package com.Leucosis.app.entity;

import java.sql.Date;

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
@Table(name = "veterinary_record")
public class VeterinaryRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_record")
	private Long idRecord;
	
	@Column(name = "date_record")
	private Date dateRecord;
	
	//suplemento-vacuna-medicamento
	@Column(name="type_supplies")
	private String typeSupplies;
	
	@Column(name="name_supplies")
	private String nameSupplies;
	
	@Column(name="dose_supplied")
	private String doseSupplied;
	
	@Column(name="description")
	private String description;
	
	@Column(name="individual_instrument")
	private boolean individualInstrument;
	
	@Column(name="madeBy")
	private String madeBy;
	
	@JoinColumn(name ="id_bovine_fk",referencedColumnName ="id_bovine")
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Bovine bovine;

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public Long getIdRecord() {
		return idRecord;
	}

	public void setIdRecord(Long idRecord) {
		this.idRecord = idRecord;
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

	public Bovine getBovine() {
		return bovine;
	}

	public void setBovine(Bovine bovine) {
		this.bovine = bovine;
	}

	public Date getDateRecord() {
		return dateRecord;
	}

	public void setDateRecord(Date dateRecord) {
		this.dateRecord = dateRecord;
	}
	
	
	
}
