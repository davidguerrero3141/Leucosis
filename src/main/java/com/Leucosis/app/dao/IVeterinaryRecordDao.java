package com.Leucosis.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Leucosis.app.entity.VeterinaryRecord;

@Repository
public interface IVeterinaryRecordDao extends JpaRepository<VeterinaryRecord, Long>{

	@Query("select v from VeterinaryRecord v where v.bovine.idBovine = ?1")
	public List<VeterinaryRecord> getVeterinaryRecordBovine(long idBovine);
}
