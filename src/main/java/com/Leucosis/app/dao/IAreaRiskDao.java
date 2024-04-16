package com.Leucosis.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Leucosis.app.entity.AreaRisk;

@Repository
public interface IAreaRiskDao extends JpaRepository<AreaRisk, Long> {

}
