package com.Leucosis.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Leucosis.app.entity.BovineResume;

@Repository
public interface IBovineResumeDao extends JpaRepository<BovineResume, Long> {

}
