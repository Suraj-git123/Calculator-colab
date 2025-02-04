package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Student1;

public interface StudentRepository extends JpaRepository<Student1, Integer> {

}
