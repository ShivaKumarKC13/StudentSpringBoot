package com.ty.Student.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.Student.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@PostMapping("{id}")
	public Student saveStudent(@PathVariable Student student) {
		return student;
	}

}
