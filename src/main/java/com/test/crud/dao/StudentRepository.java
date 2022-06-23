package com.test.crud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.crud.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

    
	public List<Student> findByFirstName(String name);
	public List<Student> findByFirstNameContaining(String name);
	public Student findByGuardianGuardianName(String name);
	
	//JPQL
	@Query("select s.firstName from Student s where s.emailId = ?1")// have to specify exact field values.
	String getStudentFirstNameByEmailAddress(String emailId);
	
	//native sql query
	@Query(value="SELECT * FROM tbl_student s where s.email_address=?1",nativeQuery = true)
	String getStudentByEmailAddressNative(String emailId);
	
	//native named parameters
	
	@Query(value="SELECT * FROM tbl_student s where s.email_address=:emailId",nativeQuery = true)
	String getStudentByEmailAddressNamed(@Param("emailId") String emailId);
	
	
	
}
