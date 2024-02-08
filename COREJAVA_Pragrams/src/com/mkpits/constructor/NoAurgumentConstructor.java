 package com.mkpits.constructor;
//A special Method  having same as class name is called as constructor
//constructor do not have return type 
//class name and constructor should be same
//their are tow type of constructor
//1)No Aurgument Constructor
//2) Parameterise Constructor

public class NoAurgumentConstructor 
//1)No Aurgument Constructor


{
	int rateOfPen=89;
	int rateOfPencile=50;
	
	
   public static void main(String[] args) {
		 
   NoAurgumentConstructor nac=new NoAurgumentConstructor();
   
	}
   // implementation
	
	   public NoAurgumentConstructor() {
		
		System.out.println("Pen :- "+rateOfPen+ "  Pencile :- "+rateOfPencile);
		
	}

	

}
