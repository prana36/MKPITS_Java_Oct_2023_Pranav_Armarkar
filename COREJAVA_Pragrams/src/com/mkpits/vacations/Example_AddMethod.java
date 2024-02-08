package com.mkpits.vacations;

import java.util.HashSet;
import java.util.Set;

public class Example_AddMethod 
{
	//The add() method of Set in Java is used to add a specific element into a Set collection. 
	//The set add() function adds the element only if the specified element is not already 
	//present in the set else the function returns False if the element is already present in the Set. 

	public static void main(String[] args) 
	{
		Set<String> set = new HashSet<String>();
		set.add("Pranav");
		set.add("Ashik");
		set.add("Kaustubh");
		set.add("Vaibhav");
		set.add("Ashik");
		set.add("vinay");
		set.add("Shrikant");
		
		System.out.println("Set is "+set);
		
	

	}

}
