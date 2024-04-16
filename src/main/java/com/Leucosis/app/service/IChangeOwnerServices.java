package com.Leucosis.app.service;

import java.util.List;

import com.Leucosis.app.entity.ChangeOwnerRegistration;

public interface IChangeOwnerServices {

	public void addRegisterChangueOuner(ChangeOwnerRegistration changeOwnerRegistration);
	public List<ChangeOwnerRegistration> getRegisterOwnerBuy(long idUserBuy);
	public List<ChangeOwnerRegistration> getRegisterOwnerSale(long idUserSale);
	
	
}
