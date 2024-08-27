package com.docker.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docker.student.dao.StudentDao;
import com.docker.student.model.Student;

import net.bytebuddy.implementation.bytecode.Throw;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public List<Student> getAllStudent() {
		try {
			return studentDao.findAll();
		} catch(Exception e) {
			throw new RuntimeException("There is no data available");
		}
	}
}
