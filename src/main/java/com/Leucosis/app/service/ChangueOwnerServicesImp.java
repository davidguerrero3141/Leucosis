package com.Leucosis.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leucosis.app.dao.IChangeOwnerDao;
import com.Leucosis.app.entity.ChangeOwnerRegistration;

@Service
public class ChangueOwnerServicesImp implements IChangeOwnerServices {

	@Autowired
	private IChangeOwnerDao changueOwnerDao;
	
	@Override
	public void addRegisterChangueOuner(ChangeOwnerRegistration changeOwnerRegistration) {
		changueOwnerDao.save(changeOwnerRegistration);
		
	}

	@Override
	public List<ChangeOwnerRegistration> getRegisterOwnerBuy(long idUserBuy) {
		return changueOwnerDao.getRegisterOwnerBuy(idUserBuy);
	}

	@Override
	public List<ChangeOwnerRegistration> getRegisterOwnerSale(long idUserSale) {
		// TODO Auto-generated method stub
		return changueOwnerDao.getRegisterOwnerSale(idUserSale);
	}

}
