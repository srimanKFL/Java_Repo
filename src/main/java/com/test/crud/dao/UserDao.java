package com.test.crud.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.crud.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

  
	public User findByUsername(String username);
	public User findBySid(int sid);
	public Page<User> findAllByUsernameOrderBySidDesc(String username, Pageable pageable);
	public List<User> findByUserrole(String userrole);
	public Page<User> findByOrderBySidDesc(Pageable pageable);
}
