package com.mkpits.genericsandcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest1 {
	public static void main(String[] args) 
	{
       List<Integer> rollNo = new ArrayList<Integer>();
       rollNo.add(10);
       rollNo.add(39);
       rollNo.add(90);
       rollNo.add(120);
       rollNo.add(21);
       rollNo.add(69);
       
       
       System.out.println("++Using For Each++\n");
       for (Integer int1 : rollNo) 
       {   
    	   
    	   System.out.println("Roll No. is :- "+int1);
		
	   }  
       
       
       
       System.out.println("==========++++++++===========");
       System.out.println("++Using For loop++");
       for (int i = 0; i < rollNo.size(); i++) 
       {
    	   System.out.println("Roll No. is :- "+rollNo.get(i));
		
	   }
       
       
       
       System.out.println("==========++++++++===========");
       System.out.println("++Using Pre-Define Object Class Iterator++");
       Iterator<Integer> itr = rollNo.iterator();
       while (itr.hasNext()) {
		Integer s1 = (Integer) itr.next();
		System.out.println("Roll No. is :- "+s1);
		
	}
   
       
	}

}
