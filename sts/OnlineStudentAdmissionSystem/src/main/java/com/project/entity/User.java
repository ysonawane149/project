package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	
@Id
	private int Student_Id;
	 private String fname;
	 private String lnanme;
	 private String mailid;
	 private String password;
	 private String contactno;
	 private String address;
	 private String education;
	 private double percentage;
	 private String SecurityQues;
	 private String SecurityAns;
@OneToOne
	 private int admissionid;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int student_Id, String fname, String lnanme, String mailid, String password, String contactno, String address,
		String education, double percentage, String securityQues, String securityAns, int admissionid) {
	super();
	Student_Id = student_Id;
	this.fname = fname;
	this.lnanme = lnanme;
	this.mailid = mailid;
	this.password = password;
	this.contactno = contactno;
	this.address = address;
	this.education = education;
	this.percentage = percentage;
	SecurityQues = securityQues;
	SecurityAns = securityAns;
	this.admissionid = admissionid;
}
public int getStudent_Id() {
	return Student_Id;
}
public void setStudent_Id(int student_Id) {
	Student_Id = student_Id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLnanme() {
	return lnanme;
}
public void setLnanme(String lnanme) {
	this.lnanme = lnanme;
}
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getContactno() {
	return contactno;
}
public void setContactno(String contactno) {
	this.contactno = contactno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEducation() {
	return education;
}
public void setEducation(String education) {
	this.education = education;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
public String getSecurityQues() {
	return SecurityQues;
}
public void setSecurityQues(String securityQues) {
	SecurityQues = securityQues;
}
public String getSecurityAns() {
	return SecurityAns;
}
public void setSecurityAns(String securityAns) {
	SecurityAns = securityAns;
}
public int getAdmissionid() {
	return admissionid;
}
public void setAdmissionid(int admissionid) {
	this.admissionid = admissionid;
}
@Override
public String toString() {
	return "User [Student_Id=" + Student_Id + ", fname=" + fname + ", lnanme=" + lnanme + ", mailid=" + mailid
			+ ", password=" + password + ", contactno=" + contactno + ", address=" + address + ", education="
			+ education + ", percentage=" + percentage + ", SecurityQues=" + SecurityQues + ", SecurityAns="
			+ SecurityAns + ", admissionid=" + admissionid + "]";
}


}
	 
	 