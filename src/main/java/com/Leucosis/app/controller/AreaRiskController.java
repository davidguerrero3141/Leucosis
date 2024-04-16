package com.Leucosis.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Leucosis.app.dto.MessageDto;
import com.Leucosis.app.entity.AreaRisk;
import com.Leucosis.app.service.IAreaRiskServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/areaRisk")
@CrossOrigin(origins = "http://localhost:4200")
public class AreaRiskController {

	@Autowired
	private IAreaRiskServices areaRiskServices;
	
	@GetMapping("/allAreaRisk")
	public List<AreaRisk> getAllAreaRisk() {
		return areaRiskServices.getAllRiskArea();
	}
	
	@PostMapping
	public ResponseEntity<MessageDto> addArearisk(@RequestBody AreaRisk areaRisk){
		areaRiskServices.AddAreaRisk(areaRisk);
		return ResponseEntity.ok(new MessageDto(HttpStatus.OK, "Area Risk have been created"));
	}
	
}
