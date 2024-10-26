package com.example.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*INSERT INTO Student (stud_id, stud_name, stud_address, stud_age, stud_mail) VALUES
(1, 'Aarav Sharma', '123, MG Road, Bangalore', 21, 'aarav.sharma@example.com'),
(2, 'Vivaan Patel', '456, Jayanagar, Bangalore', 22, 'vivaan.patel@example.com'); */
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "student") 
public class Student {
	@Id
	@Column(name = "stud_id")
	private int id;
	@Column(name = "stud_name")
	private String name;
	@Column(name = "stud_address")
	private String address;
	@Column(name = "stud_age")
	private int age;
	@Column(name = "stud_mail")
	private String email;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", email=" + email
				+ "]";
	}
	
	
}
