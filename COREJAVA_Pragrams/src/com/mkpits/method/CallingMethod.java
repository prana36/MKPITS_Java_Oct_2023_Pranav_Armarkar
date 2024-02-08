package com.mkpits.method;

public class CallingMethod {

	public static void main(String[] args)   //-calling methode
	//I can change some data from clas(MethodWithArgumentAndNoReturnType)And print 
	{
		String user = "MKPITS";
		String name ="Ashik";
		String lastname= "Tembhare";
		String email= "ashike36@gmail.com";
		long mobile = 7696969696l;
		char gender = 'M';
		String password= "Hmm";
		
		MethodWithArgumentAndNoReturnType change = new MethodWithArgumentAndNoReturnType();
		change.getuserName(user);
		change.getName(name);;
		change.getName(lastname);
		change.getEmail(email);
		change.getmobile(mobile);
		change.getgender(gender);
		change.getPassword(password);
		
		
		
		
		
		change.getuserName(user);
		change.getName(name);;
		change.getName(lastname);
		change.getEmail(email);
		change.getmobile(mobile);
		change.getgender(gender);
		change.getPassword(password);
		
		
				

	}

}
