package com.mkpits.hashmap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Example7_HashMap {

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
	      
	         System.out.println("Enter key");
	         int key1 = Integer.parseInt(br.readLine());
	         System.out.println("Enter value to change");
	         String val = br.readLine();
	         
	       // .compute Method is Use Update value To the Specific Key 
	       //  map.compute(key1, (key,value) -> value+ val );
	         map.compute(key1, (key,value) ->  val );
	         
	         System.out.println(map);
	         
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
