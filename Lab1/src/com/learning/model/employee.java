package com.learning.model;

public class employee {

	private String firstname;
	private String lastName;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Parameterized Constructor
	public employee(String firstName, String lastname) {
		this.firstname = firstName;
		this.lastName = lastname;

	}
}
