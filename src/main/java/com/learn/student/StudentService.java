package com.learn.student;

import java.util.List;

public interface StudentService {
	
	Student save(Student student);
	
	Student findStudentById(Integer id);
	
	List<Student> findAllStudents();
	
	List<Student> findByFirstName(String firstName);
	
	void delete(Integer id);

}