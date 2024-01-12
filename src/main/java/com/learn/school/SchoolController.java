package com.learn.school;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/school")
public class SchoolController {
	
	private final SchoolService schoolService;

	public SchoolController(SchoolService schoolService) {
		this.schoolService = schoolService;
	}
	
	@PostMapping
	public School create(@RequestBody School school) {
		return schoolService.create(school);
	}
	
	@GetMapping()
	public List<School> findAll(@RequestBody School school) {
		return schoolService.findAll(school);
	}

}
