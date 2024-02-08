package com.mkpits.userInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class RegistrationForm {

	public String name,email,pancard,gender,designation;
	int age;
	long mobile,aadharNo;

	public static void main(String[] args) throws IOException {
		RegistrationForm rd=new RegistrationForm();
		rd.alldetails();
	}

	 public void alldetails() throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Name:- " );
		this.name = br.readLine();
		
		System.out.print("Enter Email:- " );
		this.email=br.readLine();
		
		System.out.print("Enter Pancard :- ");
		this.pancard=br.readLine();
		
		System.out.print("Enter Gender:- " );
		this.gender=br.readLine();
		
		System.out.print("Enter Designation:- " );
		this.designation=br.readLine();
		
		
		
		
		System.out.print("Enter Age:- " );
		this.age=Integer.parseInt(br.readLine());
		 
		
		System.out.print("Enter Mobile :- " );
		this.mobile=Long.parseLong(br.readLine());
		
		System.out.print("Enter Aadhar No :- " );
		this.aadharNo=Long.parseLong(br.readLine());
		
		
	}

	

}
