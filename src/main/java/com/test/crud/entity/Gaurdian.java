package com.test.crud.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Gaurdian {
	
	private String guardianName,guardianEmail,guardianMobile;

	public String getGuardianName() {
		return guardianName;
	}

	public String getGuardianEmail() {
		return guardianEmail;
	}

	public String getGuardianMobile() {
		return guardianMobile;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public void setGuardianEmail(String guardianEmail) {
		this.guardianEmail = guardianEmail;
	}

	public void setGuardianMobile(String guardianMobile) {
		this.guardianMobile = guardianMobile;
	}

	public Gaurdian(String guardianName, String guardianEmail, String guardianMobile) {
		this.guardianName = guardianName;
		this.guardianEmail = guardianEmail;
		this.guardianMobile = guardianMobile;
	}

	public Gaurdian() {
		// TODO Auto-generated constructor stub
	}

}
