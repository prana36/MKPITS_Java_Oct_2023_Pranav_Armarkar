package com.mkpits.model;

public class Student 
{
	private String firstName ;
	private String lastName ;
	private boolean isGoldCustomer ;
	public Student(String firstName, String lastName, Boolean isGoldCustomer) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.isGoldCustomer = isGoldCustomer;
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
	public boolean getIsGoldCustomer() {
		return isGoldCustomer;
	}
	public void setIsGoldCustomer(Boolean isGoldCustomer) {
		this.isGoldCustomer = isGoldCustomer;
	}
	
}
