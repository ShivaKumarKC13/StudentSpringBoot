package com.ty.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.Student.model.Student;

public interface StudentRepositoy extends JpaRepository<Student, Integer>{

}
