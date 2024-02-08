package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingIfCfs {
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Email :- ");
		String email = br.readLine();
		
		System.out.println("Enter Password");
		String password = br.readLine();
		
		
		if (email.equals("")) {
			System.out.println("User Name Required");
			
		}
		if (password.equals("")) {
			System.out.println("Password Required");
			
		}
		if (email.equals("p36@gmail.com") && password.equals("p123") ) {
			System.out.println("Verified");			
			
		}
		
	}

}
