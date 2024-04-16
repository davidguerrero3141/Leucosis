package com.Leucosis.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leucosis.app.dao.IAreaRiskDao;
import com.Leucosis.app.entity.AreaRisk;

@Service
public class AreaRiskServicesImp implements IAreaRiskServices {

	@Autowired
	private IAreaRiskDao areaRiskDao;

	@Override
	public List<AreaRisk> getAllRiskArea() {
		return areaRiskDao.findAll();
	}

	@Override
	public void AddAreaRisk(AreaRisk areaRisk) {
		areaRiskDao.save(areaRisk);
		
	}
	
	
}
