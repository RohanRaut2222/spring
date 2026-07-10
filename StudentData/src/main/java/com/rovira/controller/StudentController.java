package com.rovira.controller;

import java.util.Map;
import java.util.Scanner;
import com.rovira.exceptions.RecordAlreadyExistException;
import com.rovira.exceptions.RecordNotFoundException;
import com.rovira.model.Students;
import com.rovira.service.StudentService;

public class StudentController {
	
	StudentService studentService;
	
	public StudentController(StudentService studentService)
	{
		this.studentService = studentService;
	}

	public void createStudent()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter studentId: ");
		String studentId = sc.nextLine();
		
		System.out.println("Enter student name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter student city: ");
		String city = sc.nextLine();
		
		System.out.println("Enter student percentage: ");
		double percentage = sc.nextDouble();
		Students studentData = new Students(name, city, percentage);
		
		try
		{
		studentService.createStudent(studentId, studentData);
		}
		catch(RecordAlreadyExistException ex)
		{
			System.out.println(ex.getMessage());
		}

		return;
	}
	
	public void getAllStudents()
	{
		
		try
		{
			Map<String, Students> studentDetails = studentService.getAllStudents();
			for(Students student : studentDetails.values())
			{
				System.out.println(student);
			}
		}
		catch(RecordNotFoundException ex)
		{
			System.out.println(ex.getMessage());
		}
		return;
	}
	
	public void getById()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter StudentId: ");
		String studentId = sc.nextLine();
		try
		{
			Students student = studentService.getById(studentId);
			System.out.println(student);
		}
		catch(RecordNotFoundException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void deleteById()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter StudentId: ");
		String studentId = sc.nextLine();
		
		try
		{
			studentService.deleteById(studentId);
		}
		catch(RecordNotFoundException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void startApplication()
	{
		int choice;
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("1: Create student");
			System.out.println("2: Get all students");
			System.out.println("3: Get student by studentId");
			System.out.println("4: Delete student by studentId");
			System.out.println("5: Exit");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
				createStudent();
				break;
			
			case 2:
				getAllStudents();
				break;
			case 3:
				getById();
				break;
			case 4:
				deleteById();
				break;
			case 5:
				System.exit(1);
			
			}
		}
	}

}
