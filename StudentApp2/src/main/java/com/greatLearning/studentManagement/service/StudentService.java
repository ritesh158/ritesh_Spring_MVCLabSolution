package com.greatLearning.studentManagement.service;

import org.springframework.stereotype.Service;
import java.util.*;
import com.greatLearning.studentManagement.entity.*;

@Service
public interface StudentService {
	
	//4 operations
	public List<Student> findAll();
	public Student findById(int id);
	public void save(Student theStudent);
	public void deleteById(int theId);

}