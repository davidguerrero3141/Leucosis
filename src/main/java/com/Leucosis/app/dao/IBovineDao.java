package com.Leucosis.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Leucosis.app.entity.Bovine;

@Repository
public interface IBovineDao extends JpaRepository<Bovine, Long> {

	@Query("Select b from Bovine b where b.idBovine = ?1")
	public Bovine getBovineId(long id);
	
	@Query("Select b from Bovine b where b.currentOwner.idUser = ?1")
	public List<Bovine> getBovineUser(long userId);
	
}
