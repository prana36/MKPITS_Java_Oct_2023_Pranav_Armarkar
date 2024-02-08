package com.mkpits.genericsandcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest6 {

	public static void main(String[] args) {
		List<Long> mobile = new ArrayList<Long>();
	       mobile.add(7772435667l);
	       mobile.add(7772435690l);
	       mobile.add(7772435678l);
	       mobile.add(7772435698l);
	       mobile.add(7772435665l);
	       mobile.add(7772435645l);
	       
	       
	       System.out.println("++Using For Each++\n");
	       for (Long deo1 : mobile) 
	       {   
	    	   
	    	   System.out.println("Mobile No. is :- "+deo1);
			
		   }  
	       
	       
	       
	       System.out.println("==========++++++++===========");
	       System.out.println("++Using For loop++");
	       for (int i = 0; i < mobile.size(); i++) 
	       {
	    	   System.out.println("Mobile No. is :- "+mobile.get(i));
			
		   }
	       
	       
	       
	       System.out.println("==========++++++++===========");
	       System.out.println("++Using Pre-Define Object Class Iterator++");
	       Iterator<Long> itr = mobile.iterator();
	       while (itr.hasNext()) {
	    	   Long s1 = (Long) itr.next();
			System.out.println("Mobile No. is :- "+s1);
			
		}

	}

}
