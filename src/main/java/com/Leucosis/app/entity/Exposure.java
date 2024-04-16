package com.Leucosis.app.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exposure")
public class Exposure {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_exposure")
	private long idExposure;
	
	@Column(name = "organizer")
	private String organizer;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name="specific_location")
	private String specificLocation;
	
	@Column(name = "latitude")
	private double latitude;
	
	@Column(name = "longitude")
	private double longitude;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "date_exposure")
	private Date dateExposure;
	
	@Column(name = "Active")
	private boolean active;
		

	public long getIdExposure() {
		return idExposure;
	}

	public void setIdExposure(long idExposure) {
		this.idExposure = idExposure;
	}

	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateExposure() {
		return dateExposure;
	}

	public void setDateExposure(Date dateExposure) {
		this.dateExposure = dateExposure;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getSpecificLocation() {
		return specificLocation;
	}

	public void setSpecificLocation(String specificLocation) {
		this.specificLocation = specificLocation;
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
	
	
	
}
