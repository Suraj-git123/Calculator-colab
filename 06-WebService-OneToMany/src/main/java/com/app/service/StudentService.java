package com.app.service;

import com.app.entity.Student1;

public interface StudentService {

	void saveStudent(Student1 s);

	Student1 getStudent(Integer rollno);

}
