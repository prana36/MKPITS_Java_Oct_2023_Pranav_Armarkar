package com.mkpits.vacations;

import java.util.HashMap;
import java.util.Map;

public class ContainsKeyHashMap {

	public static void main(String[] args) 
	{
/*

	4. boolean containsKey(key_element)
Parameters: The method takes just one parameter key_element that refers to the key whose
mapping is supposed to be checked inside a map.

Return Value: The method returns boolean true if the presence of the key is detected else false .

 */
		Map<Integer, String> hMap = new HashMap<>();

		// adding element in HashMap
		hMap.put(234, " Vaibhav");
		hMap.put(54, " Tanmay");
		hMap.put(65, " Nitin");
		hMap.put(635465, "kjadbffs");
		
		System.out.println(hMap);
		
		System.out.println("Key '54' is in 'hMap' HashMap or Not: "+hMap.containsKey(54));
		
		System.out.println("Key '55' is in 'hMap' HashMap or Not: "+hMap.containsKey(55));
	}

}
