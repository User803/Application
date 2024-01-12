package com.learn.student;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {	
	
	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	public Student save(@RequestBody Student student) {
		return studentService.save(student);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Student> findAllStudents() {
		return studentService.findAllStudents();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Student findStudentById(@PathVariable Integer id) {
		return studentService.findStudentById(id);
	}
	
	@GetMapping("/name/{firstName}")
	@ResponseStatus(HttpStatus.OK)
	public List<Student> findStudentByFirstName(@PathVariable String firstName) {
		return studentService.findByFirstName(firstName);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public String delete(@PathVariable Integer id) {
		studentService.delete(id);
		return "Deletion successful";
	}
	
	
}