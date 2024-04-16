package com.Leucosis.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leucosis.app.dao.IVeterinaryRecordDao;
import com.Leucosis.app.entity.VeterinaryRecord;

@Service
public class VeterinaryRecordServicesImp implements IVeterinaryRecordServices{

	@Autowired
	private IVeterinaryRecordDao veterinaryRecordDao;
	
	@Override
	public void addVeterinaryRecord(VeterinaryRecord veterinaryRecord) {
		veterinaryRecordDao.save(veterinaryRecord);
		
	}

	@Override
	public List<VeterinaryRecord> listAllVeterinaryRecord() {
		return veterinaryRecordDao.findAll();
	}

	@Override
	public List<VeterinaryRecord> listVeterinaryRecordBovine(long idbovine) {
		return veterinaryRecordDao.getVeterinaryRecordBovine(idbovine);
	}

}
