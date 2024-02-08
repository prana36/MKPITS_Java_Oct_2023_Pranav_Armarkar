package com.mkpits.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IsEmptyHashMap {

	public static void main(String[] args) 
	{
/*
	10. boolean isEmpty()
Parameters: This method has no argument.

Returns: This method returns True if the map does not contain any key-value mapping.
 */
		Map<Integer, String> hMap1 = new HashMap<>();

		// adding element in HashMap
		hMap1.put(234, " Vaibhav");
		hMap1.put(54, " Tanmay");
		hMap1.put(65, " Nitin");
		hMap1.put(635465, "kjadbffs");
		
		System.out.println("Map{} is -->"+hMap1);
		System.out.println("HashMap: 'hMap1' is Empty or Not? "+hMap1.isEmpty());
		
		Map<Integer, String> hMap2 = new HashMap<>();
		
		System.out.println("Map{} is -->"+hMap2);
		System.out.println("HashMap: 'hMap2' is Empty or Not? "+hMap2.isEmpty());
	}

}
