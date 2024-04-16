package com.Leucosis.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Leucosis.app.dto.VeterinaryRecordDto;
import com.Leucosis.app.entity.Bovine;
import com.Leucosis.app.entity.VeterinaryRecord;
import com.Leucosis.app.service.IBovineServices;
import com.Leucosis.app.service.IVeterinaryRecordServices;

@RestController
@RequestMapping("/veterinaryrecord")
@CrossOrigin(origins = "http://localhost:4200")
public class VeterinaryRecordController {

	@Autowired
	private IVeterinaryRecordServices veterinaryRecordServices;
	
	@Autowired
	private IBovineServices bovineServices;
	
	@PostMapping("/addrecord")
	public void saveVeterinaryRecord(@RequestBody VeterinaryRecordDto veterinaryRecordDto){
		VeterinaryRecord veterinaryRecord = new VeterinaryRecord();
		Bovine bovine = bovineServices.getBovineId(veterinaryRecordDto.getIdBovine());
		veterinaryRecord.setDateRecord(veterinaryRecordDto.getDateRecord());
		veterinaryRecord.setTypeSupplies(veterinaryRecordDto.getTypeSupplies());
		veterinaryRecord.setNameSupplies(veterinaryRecordDto.getNameSupplies());
		veterinaryRecord.setDoseSupplied(veterinaryRecordDto.getDoseSupplied());
		veterinaryRecord.setDescription(veterinaryRecordDto.getDescription());
		veterinaryRecord.setIndividualInstrument(veterinaryRecordDto.isIndividualInstrument());
		veterinaryRecord.setMadeBy(veterinaryRecordDto.getMadeBy());
		veterinaryRecord.setBovine(bovine);
		veterinaryRecordServices.addVeterinaryRecord(veterinaryRecord);
	}
	
	@GetMapping("/recordsbovine")
	public List<VeterinaryRecord> getAllVeterinaryRecordBovine(long idBovine){
		return veterinaryRecordServices.listVeterinaryRecordBovine(idBovine);
	}
}
