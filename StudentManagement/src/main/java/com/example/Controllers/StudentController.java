package com.example.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entities.Student;
import com.example.Services.StudentManager;
@RestController
@RequestMapping("api")
public class StudentController {
	@Autowired
	StudentManager manager;
	
	@GetMapping("/student")
	public List<Student> getStudent()
	{
		return manager.getAllStudents();
	}
	@PutMapping("/update/{id}")
	public void updateStud(@RequestBody Student std,@PathVariable int id)
	{
		manager.updateStudent(std, id);
	}
	
	@PostMapping("/add")
	public void addStud(@RequestBody Student stud)
	{
		manager.addStudent(stud);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		manager.deleteStudent(id);
	}
	
	@PatchMapping("/patch/{id}")
	public void updateStudentName(@PathVariable int id,@RequestBody Student stud)
	{
		manager.updateStudentName(id, stud);
	}
	@GetMapping("/findByName/{name}")
	public Student findByName(@PathVariable("name") String name)
	{
		return manager.findByName(name);
	}
	@GetMapping("/findByAge/{age}")
	public Student findByAge(@PathVariable("age") int age)
	{
		return manager.findByAge(age);
	}
}
