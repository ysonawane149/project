package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Admission;
import com.project.services.AdmissionService;

@CrossOrigin

@RestController
@RequestMapping("home")
public class AdmissionController {
	
	@Autowired
	private AdmissionService admissionService;
		
		
	@PostMapping("/requests")
	public Admission insertData(@RequestBody Admission admission) {	
		return admissionService.insertData(admission);	
	}
	
	@RequestMapping(value = "user", method= RequestMethod.GET)
	//@GetMapping("/requests")
	public List<Admission> getAllData() {	
		return admissionService.getAllData();	
	}
	
	@GetMapping("/requests/{remail}")
	public List<Admission> getDataByEmail(@PathVariable String remail) {	
		return admissionService.getDataByEmail(remail);	
	}
	
	@GetMapping("/getrequests/{rid}")
	public List<Admission> getDataById(@PathVariable int rid) {	
		return admissionService.getDataById(rid);
	}
	
	
//	@PostMapping("/pendingrequests")
//	public List<Admission> getPendingData(@RequestBody Admission admission){
//		return admissionService.pendingData(admission.getEmail(), false);
//	}
//	
//	@GetMapping("/viewallpendingrequests")
//	public List<Admission> getPendingData(boolean status){
//		return admissionService.viewAllPendingData(false);
//	}
	

	@PutMapping("/requests")
	public Admission updateData(@RequestBody Admission admission) {	
		return admissionService.updateData(admission);	
	}
	
	
	@DeleteMapping("/requests/{rid}")
	public String deleteData(@PathVariable int rid) {	
		 admissionService.deleteData(rid);	
		 return "Deleted";
	}
}
