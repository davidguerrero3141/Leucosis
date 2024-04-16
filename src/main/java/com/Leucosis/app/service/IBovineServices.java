package com.Leucosis.app.service;

import java.util.List;

import com.Leucosis.app.entity.Bovine;

public interface IBovineServices {

	public void saveBovine(Bovine bovine);
	public Bovine getBovineId(long id);
	public List<Bovine> getAllBovines();
	public List<Bovine> getBovinesUser(long IdUSer);
	
}
