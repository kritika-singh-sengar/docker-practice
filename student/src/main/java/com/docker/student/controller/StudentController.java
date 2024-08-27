package com.docker.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.student.model.Student;
import com.docker.student.service.StudentService;

@RestController
@RequestMapping("/school")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudent() {
		List<Student> allStudent = studentService.getAllStudent();
		return new ResponseEntity<List<Student>>(allStudent, HttpStatus.ACCEPTED);
	}
}
