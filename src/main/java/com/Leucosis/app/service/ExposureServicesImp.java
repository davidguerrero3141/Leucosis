package com.Leucosis.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leucosis.app.dao.IExposureDao;
import com.Leucosis.app.entity.Exposure;

@Service
public class ExposureServicesImp implements IExposureServices{

	@Autowired
	private IExposureDao exposureDao;
	
	@Override
	public List<Exposure> getAllExposure() {
		
		return exposureDao.findAll();
	}

	@Override
	public void addExposure(Exposure exposure) {
		exposureDao.save(exposure);
		
	}

}
