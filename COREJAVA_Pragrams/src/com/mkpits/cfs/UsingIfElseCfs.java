package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingIfElseCfs {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("  ");  
		
		System.out.println("Enter User Name");
		String userName = br.readLine();
		
		System.out.println("Enter Password");
		String password = br.readLine();
		
		
		
		if (userName.equals("Shrikant")) {
			if (password.equals("shri")) {
				System.out.println("Login Sucessfully......");
			}else {
				System.out.println("Login Failed");
			}	
			
		}
		

	}
}