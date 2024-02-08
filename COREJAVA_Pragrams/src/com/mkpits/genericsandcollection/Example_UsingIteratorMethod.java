package com.mkpits.genericsandcollection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Example_UsingIteratorMethod {

	public static void main(String[] args) {
		
      List<String> lt = new ArrayList<String>();
       lt.add("Pranav");
       lt.add("kaustubh");
       lt.add("Ashik");
       lt.add("Ashik");	
       //// Display the initial elements in List
       System.out.println(lt);
      
       ListIterator<String> list = lt.listIterator();
       
       System.out.println("Forward print");
       
       while (list.hasNext()) 
       {
    	   System.out.println(list.next());
		
	   }
       
       System.out.println("\nBackward print");
       while (list.hasPrevious()) 
       {
    	   System.out.println(list.previous());
		
	   }
	}

}
