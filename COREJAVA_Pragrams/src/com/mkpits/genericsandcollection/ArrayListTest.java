package com.mkpits.genericsandcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) 
	{
       List<String> surName = new ArrayList<String>();
       surName.add("Armarkar");
       surName.add("Dudhpachare");
       surName.add("Ukadpende");
       surName.add("Shambhare");
       surName.add("Anjankar");
       surName.add("Dahiwale");
       
       System.out.println("++Using For Each++\n");
       for (String str : surName) 
       {   
    	   
    	   System.out.println("SurName :- "+str);
		
	   }  
       
       
       
       System.out.println("==========++++++++===========");
       System.out.println("++Using For loop++");
       for (int i = 0; i < surName.size(); i++) 
       {
    	   System.out.println("SurName :- "+surName.get(i));
		
	   }
       
       
       
       System.out.println("==========++++++++===========");
       System.out.println("++Using Pre-Define Object Class Iterator++");
       Iterator<String> itr = surName.iterator();
       while (itr.hasNext()) {
		String s1 = (String) itr.next();
		System.out.println("SurName :- "+s1);
		
	}
       

	}

}
