package com.mkpits.vacations;

import java.util.HashMap;
import java.util.Map;

public class ContainsValueHashMap {

	public static void main(String[] args) 
	{
/*

	5. boolean containsValue(Object Value)
Parameters: The method takes just one parameter Value of Object type and refers to the value
whose mapping is supposed to be checked by any key inside the map.

Return Value: The method returns boolean true if the mapping of the value is detected else false.

 */
		Map<Integer, String> hMap = new HashMap<>();

		// adding element in HashMap
		hMap.put(234, " Vaibhav");
		hMap.put(54, " Tanmay");
		hMap.put(65, " Nitin");
		hMap.put(635465, "kjadbffs");
		
		System.out.println(hMap);
		
		System.out.println("Value ' Vaibhav' is in 'hMap' HashMap or Not? "+hMap.containsValue(" Vaibhav"));
		
		System.out.println("Value ' Nitin' is in 'hMap' HashMap or Not? "+hMap.containsValue(" Nitin"));
	}

}
