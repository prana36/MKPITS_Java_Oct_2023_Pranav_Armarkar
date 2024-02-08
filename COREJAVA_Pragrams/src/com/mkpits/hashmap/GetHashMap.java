package com.mkpits.hashmap;

import java.util.HashMap;
import java.util.Map;

public class GetHashMap {

	public static void main(String[] args) 
	{
/*
	8. thisMap.get(Object key_element)
Parameter and Return Value of get() method
Parameter: The method takes one parameter key_element of object type and
refers to the key whose associated value is supposed to be fetched.

Return Value: The method returns the value associated with the key_element in this Map collection.
*/
		
		Map<Integer, String> hMap1 = new HashMap<>();

		// adding element in HashMap
		hMap1.put(234, " Vaibhav");
		hMap1.put(54, " Tanmay");
		hMap1.put(65, " Nitin");
		hMap1.put(635465, "kjadbffs");
		
		System.out.println("Map{} is -->"+hMap1);
		
		System.out.println("value at key = 234 -->"+hMap1.get(234));
	}

}
