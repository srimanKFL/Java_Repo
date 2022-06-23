package com.test.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.crud.dao.UserDao;
import com.test.crud.entity.User;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserDao userDao;
	
	
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userDao.findAll();
	}
	

	@GetMapping("/listBySort")
	public Page<User> listBySort(@RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "size", defaultValue = "3") Integer size){
		PageRequest request = PageRequest.of(page - 1, size);
		return userDao.findByOrderBySidDesc(request);
	}
	
	
	
	@GetMapping("/listByRole/{rolename}")
	public List<User> getUserByRole(@PathVariable String rolename){
		return userDao.findByUserrole(rolename);
	}
	
	@GetMapping("/user/{name}")
	public User getUser(@PathVariable String name){
		return userDao.findByUsername(name);
	}
	
	@GetMapping("/userById/{id}")
	public User getUser(@PathVariable int id){
		return userDao.findBySid(id);
	}
	
	@PostMapping("/insert-user")
	public User saveUser(@RequestBody User user) {
		return userDao.save(user);
	}
	
	
}
