package com.crudoperation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudoperation.model.Course;
import com.crudoperation.model.Student;
import com.crudoperation.repository.CourseRepository;
import com.crudoperation.repository.StudentRepository;


@RestController
@RequestMapping("/student")
public class StudentController {
	/*
	 * Add a Course [Name, Professor Name, Description]  Add a Student [Name,
	 * Email, Phone]  Allocate a Student to one or more Course  List Students
	 * [Name, Email, Phone, Course Enrolled (comma separated string)]  Delete a
	 * given Course  Should be Get a Students data for a given Course
	 */
	@Autowired
	private StudentRepository sr;
	@Autowired
	private CourseRepository cr;
	@PostMapping("/add-student")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		System.out.println("In create Category");
		
		return new ResponseEntity<Student>(sr.save(student), HttpStatus.CREATED);
	}
	
	@PostMapping("/add-student")
	public ResponseEntity<Course> createCourse(@RequestBody Course c) {
		
		 
		return new ResponseEntity<Course>(cr.save(c), HttpStatus.CREATED);
	}
}
