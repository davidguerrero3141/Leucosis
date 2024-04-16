package com.Leucosis.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "area_risk")
public class AreaRisk {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_area_risk")
	private long idAreaRisk;
	
	@Column(name="description")
	private String description;
	
	@Column(name="reason")
	private String reason;
	
	@Column(name="precautions")
	private String precautions;
	
	@Column(name = "latitude")
	private double latitude;
	
	@Column(name = "longitude")
	private double longitude;
	
	@Column(name="state")
	private boolean state;

	public long getIdAreaRisk() {
		return idAreaRisk;
	}

	public void setIdAreaRisk(long idAreaRisk) {
		this.idAreaRisk = idAreaRisk;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrecautions() {
		return precautions;
	}

	public void setPrecautions(String precautions) {
		this.precautions = precautions;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
	
	
}
