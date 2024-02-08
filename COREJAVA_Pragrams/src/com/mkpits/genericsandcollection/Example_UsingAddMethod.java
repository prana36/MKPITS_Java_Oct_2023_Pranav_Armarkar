package com.mkpits.genericsandcollection;

import java.util.ArrayList;
import java.util.List;

public class Example_UsingAddMethod {

	public static void main(String[] args) {
		// Creating an object of List interface,
		// implemented by ArrayList class
		
		List<String> lt = new ArrayList<String>();
		lt.add("Pranav");
		lt.add("kaustubh");
		lt.add("Ashik");
		lt.add("Ashik");
		
		// Add Method
		lt.add(1, "%%%%%");// it  use add value to particular index  
		
		//// Display the initial elements in List
		System.out.println(lt);
		
		
		System.out.println(lt.get(3).equals("Ashik"));
		
	}

}
