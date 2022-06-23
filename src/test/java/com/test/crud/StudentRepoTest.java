package com.test.crud;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.crud.dao.StudentRepository;
import com.test.crud.entity.Student;
@SpringBootTest
public class StudentRepoTest {
	@Autowired
	StudentRepository studentRepo;
//	@Test
//	public void saveStudent() {
//		Student stu = new Student("venkat", "jonnakuti", "venkat@gmail.com",new Gaurdian("padma", "padma@gmail.com", "9985530354"));
//		studentRepo.save(stu);
//		
//	}
//	
//	@Test
//	public void showAll() {
//		List<Student> stu = studentRepo.findAll();
//		for(Student s: stu) {
//			System.out.println(s);
//		}
//	}
	
//	@Test
//	public void findByfirstname() {
//		String name = "venkey";
//		List<Student> stuList =studentRepo.findByFirstName(name);
//		for(Student s: stuList) {
//			System.out.println(s.getFirstName());
//		}
//		
//	}
	
//	@Test
//	public void findByfirstname() {
//		List<Student> stuList =studentRepo.findByFirstNameContaining("ve");
//		for(Student s: stuList) {
//			System.out.println(s.getFirstName());
//		}
//		
//	}
	
	
//	@Test
//	public void getStudentByEmailAddress() {
//		System.out.println("hi");
//		String stuList =studentRepo.getStudentFirstNameByEmailAddress("venkat@gmail.com" );
//		System.out.println(stuList);
//	}
	
//	
//	@Test
//	public void getStudentByEmailAddressNative() {
//		System.out.println("hi");
//		String stuList =studentRepo.getStudentByEmailAddressNative("venkat@gmail.com" );
//		System.out.println(stuList);
//	}
	

	@Test
	public void getStudentByEmailAddressNamed() {
		System.out.println("hi");
		String stuList =studentRepo.getStudentByEmailAddressNamed("venkat@gmail.com" );
		System.out.println(stuList);
	}
}
