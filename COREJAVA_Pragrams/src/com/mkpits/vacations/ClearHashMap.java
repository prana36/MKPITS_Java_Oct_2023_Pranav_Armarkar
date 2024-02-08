package com.mkpits.vacations;

import java.util.HashMap;
import java.util.Map;

public class ClearHashMap {

	public static void main(String[] args) 
	{
/*

	3. void clear()
Parameters: The method does not accept any parameters.

Return Value: The method does not return any value.

 */
		Map<Integer, String> hMap = new HashMap<>();

		// adding element in HashMap
		hMap.put(234, " Vaibhav");
		hMap.put(54, " Tanmay");
		hMap.put(65, " Nitin");
		hMap.put(635465, "kjadbffs");
		
		System.out.println(hMap);
		
		hMap.clear();
		System.out.println("After Implimmenting clear() method\n"+hMap);
	}

}
