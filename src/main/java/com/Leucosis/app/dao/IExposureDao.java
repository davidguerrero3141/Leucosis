package com.Leucosis.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Leucosis.app.entity.Exposure;

@Repository
public interface IExposureDao extends JpaRepository<Exposure, Long> {

	@Query("Select e from Exposure e where e.active = true")
	public List<Exposure> getAllExposure();
}
