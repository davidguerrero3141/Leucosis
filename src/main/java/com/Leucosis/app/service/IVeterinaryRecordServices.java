package com.Leucosis.app.service;

import java.util.List;

import com.Leucosis.app.entity.VeterinaryRecord;

public interface IVeterinaryRecordServices {

	public void addVeterinaryRecord(VeterinaryRecord veterinaryRecord);
	public List<VeterinaryRecord> listAllVeterinaryRecord();
	public List<VeterinaryRecord> listVeterinaryRecordBovine(long idbovine);
}
