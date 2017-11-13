package com.student.model;

import java.util.ArrayList;
import java.util.List;

public class StudentListResponse {

	List<StudentResponseModel> studentList;

	public List<StudentResponseModel> getStudentList() {
		if(null == studentList)
			studentList = new ArrayList<>();
		return studentList;
	}

	public void setStudentList(List<StudentResponseModel> studentList) {
		this.studentList = studentList;
	}
	
	
}
