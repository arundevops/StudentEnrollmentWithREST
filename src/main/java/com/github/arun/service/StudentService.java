package com.github.arun.service;

import com.github.arun.model.StudentInterface;

public interface StudentService {
	StudentInterface save(StudentInterface student);
	boolean findByLogin(String userName, String password);
	boolean findByUserName(String userName);
}
