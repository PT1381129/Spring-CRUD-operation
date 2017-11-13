package com.student.domain;

import java.io.Serializable;

import javax.persistence.Column;

//import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.student.model.StudentModel;

@Entity
@Table(name="student")
public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 123L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="section")
	private String section;
	@Column(name="email")
	private String email;
	@Column(name="phonenumber")
	private String phoneNumber;

	public Student() {
		super();
	}
	
	public Student(final StudentModel request) {
		this.id = request.getId();
		this.name = request.getName();
		this.phoneNumber = request.getPhoneNumber();
		this.email = request.getEmail();
		this.section = request.getSection();
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

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
