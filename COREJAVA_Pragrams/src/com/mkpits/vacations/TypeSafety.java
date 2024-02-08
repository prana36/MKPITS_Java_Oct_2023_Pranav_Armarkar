package com.mkpits.vacations;

import java.util.ArrayList;

public class TypeSafety {

	public static void main(String[] args) {
		
		Integer [] arr = new Integer[3];
		arr[0]=12;
		arr[1]=13;
	//arr[2]="Pranav";// we cannot add any other type of value if we already declare integer array  
                      // it compile time Error
		
		
		
		       // Non Generic Version 
				ArrayList list = new ArrayList();
				list.add(1);
				list.add(34.78f);
				list.add(true);
				list.add("mkpits");

				for (Object object : list) {
					System.out.println(object);

				}
				
				System.out.println("generic version");
				// Generic Version 
				ArrayList<String> list1 = new ArrayList<String>();
				list1.add("Pranav");
				list1.add("Ashik");
				list1.add("Shri Sir");
				
				for (String str : list1) 
				{
					System.out.println(str);
					
				}
				
				
				
	}

}
