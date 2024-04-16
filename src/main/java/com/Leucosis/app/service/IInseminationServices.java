package com.Leucosis.app.service;

import java.util.List;

import com.Leucosis.app.entity.Insemination;

public interface IInseminationServices {

	public void addInsemination(Insemination insemination);
	
	public List<Insemination> listInsemination();
	
	public List<Insemination> listInseminationBovine(long idBovine);
}
