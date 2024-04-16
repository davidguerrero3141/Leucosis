package com.Leucosis.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leucosis.app.dao.ILandDao;
import com.Leucosis.app.entity.Land;

@Service
public class LandServicesImp implements ILandServices {

	@Autowired
	private ILandDao landDao;
	
	@Override
	public List<Land> getAllLands() {
		
		return landDao.findAll();
	}

	@Override
	public List<Land> getLasndsUser(long idUser) {
		
		return landDao.getLandsUser(idUser);
	}

	@Override
	public Land getLandById(long id) {
		
		return landDao.getbyIdLand(id);
	}

	@Override
	public void addLand(Land land) {
		
		landDao.save(land);
	}

}
