package com.mkpits.genericsandcollection;

import java.util.ArrayList;
import java.util.List;

public class Example_UsingRemoveMethod 
{

	public static void main(String[] args) {
		// Creating an object of List interface,
	   // implemented by ArrayList class
						
	  List<String> lt = new ArrayList<String>();
		lt.add("Pranav");
		lt.add("kaustubh");
		lt.add("Ashik");
		lt.add("Pranav");
		lt.add("kaustubh");
	//// Display the initial elements in List
	 System.out.println("Initial Elements is :- "+lt);
		
		lt.remove(2);// it remove element form index 1
		
		//Display Update 
		System.out.println("Display Update List :- "+lt);
		
		lt.remove("kaustubh");// it remove 1sft occurrence of element
		
		//Display Update
		System.out.println("Display Update List :- "+lt);
		
						

	}

}
