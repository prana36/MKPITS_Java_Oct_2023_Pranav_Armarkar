package com.mkpits.constructor;

public class ParameterisedConstructor 
{
	int mob;
	char gender;
	
	public static void main(String[] args) {
		
		//ParameterisedConstructor pc=new ParameterisedConstructor();
		
		
		ParameterisedConstructor pc1=new ParameterisedConstructor(78787878 , 'M');
		
		
		ParameterisedConstructor pc2=new ParameterisedConstructor(pc1);
		
		
	}
	
	public ParameterisedConstructor(int mob , char gender ) 
	{
		System.out.println("Mobile:- "+mob+ "     Gender:-  "+gender);
		
	}

	public ParameterisedConstructor(ParameterisedConstructor pc1) {
		mob=pc1.mob;
		gender=pc1.gender;
		System.out.println(mob);
		System.out.println(gender);
		
	}
	
	public ParameterisedConstructor() {
		System.out.println("No Aurgument constructor");
		System.out.println(mob);
		System.out.println(gender);
	}

	public void getDetails() {
		System.out.println(mob);
		System.out.println(gender);
	}
	
}
	


