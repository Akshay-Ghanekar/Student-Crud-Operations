package com.example.Services;

import java.util.List;

import com.example.Entities.Student;

public interface StudentManager {
	void addStudent(Student stud);
	List<Student> getAllStudents();
	void updateStudent(Student stud,int id);
	void deleteStudent(int id);
	void updateStudentName(int id,Student stud);
	Student findByName(String name);
	Student findByAge(int age);
}
