package com.Leucosis.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Leucosis.app.entity.Land;
import com.Leucosis.app.service.ILandServices;

@RestController
@RequestMapping("/land")
@CrossOrigin(origins = "http://localhost:4200")
public class LandController {
	
	@Autowired
	private ILandServices landServices;
	
	@PostMapping("/add")
	public void addLand(@RequestBody Land land) {
		
		landServices.addLand(land);
	}
	
	@GetMapping("/getall")
	public List<Land> getAllLand(){
		return landServices.getAllLands();
	}
	
	@GetMapping("/all/{id}")
	public List<Land> getLandsUSer(@PathVariable(value = "id") long id){
		return landServices.getLasndsUser(id);
	}

}
