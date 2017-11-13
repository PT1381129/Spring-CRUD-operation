package com.student.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.domain.Student;
import com.student.exception.DuplicateUserException;
import com.student.model.StudentModel;
import com.student.model.StudentResponseModel;
import com.student.model.StudentUpdateModel;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl extends BaseService implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(Validator validator) {
		super(validator);
	}

	@Override
	public StudentResponseModel createStudent(StudentModel studentRequest) {
		validate(studentRequest);
		Integer id = studentRequest.getId();
		if(studentRepository.findById(id) == null) {
			Student student = new Student(studentRequest);
			Student response = studentRepository.save(student);
			return new StudentResponseModel(response);
		}else {
			throw new DuplicateUserException();
		}
	}

	@Override
	public StudentResponseModel getStudentById(int id) {
		validate(id);
		if(id==0) {
			 throw new DuplicateUserException();
		}else {
			//Student student = new Student(id);
			Student response = studentRepository.findById(id);
			return new StudentResponseModel(response);
		}
	}

	@Override
	public StudentResponseModel updateStudent(StudentUpdateModel updateStd) {
		validate(updateStd);
		
			Student response = studentRepository.findById(updateStd.getId());
			response.setName(updateStd.getName());
			response.setSection(updateStd.getSection());
			response.setPhoneNumber(updateStd.getPhoneNumber());
			return new StudentResponseModel(studentRepository.save(response));
	}

	@Override
	public StudentResponseModel deleteStudent(int id) {
		//validate(id);
		if(id==0) {
			 throw new DuplicateUserException();
		}else {
			Student response = studentRepository.findById(id);
            studentRepository.delete(id);
			return new StudentResponseModel(response);
			
		}
	}

	@Override
	public List<StudentResponseModel> getStudentBySection(String section) {
		List<Student> response = studentRepository.findBySection(section);
		List<StudentResponseModel> responseModel = new ArrayList<>();
		for(Student student : response) {
			responseModel.add(new StudentResponseModel(student));
		}
		return responseModel;
	}
	
}
