package com.example.test.Services;

import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Entities.Student;
import com.example.Repositories.StudentRepository;
import com.example.Services.StudentManagerImpl;

@SpringBootTest
public class StudentManagerImplTest {
	@InjectMocks
	StudentManagerImpl studentManagerImpl;
	
	@Mock
	StudentRepository repo;
	
	@Test
	public List<Student> getAllStudentsTest()
	{
		when(null).thenReturn(repo);
		return studentManagerImpl.getAllStudents();
		 
	}
	
	private void createStudentStub()
	{
		//Student studentStub=Student.builder();
	}
}
