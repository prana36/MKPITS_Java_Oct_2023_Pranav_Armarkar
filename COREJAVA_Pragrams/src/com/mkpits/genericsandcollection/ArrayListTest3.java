package com.mkpits.genericsandcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest3 {

	public static void main(String[] args) {
		  List<Double> rollNo = new ArrayList<Double>();
	       rollNo.add(10.2);
	       rollNo.add(39.);
	       rollNo.add(90.3);
	       rollNo.add(120.34);
	       rollNo.add(21.34);
	       rollNo.add(69.69);
	       
	       
	       System.out.println("++Using For Each++\n");
	       for (Double deo1 : rollNo) 
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
	       Iterator<Double> itr = rollNo.iterator();
	       while (itr.hasNext()) {
			Double s1 = (Double) itr.next();
			System.out.println("Roll No. is :- "+s1);
			
		}
	   
	}

}
