package com.mkpits.genericsandcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest4 {

	public static void main(String[] args) {
		 List<Float> rollNo = new ArrayList<Float>();
	       rollNo.add(10.2f);
	       rollNo.add(39.f);
	       rollNo.add(90.3f);
	       rollNo.add(120.34f);
	       rollNo.add(21.34f);
	       rollNo.add(69.69f);
	       
	       
	       System.out.println("++Using For Each++\n");
	       for (Float deo1 : rollNo) 
	       {   
	    	   
	    	   System.out.println("Roll No. is :- "+deo1);
			
		   }  
	       
	       
	       
	       System.out.println("==========++++++++===========");
	       System.out.println("++Using For loop++");
	       for (int i = 0; i < rollNo.size(); i++) 
	       {
	    	   System.out.println("Roll No. is :- "+rollNo.get(i));
			
		   }
	       
	       
	       
	       System.out.println("==========++++++++===========");
	       System.out.println("++Using Pre-Define Object Class Iterator++");
	       Iterator<Float> itr = rollNo.iterator();
	       while (itr.hasNext()) {
	    	  Float s1 = (Float) itr.next();
			System.out.println("Roll No. is :- "+s1);
			
		}

	}

}
