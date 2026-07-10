package com.rovira.repository;

import java.util.HashMap;
import java.util.Map;
import com.rovira.exceptions.RecordAlreadyExistException;
import com.rovira.exceptions.RecordNotFoundException;
import com.rovira.model.Students;

public class StudentRepository {

	Map<String, Students> studentDetails = new HashMap<String, Students>();
	
	public void createStudent(String studentId, Students studentData)
	{
		if(studentDetails.containsKey(studentId))
		{
			throw new RecordAlreadyExistException("Record Already exist for SutdentId: "+studentId);
		}
		else
		{
			studentDetails.put(studentId, studentData);
		}
		return;
	}
	
	public Map<String, Students> getAllStudents()
	{
		if(studentDetails.size()!=0)
		{
			return this.studentDetails;
		}
		else
		{
			throw new RecordNotFoundException("Students Record not found");
		}
	}
	
	public Students getById(String studentId)
	{
		if(studentDetails.containsKey(studentId))
		{
			return studentDetails.get(studentId);
		}
		else
		{
			throw new RecordNotFoundException("Record not found for StudentId: "+studentId);
		}
	}
	
	public void deleteById(String studentId)
	{
		if(studentDetails.containsKey(studentId))
		{
			studentDetails.remove(studentId);
		}
		else
		{
			throw new RecordNotFoundException("Record not found for StudentId: "+studentId);
		}
	}
}
