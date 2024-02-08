package com.mkpits.vacations;

import java.util.HashMap;
import java.util.Map;

public class RemoveFromHashMap {

	public static void main(String[] args)
	{
/*
	2. V remove(Object key)
Parameters: This method has the only argument key, whose mapping is to be removed from the map.
Returns: This method returns the value to which this map previously associated the key,
or null if the map contained no mapping for the key.
 */
		Map<Integer, String> hMap = new HashMap<>();

		// adding element in HashMap
		hMap.put(234, " Vaibhav");
		hMap.put(54, " Tanmay");
		hMap.put(65, " Nitin");
		hMap.put(635465, "kjadbffs");
		
		System.out.println(hMap);
		
		hMap.remove(635465);
		
		System.out.println("After Removing Value using Key \n"+hMap);
	}

}
