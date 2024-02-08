package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SuperClassData {
	
	 String fName,lName,email;
	 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	
	void getfName() throws IOException{
		System.out.print("Enter First Name: " );
		 while (true) {
	    	 fName = br.readLine();
	    	 if (fName.isEmpty()) {
	    		 System.out.println("Plz Enter First Name ");
	    		 continue;
				
			}break;
		 }
		
		this.fName=fName;
	}
	 
	 void getlName() throws IOException {
		 System.out.print("Enter Last Name ");
		 while (true) {
			 
	    	 lName = br.readLine();
	    	 if (lName.isEmpty()) {
	    		 System.out.println("Plz Enter Last Name ");
	    		 continue;
				
			}break;
		 }
		 this.lName=lName ;  
	 }
	  
	 void getemail() throws IOException {
		 
		 System.out.print("Enter Email ");
		 while (true) 
		 {
		 
			email = br.readLine();

			//Regular Expression   
	        String regex = "^(.+)@(.+)$";  
	        //Compile regular expression to get the pattern  
	        Pattern pattern = Pattern.compile(regex);    
	        //Create instance of matcher   
	        Matcher matcher = pattern.matcher(email);  
	        if (!matcher.matches() || email.isEmpty()) 
	        {
					System.out.println("Please Enter Valid Email"); 
					continue;
	        }
//	    	 if (email.isEmpty()) 
//	    	 {
//	    		 System.out.println("Plz Enter Email ");
//	    		 continue;
//	    	
//			}
	        break;
		 }
		 this.email=email;
	 }

}
