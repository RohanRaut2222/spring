package com.rovira.service;

import java.util.Map;
import com.rovira.model.Students;
import com.rovira.repository.StudentRepository;

public class StudentService {
	
	StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository)
	{
		this.studentRepository = studentRepository;
	}
	
	public void createStudent(String studentId, Students StudentData)
	{
		studentRepository.createStudent(studentId, StudentData);
		return;
	}
	
	public Map<String, Students> getAllStudents()
	{
		return studentRepository.getAllStudents();
	}
	
	public Students getById(String studentId)
	{
		return studentRepository.getById(studentId);
	}

	public void deleteById(String suudentId)
	{
		studentRepository.deleteById(suudentId);
	}

}
