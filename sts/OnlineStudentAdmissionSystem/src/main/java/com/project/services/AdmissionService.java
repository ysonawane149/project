package com.project.services;

import java.util.List;

import com.project.entity.Admission;

public interface AdmissionService {
	
	
	
	
	public Admission insertData(Admission request);
	
	public List<Admission> getAllData();
	
	public List<Admission> getDataByEmail(String email);
	
	public List<Admission> getDataById(int reqid);	
	
	public Admission updateData(Admission request);
	
	public void deleteData(int id);
	
//	public List<Admission> pendingData(String email,boolean status);
//	public List<Admission> viewAllPendingData(boolean status);

	
}
