package com.learn.school;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class SchoolServiceImpl implements SchoolService {

	private final SchoolRepository schoolRepository;

	public SchoolServiceImpl(SchoolRepository schoolRepository) {
		this.schoolRepository = schoolRepository;
	}

	@Transactional(readOnly = false)
	@Override
	public School create(School school) {
		return schoolRepository.save(school);
	}

	@Override
	public List<School> findAll(School school) {
		return schoolRepository.findAll();
	}
	
		
}
