package com.Leucosis.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Leucosis.app.entity.Bovine;
import com.Leucosis.app.entity.Exposure;
import com.Leucosis.app.entity.ParticipationExposure;
import com.Leucosis.app.service.IParticipationExposureServices;

@RestController
@RequestMapping("/participationExposure")
@CrossOrigin(origins = "http://localhost:4200")
public class ParticipationExposureController {

	@Autowired
	private IParticipationExposureServices participationExposureServices;
	
	
	@PostMapping("/addparticipation")
	public void addParticipationExposure(@RequestBody ParticipationExposure participationExposure) {
		participationExposureServices.saveParticipationExposure(participationExposure);
	}
	
	@GetMapping("/listparticipationExposure")
	public List<Bovine> getBovinesExposure(@RequestParam long idExpsure){
		return participationExposureServices.listParticipationExposure(idExpsure);
	}
	
	@GetMapping("/listExposureBovine")
	public List<Exposure> getExposureBovine(@RequestParam long idBovine){
		return participationExposureServices.listParticipationBovine(idBovine);
	}
	
}
