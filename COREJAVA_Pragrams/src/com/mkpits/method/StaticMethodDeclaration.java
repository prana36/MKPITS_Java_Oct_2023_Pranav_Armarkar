package com.mkpits.method;

public class StaticMethodDeclaration {

	public static void main(String[] args) {
		// Static Method
		//If method is defined using static keyword then it is called static method or class method because method scope belongs to class.
		// Their are Three type to call Static Method 
		
		//1DirectAccess
		getallData();
		System.out.println();
		System.out.println("Using Direct Access");
		
		//2ClassName.methodName()
		System.out.println("Using ClassName.methodName");
		StaticMethodDeclaration.getallData();
		System.out.println();
		
		
        //3First Creat Object 		
		//Objectref.methodName()
		StaticMethodDeclaration smd=new StaticMethodDeclaration();
		smd.getallData();
		System.out.println();
		System.out.println("Using 3First Creat Object//Objectref.methodName()");
		
   //implementation
	}

	public static void getallData() {
		getFirstName();
		getLastName();
		getEmail(); 
		getmobile();
		getgender();
		getPassword();
		
	}

	public static void getPassword() {
		String password= "mai nahi bataonga";
		System.out.println("Password is:- "+password);
		
	}

	public static void getgender() {
		String gender = "Male";
		System.out.println("Gender is :- "+gender);
		
	}

	public static void getmobile() {
		long mobile = 7890469694l;
		System.out.println("Mobile No. is:- "+mobile);
		
	}

	public static void getEmail() {
		String email= "pranavarmarkarf36@gmail.com";
		System.out.println("Email:- "+email);
		
	}

	public static void getLastName() {
		String lname= "Armarkar";
		System.out.println("last name is:- "+lname);
		
	}

	public static void getFirstName() {
		String name = "Pranav";
		System.out.println("my name is:- "+name);
		
	}

}
