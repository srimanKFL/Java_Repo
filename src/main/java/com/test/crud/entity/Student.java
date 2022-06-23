package com.test.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Builder;

@Entity
@Builder
@Table(name = "tbl_Student", uniqueConstraints = @UniqueConstraint(

		name = "emailId", columnNames = "email_address")

)
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long studentId;
	private String firstName;
	private String lastName;
	
	@Column(name = "email_address",nullable = false)
	private String emailId;
	
	private Gaurdian guardian;

	
	public long getStudentId() {
		return studentId;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getEmailId() {
		return emailId;
	}


	public Gaurdian getGuardian() {
		return guardian;
	}


	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public void setGuardian(Gaurdian guardian) {
		this.guardian = guardian;
	}


	public Student(String firstName, String lastName, String emailId, Gaurdian guardian) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.guardian = guardian;
	}


	public Student() {
		// TODO Auto-generated constructor stub
	}

}
