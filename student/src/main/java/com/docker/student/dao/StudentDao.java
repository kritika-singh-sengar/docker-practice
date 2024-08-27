package com.docker.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.student.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{

}
