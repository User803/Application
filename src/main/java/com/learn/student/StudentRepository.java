package com.learn.student;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	Optional<List<Student>> findAllByFirstNameContaining(String firstName);
}
