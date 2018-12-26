package com.mobi;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.validator.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"s_skill"})
public class Student {
	
	//@JsonProperty("Student_name")//to change the name of attribute in the json.
	private String s_nm;
	private String s_hobby;
	
	@Size(min=8, max=10, message="pls enter the mobile no. size bet {min} to {max}")
	private Long mobile;
	private Date DOB;
	private ArrayList<String> s_skill;
	
	private Address s_info;
	
	public Address getS_info() {
		return s_info;
	}
	public void setS_info(Address s_info) {
		this.s_info = s_info;
	}
	public String getS_nm() {
		return s_nm;
	}
	public void setS_nm(String s_nm) {
		this.s_nm = s_nm;
	}
	public String getS_hobby() {
		return s_hobby;
	}
	public void setS_hobby(String s_hobby) {
		this.s_hobby = s_hobby;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public ArrayList<String> getS_skill() {
		return s_skill;
	}
	public void setS_skill(ArrayList<String> s_skill) {
		this.s_skill = s_skill;
	}
	
	

}
