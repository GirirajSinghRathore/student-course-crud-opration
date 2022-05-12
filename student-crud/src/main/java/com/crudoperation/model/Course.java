package com.crudoperation.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course_table")
public class Course {
	
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int courseId;
	
	private String courseName;
	@ManyToMany(targetEntity=Student.class) 
	
	private Set<Student> student;

	public Course(int courseId, String courseName, Set<Student> student) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.student = student;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}
	
	
}
