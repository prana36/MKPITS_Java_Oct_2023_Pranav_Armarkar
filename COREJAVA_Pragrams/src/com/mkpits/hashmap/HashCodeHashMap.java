package com.mkpits.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashCodeHashMap {

	public static void main(String[] args) 
	{
/*
	9. int hashCode()
Parameters: This method has no argument.

Returns: This method returns the hashCode value for the given map.
 */
		Map<Integer, String> hMap1 = new HashMap<>();

		// adding element in HashMap
		hMap1.put(234, " Vaibhav");
		hMap1.put(54, " Tanmay");
		hMap1.put(65, " Nitin");
		hMap1.put(635465, "kjadbffs");
		
		System.out.println("Map{} is -->"+hMap1);
		
		int hashC = hMap1.hashCode();
		System.out.println("HashCode of hMap1.hashCode() --> "+hashC);
	}

}
