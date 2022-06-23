package com.test.crud.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")

public class User {

	@Id
	private String sid;
	
	private String username;
	
	private String userrole;

	public String getSid() {
		return sid;
	}

	public String getUsername() {
		return username;
	}

	public String getUserrole() {
		return userrole;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	public User() {
		
	}

	public User(String sid, String username, String userrole) {
		this.sid = sid;
		this.username = username;
		this.userrole = userrole;
	}
	
	
}
