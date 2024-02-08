package com.mkpits.collectionwithlinkedlist;

import java.util.LinkedList;
import java.util.List;

public class Example_UsingAddMethod {

	public static void main(String[] args) {
		LinkedList<String> lt = new LinkedList<String>();
		lt.add("Pranav");
		lt.add("kaustubh");
		lt.add("Vaibhav");
	    lt.add("Ashik");
	    
		//// Display the initial elements in List
		System.out.println(" List Is :- "+lt);
		System.out.println("Size Of List is "+lt.size());
		
		// Add method 
		lt.add(1, "Harsh"); // to add element to particular index
		                    // it also increase size of list
		
		 // Adding new elements at the beginning 
        lt.addFirst("Name is "); 
        lt.addLast("At"); 
  
        // Displaying the new list 
        
		System.out.println("Update  List Is :- "+lt);
		System.out.println("Update Size Of List is "+lt.size());

	}

}
