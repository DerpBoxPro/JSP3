package com.derp;

public class Student {
	private String firstName;
	private String lastName;
	private String role;
	public Student(String firstName, String lastName, String role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
