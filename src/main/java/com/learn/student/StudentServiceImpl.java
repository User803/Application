package com.learn.student;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class StudentServiceImpl implements StudentService {
	
	private final StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Transactional(readOnly = false)
	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student findStudentById(Integer id) {
		return studentRepository.findById(id)
					.orElseThrow();
	}

	@Override
	public List<Student> findAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public List<Student> findByFirstName(String firstName) {
		return studentRepository.findAllByFirstNameContaining(firstName)
						.orElseThrow();
	}

	@Transactional(readOnly = false)
	@Override
	public void delete(Integer id) {
		studentRepository.deleteById(id);
	}
	
}