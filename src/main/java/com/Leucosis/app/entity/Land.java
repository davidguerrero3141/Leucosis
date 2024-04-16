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
@Table(name = "land")
public class Land {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_land")
	private long idLand;
	
	@Column(name = "name")
	private String nameLand;
	
	@Column(name = "latitude")
	private double latitude;
	
	@Column(name = "longitude")
	private double longitude;
	
	@Column(name = "num_hectares")
	private int numberHectares;
	
	@Column(name = "rent")
	private boolean rent;
	
	@Column(name = "presence_leucosis")
	private boolean presenceLeucosis;
	
	@JoinColumn(name ="id_user_fk",referencedColumnName ="id_user")
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private User user;


	public long getIdLand() {
		return idLand;
	}

	public void setIdLand(long idLand) {
		this.idLand = idLand;
	}

	public String getNameLand() {
		return nameLand;
	}

	public void setNameLand(String nameLand) {
		this.nameLand = nameLand;
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

	public int getNumberHectares() {
		return numberHectares;
	}

	public void setNumberHectares(int numberHectares) {
		this.numberHectares = numberHectares;
	}

	public boolean isRent() {
		return rent;
	}

	public void setRent(boolean rent) {
		this.rent = rent;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isPresenceLeucosis() {
		return presenceLeucosis;
	}

	public void setPresenceLeucosis(boolean presenceLeucosis) {
		this.presenceLeucosis = presenceLeucosis;
	}
	
	
	
}
