package com.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Student1;
import com.app.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository repo;

	@Override
	public void saveStudent(Student1 s) {
		repo.save(s);	
	}

	@Override
	public Student1 getStudent(Integer rollno) {
		Optional<Student1> byId = repo.findById(rollno);
		if(byId.isPresent()) {
			Student1 s = byId.get();
			return s;
		}
		return null;
	}

}
