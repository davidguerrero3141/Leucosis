package com.Leucosis.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Leucosis.app.entity.Role;

@Repository
public interface IRoleRepositoryDao extends JpaRepository<Role, Long>{

	Optional <Role> findByName(String name);
}
