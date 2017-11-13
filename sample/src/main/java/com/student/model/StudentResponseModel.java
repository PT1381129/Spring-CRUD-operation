package com.student.model;

import com.student.domain.Student;
import com.student.response.Response;

public class StudentResponseModel extends Response{

	private int id;
	
	private String name;
	
	private String email;
	
	private String section;
	
	private String phoneNumber;

	public StudentResponseModel() {
		
	}
	
	public StudentResponseModel(Student response) {
		this.id = response.getId();
		this.name = response.getName();
		this.email = response.getEmail();
		this.phoneNumber = response.getPhoneNumber();
		this.section = response.getSection();
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
