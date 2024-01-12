package com.learn.school;

import java.util.List;

public interface SchoolService {

	School create(School school);

	List<School> findAll(School school);

}
