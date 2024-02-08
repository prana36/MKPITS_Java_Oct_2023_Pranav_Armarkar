package com.mkpits.hashmap;

import java.util.HashMap;
import java.util.Map;

public class PutAllHashMap {

	public static void main(String[] args) 
	{
/*

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
		hMap2.put(235, "kjadbffs");
		hMap2.put(55, " Nitin");
		hMap2.put(66, " Tanmay");
		hMap2.put(635466, " Vaibhav");
		
		System.out.println("Map{} is -->"+hMap1);
		
		hMap1.putAll(hMap2);
		System.out.println("printing hMap1 After applying method putAll() -->\n"+hMap1);
	}

}
