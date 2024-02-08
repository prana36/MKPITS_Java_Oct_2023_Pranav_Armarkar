package com.mkpits.vacations;

import java.util.HashMap;
import java.util.Map;

public class AddingInHashMap {

	public static void main(String[] args) 
	{
//	1. V put(K key, V value)
//		- This method has two arguments, key and value where the key is the left argument
//		  and the value is the corresponding value of the key in the map. 
//		- This method returns the previous value associated with the key if present, 
//		  else returns a null value. 
		// HashMap Initial size is 16
		
		Map<Integer, String> hMap = new HashMap<>();

		// adding element in HashMap
		hMap.put(234, " Vaibhav");
		hMap.put(54, " Tanmay");
		hMap.put(65, " Nitin");
		
		System.out.println(hMap);

		
	}

}
