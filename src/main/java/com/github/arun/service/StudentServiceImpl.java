package com.github.arun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.arun.model.Student;
import com.github.arun.model.StudentInterface;
import com.github.arun.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Transactional
	public StudentInterface save(StudentInterface student) {
		return studentRepository.save((Student)student);
	}

	public boolean findByLogin(String userName, String password) {	
		StudentInterface stud = studentRepository.findByUserName(userName);
		
		if(stud != null && stud.getPassword().equals(password)) {
			return true;
		} 
		
		return false;		
	}

	public boolean findByUserName(String userName) {
		StudentInterface stud = studentRepository.findByUserName(userName);
		
		if(stud != null) {
			return true;
		}
		
		return false;
	}
}
