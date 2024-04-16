package com.Leucosis.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Leucosis.app.entity.ChangeOwnerRegistration;

@Repository
public interface IChangeOwnerDao extends JpaRepository<ChangeOwnerRegistration, Long> {

	@Query("Select cor from ChangeOwnerRegistration cor where cor.userNew = ?1")
	public List<ChangeOwnerRegistration> getRegisterOwnerBuy(long idUser);

	@Query("Select cor from ChangeOwnerRegistration cor where cor.userFormer = ?1")
	public List<ChangeOwnerRegistration> getRegisterOwnerSale(long idUser);
}
