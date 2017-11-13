package com.student.service;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.student.model.StudentModel;
import com.student.model.StudentResponseModel;
import com.student.model.StudentUpdateModel;

@Service
@Configuration
public interface StudentService {

	public StudentResponseModel createStudent(final StudentModel studentRequest);
	
	public StudentResponseModel getStudentById(int id);
	
	public List<StudentResponseModel> getStudentBySection(String section);
	
	public StudentResponseModel updateStudent(final StudentUpdateModel updateRequest);
	
	public StudentResponseModel deleteStudent(int id);
}
