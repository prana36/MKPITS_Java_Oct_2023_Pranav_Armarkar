package com.mkpits.genericsandcollection;

import java.util.ArrayList;
import java.util.List;

public class Example_UsingIndexOfMethod {

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
				
				// IndexOf Method is use to check index value of elements
				int str = lt.indexOf("Pranav");// it give 1st Occurrence of Element  
				//display index vale
				System.out.println("index value is :- "+str);
				
				System.out.println(lt.lastIndexOf("kaustubh"));// it give Last Occurrence of Element
				
				

	}

}
