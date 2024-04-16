package com.Leucosis.app.service;

import java.util.List;

import com.Leucosis.app.entity.AreaRisk;

public interface IAreaRiskServices {
	
	public List<AreaRisk> getAllRiskArea();
	
	public void AddAreaRisk(AreaRisk areaRisk);

}
