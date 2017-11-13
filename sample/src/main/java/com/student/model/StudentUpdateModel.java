package com.student.model;

public class StudentUpdateModel {

	//@NotBlank(message = "Please enter valid id")
	private Integer id;
	
	private String name;
	
	private String section;
	
	private String phoneNumber;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Update Request : [id="+id+" name="+name+" section="+section+" phoneNumber="+phoneNumber+"]";
	}
}
