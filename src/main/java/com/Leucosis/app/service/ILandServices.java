package com.Leucosis.app.service;

import java.util.List;

import com.Leucosis.app.entity.Land;


public interface ILandServices {

	public List<Land> getAllLands();
	public List<Land> getLasndsUser(long idUSer);
	public Land getLandById(long id);
	public void addLand(Land land);
	
}
