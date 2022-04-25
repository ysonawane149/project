package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admission {
	
@Id
	private int AdmissionId;
    private String coursename;
    private String branchname;
    private int courseyear;
	public Admission() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Admission(int admissionId, String coursename, String branchname, int courseyear) {
		super();
		AdmissionId = admissionId;
		this.coursename = coursename;
		this.branchname = branchname;
		this.courseyear = courseyear;
	}


	public int getAdmissionId() {
		return AdmissionId;
	}
	public void setAdmissionId(int admissionId) {
		AdmissionId = admissionId;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public int getCourseyear() {
		return courseyear;
	}
	public void setCourseyear(int courseyear) {
		this.courseyear = courseyear;
	}


	@Override
	public String toString() {
		return "Admission [AdmissionId=" + AdmissionId + ", coursename=" + coursename + ", branchname=" + branchname
				+ ", courseyear=" + courseyear + "]";
	}
    

}
