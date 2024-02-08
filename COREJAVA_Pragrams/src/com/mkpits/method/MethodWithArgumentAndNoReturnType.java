package com.mkpits.method;

public class MethodWithArgumentAndNoReturnType {
	
	public static void main(String[] args) 
	// calling methode
	{
		String user = "MKPITS";
		String name ="Pranav";
		String lastname= "Armarkar";
		String email= "pranavarmarkarf36@gmail.com";
		long mobile = 7890469694l;
		char gender = 'M';
		String password= "mai nahi bataonga";
		
		//creat object
		MethodWithArgumentAndNoReturnType data= new MethodWithArgumentAndNoReturnType();
		data.getuserName(user);
		data.getName(name);
		data.getlastName(lastname);
		data.getEmail(email);
		data.getmobile(mobile);
		data.getgender(gender);
		data.getPassword(password);
		
		
	}

	public void getuserName(String user) {
		// //called method
		System.out.println("My User Name Is :- "+user);
		
	}

	public  void getPassword(String password) {
		//called method
		System.out.println("My Password is :- "+password);
		
	}

	public void getgender(char gender) {
		//called method
		System.out.println("Gender:- "+gender);
		
	}

	public void getmobile(long myMobile) {
		//called method
		//In parameter data shoud be same as passing data and variable must diff
		System.out.println("Mobile No.:- "+myMobile);
		
	}

	public void getEmail(String email) {
		//called method
		System.out.println("My Email Is :- "+email);
		
	}

	public  void getlastName(String lastname) {
		//called method
		System.out.println("My Last Name Is :- "+lastname);
		
	}

	public void getName(String name) {
		//called method
		System.out.println("Mys First Name Is:- "+name);
		
	}

}
