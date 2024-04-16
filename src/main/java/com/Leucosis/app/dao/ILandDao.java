package com.Leucosis.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Leucosis.app.entity.Land;

@Repository
public interface ILandDao extends JpaRepository<Land, Long>{
	
	
	@Query("Select l from Land l where l.user.idUser = ?1")
	public List<Land> getLandsUser(long idUser);
	
	
	@Query("select l from Land l where l.idLand = ?1")
	public Land getbyIdLand(long id);

}
