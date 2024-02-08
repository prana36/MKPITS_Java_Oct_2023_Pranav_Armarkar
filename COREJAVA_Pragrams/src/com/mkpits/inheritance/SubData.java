package com.mkpits.inheritance;

import java.io.IOException;

public class SubData extends SuperClassData { 
	String gender,mob,pinCode;
	
	
  
	
	void getDetails() {
	System.out.println("My First Name Is "+fName);
	System.out.println("My Last Name Is "+lName);
	System.out.println("My Email is "+email); 
	System.out.println("My Mobile No. is "+mob);
	System.out.println("My Gender is "+gender);
	System.out.println("My PinCode is "+pinCode);	
	}

	void getMobile() throws NumberFormatException, IOException {
		 System.out.print("Enter Mobile No. ");
		 while (true) {
			 
			 mob=br.readLine();
			 if (mob.isEmpty()) {
	    		 System.out.println("Plz Enter Mobile No. ");
	    		 continue;
				
			}break;
		 }
		this.mob=mob;
	}
	
	void getGender() throws IOException {
		 while (true) {
			 gender = br.readLine();
	    	 if (gender.isEmpty()) {
	    		 System.out.println("Plz Enter gender ");
	    		 continue;
				
			}break;
		 }
		
		this.gender=gender;
	}
	
	void getPinCode() throws IOException {
		 System.out.print(" Enter PinCode ");
		
		while (true) {
			pinCode = br.readLine();
	    	 if (pinCode.isEmpty()) {
	    		 System.out.println("Plz Enter PinCode ");
	    		 continue;
				
			}break;
		 }
		this.pinCode=pinCode;
	}
	
}
