package com.Leucosis.app.service;

import java.util.List;

import com.Leucosis.app.entity.Bovine;
import com.Leucosis.app.entity.Exposure;
import com.Leucosis.app.entity.ParticipationExposure;

public interface IParticipationExposureServices {

	public void saveParticipationExposure(ParticipationExposure participationExposure);
	
	public List<Exposure> listParticipationBovine(long idBovine);
	
	public List<Bovine> listParticipationExposure(long IdExposure);
}
