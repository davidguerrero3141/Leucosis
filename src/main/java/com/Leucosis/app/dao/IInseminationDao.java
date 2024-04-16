package com.Leucosis.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Leucosis.app.entity.Insemination;

@Repository
public interface IInseminationDao extends JpaRepository<Insemination, Long> {

	@Query("select i from Insemination i where i.bovine.idBovine = ?1")
	public List<Insemination> listInseminationBovine(long idBovine);
}
