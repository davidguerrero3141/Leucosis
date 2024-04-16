package com.Leucosis.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Leucosis.app.entity.Bovine;
import com.Leucosis.app.entity.Exposure;
import com.Leucosis.app.entity.ParticipationExposure;

public interface IParticipationExposureDao extends JpaRepository<ParticipationExposure, Long>{
	
	@Query("select e from Exposure e where e.idExposure in " + "(select pe.exposure.idExposure from ParticipationExposure pe where pe.bovine.idBovine = ?1)")
	public List<Exposure> listExposureBovine(long idBovine);
	
	@Query("select b from Bovine b where b.idBovine in" + "(select pe.bovine.idBovine from ParticipationExposure pe where pe.exposure.idExposure = ?1)")
	public List<Bovine> listBovineExposure(long idExposure);

}
