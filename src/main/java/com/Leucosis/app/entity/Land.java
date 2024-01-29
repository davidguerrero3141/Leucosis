package com.Leucosis.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "land")
public class Land {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_land")
	private Long idLand;
}
