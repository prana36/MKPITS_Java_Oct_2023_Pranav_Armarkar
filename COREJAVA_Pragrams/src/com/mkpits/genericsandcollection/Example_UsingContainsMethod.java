package com.mkpits.genericsandcollection;

import java.util.ArrayList;
import java.util.List;

public class Example_UsingContainsMethod {

	public static void main(String[] args) {
		// Creating an object of List interface,
	    // implemented by ArrayList class
						
				List<String> lt = new ArrayList<String>();
				lt.add("Pranav");
				lt.add("kaustubh");
				lt.add("Ashik");
			    lt.add("Ashik");	
				//// Display the initial elements in List
				System.out.println(lt);
				
				System.out.println(lt.contains("kaustubh"));// it check weather element is present or not
						

	}

}
