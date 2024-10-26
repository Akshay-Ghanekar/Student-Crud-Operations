package com.example.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Entities.Student;

import jakarta.transaction.Transactional;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	@Modifying
    @Transactional
	@Query("update Student s set s.name=:name,s.address=:add,s.age=:age,s.email=:email where s.id=:id" )
	void updateStudent(@Param("name") String name,
			@Param("add")String add,
			@Param("age")int age,
			@Param("email")String email,
			@Param("id") int id);
	/*@Query("update Student s set s.name=:name where s.id=:id")
	void updateStudentName(@Param("id") int id,
			@Param("name") Student stud);*/
	Student findByName(String name);
	Student findByAge(int age);
}
