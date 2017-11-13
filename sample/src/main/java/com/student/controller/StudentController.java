package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.StudentModel;
import com.student.model.StudentResponseModel;
import com.student.model.StudentUpdateModel;
import com.student.response.Response;
import com.student.service.StudentServiceImpl;

@RestController
@RequestMapping(value="/rest/api/v1")
public class StudentController {

	@Autowired
	StudentServiceImpl studentService;
	
	@GetMapping(value="/", produces="application/json")
	public ResponseEntity<Response> getWelcomeMessage(){
		Response response = new Response();
		response.setMessage("Welcome To Student Manageent Page");
		response.setStatus(Boolean.TRUE);
		response.setCode(HttpStatus.OK.value());
		return new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.OK);
	}
	@PostMapping(value = "/create",consumes="application/json", produces="application/json")
	public ResponseEntity<StudentResponseModel> createStudent(@RequestBody StudentModel student){
		StudentResponseModel response = studentService.createStudent(student);
		response.setCode(HttpStatus.OK.value());
		response.setStatus(Boolean.TRUE);
		response.setMessage("Student Profile Created Successfully");
		return new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.OK);
	}
	@GetMapping(value="/student/{id}", produces="application/json")
	public ResponseEntity<StudentResponseModel> getStudentById(@PathVariable("id") int id){
		StudentResponseModel response = studentService.getStudentById(id);
		response.setCode(HttpStatus.OK.value());
		response.setStatus(Boolean.TRUE);
		return new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.OK);
	}
	@DeleteMapping(value="/delete/{id}",produces="application/json")
	public ResponseEntity<StudentResponseModel> deleteStudent(@PathVariable("id") int id){
		StudentResponseModel response = studentService.deleteStudent(id);
		response.setCode(HttpStatus.OK.value());
		response.setStatus(Boolean.TRUE);
		response.setMessage("Student Profile deleted Successfully");
		return new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.OK);
	}
	@PutMapping(value="/update", produces="application/json")
	public ResponseEntity<StudentResponseModel> updateStudent(@RequestBody StudentUpdateModel updateStd){
		System.out.println("Restust ::: "+updateStd.toString());
		StudentResponseModel response = studentService.updateStudent(updateStd);
		response.setCode(HttpStatus.OK.value());
		response.setStatus(Boolean.TRUE);
		response.setMessage("Student Profile updated Successfully");
		return new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.OK);
	}
}
