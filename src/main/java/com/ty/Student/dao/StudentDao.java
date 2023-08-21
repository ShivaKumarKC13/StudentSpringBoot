package com.ty.Student.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.Student.model.Student;
import com.ty.Student.repository.StudentRepositoy;

@Repository
public class StudentDao {

	@Autowired
	StudentRepositoy repositoy;

	public Student saveStudent(Student student) {
		return repositoy.save(student);
	}
}
