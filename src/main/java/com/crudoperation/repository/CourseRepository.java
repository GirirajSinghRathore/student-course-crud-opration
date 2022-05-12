package com.crudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudoperation.model.Course;

public interface CourseRepository extends JpaRepository<Course	, Integer>{

}
