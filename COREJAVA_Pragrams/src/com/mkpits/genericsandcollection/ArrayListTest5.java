package com.mkpits.genericsandcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest5 {

	public static void main(String[] args) {
		 List<Character> gender = new ArrayList<Character>();
	       gender.add('M');
	       gender.add('F');
	       gender.add('M');
	       gender.add('F');
	       gender.add('F');
	       gender.add('M');
	       
	       
	       System.out.println("++Using For Each++\n");
	       for (Character deo1 : gender) 
	       {   
	    	   
	    	   System.out.println("Gender is :- "+deo1);
			
		   }  
	       
	       
	       
	       System.out.println("==========++++++++===========");
	       System.out.println("++Using For loop++");
	       for (int i = 0; i < gender.size(); i++) 
	       {
	    	   System.out.println("Gender is :- "+gender.get(i));
			
		   }
	       
	       
	       
	       System.out.println("==========++++++++===========");
	       System.out.println("++Using Pre-Define Object Class Iterator++");
	       Iterator<Character> itr = gender.iterator();
	       while (itr.hasNext()) {
	    	   Character s1 = (Character) itr.next();
			System.out.println("Gender is :- "+s1);
			
		}

	}

}
