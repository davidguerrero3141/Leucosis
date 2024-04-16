package com.Leucosis.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leucosis.app.dao.IParticipationExposureDao;
import com.Leucosis.app.entity.Bovine;
import com.Leucosis.app.entity.Exposure;
import com.Leucosis.app.entity.ParticipationExposure;

@Service
public class ParticipationExposureServicesImp implements IParticipationExposureServices{

	@Autowired
	private IParticipationExposureDao participationExposureDao;
	
	@Override
	public void saveParticipationExposure(ParticipationExposure participationExposure) {
		participationExposureDao.save(participationExposure);
		
	}

	@Override
	public List<Exposure> listParticipationBovine(long idBovine) {
		
		return participationExposureDao.listExposureBovine(idBovine);
	}

	@Override
	public List<Bovine> listParticipationExposure(long IdExposure) {
		
		return participationExposureDao.listBovineExposure(IdExposure);
		
	}

}
