package com.app.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Student1;
import com.app.entity.Subject;
import com.app.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	ArrayList<Integer> list = new ArrayList();
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student1 s) {
		System.out.println(s);
		service.saveStudent(s);
		return "student saved successfully";
	}
	@GetMapping("/get/{rollno}")
	public Student1 getStudent(@PathVariable Integer rollno) {
		Student1 s = service.getStudent(rollno);
		return s;
	}
	@PatchMapping("/result/{rollno}")
	public Student1 percentage(@PathVariable Integer rollno) {
		Student1 s = service.getStudent(rollno);
		
		for (Subject sub : s.getSubject()) {
	    	Integer marks = sub.getMarks();
	    	list.add(marks);	
		}
	    Integer size = list.size();
	    System.out.println(size);
	    Integer totalMarks =0;
	    for (Integer marks : list) {
	    	totalMarks = totalMarks+marks;	
		}
	    System.out.println(totalMarks);
	    Double percent =(double) ((totalMarks*100)/(size*100));
	    s.setPercentage(percent);
	    System.out.println(percent);
	    
	    
	    if (percent>=35) {
	    	s.setResult("PASSED");	
		}else {
			s.setResult("FAILED");
		}
	    service.saveStudent(s);
	    
	   Student1 student = service.getStudent(rollno);
	   
	   return student;
		
	}

}
