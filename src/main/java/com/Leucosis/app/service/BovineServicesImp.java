package com.Leucosis.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leucosis.app.dao.IBovineDao;
import com.Leucosis.app.entity.Bovine;

@Service
public class BovineServicesImp implements IBovineServices {

	@Autowired
	private IBovineDao bovineDao;
	
	@Override
	public void saveBovine(Bovine bovine) {
		
		bovineDao.save(bovine);
	}

	@Override
	public Bovine getBovineId(long id) {
		
		return bovineDao.getBovineId(id);
	}

	@Override
	public List<Bovine> getAllBovines() {
		
		return bovineDao.findAll();
	}

	@Override
	public List<Bovine> getBovinesUser(long idUser) {
		
		return bovineDao.getBovineUser(idUser);
	}

}
