package com.Leucosis.app.service;

import java.util.List;

import com.Leucosis.app.entity.Exposure;

public interface IExposureServices {

	public List<Exposure> getAllExposure();
	public void addExposure(Exposure exposure);
}