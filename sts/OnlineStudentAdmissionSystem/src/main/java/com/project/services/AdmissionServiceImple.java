package com.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Admission;
import com.project.repository.AdmissionDao;


@Service
public class AdmissionServiceImple implements AdmissionService {
	
	@Autowired
	private AdmissionDao admissionDao;

	
	@Override
	public Admission insertData(Admission admission) {	
		return admissionDao.save(admission);
	}


	@Override
	public List<Admission> getAllData() {
		return admissionDao.findAll();
	}
	
	@Override
	public List<Admission> getDataByEmail(String email) {
		return admissionDao.findByEmail(email);
	}

	@Override
	public List<Admission> getDataById(int admid) {
		return admissionDao.findByReqid(admid);
	}

	@Override
	public Admission updateData(Admission admission) {
		return admissionDao.save(admission);
	}
	
	@Override
	public void deleteData(int id) {
		Admission adm = admissionDao.getById(id);
		admissionDao.delete(adm);
	}

//
//	@Override
//	public List<Admission> pendingData(String email,boolean status) {
//		return admissionDao.pendingData(email, false);
//	}
//
//
//	@Override
//	public List<Admission> viewAllPendingData(boolean status) {
//		return admissionDao.viewAllPendingData(false);
//	}
}
