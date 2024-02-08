package com.mkpits.userInput;

import java.io.IOException;

public class CallingRegistrationForm {

	public static void main(String[] args) throws IOException {
		RegistrationForm rf = new RegistrationForm();
         rf.alldetails();
         
         
         System.out.println("===========================================================================");
         System.out.println("===========================================================================");
         System.out.println("Details Added");
         
         
         
        System.out.println("Enter Name:- "+rf.name);
 		
 		System.out.println("Enter Email:- "+rf.email );
 		
 		System.out.println("Enter Pancard :- "+rf.pancard);
 	
 		System.out.println("Enter Gender:- "+rf.gender );
 		
 		System.out.println("Enter Designation:- "+rf.designation );
 		
 		System.out.println("Enter Age:- "+rf.age );
 		
 		System.out.println("Enter Mobile :- "+rf.mobile );

 		System.out.println("Enter Aadhar No :- "+rf.aadharNo );
 		
         
         
         
	}

	
   
}
