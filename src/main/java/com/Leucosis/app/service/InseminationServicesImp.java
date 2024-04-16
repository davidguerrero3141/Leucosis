package com.Leucosis.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leucosis.app.dao.IInseminationDao;
import com.Leucosis.app.entity.Insemination;

@Service
public class InseminationServicesImp implements IInseminationServices{

	@Autowired
	private IInseminationDao inseminationDao;
	
	@Override
	public void addInsemination(Insemination insemination) {
		inseminationDao.save(insemination);
		
	}

	@Override
	public List<Insemination> listInsemination() {
		// TODO Auto-generated method stub
		return inseminationDao.findAll();
	}

	@Override
	public List<Insemination> listInseminationBovine(long idBovine) {
		// TODO Auto-generated method stub
		return inseminationDao.listInseminationBovine(idBovine);
	}

}
