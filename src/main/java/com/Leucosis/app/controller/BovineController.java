package com.Leucosis.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Leucosis.app.dto.MessageDto;
import com.Leucosis.app.entity.Bovine;
import com.Leucosis.app.service.IBovineServices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/bovine")
@CrossOrigin(origins = "http://localhost:4200")
public class BovineController {
	
	@Autowired
	private IBovineServices bovineServices;
	
	
	@PostMapping("/addbovine")
	public ResponseEntity<MessageDto> addBovine(@RequestBody Bovine bovine) {
		bovineServices.saveBovine(bovine);
		return ResponseEntity.ok(new MessageDto(HttpStatus.OK, "Bovine have been created"));
	}
	
	@GetMapping("/getallbovine")
	public List<Bovine> getAllBovines() {
		return bovineServices.getAllBovines();
	}
	
	@GetMapping("/getallbovinesuser/{id}")
	public List<Bovine> getBovinesUser(@PathVariable(value = "id") long id) {
		return bovineServices.getBovinesUser(id);
	}
}
