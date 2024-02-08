package com.mkpits.vacations;

import java.util.HashMap;
import java.util.Map;

public class EqualsHashMap {

	public static void main(String[] args) 
	{
/*
	7. boolean equals(object obj)
Parameters: The method accepts one parameter obj of this map type and refers to the map
whose equality is to be checked with this map.

Return Value: The method returns true if the equality holds for both the object map else it returns false.
*/
		Map<Integer, String> hMap1 = new HashMap<>();

		// adding element in HashMap
		hMap1.put(234, " Vaibhav");
		hMap1.put(54, " Tanmay");
		hMap1.put(65, " Nitin");
		hMap1.put(635465, "kjadbffs");
		
		System.out.println("Map{} is -->"+hMap1);
		Map<Integer, String> hMap2 = new HashMap<>();

		// adding element in HashMap
		hMap2.put(234, " Vaibhav");
		hMap2.put(54, " Tanmay");
		hMap2.put(65, " Nitin");
		hMap2.put(635465, "kjadbffs");
		System.out.println("Map{} is -->"+hMap2);
		
		System.out.println("Equality of hMap1 and hMap2 -->"+ hMap1.equals(hMap2));
	}

}
