package com.mkpits.method;

public class AllTypeOfMethod
{ 
	//Static Method without using return type
	public static void getSports() {
		String details = "Cricket";
		System.out.println(details);
		
	}
	
	// static Method with return type 
	public static long getmyWork()
	{
		long mobile = 7890469694l;
		return mobile;
	}
	
	//NonStatic Method without return type
	public void  getMail() {
		String email= "pranavarmarkarf36@gmail.com";
		System.out.println(email);
	}
	//Non static method with return type
	public char getGender() {
		char gender = 'M';
		return gender;
	}
} 