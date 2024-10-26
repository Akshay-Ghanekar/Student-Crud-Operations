package com.example.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entities.Student;
import com.example.Repositories.StudentRepository;

@Service
public class StudentManagerImpl implements StudentManager {
	
	@Autowired
	StudentRepository repo;
	
	@Override
	public void addStudent(Student stud) {
		repo.save(stud);
		
	}

	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	@Override
	public void updateStudent(Student stud, int id) {
		repo.updateStudent(stud.getName(), stud.getAddress(), stud.getAge(), stud.getEmail(), id);
		
	}

	@Override
	public void deleteStudent(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public void updateStudentName(int id, Student stud) {
		//repo.updateStudentName(id, stud);
		
		Optional<Student> s=repo.findById(id);
		
		Student student=s.get();
		
		student.setName(stud.getName());
		repo.save(student);
		
	}

	@Override
	public Student findByName(String name) {
		return repo.findByName(name);
	}

	@Override
	public Student findByAge(int age) {
		return repo.findByAge(age);
	}

}
