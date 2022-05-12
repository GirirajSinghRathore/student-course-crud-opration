package com.crudoperation.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student {
	
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
	private int studentId;
	
	private String name;
	
	private String phone;
	
	
	@ManyToMany(targetEntity=Course.class,cascade = {CascadeType.ALL})  
	@JoinTable(
			  name = "course", 
			  joinColumns = @JoinColumn(name = "studentId"), 
			  inverseJoinColumns = @JoinColumn(name = "courseId"))
	private Set<Course> course;


	public Student(int studentId, String name, String phone, Set<Course> course) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.phone = phone;
		this.course = course;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Set<Course> getCourse() {
		return course;
	}


	public void setCourse(Set<Course> course) {
		this.course = course;
	}
	
	
	
	

}
