package com.mkpits.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopyMethod {
	String studentName[]= {"Pranav","Ashik","Manish","Kaustubh","Vaibhav","Raj","Gunjan","Sami"};
	

	public static void main(String[] args) {
		//calling Method
		ArrayCopyMethod acm= new ArrayCopyMethod();
		acm.copyOf();
		acm.copyOfRange();
		    
	}

	private void copyOfRange() {
		 System.out.println("Copy Of Range Array");
			// Arrays.copyOfRange(arrayname,from, to); ->it is used insert range value in Array
		     // and print range values 
			String employe1[]=Arrays.copyOfRange(studentName, 2,6);
			for (String e1 : employe1) {
				System.out.println(e1);
				
			}
		
	}


	private void copyOf() {
		System.out.println("Copy Of ");
		// Arrays.copyOf(arrayName,EndPossition)-> it is used copy elements Array to Array by giving end possition 
		String employe[]= Arrays.copyOf(studentName, 5);
		for (String e : employe) {
			System.out.println(e);
			
		
	  }

	}
}
