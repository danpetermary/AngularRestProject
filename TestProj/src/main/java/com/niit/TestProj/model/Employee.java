package com.niit.TestProj.model;



import java.util.Date;

import javax.persistence.*;

import org.springframework.lang.NonNull;

//import service.EmpService;

@Entity
@Table (name="employee") 
public class Employee 
{

@Id
private int eid;

@NonNull
private String name;

@NonNull
private String password;
//
@NonNull
private String emailid;

@NonNull
private String designation;




public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}

public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
