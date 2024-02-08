package com.mkpits.genericsandcollection;

import java.util.ArrayList;
import java.util.List;

public class Example_usingGetMethod {

	public static void main(String[] args) {
		// Creating an object of List interface,
		   // implemented by ArrayList class
								
			  List<String> lt = new ArrayList<String>();
				lt.add("Pranav");
				lt.add("kaustubh");
				lt.add("Ashik");
				lt.add("Pranav");
				lt.add("kaustubh");
			// Display the initial elements in List
			 System.out.println("Initial Elements is :- "+lt);
			 
			 String first = lt.get(0); // it is use to get value of particular index
			 String second = lt.get(4);
			 
			 System.out.println(first);
			 System.out.println(second);
			 
			 

	}

}
