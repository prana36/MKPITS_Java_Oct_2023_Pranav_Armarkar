package com.mkpits.hashmap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Example6_HashMap {

	public static void main(String[] args) 
	{
	 try {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter Range :- ");
         int range = Integer.parseInt(br.readLine());
         Map<Integer, String> map = new HashMap<Integer, String>();
         System.out.println("Enter Elements :- ");
         
         for (int i = 0; i < range ; i++) 
         {
        	 map.put(Integer.parseInt(br.readLine()), br.readLine());
        	 
		}
         System.out.println(map);
         //entrySet() method in Java is used to create a set out of the same 
         //elements contained in the hash map. It basically returns a set view of the hash map
         //or we can create a new set and store the map elements into them.
         System.out.println(map.entrySet());
         
         
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
