package com.mkpits.hashmap;

import java.util.HashMap;
import java.util.Map;

public class EntrySetHashMap {

	public static void main(String[] args) 
	{
/*
	6. map.entrySet()
Parameters: The method does not take any parameter.

Return Value: The method returns a set having same elements as the hash map.
 */
		Map<Integer, String> hMap = new HashMap<>();

		// adding element in HashMap
		hMap.put(234, " Vaibhav");
		hMap.put(54, " Tanmay");
		hMap.put(65, " Nitin");
		hMap.put(635465, "kjadbffs");
		
		System.out.println("Map{} is -->"+hMap);
		System.out.println("Set[] is -->"+hMap.entrySet());
	}

}
