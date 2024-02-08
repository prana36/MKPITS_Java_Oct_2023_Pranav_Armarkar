package com.mkpits.genericsandcollection;

import java.util.ArrayList;
import java.util.List;

public class Example_UsingSetMethod {
	
	public static void main(String[] args) {
		// Creating an object of List interface,
		// implemented by ArrayList class
		
		List<String> lt = new ArrayList<String>();
		lt.add("Pranav");
		lt.add("kaustubh");
		lt.add("Ashik");
		
	   //// Display the initial elements in List
	   System.out.println("Initial Elements is :- "+lt);
		
		// set Method
		lt.set(1, "%%%%%");// it  use replace value of particular index  
		
	    //// Display the update elements in List
		System.out.println("After using Set Method\n"+lt);
		
	}

}
