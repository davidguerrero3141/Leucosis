package com.Leucosis.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Leucosis.app.dto.InseminationDto;
import com.Leucosis.app.entity.Bovine;
import com.Leucosis.app.entity.Insemination;
import com.Leucosis.app.service.IBovineServices;
import com.Leucosis.app.service.IInseminationServices;

@RestController
@RequestMapping("/insemination")
@CrossOrigin(origins = "http://localhost:4200")
public class InseminationController {
	
	@Autowired
	private IInseminationServices inseminationServices;
	
	@Autowired
	private IBovineServices bovineServices;
	
	
	@PostMapping("/addInsemination")
	public void AddInsemination(@RequestBody InseminationDto inseminationDto) {
		
		Insemination insemination = new Insemination();
		Bovine bovine = bovineServices.getBovineId(inseminationDto.getIdBovine());
		insemination.setDateInsemination(inseminationDto.getDateInsemination());
		insemination.setCertifiedSemen(inseminationDto.isCertifiedSemen());
		insemination.setDirectMount(inseminationDto.isDirectMount());
		insemination.setIndividualInstrument(inseminationDto.isIndividualInstrument());
		insemination.setMadeBy(inseminationDto.getMadeBy());
		insemination.setObservations(inseminationDto.getObservations());
		insemination.setBovine(bovine);
		inseminationServices.addInsemination(insemination);
	}

}
