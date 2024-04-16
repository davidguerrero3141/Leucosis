package com.Leucosis.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Leucosis.app.service.IExposureServices;

@RestController
@RequestMapping("/exposure")
@CrossOrigin(origins = "http://localhost:4200")
public class ExposureController {
	
	@Autowired
	private IExposureServices exposureServices;

}
